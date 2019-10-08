package hoca;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Optional;
import java.util.PriorityQueue;

public class Queue implements IQueue//, Cloneable
{
    private java.util.Queue contents;
	
	public Queue(Comparator comp)
	{
		contents = new PriorityQueue(comp);
	}
	
	public Queue(boolean isPriority)
	{
		if(isPriority)
			contents = new PriorityQueue();
		else
			contents = new LinkedList();
	}
	
	public Queue()
	{
		contents = new LinkedList();
	}
	
	@Override
	public void enqueue(Object item)
	{
		contents.add(item);
	}

	@Override
	public Object peek() throws QueueEmpty {
		
		if(isEmpty()) throw new QueueEmpty();
		
		return contents.peek();
	}

	@Override
	public Object dequeue() throws QueueEmpty {

		if(isEmpty()) throw new QueueEmpty();
		
		return contents.poll();
	}

	@Override
	public boolean isEmpty() {
		
		return contents.size() == 0;
	}
	
/*
	public Object clone() throws CloneNotSupportedException 
    {  
          Test2 t = (Test2)super.clone(); 
          t.c = new Test(); 
          return t; 
    }
*/	
	@Override
	public String toString() 
	{
        int size = contents.size();
		
		String retString = "<" + size + ">\n<front:\n";
		
		String str = contents.getClass().getName();
		
		if(contents.getClass().getName().equals("java.util.LinkedList"))
		{
		    Object[] tempArr = contents.toArray();
		
		    for(int i = 0; i < size; i++)
		    {
		     	retString += tempArr[i] + "\n";
		    }
		}
		else
		{
			//java.util.Queue temp_pq = ((Cloneable)this.contents);
			
			PriorityQueue temp_pq = new PriorityQueue(contents);			
			while(!temp_pq.isEmpty()) 
			{
				retString += temp_pq.poll() + "\n";				
		    }
		}
		
		retString += " :rear>";
		
		return retString;
	}
	
}
