import java.util.*;
public class Collections_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList arr = new ArrayList();
        for(int i = 1; i <=5; i++){
            String item = sc.next();
            if(arr.contains(item)){
                continue;
            }
            arr.add(item);
        }
        System.out.println(arr);
    }
}
