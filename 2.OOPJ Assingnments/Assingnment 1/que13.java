public class que13 {
    public static void main(String[] args) 
    {
        short s1 = 1256;

        String str = String.valueOf(s1);
        System.out.println(str);

        Short s2 = new Short(s1);
        System.out.println(s2);

        String str2 = new String("123");

        Short sh1 = new Short(str2);
        System.out.println(sh1);

        
        
    }
}
