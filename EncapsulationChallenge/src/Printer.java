public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel < 0 || tonerLevel > 100) ? this.tonerLevel = -1 : tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if ((this.tonerLevel + tonerAmount) > 100) {
                return -1;
            } else {
                return this.tonerLevel += tonerAmount;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;

        if (duplex) {
            pagesToPrint = Math.round((float) pagesToPrint / 2);
//            System.out.println("Printing in duplex mode");
            this.pagesPrinted += pagesToPrint;
            return pagesToPrint;
        } else {
            return pagesToPrint;
        }
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }
}
