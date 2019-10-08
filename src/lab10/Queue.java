package lab10;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue implements IQueue{

	//bu bir interface nesnesi yarat�lamayacak
	private java.util.Queue contents;
	
	public Queue(){
		//hi� parametre almazsa normal kuyruk yaratt�m
		contents=new LinkedList();
	}
	
	//kar��la�t�rma nesnesi al�r
	//bu bir interfacedir
	//Comparator nesnesine g�re onun i�erisindeki 
	//compare methoduna g�re priority kuyruk olur
	//Comparatorun comparable a g�re �nceli�i var
	public Queue(Comparator comp){
		//compare g�re kar��la�t�rcak
		contents=new PriorityQueue(comp);
	}
	
	public Queue(boolean isPriority){
		
		if(isPriority){
			//bunu yaz�yorsam y ani param yoksa compareTo ile kar��la�t�rma yapacakt�r
			//comparator g�ndermediysen compareTo ya g�re kar��la�t�rma yapacakt�r.
			//compareTo methoduna g�re kar��la�t�racak
			contents=new PriorityQueue();
		}
		else{
			contents=new LinkedList();
		}
	}
	
	@Override
	public void enqueue(Object data) {
		
		//kuyru�un tipine g�re �al��ma an�nda override edilerek ekleme yap�l�r
		contents.add(data);
		//priority ise �al��ma an�nda yap�lacak kar��la�t�rmaya g�re ekleyecektir
	}

	@Override
	public Object dequeue() throws QueueEmpty {
		if(isEmpty()) new QueueEmpty();
		
		//contents zaten kuyruk oldu�u i�in kendi peek methodundan yararland�k
		Object retVal=contents.peek();
		//e�er bo�sa kendi removeundaki exception� d�nd�rebiliyor
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
