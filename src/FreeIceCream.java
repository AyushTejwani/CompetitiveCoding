import java.util.Scanner;

public class FreeIceCream {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int numberOfKids= scanner.nextInt();
        int sum=scanner.nextInt();
        int distress=0;
        for(int i=0;i<numberOfKids;i++)
        {
            String sign= scanner.next();
            int val= scanner.nextInt();
            if(sign.equals("+")){
                sum=sum+val;
            }
            else if(sign.equals("-") && sum>=val){
                sum=sum-val;
            }
            else {
                distress++;
            }
        }
        System.out.println(sum+" "+distress);
    }
}
