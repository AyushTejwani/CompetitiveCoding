import java.util.Scanner;

public class Lightmorelight {
    public static boolean checkifperfectsq(int number)
    {
        int i=1;
        while (i*i <= number)
        {
            if(i*i==number)
                return true;
            i++;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        while(true)
        {
            int total= scanner.nextInt();
            if(total==0)
                return;
            //int total= scanner.nextInt();
            boolean check= checkifperfectsq(total);
            if(check==true)
                System.out.println("yes");
            else
                System.out.println("no");
            //a--;

        }
    }
}
