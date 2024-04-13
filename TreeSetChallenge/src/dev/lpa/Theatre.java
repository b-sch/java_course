package dev.lpa;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Theatre {

    // ==================
    // logging definition
    private static Logger LOG = null;

    static {
        System.setProperty(
                "java.util.logging.SimpleFormatter.format",
                "[%1$tF %1$tT] [%4$-7s] %3$s | %5$s %n");
        // Logger to get logs
        LOG = Logger.getLogger(Theatre.class.getName());
        LOG.setLevel(Level.ALL);
    }

    // ==================

    private final String name;
    private final int rowSeatCapacity = 26;
    private final int startingSeatNumber = 1;
    private final int firstRow = 'A';
    private final int lastRow = 'Z';
    private final TreeSet<Seat> seats = new TreeSet<>(Comparator.comparing(Seat::getSeatID));

    public Theatre(String name) {
        this.name = name;
        for (int row = 'A'; row <= 'Z'; row++) {
            for (int seat = startingSeatNumber; seat <= rowSeatCapacity; seat++) {
                seats.add(new Seat((char) row, seat));
            }
        }

        LOG.info("%s".formatted(this));
    }

    public void handleSeatBooking(SeatAction action, String seatID) {
        Seat handledSeat = searchSeat(seatID);

        LOG.info("Handling seat booking for: %s".formatted(handledSeat));

        if (action == null) {
            throw new IllegalArgumentException("Seat action must be specified");
        }

        // TODO: extract searching function
        // TODO: use it to manage seat and batch manage seat (it will make things easier, because now You're doing same thing but in different ways - see searching / update stuff in seats)

        switch (action) {
            case RESERVE -> {
                LOG.info("Performing booking action: %s".formatted(SeatAction.RESERVE));
                handledSeat.setReserved(true);
            }
            case VACATE -> {
                LOG.info("Performing booking action: %s".formatted(SeatAction.VACATE));
                handledSeat.setReserved(false);
            }
        }
    }

    public void handleMultipleSeatBooking(SeatAction action, String startSeatID, String endSeatID) {
        LOG.info("Handling multiple seat booking for seats from: %s to %s".formatted(startSeatID, endSeatID));

        if (action == null) {
            throw new IllegalArgumentException("Seat action must be specified");
        }

        Seat startSeat = searchSeat(startSeatID);
        Seat endSeat = searchSeat(endSeatID);

        SortedSet<Seat> bookingRange = seats.subSet(startSeat, true, endSeat, true);

        switch (action) {
            case RESERVE -> {
                LOG.info("Action: %s".formatted(SeatAction.RESERVE));
                bookingRange.forEach(seat -> seat.setReserved(true));
            }
            case VACATE -> {
                LOG.info("Action: %s".formatted(SeatAction.VACATE));
                bookingRange.forEach(seat -> seat.setReserved(false));
            }
        }

    }

    private Seat searchSeat(String seatID) {
        LOG.info("Searching for seat: %s".formatted(seatID));
        Seat searchedSeat = new Seat(seatID);

        if (!seats.contains(searchedSeat))
            throw new IllegalArgumentException("Seat %s was not found.".formatted(seatID));

        List<Seat> convertedSet = new ArrayList<>(seats);
        int index = Collections.binarySearch(convertedSet, searchedSeat, Comparator.comparing(Seat::getSeatID));

        return convertedSet.get(index);
    }

    public void printSeatMap(boolean onlyReserved) {
        System.out.println("""
                                
                =========================================
                Map of seats %s
                =========================================             
                """.formatted(onlyReserved ? "(only reserved seats)" : "(all seats in the theatre)"));

        seats.forEach(seat -> {
            if (onlyReserved) {
                if (seat.isReserved) System.out.print(seat + " ");
            } else {
                if (seat.getSeat() == rowSeatCapacity) {
                    System.out.print(seat + "\n");
                } else {
                    System.out.print(seat + " ");
                }
            }
        });
    }

    @Override
    public String toString() {
        return "Theater name: %s | Number of seats in a row: %s".formatted(this.name, rowSeatCapacity);
    }

    public enum SeatAction {
        RESERVE,
        VACATE
    }

    private class Seat {
        private final char row;
        private final int seat;
        private final String seatID;
        private boolean isReserved;


        public Seat(char row, int seat) {
            if (seat > rowSeatCapacity || seat < 0)
                throw new IllegalArgumentException("Seat number %d is out of range: %d-%d".formatted(seat, 0, rowSeatCapacity));
            if ((int) row < firstRow || (int) row > lastRow)
                throw new IllegalArgumentException("Seat row %s is out of range: %s-%s".formatted(row, (char) firstRow, (char) lastRow));

            this.row = row;
            this.seat = seat;
            this.seatID = "%s%03d".formatted(row, seat);
        }

        public Seat(String seatID) {
            this(seatID.charAt(0), Integer.parseInt(seatID.substring(1, 4)));
        }

        public char getRow() {
            return row;
        }

        public int getSeat() {
            return seat;
        }

        public boolean isReserved() {
            return isReserved;
        }

        public void setReserved(boolean reserved) {
            if (isReserved && reserved) {
                LOG.warning("Seat %s is already reserved. Canceling reserve...".formatted(this.seatID));
            } else if (!isReserved && !reserved) {
                LOG.warning("Seat %s is already vacated. Canceling vacate...".formatted(this.seatID));
            } else {
                isReserved = reserved;
                if (isReserved) {
                    LOG.info("Reserved seat: %-10s".formatted(seatID));
                } else {
                    LOG.info("Vacated seat: %-10s".formatted(seatID));
                }
            }
        }

        public String getSeatID() {
            return seatID;
        }

        @Override
        public String toString() {
            return this.getSeatID() + " [%s]".formatted(isReserved ? "X" : " ") + ";";
        }
    }
}
