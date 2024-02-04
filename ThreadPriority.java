
class ok extends Thread{
    public ok(String name){
        super(name);
    }
    public void run(){
        int i=0;
        while (i<1000) {
            // System.out.println("ID : " + this.getId());
            System.out.println("Name : " + this.getName());
            i++;
        }
    }
}
public class ThreadPriority {
    public static void main(String[] args) {
        ok o1 = new ok("Ravi 1");
        ok o2 = new ok("Ravi 2");
        ok o3 = new ok("Ravi 3");
        ok o4 = new ok("Ravi (Most Important)");
        o4.setPriority(Thread.MAX_PRIORITY);
        o3.setPriority(Thread.MIN_PRIORITY);
        o1.setPriority(Thread.NORM_PRIORITY);


        o1.start();
        o2.start();
        o3.start();
        o4.start();
        System.out.println("Thread name is " + o1.getName());
        System.out.println("Thread name is " + o2.getName());
        System.out.println("Thread name is " + o3.getName());
        System.out.println("Thread name is " + o4.getName());
        // o1.start();
    }
}
