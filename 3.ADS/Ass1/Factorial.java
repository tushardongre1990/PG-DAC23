public class Factorial
{
   static long fact(int num)
   {
      if(num == 0)
	    return 1;
	  long res = num * fact(num -1);
	  return res;
   }
   public static void main(String args[])
   {
      System.out.println(fact(50));
   }
}