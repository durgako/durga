import java.util.Scanner;

public class ClassC
{
	public void meth1()
	{
Scanner sc= new Scanner (System.in);
int a,b;
int count=0;
a=sc.nextInt();
b=sc.nextInt();
for(int i=a;i<=b;i++)
{
	if(i%3==0)
	{
		//System.out.println(i+" ,");
		count++;
	}
	else if(i%4==0)
	{
		//System.out.println(i+",");
		count++;
	}
	else if(i%5==0)
	{
		//System.out.println(i+",");
		count++;
	}
}

}
	public static void main(String[] args)
	{
		ClassC cobj=new ClassC();
		cobj.meth1();
		}
}
