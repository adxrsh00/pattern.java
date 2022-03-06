// You are required to print a 'z' of size 5 using '*'.


public class Main
{
	public static void main(String[] args) {
           int i,j,c=3;

      for(i=1;i<=5;i++)
      {
          if(i==1||i==5)
          {
          System.out.println("*****");
        
          }
          else
          {
          for(j=1;j<=c;j++)
          {
              System.out.print(" ");
          }
          System.out.println("*");
          c--;
      }
      }
    }}
    
	
