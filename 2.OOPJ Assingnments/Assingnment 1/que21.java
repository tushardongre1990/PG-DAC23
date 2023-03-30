public class que21
{
    public static void main(String[] args)
    {
        // long l1 = 123456789l;

        Long l1 = new Long(123456789l);

        byte b1 = l1.byteValue();
        System.out.println(b1);

        short s1 = l1.shortValue();
        int i1 = l1.intValue();
        long l2 = l1.longValue();
        float f1 = l1.floatValue();
        double d1 = l1.doubleValue();

        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l2);
        System.out.println(f1);
        System.out.println(d1);

    }
}
