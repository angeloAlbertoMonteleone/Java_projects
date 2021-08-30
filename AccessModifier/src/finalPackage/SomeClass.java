package finalPackage;

public class SomeClass {

    private static int classCounter = 0; //static means you can declare a value
    public final int instanceNumber; // you can t declare any value
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
