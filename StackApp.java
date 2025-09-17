import java.io.*;

// import StackApp.MyStack.BracketChecker;

public class StackApp {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String enterString = br.readLine();
        BracketChecker bc = new BracketChecker(enterString);
        bc.check();


       
        
    }  
    // STACK = LIFO => LAST IN FIRST OUT
    public static class MyStack{
        private int maxSize;
        private char[] stackArray;
        private int top;

        public MyStack(int maxSize){
            this.maxSize = maxSize;
            this.top = -1;
            stackArray = new char[maxSize];
        }

        public void push(char ch){
            stackArray[++top] = ch;
        }

        public char pop(){
            return stackArray[top--];
        }

        public char peek(){
            return stackArray[top];
        }

        public boolean isEmpty(){
            return (top == -1);
        }

    

    }
    public static class BracketChecker{
            private String input;
            public BracketChecker(String input){
                this.input = input;
            }

            public void check(){
                int stackSize = input.length();
                MyStack myStack = new MyStack(stackSize);

                for(int j = 0; j < input.length(); j++){
                    char ch = input.charAt(j);
                    switch(ch){
                        case '{':
                        case '[':
                        case '(':
                            myStack.push(ch);
                            break;
                        case '}':
                        case ']':
                        case ')':
                            if(!myStack.isEmpty()){
                                char chx = myStack.pop();
                                if (( ch == '}' && chx != '{') ||
                                (ch == ']' && chx != '[') ||
                                (ch == ')' && chx != '(')){
                                    System.out.println("Error: " +ch+ " at "+j);
                                }
                            }
                            break;
                        default:
                            break;
                        
                    }
                }
            }
        }
}
