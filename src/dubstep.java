import java.util.Scanner;

public class dubstep {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String masterString= scanner.next();
        String[] substrings= masterString.split("WUB");
        String answer="";
        for(String sub: substrings){
            sub=sub.trim();
            if(!sub.isEmpty())
            answer+=sub+" ";
        }
        System.out.println(answer.substring(0,answer.length()-1));
    }
}
