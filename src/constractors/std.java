package constractors;

public class std {
	String Name;
	int id;
	long phonenumber;
	
	std(String A,int i,long ph){
		Name=A;
		id=i;
		phonenumber=ph;
	}

	public static void main(String[] args) {
		//Constructors parameter
	
		
		std s1 = new std("pooja",101,396325874);
		System.out.println(s1.Name+" "+s1.id+" "+s1.phonenumber);
		
		std s2 = new std("Mahalaxmi",102,369852147);
		System.out.println(s2.Name+" "+s2.id+" "+s2.phonenumber);
		
		std s3 = new std("Madhu",103,478963125);
		System.out.println(s3.Name+" "+s3.id+" "+s3.phonenumber);

	}

}
