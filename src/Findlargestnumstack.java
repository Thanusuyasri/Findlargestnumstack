import java.util.Scanner;
import java.util.Stack;

public class Findlargestnumstack {
    public static void largeNum(String str,int k)
    {
        //System.out.println("Hello");
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            //stack.push(ch);

            while(!stack.empty() && (k > 0) && (stack.peek() < ch) )
            {
                    stack.pop();
                    k-=1;
            }
            if(!stack.empty() || ch!='0')
            {
                stack.push(ch);
            }
        }
        if (k<0)
        {
            for(int i=0;i<str.length()-k;i++)
            {
                char ch = str.charAt(i);
                stack.push(ch);
            }
        }
        for (Character character : stack) {
            System.out.println(character);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int k = scanner.nextInt();
        largeNum(str,k);
    }
}
