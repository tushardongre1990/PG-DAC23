public class que8 {
    public static void main(String[] args) 
    {
    //  a. byte value into String
        // byte b1 = 127;

        // String byteToStr = String.valueOf(b1);
        // System.out.println(byteToStr);


//      b. byte value into Byte instance.
        // byte b2 = 55;

        // Byte byte2 = new Byte(b2);
        // System.out.println(byte2);


    // c. String instance into Byte instance.

    String strInstance = new String("125");
    Byte byteInstance = new Byte(strInstance);

    // System.out.println(byteInstance);

    System.out.println(Byte.parseByte(strInstance));





        
    }
}
