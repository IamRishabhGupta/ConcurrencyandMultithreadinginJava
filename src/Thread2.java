public class Thread2 implements Runnable{

    public void run()
    {
        int n=10;
        for(int i=0;i<n;i++)
        {
            System.out.println("inside "+Thread.currentThread()+ " , "+i);
        }
    }
}
