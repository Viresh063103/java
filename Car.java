public class Car{
	public static void main(String[] args){
		int value = area(10);      //calling method with int value1
		System.out.println(value);       
		int area = area(10 , 20);  //calling method with int value1 , int value2
		System.out.println(area);
		int area1 = area(10 , (byte)30);  //calling method with int value1 , byte value2
		System.out.println(area1);
		int area2 = area((byte)10 , (byte)30);  //calling method with byte value1,byte value2
		System.out.println(area2);
		int area3 = area((short)10 , 4.8d);  //calling method with short value1,double value2
		System.out.println(area3);
		int area4 = area(3.5d , (short)30);  //calling method with double value1,short value2
		System.out.println(area4);
		float report = weatherReport(10,50);  //calling method with int n1, int n2
		System.out.println(report);
		float report1 = weatherReport(10,50,20);  //calling method with int n1, int n2, int n3
		System.out.println(report1);
		float report2 = weatherReport(10,5.0f);  //calling method with int n1, float n2
		System.out.println(report2);
		float report3 = weatherReport(1.0f,5.0f);  //calling method with float n1, float n2
		System.out.println(report3);
		float report4 = weatherReport((short)10,5.0d);  //calling method with short n1, double n2
		System.out.println(report4);
		float report5= weatherReport(1.0d,(short)50);  //calling method with double n1, short n2
		System.out.println(report5);
		float result = getSomthing(3,4);  //calling method with int value1, int value2
		System.out.println(result);
		float result1 = getSomthing(3,4,6);  //calling method with int value1, int value2, int g3
		System.out.println(result1);
		float result2 = getSomthing(3,4.8f);  //calling method with int value1, float value2
		System.out.println(result2);
		float result3 = getSomthing(3.3f,4.4f);  //calling method with float value1, float value2
		System.out.println(result3);
		float result4 = getSomthing((short)3,4.76d);  //calling method with short value1, double value2
		System.out.println(result4);
		float result5 = getSomthing(3.78d,(short)4);  //calling method with double value1, short value2
		System.out.println(result5);
	}
	public static int area(int value1){
		return value1;
	}
	public static int area(int value1 , int value2){
		
		return value1*value2;
	}
	public static int area(int value1 , byte value2){
		return value1-value2;
	}
	public static int area(byte value1 , byte value2){
		return value1*value2;
	}
	public static int area(short value1 , double value2){
		return value1;
	}
	public static int area(double value1 , short value2){
		return value2;
	}
	public static float weatherReport(int n1 , int n2){
		
		return n1;
	}
	public static float weatherReport(int n1 , int n2 , int n3){
		return n1*n2;
	}
	public static float weatherReport(int n1 , float n2){
		return n1-n2;
	}
	public static float weatherReport(float n1 , float n2){
		return n1*n2;
	}
	public static float weatherReport(short n1 , double n2){
		return n1;
	}
	public static float weatherReport(double n1 , short n2){
		return n2;
	}
	public static float getSomthing(int value1 , int value2){
		return value1;
	}
	public static float getSomthing(int value1 , int value2 , int g3){
		return value1*value2;
	}
	public static float getSomthing(int value1 , float value2){
		return value1-value2;
	}
	public static float getSomthing(float value1 , float value2){
		return value1*value2;
	}
	public static float getSomthing(short value1 , double value2){
		return value1;
	}
	public static float getSomthing(double value1 , short value2){
		return value2;
	}
}