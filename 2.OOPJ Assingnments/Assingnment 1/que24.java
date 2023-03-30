public class que24 {
    public static void main(String[] args) 
    {
        float f1 = 705.1996f;

        String floatToStr = Float.toString(f1);
        System.out.println(floatToStr);
        System.out.println(Float.valueOf(f1));

        String str = new String("125.25f");
        Float fltIns = new Float(str);
        System.out.println(fltIns);

       String str2 = Float.toHexString(f1);
       System.out.println(str2);
        
    }
}
