import java.util.ArrayList;
import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int len= scanner.nextInt();
        String[] inputs= new String[len];
        for(int i=0;i<len;i++){
            inputs[i]=scanner.next();
        }
        for(int i=0;i<inputs.length;i++){
            String input=inputs[i];
            if(input.length()<=10)
            {
                System.out.println(input);
                continue;
            }
            System.out.println(input.charAt(0)+String.valueOf(input.length()-2)+input.charAt(input.length()-1));
        }
    }
}
