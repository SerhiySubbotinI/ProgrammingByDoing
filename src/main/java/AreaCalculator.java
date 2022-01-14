import java.util.Random;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area_circle(4));
        System.out.println(area_rectangle(10,4));
        System.out.println(area_square(9));
        System.out.println(area_triangle(5,6));
        System.out.println(WeekdayCalculator.month_name(11));
    }
    public static double area_circle( int radius ) {
        return Math.PI*(radius*radius);
    }   // returns the area of a circle
    public static int area_rectangle( int length, int width ){
        return length * width;
    }   // returns the area of a rectangle
    public static int area_square( int side ){
        return side * side;
    }   // returns the area of a square
    public static double area_triangle( int base, int height ){
        return 0.5 * base * height;
    }  // returns the area of a triangle
}
