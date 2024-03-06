import java.util.Scanner;
class Time
{
    int hour;
    int min;
    int hours;
    int minutes;
    Time()
    {
        this.hour=hours;
        this.min=minutes;
    }
    Time(int hr,int mi,int hrs,int mins)
    {
        this.hour=hr;
        this.min=mi;
    }
    void add(Time t)
    {
        int h = this.hour + t.hour;
        int m = this.min + t.min;
        if(min>=60)
        {
            min=min%60;
            hour++;
        }
        System.out.println("Addition Of Time is = "+h+" hr : "+m+" min");

    }
}

public class AdditionTime 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hours : ");
        int hours=sc.nextInt();
        Time t3=new Time();
        System.out.println("Enter Minutes : ");
        int minutes=sc.nextInt();
        Time t4=new Time();
        System.out.println("Enter Hours : ");
        int hrs=sc.nextInt();
        Time t5=new Time();
        System.out.println("Enter Minutes : ");
        int mins=sc.nextInt();
        Time t6=new Time();

        Time t1 = new Time(hours,minutes, hrs, mins);
        Time t2 = new Time(hrs,mins, hrs, mins);
        t1.add(t2);
    }
}
