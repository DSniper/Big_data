import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class dayfinder {
	
	public static boolean validateJavaDate(String strDate)
	   {
		/* Check if date is 'null' */
		if (strDate.trim().equals(""))
		{
		    return true;
		}
		/* Date is not 'null' */
		else
		{
		    /*
		     * Set preferred date format,
		     * For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.*/
		    SimpleDateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
		    sdfrmt.setLenient(false);
		    /* Create Date object
		     * parse the string into date 
	             */
		    try
		    {
		        Date javaDate = sdfrmt.parse(strDate); 
		        System.out.println(strDate+" is valid date format");
		    }
		    /* Date format is invalid */
		    catch (ParseException e)
		    {
		        System.out.println(strDate+" is Invalid Date format");
		        return false;
		    }
		    /* Return true if date format is valid */
		    return true;
		}
	   }
	
	
	
	
	
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int year, l, mon, p, d, k, sum = 0, ys = 0, ds = 0, ms = 0;
		boolean check=false;
		

		String j = " ";
		System.out.println(
				"yo hello buddy hope u are fine so life going easy lets check whrn u were born so enter your birth date");
		System.out.println("enter you month number number from 1-12");
		mon = sc.nextInt();
		System.out.println("enter you date from 1-31 as of month");
		d = sc.nextInt();
		System.out.println("enter you year");
		year = sc.nextInt();
		String date = mon+"/"+d+"/"+year;
		check = validateJavaDate(date);

		if (check == true) {

//			System.out.println("enter you year");
//			year = sc.nextInt();
			{
				if (year > 2000) {
					l = year % 100 + 100;
				} else
					l = year % 100;
			}
			// System.out.println(l);
//			System.out.println("enter you month number number from 1-12");
//			mon = sc.nextInt();
//			System.out.println("enter you date from 1-31 as of month");
//			d = sc.nextInt();
			while (d <= 31 && d > 0) {
				if (mon <= 12 && mon > 0) {
					switch (mon) {
					case 1:
						ms = 0;
						break;
					case 2:
						ms = 3;
						break;
					case 3:
						ms = 3;
						break;
					case 4:
						ms = 6;
						break;
					case 5:
						ms = 1;
						break;
					case 6:
						ms = 4;
						break;
					case 7:
						ms = 6;
						break;
					case 8:
						ms = 2;
						break;
					case 9:
						ms = 5;
						break;
					case 10:
						ms = 0;
						break;
					case 11:
						ms = 3;
						break;
					case 12:
						ms = 5;
						break;
					default:
						System.out.println("enter valid month ");
					}
					p = (l + (l / 4) + ms + d) % 7;
					// System.out.println(p);
					{
						if ((year % 4 == 0 || year % 400 == 0) && (mon == 1 || mon == 2))
							ys = 1;
					}
					k = p - ys;
					// System.out.println(ys);
					// System.out.println(k);
					switch (k) {
					case 0:
						j = "Sunday";
						break;
					case 1:
						j = "Monday";
						break;
					case 2:
						j = "Tuesday";
						break;
					case 3:
						j = "wednesday";
						break;
					case 4:
						j = "Thursday";
						break;
					case 5:
						j = "Friday";
						break;
					case 6:
						j = "Saturday";
						break;
					default:
						System.out.println("bro eisma default case aa he nahe sakta");
					}
					System.out.println(" day is " + year + "/" + mon + "/" + d + " = " + j);
					break;
				}
			}
		} else {
			System.out.println("enter correect date");
		}
	}
}