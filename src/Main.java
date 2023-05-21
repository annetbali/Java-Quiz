// Java practice questions.
    import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Qsn.1: Write a java program to swap 2 numbers.
        int a, b;
        System.out.println("Enter a and b");
        Scanner in = new Scanner(System.in);

        //reading the integers
        a = in.nextInt();
        b = in.nextInt();
        System.out.println("Before Swapping\na = "+a+"\nb = "+b);
        System.out.println("-------------------");

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping\na = "+a+"\nb = "+b);
        System.out.println("-------------------");


        //Qsn2.Write a java program to find the largest of 3 numbers.
        int c, d, e;
        System.out.println("Enter three integers ");
        Scanner in = new Scanner(System.in);

        // reading the integers
         c = in.nextInt();
         d = in.nextInt();
         e = in.nextInt();

         if (c > d && c > e)
             System.out.println("First number is largest.");
         else if (d > c && d > e) {
             System.out.println("Second number is largest.");
         } else if (e > c && e > d) {
             System.out.println("Third number is largest.");
         }
         else
             System.out.println("The entered numbers are not distinct");

        System.out.println("-------------------");


        //QSN3. Write a java program to find the factorial of a number.
        int num1, num2, factorial = 1;
        System.out.println("Enter a number ");
        Scanner in = new Scanner(System.in);

        //reading the integer
       num1 = in.nextInt();
       if (num1 < 0)
           System.out.println("Number should not be a negative.");
       else{
           for(num2 = 1; num2 <= num1; num2++)
               factorial = factorial*num2;
           System.out.println("Factorial of "+num1+" is = "+factorial);
       }
        System.out.println("-------------------");


        //QSN4.Write a java program to count the number of digits in a number.
        int[] num3 = {2,8,9,3,2,5,6};
        //using the length method to get the total number of digits
        int arrayLength = num3.length;
        System.out.println(arrayLength);
        System.out.println("-------------------");


        //QSN5. Write a java program to count the number of even and odd digits in a number.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = in.nextInt();
        int evenCount = 0;
        int oddCount = 0;
                                                  
        while (number != 0){
            int digit = number % 10;
            if(digit %2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
            number /= 10;
        }
        System.out.println("Number of even digits: "+evenCount);
        System.out.println("Number of odd digits: "+oddCount);
        System.out.println("-------------------");


        //QSN6. Write a java program to find the sum of elements in an array.
        //declaring an array of integers and initializing it with values.
        int [] array = {5, 7, 8, 10, 3, 6, 9};
        //declaring a variable sum
        int sum = 0;
        //looping through each element in the array using a for loop and adding each element th the sum variable.
        for (int i = 0; i<array.length; i++){
            sum += array[i];
        }
        System.out.println("Sum of elements in the array: "+sum);
        System.out.println("-------------------");
    }
}
