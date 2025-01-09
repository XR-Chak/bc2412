public interface Shape2 {
  //problem :
  //No attribute!!!!!
  //Before Java 8, no static & no default method
  double area();
  default double calculate(){
    return area()+3;
  }
  
}
