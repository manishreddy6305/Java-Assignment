import java.util.*;
class Addition{
    int ans;
    int parameter;
    Addition(int a0,int b0){
        ans=a0+b0;
        parameter=2;
    }
    Addition(int a1,int b1,int c1){
        ans=a1+b1+c1;
        parameter=3;
    }
    Addition(int a2,int b2,int c2,int d2){
        ans=a2+b2+c2+d2;
        parameter=4;
    }
    void display(){
        System.out.println("Addition of "+parameter+" operand parameterised constructor is "+ans);
    }
}
public class AdditionMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e,f,g,h,i;
        System.out.print("Enter two values : ");
        a=sc.nextInt();
        b=sc.nextInt();
        Addition one=new Addition(a,b);
        System.out.print("Enter three values : ");
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        Addition two=new Addition(c,d,e);
        System.out.print("Enter four values : ");
        f=sc.nextInt();
        g=sc.nextInt();
        h=sc.nextInt();
        i=sc.nextInt();
        Addition three=new Addition(f,g,h,i);
        one.display();
        two.display();
        three.display();
    }
}