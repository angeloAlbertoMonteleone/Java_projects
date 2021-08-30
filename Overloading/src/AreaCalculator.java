public class AreaCalculator {

    /*public static double area (double radius) {
        return (radius < 0) ? -1 : radius * radius * Math.PI;
    }

    public static double area (double x, double y) {
        return (x < 0 || y < 0) ? -1 : x * y;
    }*/

    public static double area(double radius){
        if(radius >= 0) {
            double circleArea = radius * radius * Math.PI;
            return circleArea;
        }else{
            return -1.0;
        }
    }

    public static double area(double x, double y){
        if(x < 0 || x < 0){
            return -1.0;
        } else{
            double area = x * y;
            return area;
        }
    }



}
