import java.util.*;
class Circle{
    double radius;
    double area;
    Circle(double r){
       radius=r;
       area=(3.14)*r*r;
    }
    double get_Area_Circle(){
        return area;
    }
}
class Rectangle{
    double length;
    double breadth;
    double Area;
    Rectangle(double l,double b)
    {
        length=l;
        breadth=b;
        Area=l*b;
    }
    double get_Area_Rectangle(){
        return Area;
    }
}
public class Area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double r1;
        System.out.println("");
        System.out.print("Enter radius of the circle : ");
        r1=sc.nextDouble();
        Circle C1=new Circle(r1);
        System.out.println("Area of the circle is : "+C1.get_Area_Circle());
        double l1,b1;
        System.out.print("Enter length,breadth of the rectangle : ");
        l1=sc.nextDouble();
        b1=sc.nextDouble();
        Rectangle R1=new Rectangle(l1,b1);
        System.out.println("Area of the Rectangle is : "+R1.get_Area_Rectangle());
        System.out.println("");
    }
}
