
class MyThread extends Thread{
    MyThread(String name1) {
        // super(name1);
    }

    public void run()
    {
        System.out.println("ok brohter");
    }
}


public class threadConstructor {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Ravi");

        // t1.setName("Mahadev");  // set a new name 
        t1.setPriority(10);
        System.out.println("\nThread id is " + t1.getId());
        System.out.println("Thread name is " + t1.getName());
        System.out.println("Thread Class name is " + t1.getClass());
        System.out.println("Thread Priority is " + t1.getPriority());
    }
}
