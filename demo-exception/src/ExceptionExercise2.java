import java.util.Scanner;

public class ExceptionExercise2 {
  // Question: Write a program that takes an array of integers and prints the element at a
  // user-provided index. Handle ArrayIndexOutOfBoundsException and NumberFormatException.

  // 1. If ArrayIndexOutOfBoundsException is caught, print "Error: Index is out of bounds."
  // 2. If NumberFormatException is caught, print "Error: Please enter a valid number."
  // 3. If no exception is caught, print "Element at index X: Y"
  // 3. No matter if the exception is caught, finally print "Array retrieval attempt completed."
  public static void main(String[] args) {
    int[] numbers = new int[]{10, 20, 30, 40, 50};
  try {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the index to retrieve: ");
    int scannerInput = Integer.parseInt(scanner.nextLine());
    scanner.close();
    // code here ...
    
      System.out.println(getArrValue(scannerInput, numbers));
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Your input index is not valid!!!!");
    }catch (NumberFormatException e){
      System.out.println("Error: Please enter a valid number.");
    }finally{
      System.out.println("Array retrieval attempt completed.");
    }
  }

  public static String getArrValue(int x,int[] numbers){
    if (x>=numbers.length) {
      throw new ArrayIndexOutOfBoundsException();
    }
    return "Element at index "+x+": "+numbers[x];
  }
}