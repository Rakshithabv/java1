class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && name.isEmpty()){
            this.name = name;
        }
        else{
            System.out.println("Invalid name: " + name);
        }
    }
        public int getAge(){
            return age;
        }
        public void setAge(int age){
            if(age>0){
                this.age=age;
            }
            else{
                System.out.println("invalid age:"+age);
            }
        }
    }
public class Encapsulation{
    public static void main(String[] args) {
        Person person=new Person();
        person.setName("Rakshitha.B.V.");
        person.setAge(19);
        System.out.println("Name:"+person.getName());
        System.out.println("Age:"+person.getAge());
        person.setAge(-5);
    }
}
