public class Stack {
    


    private int[] array;
    private int stacktop;
    Object lock=new Object();
    public Stack(int capacity)
    {
        array=new int[capacity];
        stacktop=-1;
    }
   

    public boolean isEmpty()
    {
        return stacktop<0;
    }
    public boolean isFull()
    {
        return stacktop>=array.length-1;
    }
    public  synchronized boolean push(int value)
    {
            ///here this is used as a lock
            //this instance of the current object is being used as a lock
        // synchronized(lock)
        {
            if(isFull())
        {
            return false;
        }
        ++stacktop;
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        array[stacktop]=value;
        return true;
        }
        
    }

    public synchronized int pop()
    {   


        // synchronized(lock)
        {
        if(isEmpty())
        {
            return Integer.MIN_VALUE;
        }
        int obj=array[stacktop];
        array[stacktop]=Integer.MIN_VALUE;
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        stacktop--;
        return obj;
    }
}

}
