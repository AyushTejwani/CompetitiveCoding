import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] strips=new int[4];
        for(int i=0;i<4;i++)
        {
            strips[i]=scanner.nextInt();
        }
        String str=scanner.next();
        int score=0;
        for(int i=0;i<str.length();i++)
        {
           String substring= str.substring(i,i+1);

            score= score+ strips[(int)Integer.parseInt(substring)-1];
        }
        System.out.println(score);
    }
}
