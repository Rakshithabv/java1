package demo;
public class Exception {
    public static void main(String[] args) {
        try {
            int a=10/0;
            System.out.println("Result:"+a);
            
        }catch(ArithmeticException e){
            System.out.println("error Division by zero");
        }finally{
            System.out.println("this is finally blocked");

        }
        System.out.println("rest of the code.....!");
    }
}


