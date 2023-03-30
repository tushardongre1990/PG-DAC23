public class que16
{
    public static void main(String[] args)
    {
//      a. int value into String
        int num = 255;
        String str = Integer.toString(num);
        System.out.println(str);
        String str2 = String.valueOf(num);
        System.out.println(str2);


//      b. int value into Integer instance.
        Integer i1 = new Integer(num);
        System.out.println(i1);

//        c. String instance into Integer instance.
        String str1 = new String("125");
        Integer i2 = new Integer(Integer.valueOf(str1));
        System.out.println(i2);

//        d. int value into binary, octal and hexadecimal string.

        int num2 = 45445;
        String strnum2 = Integer.toBinaryString(num2);
        System.out.println(strnum2);

        strnum2 = Integer.toOctalString(num2);
        System.out.println(strnum2);

        strnum2 = Integer.toHexString(num2);
        System.out.println(strnum2);













    }
}
