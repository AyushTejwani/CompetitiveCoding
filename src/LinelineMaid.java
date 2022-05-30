import java.util.Scanner;

public class LinelineMaid {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int[] array= new int[n];
        for(int i=0;i<array.length;i++)
        {
            array[i]= scanner.nextInt();
        }
        int[][] res= new int[n][2];
        for(int i=0;i<res.length;i++)
        {
            if(i==0)
            {
                res[i][0]=Math.abs(array[i]-array[i+1]);
                res[i][1]=Math.max((Math.abs(array[0]-array[i])),(Math.abs(array[i]-array[res.length-1])));
                continue;
            }
            else if(i==n-1)
            {
                res[i][0]=Math.abs(array[i]-array[i-1]);
                res[i][1]=Math.max((Math.abs(array[0]-array[i])),(Math.abs(array[i]-array[res.length-1])));
                continue;
            }
            res[i][0]=Math.min((Math.abs(array[i-1]-array[i])),(Math.abs(array[i]-array[i+1])));
            res[i][1]=Math.max((Math.abs(array[0]-array[i])),(Math.abs(array[i]-array[res.length-1])));
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i][0]);
            System.out.print(" ");
            System.out.println(res[i][1]);
        }
    }
}
