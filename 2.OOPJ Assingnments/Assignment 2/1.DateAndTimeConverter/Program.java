import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


class DateFormatConverter{
    private int day;
    private int month;
    private int year;
    private int hour;
    private int min;
    private int sec;


    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public int getSec() {
        return sec;
    }
    public void setSec(int sec) {
        this.sec = sec;
    }


    
}

class DateTest{
    DateFormatConverter d1 = new DateFormatConverter();
    static Scanner sc = new Scanner(System.in);

    public void acceptRecord(){

    
        System.out.print("Enter day: ");
        d1.setDay(sc.nextInt());
        

        System.out.print("Enter month: ");
        d1.setMonth(sc.nextInt());
        

        System.out.print("Enter year: ");
        d1.setYear(sc.nextInt());
        

        System.out.print("Enter hour: ");
        d1.setHour(sc.nextInt());
        

        System.out.print("Enter minutes: ");
        d1.setMin(sc.nextInt());
        

        System.out.print("Enter seconds: ");
        d1.setSec(sc.nextInt());
        

    }

    public void printRecord(){

       int day = d1.getDay();
       int month = d1.getMonth();
       int year= d1.getYear();
       int hour = d1.getHour();
       int min = d1.getMin();
       int sec = d1.getSec();
        

        LocalDateTime ldt = LocalDateTime.of(year,month,day,hour,min,sec);

        

       System.out.println(ldt.format(DateTimeFormatter.ofPattern("dd/mm/yyyy")));
       System.out.println(ldt.format(DateTimeFormatter.ofPattern("mm/dd/yyyy")));
       System.out.println(ldt.format(DateTimeFormatter.ofPattern("yyyy/mm/dd"))); 

       System.out.println("____________________________________________");
        
       System.out.println(ldt.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
       System.out.println(ldt.format(DateTimeFormatter.ofPattern("hh:mm:ss a")));
       System.out.println(ldt.format(DateTimeFormatter.ofPattern("hh:mm"))); 

       System.out.println("____________________________________________");

       System.out.println(ldt.format(DateTimeFormatter.ofPattern("dd/mm/yyyy hh:mm:ss")));
       System.out.println(ldt.format(DateTimeFormatter.ofPattern("mm/dd/yyyy hh:mm:ss a")));
       System.out.println(ldt.format(DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm"))); 

       System.out.println("____________________________________________");

    }

    public static int menuList( ){
        System.out.println("0.Exit");
        System.out.println("1.Accept Record.");
        System.out.println("2.Print Record");
        System.out.print("Enter choice  : ");
        return sc.nextInt();
      }
    }

public class Program {
    public static void main(String args[]){
        
        int choice;
        DateTest d = new DateTest();

        while( (choice = DateTest.menuList()) != 0 )
        {
            switch(choice)
            {
                case 1 : d.acceptRecord();
                         d.printRecord();

                         System.out.println("____________________________________________");
                        break;
                case 2 : d.printRecord();
                System.out.println("____________________________________________");
                        break;
            }
        }
        
       

    }
}