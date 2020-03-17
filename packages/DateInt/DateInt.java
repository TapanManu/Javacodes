package DateInt;
public interface DateInt{
    public int getYear();
    public int getMonth();
    public int getDay();
    public static boolean isLeapYear(int year) {
        return(year>1582 && (year%400==0||
        (year%4==0 && year%100!=0)));
    }
}
