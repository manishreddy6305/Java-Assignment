import java.util.*;
class Volume{
    double depth;
    double width;
    double height;
    double volume;
    void initialisation(double d,double w,double h){
       depth=d;
       width=w;
       height=h;
       volume=d*h*w;
    }
    double get_volume(){
        return volume;
    }
}
public class BoxM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double d1,w1,h1;
        System.out.print("Enter depth width height of the box : ");
        d1=sc.nextDouble();
        w1=sc.nextDouble();
        h1=sc.nextDouble();
        Volume box1=new Volume();
        box1.initialisation(d1, w1, h1);
        System.out.println("Volume of box is : "+box1.get_volume());
    }
}

