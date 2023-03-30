public class que20
{
    public static void main(String[] args)
    {
//      a. long value into String
        long l1 = 9223372036854775807l;
        System.out.println(String.valueOf(l1));

//      b. long value into Long instance.
        Long l2 = new Long(l1);
        System.out.println(l2);

//      c. String instance into Long instance.

//        String str = new String("9224822036854775807");
//        Long l3 = new Long(Long.parseLong(str));
//        System.out.println(l3);

//        d. long value into binary, octal and hexadecimal string.

        System.out.println(Long.toBinaryString(l1));
        System.out.println(Long.toOctalString(l1));
        System.out.println(Long.toHexString(l1));




    }
}
