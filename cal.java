import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
 
class test {
	public static void main(String args[]){
	   Calendar calendar = Calendar.getInstance(); 
           
       Date date = new Date();  
       SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
       String strDate= formatter.format(date);  
       System.out.println(strDate);  

       SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MMM-yyyy");  
       String strDate1= formatter1.format(date);  
       System.out.println(strDate1);  

       SimpleDateFormat formatter2 = new SimpleDateFormat("yyyy-MM-dd");  
       String strDate2= formatter2.format(date);  
       System.out.println(strDate2);  

       SimpleDateFormat formatter3 = new SimpleDateFormat("E,dd yyyy MMM");  
       String strDate3= formatter3.format(date);  
       System.out.println(strDate3);  

	   System.out.println("The current date is : " + calendar.getTime()); 
 
	   calendar.add(Calendar.DATE, 2);  
	   System.out.println("2 days later: " + calendar.getTime());  
	   calendar.add(Calendar.MONTH, 1);  
	   System.out.println("1 months later: " + calendar.getTime());  
	   calendar.add(Calendar.YEAR, 4);  
	   System.out.println("4 years later: " + calendar.getTime()); 
         calendar.add(Calendar.DATE, -2);  
	   System.out.println("2 days ago: " + calendar.getTime());  
	   calendar.add(Calendar.MONTH, -1);  
	   System.out.println("1 months ago: " + calendar.getTime());  
	   calendar.add(Calendar.YEAR,-4);  
	   System.out.println("4 years ago: " + calendar.getTime()); 
         
	  
	  
	}
}