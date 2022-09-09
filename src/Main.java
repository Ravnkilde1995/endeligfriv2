public class Main {

    public static void main(String[] args) {
	// write your code here

       /* Stack stack = new Stack();

        stack.push("virker");
        stack.push("det");
        stack.push("her");
        stack.push("mon");

        stack.showStack();
        stack.pop();
        stack.showStack();
        stack.pop();
        stack.showStack(); */


        Queue q = new Queue();

        q.add("Virker");
        q.add("min");
        q.add("kø");
        q.add("korrekt");
        q.add("?");

        q.peek();
        q.poll();
        q.peek();
        q.poll();
        q.peek();

    }


}
