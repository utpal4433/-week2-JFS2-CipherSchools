import java.util.*;
public class Exception_handling_2 {
    int n1 , n2, result;
    Scanner sc = new Scanner(System.in);
    void calc(){
        try{
            System.out.println("Enter first number");
            n1 = sc.nextInt();
            System.out.println("Enter second number");
            n2 = sc.nextInt();

            if(n2 == 0){
                throw new ArithmeticException();
            }
            result = n1/n2;
        }
        catch (InputMismatchException ime){
            System.out.println("IME detected");
        }
        catch (ArithmeticException ae){
            System.out.println("AE detected");
        }
        catch (Exception e){
            System.out.println("Exception detected");
        }
        finally {
            System.out.println("The division is "+result);
        }

    }

    public static void main(String[] args) {
        Exception_handling_2 obj = new Exception_handling_2();
        obj.calc();
    }
}
