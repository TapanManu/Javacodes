import DateInt.DateInt;
class IllegalArgumentException extends Exception{
    public IllegalArgumentException(String s){
        super(s);
    }
}
public class DataZero implements DateInt{
    private int date,month,year;
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return date;
    }
    DataZero(int d,int m,int y) throws IllegalArgumentException{
        date=d;
        month=m;
        year=y;
        if(getDay()>29 && getMonth()==2 && DateInt.isLeapYear(year)||
        (getDay()>28 && getMonth()==2 && !DateInt.isLeapYear(year))||getYear()<1582
        || getDay()>31 || getDay()>30 &&
        (getMonth()==4 || getMonth()==6 ||
         getMonth()==9 || getMonth()==11)){
             throw new IllegalArgumentException("invalid combination of date");
         }
         else
            System.out.println("valid combination");
    }
    public static void main(String[] args) {
        try{
            DataZero d = new  DataZero(29,2,2000);
        }
        catch(IllegalArgumentException i){
            System.out.println(i.getMessage());
        }
        finally{
            System.out.println("Implemented");
        }
    }

}
