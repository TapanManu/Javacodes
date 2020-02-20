//it contains absolutday function to calculate no of days so far!
class Date{
    int day;
    int month;
    int year;
    Boolean leap;
    public Date(int m,int d,int y){
        day=d;
        month=m;
        year=y;
        this.leapyear();
    }
    public String toString(){
        return day+"/"+month+"/"+year;
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
                if(leap)
                    return 29;
                else
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
       Date nextdate = new Date(month,day,year);
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
            Date temp= new Date(i,1,year);
            mdays+=temp.daysInMonth();     
        }
        if(day>daysInMonth())
            System.out.println("cannot predict");
        else{     
        countdays=day+mdays;
        System.out.println(countdays+"th day");
        }
    }
    public void leapyear(){
        leap=false;
		if(year%4==0){
			leap=true;
			if(year%100==0){
				leap=false;
				if(year%400==0){
					leap=true;
				}
			}
        }
    }
    public static void main(String[] args) {
        Date d = new Date(2,29,2000);
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
