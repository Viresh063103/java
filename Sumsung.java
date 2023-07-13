public class Sumsung{
	
	String mobileType;
	String processor;
	int price;
	
	Model model=Model.A30;
	Speaker speaker=Speaker.ONE;
	
	
	public Sumsung(String mobileType,String processor,int price){
		
		this.mobileType = mobileType;
		this.processor = processor;
		this.price = price;
		
	}
	
	
	public static void main(String[] args){
		
		Sumsung sum = new Sumsung("5G","Snapdragan-octacore",15000);
		System.out.println(sum.mobileType);
		System.out.println(sum.processor);
		System.out.println(sum.price);
		
		System.out.println(sum.model.getValue());
		System.out.println(sum.speaker.getValue());
	
	}
		
		
		
		public String getMobileType(){
		return this.mobileType ;
		}
		public String getProcessor(){
		return this.processor;
		}
		
		public int getPrice(){
		return this.price;
		}
		

}
enum Model{
	A30("a30"),F14("f14");
	String value;
	
	
	Model(String value){
	this.value = value;
	}
	
	public String getValue(){
	return this.value;
	}	
}

enum Speaker{
	ONE(1),TWO(2);
	int value;
	
	Speaker(int value){
	this.value = value;
	}
	public int getValue(){
		return this.value;
	}
}