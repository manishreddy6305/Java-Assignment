import java.util.*;
public class MaxMinT {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int a,b,c,d;
         System.out.print("Enter the four values : ");
         a=sc.nextInt();
         b=sc.nextInt();
         c=sc.nextInt();
         d=sc.nextInt();
         int max=(a>=b&&a>=c&&a>=d)?a:((b>=a&&b>=c&&b>=d)?b:((c>=a&&c>=b&&c>=d)?c:d));
         System.out.println("Maximum number is "+max);
         int min=(a<=b&&a<=c&&a<=d)?a:((b<=a&&b<=c&&b<=d)?b:((c<=a&&c<=b&&c<=d)?c:d));
         System.out.println("Maximum number is "+min);
    }
}
