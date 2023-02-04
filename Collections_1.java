import java.util.*;

public class Collections_1 {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<>();
        states.add("california");
        states.add("Alabama");
        states.add("Alaska");
        states.add("Arkansas");

        System.out.println("Arraylist : "+states);

        String s = states.get(2);
        System.out.println("I got "+s);

//        for (String state : states) {
//            System.out.println(state);
//        }

        states.set(2, "Texas");
        System.out.println("After updation : "+states);

        String t = states.remove(3);
        System.out.println("State removed is "+t);

        states.sort(Comparator.naturalOrder());
        System.out.println(states);

        System.out.println("Is New York there"+states.contains("newyork"));

        System.out.println("Texas is at "+states.indexOf("Texas"));
        states.removeAll(states);
        System.out.println("Is list empty "+states.isEmpty());

    }


}
