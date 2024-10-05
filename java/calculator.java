import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        int c;
        System.out.println("enter your choice");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                c=a+b;
                System.out.println(c);
                break;
            case 2:
                c=a-b;
                System.out.println(c);
                break;
            case 3:
                c=a*b;
                System.out.println(c);
                break;
            case 4:
                c=a/b;
                System.out.println(c);
                break;
        
            }
        }
    }
    

