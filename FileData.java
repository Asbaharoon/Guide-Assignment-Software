
import java.io.IOException;
import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class FileData {
	private ArrayList<String> Monday1;
	private ArrayList<String> Tuesday1;
	private ArrayList<String> Wednesday1;
	private ArrayList<String> Thursday1;
	private ArrayList<String> Friday1;
	private ArrayList<String> Saturday1;
	private ArrayList<String> Monday2;
	private ArrayList<String> Tuesday2;
	private ArrayList<String> Wednesday2;
	private ArrayList<String> Thursday2;
	private ArrayList<String> Friday2;
	private ArrayList<String> Saturday2;
		
		public ArrayList<ArrayList<String>> Read(String Term){
		
			ArrayList<ArrayList<String>> DayTimeSlots = new ArrayList<ArrayList<String>>();
			
			
			Monday1 = new ArrayList<String>();
			Tuesday1 = new ArrayList<String>();
			Wednesday1 = new ArrayList<String>();
			Thursday1 = new ArrayList<String>();
			Friday1 = new ArrayList<String>();
			Saturday1 = new ArrayList<String>();
			Monday2 = new ArrayList<String>();
			Tuesday2 = new ArrayList<String>();
			Wednesday2 = new ArrayList<String>();
			Thursday2 = new ArrayList<String>();
			Friday2 = new ArrayList<String>();
			Saturday2 = new ArrayList<String>();
			
			/*
			Date date = new Date();
			int monthFile = date.getMonth();
			int dayFile = date.getDay();
			*/
			
			//if(monthFile >= 1 && monthFile <= 12){
			try{
				ReadFile ReadFall = new ReadFile(Term + ".txt");
				String[] FallLines = ReadFall.OpenFile();
				
				Scanner FallScan;
				FallScan = new Scanner(Term + ".txt");
				for(int a = 0; a < FallLines.length; a++){
					int LineLength = FallLines[a].length();
					if(a==0){
						for(int b = 0; b < LineLength; b++){
							char semicolon = 58;
							char character = FallLines[a].charAt(b);
							if(character == semicolon){
								if(FallLines[a].charAt(b-1) > 50){
									Monday1.add(FallLines[a].substring(b-1,b+3));
								}
								else if(FallLines[a].charAt(b-1) <= 50){
									if(FallLines[a].charAt(b-2) != 32){
										Monday1.add(FallLines[a].substring(b-2,b+3));
									}
									else{
										Monday1.add(FallLines[a].substring(b-1,b+3));
									}
								}
							}
						}
						DayTimeSlots.add(Monday1);
					}
				else if(a==1){
					for(int b = 0; b < LineLength; b++){
						char semicolon = 58;
						char character = FallLines[a].charAt(b);
						if(character == semicolon){
							if(FallLines[a].charAt(b-1) > 50){
								Tuesday1.add(FallLines[a].substring(b-1,b+3));
							}
							else if(FallLines[a].charAt(b-1) <= 50){
								if(FallLines[a].charAt(b-2) != 32){
									Tuesday1.add(FallLines[a].substring(b-2,b+3));
								}
								else{
									Tuesday1.add(FallLines[a].substring(b-1,b+3));
								}
							}
						}
					}
					DayTimeSlots.add(Tuesday1);
				}
				else if(a==2){
					for(int b = 0; b < LineLength; b++){
						char semicolon = 58;
						char character = FallLines[a].charAt(b);
						if(character == semicolon){
							if(FallLines[a].charAt(b-1) > 50){
								Wednesday1.add(FallLines[a].substring(b-1,b+3));
							}
							else if(FallLines[a].charAt(b-1) <= 50){
								if(FallLines[a].charAt(b-2) != 32){
									Wednesday1.add(FallLines[a].substring(b-2,b+3));
								}
								else{
									Wednesday1.add(FallLines[a].substring(b-1,b+3));
								}
							}
						}
					}
					DayTimeSlots.add(Wednesday1);
				}
				else if(a==3){
					for(int b = 0; b < LineLength; b++){
						char semicolon = 58;
						char character = FallLines[a].charAt(b);
						if(character == semicolon){
							if(FallLines[a].charAt(b-1) > 50){
								Thursday1.add(FallLines[a].substring(b-1,b+3));
							}
							else if(FallLines[a].charAt(b-1) <= 50){
								if(FallLines[a].charAt(b-2) != 32){
									Thursday1.add(FallLines[a].substring(b-2,b+3));
								}
								else{
									Thursday1.add(FallLines[a].substring(b-1,b+3));
								}
							}
						}
					}
					DayTimeSlots.add(Thursday1);
				}
				else if(a==4){
					for(int b = 0; b < LineLength; b++){
						char semicolon = 58;
						char character = FallLines[a].charAt(b);
						if(character == semicolon){
							if(FallLines[a].charAt(b-1) > 50){
								Friday1.add(FallLines[a].substring(b-1,b+3));
							}
							else if(FallLines[a].charAt(b-1) <= 50){
								if(FallLines[a].charAt(b-2) != 32){
									Friday1.add(FallLines[a].substring(b-2,b+3));
								}
								else{
									Friday1.add(FallLines[a].substring(b-1,b+3));
								}
							}
						}
					}
					DayTimeSlots.add(Friday1);
				}
				else if(a==5){
					for(int b = 0; b < LineLength; b++){
						char semicolon = 58;
						char character = FallLines[a].charAt(b);
						if(character == semicolon){
							if(FallLines[a].charAt(b-1) > 50){
								Saturday1.add(FallLines[a].substring(b-1,b+3));
							}
							else if(FallLines[a].charAt(b-1) <= 50){
								if(FallLines[a].charAt(b-2) != 32){
									Saturday1.add(FallLines[a].substring(b-2,b+3));
								}
								else{
									Saturday1.add(FallLines[a].substring(b-1,b+3));
								}
							}
						}
					}
					DayTimeSlots.add(Saturday1);
				}
					if(a==6){
						for(int b = 0; b < LineLength; b++){
							char semicolon = 58;
							char character = FallLines[a].charAt(b);
							if(character == semicolon){
								if(FallLines[a].charAt(b-1) > 50){
									Monday2.add(FallLines[a].substring(b-1,b+3));
								}
								else if(FallLines[a].charAt(b-1) <= 50){
									if(FallLines[a].charAt(b-2) != 32){
										Monday2.add(FallLines[a].substring(b-2,b+3));
									}
									else{
										Monday2.add(FallLines[a].substring(b-1,b+3));
									}
								}
							}
						}
						DayTimeSlots.add(Monday2);
					}
				else if(a==7){
					for(int b = 0; b < LineLength; b++){
						char semicolon = 58;
						char character = FallLines[a].charAt(b);
						if(character == semicolon){
							if(FallLines[a].charAt(b-1) > 50){
								Tuesday2.add(FallLines[a].substring(b-1,b+3));
							}
							else if(FallLines[a].charAt(b-1) <= 50){
								if(FallLines[a].charAt(b-2) != 32){
									Tuesday2.add(FallLines[a].substring(b-2,b+3));
								}
								else{
									Tuesday2.add(FallLines[a].substring(b-1,b+3));
								}
							}
						}
					}
					DayTimeSlots.add(Tuesday2);
				}
				else if(a==8){
					for(int b = 0; b < LineLength; b++){
						char semicolon = 58;
						char character = FallLines[a].charAt(b);
						if(character == semicolon){
							if(FallLines[a].charAt(b-1) > 50){
								Wednesday2.add(FallLines[a].substring(b-1,b+3));
							}
							else if(FallLines[a].charAt(b-1) <= 50){
								if(FallLines[a].charAt(b-2) != 32){
									Wednesday2.add(FallLines[a].substring(b-2,b+3));
								}
								else{
									Wednesday2.add(FallLines[a].substring(b-1,b+3));
								}
							}
						}
					}
					DayTimeSlots.add(Wednesday2);
				}
				else if(a==9){
					for(int b = 0; b < LineLength; b++){
						char semicolon = 58;
						char character = FallLines[a].charAt(b);
						if(character == semicolon){
							if(FallLines[a].charAt(b-1) > 50){
								Thursday2.add(FallLines[a].substring(b-1,b+3));
							}
							else if(FallLines[a].charAt(b-1) <= 50){
								if(FallLines[a].charAt(b-2) != 32){
									Thursday2.add(FallLines[a].substring(b-2,b+3));
								}
								else{
									Thursday2.add(FallLines[a].substring(b-1,b+3));
								}
							}
						}
					}
					DayTimeSlots.add(Thursday2);
				}
				else if(a==10){
					for(int b = 0; b < LineLength; b++){
						char semicolon = 58;
						char character = FallLines[a].charAt(b);
						if(character == semicolon){
							if(FallLines[a].charAt(b-1) > 50){
								Friday2.add(FallLines[a].substring(b-1,b+3));
							}
							else if(FallLines[a].charAt(b-1) <= 50){
								if(FallLines[a].charAt(b-2) != 32){
									Friday2.add(FallLines[a].substring(b-2,b+3));
								}
								else{
									Friday2.add(FallLines[a].substring(b-1,b+3));
								}
							}
						}
					}
					DayTimeSlots.add(Friday2);
				}
				else if(a==11){
					for(int b = 0; b < LineLength; b++){
						char semicolon = 58;
						char character = FallLines[a].charAt(b);
						if(character == semicolon){
							if(FallLines[a].charAt(b-1) > 50){
								Saturday2.add(FallLines[a].substring(b-1,b+3));
							}
							else if(FallLines[a].charAt(b-1) <= 50){
								if(FallLines[a].charAt(b-2) != 32){
									Saturday2.add(FallLines[a].substring(b-2,b+3));
								}
								else{
									Saturday2.add(FallLines[a].substring(b-1,b+3));
								}
							}
						}
					}
					DayTimeSlots.add(Saturday2);
				}
				}
				
				String[] StartDate = ReadFall.findStartDate();
				ArrayList<String> FallStartDate = new ArrayList<String>();
				for(int r = 0; r < 3; r++){
					FallStartDate.add(StartDate[r]);
				}
				DayTimeSlots.add(FallStartDate);
				
				String[] EndDate = ReadFall.findEndDate();
				ArrayList<String> FallEndDate = new ArrayList<String>();
				for(int r = 0; r < 3; r++){
					FallEndDate.add(EndDate[r]);
				}
				DayTimeSlots.add(FallEndDate);
			}
			catch(IOException e){
				System.out.println(e.getMessage());
			}
			// }
			/*
			else if(monthFile >=12 && monthFile <= 1){
				
			}
			else if(monthFile >= 3 && monthFile <= 5){
				
			}
		*/
			
			return DayTimeSlots;
		}
		
		
	
}
