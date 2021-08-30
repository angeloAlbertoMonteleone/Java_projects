package challenge;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public void startEngine(){
        System.out.println("the engine is starting..");
    }

    public void accelerate(){
        System.out.println("the car is accelerating.. ");
    }

    public void brake(){
        System.out.println("the car is braking..");
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}


class Ferrari extends Car{
    public Ferrari() {
        super("Ferrari model: 356336", 8);
    }

    @Override
    public void startEngine() {
        System.out.println("Ferrari -> start Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Ferrari -> accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Ferrari -> start Engine");
    }
}


class Jeep extends Car{
    public Jeep() {
        super("Jeep model: 546336", 3);
    }

    @Override
    public void startEngine() {
        System.out.println("Jeep -> start Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Jeep -> accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Jeep -> brake");
    }
}


class Porsche extends Car{
    public Porsche() {
        super("Porsche model: 57556336", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("Porsche -> start Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Porsche -> accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Porsche -> brake");
    }
}

class Ford extends Car {
    public Ford() {
        super("Ford model: 546336", 3);
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + "-> start Engine");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName() + "-> accelerate");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName() +" -> brake");
    }
}


class Holden extends Car{
    public Holden() {
        super("Holden model: 356336", 8);
    }

    @Override
    public void startEngine() {
        System.out.println("Holden -> start Engine");
    }

    @Override
    public void accelerate() {
        System.out.println("Holden -> accelerate");
    }

    @Override
    public void brake() {
        System.out.println("Ferrari -> start Engine");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Base car", 5);
        car.startEngine();
        car.accelerate();
        car.brake();

        Jeep jeep = new Jeep();
        System.out.println(jeep.getName());
        System.out.println(jeep.getCylinders());
        jeep.startEngine();
        jeep.accelerate();
        jeep.brake();


        Ford ford = new Ford();
        System.out.println(ford.getName());
        System.out.println(ford.getCylinders());
        ford.getCylinders();
        ford.startEngine();
        ford.accelerate();
        ford.brake();
    }
}
