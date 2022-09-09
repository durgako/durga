package package1;

public class Second 
{
	
void meth1()
{
	System.out.println("this is second");
}
Second(){
	System.out.println("second constructor");
}
public static void main(String[] args) {
Second s=new Second();
s.meth1();
	
}
}
