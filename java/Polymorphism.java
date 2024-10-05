class Poly {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a + b + c;
    }
    public double add(double a,double b,double c)
    {
        return a+b+c;
    }
}
public class Polymorphism{
    public static void main(String[] args) {
        Poly p = new Poly();
        System.out.println("sum of the integers :" + p.add(10,20));
        System.out.println("sum of the intergers :" +p.add(10,20,30));
        System.out.println("sum of the intergers :" +p.add(10.5,20.5,30.5));

    }
}
