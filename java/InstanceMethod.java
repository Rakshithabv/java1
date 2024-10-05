public class InstanceMethod {
    public void Display(String name){
        System.out.println("Name:"+name);
    }
    public static int square(int number){
        return number * number;
    }
    public static void main(String[] args) {
        int result=InstanceMethod.square(5);
        System.out.println("square of 5 is:"+result);
    }
}
