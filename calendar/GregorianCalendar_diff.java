import java.util.Calendar; 
import java.util.GregorianCalendar; 
  
class  sample{ 
	public static int getDiffYears(GregorianCalendar a, GregorianCalendar b) {
            int diff = b.get(Calendar.YEAR) - a.get(Calendar.YEAR);
            if (a.get(Calendar.MONTH) > b.get(Calendar.MONTH) || 
                   (a.get(Calendar.MONTH) == b.get(Calendar.MONTH) && a.get(Calendar.DATE) > b.get(Calendar.DATE))) {
                                    diff--;
                                }
            return diff;
        }
    public static void main(String args[]) 
    { 
        // declaring an array to store month abbreviations 
        String month[] = { "Jan", "Feb", "Mar", "Apr", 
                           "May", "Jun", "Jul", "Aug", 
                           "Sep", "Oct", "Nov", "Dec" }; 
  
        /* Creating an object of GregorianCalendar class 
           by specifiying year, month and dayOfMonth */
        GregorianCalendar gcal = new GregorianCalendar(2001, , 30); 
        GregorianCalendar gc = new GregorianCalendar();
  
        // displaying the date, time, time zone and locale 
        System.out.print("Date: "
                         + month[gcal.get(Calendar.MONTH)] + " "
                         + gcal.get(Calendar.DATE) + ", "
                         + gcal.get(Calendar.YEAR) + "\n"
                         );
        System.out.print("Date: "
                         + month[gc.get(Calendar.MONTH)] + " "
                         + gc.get(Calendar.DATE) + ", "
                         + gc.get(Calendar.YEAR) + "\n"
                         );
        System.out.println("years:"+getDiffYears(gcal,gc));
    }
        
} // end of class 
