import java.util.Scanner;

public class ColourfulShoes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String first= scanner.nextLine();
        String second= scanner.nextLine();
        int finalPosition=0;
        for(int i=0;i<second.length();i++)
        {
            if(second.charAt(i)==first.charAt(finalPosition))
            {
                finalPosition++;
            }
        }
        System.out.println(finalPosition+1);
    }
}
