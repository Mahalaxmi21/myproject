package arrayprograms;

class Stud{
	String Name;
	int Rollno;
	
	Stud(String name ,int rollno) {
		this.Name=name;
		this.Rollno=rollno;
		
	}
}
public class Student{
	
	public static void main(String[] args) {
		Stud[] arr;
		arr = new Stud[5];
		
		arr[0]=new Stud("Laxmi",101);
		arr[1]=new Stud("Pooja",105);
		arr[2]=new Stud("Arush",104);
		arr[3]=new Stud("Shruti",106);
		arr[4]=new Stud("Priya",102);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Student Name is a "+arr[i].Name+ " and Roll Number is : "+arr[i].Rollno);
		}
		
		
	}

}
