package week1day2Assignments;

public class Palindrome {
	public static void main(String[] args) {
		  int n=12321;
		  int s=0;
		  
		  for(int i=n;i>0;)
		  {
			  int r=i%10;
			  s=s*10+r;
			  i=i/10;
		  }
		  if (s==n)
		  {
			  System.out.println(n + "is a palindrome Number"); 
		  }
		  else
		  { 
			  
			System.out.println(n + "is not a palindrome Number");
			
		  }
			
		  }
	}

}
