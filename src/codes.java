import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

//---- My code ----
import java.time.format.*;
class Result {

    /*
     * Complete the 'reformatDate' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY dates as parameter.
     */

    public static List<String> reformatDate(List<String> dates) {
        // Write your code here
        List<String> outputDate = new ArrayList<>();

        try {
            for (int i=0;i<dates.size();i++) {
                String tempStr="";
                System.out.println(dates.get(i));
                tempStr = dates.get(i).replace("st", "").replace("nd", "").replace("rd", "").replace("th", "");
                System.out.println(tempStr);
                Date asd= new Date(String.format(tempStr, "dd MM yyyy"));
                System.out.println(asd);
                Date tempDate = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH).parse(tempStr);
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                outputDate.add(df.format(tempDate));
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        };
        return outputDate;
    }


    public static void main(String[] args) throws IOException {
        Scanner scanner= new Scanner(System.in);



        List<String> dates = new ArrayList<>();
        dates.add("1st Mar 1984");
        dates.add("2nd Feb 2013");
        dates.add("4th Apr 1900");

        List<String> result = reformatDate(dates);


    }
}