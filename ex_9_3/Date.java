package ex_9_3;
import java.text.SimpleDateFormat;
//import java.util.Date;

public class Date {
    private long sec;

    

    public long getSec() {
        return sec;
    }

    public void setSec(long sec) {
        this.sec = sec;
    }

    Date(){}

    Date(long sec) {
        this.sec = sec;
    }

    public String toString() {

        final Date date = new Date((long) sec * 1000); 
        
       
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = sdf.format(date);

        return formattedDate;
    }
}







    

