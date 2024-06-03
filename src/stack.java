public class Stack {
    


    private int[] array;
    private int stacktop;
    public Stack(int capacity)
    {
        array=new int[capacity];
        stacktop=-1;
    }

    public boolean isEmpty()
    {
        return stacktop==-1;
    }
    public boolean isFull()
    {
        return stacktop>=array.length-1;
    }
    public boolean push(int value)
    {
        if(isFull())
        {
            return false;
        }
        stacktop++;
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

    public int pop()
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
