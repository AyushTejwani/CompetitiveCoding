import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class snackTower {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int total= scanner.nextInt();
        int[] cookies= new int[total];
        for(int i=0;i<cookies.length;i++) {
            cookies[i] = scanner.nextInt();
        }
        int max=total;
        Stack<Integer> stack= new Stack<>();
       int index=0;
       while(index<total){
          stack.push(cookies[index]);
          boolean ch=false;
           while(!stack.empty() && stack.peek().equals(max)){
               System.out.print(stack.pop()); System.out.print(" ");
               max--;
               ch=true;
           }
           if(!ch){
               System.out.println();System.out.println();
           }
            index++;
       }
    }
}
