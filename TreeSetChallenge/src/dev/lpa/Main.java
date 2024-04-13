package dev.lpa;

public class Main {
    public static void main(String[] args) {

        Theatre theatre = new Theatre("The Globe");

        theatre.handleSeatBooking(Theatre.SeatAction.RESERVE, "A001");
        theatre.handleSeatBooking(Theatre.SeatAction.RESERVE, "A001");
        theatre.handleSeatBooking(Theatre.SeatAction.RESERVE, "A001");
        theatre.handleSeatBooking(Theatre.SeatAction.RESERVE, "B026");
        theatre.handleSeatBooking(Theatre.SeatAction.RESERVE, "C011");
        theatre.handleSeatBooking(Theatre.SeatAction.VACATE, "A001");
        theatre.handleSeatBooking(Theatre.SeatAction.VACATE, "A001");
        theatre.printSeatMap(true);

        theatre.handleMultipleSeatBooking(Theatre.SeatAction.RESERVE, "B023", "K011");

        theatre.printSeatMap(false);
    }
}