package BabyName;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class BabyName2010 {

    public static void main(String[] args) {
        for (int year = 2001; year <= 2010; year++) {
            String fileName = "babynameranking" + year + ".txt";
            String fileURL = "http://liveexample.pearsoncmg.com/data/" + fileName;

            System.out.println("Processing data for year " + year + " from " + fileURL);
            processFile(fileURL);
            System.out.println("\n");
        }
    }

    private static void processFile(String fileURL) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(fileURL).openStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
         
                String[] data = line.split(",");

               
                System.out.println("Ranking: " + data[0].trim());
                System.out.println("Boy's Name: " + data[1].trim());
                System.out.println("Number for Boy's Name: " + data[2].trim());
                System.out.println("Girl's Name: " + data[3].trim());
                System.out.println("Number for Girl's Name: " + data[4].trim());
                System.out.println("--------------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
