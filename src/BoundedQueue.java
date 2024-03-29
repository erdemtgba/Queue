
public class BoundedQueue implements IQueue 
{

	private int front;
	private int rear;
	private Object[] contents;
	
	public BoundedQueue(int cap)
	{
		front = rear = 0;
		contents = new Object[cap];
	}
	
	@Override
	public void enqueue(Object item) throws QueueFull 
	{
		if(isFull()) throw new QueueFull();

		contents[rear] = item;
		rear = (rear + 1) % contents.length;
	}

	@Override
	public Object peek() throws QueueEmpty {
		
		if(isEmpty()) throw new QueueEmpty();
		
		return contents[front];
	}

	@Override
	public Object dequeue() throws QueueEmpty {

        if(isEmpty()) throw new QueueEmpty();
		
		Object retVal = contents[front];
		contents[front] = null;
		front = (front + 1) % contents.length;
		
		return retVal;
	}

	@Override
	public boolean isEmpty() {
		
		return rear == front;
	}
	
	public boolean isFull() {
		// TODO Auto-generated method stub
		return front == (rear + 1) % contents.length;
	}

	@Override
	public String toString() 
	{
		int size = (rear - front + contents.length) % contents.length;
		
		String retString = "<" + size + ">\n<front:\n";
		
		for(int i = front; i != rear; i = (i+1)%contents.length)
		{
			retString += contents[i] + "\n";
		}
		
		retString += " :rear>";
		
		return retString;
	}
	
	

}
