public class ThreadTester {



    public static void main(String[] args)
    {
        System.out.println("Main is starting");
        Thread thread1=new Thread1("Thread1");
        // thread1.setDaemon(true);
        thread1.start();
        Thread2 thread2temp=new Thread2();
        Thread thread2=new Thread(thread2temp,"Thread2");
        thread2.start();

        System.out.println("Main is exiting");

        // here we can see since thread1 is a user thread it is still running after execution of main thread but in 
        // case of daemon thread it will stop as soon as main thread stops executing as we saw in previous commit

    }



    //basically we impliemnted runnable interface in thread 2 and overrided run method in it
    //now the thread class have a construcotr which takes runnable object as argument where we passed 
    //thread2 because it implements runnable interface
}
