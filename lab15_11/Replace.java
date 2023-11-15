package lab15_11;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Replace {
   public static void main(String[]args){
   
    String oldString;
    String newString;


    File file = new File("sourceFile.txt");
    if(file.exists()){
        System.out.println("The file already exist");
    }else{
        System.out.println("it is created now");
    }

    


}
}
