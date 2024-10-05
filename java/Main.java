class Bird {
    void fly(){
        System.out.println("Bird can fly");
    }
}
    class parrot extends Bird{
        void color(){
            System.out.println("iam green");
        }

    }
class singleparrot extends parrot{
    void sing(){
        System.out.println("i can sing");
    }
}
class cow extends Bird{
    void eat(){
        System.out.println("i can eat");
    }
}
    

public class Main{
    public static void main(String[] args) {
        parrot p = new parrot();
        singleparrot sp = new singleparrot();
        cow c = new cow();
        p.fly();
        p.color();
        sp.sing();
        c.eat();
    }
}
class A{
void testmethod(){

}
}
class C extends A,B{ 

}
