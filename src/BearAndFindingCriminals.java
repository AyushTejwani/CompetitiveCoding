import java.util.Scanner;

public class BearAndFindingCriminals {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int a= scanner.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }

        int count=0,mover=1;
        if(arr[a-1]==1)
            count++;
        while(a-1+mover<arr.length && a-1-mover>=0){
            if(arr[a-1+mover]!=0 && arr[a-1-mover]!=0)
                count=count+2;
            mover++;
        }
        while(a-1+mover<arr.length){
            if(arr[a-1+mover]!=0)
            count++;
            mover++;
        }
        while(a-1-mover>=0){
            if(arr[a-1-mover]!=0)
            count++;
            mover++;
        }
        System.out.println(count);
    }
}
