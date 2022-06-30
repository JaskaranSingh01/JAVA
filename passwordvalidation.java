import java.util.Scanner;

class passwordvalidation {

  public static void main(String[] args) {

    final int NUM_LETTERS = 2;

    final int NUM_DIGITS = 1;

    int upperCount = 0;

    int lowerCount = 0;

    int digitCount = 0;

    System.out.println("Enter the password which must have:\n Two letters and digits\n Length of pass should be atleast 8");

    Scanner in = new Scanner(System.in);
    String input = in.nextLine();

    int inputlen = input.length();

    // Character:
    for (int i = 0; i < inputlen; i++) {

      char ch = input.charAt(i);
      if (Character.isUpperCase(ch))

        upperCount++;

      else if (Character.isLowerCase(ch))

        lowerCount++;
      else if (Character.isDigit(ch))

        digitCount++;
    }

    if (upperCount >= NUM_LETTERS || lowerCount >= NUM_LETTERS && digitCount >= NUM_DIGITS && inputlen > 8)
      System.out.println("Valid password");
    else {

      System.out.println("The password did not have enough of the following:");

      if (upperCount < NUM_LETTERS || lowerCount < NUM_LETTERS)

        System.out.println("less letters in the password");

      if (digitCount < NUM_DIGITS)
        System.out.println("digits are less in the password ");
    }
  }
}