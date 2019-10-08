package hoca;
class Student implements Comparable<Student>
{ 
    private String name; 
    private double cgpa; 
  
    public Student(String name, double cgpa) { 
      
        this.name = name; 
        this.cgpa = cgpa; 
    } 
      
    public String getName() { 
        return name; 
    }

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	public void setName(String name) {
		this.name = name;
	}
	
    @Override
	public String toString() {
		return "Student [name=" + name + ", cgpa=" + cgpa + "]";
	}  

	
	@Override
	public int compareTo(Student theOther) {
			
		   if (this.cgpa == theOther.cgpa)
		     return 0;
		   else if (this.cgpa > theOther.cgpa)
		     return 1;
		   else
		     return -1;
		   
		}
} 