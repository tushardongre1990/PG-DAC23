public class Palindrome
{
   static boolean isPal(String str)
   {
       // for a single character
	   if(str.length() <= 1) 
	      return true;
	   
	   if(str.charAt(0) != str.charAt(str.length()-1) )
	   {
	   return false;
	   }

	   	return isPal(str.substring(1, str.length()-1) );
   }
   
   public static void main(String args[])
   {
      boolean res = isPal("tushar");
	  System.out.println(res);
   }
}