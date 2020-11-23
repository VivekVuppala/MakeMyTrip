import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "MalayalaM";
String t ="";

for(int i=s.length()-1;i>=0;i--) {

t=t+s.charAt(i);}
  System.out.println(t);
	
	if(t.equals(s)) System.out.println("success");
	else System.out.println("not success");
	
	
	
/*	StringBuffer sb = new StringBuffer("Vivek");
	System.out.println(sb);
	//System.out.println(sb.reverse());
	StringBuffer reverse = sb.reverse();
	System.out.println(reverse);
	sb.append(" Vivek");System.out.println(sb);
	sb.insert(5, " Mr.");System.out.println(sb);
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	   LocalDateTime now = LocalDateTime.now();  
	   System.out.println(dtf.format(now));
	
/*	Date d = new Date(0);System.out.println(d.toString());
	
	SimpleDateFormat sdf= new SimpleDateFormat("MM/DD/YYYY HH:MM:SS");System.out.println(sdf.format(d));*/
	   
	   String a = "vivek";
	//String b=a.concat("goodBoy");
	System.out.println(a.concat("goodBoy"));
	System.out.println(a);
	   
	StringBuffer sb= new StringBuffer("Vivek");
	System.out.println(sb.append("Hero"));
	System.out.println(sb);
	StringBuffer v= new StringBuffer(a);
	System.out.println(v.append("is a hero"));
	System.out.println(v);
	
	
	
}	
}