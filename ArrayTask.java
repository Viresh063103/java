class ArrayTask{
  public static void main(String args[]){
	  
	int[] number = {10,15,20,30,40};
	for(int i=0; i<5;i++){
		System.out.println(number[i]);
	}
	int[] evenNo = {2,4,6,8,10};
	for(int i=0; i<5;i++){
		System.out.println(evenNo[i]);
	}
	int[] oddNumbers = {1,3,5,7,9,11};
	
	
	int[] departmentId = {100,101,102,103,104};
	System.out.println(departmentId[3]);
	
	int[] roomNumber = {200,201,203,204,205};
	System.out.println(roomNumber[0]);
	
	char[] myName= {'v','i','r','e','s','h'};
	
	System.out.println(myName[4]);
	
	char[] vowels = {'a','e','i','o','u'};
	System.out.println(vowels[2]);
	
	char[] bloodGroup = {'a','b'};
	System.out.println(bloodGroup[1]);
	
	char[] alphabates = {'b','c','d','e','f','g'};
	System.out.println(alphabates[2]);
	
	char[] name = {'a','k','a','s','h'};
	System.out.println(name[4]);
	
	float[] cgpaOfStudent = new float[5];
	cgpaOfStudent[14] = 8.6f;
	
	float[] roomTemperature = new float[6];
	roomTemperature[14] = 25.6f;
	
	int[] rollNo = new int[5];
	rollNo[5] = 10;
	for(int i=0;i<10;i++){
		System.out.println(rollNo[i]);
	}
	int[] roadNo = new int[5];
	roadNo[0] = 9;
	roadNo[1] = 5;
	roadNo[2] = 4;
	roadNo[3] = 6;
	roadNo[4] = 8;
	for(int i=0;i>roadNo.length;i++){
		System.out.println(roadNo[i]);
	}
	char[] englishVowels = new char[5];
	englishVowels[3] = 'o';
	
	
	char[] englishAlphabate = new char[6];
	englishAlphabate[0] = 'a';
	englishAlphabate[1] = 'b';
	englishAlphabate[2] = 'c';
	englishAlphabate[3] = 'd';
	englishAlphabate[4] = 'e';
	englishAlphabate[5] = 'f';
	
	for(int i=5;i>=0;i--){
		System.out.println(englishAlphabate[i]);
	}
	
	long[] constantValues = new long[3];
	constantValues[2] = 356588888l;
	
	long[] population = new long[5];
	population[1] = 14200000;
	
	byte[] rackNo = new byte[10];
	rackNo[9] = 10;
	
	byte[] crossNo = new byte[12];
	crossNo[5] = 6;
  }
  
}