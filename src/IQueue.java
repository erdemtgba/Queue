
public interface IQueue 
{
	void enqueue(Object item) throws QueueFull;
	Object peek() throws QueueEmpty;
	Object dequeue() throws QueueEmpty;
	boolean isEmpty();

}
