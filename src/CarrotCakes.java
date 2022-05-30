import java.util.Scanner;

public class CarrotCakes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int minNoOfCakes= scanner.nextInt();
        int timeToBakeACake= scanner.nextInt();
        int oneTimeBakeCarrots=scanner.nextInt();
        int timeToMakeOver=scanner.nextInt();

        int noOfTimesBaking= minNoOfCakes/oneTimeBakeCarrots;
        if(minNoOfCakes%oneTimeBakeCarrots!=0)
            noOfTimesBaking=noOfTimesBaking+1;
        if(noOfTimesBaking*timeToBakeACake>timeToMakeOver+timeToBakeACake){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");

    }
}
