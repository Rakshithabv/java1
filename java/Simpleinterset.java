import java.util.Scanner;
public class Simpleinterset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the amount");
        int p=sc.nextInt();
        System.out.println("enter the time");
        int t=sc.nextInt();
        System.out.println("enter the rate of interest");
        int r=sc.nextInt();
        int s;
        s=(p*t*r)/100;
        System.out.println(s);

    }
}
