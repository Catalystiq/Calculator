//Calculator
//James Nelson
//October 6, 2021
//Computer Programming I
//make a calculator with 4 functions

import java.util.Scanner;

public class Calculator{
   static float num1, num2;
   static float output;
   static String op;

   public static void main(String args[]){
      Calculator calculator = new Calculator();
      Calculate cal = new Calculate(num1, num2, output, op);
   
      Scanner scan = new Scanner(System.in);
      System.out.println("type in the first number: ");
      num1 = scan.nextFloat();            
      System.out.println("type in the second number: ");
      num2 = scan.nextFloat();  
      System.out.println("type in the an operator (+, -, *, /): ");
      op = scan.next().toLowerCase();
      
      cal.calc();    
   } 
}

class Calculate extends Calculator{
   Calculate(float num1, float num2, float output, String op){}
   
   public static void calc(){
      switch(op){
         case "+":
            output = num1 + num2;
            System.out.println("the sum is: " +output);
            System.exit(0);
            break;
         case "-":
            output = num1 - num2;
            System.out.println("the difference is: " +output);
            System.exit(0);
            break;
         case "/":
            output = num1 / num2;
            System.out.println("the quotient is: " +output);
            System.exit(0);
            break;
         case "*":
            output = num1 * num2;
            System.out.println("the product is: " +output);
            System.exit(0);
            break;
         default:
            System.out.println("Invalid Operator");
            System.exit(0);
            break;
      }
   }    
}
