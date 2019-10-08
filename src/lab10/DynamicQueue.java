package lab10;

import java.util.ArrayList;
import java.util.List;

public class DynamicQueue implements IQueue {
	private List<Object> contents;
	
	
	public DynamicQueue(){
		contents=new ArrayList<Object>();
	}
	
	
	public void enqueue(Object data){
		contents.add(data);
	}
	
	public Object dequeue() throws QueueEmpty{
		if(isEmpty()) new QueueEmpty();
		
		Object retVal=contents.get(0);
		contents.remove(0);
		return retVal;
	}
	
	public Object peek() throws QueueEmpty{
		if(isEmpty()) new QueueEmpty();
		
		return contents.get(0);
	}


	@Override
	public boolean isEmpty() {
		return contents.size() == 0;
	}


	
	
	
}
