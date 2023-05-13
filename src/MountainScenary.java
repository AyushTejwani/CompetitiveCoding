import java.util.Scanner;

public class MountainScenary {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr= new int[2*n+1];
        for(int i=0;i < (2*n+1);i++){
            arr[i]= scanner.nextInt();
        }
        int[] diff= new int[2*n];
        for(int i=0;i < diff.length;i++){
         diff[i]= arr[i+1]-arr[i];
        }
        for(int i=0;i < diff.length;i++){
            
        }

    }
}
