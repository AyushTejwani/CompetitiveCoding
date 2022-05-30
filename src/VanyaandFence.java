import java.util.Scanner;

public class VanyaandFence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int students= scanner.nextInt();
        int heightFence= scanner.nextInt();
        //int[] heights= new int[students];
        int count=0;
        for(int i=0;i<students;i++)
        {
           // heights[i]=scanner.nextInt();
            int temp=scanner.nextInt();
            if(temp%heightFence==0)
            {
                count+= temp/heightFence;
            }
            else
            {
                count+=temp/heightFence+1;
            }
        }
        System.out.println(count);

    }
}
