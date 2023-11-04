package ex_9_10;

public class QuadraticEquation {


    private int a;

	public int getA() {
		return a;
	}
    private int b;

	public int getB() {
		return b;
	}
    private int c;

    public int getC() {
        return c;
    }
    public QuadraticEquation(int a,int b,int c){

        this.a= a;
        this.b = b;
        this.c = c;

    }
    
    
    public String getDiscriminat(){
            int D = (b*b) - 4*c*a;

            if(D>0){
                return "The equation have 2 roots:" + getRoot1() + " " + getRoot2();
            }
            else if(D==0){
                return "The equation has 1 root:" + getRoot1();
                        }
            else {

                return "The equation has no roots." ;

            }




            
    }


    public double getRoot1() {
        return (-b + Math.sqrt(b * b - 4 * c * a)) / (2.0 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(b * b - 4 * c * a)) / (2.0 * a);
    }
    
}
