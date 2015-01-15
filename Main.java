import java.util.Calendar;


public class Main {

	public static void main (String[] args){
		
		int DayOfYear = Calendar.getInstance().get(Calendar.DAY_OF_YEAR);
		int todayYear = Calendar.getInstance().get(Calendar.YEAR);
		
		
		Schedule schedule = new Schedule();
		schedule.construct(260, 2013);
		
		
	}
}
