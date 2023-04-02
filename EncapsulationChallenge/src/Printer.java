public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void setPagesPrinted(int pagesPrinted) {
        this.pagesPrinted = pagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        tonerLevel += tonerAmount;
        if (tonerLevel > 100 || tonerLevel < 0){
            return -1;
        }

        return tonerLevel;
    }

    public int printPages(int pages){
        if (duplex){
            pagesPrinted += ((pages / 2) + (pages % 2));
            return ((pages / 2) + (pages % 2));
        }

        pagesPrinted += pages;
        return pages;
    }
}
