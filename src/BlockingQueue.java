
import java.util.Queue;
import java.util.LinkedList;
public class BlockingQueue {
    


        private Queue<Integer> q;
        private int capacity;

        public BlockingQueue(int capacity) {
            q=new LinkedList<>();
            this.capacity = capacity;
            
        }

        public boolean add(int data)
        {
            synchronized(q)
            {
                if(q.size()==capacity)
                {
                    return false;
                }
                q.add(data);
                return true;
            }
        }

        public int remove()
        {
            synchronized(q)
            {
                if(q.isEmpty())
                {
                    return -1;
                }
                int ele=q.poll();
                return ele;
            }
        }


}
