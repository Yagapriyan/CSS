package positive;

//Basic java programs

public class Force 
{
	//Printing my name 10 times and counting it
	int count=0;
	void method()
	{
	 long Ab=10;
	 for(long i=0;i<Ab;i++)
	 {
		 System.out.println("Yagapriyan");
		 count++;
	 }
	 System.out.println(count);
    }
	
	
	//With temp number swapping
	void method1()
	{
		int A = 10;
		int B = 20;
		int C;
		
		C=B;
		B=A;
		A=C;
		System.out.println("Value of A and B is "+A+" "+B);			
	}
	
	//Without temp number swap
	void method2() 
	{ 
		int A = 20;
		int B = 10;
		B=A+B;
		A=B-A;
		B=B-A;
		
		System.out.println("Number swapping of A and B  without temp : "+A+" "+B);
	}
	
	//Ternary operator using
	int Method3()
	{
		int A = 25;
		int B = 30;
		int C = (A>B)?(A):(B);
		System.out.println("The greater number is : "+C);
		return C;
	}
	
	
	//Nested if else with EB bill calculation (Amount assumed) 
	void Method4()
	{
		int unit=100;
		
		if(unit<500)
		{
			if(unit>400 && unit<500)
			{
				System.out.println("Kindly pay the amount :"+(unit-100)*4);
			}
			else if(unit<400 && unit>200)
			{
				System.out.println("Kindly pay the amount : "+(unit-100)*3);
			}
			else if(unit>100 && unit<200)
			{
				System.out.println("Kindly pay the amount : "+(unit-100)*2);
			}
			else
			{
				System.out.println("Absolutely free for you :)");
			}
		}
		
		else
		{
			if(unit>500 && unit<600)
			{
				System.out.println("Kindly the pay the amount : "+unit*5);
			}
			else if (unit>600 && unit<1000)
			{
				System.out.println("Kindly pay the amount : "+unit*8);
			}
			else
			{
				System.out.println("Kindly pay the amount : "+unit*10);
	
			}
		}
		
	}
	
	
	//Swithcase - number guessing game within 3 
	void Method5()
	{
		int a =5;
		switch (a)
		{
		case 1:
		 {
		System.out.println("You've given number 1 :)");	
		 break;
		 }
		case 2 :
		{
			System.out.println("You've given number 2 :)");
			break;
			
		}
		case 3 :
		{
			System.out.println("You've given number 3 :)");
			break;
		}
		default:
		 { 
			System.out.println("Kindly enter correct number");
			break;
		 }
		}
	}


	
	int Method6()
	{//DO-While loop with return type method
	 int A=10;
	 int B=20;
	 int C ;
	 int count=0;
	 do
	  {
		System.out.println(C=A+B);
		count++;
		
	  }
	 while(count<=5);
	 return C;
	}
	
	
	
 public static void main(String[] args) 
  {
	Force obj = new Force();
	obj.method();
	obj.method1();
	obj.method2();
    obj.Method3();
	obj.Method4();
	obj.Method5();
	obj.Method6();
  }
}

