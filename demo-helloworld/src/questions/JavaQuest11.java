package questions;

public class JavaQuest11 {
  // You are given a positive integer arrivalTime denoting the arrival time of a
  // train in hours,
  // and another positive integer delayedTime denoting the amount of delay in
  // hours.
  // Calculate Delayed Arrival Time

  public static void main(String[] args) {
    int delayedArrivalTime1 = findDelayedArrivalTime(15, 5); // 20
    int delayedArrivalTime2 = findDelayedArrivalTime(23, 5); // 4
    int delayedArrivalTime3 = findDelayedArrivalTime(18, 6); // 0
  }

  public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
    // code here ...
    int finalTime =0;
    finalTime = (arrivalTime + delayedTime)>=24?(arrivalTime + delayedTime-24):arrivalTime + delayedTime;
    System.out.println(finalTime);
    return finalTime;
  }
}
