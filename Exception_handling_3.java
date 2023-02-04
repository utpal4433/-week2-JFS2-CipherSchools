public class Exception_handling_3 {
    int getNextNo(int n){
        try{
            if (n==5){
                return n+1;
            }
        }
        finally {
            System.out.println("This is important code");
        }
        return n-1;
    }

    public static void main(String[] args) {
        Exception_handling_3 obj = new Exception_handling_3();
        System.out.println(obj.getNextNo(5));
    }
}
