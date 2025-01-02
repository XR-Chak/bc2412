public class Student {
  private int score;
  public int candy =0;
  //Expected output: 
  //20 candies -> distribute students according to their score
  //Rule:Every round of distribution, above 80 score -> 2 candies ,first round;between 60-79 score -> 1 candy
  //Student 1 : 67 score
  //Student 2 : 89 score
  //Student 3 : 50 score
  //Student 4 : 99 score
  //Student 5 : 60 score
  //Studemt 6 : 59 score

  //first round
  //1: 1
  //2: 2
  //3: 0
  //4: 2
  //5: 1
  //6: 0

  //expected output
  //Student 1 has 4 candies
  //Student 2 has 6 candies
  //Student 3 has 0 candies
  //Student 4 has 6 candies
  //Student 5 has 4 candies
  //Student 6 has 0 candies

  //Tips :static
  public Student(int score){
    this.score = score;

  }

  public int getScore(){
    return this.score;
  }

}
