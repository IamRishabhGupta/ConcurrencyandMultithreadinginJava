public class ThreadTester {

    public static void main(String[] args) {
        System.out.println("Main is starting");
        // Thread thread1 = new Thread1("Thread1");
        // // thread1.setDaemon(true);
        // thread1.start();
        // // Thread2 thread2temp = new Thread2();
        // Thread thread2 = new Thread(() -> {
        //     int n = 10;
        //     for (int i = 0; i < n; i++) {
        //         System.out.println("inside " + Thread.currentThread() + " , " + i);
        //     }
        // });
        // thread2.start();

       

        Stack stack = new Stack(5);
         new Thread(() -> {
            int counter=0;
            while(++counter<=10)
            {
                System.out.println("Pushing "+counter+" in "+stack.push(counter));
            }
        }
        
         ).start();

         new Thread(()->{
            int counter=0;
            while(++counter<=10)
            {
                System.out.println("Popping "+stack.pop());
            }
         }).start();
         

          System.out.println("Main is exiting");

        }

        // here we can see since thread1 is a user thread it is still running after
        // execution of main thread but in
        // case of daemon thread it will stop as soon as main thread stops executing as
        // we saw in previous commit

    }


    // basically we impliemnted runnable interface in thread 2 and overrided run
    // method in it
    // now the thread class have a construcotr which takes runnable object as
    // argument where we passed
    // thread2 because it implements runnable interface

