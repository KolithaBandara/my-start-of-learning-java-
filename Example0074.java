import java.util.*; 
class Example0074{
	public static  void main(String []args){
		Scanner input=new Scanner(System.in);

		long x=Long.MIN_VALUE;
		System.out.println(x); 
		String s1=Long.toBinaryString(x);
		System.out.println(s1); 
		System.out.println(s1.length());  //size/ no of bits

		x=-1;
		s1=Long.toBinaryString(x);
		System.out.println(s1); 
		System.out.println(s1.length());  //size/ no of bits
	}

}
