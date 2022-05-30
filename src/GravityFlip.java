import java.util.Scanner;

public class GravityFlip {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int col=scanner.nextInt();
        int[] val=new int[col];
        for(int i=0;i<col;i++)
        {
            val[i]=scanner.nextInt();
        }

        for(int mover=val.length-1;mover>0;mover--)
        {
            if(val[mover-1]<=val[mover])
                continue;
            int temp=val[mover-1]-val[mover];
            val[mover]=val[mover]+temp;
            val[mover-1]=val[mover-1]-temp;mover=mover+2;
            if(mover==val.length+1)
                mover--;
        }
        for(int j=0;j<val.length;j++)
        {
            System.out.print(val[j]);
            if(j!=val.length-1)
            System.out.print(" ");
        }


    }
}
