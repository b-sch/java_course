public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;

        if (tonerLevel > 100) {
            this.tonerLevel = 100;
        } else if (tonerLevel < 0) {
            this.tonerLevel = 0;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount < 0) {
            return -1;
        } else if ((tonerLevel += tonerAmount) > 100) {
            return -1;
        } else {
            return tonerLevel += tonerAmount;
        }
    }

    public int printPages(int pages) {
        if (pages <= 0) {
            return -1;
        }

        if (duplex) {
            System.out.println("It is a duplex printer.");
            return this.pagesPrinted += pages * 2;
        } else {
            return this.pagesPrinted += pages;
        }
    }
}
