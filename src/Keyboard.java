import java.util.Scanner;

public class Keyboard {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String ch= scanner.next();
        String str= scanner.next();
        String masterString= "qwertyuiopasdfghjkl;zxcvbnm,./";
        int add=0;
        if(ch.equals("R")){
            add=-1;
        }
        else{
            add=1;
        }
        String answer="";
        for(int i=0;i<str.length();i++){
            for(int j=0;j<masterString.length();j++){
                if(str.charAt(i)==masterString.charAt(j)){
                    answer=answer+masterString.charAt(j+add);
                }
            }
        }
        System.out.println(answer);
    }
}
