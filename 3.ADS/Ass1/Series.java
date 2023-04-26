public class Series
{
   static void series(int num)
   {
      if(num == 0) 
		  return ;
	  series(num -1);
	  System.out.println(num);
	  
   }
   public static void main(String [] args)
   {
      series(5);
   }
}