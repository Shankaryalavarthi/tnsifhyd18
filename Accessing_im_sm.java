package abc;

public class Accessing_im_sm {
	
	int a=5;
	static int b=10;
	void display()
	{
		System.out.println("instance method content");
	}
	static String display1()
	{
		return "static method content";
	}

	public static void main(String[] args) {
		
		 Accessing_im_sm a1=new  Accessing_im_sm();
		 System.out.println("accessing instance variable"+" "+a1.a);
		 System.out.println("accessing static variable"+" "+Accessing_im_sm.b);
		 a1.display();
		 System.out.println(Accessing_im_sm.display1());
		 
		 
		

	}

}
