package ExceptionHandling;

public class CustomException {
    public static void main(String[] args) {
        try {
            calculate();
        } catch (NotDivisibleByZero e) {
            System.out.println(e.getMessage());
        }catch ( Exception e){
            System.out.println("Not divisible by 0" + e.getMessage());
        }
    }
    public static void calculate() throws NotDivisibleByZero {
        int a = 10;
        int b = 0;

            if(b == 0){
                throw new NotDivisibleByZero("Cannot divide by zero");
            }
            int div = a/b;
            System.out.println(div);
    }
}

class NotDivisibleByZero extends Exception{
    public NotDivisibleByZero(String s){
        super(s);
    }
}