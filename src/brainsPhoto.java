import java.util.Scanner;

public class brainsPhoto {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int t=a*b;
        boolean colored=false;
        while(t>0){
            String i=scanner.next();
            if(!i.equals("W") && !i.equals("B")  && !i.equals("G"))
            {
                colored=true; break;
            }t--;
        }
        if(colored)
        {
            System.out.println("#Color");
        }
        else{
            System.out.println("#Black&White");
        }
    }
}
