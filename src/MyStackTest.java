public class MyStackTest {
    public static void main(String[] args) {
    MyStack<String> stack = new MyStack<>();
       System.out.println(stack.size());
       stack.push("Alfa");
       stack.push("Beta");
       stack.push("Gama");
       stack.push("Omega");
       System.out.println(stack.size());
       System.out.println(stack.pop());
       System.out.println(stack.size());
       System.out.println(stack.peek());
    }
}
