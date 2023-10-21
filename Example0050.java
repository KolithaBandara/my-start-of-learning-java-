class Example0050{
	public static  void main(String []args){
		int x,y,z; //declaring same type variables in a single line
		x=100; //initializing
		y=200; //initializing
		z=300; //initializing
		System.out.println(x);//100
		System.out.println(y);//200
		System.out.println(z);//300

		int y=400; //Illegal 
    /*  variable y is already define in main method.
          So this is a Compile Error  */
    
		System.out.println(z);//400
	} 
}
