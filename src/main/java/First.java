import java.util.Scanner;

public class First 
{
	static  int n=0;
	Scanner sc=new Scanner(System.in);

	void family() {
		Scanner sc=new Scanner(System.in);
		
		 int a,b,n;
		 System.out.println("enter no of adults:");
		 a=sc.nextInt();
		 System.out.println("enter no of child");
		 b=sc.nextInt();
		 
	 if(a<=b&&b<a)
		 {
		 n=a/2;
	         System.out.println("no.of rooms:"+n);
			System.out.println(" normal charges applied:"); 
		 }
else if(a>=b&&b>a) {
	n=b/2;
	System.out.println(" no.of rooms:"+(n+1));
	System.out.println(" another room will be given");
}
else {
	System.out.println();
}

	}
	
	
		public	void room1()
		{	
			String type1="ac";
			String type2="non ac";
			System.out.println("enter room type");
			Scanner sc=new Scanner(System.in);
			String type=sc.nextLine();
		
		if(type.equals(type1))
		{
			 int price=3000;
			//this.n=n;
			 System.out.println("price:"+(price));
			 
		}

		else if(type.equals(type2
				))
		{
			int price=2500;
			//this.n=n;
			System.out.println("price:"+(price));
			
			
		}
		}
	
		public void room2()
		{
			

			
		String type1="ac";
		String type2="non ac";
		System.out.println("enter room type");
		Scanner sc=new Scanner(System.in);
		String type=sc.nextLine();
		
		if(type.equals(type1))
		{
			 int price=3000;
			// this.n=n;
			 System.out.println("price:"+(price));
			 
		}

		else if(type.equals(type2))
		{
			int price=2500;
//	this.n=n;
			System.out.println("price:"+(price
					));
			
		}
		}
		
		
		
void meth1()
{
	

	System.out.println("enter  hotel name:");
	System.out.println("please choose hotel 1 or hotel 2");
	
	int name=sc.nextInt();
	switch(name)
	{
	case 1:
		{
			System.out.println("you choosed hotel 1");
		family();
			
		room1();
	   break;
		}
	case 2:
		{
			System.out.println("you choosed hotel 2");
		    family();
		    
	     	room2();
		break;
		}
	}
	}
	


public static void main(String[] args)
{
  First f=new First();
  f.meth1();
}
}


