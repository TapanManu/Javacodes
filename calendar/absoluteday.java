//it contains absolutday function to calculate no of days so far!
class Date{
    int day;
    int month;
    public Date(int m,int d){
        day=d;
        month=m;
        
    }
    public String toString(){
        return day+"/"+month;
    }
    public int daysInMonth(){
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28;
            default:
                System.out.println("No such Month!"); 
                return -1;       
        }
    }
    public void getday(){
        if(day>daysInMonth()){
            System.out.println("incorrect day entered");
            return;
        }
        System.out.println("day:"+day);
    }
    public void getMonth(){
        switch(month){
            case 1:System.out.println("January");
                    break;
            case 2:System.out.println("February");
                    break;
            case 3:System.out.println("March");
                    break;
            case 4:System.out.println("April");
                    break;
            case 5:System.out.println("May");
                    break;
            case 6:System.out.println("June");
                    break;        
            case 7:System.out.println("July");
                    break;
            case 8:System.out.println("August");
                    break;
            case 9:System.out.println("September");
                    break;
            case 10:System.out.println("October");
                    break;
            case 11:System.out.println("November");
                    break;
            case 12:System.out.println("December");
                    break;
            default:
                    System.out.println("No such Month!");        
        }
    }
    public void nextDay(){
       int last_date_in_month=daysInMonth();
       Date nextdate = new Date(month,day);
       if(day>last_date_in_month){
           System.out.println("no such date available");
           return;
       }
       if(month==12 && day==last_date_in_month){
           nextdate.month=1; 
           nextdate.day=1;
       }
       else if(month==2 && day==last_date_in_month){
           nextdate.month=3;
           nextdate.day=1;
       }
       else if(last_date_in_month==30 && day==last_date_in_month){
           nextdate.month=month+1;
           nextdate.day=1;
       }
       else if(last_date_in_month==31 && day==last_date_in_month){
        nextdate.month=month+1;
        nextdate.day=1;
       }
       else{
           nextdate.day=day+1;
       }
       System.out.println(nextdate);
    }
    public void absoluteDay(){
        int countdays=0,mdays=0;
        for(int i=1;i<month;i++){
            Date temp= new Date(i,1);
            mdays+=temp.daysInMonth();
            
        }
        countdays=day+mdays;
        System.out.println(countdays+"th day");
    }
    public static void main(String[] args) {
        //this pgm ignores the case of leap year
        Date d = new Date(4,20
        );
        System.out.print("date:");
        System.out.println(d);
        System.out.print("number of days in given month:");
        System.out.println(d.daysInMonth());
        d.getday();
        System.out.print("the month:");
        d.getMonth();
        System.out.print("next date:");
        d.nextDay();
        d.absoluteDay();
    }
}
date:20/4
number of days in given month:30
day:20
the month:April
next date:21/4
110th day
