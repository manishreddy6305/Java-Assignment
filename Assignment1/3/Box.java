import java.util.*;
class Volume{
    double depth;
    double width;
    double height;
    double volume;
    Volume(double d,double w,double h){
       depth=d;
       width=w;
       height=h;
       volume=d*h*w;
    }
    double get_volume(){
        return volume;
    }
}
public class Box {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double d1,w1,h1;
        System.out.print("Enter depth width height of the box : ");
        d1=sc.nextDouble();
        w1=sc.nextDouble();
        h1=sc.nextDouble();
        Volume box1=new Volume(d1,w1,h1);
        System.out.println("Volume of box is : "+box1.get_volume());
    }
}
