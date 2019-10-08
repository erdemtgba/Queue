package lab10;

//ben ba�ka bir nesneye kar��la�t�rma �zelli�ine sahibim
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
	
	//bu da tam tersi olsun diye b�yle yapt�k
	//OOP daha iyi �rt��en budur
	@Override
	public int compareTo(Student o) {
		if(this.cgpa==o.cgpa)
			return 0;
		else if(this.cgpa> o.cgpa)
			return 1;
		return -1;
	}
	
	
}
