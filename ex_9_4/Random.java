package ex_9_4;

public class Random {
    
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    Random(){}


    Random(int number){
        this.number = number;
    }




    public void nextInt(int number){
        
          for(int i = 0 ; i < 50 ; i++){


            double nmr = Math.random();

            double finalnumnr = (int)(nmr * number) + 1;

            System.out.println(finalnumnr);

            
          }


    }


    


}
