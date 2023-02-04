import java.util.*;

public class Collections_3 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add("Ironman");
        ll.add("Thor");
        ll.add("Hulk");
        ll.add("Loki");

//        System.out.println(ll.get(1));

        ll.addLast("Gamora");;
        ll.addFirst("Antman");
        ll.add(2,"Natasha");

        Iterator it = ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("------------");
        System.out.println("whos at the top "+ll.peek());
        System.out.println("hey first one get out "+ll.poll());
        System.out.println("who is their standing at the last "+ll.pop());
        System.out.println("------------");

        it = ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
