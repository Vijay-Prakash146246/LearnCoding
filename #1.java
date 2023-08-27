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
//operator overloading
class Testa
{
	int a = 20;
	static int temp=98;
	int b;
	static int z;
	public static void main(String[]args)
	{
		//int x;
		System.out.println(10+12);
		System.out.println("Vision"+12);
		System.out.println(temp);
		Testa t = new Testa();
		System.out.println(t.a);
		t.ma();
		System.out.println(t.b);
		System.out.println(Testa.z);
		//variable x might not have been initialized
		//	System.out.println(x);
	}
	void ma()
	{
		System.out.println(a); 
		System.out.println(Testa.temp);
	}
}
class Z1
{
	String name;
}
class A1
{
	int a=10;
	static int b=20;
	static void m2()
	{
		System.out.println("M2 method ");
	}
	A1 m1(Z1 z)
	{
		System.out.println("m1 method");
		return this ;
	}
	public static void main(String[]args)
	{
		A1 a1 = new A1();
		System.out.println(a1.a);
		System.out.println(a1.b);
		a1.a=100;
		a1.b=200;
		System.out.println(a1.a);
		System.out.println(a1.b);
		A1 a2 = new A1();
		System.out.println(a2.a);
		System.out.println(a2.b);
		a2.b=2000;
		A1 a3 = new A1();
		System.out.println(a3.a);
		System.out.println(a3.b);
		//System.out.println(A1.	m2());
		//error: 'void' type not allowed here

		Z1 z = new Z1();
		z.name="Niraj";
		A1 a = a3.m1(z);
	System.out.println("return value="+a);
	System.out.println("return value="+z.name);
	}
	}

	//Operators in java page no 84