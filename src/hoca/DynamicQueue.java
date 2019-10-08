package hoca;
import java.util.ArrayList;
import java.util.List;

public class DynamicQueue implements IQueue 
{
	private List contents;
	
	public DynamicQueue()
	{
		contents = new ArrayList();
	}
	
	@Override
	public void enqueue(Object item)
	{
		contents.add(item);
	}

	@Override
	public Object peek() throws QueueEmpty {
		
		return contents.get(0);
	}

	@Override
	public Object dequeue() throws QueueEmpty {

		Object retVal = contents.get(0);
		contents.remove(0);
		
		return retVal;
	}

	@Override
	public boolean isEmpty() {
		
		return contents.size() == 0;
	}
	

	@Override
	public String toString() 
	{
		int size = contents.size();
		
		String retString = "<" + size + ">\n<front:\n";
		
		for(int i = 0; i < size; i++)
		{
			retString += contents.get(i) + "\n";
		}
		
		retString += " :rear>";
		
		return retString;
	}

}
