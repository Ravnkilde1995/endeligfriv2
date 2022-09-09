public class Main {

    public static void main(String[] args) {
	// write your code here

        Stack stack = new Stack();

        stack.push("virker");
        stack.push("det");
        stack.push("her");
        stack.push("mon");

        stack.showStack();
        stack.pop();
        stack.showStack();
        stack.pop();
        stack.showStack();

    }
}
