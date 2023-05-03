import java.util.Stack;
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        String input = "((()))[][]";
        Stack<Character> st = new Stack<>();
        int flag = 0;
        for(char c:input.toCharArray()){
            if(c=='(' || c=='[' || c=='{'){
                st.push(c);
            }
            else if(st.size()==0) {
                flag = 1;
                break;
            }
            else{
                if(st.peek()=='(' && c==')') st.pop();
                else if(st.peek()=='{' && c=='}') st.pop();
                else if(st.peek()=='[' && c==']') st.pop();
                else {
                    flag = 1;
                    break;
                }

            }
        }
        if(flag==0 && st.isEmpty()) System.out.println("Valid");
        else System.out.println("Not valid");

    }
}