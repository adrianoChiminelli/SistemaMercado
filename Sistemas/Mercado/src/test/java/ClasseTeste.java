
import java.sql.Timestamp;
import java.util.Date;



public class ClasseTeste {

    public static void main(String[] args) {

        Date date = new Date();
        
        System.out.println(new Timestamp(date.getTime()));

    }

}
