import java.util.*; 
 class Operations{
    double multiplication(int a,int b){
          return a*b;
    }
    double addition(int a,int b){
        return a+b;
    }
    double substraction(int a,int b){
        return a-b;
    }
    double division(int a,int b){
        return a/b;
    }
    double modulo(int a,int b){
        return a%b;
    }
    double and(int a,int b){
          return a&b;
    }
    double or(int a,int b){
        return a|b;
    }
    double not(int a){
        return ~a;
    }
}
 public class Calculator{
         public static void main(String[] args) {
              Scanner sc= new Scanner(System.in);
              System.out.println("");
              System.out.println("                                          Menu");
              System.out.println("");
              System.out.println("1. Multiplication");
              System.out.println("2. Addition");
              System.out.println("3. Substraction");
              System.out.println("4. Division");
              System.out.println("5. Modulo");
              System.out.println("6. AND operator");
              System.out.println("7. OR operator");
              System.out.println("8. NOT operator");
              System.out.println("9. OFF");
              System.out.println("");
              Operations operator=new Operations();
              int a;
              int b,c;
              do{
                System.out.print("Select the operation you want to perform : ");
                a=sc.nextInt();
                switch(a){
                    case 1:
                          System.out.println("");
                          System.out.print("Enter the operands : ");
                          b=sc.nextInt();
                          c=sc.nextInt();
                          System.out.println("");
                          System.out.print("Answer: ");
                          System.out.println(operator.multiplication(b, c));
                          System.out.println("");
                          break;
                    case 2:
                          System.out.println("");
                          System.out.print("Enter the operands : ");
                          b=sc.nextInt();
                          c=sc.nextInt();
                          System.out.println("");
                          System.out.print("Answer: ");
                          System.out.println(operator.addition(b, c));
                          System.out.println("");
                          break;
                    case 3:
                          System.out.println("");
                          System.out.print("Enter the operands : ");
                          b=sc.nextInt();
                          c=sc.nextInt();
                          System.out.println("");
                          System.out.print("Answer: ");
                          System.out.println(operator.substraction(b, c));
                          System.out.println("");
                          break;
                    case 4:
                          System.out.println("");
                          System.out.print("Enter the operands : ");
                          b=sc.nextInt();
                          c=sc.nextInt();
                          System.out.println("");
                          System.out.print("Answer: ");
                          System.out.println(operator.division(b, c));
                          System.out.println("");
                          break;
                    case 5:
                          System.out.println("");
                          System.out.print("Enter the operands : ");
                          b=sc.nextInt();
                          c=sc.nextInt();
                          System.out.println("");
                          System.out.print("Answer: ");
                          System.out.println(operator.modulo(b, c));
                          System.out.println("");
                          break;
                    case 6:
                          System.out.println("");
                          System.out.print("Enter the operands : ");
                          b=sc.nextInt();
                          c=sc.nextInt();
                          System.out.println("");
                          System.out.print("Answer: ");
                          System.out.println(operator.and(b, c));
                          System.out.println("");
                          break;
                    case 7:
                          System.out.println("");
                          System.out.print("Enter the operands : ");
                          b=sc.nextInt();
                          c=sc.nextInt();
                          System.out.println("");
                          System.out.print("Answer: ");
                          System.out.println(operator.or(b, c));
                          System.out.println("");
                          break;
                    case 8:
                          System.out.println("");
                          System.out.print("Enter the operands : ");
                          b=sc.nextInt();
                          System.out.println("");
                          System.out.print("Answer: ");
                          System.out.println(operator.not(b));
                          System.out.println("");
                          break;
                    case 9:
                          System.out.println("");
                          System.out.println("Closing...");
                          System.out.println("");
                          break;
              }
            }while(a!=9);
         }    
    }