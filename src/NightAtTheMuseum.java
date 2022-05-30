import java.util.Scanner;

public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str= scanner.nextLine();
        char record='a';
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            int difference= (int)str.charAt(i)-(int)record;
            if(Math.abs(difference)>13)
            {
                difference=26-Math.abs(difference);
            }
            record=str.charAt(i);
            count=count+Math.abs(difference);
        }
        System.out.println(count);
    }
}
