import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("How many random passwords do you want to generate? ");
    int total = in.nextInt();
    System.out.print("Please tpye in 2 digits less than how long you want your random passwords to be ? ");
    int length = in.nextInt();
    String[] randomPasswords = new String[total];
    for (int i = 0; i < total; i++) {
      String randomPassword = "";
      for (int j = 0; j < length; j++) {
        randomPassword += randomCharacter();
      }
      randomPasswords[i] = randomPassword;
    }
    printArray(randomPasswords);

  }

  public static void printArray(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println("@"+arr[i] + "$");
    }
  }

  public static char randomCharacter() {
    int rand = (int) (Math.random() * 62);
    if (rand <= 9) {
      int number = rand + 48;
      return (char) (number);
    } else if (rand <= 35) {
      int uppercase = rand + 55;
      return (char) (uppercase);
    } else {
      int lowercase = rand + 61;
      return (char) (lowercase);
    }
  }

}