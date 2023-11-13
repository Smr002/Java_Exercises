package ex12_5;

public class Triangle {
    private double side1;
    private double side2;
    private double side3;

   
    public Triangle(double side1, double side2, double side3) throws IllegalArgumentException  {
        if (!isValidTriangle(side1, side2, side3)) {
            throw new IllegalArgumentException  ("Invalid triangle sides: the sum of any two sides must be greater than the third side");
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }
    
}
