public class SumTest
{
   public static int getSum(int num)
   {
     if(num == 0)
	   return 0;
	 return num + getSum(num - 1);
   }
   
   public static void main(String args[])
   {
     System.out.println(getSum(10));
   }
}