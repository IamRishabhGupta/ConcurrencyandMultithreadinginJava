

public class Thread1 extends Thread
{
    @Override
    public void run()
    {

        int n=10;
        for(int i=0;i<n;i++)
        {
            System.out.println("inside thread1"+i);
        }
    }
}