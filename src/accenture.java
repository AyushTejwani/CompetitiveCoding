import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class accenture{
    public static int[] SortStudentMarks(int input1, int input2, int[][] input3)
    {
        int[] result=new int[input1];
        int[] result1=new int[input1];
        int[] temp=new int[input2];
        for(int i=0;i<input1;i++)
        {
            int sum=0;
            for(int j=0;j<input2;j++)
            {

                sum=sum+input3[j][i];
            }
            result[i]=sum;
        }
        int temp1=result[0];
        int min=0;
        for(int i=0;i<input1;i++)
        {
            if(result[i]<temp1)
            {
                temp1=result1[i];
                min=i;
            }
        }
        for(int i=0;i<input1;i++)
        {

            result1[i]=result[i]-input3[i][min];
        }
        return result1;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int[][] arr=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                arr[i][j]=scanner.nextInt();
            }
        }
        int[] result=new int[a];
        result=SortStudentMarks(a,b,arr);

        for(int j=0;j<a;j++)
        {
           System.out.println(result[j]);
        }
    }
}
