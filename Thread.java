import java.lang.Thread;

class ThreadA extends Thread{
    public void run(){
        System.out.println("thread a started...");
        for(int i=0;i<5;i++){
            System.out.println("A -> "+i);
        }
        System.out.println("thread a stop...");
    }
}
class ThreadB extends Thread{
    public void run(){
        System.out.println("thread b started...");
        for(int j=0;j<5;j++){
            System.out.println("B -> "+j);
        }
        System.out.println("thread b stop...");
    }
}
class Main{
    public static void main(String args[]){
        new ThreadA().run();
        new ThreadB().run();
    }
}