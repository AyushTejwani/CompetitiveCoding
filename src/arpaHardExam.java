import java.util.Scanner;

public class arpaHardExam {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        if(n==0){
            System.out.println("1");return;
        }
        n=n%4;
        if(n==1){
            System.out.println("8");return;
        }
        else if(n==2){
            System.out.println("4");return;
        }
        else if(n==3){
            System.out.println("2");return;
        }
        else{
            System.out.println("6");
        }
    }
}
