import java.util.Scanner;

public class PetyAndCountryside {

    public static int left(int index, int[] arr){
        if(index==0)
            return 1;
        else if (arr[index]<arr[index-1])
            return 1;
        return 1+left(index-1,arr);
    }

    public static int right(int index, int[] arr){
        if(index==arr.length-1)
            return 1;
        else if (arr[index]<arr[index+1])
            return 1;
        return 1+right(index+1,arr);
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();

        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        int c= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int ret=left(i,arr) + right(i,arr);
            if(c<ret){
                c=ret;
            }
        }
        System.out.println(c-1);
    }
}
