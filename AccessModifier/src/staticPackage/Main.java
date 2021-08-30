package staticPackage;

public class Main {
    public static void main(String[] args) {
        StaticTest staticTest = new StaticTest("1st instance");
        System.out.println(staticTest.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest secondStaticTest = new StaticTest("2st instance");
        System.out.println(secondStaticTest.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest thirdStaticTest = new StaticTest("3st instance");
        System.out.println(thirdStaticTest.getName() + " is instance number " + StaticTest.getNumInstances());

    }
}
