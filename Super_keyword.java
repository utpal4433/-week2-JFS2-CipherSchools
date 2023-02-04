import java.lang.reflect.Constructor;

class App{
    App(){
        System.out.println("Constructor of App");
    }
    App(int num){
        System.out.println(num);
    }
}

public class Super_keyword extends App{
    Super_keyword(){
        super(20);
        System.out.println("Constructor of Super_keyword");
    }

    public static void main(String[] args) {
        new Super_keyword();
    }
}
