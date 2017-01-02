import java.util.Scanner;

class Apples{
  public static void main(String args[]){
    System.out.println("Hello World!");

    int num = 20;

    String result = (num < 12) ? "Less" : "More";
    System.out.println(result);

    double myNum = 25.5d;
    System.out.println(myNum);
  }
}

class Test{
  public static void main(String args[]){
    System.out.println("Hello World! --test");
  }
}

class Variables{
  public static int myScore;

  public static void main(String args[]){
    myScore = 1000;
    System.out.println("Setting the score to: " + myScore);
    displayScore();
    changeScore(100);
    changeScore(-6);
    changeScore(75);
    changeScore(900);
    changeScore(-650);
  }

  // change the score of the game and output to the console
  public static void changeScore(int scoreDelta){
    System.out.println("Changing the score by: " + scoreDelta);
    myScore = myScore + scoreDelta;
    displayScore();
  }

  public static void displayScore(){
    System.out.println("Player score: " + myScore);
  }
}

class returnValues{
  public static double subtotal;

  public static void main(String args[]){
    subtotal = 15.00;

    System.out.println("Subtotal: " + subtotal);
    double total = subtotal + calculateTax(0.08, subtotal);
    System.out.println("Total: " + total);
  }

  public static double calculateTax(double taxRate, double amountToTax){
    double tax = amountToTax * taxRate;
    System.out.println("Tax: " + tax);
    return tax;
  }
}

class input{
  public static void main(String args[]){
    System.out.print("Enter your name: ");
    Scanner in = new Scanner(System.in);
    String name = in.next();
    String greeting = "Hello " + name + "!";
    System.out.println(greeting);
  }
}
