public class TypeOFConstructors{
	public static void main (String[] args){
	   TypeOFConstructors def=new TypeOFConstructors();
	   System.out.println("Using default constructor ");
		System.out.println(def.noOfCourses);
		System.out.println(def.bloodGroup);
		System.out.println(def.myName);
		System.out.println(def.cgpa);
		System.out.println(def.dataTypesInJava);
	    
		System.out.println("Using Parameterised constructor ");
		
		TypeOFConstructors par=new TypeOFConstructors(3,'A',"Viresh",7.6f,8);
		System.out.println(par.noOfCourses);
		System.out.println(par.bloodGroup);
		System.out.println(par.myName);
		System.out.println(par.cgpa);
		System.out.println(par.dataTypesInJava);
		
		
	}
	int noOfCourses;
	char bloodGroup;
	String myName;
	float cgpa;
	int dataTypesInJava;
	
	public TypeOFConstructors(){
		
	}
	public TypeOFConstructors( int noOfCourses1,char bloodGroup1,String myName1,float cgpa1,int dataTypesInJava1){
		noOfCourses=noOfCourses1;
		bloodGroup=bloodGroup1;
		myName=myName1;
		cgpa=cgpa1;
		dataTypesInJava=dataTypesInJava1;
		
	}
	
}