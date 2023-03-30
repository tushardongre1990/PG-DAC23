public class que28 
{
    public static void main(String[] args) 
    {
        double d1 = 455345.4554;

        String str = Double.toString(d1);
        System.out.println(str);

        Double d2 = new Double(d1);
        System.out.println(d2);

        System.out.println(Double.toHexString(d1));

        long doubleBits =Double.doubleToLongBits(d1);
        
        String doubleBiitsStr = Long.toBinaryString(doubleBits);
        System.out.println(doubleBiitsStr);

        String doubleBitsOct = Long.toOctalString(doubleBits);
        System.out.println(doubleBitsOct);

        String doubleBitsToHex = Double.toHexString(doubleBits);
        System.out.println(doubleBitsToHex);


        
    }
    
}
