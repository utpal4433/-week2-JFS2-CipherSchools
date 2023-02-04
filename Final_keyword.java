class Father{
    public final String lastName = "Dubey";
    public final void foodhabit(){
        System.out.println("I like salty");
    }
}
class son extends Father{
    public void foodhabit(){  //Error because of final keyword
    }
    lastName = "Mishra"; //Error because of final keyword
}

public class Final_keyword {

}
