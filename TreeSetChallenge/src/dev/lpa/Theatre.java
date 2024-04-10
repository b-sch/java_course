package dev.lpa;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Theatre {

    private String name;
    private final int rowSeatCapacity = 26;
    private final Set<Seat> seats = new TreeSet<>(Comparator.comparing(Seat::getSeatID));

    public Theatre(String name) {
        this.name = name;
        for (int row = 'A'; row <= 'Z'; row++) {
            for (int seat = 0; seat <= rowSeatCapacity; seat++) {
                seats.add(new Seat((char) row, seat));
            }
        }
    }

    public void printSeatMap(boolean onlyReserved) {
        System.out.println("""
                \n
                =========================================
                Map of seats %s
                =========================================""".formatted(onlyReserved ? "(only reserved seats)" : "(all seats in the theatre)"));
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
        return "Theater name: %s%n Number of seats in a row: %s".formatted(this.name, rowSeatCapacity);
    }

    public void manageSeat(SeatAction action, String seatID) {
        System.out.printf("Managing seat: %s%n", seatID);
        Seat searchedSeat = new Seat(seatID);

        if (!seats.contains(searchedSeat))
            throw new IllegalArgumentException("Seat %s was not found.".formatted(seatID));
        if (action == null) {
            throw new IllegalArgumentException("Seat action must be specified");
        }

        seats.forEach(seat -> {
            if (seat.getSeatID().equals(searchedSeat.getSeatID())) {
                switch (action) {
                    case RESERVE -> seat.setReserved(true);
                    case VACATE -> seat.setReserved(false);
                }
            }
        });
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
            if ((int) row < 65 || (int) row > 95)
                throw new IllegalArgumentException("Seat row %s is out of range: %s-%s".formatted(row, (char) 65, (char) 95));

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
                System.out.printf("Seat %s is already reserved. %n", this.seatID);
            } else if (!isReserved && !reserved) {
                System.out.printf("Seat %s is already vacated. %n", this.seatID);
            } else {
                isReserved = reserved;
                if (isReserved) {
                    System.out.printf("Reserved seat %s%n", this.seatID);
                } else {
                    System.out.printf("Vacated seat %s%n", this.seatID);
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
