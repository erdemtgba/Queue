package lab10;

public interface IQueue {
	
	
	public void enqueue(Object data);
	
	public Object dequeue() throws QueueEmpty;
	public Object peek() throws QueueEmpty;
	
	public boolean isEmpty();
	
}
