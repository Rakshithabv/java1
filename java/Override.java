class Animal {
    public void sound(){
        System.out.println("animal make sound");
    }
    
}
class Dog extends Animal{
    public void sound(){
        System.out.println("the dog can barks");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("the cat moves");
    }
}
public class Override {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal MyCat = new Cat();
        myAnimal.sound();
        myDog.sound();
        MyCat.sound();
        
    }

}

