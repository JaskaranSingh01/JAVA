import java.util.Scanner;

class task {

   public static void main(String[] args) {

      int number;
      int reversedNumber = 0;
      int temp = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the reversed number");
      number = sc.nextInt();// user input
      while (number > 0) {
         // modulus operator used to get the last digit
         temp = number % 10;

         // creating reversed number
         reversedNumber = reversedNumber * 10 + temp;
         number = number / 10;
      }

      // output
      System.out.println("Reversed Number is: " + reversedNumber);
   }
}
