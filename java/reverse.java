import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        String str1=" ";
        for(int i=str.length()-1;i>=0;i--){
            str1+=str.charAt(i);
            
        }
        System.out.println("str1="+str1);
    }
    
    
}
