package ex_9_9;

public class Test {
    public static void main(String[] args) {
        RegularPolygon rp1 = new RegularPolygon();  
        RegularPolygon rp2 = new RegularPolygon(6, 4);  
        RegularPolygon rp3 = new RegularPolygon(10, 4, 5.6, 7.8); 
       
        System.out.println("Polygon 1 - " +"The Perimter is:"+ rp1.getPerimeter() + "  The Area is " + rp1.getArea()+"\n");
        System.out.println("Polygon 2 - " +"The Perimter is:"+ rp2.getPerimeter() + "  The Area is " + rp2.getArea()+"\n");
        System.out.println("Polygon 3 - " +"The Perimter is:"+ rp3.getPerimeter() + "  The Area is " + rp3.getArea()+"\n");
    }
}
