class Car {
    private String ModelName;
    private String owner;
    private int regNumber;

    public Car(String ModelName,String owner,int regNumber){
        this.ModelName=ModelName;
        this.owner=owner;
        this.regNumber=regNumber;
    }
    public void startEngine(){
        System.out.println("car can started..");

    }
    public void accelerate(){
        System.out.println("car can be accelerated..");

    }
    public void stop(){
        System.out.println("car can be stopped..");

    }
    public void showCarInformation(){
        System.out.println("the car is owned by" + owner);
        System.out.println("the car Model is" + ModelName);
        System.out.println("the regNumber is" + regNumber);
    }

    public static void main(String[] var0){
        Car myCar= new Car("Suzuki","xyz",1234);
        myCar.startEngine();
        myCar.accelerate();
        myCar.stop();
        myCar.showCarInformation();
        
    }
}