

public class Thread1 extends Thread
{

    public Thread1(String threadName)
    {
        super(threadName);
    }

    @Override
    public void run()
    {

        int n=10;
        for(int i=0;i<n;i++)
        {
            System.out.println("inside "+Thread.currentThread()+ "  "+i);
        }
    }
} 