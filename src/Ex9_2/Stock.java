public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String symbol, String name){
        this.symbol=symbol;
        this.name=name;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getChangePercent(){
        return 100-(currentPrice/previousClosingPrice)*100;
    }
}
