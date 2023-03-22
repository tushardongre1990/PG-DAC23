public class ass7_printWithoutLoop
{
    static void count(int num)
    {
        if(num <= 10) {
            System.out.print(num + " ");
            count(++num);
        }


    }
    public static void main(String[] args)
    {

       count(1);

    }
}
