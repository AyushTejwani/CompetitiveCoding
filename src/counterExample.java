import java.util.Scanner;

public class counterExample {

    public static boolean coprine(int a, int b){
        if(a==0 || b==0)
            return false;
        if(a==b)
            return true;
        if(a>b)
            coprine(a-b,b);
        coprine(a,b-a);
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();

        if((b-a)<2)
        {
            System.out.println(-1);
            return;
        }

        int p1= a;
        int p2= a+1;
        int p3=a+2;

        while(!coprine(p1,p3)){
            if(p3>b){
                System.out.println(-1);
                break;
            }
            p3=p3+p2;
        }


    }
}
