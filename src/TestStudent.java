
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;


public class TestStudent {

	public static void main(String[] args) throws QueueEmpty 
	{
		Scanner in = new Scanner(System.in); 


		       Queue pq = new Queue(new StudentComparator());
               //Queue pq = new Queue(true);   
		       //Queue pq = new Queue(false);
        	   //Queue pq = new Queue();
		
                Student student1 = new Student("Nandini", 2); 
                pq.enqueue(student1); 
                
                Student student2 = new Student("Anmol", 3); 
                pq.enqueue(student2);          
                
                Student student3 = new Student("Palak", 4); 
                pq.enqueue(student3); 
                       
                Student student4 = new Student("Bulak", 1); 
                pq.enqueue(student4);     
                                
                Student student5 = new Student("Sema", 5); 
                pq.enqueue(student5); 
                        
                Student student6 = new Student("Davut", 7); 
                pq.enqueue(student6); 
                        
                Student student7 = new Student("Güneþ", 6); 
                pq.enqueue(student7);  
                        
                System.out.println("Students served in their priority order"); 
                System.out.println(pq.toString());                   

	}
}
	 

