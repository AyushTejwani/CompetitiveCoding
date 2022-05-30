import java.util.HashSet;
import java.util.Scanner;

public class antonAndLetters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input= scanner.nextLine();
        input=input.replace("{","");
        input=input.replace("}","");
        input=input.replace(" ", "");
        if(input.equals(""))
        {
            System.out.println("0");
            return;
        }
        String[] alphas= input.split(",");
        HashSet<String> unique= new HashSet<>();
        System.out.println(unique.size());
    }
}
