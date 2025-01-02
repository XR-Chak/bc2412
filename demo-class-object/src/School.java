import java.util.Arrays;

public class School {
  private static int candies =20;
  private Student[] students = new Student[6];

  public School(Student[] students){
    this.students = students;
  }

  public int[] studentsCandiesNum(){
    int[] studentarr = new int[6];
    while (candies>0) {
      for(int i=0;i<students.length;i++){
      if (this.students[i].getScore()>80 && candies>=2) {
        this.students[i].candy +=2;
        candies -=2;
      }else if(this.students[i].getScore()>=60&&this.students[i].getScore()<79 && candies>=1){
        this.students[i].candy +=1;
        candies -=1;
      }
    }
    }
    for(int i=0;i<students.length;i++){
      studentarr[i] = this.students[i].candy;
    }
    return studentarr;
  }
public static void main(String[] args) {
  Student student1 = new Student(67);
  Student student2 = new Student(89);
  Student student3 = new Student(50);
  Student student4 = new Student(99);
  Student student5 = new Student(60);
  Student student6 = new Student(59);
  School s1 = new School(new Student[]{student1,student2,student3,student4,student5,student6});
  
  System.out.println(Arrays.toString(s1.studentsCandiesNum()));
  for(int i=0;i<s1.studentsCandiesNum().length;i++){
    System.out.println("Student "+(i+1)+" has "+ s1.studentsCandiesNum()[i]+" candies");
  }
  System.out.println("asd".contains(String.valueOf('a')));
}
}
