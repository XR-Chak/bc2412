public class DemoThread {
    //main thread(worker A)
    //Another thread(Worker B)
    public static void main(String[] args) throws Exception {
        int x =3;
        x++;
        ++x;
        x+=1;
        System.out.println(x);//6
    
        //Create another thread.
        //1. Task ,2. Thread
        Runnable sayHelloTask =()->System.out.println("Hello!!!!");//sayHelloTask is an object
        StringBuilder sb = new StringBuilder("");
        Runnable concatStringHelloMillionTimes =()->{
            for(int i=0;i<1_000_000;i++){
                sb.append("!");
            }
            //System.out.println(sb.length());//1_000_000, executed by workerB
        };
        Thread workerB = new Thread(concatStringHelloMillionTimes);
        workerB.start();// main thread(worker A) executes a new thread(worker B)
        //main thread proceed its own task
        System.out.println(sb.length());//0(likely),executed by WorkerA(main thread)
        System.out.println("Program end.");
        System.out.println("ab".contains("a"));
        System.out.println("a".charAt(1));
        char x1 ='a';
        //System.out.println((String) x); -->cannot do it!!!! cant cast from char to string!!!!
    }
}
