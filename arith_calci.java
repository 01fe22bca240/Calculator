// import java.util.Scanner;
// import java.lang.Math;
/**
 * The "arith_calci" class is a Java program that performs basic arithmetic operations (addition,
 * subtraction, multiplication, and division) on two float numbers.
 */
public class arith_calci{
    float res;
    
    public static void main(String[] args){
        float num1 = 10, num2 = 5;
        // char oper;

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter num1 : ");
        // num1 = sc.nextFloat();
        // System.out.print("Enter num2 (for square and cube num2 is dicarded) : ");
        // num2 = sc.nextFloat();
        // System.out.print("Enter operator (+, -, *, /, s -> square, c -> cube) : ");
        // oper = sc.next().charAt(0);

        arith_calci a = new arith_calci();

        // The `switch` statement is used to perform different actions based on the value of the `oper`
        // variable.
        // switch (oper) {
        //     case '+':
        //         a.add(num1,num2);
        //         break;
        //     case '-':
        //         a.sub(num1,num2);
        //         break;
        //     case '*':
        //         a.mult(num1,num2);
        //         break;
        //     case '/':
        //         a.div(num1,num2);
        //         break;
        //     case 's':
        //         a.square(num1, 2);
        //         break;
        //     case 'c':
        //         a.cube(num1, 3);
        //         break;
        //     default:
        //         break;
        // }

        System.out.println("num1 : "+ num1 + "  and num2 : "+ num2);
        a.add(num1, num2);
        a.sub(num1, num2);
        a.mult(num1, num2);
        a.div(num1, num2);
        // a.square(num1, 2);
        // a.cube(num1, 3);
        
        // sc.close();

    }

    /**
     * The function takes two float numbers as input, adds them together, and prints the sum.
     * 
     * @param a The first parameter is a float variable named "a".
     * @param b The parameter "b" is a float type variable.
     */
    public void add(float a, float b){
        res = a + b;
        System.out.println("Sum : "+ res);
    }

    /**
     * The function calculates the difference between two float numbers and prints the result.
     * 
     * @param a The first parameter "a" is a float value representing the first number in the
     * subtraction operation.
     * @param b The parameter "b" is a float type variable.
     */
    public void sub(float a, float b){
        res = a - b;
        System.out.println("Differencw : "+ res);
    }

    /**
     * The function takes two float numbers as input and calculates their product, then prints the
     * result.
     * 
     * @param a The first parameter "a" is a float value representing the first number to be
     * multiplied.
     * @param b The parameter "b" is a float type variable.
     */
    public void mult(float a, float b){
        res = a * b;
        System.out.println("Product : "+ res);
    }

    /**
     * The function takes two float numbers as input and calculates their product, then prints the
     * result.
     * 
     * @param a The first parameter "a" is a float value representing the first number to be
     * multiplied.
     * @param b The parameter "b" is a float type variable.
     */
    public void div(float a, float b){
        res = a / b;
        System.out.println("Quotient : "+ res);
    }

    // public void square(float a, float b){
    //     double res = Math.pow(a, b);
    //     System.out.println("Square : "+ res);
    // }

    // public void cube(float a, float b){
    //     double res = Math.pow(a, b); 
    //     System.out.println("Cube : "+ res);
    // }

}
