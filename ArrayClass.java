import java.util.*;
public class ArrayClass{
	public static void main(String[] args){
		int[] rollNo={10,4,32,23,19};
		
		char[] vowels={'a','e','i','o','u'};
		for(int i=0;i<vowels.length;i++){
			System.out.println(vowels[i]);
			
		}
		vowels[2]='a';
		for(int i=0;i<vowels.length;i++){
			System.out.println(vowels[i]);
			
		}
		int[] numbers=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<numbers.length;i++){
			
			numbers[i]=sc.nextInt();
			
		}
		for(int i=0;i<numbers.length;i++){
			System.out.println(numbers[i]);
			
		}
		
		
	}
}

