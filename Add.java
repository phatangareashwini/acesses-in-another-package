package abc;
public class Add {
 
	int a = 100;
	int b = 50;
	public void addi() {
		int c ;
		c = a + b;
		System.out.println("addition: " +c);
		System.out.println("this is method for addition");
	}
	
	public void sub()
	{
		int c ;
		c = a-b;
		System.out.println("subtraction: " +c);
		System.out.println("this is method for subtraction");
	}
		public void mul()
		{
			int c ;
			c = a*b;
			System.out.println("multiplication:"+c);
			System.out.println("this is method for multiplication");
		
	    }
			public void div()
			{
				int c ;
				c = a-b;
				System.out.println("division:" +c);
				System.out.println("this is method for division");
			}
		   
			public void mod()
			{
				int c ;
				c = a%b;
				System.out.println("modulo:"+c);
				System.out.println("this is method for modulo");
			}
	       

	public static void main(String[] args) {
		Add a1 = new Add();
		a1.addi();
		//PQR p1 = new PQR();
		a1.sub();
		//LMN l1 = new LMN();
		a1.mul();
		//JKH j1 = new JKH();
		a1.div();
		//ASD s1= new ASD();
		a1.mod();
		}
	}

