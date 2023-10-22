import java.util.*; 
class Example0077{
	public static  void main(String []args){
		byte b=100;
		short s;
		s=b; //Legal, 
		System.out.println(s+" : "+b); //100 100

		b=127;
		s=b; //Legal, 
		System.out.println(s+" : "+b); //127 127

		b=128;
		s=b; //Legal, 
		System.out.println(s+" : "+b); //128 128

	}

}
