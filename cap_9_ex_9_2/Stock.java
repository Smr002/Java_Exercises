package cap_9_ex_9_2;



public class Stock{

    private String symbole;

    public String getSymbole() {
        return symbole;
    }

    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double PreviousClosingPrice;

    public double getPreviousClosingPrice() {
        return PreviousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        PreviousClosingPrice = previousClosingPrice;
    }

    private double currentPrice;

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Stock(){

    }
    public Stock(String symbole, String name, double PreviousClosingPrice,double currentPrice){

        this.symbole = symbole;
        this.name = name;
        this.PreviousClosingPrice = PreviousClosingPrice;
        this.currentPrice = currentPrice;

    }


    public double getChangePercent(double previousClosingPrice, double currentPrice) {
        double change = previousClosingPrice - currentPrice ;
        double percentageChange = (change / previousClosingPrice) * 100;
        return percentageChange;
    }
    



}