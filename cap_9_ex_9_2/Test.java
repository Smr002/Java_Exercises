package cap_9_ex_9_2;

public class Test {
    public static void main(String[]args){
         Stock stock = new Stock();

         stock.setName("ORCL");
         stock.setSymbole("Oracle");
         stock.setPreviousClosingPrice(34.5);
         stock.setCurrentPrice(34.35);


         System.out.println("Name:" + stock.getName()+"\n"
                            +"Symbole:"+ stock.getSymbole()+"\n"
                            +"% is :"+ stock.getChangePercent(stock.getPreviousClosingPrice(), stock.getCurrentPrice()));





    }
}
