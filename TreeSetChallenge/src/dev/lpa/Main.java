package dev.lpa;

public class Main {
    public static void main(String[] args) {

        Theatre theatre = new Theatre("The Globe");
//        theatre.printSeatMap();
        theatre.manageSeat(Theatre.SeatAction.RESERVE, "A000");
        theatre.manageSeat(Theatre.SeatAction.RESERVE, "A000");
        theatre.manageSeat(Theatre.SeatAction.RESERVE, "A001");
        theatre.manageSeat(Theatre.SeatAction.RESERVE, "B026");
        theatre.manageSeat(Theatre.SeatAction.RESERVE, "C011");
        theatre.manageSeat(Theatre.SeatAction.VACATE, "A000");
        theatre.manageSeat(Theatre.SeatAction.VACATE, "A000");
        theatre.printSeatMap(true);
        theatre.printSeatMap(false);
    }
}