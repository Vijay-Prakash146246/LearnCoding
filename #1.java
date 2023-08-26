class  LearnAboutClass 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println("Hi Niraj \n This is my first program!!");
	}
}

class A
{
	float a = 12.5f;
	double d = 123.5;
	public static void main(String[] args) 
	{
		System.out.println("A World");
		 A a1 = new A();
		System.out.println(a1.a);
			System.out.println(a1.d);
	}
}

class B
{
	String s;
	public static void main(String[] args) 
	{
		String ename = "Vijay Prakash Singh";
		System.out.println("B\tWorld");
		System.out.println(ename);
		 B b = new B();
		System.out.println(b.s);
		int x = 123_345_2;
		System.out.println(x); //1233452
		double num =  13_432.98_4;
		System.out.println(num);//13432.984

	}
}

// #2 Java flow control Statements
class Test
{
	public static void main(String[]args)
	{
		int age = 20;
		if(age>22)
		{
			System.out.println("True if condition");
		}
		else
		{
			System.out.println("False if condition");
		}

		if(true)
		{
			System.out.println("True Boolean if condition");
		}
		else
		{
			System.out.println("False Boolean  if condition");
		}

		//if(0) //incompatible types: int cannot be converted to boolean
		int a =10;
		if(a==0)
		{
			System.out.println("True 0 body");
		}
		if(a==10)
		{
			System.out.println("True 10 body");
		}
	}
}


//Switch conditon 
class Test1 
{
	public static void main(String[]args)
	{
		int a=90;
		switch(a)
		{
			case 10:
				System.out.println("Vijay");
			break;
			case 20:
				System.out.println("Suman");
			break;
			default :
				System.out.println("Durga");
			break;
		}
	}
}


class Test2
{
	public static void main(String[]args)
	{
		int a=10;
		switch(a)
		{
			case 10:
				System.out.println("Vijay");
			case 20:
				System.out.println("Suman");
			break;
			default :
				System.out.println("Durga");
			break;
		}
	}
}


//for Loop iteration 
class Test3
{
	public static void main(String[]args)
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i+" iteration of code are working");
		}
	}
}

class Test4
{
	public static void main(String[]args)
	{
		int[]a={10,20,30,40};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(i+" Array element of given array "+a[i]);
		}
		System.out.println("\n---------------------------\n");
		for(int aa:a)
		{
			System.out.println(" Array1 element of given array "+aa);
		}

		for(int i=0;i<10;i++)
		{
			if(i==5)
				break;
			System.out.println(i);
		}
		System.out.println("\n---------------------------\n");
		for(int i=0;i<10;i++)
		{
			if(i==5)
				continue;
			System.out.println(i);
		}
	}
}


//#3 Java class concept