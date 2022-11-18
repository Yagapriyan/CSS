class Jumble
{
 void method(int a)
 {
  int ar[]= {1,2,3,3,4,5,5,8,8,1,1,6,6};
  int br[]=new int[ar.length];
 
  for (int i = 0; i < ar.length; i++) 
   {
	  int count=0;
 
    	for (int j = i; j < ar.length; j++) 
         {	 
	 	  if(ar[i]==ar[j])
		  {
		   	count++;
		  }
	     }//for 2
	  if(count<=1)
	  {
	   br[i]=ar[i];
	   System.out.println(br[i]);
	  }
  }//close for 1
 }

 void method(String aa,String bb)
 {
        //Anagram
		boolean status = false;
		
		String A = aa;
		String B = bb;
		
		String AA= A.replaceAll("//s", "");
        String BB=B.replaceAll("//s", "");
        if(AA.length()!=BB.length())
        {
        	status=false;
        }
        else
        {
        char[] AAA=AA.toLowerCase().toCharArray();
        char[] BBB=BB.toLowerCase().toCharArray();
        
        Arrays.sort(AAA);
        Arrays.sort(BBB);
        status=Arrays.equals(AAA, BBB);
        }
       
        if(status)
        {
        	System.out.println("anagram");
        }
        else
        {
        	System.out.println("not an anagram");
        }
 }

 void method(int g,int h)
 {
        String A ="yaga";
		String B="happy";
		String C=A+B;
		A=C.substring(A.length());
		B=C.substring(0,C.length()-B.length());
	    System.out.println(A+" "+B);

 }

 public static void main (String args[])
 {
  Jumble obj = new Jumble();
  obj.method(1);
  obj.method(1,2);
  obj.method("Parent","Rent pa");
 }

}
 
