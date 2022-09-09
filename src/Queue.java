public class Queue {

    private Liste liste = new Liste();


    public Node add(String s) {

        return liste.insetFromTail(s);
    }

    public Node poll() {
        return liste.removeFromHead();

    }

    public void peek(){


        String[] string = liste.printFromHead().split(" ");

        for (String s : string){
            System.out.println(s);
        }
        System.out.println("\n");

    }
}
