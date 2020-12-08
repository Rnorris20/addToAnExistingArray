import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String[] msBenny = new String[10];
    String[] mrBarry = new String[10];
    // establishes the 2 string statments for the seperate classes
    Scanner scan = new Scanner(System.in);
    for(int i = 0; i < mrBarry.length; i++)
    {
      System.out.println("Hello student, What is your name?");
      mrBarry[i] = scan.nextLine(); 
    }
    // Scan statement for the input on the students names.
    for (int i = 0; i < mrBarry.length; i++)
    {
      //establishes a connection in order to transfer the values from one array to another.
      msBenny[i] = mrBarry[i];
      System.out.println(msBenny[i]);
      // print statement to create a new array roster.
    }
    msBenny[11] = "Marco";
    //created a statement to establish the 11th variable
    msBenny[12] = "John";
    //created a statement to establish the 12th variable
      System.out.println("After these ten students, comes students number 11 and 12, named: " + msBenny[11] + "and" + msBenny[12]);
      //print statement to show the 2 new students.

  }
}