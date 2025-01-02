import java.util.Arrays;

public class Student2 {
  private long id;
  private int score;
  public int redCount;
  public int blueCount;
  public int yellowCount;
  private Candy[] candies=new Candy[0];

  public Student2(long id,int score){
    this.id =id;
    this.score =score;

  }

  public int getScore(){
    return this.score;
  }

  public int getCandyCount(){
    return this.candies.length;
  }

  public Candy[] getCandies(){
    return this.candies;
  }

  public String getCandiesInfo(){
    String info ="";
    for(Candy candy:this.candies){
      info+=candy.getColor()+",";
    }
    return "["+info.substring(0,info.length())+"]";
  }

  public Candy[] setCandies(Candy candy){
    Candy[] tempCandies = new Candy[this.candies.length+1];
    for(int i=0;i<this.candies.length;i++){
      tempCandies[i] = this.candies[i];
    }
    tempCandies[this.candies.length] = candy;
    this.candies = tempCandies;
    return this.candies;
  }

  public long getId(){
    return this.id;
  }
  public static Student2[] distributeCandies(Student2[] students){
    while (Candy.totalCount()>0) {
      for(int i=0;i<students.length;i++){
        if (students[i].getScore()>80 && Candy.redCount>0) {
          students[i].redCount++;
          Candy.redCount--;
        }else if (students[i].getScore()>=60 &&students[i].getScore()<=79 && Candy.blueCount>0) {
          students[i].blueCount++;
          Candy.blueCount--;
        }else if (Candy.yellowCount>0) {
          students[i].yellowCount++;
          Candy.yellowCount--;
        }{
          
        }
      }
    }
    return students;
  }
  //Question2 :
  //Candy.class has attribute color(Red,Blue,Yellow)
  //Student2.class to store his own candy

//Rule:Every round of distribution, above 80 score -> red ,first round;between 60-79 score -> blue,else yellow
  //Student 1 : 67 score
  //Student 2 : 89 score
  //Student 3 : 50 score
  //Student 4 : 99 score
  //Student 5 : 60 score
  //Studemt 6 : 59 score

  //Expect output: return/sout Student[](student should have Candy attribute)
  public static void main(String[] args) {
    Candy c1 = new Candy('r');
    Candy c2 = new Candy('b');
    Candy c3 = new Candy('b');
    Candy c4 = new Candy('r');
    Candy c5 = new Candy('r');
    Candy c6 = new Candy('r');
    Candy c7 = new Candy('r');
    Candy c8 = new Candy('r');
    Candy c9 = new Candy('y');
    Candy c10 = new Candy('y');
    Candy c11 = new Candy('y');
    Candy c12 = new Candy('b');
    Candy c13 = new Candy('b');
    Candy c14 = new Candy('y');
    Candy c15 = new Candy('y');
    Candy c16 = new Candy('r');
    Candy c17 = new Candy('r');
    Candy c18 = new Candy('y');
    Candy c19 = new Candy('r');
    Candy c20 = new Candy('b');
    Candy[] candies = new Candy[]{c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20};

    // Student2 student1 = new Student2(67);
    // Student2 student2 = new Student2(89);
    // Student2 student3 = new Student2(50);
    // Student2 student4 = new Student2(99);
    // Student2 student5 = new Student2(60);
    // Student2 student6 = new Student2(59);

    // Student2[] students = new Student2[]{student1,student2,student3,student4,student5,student6};
    
    // System.out.println(distributeCandies(students)[0].blueCount);
  }


}
