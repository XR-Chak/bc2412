import java.util.Scanner;

public class ExceptionExercise3 {
  // Question: Create a custom exception called InvalidAgeException. Throw this exception if a user
  // enters an age less than 18.

  public static class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(){
      
    }



  }

  // 1. If NumberFormatException is caught, print "Error: Please enter a valid number."
  // 2. Pass the age number into a static method checkAge(). 
  // This method will throw a custom exception InvalidAgeException if the age < 18; otherwise, print "Age X is accepted".
  // 3. For the method caller, handle the potential exception by printing "Age is invalid. Please input again later."

  public static void main(String[] args) {
  try {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please input an age:");
    String age = scanner.nextLine();
    // code here for the caller...
    
      checkAge(Integer.parseInt(age));
    } catch (InvalidAgeException e) {
      System.out.println("Age is invalid. Please input again later.");
    } catch (NumberFormatException e){
      System.out.println("Error: Please enter a valid number. ");
    }
  }

  // code here for the method
  public static String checkAge(int age){
    if (age<18) {
      throw new InvalidAgeException();
    }
    return "Age "+age+" is accepted";
  }
}
