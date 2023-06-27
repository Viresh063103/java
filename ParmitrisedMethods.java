import java.util.*;
public class ParmitrisedMethods{
	public static void main(String args[]){
		int subValue=sub(10,4);
		boolean passValue=checkPassword("viresh");
		int addedResult=add(3,5);
		boolean checkOdd=isOdd(5);
		boolean checkEven=isEven(5);
		float divValue=div(29,10);
		float mulValue=mul(29,10);
		String result=checkGender('M');
		boolean numberCheck=isPositiveNo(8);
		boolean numberCheckNegative=isNegativeNo(8);
	}
	public static int sub(int a,int b){
		int c;
		if(a>b){
			c=a-b;
			System.out.println(c);
			return c;
		}
			else{
			c=b-a;
			System.out.println(c);
			return c;
		}
	
	}
	public static boolean checkPassword(String pass){
		if(pass.length()>=8){
			
			System.out.println("Correct password");
			return true;
		}
		else{
			System.out.println("wrong password");
			return false;
		}
		
	}
	public static int add(int a,int b){
		int c=a+b;
		if(c>0){
			
			System.out.println(c);
			return c;
		}
		else{
			
			return 0;
		}
		
	}
	public static boolean isOdd( int c){
		if(c%2==0){
			
			System.out.println("not odd");
			return false;
		}
		else{
			
			return true;
		}
		
	}
	public static boolean isEven( int c){
		if(c%2==0){
			
			System.out.println("Even");
			return true;
		}
		else{
			
			return false;
		}
		
	}
	public static float div( int c, int a){
		
		if(a==0){
			return 0;
		}
		else{
			
			return c/a;
		}
		
	}
	
	 
	public static float mul( int c, int a){
		
		if(a==0 && c==0){
			return 0;
		}
		else{
			
			return c*a;
		}
		
	}
	public static String checkGender( char c){
		String a="male";
		String b="female";
		String d="NA";
		if(c=='M'){
			return a;
		}
		else if(c=='F'){
			
			return b;
		}
        else{
			return d;
		}
		
	}
	public static boolean isPositiveNo( int c){
		
		if(c>0){
			return true;
		}
		else{
			
			return false;
		}
		
	}
	public static boolean isNegativeNo( int c){
		
		if(c>0){
			return false;
		}
		else{
			
			return true;
		}
		
	}
}