class Example0058{
	public static  void main(String []args){
		int x=10,y=20,z=30;    //declaring, initializing same data type variables in single line
		System.out.println("x+y+z"); //x+y+z
		System.out.println("x+y"+"z"); //x+yz
		System.out.println("x"+"y+z"); //xy+z
		System.out.println("x"+"y"+"z"); //xyz
		System.out.println("x"+"y"+z); //xy30
		System.out.println(x+"y"+"z"); //10yz
		System.out.println("x"+y+"z"); //x20z
		System.out.println("x+y"+z); //x+y30
		System.out.println(x+"y+z"); //10y+z
		System.out.println("x"+y+z); //x2030
		System.out.println(x+"y"+z); //10y30
		System.out.println(x+y+"z"); //30z
		System.out.println(x+y+z); //60
	} 
}

