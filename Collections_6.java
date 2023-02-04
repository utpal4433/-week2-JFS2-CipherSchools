import java.util.*;
public class Collections_6 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("green");
        hs.add("red");
        hs.add("orange");
        hs.add("red");
        hs.add("orange");

        System.out.println(hs);

        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("green");
        lhs.add("red");
        lhs.add("orange");
        lhs.add("red");
        lhs.add("orange");

        System.out.println(lhs);

        TreeSet ts = new TreeSet();
        ts.add("Cat");
        ts.add("Apple");
        ts.add("Ball");

        System.out.println(ts);
    }

}
