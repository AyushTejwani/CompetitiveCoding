import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row=0;
        int column=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
              int temp=scanner.nextInt();
              if(temp==1)
              {
                  row=i;
                  column=j;
                  break;
              }
            }
        }
        int output=Math.abs(row-2)+Math.abs(column-2);
        System.out.println(output);
    }
}
