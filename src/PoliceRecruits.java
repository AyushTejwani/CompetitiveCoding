import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class PoliceRecruits {
    public static void compression(String uncompressed)
    {
        Date date=new Date(uncompressed);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String format = formatter.format(date);
        System.out.println(format);

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String first= scanner.nextLine();
        compression(first);
    }
}
