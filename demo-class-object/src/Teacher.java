import java.util.Arrays;

public class Teacher {
  private Candy[] candies;
  private Student2[] students;

  public Teacher(Candy[] candies,Student2[] students){
    this.candies = candies;
    this.students = students;
  }

  public int getCandiesSize(){
    return this.candies.length;
  }

  //Teacher ,candy, student2
  //Student 1 : 67 score
  //Student 2 : 89 score
  //Student 3 : 50 score
  //Student 4 : 99 score
  //Student 5 : 60 score
  //Studemt 6 : 59 score

  public static boolean shouldDistribute(int score,char color){
    return score>=80 && color =='r'||
    score>=60 && score<80 && color=='b'||
    score<60 && color=='y';
  }

  public void clearCandy(int pos){
    this.candies[pos] = null;
  }
  public void distribute(){
    //for (Candy candy : this.candies) {
    int pos =0;
    while(pos <this.candies.length){//19
      for(Student2 student:this.students){
        //System.out.println("sid="+student.getId());
          if (shouldDistribute(student.getScore(), this.candies[pos].getColor())) {
            student.setCandies(this.candies[pos]);//student candy bag +1
            this.clearCandy(pos);//teacher's candy bag-1
            //System.out.println("pos="+pos);
            if(++pos >=this.candies.length){
              return;//This return similar to break,it will leave all the loop and stop the method!!!!
            }
        }
        
      }
    }
      
  }
  public static void main(String[] args) {
    //new Candy2('R')
    //Teacher t1 = new teacher();
    //t1.distribute()???
    Candy[] candies = new Candy[]{new Candy('r'),
    new Candy('b'),new Candy('y'),new Candy('y'),new Candy('y'),new Candy('y'),new Candy('y')
  ,new Candy('y'),new Candy('y'),new Candy('r'),new Candy('r'),new Candy('r'),new Candy('r'),new Candy('r')
,new Candy('r'),new Candy('b'),new Candy('b'),new Candy('b'),new Candy('b'),new Candy('b')};

    
    Student2 s1 = new Student2(1,67);
    Student2 s2 = new Student2(2,89);
    Student2 s3 = new Student2(3,50);
    Student2 s4 = new Student2(4,99);
    Student2 s5 = new Student2(5,60);
    Student2 s6 = new Student2(6,59);
    Student2[] students = new Student2[]{s1,s2,s3,s4,s5,s6};
    Teacher t1 = new Teacher(candies,students);
    t1.distribute();
    for(Student2 student:students){
      System.out.println("Student "+student.getId()+"-"+student.getCandiesInfo());
    }
    
  }
}
