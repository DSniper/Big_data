package joda_Time;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Joda_time_36_1 {
	private String AMPMfinder(int hh)
	{
		String s="";
		s=(hh>=0&&hh<=12)?"AM":"PM";
		return s;
	}
	public static void main(String[] args)throws IOException 
	{

		Scanner sc = new Scanner(System.in);
		Joda_time_36_1 obj1 = new Joda_time_36_1();
		int  a;
		LocalDate today = LocalDate.now();
		LocalTime nowtime  = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.now();
//		to find day month year from system independetly LocalDateTime.now().valueof() 
		int dd = today.getDayOfMonth();
		int mm = today.getMonthValue();
		int yy = today.getYear();
		int hh =nowtime.getHour();
		int minm =nowtime.getMinute();
		int ss=nowtime.getSecond();
		int ssss=nowtime.getNano();
		ZoneId lzone = ZoneId.systemDefault();
		System.out.println("Initalizing ..........................");
		System.out.println("                      **********                                                **********                           ");
		System.out.println("                      **********                                                **********                           ");
		System.out.println("            **********          **********                            **********          **********                 ");
		System.out.println("            **********          **********                            **********          **********                 ");
		System.out.println("  **********                              **********         **********         **********           **********      ");
		System.out.println("  **********       * * * * * *            **********         **********         **********           **********      ");
		System.out.println("  **********       *           *          **********                  **********          **********                 ");
		System.out.println("  **********       *            *         **********                  **********          **********                 ");
		System.out.println("  **********       *              *       **********         **********         **********           **********      ");
		System.out.println("  **********       *          	*         **********         **********         **********           **********      ");
		System.out.println("  **********       *          *           **********                  **********          **********                 ");
		System.out.println("  **********       * * * * * *            **********                  **********          **********                 ");
		System.out.println("  **********                              **********         **********         **********           **********      ");
		System.out.println("  **********                              **********         **********         **********           **********      ");
		System.out.println("            **********          **********                            **********          **********                 ");
		System.out.println("            **********          **********                            **********          **********                 ");
		System.out.println("                      **********                                                **********                           ");
		System.out.println("                      **********                                                **********                           ");
		System.out.println("enter random number to start the game");
		a=sc.nextInt();
		while(a!=0)
		{
			
			
			System.out.print("1 To Display System Date and Time \n");
			System.out.print("2 To Retrive Date and Time in Parts Seprately \n");
			System.out.print("3 To Create Local DateTime class Object and Extract some date From that method \n");
			System.out.print("4 To Know the Current Time zone and find the date and time at the Current Location and at the Los Angeles in USA \n");
			System.out.print("5 To Know wether the Given Year is Leap Year or Not \n");
			System.out.print("6 To Know Time For Yout Next Birthday  \n");
			
			System.out.println("0 Press Zero to Exit");
			
			

				a=sc.nextInt();
				switch(a)
		    {
				case 1:
					System.out.println(" you entered 1");
					System.out.println(" Your System Date and Time are = "+today+" "+nowtime+" in its native Format which is YYYY-mm-ddTHH:MM:SS:SSS");
					System.out.println("--------------------------------------------------------------------------------------------------------------");
					break;
				case 2:
					System.out.println(" you entered 2");
					System.out.println("Retriving Date and Time in Parts ");
					System.out.print("Date retrived is = ");
					System.out.printf("%d/%d/%d",mm,dd,yy);
					System.out.print("\nTime retrived is = ");
					System.out.printf("%d:%d:%d:%d",hh,minm,ss,ssss);
					System.out.println("\nIt is "+obj1.AMPMfinder(hh)+" of the day");
					System.out.println("\n----------------------------------------------------");
					break;
				case 3:
					System.out.println(" you entered 3");
					System.out.println("Local Date and Time Extracted From System is = "+ ldt);
					System.out.println("Enter the Number for next Month Day and Year ");
					try {
					int mdy = sc.nextInt();
					System.out.printf("\nNext Coming "+mdy+" month from "+ldt +" = %s,%s,%s",ldt.plusMonths(mdy),obj1.AMPMfinder(ldt.getHour()),ldt.getDayOfWeek().name());
//					ldt.getDayOfWeek().name().value()  addded value if needed to find int of day like 6 sat 7 sun 
					System.out.printf("\nPast "+mdy+" month from "+ ldt + " was = %s,%s,%s",ldt.minusMonths(mdy),obj1.AMPMfinder(ldt.getHour()),ldt.getDayOfWeek().name());
					System.out.printf("\nNext Coming "+mdy+" day from "+ldt +" = %s,%s,%s",ldt.plusDays(mdy),obj1.AMPMfinder(ldt.getHour()),ldt.getDayOfWeek().name());
					System.out.printf("\nPast "+mdy+" day from "+ ldt + " was = %s,%s,%s",ldt.minusDays(mdy),obj1.AMPMfinder(ldt.getHour()),ldt.getDayOfWeek().name());
					System.out.printf("\nNext Coming "+mdy+" year from "+ldt +" = %s,%s,%s",ldt.plusYears(mdy),obj1.AMPMfinder(ldt.getHour()),ldt.getDayOfWeek().name());
					System.out.printf("\nPast "+mdy+" year from "+ ldt + " was = %s,%s,%s",ldt.minusYears(mdy),obj1.AMPMfinder(ldt.getHour()),ldt.getDayOfWeek().name());
					}catch(InputMismatchException e)
					{
						System.err.println("Please enter valid number ");
					}
					catch(ArithmeticException e)
					{
						System.err.println("Please enter valid 1  number ");
					}
					catch(Exception e )
					{
						System.err.println("Please enter valid  2 number ");
					}
					System.out.println("\n----------------------------------------------------");
					break;
				case 4:
					System.out.println(" you entered 4");
					System.out.printf("System Time Zone is %s",lzone);
					System.out.printf(" and local dateTime is %s",ldt);
					ZoneId otherTimeZone =ZoneId.of("America/Los_Angeles");
					ZonedDateTime zdt = ZonedDateTime.now();
					System.out.printf("\nDateTime in TimeZone %s",otherTimeZone);
					System.out.printf(" is %s",zdt);
					System.out.println("\n----------------------------------------------------");
					break;
				case 5:
					System.out.println(" you entered 5");
					int k;
					System.out.println("Enter the year need to check wehter leap or not ");
					k=sc.nextInt();
					Year y =Year.of(k);
					boolean chk  = y.isLeap();
					String j = (chk == true)?"a":"not a";
					System.out.println("Entered Year "+k+" is "+j+" Leap Year");
					System.out.println("----------------------------------------------------");
					break;
				case 6:
					System.out.println("Enter the details of your Date Of Birth in day month and year one by one");
					int day,month,year;
					System.out.println("Enter your Birthday Day");
					day=sc.nextInt();
					System.out.println("Enter your Birthday Month");
					month=sc.nextInt();
					System.out.println("Enter your Birthday Year");
					year=sc.nextInt();
					LocalDate birhtday = LocalDate.of(year, Month.of(month), day);
					Period p = Period.between(birhtday, today);
					System.out.printf(" You are %d days %d months %d years older ",p.getDays(),p.getMonths(),p.getYears());
					System.out.println();
					break;
				case 0:
					System.out.println("Thanks For Being With Us Hope to See You Back Soon");
					System.out.println("-------------XXXXXXXXXXXXXXXXXXXX--------------------");
					System.exit(0);
					break;
				default:
					System.out.println(" you entered "+a+" Please choice correct option else press 0 to exit ");
					break;
			}
		}
		sc.close();
	}
}