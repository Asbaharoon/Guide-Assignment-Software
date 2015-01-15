import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import java.util.Date;

public class Schedule {

	private JFrame ScheduleWindow;
	private JPanel SouthWindowPanel;
	private JPanel EastWindowPanel;
	private JPanel[] VerticalDayPanel;
	private BorderLayout[] borderlayout;
	private JComboBox Menus;
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
	private ArrayList<ArrayList<String>> MondayTimeSlot1;
	private ArrayList<ArrayList<String>> MondayTimeSlot2;
	private ArrayList<ArrayList<String>> MondayTimeSlot3;
	private ArrayList<ArrayList<String>> MondayTimeSlot4;
	private ArrayList<ArrayList<String>> MondayTimeSlot5;
	private ArrayList<ArrayList<String>> MondayTimeSlot6;
	private ArrayList<ArrayList<ArrayList<String>>> MondayTimeSlots;
	private ArrayList<ArrayList<String>> TuesdayTimeSlot1;
	private ArrayList<ArrayList<String>> TuesdayTimeSlot2;
	private ArrayList<ArrayList<String>> TuesdayTimeSlot3;
	private ArrayList<ArrayList<String>> TuesdayTimeSlot4;
	private ArrayList<ArrayList<String>> TuesdayTimeSlot5;
	private ArrayList<ArrayList<String>> TuesdayTimeSlot6;
	private ArrayList<ArrayList<ArrayList<String>>> TuesdayTimeSlots;
	private ArrayList<ArrayList<String>> WednesdayTimeSlot1;
	private ArrayList<ArrayList<String>> WednesdayTimeSlot2;
	private ArrayList<ArrayList<String>> WednesdayTimeSlot3;
	private ArrayList<ArrayList<String>> WednesdayTimeSlot4;
	private ArrayList<ArrayList<String>> WednesdayTimeSlot5;
	private ArrayList<ArrayList<String>> WednesdayTimeSlot6;
	private ArrayList<ArrayList<ArrayList<String>>> WednesdayTimeSlots;
	private ArrayList<ArrayList<String>> ThursdayTimeSlot1;
	private ArrayList<ArrayList<String>> ThursdayTimeSlot2;
	private ArrayList<ArrayList<String>> ThursdayTimeSlot3;
	private ArrayList<ArrayList<String>> ThursdayTimeSlot4;
	private ArrayList<ArrayList<String>> ThursdayTimeSlot5;
	private ArrayList<ArrayList<String>> ThursdayTimeSlot6;
	private ArrayList<ArrayList<ArrayList<String>>> ThursdayTimeSlots;
	private ArrayList<ArrayList<String>> FridayTimeSlot1;
	private ArrayList<ArrayList<String>> FridayTimeSlot2;
	private ArrayList<ArrayList<String>> FridayTimeSlot3;
	private ArrayList<ArrayList<String>> FridayTimeSlot4;
	private ArrayList<ArrayList<String>> FridayTimeSlot5;
	private ArrayList<ArrayList<String>> FridayTimeSlot6;
	private ArrayList<ArrayList<ArrayList<String>>> FridayTimeSlots;
	private ArrayList<ArrayList<String>> SaturdayTimeSlot1;
	private ArrayList<ArrayList<String>> SaturdayTimeSlot2;
	private ArrayList<ArrayList<String>> SaturdayTimeSlot3;
	private ArrayList<ArrayList<String>> SaturdayTimeSlot4;
	private ArrayList<ArrayList<String>> SaturdayTimeSlot5;
	private ArrayList<ArrayList<String>> SaturdayTimeSlot6;
	private ArrayList<ArrayList<ArrayList<String>>> SaturdayTimeSlots;
	private int accumulativeHeight;
	private String weekDay;
	private int slot;
	private int index;
	private ApplicantData applicant;
	private JButton button;
	private int Dateyear;
	private int Datemonth;
	private int Dateday;
	private String season;
	private boolean week;
	private ArrayList<String> termStart;
	private ArrayList<String> termEnd;
	private int termDayLength;
	private int startMonth;
	private int endMonth;
	private int termWeeks;
	private JPanel[] visitType;
	private JPanel[] visitType1;
	private JPanel[] visitType2;
	private JPanel[] visitType3;
	private JPanel[] visitType4;
	private Calendar aujourdhui;
	private int constructyear;
	private int constructday;
	private JSpinner year;
	private JSpinner day;
	private JComboBox month;
	
	public void construct(int dayOfYear, int todayYear){
		
		// Date
		
		aujourdhui = Calendar.getInstance();
		aujourdhui.set(Calendar.DAY_OF_YEAR, dayOfYear);
		aujourdhui.set(Calendar.YEAR, todayYear);
		
		Dateyear = todayYear;
		Datemonth = aujourdhui.get(Calendar.MONTH);
		Dateday = aujourdhui.get(Calendar.DATE);
		
		if(Datemonth == 11 || Datemonth == 0){
			season = "Winter";
		}
		else if(Datemonth >= 7 && Datemonth <= 10){
			season = "Fall";
		}
		else if(Datemonth >= 2 && Datemonth <= 4){
			season = "Spring";
		}
		
		
		ScheduleWindow = new JFrame("Optimal Impression");
		
		borderlayout = new BorderLayout[30];
		
		for(int b = 0; b < 30; b++){
			borderlayout[b] = new BorderLayout();
		}
		ScheduleWindow.setLayout(borderlayout[0]);
		SouthWindowPanel = new JPanel();
		SouthWindowPanel.setLayout(borderlayout[1]);
		EastWindowPanel = new JPanel();
		EastWindowPanel.setPreferredSize(new Dimension(1330,1650));
		SouthWindowPanel.setPreferredSize(new Dimension(1400,1650));
		EastWindowPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		SouthWindowPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ScheduleWindow.add(SouthWindowPanel, BorderLayout.SOUTH);
		SouthWindowPanel.add(EastWindowPanel, BorderLayout.EAST);
		
		JScrollPane scroll;
		scroll = new JScrollPane(SouthWindowPanel);
		scroll.setPreferredSize(new Dimension(1400,725));
		ScheduleWindow.add(scroll, BorderLayout.SOUTH);
		
		BoxLayout boxlayoutx;
		boxlayoutx = new BoxLayout(EastWindowPanel, BoxLayout.X_AXIS);
		
		VerticalDayPanel = new JPanel[6];
		JPanel[] DayHeadingPanel;
		DayHeadingPanel = new JPanel[6];
		JLabel[] DayHeadingLabel;
		DayHeadingLabel = new JLabel[6];
		
		DayHeadingLabel[0] = new JLabel("Monday");
		DayHeadingLabel[1] = new JLabel("Tuesday");
		DayHeadingLabel[2] = new JLabel("Wednesday");
		DayHeadingLabel[3] = new JLabel("Thursday");
		DayHeadingLabel[4] = new JLabel("Friday");
		DayHeadingLabel[5] = new JLabel("Saturday");
		
		JPanel[] SlotPanel;
		SlotPanel = new JPanel[6];
		BoxLayout[] ySlotPanel;
		ySlotPanel = new BoxLayout[6];
		
		for (int a = 0; a < 6; a++){
			VerticalDayPanel[a] = new JPanel();
			VerticalDayPanel[a].setPreferredSize(new Dimension(216,1650));
			VerticalDayPanel[a].setLayout(borderlayout[a + 2]);
			VerticalDayPanel[a].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			EastWindowPanel.add(VerticalDayPanel[a]);
			DayHeadingPanel[a] = new JPanel();
			DayHeadingPanel[a].setPreferredSize(new Dimension(216,25));
			DayHeadingPanel[a].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			Font font = DayHeadingLabel[a].getFont();
			Map attributes = font.getAttributes();
			attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
			DayHeadingLabel[a].setFont(font.deriveFont(attributes));
			DayHeadingPanel[a].add(DayHeadingLabel[a]);
			SlotPanel[a] = new JPanel();
			SlotPanel[a].setPreferredSize(new Dimension(216,1623));
			ySlotPanel[a] = new BoxLayout(SlotPanel[a],BoxLayout.Y_AXIS);
			VerticalDayPanel[a].add(SlotPanel[a],BorderLayout.SOUTH);
			VerticalDayPanel[a].add(DayHeadingPanel[a], BorderLayout.NORTH);
		}
		
		JPanel TimePanel;
		TimePanel = new JPanel();
		TimePanel.setPreferredSize(new Dimension(80,1452));
		BoxLayout boxlayouty;
		boxlayouty = new BoxLayout(TimePanel, BoxLayout.Y_AXIS);
		SouthWindowPanel.add(TimePanel, BorderLayout.WEST);
		
		JPanel filler;
		filler = new JPanel();
		filler.setPreferredSize(new Dimension(80,20));
		TimePanel.add(filler);
		
		JPanel[] DayTimePanels;
		DayTimePanels = new JPanel[11];
		JLabel[] DayTime;
		DayTime = new JLabel[11];
		
		DayTime[0] = new JLabel("8:00 AM");
		DayTime[1] = new JLabel("9:00 AM");
		DayTime[2] = new JLabel("10:00 AM");
		DayTime[3] = new JLabel("11:00 AM");
		DayTime[4] = new JLabel("12:00 PM");
		DayTime[5] = new JLabel("1:00 PM");
		DayTime[6] = new JLabel("2:00 PM");
		DayTime[7] = new JLabel("3:00 PM");
		DayTime[8] = new JLabel("4:00 PM");
		DayTime[9] = new JLabel("5:00 PM");
		DayTime[10] = new JLabel("6:00 PM");
		
		for(int c = 0; c < 11; c++){
			DayTimePanels[c] = new JPanel();
			DayTimePanels[c].setPreferredSize(new Dimension(80,150));
			DayTimePanels[c].setLayout(borderlayout[c+8]);
			Font font = DayTime[c].getFont();
			Map attributes = font.getAttributes();
			attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
			DayTime[c].setFont(font.deriveFont(attributes));
			DayTimePanels[c].add(DayTime[c], BorderLayout.NORTH);
			TimePanel.add(DayTimePanels[c]);
		}
		
		// top of window headings, buttons, and JComboBox
		
		JPanel TopWindowPanel;
		TopWindowPanel = new JPanel();
		TopWindowPanel.setPreferredSize(new Dimension(1420,90));
		BoxLayout xTopPanel;
		xTopPanel = new BoxLayout(TopWindowPanel, BoxLayout.X_AXIS);
		ScheduleWindow.add(TopWindowPanel, BorderLayout.NORTH);
		
		
		JPanel[] panels;
		panels = new JPanel[5];
		
		for(int d = 0; d < 5; d++){
			panels[d] = new JPanel();
			TopWindowPanel.add(panels[d]);
		}
		
		panels[0].setLayout(borderlayout[20]);
		panels[4].setLayout(borderlayout[22]);
		
		JButton PreviousWeek;
		PreviousWeek = new JButton("Previous Week");
		panels[0].add(PreviousWeek, BorderLayout.WEST);
		
		
		JPanel ChangeMenuPanel;
		ChangeMenuPanel = new JPanel();
		ChangeMenuPanel.setPreferredSize(new Dimension(190,70));
		BoxLayout boxlayouty2;
		boxlayouty2 = new BoxLayout(ChangeMenuPanel, BoxLayout.Y_AXIS);
		JLabel ChangeMenu;
		ChangeMenu = new JLabel("Change Menu");
		String[] StringMenu = {"Guide Assignment", "Matching Statistics", "Matching Parameters", "Guide Data", "Seasonal Schedules"};
		Menus = new JComboBox(StringMenu);
		panels[1].add(ChangeMenuPanel, BorderLayout.CENTER);
		panels[1].setPreferredSize(new Dimension(500,90));
		ChangeMenuPanel.add(ChangeMenu);
		ChangeMenuPanel.add(Menus);
		JPanel GoButton;
		GoButton = new JPanel();
		BoxLayout yGo;
		yGo = new BoxLayout(GoButton, BoxLayout.Y_AXIS);
		JLabel goLabel;
		goLabel = new JLabel("   ");
		GoButton.add(goLabel);
		JButton go;
		go = new JButton("Go");
		GoButton.add(go);
		GoButton.setPreferredSize(new Dimension(70,70));
		panels[1].add(GoButton);
		
		
		JLabel Schedule;
		Schedule = new JLabel("Schedule");
		Schedule.setHorizontalAlignment(SwingConstants.CENTER);
		Schedule.setFont(new Font("Serif", Font.PLAIN, 30));
		panels[2].add(Schedule);
		
		BoxLayout boxlayoutx1;
		boxlayoutx1 = new BoxLayout(panels[3], BoxLayout.X_AXIS);
		JPanel[] DatePanel;
		DatePanel = new JPanel[4];
		BoxLayout[] yDate;
		yDate = new BoxLayout[4];
		
		for(int t = 0; t < 4; t++){
			DatePanel[t] = new JPanel();
			yDate[t] = new BoxLayout(DatePanel[t], BoxLayout.Y_AXIS);
			panels[3].add(DatePanel[t]);
		}
		
		
		JLabel[] DateLabel;
		DateLabel = new JLabel[4];
		
		DateLabel[0] = new JLabel("Year");
		DatePanel[0].add(DateLabel[0]);
		SpinnerNumberModel Year = new SpinnerNumberModel(2013,2013,null,1);
		year = new JSpinner(Year);
		DatePanel[0].add(year);
		DatePanel[0].setPreferredSize(new Dimension(90,90));
		
		DateLabel[1] = new JLabel("Month");
		DatePanel[1].add(DateLabel[1]);
		String[] Month = {" ","January","February","March","April","May","June","July","August","September","October","November","December"};
		month = new JComboBox(Month);
		DatePanel[1].add(month);
		DatePanel[1].setPreferredSize(new Dimension(120,90));
		
		DateLabel[2] = new JLabel("Day");
		DatePanel[2].add(DateLabel[2]);
		SpinnerNumberModel Day = new SpinnerNumberModel(1,1,31,1);
		day = new JSpinner(Day);
		DatePanel[2].add(day);
		DatePanel[2].setPreferredSize(new Dimension(80,90));
		
		DateLabel[3] = new JLabel("    ");
		DatePanel[3].add(DateLabel[3]);
		JButton Go;
		Go = new JButton("Go");
		DatePanel[3].add(Go);
		DatePanel[3].setPreferredSize(new Dimension(70,90));
		panels[3].setPreferredSize(new Dimension(500,90));
		
		JButton NextWeek;
		NextWeek = new JButton("  Next Week  ");
		panels[4].add(NextWeek, BorderLayout.EAST);
		
		class GoBtnListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				
				if(Menus.getSelectedItem().toString().equals("Seasonal Schedules")){
					ScheduleManagement schedulemanagementscreen;
					schedulemanagementscreen = new ScheduleManagement();
					schedulemanagementscreen.construct();
				}
				else if(Menus.getSelectedItem().toString().equals("Guide Data")){
					GuidePage guidepage;
					guidepage = new GuidePage();
					guidepage.construct();
				}
				else if(Menus.getSelectedItem().toString().equals("Matching Parameters")){
					Parameters parameters = new Parameters();
					parameters.construct();
				}
				else if(Menus.getSelectedItem().toString().equals("Guide Assignment")){
					Algorithm alg = new Algorithm();
					alg.Algorithm(Dateday,Datemonth,Dateyear);
					
					for(int r = 0; r < MondayTimeSlot1.size(); r++){
						if(MondayTimeSlot1.get(r).get(16).equals("yes")){
							if(MondayTimeSlot1.get(r).get(18).equals("null")){
								visitType[r].setBackground(Color.RED);
							}
							else{
								visitType[r].setBackground(Color.GREEN);
							}
						}
						if(MondayTimeSlot1.get(r).get(16).equals("no")){
							if(MondayTimeSlot1.get(r).get(17).equals("yes")){
								visitType[r].setBackground(Color.BLACK);
							}
						}
					}
					
					for(int r = 0; r < MondayTimeSlot2.size(); r++){
						if(MondayTimeSlot2.get(r).get(16).equals("yes")){
							if(MondayTimeSlot2.get(r).get(18).equals("null")){
								visitType1[r].setBackground(Color.RED);
							}
							else{
								visitType1[r].setBackground(Color.GREEN);
							}
						}
						if(MondayTimeSlot2.get(r).get(16).equals("no")){
							if(MondayTimeSlot2.get(r).get(17).equals("yes")){
								visitType1[r].setBackground(Color.BLACK);
							}
						}
					}
					
					for(int r = 0; r < MondayTimeSlot3.size(); r++){
						if(MondayTimeSlot3.get(r).get(16).equals("yes")){
							if(MondayTimeSlot3.get(r).get(18).equals("null")){
								visitType2[r].setBackground(Color.RED);
							}
							else{
								visitType2[r].setBackground(Color.GREEN);
							}
						}
						if(MondayTimeSlot3.get(r).get(16).equals("no")){
							if(MondayTimeSlot3.get(r).get(17).equals("yes")){
								visitType2[r].setBackground(Color.BLACK);
							}
						}
					}
					
					for(int r = 0; r < MondayTimeSlot4.size(); r++){
						if(MondayTimeSlot4.get(r).get(16).equals("yes")){
							if(MondayTimeSlot4.get(r).get(18).equals("null")){
								visitType3[r].setBackground(Color.RED);
							}
							else{
								visitType3[r].setBackground(Color.GREEN);
							}
						}
						if(MondayTimeSlot4.get(r).get(16).equals("no")){
							if(MondayTimeSlot4.get(r).get(17).equals("yes")){
								visitType3[r].setBackground(Color.BLACK);
							}
						}
					}
					
					for(int r = 0; r < MondayTimeSlot5.size(); r++){
						if(MondayTimeSlot5.get(r).get(16).equals("yes")){
							if(MondayTimeSlot5.get(r).get(18).equals("null")){
								visitType4[r].setBackground(Color.RED);
							}
							else{
								visitType4[r].setBackground(Color.GREEN);
							}
						}
						if(MondayTimeSlot5.get(r).get(16).equals("no")){
							if(MondayTimeSlot5.get(r).get(17).equals("yes")){
								visitType4[r].setBackground(Color.BLACK);
							}
						}
					}
				}
				else if(Menus.getSelectedItem().toString().equals("Matching Statistics")){
					MatchStats matchstat = new MatchStats();
					matchstat.construct();
				}
			}
		}
		
		GoBtnListener a;
		a = new GoBtnListener();
		go.addActionListener(a);
		
		class DateBtnListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				Calendar date = Calendar.getInstance();
				date.set(Calendar.MONTH, month.getSelectedIndex() - 1);
				date.set(Calendar.YEAR, (Integer)year.getValue());
				date.set(Calendar.DATE, (Integer)day.getValue());
				
				if(date.get(Calendar.DAY_OF_WEEK) == 1){
					date.set(Calendar.DAY_OF_YEAR, date.get(Calendar.DAY_OF_YEAR) + 1);
				}
				

				System.out.println(date.get(Calendar.DAY_OF_YEAR));
				
				ScheduleWindow.setVisible(false);
				ScheduleWindow.dispose();
				Schedule sched = new Schedule();
				sched.construct(date.get(Calendar.DAY_OF_YEAR), date.get(Calendar.YEAR));
			}
		}
		
		DateBtnListener datebtn = new DateBtnListener();
		Go.addActionListener(datebtn);
		
		class PreviousBtnListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				
				if(aujourdhui.get(Calendar.DAY_OF_YEAR) - 7 < 0){
					int temp = aujourdhui.get(Calendar.DAY_OF_YEAR) - 7;
					constructyear = aujourdhui.get(Calendar.DAY_OF_YEAR) - 1;
					aujourdhui.set(Calendar.YEAR, aujourdhui.get(Calendar.DAY_OF_YEAR) - 1);
					constructday = temp + aujourdhui.getActualMaximum(aujourdhui.get(Calendar.DAY_OF_YEAR));
				}
				else{
					constructday = aujourdhui.get(Calendar.DAY_OF_YEAR) - 7;
					constructyear = aujourdhui.get(Calendar.YEAR);
				}
				ScheduleWindow.setVisible(false);
				ScheduleWindow.dispose();
				Schedule sched = new Schedule();
				sched.construct(constructday, constructyear);
			}
		}
		
		PreviousBtnListener pre = new PreviousBtnListener();
		PreviousWeek.addActionListener(pre);
		
		class NextBtnListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				if(aujourdhui.get(Calendar.DAY_OF_YEAR) + 7 > aujourdhui.getActualMaximum(Calendar.DAY_OF_YEAR)){
					int temp = aujourdhui.get(Calendar.DAY_OF_YEAR) + 7;
					int tempyeardays = aujourdhui.getActualMaximum(Calendar.DAY_OF_YEAR);
					constructyear = aujourdhui.get(Calendar.DAY_OF_YEAR) + 1;
					aujourdhui.set(Calendar.YEAR, aujourdhui.get(Calendar.DAY_OF_YEAR) + 1);
					constructday = temp - tempyeardays;
				}
				else{
					constructday = aujourdhui.get(Calendar.DAY_OF_YEAR) + 7;
					constructyear = aujourdhui.get(Calendar.YEAR);
				}
				ScheduleWindow.setVisible(false);
				ScheduleWindow.dispose();
				Schedule sched = new Schedule();
				sched.construct(constructday, constructyear);
			}
		}
		
		NextBtnListener next = new NextBtnListener();
		NextWeek.addActionListener(next);
		
		// TimeSlots

		
		// get time data from file and put time slots at corresponding height
		// Make an if statement regarding the time of year to retrieve the correct file
		
		
		FileData filedata = new FileData();
		ArrayList<ArrayList<String>> PlaceTimeSlots = filedata.Read(season);
		
		termStart = new ArrayList<String>(PlaceTimeSlots.get(12));
		termEnd = new ArrayList<String>(PlaceTimeSlots.get(13));
		
		if(termStart.get(0).equals("January")){
			startMonth = 0;
		}
		else if(termStart.get(0).equals("February")){
			startMonth = 1;
		}
		else if(termStart.get(0).equals("March")){
			startMonth = 2;
		}
		else if(termStart.get(0).equals("April")){
			startMonth = 3;
		}
		else if(termStart.get(0).equals("May")){
			startMonth = 4;
		}
		else if(termStart.get(0).equals("June")){
			startMonth = 5;
		}
		else if(termStart.get(0).equals("July")){
			startMonth = 6;
		}
		else if(termStart.get(0).equals("August")){
			startMonth = 7;
		}
		else if(termStart.get(0).equals("September")){
			startMonth = 8;
		}
		else if(termStart.get(0).equals("October")){
			startMonth = 9;
		}
		else if(termStart.get(0).equals("November")){
			startMonth = 10;
		}
		else if(termStart.get(0).equals("December")){
			startMonth = 11;
		}
		
		if(termEnd.get(0).equals("January")){
			endMonth = 0;
		}
		else if(termEnd.get(0).equals("February")){
			endMonth = 1;
		}
		else if(termEnd.get(0).equals("March")){
			endMonth = 2;
		}
		else if(termEnd.get(0).equals("April")){
			endMonth = 3;
		}
		else if(termEnd.get(0).equals("May")){
			endMonth = 4;
		}
		else if(termEnd.get(0).equals("June")){
			endMonth = 5;
		}
		else if(termEnd.get(0).equals("July")){
			endMonth = 6;
		}
		else if(termEnd.get(0).equals("August")){
			endMonth = 7;
		}
		else if(termEnd.get(0).equals("September")){
			endMonth = 8;
		}
		else if(termEnd.get(0).equals("October")){
			endMonth = 9;
		}
		else if(termEnd.get(0).equals("November")){
			endMonth = 10;
		}
		else if(termEnd.get(0).equals("December")){
			endMonth = 11;
		}
		
		Calendar calAdd = Calendar.getInstance();
		int currentMonth = startMonth;
		
		termDayLength = 0;
		
		while(currentMonth != endMonth + 1){
			if(currentMonth == startMonth){
				calAdd.set(Calendar.DATE, 1);
				calAdd.set(Calendar.MONTH, startMonth + 1);
				calAdd.set(Calendar.DATE, calAdd.get(Calendar.DATE) - 1);
				termDayLength = calAdd.get(Calendar.DATE) - Integer.parseInt(termStart.get(1));
				if(currentMonth == 11){
					currentMonth = 0;
				}
				else{
					currentMonth++;
				}
			}
			else if(currentMonth == endMonth){
				termDayLength += Integer.parseInt(termEnd.get(1));
				if(currentMonth == 11){
					currentMonth = 0;
				}
				else{
					currentMonth++;
				}
			}
			else{
				calAdd.set(Calendar.DATE, 1);
				calAdd.set(Calendar.MONTH, currentMonth + 1);
				calAdd.set(Calendar.DATE, calAdd.get(Calendar.DATE) - 1);
				termDayLength += calAdd.get(Calendar.DATE);
				if(currentMonth == 11){
					currentMonth = 0;
				}
				else{
					currentMonth++;
				}
			}
		}
		
		if((termDayLength % 7) == 0){
			termWeeks = (termDayLength / 7);
		}
		else{
			termWeeks = (termDayLength / 7) + 1;
		}
		
		Calendar firstWeek = Calendar.getInstance();
		firstWeek.set(Calendar.MONTH, startMonth);
		firstWeek.set(Calendar.DATE, Integer.parseInt(termStart.get(1)));
		int DayWeek = firstWeek.get(Calendar.DAY_OF_WEEK);
		
		Calendar today = Calendar.getInstance();
		today.set(Calendar.MONTH, Datemonth);
		today.set(Calendar.DATE, Dateday);
		int weekNum = 1;
		
		if(((today.get(Calendar.DATE) >= Integer.parseInt(termStart.get(1))) && (today.get(Calendar.MONTH) == startMonth)) && ((today.get(Calendar.DATE) <= ((6 - DayWeek) + Integer.parseInt(termStart.get(1)))) && (today.get(Calendar.MONTH) == startMonth))){
			week = true;
		}
		else{
			while(weekNum < (termWeeks + 1)){
				calAdd.set(Calendar.MONTH, startMonth);
				calAdd.set(Calendar.DATE, Integer.parseInt(termStart.get(1)));
				calAdd.set(Calendar.DAY_OF_YEAR, calAdd.get(Calendar.DAY_OF_YEAR) + (weekNum * 7) + (6 - DayWeek));
				if((today.get(Calendar.DAY_OF_YEAR) > (calAdd.get(Calendar.DAY_OF_YEAR) - 7)) && (today.get(Calendar.DAY_OF_YEAR) <= (calAdd.get(Calendar.DAY_OF_YEAR)))){
					if((weekNum % 2) == 0){
						week = true;
						break;
					}
					else{
						week = false;
						break;
					}
				}
				else{
					weekNum++;
				}
			}
		}
		
		File monCheck = new File("Monday" + "_" + Datemonth + "_" + Dateday + ".txt");
		File tuesCheck = new File("Tuesday" + "_" + Datemonth + "_" + Dateday + ".txt");
		File wedCheck = new File("Wednesday" + "_" + Datemonth + "_" + Dateday + ".txt");
		File thurCheck = new File("Thursday" + "_" + Datemonth + "_" + Dateday + ".txt");
		File friCheck = new File("Friday" + "_" + Datemonth + "_" + Dateday + ".txt");
		File satCheck = new File("Saturday" + "_" + Datemonth + "_" + Dateday + ".txt");
		
		int monDay = 0;
		int tuesDay = 0;
		int wedDay = 0;
		int thurDay = 0;
		int friDay = 0;
		int satDay = 0;
		
		int monMonth = 0;
		int tuesMonth = 0;
		int wedMonth = 0;
		int thurMonth = 0;
		int friMonth = 0;
		int satMonth = 0;
		
		Calendar cal = Calendar.getInstance();
		
		
		if(monCheck.exists() == true){
			monDay = Dateday;
			monMonth = Datemonth;
		    cal.set(Calendar.DATE, 1);
		    cal.set(Calendar.MONTH, Datemonth + 1);
		    cal.set(Calendar.YEAR, Dateyear);
		    cal.set(Calendar.DATE, cal.get(Calendar.DATE) - 1);
		    int monthDays = cal.get(Calendar.DATE);
		    if(Dateday + 1 > monthDays){
				tuesDay = 1;
				wedDay = 2;
				thurDay = 3;
				friDay = 4;
				satDay = 5;
				tuesMonth = Datemonth++;
				wedMonth = Datemonth++;
				thurMonth = Datemonth++;
				friMonth = Datemonth++;
				satMonth = Datemonth++;
		    }
		    else if(Dateday + 2 > monthDays){
				tuesDay = monDay + 1;
		    	wedDay = 1;
				thurDay = 2;
				friDay = 3;
				satDay = 4;
				tuesMonth = Datemonth;
				wedMonth = Datemonth++;
				thurMonth = Datemonth++;
				friMonth = Datemonth++;
				satMonth = Datemonth++;
		    }
		    else if(Dateday + 3 > monthDays){
				tuesDay = monDay + 1;
				wedDay = monDay + 2;
		    	thurDay = 1;
				friDay = 2;
				satDay = 3;
				tuesMonth = Datemonth;
				wedMonth = Datemonth;
				thurMonth = Datemonth++;
				friMonth = Datemonth++;
				satMonth = Datemonth++;
		    }
		    else if(Dateday + 4 > monthDays){
				tuesDay = monDay + 1;
				wedDay = monDay + 2;
				thurDay = monDay + 3;
		    	friDay = 1;
				satDay = 2;
				tuesMonth = Datemonth;
				wedMonth = Datemonth;
				thurMonth = Datemonth;
				friMonth = Datemonth++;
				satMonth = Datemonth++;
		    }
		    else if(Dateday + 5 > monthDays){
				tuesDay = monDay + 1;
				wedDay = monDay + 2;
				thurDay = monDay + 3;
				friDay = monDay + 4;
		    	satDay = 1;
				tuesMonth = Datemonth;
				wedMonth = Datemonth;
				thurMonth = Datemonth;
				friMonth = Datemonth;
		    	satMonth = Datemonth++;
		    }
		}
		else if(tuesCheck.exists() == true){
			tuesDay = Dateday;
			tuesMonth = Datemonth;
		    cal.set(Calendar.DATE, 1);
		    cal.set(Calendar.MONTH, Datemonth + 1);
		    cal.set(Calendar.YEAR, Dateyear);
		    cal.set(Calendar.DATE, cal.get(Calendar.DATE) - 1);
		    int monthDays = cal.get(Calendar.DATE);
		    if(Dateday == 1){
			    cal.set(Calendar.DATE, 1);
			    cal.set(Calendar.MONTH, Datemonth);
			    cal.set(Calendar.YEAR, Dateyear);
			    cal.set(Calendar.DATE, cal.get(Calendar.DATE) - 1);
			    monDay = cal.get(Calendar.DATE);
		    	wedDay = 2;
				thurDay = 3;
				friDay = 4;
				satDay = 5;
				monMonth = Datemonth - 1;
				wedMonth = Datemonth;
				thurMonth = Datemonth;
				friMonth = Datemonth;
				satMonth = Datemonth;
		    }
		    else if(Dateday + 1 > monthDays){
				monDay = tuesDay - 1;
		    	wedDay = 1;
				thurDay = 2;
				friDay = 3;
				satDay = 4;
				monMonth = Datemonth;
				wedMonth = Datemonth++;
				thurMonth = Datemonth++;
				friMonth = Datemonth++;
				satMonth = Datemonth++;
		    }
		    else if(Dateday + 2 > monthDays){
		    	monDay = tuesDay - 1;
		    	wedDay = tuesDay + 1;
				thurDay = 1;
				friDay = 2;
				satDay = 3;
				monMonth = Datemonth;
				wedMonth = Datemonth;
				thurMonth = Datemonth++;
				friMonth = Datemonth++;
				satMonth = Datemonth++;
		    }
		    else if(Dateday + 3 > monthDays){
		    	monDay = tuesDay - 1;
		    	wedDay = tuesDay + 1;
		    	thurDay = tuesDay + 2;
				friDay = 1;
				satDay = 2;
				monMonth = Datemonth;
				wedMonth = Datemonth;
				thurMonth = Datemonth;
				friMonth = Datemonth++;
				satMonth = Datemonth++;
		    }
		    else if(Dateday + 4 > monthDays){
		    	monDay = tuesDay - 1;
		    	wedDay = tuesDay + 1;
		    	thurDay = tuesDay + 2;
		    	friDay = tuesDay + 3;
				satDay = 1;
				monMonth = Datemonth;
				wedMonth = Datemonth;
				thurMonth = Datemonth;
				friMonth = Datemonth;
				satMonth = Datemonth++;
		    }
		    else {
		    	monDay = tuesDay - 1;
		    	wedDay = tuesDay + 1;
		    	thurDay = tuesDay + 2;
		    	friDay = tuesDay + 3;
		    	satDay = tuesDay + 4;
				monMonth = Datemonth;
				wedMonth = Datemonth;
				thurMonth = Datemonth;
				friMonth = Datemonth;
				satMonth = Datemonth;
		    }
		}
		else if(wedCheck.exists() == true){
			wedDay = Dateday;
			wedMonth = Datemonth;
		    cal.set(Calendar.DATE, 1);
		    cal.set(Calendar.MONTH, Datemonth + 1);
		    cal.set(Calendar.YEAR, Dateyear);
		    cal.set(Calendar.DATE, cal.get(Calendar.DATE) - 1);
		    int monthDays = cal.get(Calendar.DATE);
		    if(Dateday == 1){
			    cal.set(Calendar.DATE, 1);
			    cal.set(Calendar.MONTH, Datemonth - 1);
			    cal.set(Calendar.YEAR, Dateyear);
			    cal.set(Calendar.DATE, cal.get(Calendar.DATE) - 1);
			    tuesDay = cal.get(Calendar.DATE);
			    monDay = tuesDay - 1;
				thurDay = 2;
				friDay = 3;
				satDay = 4;
				monMonth = Datemonth - 1;
				tuesMonth = Datemonth - 1;
				thurMonth = Datemonth;
				friMonth = Datemonth;
				satMonth = Datemonth;
		    }
		    else if(Dateday + 1 > monthDays){
				monDay = wedDay - 2;
				tuesDay = wedDay - 1;
				thurDay = 1;
				friDay = 2;
				satDay = 3;
				monMonth = Datemonth;
				tuesMonth = Datemonth;
				thurMonth = Datemonth++;
				friMonth = Datemonth++;
				satMonth = Datemonth++;
		    }
		    else if(Dateday + 2 > monthDays){
				monDay = wedDay - 2;
				tuesDay = wedDay - 1;
				thurDay = wedDay + 1;
				friDay = 1;
				satDay = 2;
				monMonth = Datemonth;
				tuesMonth = Datemonth;
				thurMonth = Datemonth;
				friMonth = Datemonth++;
				satMonth = Datemonth++;
		    }
		    else if(Dateday + 3 > monthDays){
				monDay = wedDay - 2;
				tuesDay = wedDay - 1;
				thurDay = wedDay + 1;
				friDay = wedDay + 2;
				satDay = 1;
				monMonth = Datemonth;
				tuesMonth = Datemonth;
				thurMonth = Datemonth;
				friMonth = Datemonth;
				satMonth = Datemonth++;
		    }
		    else {
				monDay = wedDay - 2;
				tuesDay = wedDay - 1;
				thurDay = wedDay + 1;
				friDay = wedDay + 2;
				satDay = wedDay + 3;
				monMonth = Datemonth;
				tuesMonth = Datemonth;
				thurMonth = Datemonth;
				friMonth = Datemonth;
				satMonth = Datemonth;
		    }
		}
		else if(thurCheck.exists() == true){
			thurDay = Dateday;
			thurMonth = Datemonth;
		    cal.set(Calendar.DATE, 1);
		    cal.set(Calendar.MONTH, Datemonth + 1);
		    cal.set(Calendar.YEAR, Dateyear);
		    cal.set(Calendar.DATE, cal.get(Calendar.DATE) - 1);
		    int monthDays = cal.get(Calendar.DATE);
		    if(Dateday == 1){
			    cal.set(Calendar.DATE, 1);
			    cal.set(Calendar.MONTH, Datemonth);
			    cal.set(Calendar.YEAR, Dateyear);
			    cal.set(Calendar.DATE, cal.get(Calendar.DATE) - 1);
			    wedDay = cal.get(Calendar.DATE);
			    monDay = wedDay - 2;
			    tuesDay = wedDay - 1;
				friDay = 2;
				satDay = 3;
				monMonth = Datemonth - 1;
				tuesMonth = Datemonth - 1;
				wedMonth = Datemonth - 1;
				friMonth = Datemonth;
				satMonth = Datemonth;
		    }
		    else if(Dateday + 1 > monthDays){
				monDay = thurDay - 3;
				tuesDay = thurDay - 2;
				wedDay = thurDay - 1;
				friDay = 1;
				satDay = 2;
				monMonth = Datemonth;
				tuesMonth = Datemonth;
				wedMonth = Datemonth;
				friMonth = Datemonth++;
				satMonth = Datemonth++;
		    }
		    else if(Dateday + 2 > monthDays){
				monDay = thurDay - 3;
				tuesDay = thurDay - 2;
				wedDay = thurDay - 1;
				friDay = thurDay + 1;
				satDay = 1;
				monMonth = Datemonth;
				tuesMonth = Datemonth;
				wedMonth = Datemonth;
				friMonth = Datemonth;
				satMonth = Datemonth++;
		    }
		    else {
				monDay = thurDay - 3;
				tuesDay = thurDay - 2;
				wedDay = thurDay - 1;
				friDay = thurDay + 1;
				satDay = thurDay + 2;
				monMonth = Datemonth;
				tuesMonth = Datemonth;
				wedMonth = Datemonth;
				friMonth = Datemonth;
				satMonth = Datemonth;
		    }
		}
		else if(friCheck.exists() == true){
			friDay = Dateday;
			friMonth = Datemonth;
		    cal.set(Calendar.DATE, 1);
		    cal.set(Calendar.MONTH, Datemonth + 1);
		    cal.set(Calendar.YEAR, Dateyear);
		    cal.set(Calendar.DATE, cal.get(Calendar.DATE) - 1);
		    int monthDays = cal.get(Calendar.DATE);
		    if(Dateday == 1){
			    cal.set(Calendar.DATE, 1);
			    cal.set(Calendar.MONTH, Datemonth);
			    cal.set(Calendar.YEAR, Dateyear);
			    cal.set(Calendar.DATE, cal.get(Calendar.DATE) - 1);
			    thurDay = cal.get(Calendar.DATE);
			    monDay = thurDay - 3;
			    tuesDay = thurDay - 2;
			    wedDay = thurDay - 1;
				satDay = 2;
				monMonth = Datemonth - 1;
				tuesMonth = Datemonth - 1;
				wedMonth = Datemonth - 1;
				thurMonth = Datemonth - 1;
				satMonth = Datemonth;
		    }
		    else if(Dateday + 1 > monthDays){
				monDay = friDay - 4;
				tuesDay = friDay - 3;
				wedDay = friDay - 2;
				thurDay = friDay - 1;
				satDay = 1;
				monMonth = Datemonth;
				tuesMonth = Datemonth;
				wedMonth = Datemonth;
				thurMonth = Datemonth;
				satMonth = Datemonth++;
		    }
		    else{
				monDay = friDay - 4;
				tuesDay = friDay - 3;
				wedDay = friDay - 2;
				thurDay = friDay - 1;
				satDay = friDay + 1;
				monMonth = Datemonth;
				tuesMonth = Datemonth;
				wedMonth = Datemonth;
				thurMonth = Datemonth;
				satMonth = Datemonth;
		    }
		}
		else if(satCheck.exists() == true){
			satDay = Dateday;
			satMonth = Datemonth;
		    cal.set(Calendar.DATE, 1);
		    cal.set(Calendar.MONTH, Datemonth + 1);
		    cal.set(Calendar.YEAR, Dateyear);
		    cal.set(Calendar.DATE, cal.get(Calendar.DATE) - 1);
		    if(Dateday == 1){
			    cal.set(Calendar.DATE, 1);
			    cal.set(Calendar.MONTH, Datemonth);
			    cal.set(Calendar.YEAR, Dateyear);
			    cal.set(Calendar.DATE, cal.get(Calendar.DATE) - 1);
			    friDay = cal.get(Calendar.DATE);
			    monDay = friDay - 4;
			    tuesDay = friDay - 3;
			    wedDay = friDay - 2;
			    thurDay = friDay - 1;
				monMonth = Datemonth - 1;
				tuesMonth = Datemonth - 1;
				wedMonth = Datemonth - 1;
				thurMonth = Datemonth - 1;
				friMonth = Datemonth - 1;
		    }
		    else{
				monDay = satDay - 5;
				tuesDay = satDay - 4;
				wedDay = satDay - 3;
				thurDay = satDay - 2;
				friDay = satDay - 1;
				monMonth = Datemonth;
				tuesMonth = Datemonth;
				wedMonth = Datemonth;
				thurMonth = Datemonth;
				friMonth = Datemonth;
		    }
		}
		
		
		// year, month, day
		
		year.setValue(Dateyear);
		month.setSelectedIndex(monMonth + 1);
		/*
		if(monMonth == 0){
			month.setName("January");
		}
		else if(monMonth == 1){
			month.setName("February");
		}
		else if(monMonth == 2){
			month.setName("March");
		}
		else if(monMonth == 3){
			month.setName("April");
		}
		else if(monMonth == 4){
			month.setName("May");
		}
		else if(monMonth == 5){
			month.setName("June");
		}
		else if(monMonth == 6){
			month.setName("July");
		}
		else if(monMonth == 7){
			month.setName("August");
		}
		else if(monMonth == 8){
			month.setName("September");
		}
		else if(monMonth == 9){
			month.setName("October");
		}
		else if(monMonth == 10){
			month.setName("November");
		}
		else if(monMonth == 11){
			month.setName("December");
		}
		*/
		
		day.setValue(monDay);
		
			DayFileData Monday = new DayFileData();
			MondayTimeSlots = Monday.Read("Monday" + "_" + monMonth + "_" + monDay);
			MondayTimeSlot1 = MondayTimeSlots.get(0);
			MondayTimeSlot2 = MondayTimeSlots.get(1);
			MondayTimeSlot3 = MondayTimeSlots.get(2);
			MondayTimeSlot4 = MondayTimeSlots.get(3);
			MondayTimeSlot5 = MondayTimeSlots.get(4);
			MondayTimeSlot6 = MondayTimeSlots.get(5);
			DayFileData Tuesday = new DayFileData();
			TuesdayTimeSlots = Tuesday.Read("Tuesday" + "_" + tuesMonth + "_" + tuesDay);
			TuesdayTimeSlot1 = TuesdayTimeSlots.get(0);
			TuesdayTimeSlot2 = TuesdayTimeSlots.get(1);
			TuesdayTimeSlot3 = TuesdayTimeSlots.get(2);
			TuesdayTimeSlot4 = TuesdayTimeSlots.get(3);
			TuesdayTimeSlot5 = TuesdayTimeSlots.get(4);
			TuesdayTimeSlot6 = TuesdayTimeSlots.get(5);
			DayFileData Wednesday = new DayFileData();
			WednesdayTimeSlots = Wednesday.Read("Wednesday" + "_" + wedMonth + "_" + wedDay);
			WednesdayTimeSlot1 = WednesdayTimeSlots.get(0);
			WednesdayTimeSlot2 = WednesdayTimeSlots.get(1);
			WednesdayTimeSlot3 = WednesdayTimeSlots.get(2);
			WednesdayTimeSlot4 = WednesdayTimeSlots.get(3);
			WednesdayTimeSlot5 = WednesdayTimeSlots.get(4);
			WednesdayTimeSlot6 = WednesdayTimeSlots.get(5);
			DayFileData Thursday = new DayFileData();
			ThursdayTimeSlots = Thursday.Read("Thursday" + "_" + thurMonth + "_" + thurDay);
			ThursdayTimeSlot1 = ThursdayTimeSlots.get(0);
			ThursdayTimeSlot2 = ThursdayTimeSlots.get(1);
			ThursdayTimeSlot3 = ThursdayTimeSlots.get(2);
			ThursdayTimeSlot4 = ThursdayTimeSlots.get(3);
			ThursdayTimeSlot5 = ThursdayTimeSlots.get(4);
			ThursdayTimeSlot6 = ThursdayTimeSlots.get(5);
			DayFileData Friday = new DayFileData();
			FridayTimeSlots = Friday.Read("Friday"  + "_" + friMonth + "_" + friDay);
			FridayTimeSlot1 = FridayTimeSlots.get(0);
			FridayTimeSlot2 = FridayTimeSlots.get(1);
			FridayTimeSlot3 = FridayTimeSlots.get(2);
			FridayTimeSlot4 = FridayTimeSlots.get(3);
			FridayTimeSlot5 = FridayTimeSlots.get(4);
			FridayTimeSlot6 = FridayTimeSlots.get(5);
			DayFileData Saturday = new DayFileData();
			SaturdayTimeSlots = Saturday.Read("Saturday" + "_" + satMonth + "_" + satDay);
			SaturdayTimeSlot1 = SaturdayTimeSlots.get(0);
			SaturdayTimeSlot2 = SaturdayTimeSlots.get(1);
			SaturdayTimeSlot3 = SaturdayTimeSlots.get(2);
			SaturdayTimeSlot4 = SaturdayTimeSlots.get(3);
			SaturdayTimeSlot5 = SaturdayTimeSlots.get(4);
			SaturdayTimeSlot6 = SaturdayTimeSlots.get(5);
		
		
		class ApplicantListener implements ActionListener{
			public void actionPerformed(ActionEvent f){
				button = (JButton)f.getSource();
				String buttonText = button.getText();
				
				// find applicant with corresponding name
				
				for(int a = 0; a < 6; a++){
					if(a == 0){
						for(int b = 0; b < MondayTimeSlots.size(); b++){
							for(int c = 0; c < MondayTimeSlots.get(b).size(); c++){
								if(MondayTimeSlots.get(b).get(c).get(0).equals(buttonText)){
									weekDay = "Monday";
									slot = b;
									index = c;
								}
							}
						}
					}
					else if(a == 1){
						for(int b = 0; b < TuesdayTimeSlots.size(); b++){
							for(int c = 0; c < TuesdayTimeSlots.get(b).size(); c++){
								if(TuesdayTimeSlots.get(b).get(c).get(0).equals(buttonText)){
									weekDay = "Tuesday";
									slot = b;
									index = c;
								}
							}
						}
					}
					else if(a == 2){
						for(int b = 0; b < WednesdayTimeSlots.size(); b++){
							for(int c = 0; c < WednesdayTimeSlots.get(b).size(); c++){
								if(WednesdayTimeSlots.get(b).get(c).get(0).equals(buttonText)){
									weekDay = "Wednesday";
									slot = b;
									index = c;
								}
							}
						}
					}
					else if(a == 3){
						for(int b = 0; b < ThursdayTimeSlots.size(); b++){
							for(int c = 0; c < ThursdayTimeSlots.get(b).size(); c++){
								if(ThursdayTimeSlots.get(b).get(c).get(0).equals(buttonText)){
									weekDay = "Thursday";
									slot = b;
									index = c;
								}
							}
						}
					}
					else if(a == 4){
						for(int b = 0; b < FridayTimeSlots.size(); b++){
							for(int c = 0; c < FridayTimeSlots.get(b).size(); c++){
								if(FridayTimeSlots.get(b).get(c).get(0).equals(buttonText)){
									weekDay = "Friday";
									slot = b;
									index = c;
								}
							}
						}
					}
					else if(a == 5){
						for(int b = 0; b < SaturdayTimeSlots.size(); b++){
							for(int c = 0; c < SaturdayTimeSlots.get(b).size(); c++){
								if(SaturdayTimeSlots.get(b).get(c).get(0).equals(buttonText)){
									weekDay = "Saturday";
									slot = b;
									index = c;
								}
							}
						}
					}
				}
				
				applicant = new ApplicantData();
				applicant.construct(weekDay, slot, index, aujourdhui.get(Calendar.DAY_OF_YEAR));
			}
		}
		ApplicantListener appListen = new ApplicantListener();
		
		if(week == true){
		//	System.out.println("True");
		Monday1 = new ArrayList<String>(PlaceTimeSlots.get(0));
		Tuesday1 = new ArrayList<String>(PlaceTimeSlots.get(1));
		Wednesday1 = new ArrayList<String>(PlaceTimeSlots.get(2));
		Thursday1 = new ArrayList<String>(PlaceTimeSlots.get(3));
		Friday1 = new ArrayList<String>(PlaceTimeSlots.get(4));
		Saturday1 = new ArrayList<String>(PlaceTimeSlots.get(5));
		}
		else if(week == false){
		//	System.out.println("False");
		Monday1 = new ArrayList<String>(PlaceTimeSlots.get(6));
		Tuesday1 = new ArrayList<String>(PlaceTimeSlots.get(7));
		Wednesday1 = new ArrayList<String>(PlaceTimeSlots.get(8));
		Thursday1 = new ArrayList<String>(PlaceTimeSlots.get(9));
		Friday1 = new ArrayList<String>(PlaceTimeSlots.get(10));
		Saturday1 = new ArrayList<String>(PlaceTimeSlots.get(11));
		}
		
		// Monday 
		JPanel[] MondaySlot;
		MondaySlot = new JPanel[5];
		GridLayout[] SlotLayout;
		SlotLayout = new GridLayout[5];
		
		for(int z = 0; z < 5; z++){
			MondaySlot[z] = new JPanel();
			MondaySlot[z].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			SlotLayout[z] = new GridLayout(0,2);
			MondaySlot[z].setLayout(SlotLayout[z]);
		}
		
		JPanel[] MondayFiller;
		MondayFiller = new JPanel[6];
		
		int initialHour = 8;
		int initialMinute = 0;
		int hour;
		int minutes;
		int difference;
		double dubMin;
		String minPix;
		int IntMinPix;
		
		// Monday
		for(int m = 0; m < 5; m++){
			String Slot;
			int numTours;
			int counter = 0;
			if(Monday1.get(m).equals("8:00")){
				numTours = MondayTimeSlot1.size();
				if(numTours % 2 == 0){
					MondaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
					accumulativeHeight = accumulativeHeight + (numTours/2)*20 + 12;
					SlotPanel[0].add(MondaySlot[m]);
				}
				else{
					MondaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
					accumulativeHeight = accumulativeHeight + ((numTours + 1)/2)*20 + 12;
					SlotPanel[0].add(MondaySlot[m]);
				}
			}
			else{
				if(m == 0){
					Slot = Monday1.get(m);
					if(Slot.length() == 4){
						hour = Integer.parseInt(Slot.substring(0,1));
						difference = hour - initialHour;
						if(difference < 0){
							hour = hour + 12;
							difference = hour - initialHour;
						}
						minutes = Integer.parseInt(Slot.substring(2,4));
						minutes = minutes - initialMinute;
						minutes = minutes + difference*60;
						dubMin = minutes*2.5;
						IntMinPix = (int)dubMin;
						MondayFiller[counter] = new JPanel();
						MondayFiller[counter].setPreferredSize(new Dimension(216, IntMinPix - accumulativeHeight));
						accumulativeHeight += (IntMinPix - accumulativeHeight);
						SlotPanel[0].add(MondayFiller[counter]);
						numTours = MondayTimeSlot1.size();
						if(numTours % 2 == 0){
							MondaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
							accumulativeHeight += (numTours/2)*20 + 12;
							SlotPanel[0].add(MondaySlot[m]);
						}
						else{
							MondaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
							accumulativeHeight += ((numTours + 1)/2)*20 + 12;
							SlotPanel[0].add(MondaySlot[m]);
						}
					}
					else{
						hour = Integer.parseInt(Slot.substring(0,2));
						difference = hour - initialHour;
						if(difference < 0){
							hour = hour + 12;
							difference = hour - initialHour;
						}
						minutes = Integer.parseInt(Slot.substring(3,5));
						minutes = minutes - initialMinute;
						minutes = minutes + difference*60;
						dubMin = minutes*2.5;
						IntMinPix = (int)dubMin;
						MondayFiller[counter] = new JPanel();
						MondayFiller[counter].setPreferredSize(new Dimension(216, IntMinPix - accumulativeHeight));
						accumulativeHeight += (IntMinPix - accumulativeHeight);
						SlotPanel[0].add(MondayFiller[counter]);
						numTours = MondayTimeSlot1.size();
						if(numTours % 2 == 0){
							MondaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
							accumulativeHeight += (numTours/2)*20 + 12;
							SlotPanel[0].add(MondaySlot[m]);
						}
						else{
							MondaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
							accumulativeHeight += ((numTours + 1)/2)*20 + 12;
							SlotPanel[0].add(MondaySlot[m]);
						}
					}
				}
					if(m == 1){
						Slot = Monday1.get(m);
						if(Slot.length() == 4){
							hour = Integer.parseInt(Slot.substring(0,1));
							difference = hour - initialHour;
							if(difference < 0){
								hour = hour + 12;
								difference = hour - initialHour;
							}
							minutes = Integer.parseInt(Slot.substring(2,4));
							minutes = minutes - initialMinute;
							minutes = minutes + difference*60;
							dubMin = minutes*2.5;
							IntMinPix = (int)dubMin;
							MondayFiller[counter] = new JPanel();
							MondayFiller[counter].setPreferredSize(new Dimension(216, IntMinPix - accumulativeHeight));
							accumulativeHeight += (IntMinPix - accumulativeHeight);
							SlotPanel[0].add(MondayFiller[counter]);
							numTours = MondayTimeSlot2.size();
							if(numTours % 2 == 0){
								MondaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
								accumulativeHeight += (numTours/2)*20 + 12;
								SlotPanel[0].add(MondaySlot[m]);
							}
							else{
								MondaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
								accumulativeHeight += ((numTours + 1)/2)*20 + 12;
								SlotPanel[0].add(MondaySlot[m]);
							}
						}
					
						else{
							hour = Integer.parseInt(Slot.substring(0,2));
							difference = hour - initialHour;
							if(difference < 0){
								hour = hour + 12;
								difference = hour - initialHour;
							}
							minutes = Integer.parseInt(Slot.substring(3,5));
							minutes = minutes - initialMinute;
							minutes = minutes + difference*60;
							dubMin = minutes*2.5;
							IntMinPix = (int)dubMin;
							MondayFiller[counter] = new JPanel();
							MondayFiller[counter].setPreferredSize(new Dimension(216, IntMinPix - accumulativeHeight));
							accumulativeHeight += (IntMinPix - accumulativeHeight);
							SlotPanel[0].add(MondayFiller[counter]);
							numTours = MondayTimeSlot2.size();
							if(numTours % 2 == 0){
								MondaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
								accumulativeHeight += (numTours/2)*20 + 12;
								SlotPanel[0].add(MondaySlot[m]);
							}
							else{
								MondaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
								accumulativeHeight += ((numTours + 1)/2)*20 + 12;
								SlotPanel[0].add(MondaySlot[m]);
							}
						}
					}
						if(m == 2){
							Slot = Monday1.get(m);
							if(Slot.length() == 4){
								hour = Integer.parseInt(Slot.substring(0,1));
								difference = hour - initialHour;
								if(difference < 0){
									hour = hour + 12;
									difference = hour - initialHour;
								}
								minutes = Integer.parseInt(Slot.substring(2,4));
								minutes = minutes - initialMinute;
								minutes = minutes + difference*60;
								dubMin = minutes*2.5;
								IntMinPix = (int)dubMin;
								MondayFiller[counter] = new JPanel();
								MondayFiller[counter].setPreferredSize(new Dimension(216, IntMinPix - accumulativeHeight));
								accumulativeHeight += (IntMinPix - accumulativeHeight);
								SlotPanel[0].add(MondayFiller[counter]);
								numTours = MondayTimeSlot3.size();
								if(numTours % 2 == 0){
									MondaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[0].add(MondaySlot[m]);
								}
								else{
									MondaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[0].add(MondaySlot[m]);
								}
							}
							else{
								hour = Integer.parseInt(Slot.substring(0,2));
								difference = hour - initialHour;
								if(difference < 0){
									hour = hour + 12;
									difference = hour - initialHour;
								}
								minutes = Integer.parseInt(Slot.substring(3,5));
								minutes = minutes - initialMinute;
								minutes = minutes + difference*60;
								dubMin = minutes*2.5;
								IntMinPix = (int)dubMin;
								MondayFiller[counter] = new JPanel();
								MondayFiller[counter].setPreferredSize(new Dimension(216, IntMinPix - accumulativeHeight));
								accumulativeHeight += (IntMinPix - accumulativeHeight);
								SlotPanel[0].add(MondayFiller[counter]);
								numTours = MondayTimeSlot3.size();
								if(numTours % 2 == 0){
									MondaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[0].add(MondaySlot[m]);
								}
								else{
									MondaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[0].add(MondaySlot[m]);
								}
							}
						}
						
						if(m == 3){
							Slot = Monday1.get(m);
							if(Slot.length() == 4){
								hour = Integer.parseInt(Slot.substring(0,1));
								difference = hour - initialHour;
								if(difference < 0){
									hour = hour + 12;
									difference = hour - initialHour;
								}
								minutes = Integer.parseInt(Slot.substring(2,4));
								minutes = minutes - initialMinute;
								minutes = minutes + difference*60;
								dubMin = minutes*2.5;
								IntMinPix = (int)dubMin;
								MondayFiller[counter] = new JPanel();
								MondayFiller[counter].setPreferredSize(new Dimension(216, IntMinPix - accumulativeHeight));
								accumulativeHeight += (IntMinPix - accumulativeHeight);
								SlotPanel[0].add(MondayFiller[counter]);
								numTours = MondayTimeSlot4.size();
								if(numTours % 2 == 0){
									MondaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[0].add(MondaySlot[m]);
								}
								else{
									MondaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[0].add(MondaySlot[m]);
								}
							}
							else{
								hour = Integer.parseInt(Slot.substring(0,2));
								difference = hour - initialHour;
								if(difference < 0){
									hour = hour + 12;
									difference = hour - initialHour;
								}
								minutes = Integer.parseInt(Slot.substring(3,5));
								minutes = minutes - initialMinute;
								minutes = minutes + difference*60;
								dubMin = minutes*2.5;
								IntMinPix = (int)dubMin;
								MondayFiller[counter] = new JPanel();
								MondayFiller[counter].setPreferredSize(new Dimension(216, IntMinPix - accumulativeHeight));
								accumulativeHeight += (IntMinPix - accumulativeHeight);
								SlotPanel[0].add(MondayFiller[counter]);
								numTours = MondayTimeSlot4.size();
								if(numTours % 2 == 0){
									MondaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[0].add(MondaySlot[m]);
								}
								else{
									MondaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[0].add(MondaySlot[m]);
								}
							}
						}
						if(m == 4){
							Slot = Monday1.get(m);
							if(Slot.length() == 4){
								hour = Integer.parseInt(Slot.substring(0,1));
								difference = hour - initialHour;
								if(difference < 0){
									hour = hour + 12;
									difference = hour - initialHour;
								}
								minutes = Integer.parseInt(Slot.substring(2,4));
								minutes = minutes - initialMinute;
								minutes = minutes + difference*60;
								dubMin = minutes*2.5;
								IntMinPix = (int)dubMin;
								MondayFiller[counter] = new JPanel();
								MondayFiller[counter].setPreferredSize(new Dimension(216, IntMinPix - accumulativeHeight));
								accumulativeHeight += (IntMinPix - accumulativeHeight);
								SlotPanel[0].add(MondayFiller[counter]);
								numTours = MondayTimeSlot5.size();
								if(numTours % 2 == 0){
									MondaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[0].add(MondaySlot[m]);
								}
								else{
									MondaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[0].add(MondaySlot[m]);
								}
							}
							else{
								hour = Integer.parseInt(Slot.substring(0,2));
								difference = hour - initialHour;
								if(difference < 0){
									hour = hour + 12;
									difference = hour - initialHour;
								}
								minutes = Integer.parseInt(Slot.substring(3,5));
								minutes = minutes - initialMinute;
								minutes = minutes + difference*60;
								dubMin = minutes*2.5;
								IntMinPix = (int)dubMin;
								MondayFiller[counter] = new JPanel();
								MondayFiller[counter].setPreferredSize(new Dimension(216, IntMinPix - accumulativeHeight));
								accumulativeHeight += (IntMinPix - accumulativeHeight);
								SlotPanel[0].add(MondayFiller[counter]);
								numTours = MondayTimeSlot5.size();
								if(numTours % 2 == 0){
									MondaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[0].add(MondaySlot[m]);
								}
								else{
									MondaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[0].add(MondaySlot[m]);
								}
							}
						}
				}

			}
			
		JButton[] MondaySlot1;
		MondaySlot1 = new JButton[MondayTimeSlot1.size()];
		JPanel[] cell;
		cell = new JPanel[MondayTimeSlot1.size()];
		visitType = new JPanel[MondayTimeSlot1.size()];
		BoxLayout xSlot;
		
		for(int r = 0; r < MondayTimeSlot1.size(); r++){
			MondaySlot1[r] = new JButton();
			MondaySlot1[r].setText(MondayTimeSlot1.get(r).get(0));
			MondaySlot1[r].addActionListener(appListen);
			cell[r] = new JPanel();
			cell[r].setPreferredSize(new Dimension(106,20));
			xSlot = new BoxLayout(cell[r],BoxLayout.X_AXIS);
			MondaySlot1[r].setPreferredSize(new Dimension(90,18));
			visitType[r] = new JPanel();
			visitType[r].setPreferredSize(new Dimension(7,15));
			visitType[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(MondayTimeSlot1.get(r).get(16).equals("yes")){
				if(MondayTimeSlot1.get(r).get(18).equals("null")){
					visitType[r].setBackground(Color.RED);
				}
				else{
					visitType[r].setBackground(Color.GREEN);
				}
			}
			if(MondayTimeSlot1.get(r).get(16).equals("no")){
				if(MondayTimeSlot1.get(r).get(17).equals("yes")){
					visitType[r].setBackground(Color.BLACK);
				}
			}
			cell[r].add(MondaySlot1[r]);
			cell[r].add(visitType[r]);
			MondaySlot[0].add(cell[r]);
		}
		
		
		JButton[] MondaySlot2;
		MondaySlot2 = new JButton[MondayTimeSlot2.size()];
		JPanel[] cell1;
		cell1 = new JPanel[MondayTimeSlot2.size()];
		visitType1 = new JPanel[MondayTimeSlot2.size()];
		
		for(int r = 0; r < MondayTimeSlot2.size(); r++){
			MondaySlot2[r] = new JButton();
			MondaySlot2[r].setText(MondayTimeSlot2.get(r).get(0));
			MondaySlot2[r].addActionListener(appListen);
			cell1[r] = new JPanel();
			cell1[r].setPreferredSize(new Dimension(106,20));
			xSlot = new BoxLayout(cell1[r],BoxLayout.X_AXIS);
			MondaySlot2[r].setPreferredSize(new Dimension(90,18));
			visitType1[r] = new JPanel();
			visitType1[r].setPreferredSize(new Dimension(7,15));
			visitType1[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(MondayTimeSlot2.get(r).get(16).equals("yes")){
				if(MondayTimeSlot2.get(r).get(18).equals("null")){
					visitType1[r].setBackground(Color.RED);
				}
				else{
					visitType1[r].setBackground(Color.GREEN);
				}
			}
			if(MondayTimeSlot2.get(r).get(16).equals("no")){
				if(MondayTimeSlot2.get(r).get(17).equals("yes")){
					visitType1[r].setBackground(Color.BLACK);
				}
			}
			cell1[r].add(MondaySlot2[r]);
			cell1[r].add(visitType1[r]);
			MondaySlot[1].add(cell1[r]);
		}
		
		JButton[] MondaySlot3;
		MondaySlot3 = new JButton[MondayTimeSlot3.size()];
		JPanel[] cell2;
		cell2 = new JPanel[MondayTimeSlot3.size()];
		visitType2 = new JPanel[MondayTimeSlot3.size()];
		
		for(int r = 0; r < MondayTimeSlot3.size(); r++){
			MondaySlot3[r] = new JButton();
			MondaySlot3[r].setText(MondayTimeSlot3.get(r).get(0));
			MondaySlot3[r].addActionListener(appListen);
			cell2[r] = new JPanel();
			cell2[r].setPreferredSize(new Dimension(106,20));
			xSlot = new BoxLayout(cell2[r],BoxLayout.X_AXIS);
			MondaySlot3[r].setPreferredSize(new Dimension(90,18));
			visitType2[r] = new JPanel();
			visitType2[r].setPreferredSize(new Dimension(7,15));
			visitType2[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(MondayTimeSlot3.get(r).get(16).equals("yes")){
				if(MondayTimeSlot3.get(r).get(18).equals("null")){
					visitType2[r].setBackground(Color.RED);
				}
				else{
					visitType2[r].setBackground(Color.GREEN);
				}
			}
			if(MondayTimeSlot3.get(r).get(16).equals("no")){
				if(MondayTimeSlot3.get(r).get(17).equals("yes")){
					visitType2[r].setBackground(Color.BLACK);
				}
			}
			cell2[r].add(MondaySlot3[r]);
			cell2[r].add(visitType2[r]);
			MondaySlot[2].add(cell2[r]);
		}
		
		JButton[] MondaySlot4;
		MondaySlot4 = new JButton[MondayTimeSlot4.size()];
		JPanel[] cell3;
		cell3 = new JPanel[MondayTimeSlot4.size()];
		visitType3 = new JPanel[MondayTimeSlot4.size()];
		
		for(int r = 0; r < MondayTimeSlot4.size(); r++){
			MondaySlot4[r] = new JButton();
			MondaySlot4[r].setText(MondayTimeSlot4.get(r).get(0));
			MondaySlot4[r].addActionListener(appListen);
			cell3[r] = new JPanel();
			cell3[r].setPreferredSize(new Dimension(106,20));
			xSlot = new BoxLayout(cell3[r],BoxLayout.X_AXIS);
			MondaySlot4[r].setPreferredSize(new Dimension(90,18));
			visitType3[r] = new JPanel();
			visitType3[r].setPreferredSize(new Dimension(7,15));
			visitType3[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(MondayTimeSlot4.get(r).get(16).equals("yes")){
				if(MondayTimeSlot4.get(r).get(18).equals("null")){
					visitType3[r].setBackground(Color.RED);
				}
				else{
					visitType3[r].setBackground(Color.GREEN);
				}
			}
			if(MondayTimeSlot4.get(r).get(16).equals("no")){
				if(MondayTimeSlot4.get(r).get(17).equals("yes")){
					visitType3[r].setBackground(Color.BLACK);
				}
			}
			cell3[r].add(MondaySlot4[r]);
			cell3[r].add(visitType3[r]);
			MondaySlot[3].add(cell3[r]);
		}
		
		JButton[] MondaySlot5;
		MondaySlot5 = new JButton[MondayTimeSlot5.size()];
		JPanel[] cell4;
		cell4 = new JPanel[MondayTimeSlot5.size()];
		visitType4 = new JPanel[MondayTimeSlot5.size()];
		
		for(int r = 0; r < MondayTimeSlot5.size(); r++){
			MondaySlot5[r] = new JButton();
			MondaySlot5[r].setText(MondayTimeSlot5.get(r).get(0));
			MondaySlot5[r].addActionListener(appListen);
			cell4[r] = new JPanel();
			cell4[r].setPreferredSize(new Dimension(106,20));
			xSlot = new BoxLayout(cell4[r],BoxLayout.X_AXIS);
			MondaySlot5[r].setPreferredSize(new Dimension(90,18));
			visitType4[r] = new JPanel();
			visitType4[r].setPreferredSize(new Dimension(7,15));
			visitType4[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(MondayTimeSlot5.get(r).get(16).equals("yes")){
				if(MondayTimeSlot5.get(r).get(18).equals("null")){
					visitType4[r].setBackground(Color.RED);
				}
				else{
					visitType4[r].setBackground(Color.GREEN);
				}
			}
			if(MondayTimeSlot5.get(r).get(16).equals("no")){
				if(MondayTimeSlot5.get(r).get(17).equals("yes")){
					visitType4[r].setBackground(Color.BLACK);
				}
			}
			cell4[r].add(MondaySlot5[r]);
			cell4[r].add(visitType4[r]);
			MondaySlot[4].add(cell4[r]);
		}
		
		// Tuesday
		JPanel[] TuesdaySlot;
		TuesdaySlot = new JPanel[6];
		GridLayout[] SlotLayout1;
		SlotLayout1 = new GridLayout[6];
		
		for(int x = 0; x < 6; x++){
			TuesdaySlot[x] = new JPanel();
			TuesdaySlot[x].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			SlotLayout1[x] = new GridLayout(0,2);
			TuesdaySlot[x].setLayout(SlotLayout1[x]);
		}
		
		JPanel[] TuesdayFiller;
		TuesdayFiller = new JPanel[6];
		
		int TuesdayinitialHour = 8;
		int TuesdayinitialMinute = 0;
		int Tuesdayhour;
		int Tuesdayminutes;
		int Tuesdaydifference;
		double TuesdaydubMin;
		int TuesdayIntMinPix;
		accumulativeHeight = 0;
		
		for(int m = 0; m < 6; m++){
			String TuesSlot;
			int numTours;
			int counter = 0;
			if(Tuesday1.get(m).equals("8:00")){
				numTours = TuesdayTimeSlot1.size();
				if(numTours % 2 == 0){
					TuesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
					accumulativeHeight = accumulativeHeight + (numTours/2)*20 + 12;
					SlotPanel[1].add(TuesdaySlot[m]);
				}
				else{
					TuesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
					accumulativeHeight = accumulativeHeight + ((numTours + 1)/2)*20 + 12;
					SlotPanel[1].add(TuesdaySlot[m]);
				}
			}
			else{
				if(m == 0){
					TuesSlot = Tuesday1.get(m);
					if(TuesSlot.length() == 4){
						Tuesdayhour = Integer.parseInt(TuesSlot.substring(0,1));
						Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
						if(Tuesdaydifference < 0){
							Tuesdayhour = Tuesdayhour + 12;
							Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
						}
						Tuesdayminutes = Integer.parseInt(TuesSlot.substring(2,4));
						Tuesdayminutes = Tuesdayminutes - TuesdayinitialMinute;
						Tuesdayminutes = Tuesdayminutes + Tuesdaydifference*60;
						TuesdaydubMin = Tuesdayminutes*2.5;
						TuesdayIntMinPix = (int)TuesdaydubMin;
						TuesdayFiller[counter] = new JPanel();
						TuesdayFiller[counter].setPreferredSize(new Dimension(216, TuesdayIntMinPix - accumulativeHeight));
						accumulativeHeight += (TuesdayIntMinPix - accumulativeHeight);
						SlotPanel[1].add(TuesdayFiller[counter]);
						numTours = TuesdayTimeSlot1.size();
						if(numTours % 2 == 0){
							TuesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
							accumulativeHeight += (numTours/2)*20 + 12;
							SlotPanel[1].add(TuesdaySlot[m]);
						}
						else{
							TuesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
							accumulativeHeight += ((numTours + 1)/2)*20 + 12;
							SlotPanel[1].add(TuesdaySlot[m]);
						}
					}
					else{
						Tuesdayhour = Integer.parseInt(TuesSlot.substring(0,2));
						Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
						if(Tuesdaydifference < 0){
							Tuesdayhour = Tuesdayhour + 12;
							Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
						}
						Tuesdayminutes = Integer.parseInt(TuesSlot.substring(3,5));
						Tuesdayminutes = Tuesdayminutes - TuesdayinitialMinute;
						Tuesdayminutes = Tuesdayminutes + Tuesdaydifference*60;
						TuesdaydubMin = Tuesdayminutes*2.5;
						TuesdayIntMinPix = (int)TuesdaydubMin;
						TuesdayFiller[counter] = new JPanel();
						TuesdayFiller[counter].setPreferredSize(new Dimension(216, TuesdayIntMinPix - accumulativeHeight));
						accumulativeHeight += (TuesdayIntMinPix - accumulativeHeight);
						SlotPanel[1].add(TuesdayFiller[counter]);
						numTours = TuesdayTimeSlot1.size();
						if(numTours % 2 == 0){
							TuesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
							accumulativeHeight += (numTours/2)*20 + 12;
							SlotPanel[1].add(TuesdaySlot[m]);
						}
						else{
							TuesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
							accumulativeHeight += ((numTours + 1)/2)*20 + 12;
							SlotPanel[1].add(TuesdaySlot[m]);
						}
					}
				}
					if(m == 1){
						TuesSlot = Tuesday1.get(m);
						if(TuesSlot.length() == 4){
							Tuesdayhour = Integer.parseInt(TuesSlot.substring(0,1));
							Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
							if(Tuesdaydifference < 0){
								Tuesdayhour = Tuesdayhour + 12;
								Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
							}
							Tuesdayminutes = Integer.parseInt(TuesSlot.substring(2,4));
							Tuesdayminutes = Tuesdayminutes - TuesdayinitialMinute;
							Tuesdayminutes = Tuesdayminutes + Tuesdaydifference*60;
							TuesdaydubMin = Tuesdayminutes*2.5;
							TuesdayIntMinPix = (int)TuesdaydubMin;
							TuesdayFiller[counter] = new JPanel();
							TuesdayFiller[counter].setPreferredSize(new Dimension(216, TuesdayIntMinPix - accumulativeHeight));
							accumulativeHeight += (TuesdayIntMinPix - accumulativeHeight);
							SlotPanel[1].add(TuesdayFiller[counter]);
							numTours = TuesdayTimeSlot2.size();
							if(numTours % 2 == 0){
								TuesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
								accumulativeHeight += (numTours/2)*20 + 12;
								SlotPanel[1].add(TuesdaySlot[m]);
							}
							else{
								TuesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
								accumulativeHeight += ((numTours + 1)/2)*20 + 12;
								SlotPanel[1].add(TuesdaySlot[m]);
							}
						}
					
						else{
							Tuesdayhour = Integer.parseInt(TuesSlot.substring(0,2));
							Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
							if(Tuesdaydifference < 0){
								Tuesdayhour = Tuesdayhour + 12;
								Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
							}
							Tuesdayminutes = Integer.parseInt(TuesSlot.substring(3,5));
							Tuesdayminutes = Tuesdayminutes - TuesdayinitialMinute;
							Tuesdayminutes = Tuesdayminutes + Tuesdaydifference*60;
							TuesdaydubMin = Tuesdayminutes*2.5;
							TuesdayIntMinPix = (int)TuesdaydubMin;
							TuesdayFiller[counter] = new JPanel();
							TuesdayFiller[counter].setPreferredSize(new Dimension(216, TuesdayIntMinPix - accumulativeHeight));
							accumulativeHeight += (TuesdayIntMinPix - accumulativeHeight);
							SlotPanel[1].add(TuesdayFiller[counter]);
							numTours = TuesdayTimeSlot2.size();
							if(numTours % 2 == 0){
								TuesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
								accumulativeHeight += (numTours/2)*20 + 12;
								SlotPanel[1].add(TuesdaySlot[m]);
							}
							else{
								TuesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
								accumulativeHeight += ((numTours + 1)/2)*20 + 12;
								SlotPanel[1].add(TuesdaySlot[m]);
							}
						}
					}
						if(m == 2){
							TuesSlot = Tuesday1.get(m);
							if(TuesSlot.length() == 4){
								Tuesdayhour = Integer.parseInt(TuesSlot.substring(0,1));
								Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
								if(Tuesdaydifference < 0){
									Tuesdayhour = Tuesdayhour + 12;
									Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
								}
								Tuesdayminutes = Integer.parseInt(TuesSlot.substring(2,4));
								Tuesdayminutes = Tuesdayminutes - TuesdayinitialMinute;
								Tuesdayminutes = Tuesdayminutes + Tuesdaydifference*60;
								TuesdaydubMin = Tuesdayminutes*2.5;
								TuesdayIntMinPix = (int)TuesdaydubMin;
								TuesdayFiller[counter] = new JPanel();
								TuesdayFiller[counter].setPreferredSize(new Dimension(216, TuesdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (TuesdayIntMinPix - accumulativeHeight);
								SlotPanel[1].add(TuesdayFiller[counter]);
								numTours = TuesdayTimeSlot3.size();
								if(numTours % 2 == 0){
									TuesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[1].add(TuesdaySlot[m]);
								}
								else{
									TuesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[1].add(TuesdaySlot[m]);
								}
							}
							else{
								Tuesdayhour = Integer.parseInt(TuesSlot.substring(0,2));
								Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
								if(Tuesdaydifference < 0){
									Tuesdayhour = Tuesdayhour + 12;
									Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
								}
								Tuesdayminutes = Integer.parseInt(TuesSlot.substring(3,5));
								Tuesdayminutes = Tuesdayminutes - TuesdayinitialMinute;
								Tuesdayminutes = Tuesdayminutes + Tuesdaydifference*60;
								TuesdaydubMin = Tuesdayminutes*2.5;
								TuesdayIntMinPix = (int)TuesdaydubMin;
								TuesdayFiller[counter] = new JPanel();
								TuesdayFiller[counter].setPreferredSize(new Dimension(216, TuesdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (TuesdayIntMinPix - accumulativeHeight);
								SlotPanel[1].add(TuesdayFiller[counter]);
								numTours = TuesdayTimeSlot3.size();
								if(numTours % 2 == 0){
									TuesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[1].add(TuesdaySlot[m]);
								}
								else{
									TuesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[1].add(TuesdaySlot[m]);
								}
							}
						}
						
						if(m == 3){
							TuesSlot = Tuesday1.get(m);
							if(TuesSlot.length() == 4){
								Tuesdayhour = Integer.parseInt(TuesSlot.substring(0,1));
								Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
								if(Tuesdaydifference < 0){
									Tuesdayhour = Tuesdayhour + 12;
									Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
								}
								Tuesdayminutes = Integer.parseInt(TuesSlot.substring(2,4));
								Tuesdayminutes = Tuesdayminutes - TuesdayinitialMinute;
								Tuesdayminutes = Tuesdayminutes + Tuesdaydifference*60;
								TuesdaydubMin = Tuesdayminutes*2.5;
								TuesdayIntMinPix = (int)TuesdaydubMin;
								TuesdayFiller[counter] = new JPanel();
								TuesdayFiller[counter].setPreferredSize(new Dimension(216, TuesdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (TuesdayIntMinPix - accumulativeHeight);
								SlotPanel[1].add(TuesdayFiller[counter]);
								numTours = TuesdayTimeSlot4.size();
								if(numTours % 2 == 0){
									TuesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[1].add(TuesdaySlot[m]);
								}
								else{
									TuesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[1].add(TuesdaySlot[m]);
								}
							}
							else{
								Tuesdayhour = Integer.parseInt(TuesSlot.substring(0,2));
								Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
								if(Tuesdaydifference < 0){
									Tuesdayhour = Tuesdayhour + 12;
									Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
								}
								Tuesdayminutes = Integer.parseInt(TuesSlot.substring(3,5));
								Tuesdayminutes = Tuesdayminutes - TuesdayinitialMinute;
								Tuesdayminutes = Tuesdayminutes + Tuesdaydifference*60;
								TuesdaydubMin = Tuesdayminutes*2.5;
								TuesdayIntMinPix = (int)TuesdaydubMin;
								TuesdayFiller[counter] = new JPanel();
								TuesdayFiller[counter].setPreferredSize(new Dimension(216, TuesdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (TuesdayIntMinPix - accumulativeHeight);
								SlotPanel[1].add(TuesdayFiller[counter]);
								numTours = TuesdayTimeSlot4.size();
								if(numTours % 2 == 0){
									TuesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[1].add(TuesdaySlot[m]);
								}
								else{
									TuesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[1].add(TuesdaySlot[m]);
								}
							}
						}
						if(m == 4){
							TuesSlot = Tuesday1.get(m);
							if(TuesSlot.length() == 4){
								Tuesdayhour = Integer.parseInt(TuesSlot.substring(0,1));
								Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
								if(Tuesdaydifference < 0){
									Tuesdayhour = Tuesdayhour + 12;
									Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
								}
								Tuesdayminutes = Integer.parseInt(TuesSlot.substring(2,4));
								Tuesdayminutes = Tuesdayminutes - TuesdayinitialMinute;
								Tuesdayminutes = Tuesdayminutes + Tuesdaydifference*60;
								TuesdaydubMin = Tuesdayminutes*2.5;
								TuesdayIntMinPix = (int)TuesdaydubMin;
								TuesdayFiller[counter] = new JPanel();
								TuesdayFiller[counter].setPreferredSize(new Dimension(216, TuesdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (TuesdayIntMinPix - accumulativeHeight);
								SlotPanel[1].add(TuesdayFiller[counter]);
								numTours = TuesdayTimeSlot5.size();
								if(numTours % 2 == 0){
									TuesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[1].add(TuesdaySlot[m]);
								}
								else{
									TuesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[1].add(TuesdaySlot[m]);
								}
							}
							else{
								Tuesdayhour = Integer.parseInt(TuesSlot.substring(0,2));
								Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
								if(Tuesdaydifference < 0){
									Tuesdayhour = Tuesdayhour + 12;
									Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
								}
								Tuesdayminutes = Integer.parseInt(TuesSlot.substring(3,5));
								Tuesdayminutes = Tuesdayminutes - TuesdayinitialMinute;
								Tuesdayminutes = Tuesdayminutes + Tuesdaydifference*60;
								TuesdaydubMin = Tuesdayminutes*2.5;
								TuesdayIntMinPix = (int)TuesdaydubMin;
								TuesdayFiller[counter] = new JPanel();
								TuesdayFiller[counter].setPreferredSize(new Dimension(216, TuesdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (TuesdayIntMinPix - accumulativeHeight);
								SlotPanel[1].add(TuesdayFiller[counter]);
								numTours = TuesdayTimeSlot5.size();
								if(numTours % 2 == 0){
									TuesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[1].add(TuesdaySlot[m]);
								}
								else{
									TuesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[1].add(TuesdaySlot[m]);
								}
							}
						}
						if(m == 5){
							TuesSlot = Tuesday1.get(m);
							if(TuesSlot.length() == 4){
								Tuesdayhour = Integer.parseInt(TuesSlot.substring(0,1));
								Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
								if(Tuesdaydifference < 0){
									Tuesdayhour = Tuesdayhour + 12;
									Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
								}
								Tuesdayminutes = Integer.parseInt(TuesSlot.substring(2,4));
								Tuesdayminutes = Tuesdayminutes - TuesdayinitialMinute;
								Tuesdayminutes = Tuesdayminutes + Tuesdaydifference*60;
								TuesdaydubMin = Tuesdayminutes*2.5;
								TuesdayIntMinPix = (int)TuesdaydubMin;
								TuesdayFiller[counter] = new JPanel();
								TuesdayFiller[counter].setPreferredSize(new Dimension(216, TuesdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (TuesdayIntMinPix - accumulativeHeight);
								SlotPanel[1].add(TuesdayFiller[counter]);
								numTours = TuesdayTimeSlot6.size();
								if(numTours % 2 == 0){
									TuesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[1].add(TuesdaySlot[m]);
								}
								else{
									TuesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[1].add(TuesdaySlot[m]);
								}
							}
							else{
								Tuesdayhour = Integer.parseInt(TuesSlot.substring(0,2));
								Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
								if(Tuesdaydifference < 0){
									Tuesdayhour = Tuesdayhour + 12;
									Tuesdaydifference = Tuesdayhour - TuesdayinitialHour;
								}
								Tuesdayminutes = Integer.parseInt(TuesSlot.substring(3,5));
								Tuesdayminutes = Tuesdayminutes - TuesdayinitialMinute;
								Tuesdayminutes = Tuesdayminutes + Tuesdaydifference*60;
								TuesdaydubMin = Tuesdayminutes*2.5;
								TuesdayIntMinPix = (int)TuesdaydubMin;
								TuesdayFiller[counter] = new JPanel();
								TuesdayFiller[counter].setPreferredSize(new Dimension(216, TuesdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (TuesdayIntMinPix - accumulativeHeight);
								SlotPanel[1].add(TuesdayFiller[counter]);
								numTours = TuesdayTimeSlot6.size();
								if(numTours % 2 == 0){
									TuesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[1].add(TuesdaySlot[m]);
								}
								else{
									TuesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[1].add(TuesdaySlot[m]);
								}
							}
						}
				}

			}
		
		JButton[] TuesdaySlot1;
		TuesdaySlot1 = new JButton[TuesdayTimeSlot1.size()];
		JPanel[] Tuescell;
		Tuescell = new JPanel[TuesdayTimeSlot1.size()];
		JPanel[] TuesvisitType;
		TuesvisitType = new JPanel[TuesdayTimeSlot1.size()];
		BoxLayout TuesxSlot;
		
		for(int r = 0; r < TuesdayTimeSlot1.size(); r++){
			TuesdaySlot1[r] = new JButton();
			TuesdaySlot1[r].setText(TuesdayTimeSlot1.get(r).get(0));
			TuesdaySlot1[r].addActionListener(appListen);
			Tuescell[r] = new JPanel();
			Tuescell[r].setPreferredSize(new Dimension(106,20));
			TuesxSlot = new BoxLayout(Tuescell[r],BoxLayout.X_AXIS);
			TuesdaySlot1[r].setPreferredSize(new Dimension(90,18));
			TuesvisitType[r] = new JPanel();
			TuesvisitType[r].setPreferredSize(new Dimension(7,15));
			TuesvisitType[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(TuesdayTimeSlot1.get(r).get(16).equals("yes")){
				if(TuesdayTimeSlot1.get(r).get(18).equals("null")){
					TuesvisitType[r].setBackground(Color.RED);
				}
				else{
					TuesvisitType[r].setBackground(Color.GREEN);
				}
			}
			if(TuesdayTimeSlot1.get(r).get(16).equals("no")){
				if(TuesdayTimeSlot1.get(r).get(17).equals("yes")){
					TuesvisitType[r].setBackground(Color.BLACK);
				}
			}
			Tuescell[r].add(TuesdaySlot1[r]);
			Tuescell[r].add(TuesvisitType[r]);
			TuesdaySlot[0].add(Tuescell[r]);
		}
		
		
		JButton[] TuesdaySlot2;
		TuesdaySlot2 = new JButton[TuesdayTimeSlot2.size()];
		JPanel[] Tuescell1;
		Tuescell1 = new JPanel[TuesdayTimeSlot2.size()];
		JPanel[] TuesvisitType1;
		TuesvisitType1 = new JPanel[TuesdayTimeSlot2.size()];
		
		for(int r = 0; r < TuesdayTimeSlot2.size(); r++){
			TuesdaySlot2[r] = new JButton();
			TuesdaySlot2[r].setText(TuesdayTimeSlot2.get(r).get(0));
			TuesdaySlot2[r].addActionListener(appListen);
			Tuescell1[r] = new JPanel();
			Tuescell1[r].setPreferredSize(new Dimension(106,20));
			TuesxSlot = new BoxLayout(Tuescell1[r],BoxLayout.X_AXIS);
			TuesdaySlot2[r].setPreferredSize(new Dimension(90,18));
			TuesvisitType1[r] = new JPanel();
			TuesvisitType1[r].setPreferredSize(new Dimension(7,15));
			TuesvisitType1[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(TuesdayTimeSlot2.get(r).get(16).equals("yes")){
				if(TuesdayTimeSlot2.get(r).get(18).equals("null")){
					TuesvisitType1[r].setBackground(Color.RED);
				}
				else{
					TuesvisitType1[r].setBackground(Color.GREEN);
				}
			}
			if(TuesdayTimeSlot2.get(r).get(16).equals("no")){
				if(TuesdayTimeSlot2.get(r).get(17).equals("yes")){
					TuesvisitType1[r].setBackground(Color.BLACK);
				}
			}
			Tuescell1[r].add(TuesdaySlot2[r]);
			Tuescell1[r].add(TuesvisitType1[r]);
			TuesdaySlot[1].add(Tuescell1[r]);
		}
		
		JButton[] TuesdaySlot3;
		TuesdaySlot3 = new JButton[TuesdayTimeSlot3.size()];
		JPanel[] Tuescell2;
		Tuescell2 = new JPanel[TuesdayTimeSlot3.size()];
		JPanel[] TuesvisitType2;
		TuesvisitType2 = new JPanel[TuesdayTimeSlot3.size()];
		
		for(int r = 0; r < TuesdayTimeSlot3.size(); r++){
			TuesdaySlot3[r] = new JButton();
			TuesdaySlot3[r].setText(TuesdayTimeSlot3.get(r).get(0));
			TuesdaySlot3[r].addActionListener(appListen);
			Tuescell2[r] = new JPanel();
			Tuescell2[r].setPreferredSize(new Dimension(106,20));
			TuesxSlot = new BoxLayout(Tuescell2[r],BoxLayout.X_AXIS);
			TuesdaySlot3[r].setPreferredSize(new Dimension(90,18));
			TuesvisitType2[r] = new JPanel();
			TuesvisitType2[r].setPreferredSize(new Dimension(7,15));
			TuesvisitType2[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(TuesdayTimeSlot3.get(r).get(16).equals("yes")){
				if(TuesdayTimeSlot3.get(r).get(18).equals("null")){
					TuesvisitType2[r].setBackground(Color.RED);
				}
				else{
					TuesvisitType2[r].setBackground(Color.GREEN);
				}
			}
			if(TuesdayTimeSlot3.get(r).get(16).equals("no")){
				if(TuesdayTimeSlot3.get(r).get(17).equals("yes")){
					TuesvisitType2[r].setBackground(Color.BLACK);
				}
			}
			Tuescell2[r].add(TuesdaySlot3[r]);
			Tuescell2[r].add(TuesvisitType2[r]);
			TuesdaySlot[2].add(Tuescell2[r]);
		}
		
		JButton[] TuesdaySlot4;
		TuesdaySlot4 = new JButton[TuesdayTimeSlot4.size()];
		JPanel[] Tuescell3;
		Tuescell3 = new JPanel[TuesdayTimeSlot4.size()];
		JPanel[] TuesvisitType3;
		TuesvisitType3 = new JPanel[TuesdayTimeSlot4.size()];
		
		for(int r = 0; r < TuesdayTimeSlot4.size(); r++){
			TuesdaySlot4[r] = new JButton();
			TuesdaySlot4[r].setText(TuesdayTimeSlot4.get(r).get(0));
			TuesdaySlot4[r].addActionListener(appListen);
			Tuescell3[r] = new JPanel();
			Tuescell3[r].setPreferredSize(new Dimension(106,20));
			TuesxSlot = new BoxLayout(Tuescell3[r],BoxLayout.X_AXIS);
			TuesdaySlot4[r].setPreferredSize(new Dimension(90,18));
			TuesvisitType3[r] = new JPanel();
			TuesvisitType3[r].setPreferredSize(new Dimension(7,15));
			TuesvisitType3[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(TuesdayTimeSlot4.get(r).get(16).equals("yes")){
				if(TuesdayTimeSlot4.get(r).get(18).equals("null")){
					TuesvisitType3[r].setBackground(Color.RED);
				}
				else{
					TuesvisitType3[r].setBackground(Color.GREEN);
				}
			}
			if(TuesdayTimeSlot4.get(r).get(16).equals("no")){
				if(TuesdayTimeSlot4.get(r).get(17).equals("yes")){
					TuesvisitType3[r].setBackground(Color.BLACK);
				}
			}
			Tuescell3[r].add(TuesdaySlot4[r]);
			Tuescell3[r].add(TuesvisitType3[r]);
			TuesdaySlot[3].add(Tuescell3[r]);
		}
		
		JButton[] TuesdaySlot5;
		TuesdaySlot5 = new JButton[TuesdayTimeSlot5.size()];
		JPanel[] Tuescell4;
		Tuescell4 = new JPanel[TuesdayTimeSlot5.size()];
		JPanel[] TuesvisitType4;
		TuesvisitType4 = new JPanel[TuesdayTimeSlot5.size()];
		
		for(int r = 0; r < TuesdayTimeSlot5.size(); r++){
			TuesdaySlot5[r] = new JButton();
			TuesdaySlot5[r].setText(TuesdayTimeSlot5.get(r).get(0));
			TuesdaySlot5[r].addActionListener(appListen);
			Tuescell4[r] = new JPanel();
			Tuescell4[r].setPreferredSize(new Dimension(106,20));
			TuesxSlot = new BoxLayout(Tuescell4[r],BoxLayout.X_AXIS);
			TuesdaySlot5[r].setPreferredSize(new Dimension(90,18));
			TuesvisitType4[r] = new JPanel();
			TuesvisitType4[r].setPreferredSize(new Dimension(7,15));
			TuesvisitType4[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(TuesdayTimeSlot5.get(r).get(16).equals("yes")){
				if(TuesdayTimeSlot5.get(r).get(18).equals("null")){
					TuesvisitType4[r].setBackground(Color.RED);
				}
				else{
					TuesvisitType4[r].setBackground(Color.GREEN);
				}
			}
			if(TuesdayTimeSlot5.get(r).get(16).equals("no")){
				if(TuesdayTimeSlot5.get(r).get(17).equals("yes")){
					TuesvisitType4[r].setBackground(Color.BLACK);
				}
			}
			Tuescell4[r].add(TuesdaySlot5[r]);
			Tuescell4[r].add(TuesvisitType4[r]);
			TuesdaySlot[4].add(Tuescell4[r]);
		}
		
		JButton[] TuesdaySlot6;
		TuesdaySlot6 = new JButton[TuesdayTimeSlot6.size()];
		JPanel[] Tuescell5;
		Tuescell5 = new JPanel[TuesdayTimeSlot6.size()];
		JPanel[] TuesvisitType5;
		TuesvisitType5 = new JPanel[TuesdayTimeSlot6.size()];
		
		for(int r = 0; r < TuesdayTimeSlot6.size(); r++){
			TuesdaySlot6[r] = new JButton();
			TuesdaySlot6[r].setText(TuesdayTimeSlot6.get(r).get(0));
			TuesdaySlot6[r].addActionListener(appListen);
			Tuescell5[r] = new JPanel();
			Tuescell5[r].setPreferredSize(new Dimension(106,20));
			TuesxSlot = new BoxLayout(Tuescell5[r],BoxLayout.X_AXIS);
			TuesdaySlot6[r].setPreferredSize(new Dimension(90,18));
			TuesvisitType5[r] = new JPanel();
			TuesvisitType5[r].setPreferredSize(new Dimension(7,15));
			TuesvisitType5[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(TuesdayTimeSlot6.get(r).get(16).equals("yes")){
				if(TuesdayTimeSlot6.get(r).get(18).equals("null")){
					TuesvisitType5[r].setBackground(Color.RED);
				}
				else{
					TuesvisitType5[r].setBackground(Color.GREEN);
				}
			}
			if(TuesdayTimeSlot6.get(r).get(16).equals("no")){
				if(TuesdayTimeSlot6.get(r).get(17).equals("yes")){
					TuesvisitType5[r].setBackground(Color.BLACK);
				}
			}
			Tuescell5[r].add(TuesdaySlot6[r]);
			Tuescell5[r].add(TuesvisitType5[r]);
			TuesdaySlot[5].add(Tuescell5[r]);
		}
		
		
		// Wednesday
		JPanel[] WednesdaySlot;
		WednesdaySlot = new JPanel[5];
		GridLayout[] GridWednesday;
		GridWednesday = new GridLayout[5];
		
		for(int q = 0; q < 5; q++){
			WednesdaySlot[q] = new JPanel();
			WednesdaySlot[q].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			GridWednesday[q] = new GridLayout(0,2);
			WednesdaySlot[q].setLayout(GridWednesday[q]);
		}
		
		JPanel[] WednesdayFiller;
		WednesdayFiller = new JPanel[6];
		
		int WednesdayinitialHour = 8;
		int WednesdayinitialMinute = 0;
		int Wednesdayhour;
		int Wednesdayminutes;
		int Wednesdaydifference;
		double WednesdaydubMin;
		int WednesdayIntMinPix;
		accumulativeHeight = 0;
		
		for(int m = 0; m < 5; m++){
			String WedSlot;
			int numTours;
			int counter = 0;
			if(Wednesday1.get(m).equals("8:00")){
				numTours = WednesdayTimeSlot1.size();
				if(numTours % 2 == 0){
					WednesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
					accumulativeHeight = accumulativeHeight + (numTours/2)*20 + 12;
					SlotPanel[2].add(WednesdaySlot[m]);
				}
				else{
					WednesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
					accumulativeHeight = accumulativeHeight + ((numTours + 1)/2)*20 + 12;
					SlotPanel[2].add(WednesdaySlot[m]);
				}
			}
			else{
				if(m == 0){
					WedSlot = Wednesday1.get(m);
					if(WedSlot.length() == 4){
						Wednesdayhour = Integer.parseInt(WedSlot.substring(0,1));
						Wednesdaydifference = Wednesdayhour - WednesdayinitialHour;
						if(Wednesdaydifference < 0){
							Wednesdayhour = Wednesdayhour + 12;
							Wednesdaydifference = Wednesdayhour - WednesdayinitialHour;
						}
						Wednesdayminutes = Integer.parseInt(WedSlot.substring(2,4));
						Wednesdayminutes = Wednesdayminutes - WednesdayinitialMinute;
						Wednesdayminutes = Wednesdayminutes + Wednesdaydifference*60;
						WednesdaydubMin = Wednesdayminutes*2.5;
						WednesdayIntMinPix = (int)WednesdaydubMin;
						WednesdayFiller[counter] = new JPanel();
						WednesdayFiller[counter].setPreferredSize(new Dimension(216, WednesdayIntMinPix - accumulativeHeight));
						accumulativeHeight += (WednesdayIntMinPix - accumulativeHeight);
						SlotPanel[2].add(WednesdayFiller[counter]);
						numTours = WednesdayTimeSlot1.size();
						if(numTours % 2 == 0){
							WednesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
							accumulativeHeight += (numTours/2)*20 + 12;
							SlotPanel[2].add(WednesdaySlot[m]);
						}
						else{
							WednesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
							accumulativeHeight += ((numTours + 1)/2)*20 + 12;
							SlotPanel[2].add(WednesdaySlot[m]);
						}
					}
					else{
						Wednesdayhour = Integer.parseInt(WedSlot.substring(0,2));
						Wednesdaydifference = Wednesdayhour - WednesdayinitialHour;
						if(Wednesdaydifference < 0){
							Wednesdayhour = Wednesdayhour + 12;
							Wednesdaydifference = Wednesdayhour - WednesdayinitialHour;
						}
						Wednesdayminutes = Integer.parseInt(WedSlot.substring(3,5));
						Wednesdayminutes = Wednesdayminutes - WednesdayinitialMinute;
						Wednesdayminutes = Wednesdayminutes + Wednesdaydifference*60;
						WednesdaydubMin = Wednesdayminutes*2.5;
						WednesdayIntMinPix = (int)WednesdaydubMin;
						WednesdayFiller[counter] = new JPanel();
						WednesdayFiller[counter].setPreferredSize(new Dimension(216, WednesdayIntMinPix - accumulativeHeight));
						accumulativeHeight += (WednesdayIntMinPix - accumulativeHeight);
						SlotPanel[2].add(WednesdayFiller[counter]);
						numTours = WednesdayTimeSlot1.size();
						if(numTours % 2 == 0){
							WednesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
							accumulativeHeight += (numTours/2)*20 + 12;
							SlotPanel[2].add(WednesdaySlot[m]);
						}
						else{
							WednesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
							accumulativeHeight += ((numTours + 1)/2)*20 + 12;
							SlotPanel[2].add(WednesdaySlot[m]);
						}
					}
				}
					if(m == 1){
						WedSlot = Wednesday1.get(m);
						if(WedSlot.length() == 4){
							Wednesdayhour = Integer.parseInt(WedSlot.substring(0,1));
							Wednesdaydifference = Wednesdayhour - WednesdayinitialHour;
							if(Wednesdaydifference < 0){
								Wednesdayhour = Wednesdayhour + 12;
								Wednesdaydifference = Wednesdayhour - WednesdayinitialHour;
							}
							Wednesdayminutes = Integer.parseInt(WedSlot.substring(2,4));
							Wednesdayminutes = Wednesdayminutes - WednesdayinitialMinute;
							Wednesdayminutes = Wednesdayminutes + Wednesdaydifference*60;
							WednesdaydubMin = Wednesdayminutes*2.5;
							WednesdayIntMinPix = (int)WednesdaydubMin;
							WednesdayFiller[counter] = new JPanel();
							WednesdayFiller[counter].setPreferredSize(new Dimension(216, WednesdayIntMinPix - accumulativeHeight));
							accumulativeHeight += (WednesdayIntMinPix - accumulativeHeight);
							SlotPanel[2].add(WednesdayFiller[counter]);
							numTours = WednesdayTimeSlot2.size();
							if(numTours % 2 == 0){
								WednesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
								accumulativeHeight += (numTours/2)*20 + 12;
								SlotPanel[2].add(WednesdaySlot[m]);
							}
							else{
								WednesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
								accumulativeHeight += ((numTours + 1)/2)*20 + 12;
								SlotPanel[2].add(WednesdaySlot[m]);
							}
						}
					
						else{
							Wednesdayhour = Integer.parseInt(WedSlot.substring(0,2));
							Wednesdaydifference = Wednesdayhour - WednesdayinitialHour;
							if(Wednesdaydifference < 0){
								Wednesdayhour = Wednesdayhour + 12;
								Wednesdaydifference = Wednesdayhour - WednesdayinitialHour;
							}
							Wednesdayminutes = Integer.parseInt(WedSlot.substring(3,5));
							Wednesdayminutes = Wednesdayminutes - WednesdayinitialMinute;
							Wednesdayminutes = Wednesdayminutes + Wednesdaydifference*60;
							WednesdaydubMin = Wednesdayminutes*2.5;
							WednesdayIntMinPix = (int)WednesdaydubMin;
							WednesdayFiller[counter] = new JPanel();
							WednesdayFiller[counter].setPreferredSize(new Dimension(216, WednesdayIntMinPix - accumulativeHeight));
							accumulativeHeight += (WednesdayIntMinPix - accumulativeHeight);
							SlotPanel[2].add(WednesdayFiller[counter]);
							numTours = WednesdayTimeSlot2.size();
							if(numTours % 2 == 0){
								WednesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
								accumulativeHeight += (numTours/2)*20 + 12;
								SlotPanel[2].add(WednesdaySlot[m]);
							}
							else{
								WednesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
								accumulativeHeight += ((numTours + 1)/2)*20 + 12;
								SlotPanel[2].add(WednesdaySlot[m]);
							}
						}
					}
						if(m == 2){
							WedSlot = Wednesday1.get(m);
							if(WedSlot.length() == 4){
								Wednesdayhour = Integer.parseInt(WedSlot.substring(0,1));
								Wednesdaydifference = Wednesdayhour - WednesdayinitialHour;
								if(Wednesdaydifference < 0){
									Wednesdayhour = Wednesdayhour + 12;
									Wednesdaydifference = Wednesdayhour - WednesdayinitialHour;
								}
								Wednesdayminutes = Integer.parseInt(WedSlot.substring(2,4));
								Wednesdayminutes = Wednesdayminutes - WednesdayinitialMinute;
								Wednesdayminutes = Wednesdayminutes + Wednesdaydifference*60;
								WednesdaydubMin = Wednesdayminutes*2.5;
								WednesdayIntMinPix = (int)WednesdaydubMin;
								WednesdayFiller[counter] = new JPanel();
								WednesdayFiller[counter].setPreferredSize(new Dimension(216, WednesdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (WednesdayIntMinPix - accumulativeHeight);
								SlotPanel[2].add(WednesdayFiller[counter]);
								numTours = WednesdayTimeSlot3.size();
								if(numTours % 2 == 0){
									WednesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[2].add(WednesdaySlot[m]);
								}
								else{
									WednesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[2].add(WednesdaySlot[m]);
								}
							}
							else{
								Wednesdayhour = Integer.parseInt(WedSlot.substring(0,2));
								Wednesdaydifference = Wednesdayhour - WednesdayinitialHour;
								if(Wednesdaydifference < 0){
									Wednesdayhour = Wednesdayhour + 12;
									Wednesdaydifference = Wednesdayhour - WednesdayinitialHour;
								}
								Wednesdayminutes = Integer.parseInt(WedSlot.substring(3,5));
								Wednesdayminutes = Wednesdayminutes - WednesdayinitialMinute;
								Wednesdayminutes = Wednesdayminutes + Wednesdaydifference*60;
								WednesdaydubMin = Wednesdayminutes*2.5;
								WednesdayIntMinPix = (int)WednesdaydubMin;
								WednesdayFiller[counter] = new JPanel();
								WednesdayFiller[counter].setPreferredSize(new Dimension(216, WednesdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (WednesdayIntMinPix - accumulativeHeight);
								SlotPanel[2].add(WednesdayFiller[counter]);
								numTours = WednesdayTimeSlot3.size();
								if(numTours % 2 == 0){
									WednesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[2].add(WednesdaySlot[m]);
								}
								else{
									WednesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[2].add(WednesdaySlot[m]);
								}
							}
						}
						
						if(m == 3){
							WedSlot = Wednesday1.get(m);
							if(WedSlot.length() == 4){
								Wednesdayhour = Integer.parseInt(WedSlot.substring(0,1));
								Wednesdaydifference = Wednesdayhour - WednesdayinitialHour;
								if(Wednesdaydifference < 0){
									Wednesdayhour = Wednesdayhour + 12;
									Wednesdaydifference = Wednesdayhour - WednesdayinitialHour;
								}
								Wednesdayminutes = Integer.parseInt(WedSlot.substring(2,4));
								Wednesdayminutes = Wednesdayminutes - WednesdayinitialMinute;
								Wednesdayminutes = Wednesdayminutes + Wednesdaydifference*60;
								WednesdaydubMin = Wednesdayminutes*2.5;
								WednesdayIntMinPix = (int)WednesdaydubMin;
								WednesdayFiller[counter] = new JPanel();
								WednesdayFiller[counter].setPreferredSize(new Dimension(216, WednesdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (WednesdayIntMinPix - accumulativeHeight);
								SlotPanel[2].add(WednesdayFiller[counter]);
								numTours = WednesdayTimeSlot4.size();
								if(numTours % 2 == 0){
									WednesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[2].add(WednesdaySlot[m]);
								}
								else{
									WednesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[2].add(WednesdaySlot[m]);
								}
							}
							else{
								Wednesdayhour = Integer.parseInt(WedSlot.substring(0,2));
								Wednesdaydifference = Wednesdayhour - WednesdayinitialHour;
								if(Wednesdaydifference < 0){
									Wednesdayhour = Wednesdayhour + 12;
									Wednesdaydifference = Wednesdayhour - WednesdayinitialHour;
								}
								Wednesdayminutes = Integer.parseInt(WedSlot.substring(3,5));
								Wednesdayminutes = Wednesdayminutes - WednesdayinitialMinute;
								Wednesdayminutes = Wednesdayminutes + Wednesdaydifference*60;
								WednesdaydubMin = Wednesdayminutes*2.5;
								WednesdayIntMinPix = (int)WednesdaydubMin;
								WednesdayFiller[counter] = new JPanel();
								WednesdayFiller[counter].setPreferredSize(new Dimension(216, WednesdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (WednesdayIntMinPix - accumulativeHeight);
								SlotPanel[2].add(WednesdayFiller[counter]);
								numTours = WednesdayTimeSlot4.size();
								if(numTours % 2 == 0){
									WednesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[2].add(WednesdaySlot[m]);
								}
								else{
									WednesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[2].add(WednesdaySlot[m]);
								}
							}
						}
						if(m == 4){
							WedSlot = Wednesday1.get(m);
							if(WedSlot.length() == 4){
								Wednesdayhour = Integer.parseInt(WedSlot.substring(0,1));
								Wednesdaydifference = Wednesdayhour - WednesdayinitialHour;
								if(Wednesdaydifference < 0){
									Wednesdayhour = Wednesdayhour + 12;
									Wednesdaydifference = Wednesdayhour - WednesdayinitialHour;
								}
								Wednesdayminutes = Integer.parseInt(WedSlot.substring(2,4));
								Wednesdayminutes = Wednesdayminutes - WednesdayinitialMinute;
								Wednesdayminutes = Wednesdayminutes + Wednesdaydifference*60;
								WednesdaydubMin = Wednesdayminutes*2.5;
								WednesdayIntMinPix = (int)WednesdaydubMin;
								WednesdayFiller[counter] = new JPanel();
								WednesdayFiller[counter].setPreferredSize(new Dimension(216, WednesdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (WednesdayIntMinPix - accumulativeHeight);
								SlotPanel[2].add(WednesdayFiller[counter]);
								numTours = WednesdayTimeSlot5.size();
								if(numTours % 2 == 0){
									WednesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[2].add(WednesdaySlot[m]);
								}
								else{
									WednesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[2].add(WednesdaySlot[m]);
								}
							}
							else{
								Wednesdayhour = Integer.parseInt(WedSlot.substring(0,2));
								Wednesdaydifference = Wednesdayhour - WednesdayinitialHour;
								if(Wednesdaydifference < 0){
									Wednesdayhour = Wednesdayhour + 12;
									Wednesdaydifference = Wednesdayhour - WednesdayinitialHour;
								}
								Wednesdayminutes = Integer.parseInt(WedSlot.substring(3,5));
								Wednesdayminutes = Wednesdayminutes - WednesdayinitialMinute;
								Wednesdayminutes = Wednesdayminutes + Wednesdaydifference*60;
								WednesdaydubMin = Wednesdayminutes*2.5;
								WednesdayIntMinPix = (int)WednesdaydubMin;
								WednesdayFiller[counter] = new JPanel();
								WednesdayFiller[counter].setPreferredSize(new Dimension(216, WednesdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (WednesdayIntMinPix - accumulativeHeight);
								SlotPanel[2].add(WednesdayFiller[counter]);
								numTours = WednesdayTimeSlot5.size();
								if(numTours % 2 == 0){
									WednesdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[2].add(WednesdaySlot[m]);
								}
								else{
									WednesdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[2].add(WednesdaySlot[m]);
								}
							}
						}
				}

			}
		
		JButton[] WednesdaySlot1;
		WednesdaySlot1 = new JButton[WednesdayTimeSlot1.size()];
		JPanel[] Wedcell;
		Wedcell = new JPanel[WednesdayTimeSlot1.size()];
		JPanel[] WedvisitType;
		WedvisitType = new JPanel[WednesdayTimeSlot1.size()];
		BoxLayout WedxSlot;
		
		for(int r = 0; r < WednesdayTimeSlot1.size(); r++){
			WednesdaySlot1[r] = new JButton();
			WednesdaySlot1[r].setText(WednesdayTimeSlot1.get(r).get(0));
			WednesdaySlot1[r].addActionListener(appListen);
			Wedcell[r] = new JPanel();
			Wedcell[r].setPreferredSize(new Dimension(106,20));
			WedxSlot = new BoxLayout(Wedcell[r],BoxLayout.X_AXIS);
			WednesdaySlot1[r].setPreferredSize(new Dimension(90,18));
			WedvisitType[r] = new JPanel();
			WedvisitType[r].setPreferredSize(new Dimension(7,15));
			WedvisitType[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(WednesdayTimeSlot1.get(r).get(16).equals("yes")){
				if(WednesdayTimeSlot1.get(r).get(18).equals("null")){
					WedvisitType[r].setBackground(Color.RED);
				}
				else{
					WedvisitType[r].setBackground(Color.GREEN);
				}
			}
			if(WednesdayTimeSlot1.get(r).get(16).equals("no")){
				if(WednesdayTimeSlot1.get(r).get(17).equals("yes")){
					WedvisitType[r].setBackground(Color.BLACK);
				}
			}
			Wedcell[r].add(WednesdaySlot1[r]);
			Wedcell[r].add(WedvisitType[r]);
			WednesdaySlot[0].add(Wedcell[r]);
		}
	
		
		JButton[] WednesdaySlot2;
		WednesdaySlot2 = new JButton[WednesdayTimeSlot2.size()];
		JPanel[] Wedcell1;
		Wedcell1 = new JPanel[WednesdayTimeSlot2.size()];
		JPanel[] WedvisitType1;
		WedvisitType1 = new JPanel[WednesdayTimeSlot2.size()];
		
		for(int r = 0; r < WednesdayTimeSlot2.size(); r++){
			WednesdaySlot2[r] = new JButton();
			WednesdaySlot2[r].setText(WednesdayTimeSlot2.get(r).get(0));
			WednesdaySlot2[r].addActionListener(appListen);
			Wedcell1[r] = new JPanel();
			Wedcell1[r].setPreferredSize(new Dimension(106,20));
			WedxSlot = new BoxLayout(Wedcell1[r],BoxLayout.X_AXIS);
			WednesdaySlot2[r].setPreferredSize(new Dimension(90,18));
			WedvisitType1[r] = new JPanel();
			WedvisitType1[r].setPreferredSize(new Dimension(7,15));
			WedvisitType1[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(WednesdayTimeSlot2.get(r).get(16).equals("yes")){
				if(WednesdayTimeSlot2.get(r).get(18).equals("null")){
					WedvisitType1[r].setBackground(Color.RED);
				}
				else{
					WedvisitType1[r].setBackground(Color.GREEN);
				}
			}
			if(WednesdayTimeSlot2.get(r).get(16).equals("no")){
				if(WednesdayTimeSlot2.get(r).get(17).equals("yes")){
					WedvisitType1[r].setBackground(Color.BLACK);
				}
			}
			Wedcell1[r].add(WednesdaySlot2[r]);
			Wedcell1[r].add(WedvisitType1[r]);
			WednesdaySlot[1].add(Wedcell1[r]);
		}
		
		JButton[] WednesdaySlot3;
		WednesdaySlot3 = new JButton[WednesdayTimeSlot3.size()];
		JPanel[] Wedcell2;
		Wedcell2 = new JPanel[WednesdayTimeSlot3.size()];
		JPanel[] WedvisitType2;
		WedvisitType2 = new JPanel[WednesdayTimeSlot3.size()];
		
		for(int r = 0; r < WednesdayTimeSlot3.size(); r++){
			WednesdaySlot3[r] = new JButton();
			WednesdaySlot3[r].setText(WednesdayTimeSlot3.get(r).get(0));
			WednesdaySlot3[r].addActionListener(appListen);
			Wedcell2[r] = new JPanel();
			Wedcell2[r].setPreferredSize(new Dimension(106,20));
			WedxSlot = new BoxLayout(Wedcell2[r],BoxLayout.X_AXIS);
			WednesdaySlot3[r].setPreferredSize(new Dimension(90,18));
			WedvisitType2[r] = new JPanel();
			WedvisitType2[r].setPreferredSize(new Dimension(7,15));
			WedvisitType2[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(WednesdayTimeSlot3.get(r).get(16).equals("yes")){
				if(WednesdayTimeSlot3.get(r).get(18).equals("null")){
					WedvisitType2[r].setBackground(Color.RED);
				}
				else{
					WedvisitType2[r].setBackground(Color.GREEN);
				}
			}
			if(WednesdayTimeSlot3.get(r).get(16).equals("no")){
				if(WednesdayTimeSlot3.get(r).get(17).equals("yes")){
					WedvisitType2[r].setBackground(Color.BLACK);
				}
			}
			Wedcell2[r].add(WednesdaySlot3[r]);
			Wedcell2[r].add(WedvisitType2[r]);
			WednesdaySlot[2].add(Wedcell2[r]);
		}
		
		JButton[] WednesdaySlot4;
		WednesdaySlot4 = new JButton[WednesdayTimeSlot4.size()];
		JPanel[] Wedcell3;
		Wedcell3 = new JPanel[WednesdayTimeSlot4.size()];
		JPanel[] WedvisitType3;
		WedvisitType3 = new JPanel[WednesdayTimeSlot4.size()];
		
		for(int r = 0; r < WednesdayTimeSlot4.size(); r++){
			WednesdaySlot4[r] = new JButton();
			WednesdaySlot4[r].setText(WednesdayTimeSlot4.get(r).get(0));
			WednesdaySlot4[r].addActionListener(appListen);
			Wedcell3[r] = new JPanel();
			Wedcell3[r].setPreferredSize(new Dimension(106,20));
			WedxSlot = new BoxLayout(Wedcell3[r],BoxLayout.X_AXIS);
			WednesdaySlot4[r].setPreferredSize(new Dimension(90,18));
			WedvisitType3[r] = new JPanel();
			WedvisitType3[r].setPreferredSize(new Dimension(7,15));
			WedvisitType3[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(WednesdayTimeSlot4.get(r).get(16).equals("yes")){
				if(WednesdayTimeSlot4.get(r).get(18).equals("null")){
					WedvisitType3[r].setBackground(Color.RED);
				}
				else{
					WedvisitType3[r].setBackground(Color.GREEN);
				}
			}
			if(WednesdayTimeSlot4.get(r).get(16).equals("no")){
				if(WednesdayTimeSlot4.get(r).get(17).equals("yes")){
					WedvisitType3[r].setBackground(Color.BLACK);
				}
			}
			Wedcell3[r].add(WednesdaySlot4[r]);
			Wedcell3[r].add(WedvisitType3[r]);
			WednesdaySlot[3].add(Wedcell3[r]);
		}
		
		JButton[] WednesdaySlot5;
		WednesdaySlot5 = new JButton[WednesdayTimeSlot5.size()];
		JPanel[] Wedcell4;
		Wedcell4 = new JPanel[WednesdayTimeSlot5.size()];
		JPanel[] WedvisitType4;
		WedvisitType4 = new JPanel[WednesdayTimeSlot5.size()];
		
		for(int r = 0; r < WednesdayTimeSlot5.size(); r++){
			WednesdaySlot5[r] = new JButton();
			WednesdaySlot5[r].setText(WednesdayTimeSlot5.get(r).get(0));
			WednesdaySlot5[r].addActionListener(appListen);
			Wedcell4[r] = new JPanel();
			Wedcell4[r].setPreferredSize(new Dimension(106,20));
			WedxSlot = new BoxLayout(Wedcell4[r],BoxLayout.X_AXIS);
			WednesdaySlot5[r].setPreferredSize(new Dimension(90,18));
			WedvisitType4[r] = new JPanel();
			WedvisitType4[r].setPreferredSize(new Dimension(7,15));
			WedvisitType4[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(WednesdayTimeSlot5.get(r).get(16).equals("yes")){
				if(WednesdayTimeSlot5.get(r).get(18).equals("null")){
					WedvisitType4[r].setBackground(Color.RED);
				}
				else{
					WedvisitType4[r].setBackground(Color.GREEN);
				}
			}
			if(WednesdayTimeSlot5.get(r).get(16).equals("no")){
				if(WednesdayTimeSlot5.get(r).get(17).equals("yes")){
					WedvisitType4[r].setBackground(Color.BLACK);
				}
			}
			Wedcell4[r].add(WednesdaySlot5[r]);
			Wedcell4[r].add(WedvisitType4[r]);
			WednesdaySlot[4].add(Wedcell4[r]);
		}
		
		
		// Thursday
		JPanel[] ThursdaySlot;
		ThursdaySlot = new JPanel[5];
		GridLayout[] GridThursday;
		GridThursday = new GridLayout[5];
		
		for(int w = 0; w < 5; w++){
			ThursdaySlot[w] = new JPanel();
			ThursdaySlot[w].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			GridThursday[w] = new GridLayout(0,2);
			ThursdaySlot[w].setLayout(GridThursday[w]);
		}
		
		JPanel[] ThursdayFiller;
		ThursdayFiller = new JPanel[6];
		
		int ThursdayinitialHour = 8;
		int ThursdayinitialMinute = 0;
		int Thursdayhour;
		int Thursdayminutes;
		int Thursdaydifference;
		double ThursdaydubMin;
		int ThursdayIntMinPix;
		accumulativeHeight = 0;
		
		for(int m = 0; m < 5; m++){
			String ThursSlot;
			int numTours;
			int counter = 0;
			if(Thursday1.get(m).equals("8:00")){
				numTours = ThursdayTimeSlot1.size();
				if(numTours % 2 == 0){
					ThursdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
					accumulativeHeight = accumulativeHeight + (numTours/2)*20 + 12;
					SlotPanel[3].add(ThursdaySlot[m]);
				}
				else{
					ThursdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
					accumulativeHeight = accumulativeHeight + ((numTours + 1)/2)*20 + 12;
					SlotPanel[3].add(ThursdaySlot[m]);
				}
			}
			else{
				if(m == 0){
					ThursSlot = Thursday1.get(m);
					if(ThursSlot.length() == 4){
						Thursdayhour = Integer.parseInt(ThursSlot.substring(0,1));
						Thursdaydifference = Thursdayhour - ThursdayinitialHour;
						if(Thursdaydifference < 0){
							Thursdayhour = Thursdayhour + 12;
							Thursdaydifference = Thursdayhour - ThursdayinitialHour;
						}
						Thursdayminutes = Integer.parseInt(ThursSlot.substring(2,4));
						Thursdayminutes = Thursdayminutes - ThursdayinitialMinute;
						Thursdayminutes = Thursdayminutes + Thursdaydifference*60;
						ThursdaydubMin = Thursdayminutes*2.5;
						ThursdayIntMinPix = (int)ThursdaydubMin;
						ThursdayFiller[counter] = new JPanel();
						ThursdayFiller[counter].setPreferredSize(new Dimension(216, ThursdayIntMinPix - accumulativeHeight));
						accumulativeHeight += (ThursdayIntMinPix - accumulativeHeight);
						SlotPanel[3].add(ThursdayFiller[counter]);
						numTours = ThursdayTimeSlot1.size();
						if(numTours % 2 == 0){
							ThursdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
							accumulativeHeight += (numTours/2)*20 + 12;
							SlotPanel[3].add(ThursdaySlot[m]);
						}
						else{
							ThursdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
							accumulativeHeight += ((numTours + 1)/2)*20 + 12;
							SlotPanel[3].add(ThursdaySlot[m]);
						}
					}
					else{
						Thursdayhour = Integer.parseInt(ThursSlot.substring(0,2));
						Thursdaydifference = Thursdayhour - ThursdayinitialHour;
						if(Thursdaydifference < 0){
							Thursdayhour = Thursdayhour + 12;
							Thursdaydifference = Thursdayhour - ThursdayinitialHour;
						}
						Thursdayminutes = Integer.parseInt(ThursSlot.substring(3,5));
						Thursdayminutes = Thursdayminutes - ThursdayinitialMinute;
						Thursdayminutes = Thursdayminutes + Thursdaydifference*60;
						ThursdaydubMin = Thursdayminutes*2.5;
						ThursdayIntMinPix = (int)ThursdaydubMin;
						ThursdayFiller[counter] = new JPanel();
						ThursdayFiller[counter].setPreferredSize(new Dimension(216, ThursdayIntMinPix - accumulativeHeight));
						accumulativeHeight += (ThursdayIntMinPix - accumulativeHeight);
						SlotPanel[3].add(ThursdayFiller[counter]);
						numTours = ThursdayTimeSlot1.size();
						if(numTours % 2 == 0){
							ThursdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
							accumulativeHeight += (numTours/2)*20 + 12;
							SlotPanel[3].add(ThursdaySlot[m]);
						}
						else{
							ThursdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
							accumulativeHeight += ((numTours + 1)/2)*20 + 12;
							SlotPanel[3].add(ThursdaySlot[m]);
						}
					}
				}
					if(m == 1){
						ThursSlot = Thursday1.get(m);
						if(ThursSlot.length() == 4){
							Thursdayhour = Integer.parseInt(ThursSlot.substring(0,1));
							Thursdaydifference = Thursdayhour - ThursdayinitialHour;
							if(Thursdaydifference < 0){
								Thursdayhour = Thursdayhour + 12;
								Thursdaydifference = Thursdayhour - ThursdayinitialHour;
							}
							Thursdayminutes = Integer.parseInt(ThursSlot.substring(2,4));
							Thursdayminutes = Thursdayminutes - ThursdayinitialMinute;
							Thursdayminutes = Thursdayminutes + Thursdaydifference*60;
							ThursdaydubMin = Thursdayminutes*2.5;
							ThursdayIntMinPix = (int)ThursdaydubMin;
							ThursdayFiller[counter] = new JPanel();
							ThursdayFiller[counter].setPreferredSize(new Dimension(216, ThursdayIntMinPix - accumulativeHeight));
							accumulativeHeight += (ThursdayIntMinPix - accumulativeHeight);
							SlotPanel[3].add(ThursdayFiller[counter]);
							numTours = ThursdayTimeSlot2.size();
							if(numTours % 2 == 0){
								ThursdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
								accumulativeHeight += (numTours/2)*20 + 12;
								SlotPanel[3].add(ThursdaySlot[m]);
							}
							else{
								ThursdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
								accumulativeHeight += ((numTours + 1)/2)*20 + 12;
								SlotPanel[3].add(ThursdaySlot[m]);
							}
						}
					
						else{
							Thursdayhour = Integer.parseInt(ThursSlot.substring(0,2));
							Thursdaydifference = Thursdayhour - ThursdayinitialHour;
							if(Thursdaydifference < 0){
								Thursdayhour = Thursdayhour + 12;
								Thursdaydifference = Thursdayhour - ThursdayinitialHour;
							}
							Thursdayminutes = Integer.parseInt(ThursSlot.substring(3,5));
							Thursdayminutes = Thursdayminutes - ThursdayinitialMinute;
							Thursdayminutes = Thursdayminutes + Thursdaydifference*60;
							ThursdaydubMin = Thursdayminutes*2.5;
							ThursdayIntMinPix = (int)ThursdaydubMin;
							ThursdayFiller[counter] = new JPanel();
							ThursdayFiller[counter].setPreferredSize(new Dimension(216, ThursdayIntMinPix - accumulativeHeight));
							accumulativeHeight += (ThursdayIntMinPix - accumulativeHeight);
							SlotPanel[3].add(ThursdayFiller[counter]);
							numTours = ThursdayTimeSlot2.size();
							if(numTours % 2 == 0){
								ThursdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
								accumulativeHeight += (numTours/2)*20 + 12;
								SlotPanel[3].add(ThursdaySlot[m]);
							}
							else{
								ThursdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
								accumulativeHeight += ((numTours + 1)/2)*20 + 12;
								SlotPanel[3].add(ThursdaySlot[m]);
							}
						}
					}
						if(m == 2){
							ThursSlot = Thursday1.get(m);
							if(ThursSlot.length() == 4){
								Thursdayhour = Integer.parseInt(ThursSlot.substring(0,1));
								Thursdaydifference = Thursdayhour - ThursdayinitialHour;
								if(Thursdaydifference < 0){
									Thursdayhour = Thursdayhour + 12;
									Thursdaydifference = Thursdayhour - ThursdayinitialHour;
								}
								Thursdayminutes = Integer.parseInt(ThursSlot.substring(2,4));
								Thursdayminutes = Thursdayminutes - ThursdayinitialMinute;
								Thursdayminutes = Thursdayminutes + Thursdaydifference*60;
								ThursdaydubMin = Thursdayminutes*2.5;
								ThursdayIntMinPix = (int)ThursdaydubMin;
								ThursdayFiller[counter] = new JPanel();
								ThursdayFiller[counter].setPreferredSize(new Dimension(216, ThursdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (ThursdayIntMinPix - accumulativeHeight);
								SlotPanel[3].add(ThursdayFiller[counter]);
								numTours = ThursdayTimeSlot3.size();
								if(numTours % 2 == 0){
									ThursdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[3].add(ThursdaySlot[m]);
								}
								else{
									ThursdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[3].add(ThursdaySlot[m]);
								}
							}
							else{
								Thursdayhour = Integer.parseInt(ThursSlot.substring(0,2));
								Thursdaydifference = Thursdayhour - ThursdayinitialHour;
								if(Thursdaydifference < 0){
									Thursdayhour = Thursdayhour + 12;
									Thursdaydifference = Thursdayhour - ThursdayinitialHour;
								}
								Thursdayminutes = Integer.parseInt(ThursSlot.substring(3,5));
								Thursdayminutes = Thursdayminutes - ThursdayinitialMinute;
								Thursdayminutes = Thursdayminutes + Thursdaydifference*60;
								ThursdaydubMin = Thursdayminutes*2.5;
								ThursdayIntMinPix = (int)ThursdaydubMin;
								ThursdayFiller[counter] = new JPanel();
								ThursdayFiller[counter].setPreferredSize(new Dimension(216, ThursdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (ThursdayIntMinPix - accumulativeHeight);
								SlotPanel[3].add(ThursdayFiller[counter]);
								numTours = ThursdayTimeSlot3.size();
								if(numTours % 2 == 0){
									ThursdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[3].add(ThursdaySlot[m]);
								}
								else{
									ThursdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[3].add(ThursdaySlot[m]);
								}
							}
						}
						
						if(m == 3){
							ThursSlot = Thursday1.get(m);
							if(ThursSlot.length() == 4){
								Thursdayhour = Integer.parseInt(ThursSlot.substring(0,1));
								Thursdaydifference = Thursdayhour - ThursdayinitialHour;
								if(Thursdaydifference < 0){
									Thursdayhour = Thursdayhour + 12;
									Thursdaydifference = Thursdayhour - ThursdayinitialHour;
								}
								Thursdayminutes = Integer.parseInt(ThursSlot.substring(2,4));
								Thursdayminutes = Thursdayminutes - ThursdayinitialMinute;
								Thursdayminutes = Thursdayminutes + Thursdaydifference*60;
								ThursdaydubMin = Thursdayminutes*2.5;
								ThursdayIntMinPix = (int)ThursdaydubMin;
								ThursdayFiller[counter] = new JPanel();
								ThursdayFiller[counter].setPreferredSize(new Dimension(216, ThursdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (ThursdayIntMinPix - accumulativeHeight);
								SlotPanel[3].add(ThursdayFiller[counter]);
								numTours = ThursdayTimeSlot4.size();
								if(numTours % 2 == 0){
									ThursdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[3].add(ThursdaySlot[m]);
								}
								else{
									ThursdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[3].add(ThursdaySlot[m]);
								}
							}
							else{
								Thursdayhour = Integer.parseInt(ThursSlot.substring(0,2));
								Thursdaydifference = Thursdayhour - ThursdayinitialHour;
								if(Thursdaydifference < 0){
									Thursdayhour = Thursdayhour + 12;
									Thursdaydifference = Thursdayhour - ThursdayinitialHour;
								}
								Thursdayminutes = Integer.parseInt(ThursSlot.substring(3,5));
								Thursdayminutes = Thursdayminutes - ThursdayinitialMinute;
								Thursdayminutes = Thursdayminutes + Thursdaydifference*60;
								ThursdaydubMin = Thursdayminutes*2.5;
								ThursdayIntMinPix = (int)ThursdaydubMin;
								ThursdayFiller[counter] = new JPanel();
								ThursdayFiller[counter].setPreferredSize(new Dimension(216, ThursdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (ThursdayIntMinPix - accumulativeHeight);
								SlotPanel[3].add(ThursdayFiller[counter]);
								numTours = ThursdayTimeSlot4.size();
								if(numTours % 2 == 0){
									ThursdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[3].add(ThursdaySlot[m]);
								}
								else{
									ThursdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[3].add(ThursdaySlot[m]);
								}
							}
						}
						if(m == 4){
							ThursSlot = Thursday1.get(m);
							if(ThursSlot.length() == 4){
								Thursdayhour = Integer.parseInt(ThursSlot.substring(0,1));
								Thursdaydifference = Thursdayhour - ThursdayinitialHour;
								if(Thursdaydifference < 0){
									Thursdayhour = Thursdayhour + 12;
									Thursdaydifference = Thursdayhour - ThursdayinitialHour;
								}
								Thursdayminutes = Integer.parseInt(ThursSlot.substring(2,4));
								Thursdayminutes = Thursdayminutes - ThursdayinitialMinute;
								Thursdayminutes = Thursdayminutes + Thursdaydifference*60;
								ThursdaydubMin = Thursdayminutes*2.5;
								ThursdayIntMinPix = (int)ThursdaydubMin;
								ThursdayFiller[counter] = new JPanel();
								ThursdayFiller[counter].setPreferredSize(new Dimension(216, ThursdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (ThursdayIntMinPix - accumulativeHeight);
								SlotPanel[3].add(ThursdayFiller[counter]);
								numTours = ThursdayTimeSlot5.size();
								if(numTours % 2 == 0){
									ThursdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[3].add(ThursdaySlot[m]);
								}
								else{
									ThursdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[3].add(ThursdaySlot[m]);
								}
							}
							else{
								Thursdayhour = Integer.parseInt(ThursSlot.substring(0,2));
								Thursdaydifference = Thursdayhour - ThursdayinitialHour;
								if(Thursdaydifference < 0){
									Thursdayhour = Thursdayhour + 12;
									Thursdaydifference = Thursdayhour - ThursdayinitialHour;
								}
								Thursdayminutes = Integer.parseInt(ThursSlot.substring(3,5));
								Thursdayminutes = Thursdayminutes - ThursdayinitialMinute;
								Thursdayminutes = Thursdayminutes + Thursdaydifference*60;
								ThursdaydubMin = Thursdayminutes*2.5;
								ThursdayIntMinPix = (int)ThursdaydubMin;
								ThursdayFiller[counter] = new JPanel();
								ThursdayFiller[counter].setPreferredSize(new Dimension(216, ThursdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (ThursdayIntMinPix - accumulativeHeight);
								SlotPanel[3].add(ThursdayFiller[counter]);
								numTours = ThursdayTimeSlot5.size();
								if(numTours % 2 == 0){
									ThursdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[3].add(ThursdaySlot[m]);
								}
								else{
									ThursdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[3].add(ThursdaySlot[m]);
								}
							}
						}
				}

			}
		
		JButton[] ThursdaySlot1;
		ThursdaySlot1 = new JButton[ThursdayTimeSlot1.size()];
		JPanel[] Thurscell;
		Thurscell = new JPanel[ThursdayTimeSlot1.size()];
		JPanel[] ThursvisitType;
		ThursvisitType = new JPanel[ThursdayTimeSlot1.size()];
		BoxLayout ThursxSlot;
		
		for(int r = 0; r < ThursdayTimeSlot1.size(); r++){
			ThursdaySlot1[r] = new JButton();
			ThursdaySlot1[r].setText(ThursdayTimeSlot1.get(r).get(0));
			ThursdaySlot1[r].addActionListener(appListen);
			Thurscell[r] = new JPanel();
			Thurscell[r].setPreferredSize(new Dimension(106,20));
			ThursxSlot = new BoxLayout(Thurscell[r],BoxLayout.X_AXIS);
			ThursdaySlot1[r].setPreferredSize(new Dimension(90,18));
			ThursvisitType[r] = new JPanel();
			ThursvisitType[r].setPreferredSize(new Dimension(7,15));
			ThursvisitType[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(ThursdayTimeSlot1.get(r).get(16).equals("yes")){
				if(ThursdayTimeSlot1.get(r).get(18).equals("null")){
					ThursvisitType[r].setBackground(Color.RED);
				}
				else{
					ThursvisitType[r].setBackground(Color.GREEN);
				}
			}
			if(ThursdayTimeSlot1.get(r).get(16).equals("no")){
				if(ThursdayTimeSlot1.get(r).get(17).equals("yes")){
					ThursvisitType[r].setBackground(Color.BLACK);
				}
			}
			Thurscell[r].add(ThursdaySlot1[r]);
			Thurscell[r].add(ThursvisitType[r]);
			ThursdaySlot[0].add(Thurscell[r]);
		}

		
		JButton[] ThursdaySlot2;
		ThursdaySlot2 = new JButton[ThursdayTimeSlot2.size()];
		JPanel[] Thurscell1;
		Thurscell1 = new JPanel[ThursdayTimeSlot2.size()];
		JPanel[] ThursvisitType1;
		ThursvisitType1 = new JPanel[ThursdayTimeSlot2.size()];
		
		for(int r = 0; r < ThursdayTimeSlot2.size(); r++){
			ThursdaySlot2[r] = new JButton();
			ThursdaySlot2[r].setText(ThursdayTimeSlot2.get(r).get(0));
			ThursdaySlot2[r].addActionListener(appListen);
			Thurscell1[r] = new JPanel();
			Thurscell1[r].setPreferredSize(new Dimension(106,20));
			ThursxSlot = new BoxLayout(Thurscell1[r],BoxLayout.X_AXIS);
			ThursdaySlot2[r].setPreferredSize(new Dimension(90,18));
			ThursvisitType1[r] = new JPanel();
			ThursvisitType1[r].setPreferredSize(new Dimension(7,15));
			ThursvisitType1[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(ThursdayTimeSlot2.get(r).get(16).equals("yes")){
				if(ThursdayTimeSlot2.get(r).get(18).equals("null")){
					ThursvisitType1[r].setBackground(Color.RED);
				}
				else{
					ThursvisitType1[r].setBackground(Color.GREEN);
				}
			}
			if(ThursdayTimeSlot2.get(r).get(16).equals("no")){
				if(ThursdayTimeSlot2.get(r).get(17).equals("yes")){
					ThursvisitType1[r].setBackground(Color.BLACK);
				}
			}
			Thurscell1[r].add(ThursdaySlot2[r]);
			Thurscell1[r].add(ThursvisitType1[r]);
			ThursdaySlot[1].add(Thurscell1[r]);
		}
		
		JButton[] ThursdaySlot3;
		ThursdaySlot3 = new JButton[ThursdayTimeSlot3.size()];
		JPanel[] Thurscell2;
		Thurscell2 = new JPanel[ThursdayTimeSlot3.size()];
		JPanel[] ThursvisitType2;
		ThursvisitType2 = new JPanel[ThursdayTimeSlot3.size()];
		
		for(int r = 0; r < ThursdayTimeSlot3.size(); r++){
			ThursdaySlot3[r] = new JButton();
			ThursdaySlot3[r].setText(ThursdayTimeSlot3.get(r).get(0));
			ThursdaySlot3[r].addActionListener(appListen);
			Thurscell2[r] = new JPanel();
			Thurscell2[r].setPreferredSize(new Dimension(106,20));
			ThursxSlot = new BoxLayout(Thurscell2[r],BoxLayout.X_AXIS);
			ThursdaySlot3[r].setPreferredSize(new Dimension(90,18));
			ThursvisitType2[r] = new JPanel();
			ThursvisitType2[r].setPreferredSize(new Dimension(7,15));
			ThursvisitType2[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(ThursdayTimeSlot3.get(r).get(16).equals("yes")){
				if(ThursdayTimeSlot3.get(r).get(18).equals("null")){
					ThursvisitType2[r].setBackground(Color.RED);
				}
				else{
					ThursvisitType2[r].setBackground(Color.GREEN);
				}
			}
			if(ThursdayTimeSlot3.get(r).get(16).equals("no")){
				if(ThursdayTimeSlot3.get(r).get(17).equals("yes")){
					ThursvisitType2[r].setBackground(Color.BLACK);
				}
			}
			Thurscell2[r].add(ThursdaySlot3[r]);
			Thurscell2[r].add(ThursvisitType2[r]);
			ThursdaySlot[2].add(Thurscell2[r]);
		}
		
		JButton[] ThursdaySlot4;
		ThursdaySlot4 = new JButton[ThursdayTimeSlot4.size()];
		JPanel[] Thurscell3;
		Thurscell3 = new JPanel[ThursdayTimeSlot4.size()];
		JPanel[] ThursvisitType3;
		ThursvisitType3 = new JPanel[ThursdayTimeSlot4.size()];
		
		for(int r = 0; r < ThursdayTimeSlot4.size(); r++){
			ThursdaySlot4[r] = new JButton();
			ThursdaySlot4[r].setText(ThursdayTimeSlot4.get(r).get(0));
			ThursdaySlot4[r].addActionListener(appListen);
			Thurscell3[r] = new JPanel();
			Thurscell3[r].setPreferredSize(new Dimension(106,20));
			ThursxSlot = new BoxLayout(Thurscell3[r],BoxLayout.X_AXIS);
			ThursdaySlot4[r].setPreferredSize(new Dimension(90,18));
			ThursvisitType3[r] = new JPanel();
			ThursvisitType3[r].setPreferredSize(new Dimension(7,15));
			ThursvisitType3[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(ThursdayTimeSlot4.get(r).get(16).equals("yes")){
				if(ThursdayTimeSlot4.get(r).get(18).equals("null")){
					ThursvisitType3[r].setBackground(Color.RED);
				}
				else{
					ThursvisitType3[r].setBackground(Color.GREEN);
				}
			}
			if(ThursdayTimeSlot4.get(r).get(16).equals("no")){
				if(ThursdayTimeSlot4.get(r).get(17).equals("yes")){
					ThursvisitType3[r].setBackground(Color.BLACK);
				}
			}
			Thurscell3[r].add(ThursdaySlot4[r]);
			Thurscell3[r].add(ThursvisitType3[r]);
			ThursdaySlot[3].add(Thurscell3[r]);
		}
		
		JButton[] ThursdaySlot5;
		ThursdaySlot5 = new JButton[ThursdayTimeSlot5.size()];
		JPanel[] Thurscell4;
		Thurscell4 = new JPanel[ThursdayTimeSlot5.size()];
		JPanel[] ThursvisitType4;
		ThursvisitType4 = new JPanel[ThursdayTimeSlot5.size()];
		
		for(int r = 0; r < ThursdayTimeSlot5.size(); r++){
			ThursdaySlot5[r] = new JButton();
			ThursdaySlot5[r].setText(ThursdayTimeSlot5.get(r).get(0));
			ThursdaySlot5[r].addActionListener(appListen);
			Thurscell4[r] = new JPanel();
			Thurscell4[r].setPreferredSize(new Dimension(106,20));
			ThursxSlot = new BoxLayout(Thurscell4[r],BoxLayout.X_AXIS);
			ThursdaySlot5[r].setPreferredSize(new Dimension(90,18));
			ThursvisitType4[r] = new JPanel();
			ThursvisitType4[r].setPreferredSize(new Dimension(7,15));
			ThursvisitType4[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(ThursdayTimeSlot5.get(r).get(16).equals("yes")){
				if(ThursdayTimeSlot5.get(r).get(18).equals("null")){
					ThursvisitType4[r].setBackground(Color.RED);
				}
				else{
					ThursvisitType4[r].setBackground(Color.GREEN);
				}
			}
			if(ThursdayTimeSlot5.get(r).get(16).equals("no")){
				if(ThursdayTimeSlot5.get(r).get(17).equals("yes")){
					ThursvisitType4[r].setBackground(Color.BLACK);
				}
			}
			Thurscell4[r].add(ThursdaySlot5[r]);
			Thurscell4[r].add(ThursvisitType4[r]);
			ThursdaySlot[4].add(Thurscell4[r]);
		}
		
		// Friday
		JPanel[] FridaySlot;
		FridaySlot = new JPanel[5];
		GridLayout[] GridFriday;
		GridFriday = new GridLayout[5];
		
		for(int w = 0; w < 5; w++){
			FridaySlot[w] = new JPanel();
			FridaySlot[w].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			GridFriday[w] = new GridLayout(0,2);
			FridaySlot[w].setLayout(GridFriday[w]);
		}
		
		JPanel[] FridayFiller;
		FridayFiller = new JPanel[6];
		
		int FridayinitialHour = 8;
		int FridayinitialMinute = 0;
		int Fridayhour;
		int Fridayminutes;
		int Fridaydifference;
		double FridaydubMin;
		int FridayIntMinPix;
		accumulativeHeight = 0;
		
		for(int m = 0; m < 5; m++){
			String FriSlot;
			int numTours;
			int counter = 0;
			if(Friday1.get(m).equals("8:00")){
				numTours = FridayTimeSlot1.size();
				if(numTours % 2 == 0){
					FridaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
					accumulativeHeight = accumulativeHeight + (numTours/2)*20 + 12;
					SlotPanel[4].add(FridaySlot[m]);
				}
				else{
					FridaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
					accumulativeHeight = accumulativeHeight + ((numTours + 1)/2)*20 + 12;
					SlotPanel[4].add(FridaySlot[m]);
				}
			}
			else{
				if(m == 0){
					FriSlot = Friday1.get(m);
					if(FriSlot.length() == 4){
						Fridayhour = Integer.parseInt(FriSlot.substring(0,1));
						Fridaydifference = Fridayhour - FridayinitialHour;
						if(Fridaydifference < 0){
							Fridayhour = Fridayhour + 12;
							Fridaydifference = Fridayhour - FridayinitialHour;
						}
						Fridayminutes = Integer.parseInt(FriSlot.substring(2,4));
						Fridayminutes = Fridayminutes - FridayinitialMinute;
						Fridayminutes = Fridayminutes + Fridaydifference*60;
						FridaydubMin = Fridayminutes*2.5;
						FridayIntMinPix = (int)FridaydubMin;
						FridayFiller[counter] = new JPanel();
						FridayFiller[counter].setPreferredSize(new Dimension(216, FridayIntMinPix - accumulativeHeight));
						accumulativeHeight += (FridayIntMinPix - accumulativeHeight);
						SlotPanel[4].add(FridayFiller[counter]);
						numTours = FridayTimeSlot1.size();
						if(numTours % 2 == 0){
							FridaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
							accumulativeHeight += (numTours/2)*20 + 12;
							SlotPanel[4].add(FridaySlot[m]);
						}
						else{
							FridaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
							accumulativeHeight += ((numTours + 1)/2)*20 + 12;
							SlotPanel[4].add(FridaySlot[m]);
						}
					}
					else{
						Fridayhour = Integer.parseInt(FriSlot.substring(0,2));
						Fridaydifference = Fridayhour - FridayinitialHour;
						if(Fridaydifference < 0){
							Fridayhour = Fridayhour + 12;
							Fridaydifference = Fridayhour - FridayinitialHour;
						}
						Fridayminutes = Integer.parseInt(FriSlot.substring(3,5));
						Fridayminutes = Fridayminutes - FridayinitialMinute;
						Fridayminutes = Fridayminutes + Fridaydifference*60;
						FridaydubMin = Fridayminutes*2.5;
						FridayIntMinPix = (int)FridaydubMin;
						FridayFiller[counter] = new JPanel();
						FridayFiller[counter].setPreferredSize(new Dimension(216, FridayIntMinPix - accumulativeHeight));
						accumulativeHeight += (FridayIntMinPix - accumulativeHeight);
						SlotPanel[4].add(FridayFiller[counter]);
						numTours = FridayTimeSlot1.size();
						if(numTours % 2 == 0){
							FridaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
							accumulativeHeight += (numTours/2)*20 + 12;
							SlotPanel[4].add(FridaySlot[m]);
						}
						else{
							FridaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
							accumulativeHeight += ((numTours + 1)/2)*20 + 12;
							SlotPanel[4].add(FridaySlot[m]);
						}
					}
				}
					if(m == 1){
						FriSlot = Friday1.get(m);
						if(FriSlot.length() == 4){
							Fridayhour = Integer.parseInt(FriSlot.substring(0,1));
							Fridaydifference = Fridayhour - FridayinitialHour;
							if(Fridaydifference < 0){
								Fridayhour = Fridayhour + 12;
								Fridaydifference = Fridayhour - FridayinitialHour;
							}
							Fridayminutes = Integer.parseInt(FriSlot.substring(2,4));
							Fridayminutes = Fridayminutes - FridayinitialMinute;
							Fridayminutes = Fridayminutes + Fridaydifference*60;
							FridaydubMin = Fridayminutes*2.5;
							FridayIntMinPix = (int)FridaydubMin;
							FridayFiller[counter] = new JPanel();
							FridayFiller[counter].setPreferredSize(new Dimension(216, FridayIntMinPix - accumulativeHeight));
							accumulativeHeight += (FridayIntMinPix - accumulativeHeight);
							SlotPanel[4].add(FridayFiller[counter]);
							numTours = FridayTimeSlot2.size();
							if(numTours % 2 == 0){
								FridaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
								accumulativeHeight += (numTours/2)*20 + 12;
								SlotPanel[4].add(FridaySlot[m]);
							}
							else{
								FridaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
								accumulativeHeight += ((numTours + 1)/2)*20 + 12;
								SlotPanel[4].add(FridaySlot[m]);
							}
						}
					
						else{
							Fridayhour = Integer.parseInt(FriSlot.substring(0,2));
							Fridaydifference = Fridayhour - FridayinitialHour;
							if(Fridaydifference < 0){
								Fridayhour = Fridayhour + 12;
								Fridaydifference = Fridayhour - FridayinitialHour;
							}
							Fridayminutes = Integer.parseInt(FriSlot.substring(3,5));
							Fridayminutes = Fridayminutes - FridayinitialMinute;
							Fridayminutes = Fridayminutes + Fridaydifference*60;
							FridaydubMin = Fridayminutes*2.5;
							FridayIntMinPix = (int)FridaydubMin;
							FridayFiller[counter] = new JPanel();
							FridayFiller[counter].setPreferredSize(new Dimension(216, FridayIntMinPix - accumulativeHeight));
							accumulativeHeight += (FridayIntMinPix - accumulativeHeight);
							SlotPanel[4].add(FridayFiller[counter]);
							numTours = FridayTimeSlot2.size();
							if(numTours % 2 == 0){
								FridaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
								accumulativeHeight += (numTours/2)*20 + 12;
								SlotPanel[4].add(FridaySlot[m]);
							}
							else{
								FridaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
								accumulativeHeight += ((numTours + 1)/2)*20 + 12;
								SlotPanel[4].add(FridaySlot[m]);
							}
						}
					}
						if(m == 2){
							FriSlot = Friday1.get(m);
							if(FriSlot.length() == 4){
								Fridayhour = Integer.parseInt(FriSlot.substring(0,1));
								Fridaydifference = Fridayhour - FridayinitialHour;
								if(Fridaydifference < 0){
									Fridayhour = Fridayhour + 12;
									Fridaydifference = Fridayhour - FridayinitialHour;
								}
								Fridayminutes = Integer.parseInt(FriSlot.substring(2,4));
								Fridayminutes = Fridayminutes - FridayinitialMinute;
								Fridayminutes = Fridayminutes + Fridaydifference*60;
								FridaydubMin = Fridayminutes*2.5;
								FridayIntMinPix = (int)FridaydubMin;
								FridayFiller[counter] = new JPanel();
								FridayFiller[counter].setPreferredSize(new Dimension(216, FridayIntMinPix - accumulativeHeight));
								accumulativeHeight += (FridayIntMinPix - accumulativeHeight);
								SlotPanel[4].add(FridayFiller[counter]);
								numTours = FridayTimeSlot3.size();
								if(numTours % 2 == 0){
									FridaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[4].add(FridaySlot[m]);
								}
								else{
									FridaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[4].add(FridaySlot[m]);
								}
							}
							else{
								Fridayhour = Integer.parseInt(FriSlot.substring(0,2));
								Fridaydifference = Fridayhour - FridayinitialHour;
								if(Fridaydifference < 0){
									Fridayhour = Fridayhour + 12;
									Fridaydifference = Fridayhour - FridayinitialHour;
								}
								Fridayminutes = Integer.parseInt(FriSlot.substring(3,5));
								Fridayminutes = Fridayminutes - FridayinitialMinute;
								Fridayminutes = Fridayminutes + Fridaydifference*60;
								FridaydubMin = Fridayminutes*2.5;
								FridayIntMinPix = (int)FridaydubMin;
								FridayFiller[counter] = new JPanel();
								FridayFiller[counter].setPreferredSize(new Dimension(216, FridayIntMinPix - accumulativeHeight));
								accumulativeHeight += (FridayIntMinPix - accumulativeHeight);
								SlotPanel[4].add(FridayFiller[counter]);
								numTours = FridayTimeSlot3.size();
								if(numTours % 2 == 0){
									FridaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[4].add(FridaySlot[m]);
								}
								else{
									FridaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[4].add(FridaySlot[m]);
								}
							}
						}
						
						if(m == 3){
							FriSlot = Friday1.get(m);
							if(FriSlot.length() == 4){
								Fridayhour = Integer.parseInt(FriSlot.substring(0,1));
								Fridaydifference = Fridayhour - FridayinitialHour;
								if(Fridaydifference < 0){
									Fridayhour = Fridayhour + 12;
									Fridaydifference = Fridayhour - FridayinitialHour;
								}
								Fridayminutes = Integer.parseInt(FriSlot.substring(2,4));
								Fridayminutes = Fridayminutes - FridayinitialMinute;
								Fridayminutes = Fridayminutes + Fridaydifference*60;
								FridaydubMin = Fridayminutes*2.5;
								FridayIntMinPix = (int)FridaydubMin;
								FridayFiller[counter] = new JPanel();
								FridayFiller[counter].setPreferredSize(new Dimension(216, FridayIntMinPix - accumulativeHeight));
								accumulativeHeight += (FridayIntMinPix - accumulativeHeight);
								SlotPanel[4].add(FridayFiller[counter]);
								numTours = FridayTimeSlot4.size();
								if(numTours % 2 == 0){
									FridaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[4].add(FridaySlot[m]);
								}
								else{
									FridaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[4].add(FridaySlot[m]);
								}
							}
							else{
								Fridayhour = Integer.parseInt(FriSlot.substring(0,2));
								Fridaydifference = Fridayhour - FridayinitialHour;
								if(Fridaydifference < 0){
									Fridayhour = Fridayhour + 12;
									Fridaydifference = Fridayhour - FridayinitialHour;
								}
								Fridayminutes = Integer.parseInt(FriSlot.substring(3,5));
								Fridayminutes = Fridayminutes - FridayinitialMinute;
								Fridayminutes = Fridayminutes + Fridaydifference*60;
								FridaydubMin = Fridayminutes*2.5;
								FridayIntMinPix = (int)FridaydubMin;
								FridayFiller[counter] = new JPanel();
								FridayFiller[counter].setPreferredSize(new Dimension(216, FridayIntMinPix - accumulativeHeight));
								accumulativeHeight += (FridayIntMinPix - accumulativeHeight);
								SlotPanel[4].add(FridayFiller[counter]);
								numTours = FridayTimeSlot4.size();
								if(numTours % 2 == 0){
									FridaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[4].add(FridaySlot[m]);
								}
								else{
									FridaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[4].add(FridaySlot[m]);
								}
							}
						}
						if(m == 4){
							FriSlot = Friday1.get(m);
							if(FriSlot.length() == 4){
								Fridayhour = Integer.parseInt(FriSlot.substring(0,1));
								Fridaydifference = Fridayhour - FridayinitialHour;
								if(Fridaydifference < 0){
									Fridayhour = Fridayhour + 12;
									Fridaydifference = Fridayhour - FridayinitialHour;
								}
								Fridayminutes = Integer.parseInt(FriSlot.substring(2,4));
								Fridayminutes = Fridayminutes - FridayinitialMinute;
								Fridayminutes = Fridayminutes + Fridaydifference*60;
								FridaydubMin = Fridayminutes*2.5;
								FridayIntMinPix = (int)FridaydubMin;
								FridayFiller[counter] = new JPanel();
								FridayFiller[counter].setPreferredSize(new Dimension(216, FridayIntMinPix - accumulativeHeight));
								accumulativeHeight += (FridayIntMinPix - accumulativeHeight);
								SlotPanel[4].add(FridayFiller[counter]);
								numTours = FridayTimeSlot5.size();
								if(numTours % 2 == 0){
									FridaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[4].add(FridaySlot[m]);
								}
								else{
									FridaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[4].add(FridaySlot[m]);
								}
							}
							else{
								Fridayhour = Integer.parseInt(FriSlot.substring(0,2));
								Fridaydifference = Fridayhour - FridayinitialHour;
								if(Fridaydifference < 0){
									Fridayhour = Fridayhour + 12;
									Fridaydifference = Fridayhour - FridayinitialHour;
								}
								Fridayminutes = Integer.parseInt(FriSlot.substring(3,5));
								Fridayminutes = Fridayminutes - FridayinitialMinute;
								Fridayminutes = Fridayminutes + Fridaydifference*60;
								FridaydubMin = Fridayminutes*2.5;
								FridayIntMinPix = (int)FridaydubMin;
								FridayFiller[counter] = new JPanel();
								FridayFiller[counter].setPreferredSize(new Dimension(216, FridayIntMinPix - accumulativeHeight));
								accumulativeHeight += (FridayIntMinPix - accumulativeHeight);
								SlotPanel[4].add(FridayFiller[counter]);
								numTours = FridayTimeSlot5.size();
								if(numTours % 2 == 0){
									FridaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[4].add(FridaySlot[m]);
								}
								else{
									FridaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[4].add(FridaySlot[m]);
								}
							}
						}
				}

			}
		
		JButton[] FridaySlot1;
		FridaySlot1 = new JButton[FridayTimeSlot1.size()];
		JPanel[] Fricell;
		Fricell = new JPanel[FridayTimeSlot1.size()];
		JPanel[] FrivisitType;
		FrivisitType = new JPanel[FridayTimeSlot1.size()];
		BoxLayout FrixSlot;
		
		for(int r = 0; r < FridayTimeSlot1.size(); r++){
			FridaySlot1[r] = new JButton();
			FridaySlot1[r].setText(FridayTimeSlot1.get(r).get(0));
			FridaySlot1[r].addActionListener(appListen);
			Fricell[r] = new JPanel();
			Fricell[r].setPreferredSize(new Dimension(106,20));
			FrixSlot = new BoxLayout(Fricell[r],BoxLayout.X_AXIS);
			FridaySlot1[r].setPreferredSize(new Dimension(90,18));
			FrivisitType[r] = new JPanel();
			FrivisitType[r].setPreferredSize(new Dimension(7,15));
			FrivisitType[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(FridayTimeSlot1.get(r).get(16).equals("yes")){
				if(FridayTimeSlot1.get(r).get(18).equals("null")){
					FrivisitType[r].setBackground(Color.RED);
				}
				else{
					FrivisitType[r].setBackground(Color.GREEN);
				}
			}
			if(FridayTimeSlot1.get(r).get(16).equals("no")){
				if(FridayTimeSlot1.get(r).get(17).equals("yes")){
					FrivisitType[r].setBackground(Color.BLACK);
				}
			}
			Fricell[r].add(FridaySlot1[r]);
			Fricell[r].add(FrivisitType[r]);
			FridaySlot[0].add(Fricell[r]);
		}
		
		JButton[] FridaySlot2;
		FridaySlot2 = new JButton[FridayTimeSlot2.size()];
		JPanel[] Fricell1;
		Fricell1 = new JPanel[FridayTimeSlot2.size()];
		JPanel[] FrivisitType1;
		FrivisitType1 = new JPanel[FridayTimeSlot2.size()];
		
		for(int r = 0; r < FridayTimeSlot2.size(); r++){
			FridaySlot2[r] = new JButton();
			FridaySlot2[r].setText(FridayTimeSlot2.get(r).get(0));
			FridaySlot2[r].addActionListener(appListen);
			Fricell1[r] = new JPanel();
			Fricell1[r].setPreferredSize(new Dimension(106,20));
			FrixSlot = new BoxLayout(Fricell1[r],BoxLayout.X_AXIS);
			FridaySlot2[r].setPreferredSize(new Dimension(90,18));
			FrivisitType1[r] = new JPanel();
			FrivisitType1[r].setPreferredSize(new Dimension(7,15));
			FrivisitType1[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(FridayTimeSlot2.get(r).get(16).equals("yes")){
				if(FridayTimeSlot2.get(r).get(18).equals("null")){
					FrivisitType1[r].setBackground(Color.RED);
				}
				else{
					FrivisitType1[r].setBackground(Color.GREEN);
				}
			}
			if(FridayTimeSlot2.get(r).get(16).equals("no")){
				if(FridayTimeSlot2.get(r).get(17).equals("yes")){
					FrivisitType1[r].setBackground(Color.BLACK);
				}
			}
			Fricell1[r].add(FridaySlot2[r]);
			Fricell1[r].add(FrivisitType1[r]);
			FridaySlot[1].add(Fricell1[r]);
		}
		
		JButton[] FridaySlot3;
		FridaySlot3 = new JButton[FridayTimeSlot3.size()];
		JPanel[] Fricell2;
		Fricell2 = new JPanel[FridayTimeSlot3.size()];
		JPanel[] FrivisitType2;
		FrivisitType2 = new JPanel[FridayTimeSlot3.size()];
		
		for(int r = 0; r < FridayTimeSlot3.size(); r++){
			FridaySlot3[r] = new JButton();
			FridaySlot3[r].setText(FridayTimeSlot3.get(r).get(0));
			FridaySlot3[r].addActionListener(appListen);
			Fricell2[r] = new JPanel();
			Fricell2[r].setPreferredSize(new Dimension(106,20));
			FrixSlot = new BoxLayout(Fricell2[r],BoxLayout.X_AXIS);
			FridaySlot3[r].setPreferredSize(new Dimension(90,18));
			FrivisitType2[r] = new JPanel();
			FrivisitType2[r].setPreferredSize(new Dimension(7,15));
			FrivisitType2[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(FridayTimeSlot3.get(r).get(16).equals("yes")){
				if(FridayTimeSlot3.get(r).get(18).equals("null")){
					FrivisitType2[r].setBackground(Color.RED);
				}
				else{
					FrivisitType2[r].setBackground(Color.GREEN);
				}
			}
			if(FridayTimeSlot3.get(r).get(16).equals("no")){
				if(FridayTimeSlot3.get(r).get(17).equals("yes")){
					FrivisitType2[r].setBackground(Color.BLACK);
				}
			}
			Fricell2[r].add(FridaySlot3[r]);
			Fricell2[r].add(FrivisitType2[r]);
			FridaySlot[2].add(Fricell2[r]);
		}
		
		JButton[] FridaySlot4;
		FridaySlot4 = new JButton[FridayTimeSlot4.size()];
		JPanel[] Fricell3;
		Fricell3 = new JPanel[FridayTimeSlot4.size()];
		JPanel[] FrivisitType3;
		FrivisitType3 = new JPanel[FridayTimeSlot4.size()];
		
		for(int r = 0; r < FridayTimeSlot4.size(); r++){
			FridaySlot4[r] = new JButton();
			FridaySlot4[r].setText(FridayTimeSlot4.get(r).get(0));
			FridaySlot4[r].addActionListener(appListen);
			Fricell3[r] = new JPanel();
			Fricell3[r].setPreferredSize(new Dimension(106,20));
			FrixSlot = new BoxLayout(Fricell3[r],BoxLayout.X_AXIS);
			FridaySlot4[r].setPreferredSize(new Dimension(90,18));
			FrivisitType3[r] = new JPanel();
			FrivisitType3[r].setPreferredSize(new Dimension(7,15));
			FrivisitType3[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(FridayTimeSlot4.get(r).get(16).equals("yes")){
				if(FridayTimeSlot4.get(r).get(18).equals("null")){
					FrivisitType3[r].setBackground(Color.RED);
				}
				else{
					FrivisitType3[r].setBackground(Color.GREEN);
				}
			}
			if(FridayTimeSlot4.get(r).get(16).equals("no")){
				if(FridayTimeSlot4.get(r).get(17).equals("yes")){
					FrivisitType3[r].setBackground(Color.BLACK);
				}
			}
			Fricell3[r].add(FridaySlot4[r]);
			Fricell3[r].add(FrivisitType3[r]);
			FridaySlot[3].add(Fricell3[r]);
		}
		
		JButton[] FridaySlot5;
		FridaySlot5 = new JButton[FridayTimeSlot5.size()];
		JPanel[] Fricell4;
		Fricell4 = new JPanel[FridayTimeSlot5.size()];
		JPanel[] FrivisitType4;
		FrivisitType4 = new JPanel[FridayTimeSlot5.size()];
		
		for(int r = 0; r < FridayTimeSlot5.size(); r++){
			FridaySlot5[r] = new JButton();
			FridaySlot5[r].setText(FridayTimeSlot5.get(r).get(0));
			FridaySlot5[r].addActionListener(appListen);
			Fricell4[r] = new JPanel();
			Fricell4[r].setPreferredSize(new Dimension(106,20));
			FrixSlot = new BoxLayout(Fricell4[r],BoxLayout.X_AXIS);
			FridaySlot5[r].setPreferredSize(new Dimension(90,18));
			FrivisitType4[r] = new JPanel();
			FrivisitType4[r].setPreferredSize(new Dimension(7,15));
			FrivisitType4[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(FridayTimeSlot5.get(r).get(16).equals("yes")){
				if(FridayTimeSlot5.get(r).get(18).equals("null")){
					FrivisitType4[r].setBackground(Color.RED);
				}
				else{
					FrivisitType4[r].setBackground(Color.GREEN);
				}
			}
			if(FridayTimeSlot5.get(r).get(16).equals("no")){
				if(FridayTimeSlot5.get(r).get(17).equals("yes")){
					FrivisitType4[r].setBackground(Color.BLACK);
				}
			}
			Fricell4[r].add(FridaySlot5[r]);
			Fricell4[r].add(FrivisitType4[r]);
			FridaySlot[4].add(Fricell4[r]);
		}
		
		// Saturday
		JPanel[] SaturdaySlot;
		SaturdaySlot = new JPanel[4];
		GridLayout[] GridSaturday;
		GridSaturday = new GridLayout[4];
		
		for(int w = 0; w < 4; w++){
			SaturdaySlot[w] = new JPanel();
			SaturdaySlot[w].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			GridSaturday[w] = new GridLayout(0,2);
			SaturdaySlot[w].setLayout(GridSaturday[w]);
		}
		
		JPanel[] SaturdayFiller;
		SaturdayFiller = new JPanel[6];
		
		int SaturdayinitialHour = 8;
		int SaturdayinitialMinute = 0;
		int Saturdayhour;
		int Saturdayminutes;
		int Saturdaydifference;
		double SaturdaydubMin;
		int SaturdayIntMinPix;
		accumulativeHeight = 0;
		
		for(int m = 0; m < 4; m++){
			String SatSlot;
			int numTours;
			int counter = 0;
			if(Saturday1.get(m).equals("8:00")){
				numTours = SaturdayTimeSlot1.size();
				if(numTours % 2 == 0){
					SaturdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
					accumulativeHeight = accumulativeHeight + (numTours/2)*20 + 12;
					SlotPanel[5].add(SaturdaySlot[m]);
				}
				else{
					SaturdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
					accumulativeHeight = accumulativeHeight + ((numTours + 1)/2)*20 + 12;
					SlotPanel[5].add(SaturdaySlot[m]);
				}
			}
			else{
				if(m == 0){
					SatSlot = Saturday1.get(m);
					if(SatSlot.length() == 4){
						Saturdayhour = Integer.parseInt(SatSlot.substring(0,1));
						Saturdaydifference = Saturdayhour - SaturdayinitialHour;
						if(Saturdaydifference < 0){
							Saturdayhour = Saturdayhour + 12;
							Saturdaydifference = Saturdayhour - SaturdayinitialHour;
						}
						Saturdayminutes = Integer.parseInt(SatSlot.substring(2,4));
						Saturdayminutes = Saturdayminutes - SaturdayinitialMinute;
						Saturdayminutes = Saturdayminutes + Saturdaydifference*60;
						SaturdaydubMin = Saturdayminutes*2.5;
						SaturdayIntMinPix = (int)SaturdaydubMin;
						SaturdayFiller[counter] = new JPanel();
						SaturdayFiller[counter].setPreferredSize(new Dimension(216, SaturdayIntMinPix - accumulativeHeight));
						accumulativeHeight += (SaturdayIntMinPix - accumulativeHeight);
						SlotPanel[5].add(SaturdayFiller[counter]);
						numTours = SaturdayTimeSlot1.size();
						if(numTours % 2 == 0){
							SaturdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
							accumulativeHeight += (numTours/2)*20 + 12;
							SlotPanel[5].add(SaturdaySlot[m]);
						}
						else{
							SaturdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
							accumulativeHeight += ((numTours + 1)/2)*20 + 12;
							SlotPanel[5].add(SaturdaySlot[m]);
						}
					}
					else{
						Saturdayhour = Integer.parseInt(SatSlot.substring(0,2));
						Saturdaydifference = Saturdayhour - SaturdayinitialHour;
						if(Saturdaydifference < 0){
							Saturdayhour = Saturdayhour + 12;
							Saturdaydifference = Saturdayhour - SaturdayinitialHour;
						}
						Saturdayminutes = Integer.parseInt(SatSlot.substring(3,5));
						Saturdayminutes = Saturdayminutes - SaturdayinitialMinute;
						Saturdayminutes = Saturdayminutes + Saturdaydifference*60;
						SaturdaydubMin = Saturdayminutes*2.5;
						SaturdayIntMinPix = (int)SaturdaydubMin;
						SaturdayFiller[counter] = new JPanel();
						SaturdayFiller[counter].setPreferredSize(new Dimension(216, SaturdayIntMinPix - accumulativeHeight));
						accumulativeHeight += (SaturdayIntMinPix - accumulativeHeight);
						SlotPanel[5].add(SaturdayFiller[counter]);
						numTours = SaturdayTimeSlot1.size();
						if(numTours % 2 == 0){
							SaturdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
							accumulativeHeight += (numTours/2)*20 + 12;
							SlotPanel[5].add(SaturdaySlot[m]);
						}
						else{
							SaturdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
							accumulativeHeight += ((numTours + 1)/2)*20 + 12;
							SlotPanel[5].add(SaturdaySlot[m]);
						}
					}
				}
					if(m == 1){
						SatSlot = Saturday1.get(m);
						if(SatSlot.length() == 4){
							Saturdayhour = Integer.parseInt(SatSlot.substring(0,1));
							Saturdaydifference = Saturdayhour - SaturdayinitialHour;
							if(Saturdaydifference < 0){
								Saturdayhour = Saturdayhour + 12;
								Saturdaydifference = Saturdayhour - SaturdayinitialHour;
							}
							Saturdayminutes = Integer.parseInt(SatSlot.substring(2,4));
							Saturdayminutes = Saturdayminutes - SaturdayinitialMinute;
							Saturdayminutes = Saturdayminutes + Saturdaydifference*60;
							SaturdaydubMin = Saturdayminutes*2.5;
							SaturdayIntMinPix = (int)SaturdaydubMin;
							SaturdayFiller[counter] = new JPanel();
							SaturdayFiller[counter].setPreferredSize(new Dimension(216, SaturdayIntMinPix - accumulativeHeight));
							accumulativeHeight += (SaturdayIntMinPix - accumulativeHeight);
							SlotPanel[5].add(SaturdayFiller[counter]);
							numTours = SaturdayTimeSlot2.size();
							if(numTours % 2 == 0){
								SaturdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
								accumulativeHeight += (numTours/2)*20 + 12;
								SlotPanel[5].add(SaturdaySlot[m]);
							}
							else{
								SaturdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
								accumulativeHeight += ((numTours + 1)/2)*20 + 12;
								SlotPanel[5].add(SaturdaySlot[m]);
							}
						}
					
						else{
							Saturdayhour = Integer.parseInt(SatSlot.substring(0,2));
							Saturdaydifference = Saturdayhour - SaturdayinitialHour;
							if(Saturdaydifference < 0){
								Saturdayhour = Saturdayhour + 12;
								Saturdaydifference = Saturdayhour - SaturdayinitialHour;
							}
							Saturdayminutes = Integer.parseInt(SatSlot.substring(3,5));
							Saturdayminutes = Saturdayminutes - SaturdayinitialMinute;
							Saturdayminutes = Saturdayminutes + Saturdaydifference*60;
							SaturdaydubMin = Saturdayminutes*2.5;
							SaturdayIntMinPix = (int)SaturdaydubMin;
							SaturdayFiller[counter] = new JPanel();
							SaturdayFiller[counter].setPreferredSize(new Dimension(216, SaturdayIntMinPix - accumulativeHeight));
							accumulativeHeight += (SaturdayIntMinPix - accumulativeHeight);
							SlotPanel[5].add(SaturdayFiller[counter]);
							numTours = SaturdayTimeSlot2.size();
							if(numTours % 2 == 0){
								SaturdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
								accumulativeHeight += (numTours/2)*20 + 12;
								SlotPanel[5].add(SaturdaySlot[m]);
							}
							else{
								SaturdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
								accumulativeHeight += ((numTours + 1)/2)*20 + 12;
								SlotPanel[5].add(SaturdaySlot[m]);
							}
						}
					}
						if(m == 2){
							SatSlot = Saturday1.get(m);
							if(SatSlot.length() == 4){
								Saturdayhour = Integer.parseInt(SatSlot.substring(0,1));
								Saturdaydifference = Saturdayhour - SaturdayinitialHour;
								if(Saturdaydifference < 0){
									Saturdayhour = Saturdayhour + 12;
									Saturdaydifference = Saturdayhour - SaturdayinitialHour;
								}
								Saturdayminutes = Integer.parseInt(SatSlot.substring(2,4));
								Saturdayminutes = Saturdayminutes - SaturdayinitialMinute;
								Saturdayminutes = Saturdayminutes + Saturdaydifference*60;
								SaturdaydubMin = Saturdayminutes*2.5;
								SaturdayIntMinPix = (int)SaturdaydubMin;
								SaturdayFiller[counter] = new JPanel();
								SaturdayFiller[counter].setPreferredSize(new Dimension(216, SaturdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (SaturdayIntMinPix - accumulativeHeight);
								SlotPanel[5].add(SaturdayFiller[counter]);
								numTours = SaturdayTimeSlot3.size();
								if(numTours % 2 == 0){
									SaturdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[5].add(SaturdaySlot[m]);
								}
								else{
									SaturdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[5].add(SaturdaySlot[m]);
								}
							}
							else{
								Saturdayhour = Integer.parseInt(SatSlot.substring(0,2));
								Saturdaydifference = Saturdayhour - SaturdayinitialHour;
								if(Saturdaydifference < 0){
									Saturdayhour = Saturdayhour + 12;
									Saturdaydifference = Saturdayhour - SaturdayinitialHour;
								}
								Saturdayminutes = Integer.parseInt(SatSlot.substring(3,5));
								Saturdayminutes = Saturdayminutes - SaturdayinitialMinute;
								Saturdayminutes = Saturdayminutes + Saturdaydifference*60;
								SaturdaydubMin = Saturdayminutes*2.5;
								SaturdayIntMinPix = (int)SaturdaydubMin;
								SaturdayFiller[counter] = new JPanel();
								SaturdayFiller[counter].setPreferredSize(new Dimension(216, SaturdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (SaturdayIntMinPix - accumulativeHeight);
								SlotPanel[5].add(SaturdayFiller[counter]);
								numTours = SaturdayTimeSlot3.size();
								if(numTours % 2 == 0){
									SaturdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[5].add(SaturdaySlot[m]);
								}
								else{
									SaturdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[5].add(SaturdaySlot[m]);
								}
							}
						}
						
						if(m == 3){
							SatSlot = Saturday1.get(m);
							if(SatSlot.length() == 4){
								Saturdayhour = Integer.parseInt(SatSlot.substring(0,1));
								Saturdaydifference = Saturdayhour - SaturdayinitialHour;
								if(Saturdaydifference < 0){
									Saturdayhour = Saturdayhour + 12;
									Saturdaydifference = Saturdayhour - SaturdayinitialHour;
								}
								Saturdayminutes = Integer.parseInt(SatSlot.substring(2,4));
								Saturdayminutes = Saturdayminutes - SaturdayinitialMinute;
								Saturdayminutes = Saturdayminutes + Saturdaydifference*60;
								SaturdaydubMin = Saturdayminutes*2.5;
								SaturdayIntMinPix = (int)SaturdaydubMin;
								SaturdayFiller[counter] = new JPanel();
								SaturdayFiller[counter].setPreferredSize(new Dimension(216, SaturdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (SaturdayIntMinPix - accumulativeHeight);
								SlotPanel[5].add(SaturdayFiller[counter]);
								numTours = SaturdayTimeSlot4.size();
								if(numTours % 2 == 0){
									SaturdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[5].add(SaturdaySlot[m]);
								}
								else{
									SaturdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[5].add(SaturdaySlot[m]);
								}
							}
							else{
								Saturdayhour = Integer.parseInt(SatSlot.substring(0,2));
								Saturdaydifference = Saturdayhour - SaturdayinitialHour;
								if(Saturdaydifference < 0){
									Saturdayhour = Saturdayhour + 12;
									Saturdaydifference = Saturdayhour - SaturdayinitialHour;
								}
								Saturdayminutes = Integer.parseInt(SatSlot.substring(3,5));
								Saturdayminutes = Saturdayminutes - SaturdayinitialMinute;
								Saturdayminutes = Saturdayminutes + Saturdaydifference*60;
								SaturdaydubMin = Saturdayminutes*2.5;
								SaturdayIntMinPix = (int)SaturdaydubMin;
								SaturdayFiller[counter] = new JPanel();
								SaturdayFiller[counter].setPreferredSize(new Dimension(216, SaturdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (SaturdayIntMinPix - accumulativeHeight);
								SlotPanel[5].add(SaturdayFiller[counter]);
								numTours = SaturdayTimeSlot4.size();
								if(numTours % 2 == 0){
									SaturdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[5].add(SaturdaySlot[m]);
								}
								else{
									SaturdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[5].add(SaturdaySlot[m]);
								}
							}
						}
						if(m == 4){
							SatSlot = Saturday1.get(m);
							if(SatSlot.length() == 4){
								Saturdayhour = Integer.parseInt(SatSlot.substring(0,1));
								Saturdaydifference = Saturdayhour - SaturdayinitialHour;
								if(Saturdaydifference < 0){
									Saturdayhour = Saturdayhour + 12;
									Saturdaydifference = Saturdayhour - SaturdayinitialHour;
								}
								Saturdayminutes = Integer.parseInt(SatSlot.substring(2,4));
								Saturdayminutes = Saturdayminutes - SaturdayinitialMinute;
								Saturdayminutes = Saturdayminutes + Saturdaydifference*60;
								SaturdaydubMin = Saturdayminutes*2.5;
								SaturdayIntMinPix = (int)SaturdaydubMin;
								SaturdayFiller[counter] = new JPanel();
								SaturdayFiller[counter].setPreferredSize(new Dimension(216, SaturdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (SaturdayIntMinPix - accumulativeHeight);
								SlotPanel[5].add(SaturdayFiller[counter]);
								numTours = SaturdayTimeSlot5.size();
								if(numTours % 2 == 0){
									SaturdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[5].add(SaturdaySlot[m]);
								}
								else{
									SaturdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[5].add(SaturdaySlot[m]);
								}
							}
							else{
								Saturdayhour = Integer.parseInt(SatSlot.substring(0,2));
								Saturdaydifference = Saturdayhour - SaturdayinitialHour;
								if(Saturdaydifference < 0){
									Saturdayhour = Saturdayhour + 12;
									Saturdaydifference = Saturdayhour - SaturdayinitialHour;
								}
								Saturdayminutes = Integer.parseInt(SatSlot.substring(3,5));
								Saturdayminutes = Saturdayminutes - SaturdayinitialMinute;
								Saturdayminutes = Saturdayminutes + Saturdaydifference*60;
								SaturdaydubMin = Saturdayminutes*2.5;
								SaturdayIntMinPix = (int)SaturdaydubMin;
								SaturdayFiller[counter] = new JPanel();
								SaturdayFiller[counter].setPreferredSize(new Dimension(216, SaturdayIntMinPix - accumulativeHeight));
								accumulativeHeight += (SaturdayIntMinPix - accumulativeHeight);
								SlotPanel[5].add(SaturdayFiller[counter]);
								numTours = SaturdayTimeSlot5.size();
								if(numTours % 2 == 0){
									SaturdaySlot[m].setPreferredSize(new Dimension(216, (numTours/2)*20 + 12));
									accumulativeHeight += (numTours/2)*20 + 12;
									SlotPanel[5].add(SaturdaySlot[m]);
								}
								else{
									SaturdaySlot[m].setPreferredSize(new Dimension(216, ((numTours + 1)/2)*20 + 12));
									accumulativeHeight += ((numTours + 1)/2)*20 + 12;
									SlotPanel[5].add(SaturdaySlot[m]);
								}
							}
						}
				}

			}
		
		JButton[] SaturdaySlot1;
		SaturdaySlot1 = new JButton[SaturdayTimeSlot1.size()];
		JPanel[] Satcell;
		Satcell = new JPanel[SaturdayTimeSlot1.size()];
		JPanel[] SatvisitType;
		SatvisitType = new JPanel[SaturdayTimeSlot1.size()];
		BoxLayout SatxSlot;
		
		for(int r = 0; r < SaturdayTimeSlot1.size(); r++){
			SaturdaySlot1[r] = new JButton();
			SaturdaySlot1[r].setText(SaturdayTimeSlot1.get(r).get(0));
			SaturdaySlot1[r].addActionListener(appListen);
			Satcell[r] = new JPanel();
			Satcell[r].setPreferredSize(new Dimension(106,20));
			SatxSlot = new BoxLayout(Satcell[r],BoxLayout.X_AXIS);
			SaturdaySlot1[r].setPreferredSize(new Dimension(90,18));
			SatvisitType[r] = new JPanel();
			SatvisitType[r].setPreferredSize(new Dimension(7,15));
			SatvisitType[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(SaturdayTimeSlot1.get(r).get(16).equals("yes")){
				if(SaturdayTimeSlot1.get(r).get(18).equals("null")){
					SatvisitType[r].setBackground(Color.RED);
				}
				else{
					SatvisitType[r].setBackground(Color.GREEN);
				}
			}
			if(SaturdayTimeSlot1.get(r).get(16).equals("no")){
				if(SaturdayTimeSlot1.get(r).get(17).equals("yes")){
					SatvisitType[r].setBackground(Color.BLACK);
				}
			}
			Satcell[r].add(SaturdaySlot1[r]);
			Satcell[r].add(SatvisitType[r]);
			SaturdaySlot[0].add(Satcell[r]);
		}
		
		JButton[] SaturdaySlot2;
		SaturdaySlot2 = new JButton[SaturdayTimeSlot2.size()];
		JPanel[] Satcell1;
		Satcell1 = new JPanel[SaturdayTimeSlot2.size()];
		JPanel[] SatvisitType1;
		SatvisitType1 = new JPanel[SaturdayTimeSlot2.size()];
		
		for(int r = 0; r < SaturdayTimeSlot2.size(); r++){
			SaturdaySlot2[r] = new JButton();
			SaturdaySlot2[r].setText(SaturdayTimeSlot2.get(r).get(0));
			SaturdaySlot2[r].addActionListener(appListen);
			Satcell1[r] = new JPanel();
			Satcell1[r].setPreferredSize(new Dimension(106,20));
			SatxSlot = new BoxLayout(Satcell1[r],BoxLayout.X_AXIS);
			SaturdaySlot2[r].setPreferredSize(new Dimension(90,18));
			SatvisitType1[r] = new JPanel();
			SatvisitType1[r].setPreferredSize(new Dimension(7,15));
			SatvisitType1[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(SaturdayTimeSlot2.get(r).get(16).equals("yes")){
				if(SaturdayTimeSlot2.get(r).get(18).equals("null")){
					SatvisitType1[r].setBackground(Color.RED);
				}
				else{
					SatvisitType1[r].setBackground(Color.GREEN);
				}
			}
			if(SaturdayTimeSlot2.get(r).get(16).equals("no")){
				if(SaturdayTimeSlot2.get(r).get(17).equals("yes")){
					SatvisitType1[r].setBackground(Color.BLACK);
				}
			}
			Satcell1[r].add(SaturdaySlot2[r]);
			Satcell1[r].add(SatvisitType1[r]);
			SaturdaySlot[1].add(Satcell1[r]);
		}
		
		JButton[] SaturdaySlot3;
		SaturdaySlot3 = new JButton[SaturdayTimeSlot3.size()];
		JPanel[] Satcell2;
		Satcell2 = new JPanel[SaturdayTimeSlot3.size()];
		JPanel[] SatvisitType2;
		SatvisitType2 = new JPanel[SaturdayTimeSlot3.size()];
		
		for(int r = 0; r < SaturdayTimeSlot3.size(); r++){
			SaturdaySlot3[r] = new JButton();
			SaturdaySlot3[r].setText(SaturdayTimeSlot3.get(r).get(0));
			SaturdaySlot3[r].addActionListener(appListen);
			Satcell2[r] = new JPanel();
			Satcell2[r].setPreferredSize(new Dimension(106,20));
			SatxSlot = new BoxLayout(Satcell2[r],BoxLayout.X_AXIS);
			SaturdaySlot3[r].setPreferredSize(new Dimension(90,18));
			SatvisitType2[r] = new JPanel();
			SatvisitType2[r].setPreferredSize(new Dimension(7,15));
			SatvisitType2[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(SaturdayTimeSlot3.get(r).get(16).equals("yes")){
				if(SaturdayTimeSlot3.get(r).get(18).equals("null")){
					SatvisitType2[r].setBackground(Color.RED);
				}
				else{
					SatvisitType2[r].setBackground(Color.GREEN);
				}
			}
			if(SaturdayTimeSlot3.get(r).get(16).equals("no")){
				if(SaturdayTimeSlot3.get(r).get(17).equals("yes")){
					SatvisitType2[r].setBackground(Color.BLACK);
				}
			}
			Satcell2[r].add(SaturdaySlot3[r]);
			Satcell2[r].add(SatvisitType2[r]);
			SaturdaySlot[2].add(Satcell2[r]);
		}
		
		JButton[] SaturdaySlot4;
		SaturdaySlot4 = new JButton[SaturdayTimeSlot4.size()];
		JPanel[] Satcell3;
		Satcell3 = new JPanel[SaturdayTimeSlot4.size()];
		JPanel[] SatvisitType3;
		SatvisitType3 = new JPanel[SaturdayTimeSlot4.size()];
		
		for(int r = 0; r < SaturdayTimeSlot4.size(); r++){
			SaturdaySlot4[r] = new JButton();
			SaturdaySlot4[r].setText(SaturdayTimeSlot4.get(r).get(0));
			SaturdaySlot4[r].addActionListener(appListen);
			Satcell3[r] = new JPanel();
			Satcell3[r].setPreferredSize(new Dimension(106,20));
			SatxSlot = new BoxLayout(Satcell3[r],BoxLayout.X_AXIS);
			SaturdaySlot4[r].setPreferredSize(new Dimension(90,18));
			SatvisitType3[r] = new JPanel();
			SatvisitType3[r].setPreferredSize(new Dimension(7,15));
			SatvisitType3[r].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			if(SaturdayTimeSlot4.get(r).get(16).equals("yes")){
				if(SaturdayTimeSlot4.get(r).get(18).equals("null")){
					SatvisitType3[r].setBackground(Color.RED);
				}
				else{
					SatvisitType3[r].setBackground(Color.GREEN);
				}
			}
			if(SaturdayTimeSlot4.get(r).get(16).equals("no")){
				if(SaturdayTimeSlot4.get(r).get(17).equals("yes")){
					SatvisitType3[r].setBackground(Color.BLACK);
				}
			}
			Satcell3[r].add(SaturdaySlot4[r]);
			Satcell3[r].add(SatvisitType3[r]);
			SaturdaySlot[3].add(Satcell3[r]);
		}

		
		ScheduleWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ScheduleWindow.setSize(1420,835);
		ScheduleWindow.setResizable(false);
		ScheduleWindow.setVisible(true);
	}
	
}

