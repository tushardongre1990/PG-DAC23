public class Mult
{

   static void printTable(int num, int from)
   {
	   if(from > 10) return;
	   System.out.println(num+ " x " + from + " = " + num * from);
	   printTable(num, from + 1);
	   
   }
   public static void main(String args[])
   {
      printTable(5,1);
	  System.out.println("_______________________________________________");
      printTable(8,1);
	  
   }
}