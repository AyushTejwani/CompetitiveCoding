import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class panoramixPrediction {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int asd= scanner.nextInt();
        String dsa= scanner.next();
        if(dsa.isEmpty()){
            System.out.println(dsa);
       }


        HashMap<String,String> hs = new HashMap<>();
        hs.put("asd","asd");

        for(Map.Entry<String,String> set : hs.entrySet()){
            System.out.println(set.getKey()+ ":" + set.getValue());
        }
        
    }
}
