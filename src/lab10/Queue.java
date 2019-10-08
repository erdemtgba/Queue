package lab10;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue implements IQueue{

	//bu bir interface nesnesi yaratýlamayacak
	private java.util.Queue contents;
	
	public Queue(){
		//hiç parametre almazsa normal kuyruk yarattým
		contents=new LinkedList();
	}
	
	//karþýlaþtýrma nesnesi alýr
	//bu bir interfacedir
	//Comparator nesnesine göre onun içerisindeki 
	//compare methoduna göre priority kuyruk olur
	//Comparatorun comparable a göre önceliði var
	public Queue(Comparator comp){
		//compare göre karþýlaþtýrcak
		contents=new PriorityQueue(comp);
	}
	
	public Queue(boolean isPriority){
		
		if(isPriority){
			//bunu yazýyorsam y ani param yoksa compareTo ile karþýlaþtýrma yapacaktýr
			//comparator göndermediysen compareTo ya göre karþýlaþtýrma yapacaktýr.
			//compareTo methoduna göre karþýlaþtýracak
			contents=new PriorityQueue();
		}
		else{
			contents=new LinkedList();
		}
	}
	
	@Override
	public void enqueue(Object data) {
		
		//kuyruðun tipine göre çalýþma anýnda override edilerek ekleme yapýlýr
		contents.add(data);
		//priority ise çalýþma anýnda yapýlacak karþýlaþtýrmaya göre ekleyecektir
	}

	@Override
	public Object dequeue() throws QueueEmpty {
		if(isEmpty()) new QueueEmpty();
		
		//contents zaten kuyruk olduðu için kendi peek methodundan yararlandýk
		Object retVal=contents.peek();
		//eðer boþsa kendi removeundaki exceptioný döndürebiliyor
		contents.remove();
		return retVal;
	}

	@Override
	public Object peek() throws QueueEmpty {
		if(isEmpty()) new QueueEmpty();
		
		return contents.peek();
	}

	@Override
	public boolean isEmpty() {
		return contents.size() == 0;
	}

	@Override
	public String toString() {
		int size=contents.size();
		String retString;
		
		return "Queue [contents=" + contents + "]";
	}
	
	
	
}
