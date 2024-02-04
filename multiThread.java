
// class m1 extends Thread{
//     public void run(){
//         int i =0;
//         while (i<1000) {
//             System.out.println("M1 Started ");
//             i++;
//         }
//     }
// }
// class m2 extends Thread{
//     public void run(){
//         int i=0;
//         while (i<1000) {
//             System.out.println("_-_-_-_-_-_-_-_- ");
//             i++;
//         }
//     }
// }
// public class multiThread{
//     public static void main(String[] args) {
//         m1 o1 = new m1();
//         m2 o2 = new m2();

//         o1.start();   // Both method Execute
//         o2.start();

//         // o1.run();    // only one method execute
//         // o2.run();

//     }
// }


// class MyThread extends Thread {
//     public void run() {
//         for (int i = 0; i < 5; i++) {
//             System.out.println(Thread.currentThread().getId() + " Value " + i);
//         }
//     }
// }

public class multiThread {
    public static void main(String args[]) {
        // MyThread t1 = new MyThread();
        // t1.start();

        // MyThread t2 = new MyThread();
        // t2.start();

// -------------------------------------------------------------------------------
                // Get a reference to the current thread
                Thread currentThread = Thread.currentThread();
        
                // Set a custom name for the thread
                currentThread.setName("CustomMain");
        
                // Set a custom priority for the thread (1 is the lowest, 10 is the highest)
                currentThread.setPriority(Thread.MAX_PRIORITY);  // 10 show 
                currentThread.setPriority(9);  // 9 show 
        
                // Display information about the modified thread
                System.out.println("Current Thread: " + currentThread);
                System.out.println("Thread ID: " + currentThread.getId());
                System.out.println("Thread Name: " + currentThread.getName());
                System.out.println("Thread Priority: " + currentThread.getPriority());
            }
        }
