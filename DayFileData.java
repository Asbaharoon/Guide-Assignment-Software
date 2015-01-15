import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DayFileData {

	private String slot;
	private ArrayList<ArrayList<String>> TimeSlot1;
	private ArrayList<ArrayList<String>> TimeSlot2;
	private ArrayList<ArrayList<String>> TimeSlot3;
	private ArrayList<ArrayList<String>> TimeSlot4;
	private ArrayList<ArrayList<String>> TimeSlot5;
	private ArrayList<ArrayList<String>> TimeSlot6;
	private ArrayList<ArrayList<ArrayList<String>>> TimeSlots;

	public ArrayList<ArrayList<ArrayList<String>>> Read(String WeekDay){
		try{
			ReadDayFile ReadDay = new ReadDayFile(WeekDay + ".txt");
			String[] DayLines = ReadDay.OpenFile();

			Scanner DayScan;
			DayScan = new Scanner(WeekDay + ".txt");

			TimeSlot1 = new ArrayList<ArrayList<String>>();
			TimeSlot2 = new ArrayList<ArrayList<String>>();
			TimeSlot3 = new ArrayList<ArrayList<String>>();
			TimeSlot4 = new ArrayList<ArrayList<String>>();
			TimeSlot5 = new ArrayList<ArrayList<String>>();
			TimeSlot6 = new ArrayList<ArrayList<String>>();

			slot = "";
			int previousSpace = 0;
			for(int a = 0; a < DayLines.length; a++){
				int LineLength = DayLines[a].length();
				int counter = 0;
				previousSpace = 0;
				ArrayList<String> person = new ArrayList<String>();
				for(int b = 0; b < LineLength; b++){
					if(DayLines[a].charAt(b) == 95){
						if(counter == 0){
							if(DayLines[a].charAt(b+1) == 48){
								slot = "TimeSlot1";
								counter++;
							}
							else if(DayLines[a].charAt(b+1) == 49){
								slot = "TimeSlot2";
								counter++;
							}
							else if(DayLines[a].charAt(b+1) == 50){
								slot = "TimeSlot3";
								counter++;
							}
							else if(DayLines[a].charAt(b+1) == 51){
								slot = "TimeSlot4";
								counter++;
							}
							else if(DayLines[a].charAt(b+1) == 52){
								slot = "TimeSlot5";
								counter++;
							}
							else if(DayLines[a].charAt(b+1) == 53){
								slot = "TimeSlot6";
								counter++;
							}
						}
						else{
						}
					}
					// Find spaces
					else if(DayLines[a].charAt(b) == 32){
						person.add(DayLines[a].substring(previousSpace,b));
						previousSpace = b+1;
					}
				}
				person.add(DayLines[a].substring(previousSpace,LineLength));
				if(slot.equals("TimeSlot1")){
					TimeSlot1.add(person);
				}
				if(slot.equals("TimeSlot2")){
					TimeSlot2.add(person);
				}
				if(slot.equals("TimeSlot3")){
					TimeSlot3.add(person);
				}
				if(slot.equals("TimeSlot4")){
					TimeSlot4.add(person);
				}
				if(slot.equals("TimeSlot5")){
					TimeSlot5.add(person);
				}
				if(slot.equals("TimeSlot6")){
					TimeSlot6.add(person);
				}
			}


			TimeSlots = new ArrayList<ArrayList<ArrayList<String>>>();
			TimeSlots.add(TimeSlot1);
			TimeSlots.add(TimeSlot2);
			TimeSlots.add(TimeSlot3);
			TimeSlots.add(TimeSlot4);
			TimeSlots.add(TimeSlot5);
			TimeSlots.add(TimeSlot6);
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		return TimeSlots;

	}
	
	
}
