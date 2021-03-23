package R177219046;
interface Info 
{
	void division(int a);
	void modules(String s,String c);
}
class Person implements Info
{
	int age;
	String name,sport,college;
	public void division(int a)
	{
		age=a;
	}
	public void modules(String s,String c)
	{
		sport=s;
		college=c;
	}
	void name(String n)
	{
		name=n;
	}
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("College : "+college);
		System.out.println("Favourite Sport : "+sport);
	}
	}
