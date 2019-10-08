package lab10;

//ben baþka bir nesneye karþýlaþtýrma özelliðine sahibim
public class Student implements Comparable<Student>{
	
	private String name;
	private double cgpa;
	
	
	public Student(String name, double cgpa) {
		this.name = name;
		this.cgpa = cgpa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", cgpa=" + cgpa + "]";
	}
	
	//bu da tam tersi olsun diye böyle yaptýk
	//OOP daha iyi örtüþen budur
	@Override
	public int compareTo(Student o) {
		if(this.cgpa==o.cgpa)
			return 0;
		else if(this.cgpa> o.cgpa)
			return 1;
		return -1;
	}
	
	
}
