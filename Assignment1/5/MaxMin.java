import java.util.*;

class MaxMin {
       public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int a,b,c,d;
         System.out.print("Enter the four values : ");
         a=sc.nextInt();
         b=sc.nextInt();
         c=sc.nextInt();
         d=sc.nextInt();
         if(a>=b&&a>=c&&a>=d)
         System.out.println("Maximum number is "+a);
         else if(b>=a&&b>=c&&b>=d)
         System.out.println("Maximum number is "+b);
         else if(c>=a&&c>=b&&c>=d)
         System.out.println("Maximum number is "+c);
         else if(d>=a&&d>=c&&d>=b)
         System.out.println("Maximum number is "+d);
         if(a<=b&&a<=c&&a<=d)
         System.out.println("Minimum number is "+a);
         else if(b<=a&&b<=c&&b<=d)
         System.out.println("Minimum number is "+b);
         else if(c<=a&&c<=b&&c<=d)
         System.out.println("Minimum number is "+c);
         else if(d<=a&&d<=c&&d<=b)
         System.out.println("Minimum number is "+d);
    }
}
