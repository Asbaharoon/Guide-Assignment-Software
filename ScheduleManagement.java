import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.PrintWriter;
import java.io.Writer;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ScheduleManagement {

	private JSpinner day;
	private JComboBox month;
	private JSpinner year;
	private JSpinner day1;
	private JComboBox month1;
	private JSpinner year1;
	private JTextField[] FallWeek1Monday;
	private JTextField[] FallWeek1Tuesday;
	private JTextField[] FallWeek1Wednesday;
	private JTextField[] FallWeek1Thursday;
	private JTextField[] FallWeek1Friday;
	private JTextField[] FallWeek1Saturday;
	private JTextField[] FallWeek2Monday;
	private JTextField[] FallWeek2Tuesday;
	private JTextField[] FallWeek2Wednesday;
	private JTextField[] FallWeek2Thursday;
	private JTextField[] FallWeek2Friday;
	private JTextField[] FallWeek2Saturday;
	private JSpinner day2;
	private JComboBox month2;
	private JSpinner year2;
	private JSpinner day3;
	private JComboBox month3;
	private JSpinner year3;
	private JTextField[] WinterWeek1Monday;
	private JTextField[] WinterWeek1Tuesday;
	private JTextField[] WinterWeek1Wednesday;
	private JTextField[] WinterWeek1Thursday;
	private JTextField[] WinterWeek1Friday;
	private JTextField[] WinterWeek1Saturday;
	private JTextField[] WinterWeek2Monday;
	private JTextField[] WinterWeek2Tuesday;
	private JTextField[] WinterWeek2Wednesday;
	private JTextField[] WinterWeek2Thursday;
	private JTextField[] WinterWeek2Friday;
	private JTextField[] WinterWeek2Saturday;
	private JSpinner Springday;
	private JComboBox Springmonth;
	private JSpinner Springyear;
	private JSpinner Springday2;
	private JComboBox Springmonth2;
	private JSpinner Springyear2;
	private JTextField[] SpringWeek1Monday;
	private JTextField[] SpringWeek1Tuesday;
	private JTextField[] SpringWeek1Wednesday;
	private JTextField[] SpringWeek1Thursday;
	private JTextField[] SpringWeek1Friday;
	private JTextField[] SpringWeek1Saturday;
	private JTextField[] SpringWeek2Monday;
	private JTextField[] SpringWeek2Tuesday;
	private JTextField[] SpringWeek2Wednesday;
	private JTextField[] SpringWeek2Thursday;
	private JTextField[] SpringWeek2Friday;
	private JTextField[] SpringWeek2Saturday;
	private JSpinner Summerday;
	private JComboBox Summermonth;
	private JSpinner Summeryear;
	private JSpinner Summerday2;
	private JComboBox Summermonth2;
	private JSpinner Summeryear2;
	private JTextField[] SummerWeek1Monday;
	private JTextField[] SummerWeek1Tuesday;
	private JTextField[] SummerWeek1Wednesday;
	private JTextField[] SummerWeek1Thursday;
	private JTextField[] SummerWeek1Friday;
	private JTextField[] SummerWeek1Saturday;
	private JTextField[] SummerWeek2Monday;
	private JTextField[] SummerWeek2Tuesday;
	private JTextField[] SummerWeek2Wednesday;
	private JTextField[] SummerWeek2Thursday;
	private JTextField[] SummerWeek2Friday;
	private JTextField[] SummerWeek2Saturday;
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
	private ArrayList<String> TermStartDateFile;
	private ArrayList<String> TermEndDateFile;
	private ArrayList<String> WinterMonday1;
	private ArrayList<String> WinterTuesday1;
	private ArrayList<String> WinterWednesday1;
	private ArrayList<String> WinterThursday1;
	private ArrayList<String> WinterFriday1;
	private ArrayList<String> WinterSaturday1;
	private ArrayList<String> WinterMonday2;
	private ArrayList<String> WinterTuesday2;
	private ArrayList<String> WinterWednesday2;
	private ArrayList<String> WinterThursday2;
	private ArrayList<String> WinterFriday2;
	private ArrayList<String> WinterSaturday2;
	private ArrayList<String> WinterTermStartDateFile;
	private ArrayList<String> WinterTermEndDateFile;
	private ArrayList<String> SpringMonday1;
	private ArrayList<String> SpringTuesday1;
	private ArrayList<String> SpringWednesday1;
	private ArrayList<String> SpringThursday1;
	private ArrayList<String> SpringFriday1;
	private ArrayList<String> SpringSaturday1;
	private ArrayList<String> SpringMonday2;
	private ArrayList<String> SpringTuesday2;
	private ArrayList<String> SpringWednesday2;
	private ArrayList<String> SpringThursday2;
	private ArrayList<String> SpringFriday2;
	private ArrayList<String> SpringSaturday2;
	private ArrayList<String> SpringTermStartDateFile;
	private ArrayList<String> SpringTermEndDateFile;
	private ArrayList<String> SummerMonday1;
	private ArrayList<String> SummerTuesday1;
	private ArrayList<String> SummerWednesday1;
	private ArrayList<String> SummerThursday1;
	private ArrayList<String> SummerFriday1;
	private ArrayList<String> SummerSaturday1;
	private ArrayList<String> SummerMonday2;
	private ArrayList<String> SummerTuesday2;
	private ArrayList<String> SummerWednesday2;
	private ArrayList<String> SummerThursday2;
	private ArrayList<String> SummerFriday2;
	private ArrayList<String> SummerSaturday2;
	private ArrayList<String> SummerTermStartDateFile;
	private ArrayList<String> SummerTermEndDateFile;
	
	public void construct(){
		JFrame ManageSchedule;
		ManageSchedule = new JFrame("Manage Schedule");
		
		JPanel ScreenPanel;
		ScreenPanel = new JPanel();
		ScreenPanel.setPreferredSize(new Dimension(1440,835));
		BoxLayout yFrame;
		yFrame = new BoxLayout(ScreenPanel, BoxLayout.Y_AXIS);
		ManageSchedule.add(ScreenPanel);
		
		// Top Label
		JPanel topSchedule;
		topSchedule = new JPanel();
		topSchedule.setPreferredSize(new Dimension(1440,25));
		
		JLabel topLabel;
		topLabel = new JLabel("Manage Schedule");
		topLabel.setFont(new Font("Serif", Font.PLAIN, 20));
		topSchedule.add(topLabel, BorderLayout.CENTER);
		
		ScreenPanel.add(topSchedule);
		
		// scroll
		
		JPanel Terms;
		Terms = new JPanel();
		Terms.setPreferredSize(new Dimension(1420,1230));
		
		JScrollPane scroll;
		scroll = new JScrollPane(Terms);
		scroll.setPreferredSize(new Dimension(1430,800));
		ScreenPanel.add(scroll, BorderLayout.SOUTH);
		
		// Fall
		JPanel FallPanel;
		FallPanel = new JPanel();
		FallPanel.setPreferredSize(new Dimension(1420,300));
		FallPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		BoxLayout xFall;
		xFall = new BoxLayout(FallPanel, BoxLayout.X_AXIS);
		
		JPanel[] fallCell;
		fallCell = new JPanel[4];
		BoxLayout[] yboxlayout;
		yboxlayout = new BoxLayout[3];
		
		for(int a = 0; a < 4; a++){
			fallCell[a] = new JPanel();
			if(a==0){
				FallPanel.add(fallCell[a]);
			}
			else{
			fallCell[a].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			FallPanel.add(fallCell[a]);
			}
		}
		
		for(int b = 0; b < 3; b++){
			yboxlayout[b] = new BoxLayout(fallCell[b+1],BoxLayout.Y_AXIS);
		}
		
		//fallCell[0]
		fallCell[0].setPreferredSize(new Dimension(120,290));
		JPanel FallLabelPanel;
		FallLabelPanel = new JPanel();
		FallLabelPanel.setPreferredSize(new Dimension(120, 280));
		
		BorderLayout centerFallLabel;
		centerFallLabel = new BorderLayout();
		FallLabelPanel.setLayout(centerFallLabel);
		
		JLabel fall;
		fall = new JLabel("Fall");
		fall.setFont(new Font("Serif", Font.PLAIN, 35));
		Font font = fall.getFont();
		Map attributes = font.getAttributes();
		attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		fall.setFont(font.deriveFont(attributes));
		fall.setPreferredSize(new Dimension(50,50));
		fall.setHorizontalAlignment(SwingConstants.CENTER);
		
		FallLabelPanel.add(fall, BorderLayout.CENTER);
		fallCell[0].add(FallLabelPanel, BorderLayout.CENTER);
		
		//fallCell[1]
		fallCell[1].setPreferredSize(new Dimension(430,290));
		
		JPanel[] xDate;
		xDate = new JPanel[3];
		
		for(int c = 0; c < 3; c++){
			xDate[c] = new JPanel();
			xDate[c].setPreferredSize(new Dimension(424,80));
			fallCell[1].add(xDate[c]);
		}
		
		JLabel startDate;
		startDate = new JLabel("Term Start Date:");
		xDate[0].add(startDate);
		
		JPanel[] yDatePanel;
		yDatePanel = new JPanel[3];
		BoxLayout[] yDate;
		yDate = new BoxLayout[3];
		
		for(int d = 0; d < 3; d++){
			yDatePanel[d] = new JPanel();
			yDate[d] = new BoxLayout(yDatePanel[d], BoxLayout.Y_AXIS);
			xDate[0].add(yDatePanel[d]);
		}
		
		yDatePanel[0].setPreferredSize(new Dimension(120,72));
		
		JLabel monthLabel;
		monthLabel = new JLabel("Month");
		yDatePanel[0].add(monthLabel);
		
		String[] Month = {" ","January","February","March","April","May","June","July","August","September","October","November","December"};
		month = new JComboBox(Month);
		yDatePanel[0].add(month);
		
		yDatePanel[1].setPreferredSize(new Dimension(73,72));
		
		JLabel dayLabel;
		dayLabel = new JLabel("Day");
		yDatePanel[1].add(dayLabel);
		SpinnerNumberModel Day = new SpinnerNumberModel(1,1,31,1);
		day = new JSpinner(Day);
		yDatePanel[1].add(day);
		
		yDatePanel[2].setPreferredSize(new Dimension(98,72));
		
		JLabel yearLabel;
		yearLabel = new JLabel("Year");
		yDatePanel[2].add(yearLabel);
		SpinnerNumberModel Year = new SpinnerNumberModel(2013,2013,null,1);
		year = new JSpinner(Year);
		yDatePanel[2].add(year);
		
		JLabel TermEndDate;
		TermEndDate = new JLabel("Term End Date:");
		xDate[1].add(TermEndDate);
		
		JPanel[] yDatePanel1;
		yDatePanel1 = new JPanel[3];
		BoxLayout[] yDate1;
		yDate1 = new BoxLayout[3];
		
		for(int d = 0; d < 3; d++){
			yDatePanel1[d] = new JPanel();
			yDate1[d] = new BoxLayout(yDatePanel1[d], BoxLayout.Y_AXIS);
			xDate[1].add(yDatePanel1[d]);
		}
		
		yDatePanel1[0].setPreferredSize(new Dimension(120,72));
		
		JLabel monthLabel1;
		monthLabel1 = new JLabel("Month");
		yDatePanel1[0].add(monthLabel1);
		
		String[] Month1 = {" ","January","February","March","April","May","June","July","August","September","October","November","December"};
		month1 = new JComboBox(Month1);
		yDatePanel1[0].add(month1);
		
		yDatePanel1[1].setPreferredSize(new Dimension(73,72));
		
		JLabel dayLabel1;
		dayLabel1 = new JLabel("Day");
		yDatePanel1[1].add(dayLabel1);
		SpinnerNumberModel Day1 = new SpinnerNumberModel(1,1,31,1);
		day1 = new JSpinner(Day1);
		yDatePanel1[1].add(day1);
		
		yDatePanel1[2].setPreferredSize(new Dimension(98,72));
		
		JLabel yearLabel1;
		yearLabel1 = new JLabel("Year");
		yDatePanel1[2].add(yearLabel1);
		SpinnerNumberModel Year1 = new SpinnerNumberModel(2013,2013,null,1);
		year1 = new JSpinner(Year1);
		yDatePanel1[2].add(year1);
		
		JButton FallSave;
		FallSave = new JButton("Save");
		
		xDate[2].add(FallSave);
		
		
		//fallCell[2]
		fallCell[2].setPreferredSize(new Dimension(424,290));
		
		JPanel topWeek1;
		topWeek1 = new JPanel();
		topWeek1.setPreferredSize(new Dimension(110,30));
		JLabel week1Heading;
		week1Heading = new JLabel("Week 1");
		week1Heading.setFont(new Font("Serif", Font.PLAIN, 20));
		Font font1 = week1Heading.getFont();
		Map attributes1 = font1.getAttributes();
		attributes1.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		week1Heading.setFont(font1.deriveFont(attributes1));
		topWeek1.add(week1Heading);
		fallCell[2].add(topWeek1);
		
		JPanel[] xtime;
		xtime = new JPanel[7];
		
		BoxLayout[] horizontal;
		horizontal = new BoxLayout[7];

		FallWeek1Monday = new JTextField[6];
		FallWeek1Tuesday = new JTextField[6];
		FallWeek1Wednesday = new JTextField[6];
		FallWeek1Thursday = new JTextField[6];
		FallWeek1Friday = new JTextField[6];
		FallWeek1Saturday = new JTextField[6];
		
		JLabel[] timeSlotHeading;
		timeSlotHeading = new JLabel[7];
		
		timeSlotHeading[0] = new JLabel("Time Slot:");
		timeSlotHeading[0].setPreferredSize(new Dimension(75,20));
		timeSlotHeading[1] = new JLabel("Monday:");
		timeSlotHeading[1].setPreferredSize(new Dimension(75,20));
		timeSlotHeading[2] = new JLabel("Tuesday:");
		timeSlotHeading[2].setPreferredSize(new Dimension(75,20));
		timeSlotHeading[3] = new JLabel("Wednesday:");
		timeSlotHeading[3].setPreferredSize(new Dimension(75,20));
		timeSlotHeading[4] = new JLabel("Thursday:");
		timeSlotHeading[4].setPreferredSize(new Dimension(75,20));
		timeSlotHeading[5] = new JLabel("Friday:");
		timeSlotHeading[5].setPreferredSize(new Dimension(75,20));
		timeSlotHeading[6] = new JLabel("Saturday:");
		timeSlotHeading[6].setPreferredSize(new Dimension(75,20));
		
		JLabel[] SlotNumber;
		SlotNumber = new JLabel[6];
		
		SlotNumber[0] = new JLabel("1");
		SlotNumber[1] = new JLabel("2");
		SlotNumber[2] = new JLabel("3");
		SlotNumber[3] = new JLabel("4");
		SlotNumber[4] = new JLabel("5");
		SlotNumber[5] = new JLabel("6");
		
		for(int f = 0; f < 6; f++){
			SlotNumber[f].setPreferredSize(new Dimension(50,20));
			SlotNumber[f].setHorizontalAlignment(SwingConstants.CENTER);
		}
		
		for(int h = 0; h < 6; h++){
			FallWeek1Monday[h] = new JTextField();
			FallWeek1Monday[h].setPreferredSize(new Dimension(50,20));
			FallWeek1Tuesday[h] = new JTextField();
			FallWeek1Tuesday[h].setPreferredSize(new Dimension(50,20));
			FallWeek1Wednesday[h] = new JTextField();
			FallWeek1Wednesday[h].setPreferredSize(new Dimension(50,20));
			FallWeek1Thursday[h] = new JTextField();
			FallWeek1Thursday[h].setPreferredSize(new Dimension(50,20));
			FallWeek1Friday[h] = new JTextField();
			FallWeek1Friday[h].setPreferredSize(new Dimension(50,20));
			FallWeek1Saturday[h] = new JTextField();
			FallWeek1Saturday[h].setPreferredSize(new Dimension(50,20));
		}
		
		for(int e = 0; e < 7; e++){
			xtime[e] = new JPanel();
			xtime[e].setPreferredSize(new Dimension(414,30));
			horizontal[e] = new BoxLayout(xtime[e], BoxLayout.X_AXIS);
			xtime[e].add(timeSlotHeading[e]);
			if(e == 0){
				for(int g = 0; g < 6; g++){
					xtime[0].add(SlotNumber[g]);
				}
			}
		}
		
		for(int i = 0; i < 6; i++){
			xtime[1].add(FallWeek1Monday[i]);
		}
		
		for(int j = 0; j < 6; j++){
			xtime[2].add(FallWeek1Tuesday[j]);
		}
		
		for(int k = 0; k < 6; k++){
			xtime[3].add(FallWeek1Wednesday[k]);
		}
		
		for(int l = 0; l < 6; l++){
			xtime[4].add(FallWeek1Thursday[l]);
		}
		
		for(int m = 0; m < 6; m++){
			xtime[5].add(FallWeek1Friday[m]);
		}
		
		for(int n = 0; n < 6; n++){
			xtime[6].add(FallWeek1Saturday[n]);
		}
		
		for(int i = 0; i < 7; i++){
		fallCell[2].add(xtime[i]);
		xtime[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
		}
		
		//fallCell[3]
		fallCell[3].setPreferredSize(new Dimension(424,290));
		
		JPanel topWeek2;
		topWeek2 = new JPanel();
		topWeek2.setPreferredSize(new Dimension(110,30));
		JLabel week2Heading;
		week2Heading = new JLabel("Week 2");
		week2Heading.setFont(new Font("Serif", Font.PLAIN, 20));
		Font Fallfont2 = week2Heading.getFont();
		Map Fallattributes2 = Fallfont2.getAttributes();
		Fallattributes2.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		week2Heading.setFont(Fallfont2.deriveFont(Fallattributes2));
		topWeek2.add(week2Heading);
		fallCell[3].add(topWeek2);
		
		JPanel[] Fallxtime2;
		Fallxtime2 = new JPanel[7];
		
		BoxLayout[] Fallhorizontal2;
		Fallhorizontal2 = new BoxLayout[7];
		
		FallWeek2Monday = new JTextField[6];
		FallWeek2Tuesday = new JTextField[6];
		FallWeek2Wednesday = new JTextField[6];
		FallWeek2Thursday = new JTextField[6];
		FallWeek2Friday = new JTextField[6];
		FallWeek2Saturday = new JTextField[6];
		
		JLabel[] FalltimeSlotHeading2;
		FalltimeSlotHeading2 = new JLabel[7];
		
		FalltimeSlotHeading2[0] = new JLabel("Time Slot:");
		FalltimeSlotHeading2[0].setPreferredSize(new Dimension(75,20));
		FalltimeSlotHeading2[1] = new JLabel("Monday:");
		FalltimeSlotHeading2[1].setPreferredSize(new Dimension(75,20));
		FalltimeSlotHeading2[2] = new JLabel("Tuesday:");
		FalltimeSlotHeading2[2].setPreferredSize(new Dimension(75,20));
		FalltimeSlotHeading2[3] = new JLabel("Wednesday:");
		FalltimeSlotHeading2[3].setPreferredSize(new Dimension(75,20));
		FalltimeSlotHeading2[4] = new JLabel("Thursday:");
		FalltimeSlotHeading2[4].setPreferredSize(new Dimension(75,20));
		FalltimeSlotHeading2[5] = new JLabel("Friday:");
		FalltimeSlotHeading2[5].setPreferredSize(new Dimension(75,20));
		FalltimeSlotHeading2[6] = new JLabel("Saturday:");
		FalltimeSlotHeading2[6].setPreferredSize(new Dimension(75,20));
		
		JLabel[] FallSlotNumber2;
		FallSlotNumber2 = new JLabel[6];
		
		FallSlotNumber2[0] = new JLabel("1");
		FallSlotNumber2[1] = new JLabel("2");
		FallSlotNumber2[2] = new JLabel("3");
		FallSlotNumber2[3] = new JLabel("4");
		FallSlotNumber2[4] = new JLabel("5");
		FallSlotNumber2[5] = new JLabel("6");
		
		for(int f = 0; f < 6; f++){
			FallSlotNumber2[f].setPreferredSize(new Dimension(50,20));
			FallSlotNumber2[f].setHorizontalAlignment(SwingConstants.CENTER);
		}
		
		for(int h = 0; h < 6; h++){
			FallWeek2Monday[h] = new JTextField();
			FallWeek2Monday[h].setPreferredSize(new Dimension(50,20));
			FallWeek2Tuesday[h] = new JTextField();
			FallWeek2Tuesday[h].setPreferredSize(new Dimension(50,20));
			FallWeek2Wednesday[h] = new JTextField();
			FallWeek2Wednesday[h].setPreferredSize(new Dimension(50,20));
			FallWeek2Thursday[h] = new JTextField();
			FallWeek2Thursday[h].setPreferredSize(new Dimension(50,20));
			FallWeek2Friday[h] = new JTextField();
			FallWeek2Friday[h].setPreferredSize(new Dimension(50,20));
			FallWeek2Saturday[h] = new JTextField();
			FallWeek2Saturday[h].setPreferredSize(new Dimension(50,20));
		}
		
		for(int e = 0; e < 7; e++){
			Fallxtime2[e] = new JPanel();
			Fallxtime2[e].setPreferredSize(new Dimension(414,30));
			Fallhorizontal2[e] = new BoxLayout(xtime[e], BoxLayout.X_AXIS);
			Fallxtime2[e].add(FalltimeSlotHeading2[e]);
			if(e == 0){
				for(int g = 0; g < 6; g++){
					Fallxtime2[0].add(FallSlotNumber2[g]);
				}
			}
		}
		
		for(int i = 0; i < 6; i++){
			Fallxtime2[1].add(FallWeek2Monday[i]);
		}
		
		for(int j = 0; j < 6; j++){
			Fallxtime2[2].add(FallWeek2Tuesday[j]);
		}
		
		for(int k = 0; k < 6; k++){
			Fallxtime2[3].add(FallWeek2Wednesday[k]);
		}
		
		for(int l = 0; l < 6; l++){
			Fallxtime2[4].add(FallWeek2Thursday[l]);
		}
		
		for(int m = 0; m < 6; m++){
			Fallxtime2[5].add(FallWeek2Friday[m]);
		}
		
		for(int n = 0; n < 6; n++){
			Fallxtime2[6].add(FallWeek2Saturday[n]);
		}
		
		for(int i = 0; i < 7; i++){
		fallCell[3].add(Fallxtime2[i]);
		Fallxtime2[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
		}
		
		class FallBtnListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				
				Term FallTerm;
				FallTerm = new Term();
				FallTerm.setStartDay((Integer) day.getValue());
				FallTerm.setStartMonth(month.getSelectedItem().toString());
				FallTerm.setStartYear((Integer) year.getValue());
				FallTerm.setTermName("Fall");
				FallTerm.setEndDay((Integer) day1.getValue());
				FallTerm.setEndMonth(month1.getSelectedItem().toString());
				FallTerm.setEndYear((Integer) year1.getValue());
				
				ArrayList<String> Week1Monday = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					Week1Monday.add(a, FallWeek1Monday[a].getText());
				}
				FallTerm.setWeek1MondaySlots(Week1Monday);
				
				ArrayList<String> Week1Tuesday = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					Week1Tuesday.add(a, FallWeek1Tuesday[a].getText());
				}
				FallTerm.setWeek1TuesdaySlots(Week1Tuesday);
				
				ArrayList<String> Week1Wednesday = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					Week1Wednesday.add(a, FallWeek1Wednesday[a].getText());
				}
				FallTerm.setWeek1WednesdaySlots(Week1Wednesday);
				
				ArrayList<String> Week1Thursday = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					Week1Thursday.add(a, FallWeek1Thursday[a].getText());
				}
				FallTerm.setWeek1ThursdaySlots(Week1Thursday);
				
				ArrayList<String> Week1Friday = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					Week1Friday.add(a, FallWeek1Friday[a].getText());
				}
				FallTerm.setWeek1FridaySlots(Week1Friday);
				
				ArrayList<String> Week1Saturday = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					Week1Saturday.add(a, FallWeek1Saturday[a].getText());
				}
				FallTerm.setWeek1SaturdaySlots(Week1Saturday);
				
				ArrayList<String> Week2Monday = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					Week2Monday.add(a, FallWeek2Monday[a].getText());
				}
				FallTerm.setWeek2MondaySlots(Week2Monday);
				
				ArrayList<String> Week2Tuesday = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					Week2Tuesday.add(a, FallWeek2Tuesday[a].getText());
				}
				FallTerm.setWeek2TuesdaySlots(Week2Tuesday);
				
				ArrayList<String> Week2Wednesday = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					Week2Wednesday.add(a, FallWeek2Wednesday[a].getText());
				}
				FallTerm.setWeek2WednesdaySlots(Week2Wednesday);
				
				ArrayList<String> Week2Thursday = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					Week2Thursday.add(a, FallWeek2Thursday[a].getText());
				}
				FallTerm.setWeek2ThursdaySlots(Week2Thursday);
				
				ArrayList<String> Week2Friday = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					Week2Friday.add(a, FallWeek2Friday[a].getText());
				}
				FallTerm.setWeek2FridaySlots(Week2Friday);
				
				ArrayList<String> Week2Saturday = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					Week2Saturday.add(a, FallWeek2Saturday[a].getText());
				}
				FallTerm.setWeek2SaturdaySlots(Week2Saturday);
				
				 
				// Create File
 
				try {
					File Fallfile = new File("Fall.txt");
					FileWriter Fallwriter = new FileWriter(Fallfile, false);
					PrintWriter FallPW = new PrintWriter(Fallwriter);
					
					// Print Monday Week 1 Time slots
					for(int a = 0; a < FallTerm.getWeek1MondaySlots().size(); a++){
						if(FallTerm.getWeek1MondaySlots().get(a).toString().equals("")){							
						}
						else{
							FallPW.print(FallTerm.getWeek1MondaySlots().get(a).toString() + " ");
						}
					}
					FallPW.println();
					
					// Print Tuesday Week 1 Time Slots
					for(int a = 0; a < FallTerm.getWeek1TuesdaySlots().size(); a++){
						if(FallTerm.getWeek1TuesdaySlots().get(a).toString().equals("")){							
						}
						else{
							FallPW.print(FallTerm.getWeek1TuesdaySlots().get(a).toString() + " ");
						}
					}
					FallPW.println();
					
					// Print Wednesday Week 1 Time Slots
					for(int a = 0; a < FallTerm.getWeek1WednesdaySlots().size(); a++){
						if(FallTerm.getWeek1WednesdaySlots().get(a).toString().equals("")){							
						}
						else{
							FallPW.print(FallTerm.getWeek1WednesdaySlots().get(a).toString() + " ");
						}
					}
					FallPW.println();
					
					// Print Thursday Week 1 Time Slots
					for(int a = 0; a < FallTerm.getWeek1ThursdaySlots().size(); a++){
						if(FallTerm.getWeek1ThursdaySlots().get(a).toString().equals("")){							
						}
						else{
							FallPW.print(FallTerm.getWeek1ThursdaySlots().get(a).toString() + " ");
						}
					}
					FallPW.println();
					
					// Print Friday Week 1 Time Slots
					for(int a = 0; a < FallTerm.getWeek1FridaySlots().size(); a++){
						if(FallTerm.getWeek1FridaySlots().get(a).toString().equals("")){							
						}
						else{
							FallPW.print(FallTerm.getWeek1FridaySlots().get(a).toString() + " ");
						}
					}
					FallPW.println();
					
					// Print Saturday Week 1 Time Slots
					for(int a = 0; a < FallTerm.getWeek1SaturdaySlots().size(); a++){
						if(FallTerm.getWeek1SaturdaySlots().get(a).toString().equals("")){							
						}
						else{
							FallPW.print(FallTerm.getWeek1SaturdaySlots().get(a).toString() + " ");
						}
					}
					FallPW.println();
					
					// Print Monday Week 2 Time Slots
					for(int a = 0; a < FallTerm.getWeek2MondaySlots().size(); a++){
						if(FallTerm.getWeek2MondaySlots().get(a).toString().equals("")){							
						}
						else{
							FallPW.print(FallTerm.getWeek2MondaySlots().get(a).toString() + " ");
						}
					}
					FallPW.println();
					
					// Print Tuesday Week 2 Time Slots
					for(int a = 0; a < FallTerm.getWeek2TuesdaySlots().size(); a++){
						if(FallTerm.getWeek2TuesdaySlots().get(a).toString().equals("")){							
						}
						else{
							FallPW.print(FallTerm.getWeek2TuesdaySlots().get(a).toString() + " ");
						}
					}
					FallPW.println();
					
					// Print Wednesday Week 2 Time Slots
					for(int a = 0; a < FallTerm.getWeek2WednesdaySlots().size(); a++){
						if(FallTerm.getWeek2WednesdaySlots().get(a).toString().equals("")){							
						}
						else{
							FallPW.print(FallTerm.getWeek2WednesdaySlots().get(a).toString() + " ");
						}
					}
					FallPW.println();
					
					// Print Thursday Week 2 Time Slots
					for(int a = 0; a < FallTerm.getWeek2ThursdaySlots().size(); a++){
						if(FallTerm.getWeek2ThursdaySlots().get(a).toString().equals("")){							
						}
						else{
							FallPW.print(FallTerm.getWeek2ThursdaySlots().get(a).toString() + " ");
						}
					}
					FallPW.println();
					
					// Print Friday Week 2 Time Slots
					for(int a = 0; a < FallTerm.getWeek2FridaySlots().size(); a++){
						if(FallTerm.getWeek2FridaySlots().get(a).toString().equals("")){							
						}
						else{
							FallPW.print(FallTerm.getWeek2FridaySlots().get(a).toString() + " ");
						}
					}
					FallPW.println();
					
					// Print Saturday Week 2 Time Slots
					for(int a = 0; a < FallTerm.getWeek2SaturdaySlots().size(); a++){
						if(FallTerm.getWeek2SaturdaySlots().get(a).toString().equals("")){							
						}
						else{
							FallPW.print(FallTerm.getWeek2SaturdaySlots().get(a).toString() + " ");
						}
					}
					FallPW.println();
					FallPW.println();
					
					// Term Start Month
					FallPW.println(FallTerm.getStartMonth().toString());
					
					// Term Start Day
					FallPW.println(FallTerm.getStartDay());
					
					// Term Start Year
					FallPW.println(FallTerm.getStartYear());
					FallPW.println();
					
					// Term End Month
					FallPW.println(FallTerm.getEndMonth().toString());
					
					// Term End Day
					FallPW.println(FallTerm.getEndDay());
					
					// Term End Year
					FallPW.println(FallTerm.getEndYear());
					
					FallPW.close();
				} catch (IOException u) {
					return;
				}
			}
		}
		
		FallBtnListener b = new FallBtnListener();
		FallSave.addActionListener(b);
		
		Terms.add(FallPanel);
		
		// Winter
		
		JPanel WinterPanel;
		WinterPanel = new JPanel();
		WinterPanel.setPreferredSize(new Dimension(1420,300));
		WinterPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		BoxLayout xWinter;
		xWinter = new BoxLayout(WinterPanel, BoxLayout.X_AXIS);
		
		JPanel[] WinterCell;
		WinterCell = new JPanel[4];
		BoxLayout[] yboxlayout2;
		yboxlayout2 = new BoxLayout[3];
		
		for(int a = 0; a < 4; a++){
			WinterCell[a] = new JPanel();
			if(a==0){
				WinterPanel.add(WinterCell[a]);
			}
			else{
			WinterCell[a].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			WinterPanel.add(WinterCell[a]);
			}
		}
		
		for(int v = 0; v < 3; v++){
			yboxlayout[v] = new BoxLayout(WinterCell[v+1],BoxLayout.Y_AXIS);
		}
		
		//WinterCell[0]
		WinterCell[0].setPreferredSize(new Dimension(120,290));
		JPanel WinterLabelPanel;
		WinterLabelPanel = new JPanel();
		WinterLabelPanel.setPreferredSize(new Dimension(120, 280));
		
		BorderLayout centerWinterLabel;
		centerWinterLabel = new BorderLayout();
		WinterLabelPanel.setLayout(centerWinterLabel);
		
		JLabel Winter;
		Winter = new JLabel("Winter");
		Winter.setFont(new Font("Serif", Font.PLAIN, 35));
		Font font3 = Winter.getFont();
		Map attributes3 = font3.getAttributes();
		attributes3.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		Winter.setFont(font3.deriveFont(attributes3));
		Winter.setHorizontalAlignment(SwingConstants.CENTER);
		
		WinterLabelPanel.add(Winter, BorderLayout.CENTER);
		WinterCell[0].add(WinterLabelPanel, BorderLayout.CENTER);
		
		//WinterCell[1]
		WinterCell[1].setPreferredSize(new Dimension(430,290));
		
		JPanel[] xDate2;
		xDate2 = new JPanel[3];
		
		for(int c = 0; c < 3; c++){
			xDate2[c] = new JPanel();
			xDate2[c].setPreferredSize(new Dimension(424,80));
			WinterCell[1].add(xDate2[c]);
		}
		
		JLabel startDate2;
		startDate2 = new JLabel("Term Start Date:");
		xDate2[0].add(startDate2);
		
		JPanel[] yDatePanel2;
		yDatePanel2 = new JPanel[3];
		BoxLayout[] yDate2;
		yDate2 = new BoxLayout[3];
		
		for(int d = 0; d < 3; d++){
			yDatePanel2[d] = new JPanel();
			yDate2[d] = new BoxLayout(yDatePanel2[d], BoxLayout.Y_AXIS);
			xDate2[0].add(yDatePanel2[d]);
		}
		
		yDatePanel2[0].setPreferredSize(new Dimension(120,72));
		
		JLabel monthLabel2;
		monthLabel2 = new JLabel("Month");
		yDatePanel2[0].add(monthLabel2);
		
		String[] Month2 = {" ","January","February","March","April","May","June","July","August","September","October","November","December"};
		month2 = new JComboBox(Month2);
		yDatePanel2[0].add(month2);
		
		yDatePanel2[1].setPreferredSize(new Dimension(73,72));
		
		JLabel dayLabel2;
		dayLabel2 = new JLabel("Day");
		yDatePanel2[1].add(dayLabel2);
		SpinnerNumberModel Day2 = new SpinnerNumberModel(1,1,31,1);
		day2 = new JSpinner(Day2);
		yDatePanel2[1].add(day2);
		
		yDatePanel2[2].setPreferredSize(new Dimension(98,72));
		
		JLabel yearLabel2;
		yearLabel2 = new JLabel("Year");
		yDatePanel2[2].add(yearLabel2);
		SpinnerNumberModel Year2 = new SpinnerNumberModel(2013,2013,null,1);
		year2 = new JSpinner(Year2);
		yDatePanel2[2].add(year2);
		
		JLabel TermEndDate2;
		TermEndDate2 = new JLabel("Term End Date:");
		xDate2[1].add(TermEndDate2);
		
		JPanel[] yDatePanel4;
		yDatePanel4 = new JPanel[3];
		BoxLayout[] yDate4;
		yDate4 = new BoxLayout[3];
		
		for(int d = 0; d < 3; d++){
			yDatePanel4[d] = new JPanel();
			yDate4[d] = new BoxLayout(yDatePanel4[d], BoxLayout.Y_AXIS);
			xDate2[1].add(yDatePanel4[d]);
		}
		
		yDatePanel4[0].setPreferredSize(new Dimension(120,72));
		
		JLabel monthLabel3;
		monthLabel3 = new JLabel("Month");
		yDatePanel4[0].add(monthLabel3);
		
		String[] Month3 = {" ","January","February","March","April","May","June","July","August","September","October","November","December"};
		month3 = new JComboBox(Month3);
		yDatePanel4[0].add(month3);
		
		yDatePanel4[1].setPreferredSize(new Dimension(73,72));
		
		JLabel dayLabel3;
		dayLabel3 = new JLabel("Day");
		yDatePanel4[1].add(dayLabel3);
		SpinnerNumberModel Day3 = new SpinnerNumberModel(1,1,31,1);
		day3 = new JSpinner(Day3);
		yDatePanel4[1].add(day3);
		
		yDatePanel4[2].setPreferredSize(new Dimension(98,72));
		
		JLabel yearLabel3;
		yearLabel3 = new JLabel("Year");
		yDatePanel4[2].add(yearLabel3);
		SpinnerNumberModel Year3 = new SpinnerNumberModel(2013,2013,null,1);
		year3 = new JSpinner(Year3);
		yDatePanel4[2].add(year3);
		
		JButton WinterSave;
		WinterSave = new JButton("Save");
		
		xDate2[2].add(WinterSave);
		
		//WinterCell[2]
		WinterCell[2].setPreferredSize(new Dimension(424,290));
		
		JPanel WintertopWeek1;
		WintertopWeek1 = new JPanel();
		WintertopWeek1.setPreferredSize(new Dimension(110,30));
		JLabel Winterweek1Heading;
		Winterweek1Heading = new JLabel("Week 1");
		Winterweek1Heading.setFont(new Font("Serif", Font.PLAIN, 20));
		Font Winterfont1 = Winterweek1Heading.getFont();
		Map Winterattributes1 = Winterfont1.getAttributes();
		Winterattributes1.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		Winterweek1Heading.setFont(Winterfont1.deriveFont(Winterattributes1));
		WintertopWeek1.add(Winterweek1Heading);
		WinterCell[2].add(WintertopWeek1);
		
		JPanel[] Winterxtime1;
		Winterxtime1 = new JPanel[7];
		
		BoxLayout[] Winterhorizontal1;
		Winterhorizontal1 = new BoxLayout[7];
		
		WinterWeek1Monday = new JTextField[6];
		WinterWeek1Tuesday = new JTextField[6];
		WinterWeek1Wednesday = new JTextField[6];
		WinterWeek1Thursday = new JTextField[6];
		WinterWeek1Friday = new JTextField[6];
		WinterWeek1Saturday = new JTextField[6];
		
		JLabel[] WintertimeSlotHeading1;
		WintertimeSlotHeading1 = new JLabel[7];
		
		WintertimeSlotHeading1[0] = new JLabel("Time Slot:");
		WintertimeSlotHeading1[0].setPreferredSize(new Dimension(75,20));
		WintertimeSlotHeading1[1] = new JLabel("Monday:");
		WintertimeSlotHeading1[1].setPreferredSize(new Dimension(75,20));
		WintertimeSlotHeading1[2] = new JLabel("Tuesday:");
		WintertimeSlotHeading1[2].setPreferredSize(new Dimension(75,20));
		WintertimeSlotHeading1[3] = new JLabel("Wednesday:");
		WintertimeSlotHeading1[3].setPreferredSize(new Dimension(75,20));
		WintertimeSlotHeading1[4] = new JLabel("Thursday:");
		WintertimeSlotHeading1[4].setPreferredSize(new Dimension(75,20));
		WintertimeSlotHeading1[5] = new JLabel("Friday:");
		WintertimeSlotHeading1[5].setPreferredSize(new Dimension(75,20));
		WintertimeSlotHeading1[6] = new JLabel("Saturday:");
		WintertimeSlotHeading1[6].setPreferredSize(new Dimension(75,20));
		
		JLabel[] WinterSlotNumber1;
		WinterSlotNumber1 = new JLabel[6];
		
		WinterSlotNumber1[0] = new JLabel("1");
		WinterSlotNumber1[1] = new JLabel("2");
		WinterSlotNumber1[2] = new JLabel("3");
		WinterSlotNumber1[3] = new JLabel("4");
		WinterSlotNumber1[4] = new JLabel("5");
		WinterSlotNumber1[5] = new JLabel("6");
		
		for(int f = 0; f < 6; f++){
			WinterSlotNumber1[f].setPreferredSize(new Dimension(50,20));
			WinterSlotNumber1[f].setHorizontalAlignment(SwingConstants.CENTER);
		}
		
		for(int h = 0; h < 6; h++){
			WinterWeek1Monday[h] = new JTextField();
			WinterWeek1Monday[h].setPreferredSize(new Dimension(50,20));
			WinterWeek1Tuesday[h] = new JTextField();
			WinterWeek1Tuesday[h].setPreferredSize(new Dimension(50,20));
			WinterWeek1Wednesday[h] = new JTextField();
			WinterWeek1Wednesday[h].setPreferredSize(new Dimension(50,20));
			WinterWeek1Thursday[h] = new JTextField();
			WinterWeek1Thursday[h].setPreferredSize(new Dimension(50,20));
			WinterWeek1Friday[h] = new JTextField();
			WinterWeek1Friday[h].setPreferredSize(new Dimension(50,20));
			WinterWeek1Saturday[h] = new JTextField();
			WinterWeek1Saturday[h].setPreferredSize(new Dimension(50,20));
		}
		
		for(int e = 0; e < 7; e++){
			Winterxtime1[e] = new JPanel();
			Winterxtime1[e].setPreferredSize(new Dimension(414,30));
			Winterhorizontal1[e] = new BoxLayout(Winterxtime1[e], BoxLayout.X_AXIS);
			Winterxtime1[e].add(WintertimeSlotHeading1[e]);
			if(e == 0){
				for(int g = 0; g < 6; g++){
					Winterxtime1[0].add(WinterSlotNumber1[g]);
				}
			}
		}
		
		for(int i = 0; i < 6; i++){
			Winterxtime1[1].add(WinterWeek1Monday[i]);
		}
		
		for(int j = 0; j < 6; j++){
			Winterxtime1[2].add(WinterWeek1Tuesday[j]);
		}
		
		for(int k = 0; k < 6; k++){
			Winterxtime1[3].add(WinterWeek1Wednesday[k]);
		}
		
		for(int l = 0; l < 6; l++){
			Winterxtime1[4].add(WinterWeek1Thursday[l]);
		}
		
		for(int m = 0; m < 6; m++){
			Winterxtime1[5].add(WinterWeek1Friday[m]);
		}
		
		for(int n = 0; n < 6; n++){
			Winterxtime1[6].add(WinterWeek1Saturday[n]);
		}
		
		for(int i = 0; i < 7; i++){
		WinterCell[2].add(Winterxtime1[i]);
		Winterxtime1[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
		}
		
		//WinterCell[3]
		WinterCell[3].setPreferredSize(new Dimension(424,290));
		
		JPanel WintertopWeek2;
		WintertopWeek2 = new JPanel();
		WintertopWeek2.setPreferredSize(new Dimension(110,30));
		JLabel Winterweek2Heading;
		Winterweek2Heading = new JLabel("Week 2");
		Winterweek2Heading.setFont(new Font("Serif", Font.PLAIN, 20));
		Font Winterfont2 = Winterweek2Heading.getFont();
		Map Winterattributes2 = Winterfont2.getAttributes();
		Winterattributes2.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		Winterweek2Heading.setFont(Winterfont2.deriveFont(Winterattributes2));
		WintertopWeek2.add(Winterweek2Heading);
		WinterCell[3].add(WintertopWeek2);
		
		JPanel[] Winterxtime2;
		Winterxtime2 = new JPanel[7];
		
		BoxLayout[] Winterhorizontal2;
		Winterhorizontal2 = new BoxLayout[7];
		
		WinterWeek2Monday = new JTextField[6];
		WinterWeek2Tuesday = new JTextField[6];
		WinterWeek2Wednesday = new JTextField[6];
		WinterWeek2Thursday = new JTextField[6];
		WinterWeek2Friday = new JTextField[6];
		WinterWeek2Saturday = new JTextField[6];
		
		JLabel[] WintertimeSlotHeading2;
		WintertimeSlotHeading2 = new JLabel[7];
		
		WintertimeSlotHeading2[0] = new JLabel("Time Slot:");
		WintertimeSlotHeading2[0].setPreferredSize(new Dimension(75,20));
		WintertimeSlotHeading2[1] = new JLabel("Monday:");
		WintertimeSlotHeading2[1].setPreferredSize(new Dimension(75,20));
		WintertimeSlotHeading2[2] = new JLabel("Tuesday:");
		WintertimeSlotHeading2[2].setPreferredSize(new Dimension(75,20));
		WintertimeSlotHeading2[3] = new JLabel("Wednesday:");
		WintertimeSlotHeading2[3].setPreferredSize(new Dimension(75,20));
		WintertimeSlotHeading2[4] = new JLabel("Thursday:");
		WintertimeSlotHeading2[4].setPreferredSize(new Dimension(75,20));
		WintertimeSlotHeading2[5] = new JLabel("Friday:");
		WintertimeSlotHeading2[5].setPreferredSize(new Dimension(75,20));
		WintertimeSlotHeading2[6] = new JLabel("Saturday:");
		WintertimeSlotHeading2[6].setPreferredSize(new Dimension(75,20));
		
		JLabel[] WinterSlotNumber2;
		WinterSlotNumber2 = new JLabel[6];
		
		WinterSlotNumber2[0] = new JLabel("1");
		WinterSlotNumber2[1] = new JLabel("2");
		WinterSlotNumber2[2] = new JLabel("3");
		WinterSlotNumber2[3] = new JLabel("4");
		WinterSlotNumber2[4] = new JLabel("5");
		WinterSlotNumber2[5] = new JLabel("6");
		
		for(int f = 0; f < 6; f++){
			WinterSlotNumber2[f].setPreferredSize(new Dimension(50,20));
			WinterSlotNumber2[f].setHorizontalAlignment(SwingConstants.CENTER);
		}
		
		for(int h = 0; h < 6; h++){
			WinterWeek2Monday[h] = new JTextField();
			WinterWeek2Monday[h].setPreferredSize(new Dimension(50,20));
			WinterWeek2Tuesday[h] = new JTextField();
			WinterWeek2Tuesday[h].setPreferredSize(new Dimension(50,20));
			WinterWeek2Wednesday[h] = new JTextField();
			WinterWeek2Wednesday[h].setPreferredSize(new Dimension(50,20));
			WinterWeek2Thursday[h] = new JTextField();
			WinterWeek2Thursday[h].setPreferredSize(new Dimension(50,20));
			WinterWeek2Friday[h] = new JTextField();
			WinterWeek2Friday[h].setPreferredSize(new Dimension(50,20));
			WinterWeek2Saturday[h] = new JTextField();
			WinterWeek2Saturday[h].setPreferredSize(new Dimension(50,20));
		}
		
		for(int e = 0; e < 7; e++){
			Winterxtime2[e] = new JPanel();
			Winterxtime2[e].setPreferredSize(new Dimension(414,30));
			Winterhorizontal2[e] = new BoxLayout(Winterxtime2[e], BoxLayout.X_AXIS);
			Winterxtime2[e].add(WintertimeSlotHeading2[e]);
			if(e == 0){
				for(int g = 0; g < 6; g++){
					Winterxtime2[0].add(WinterSlotNumber2[g]);
				}
			}
		}
		
		for(int i = 0; i < 6; i++){
			Winterxtime2[1].add(WinterWeek2Monday[i]);
		}
		
		for(int j = 0; j < 6; j++){
			Winterxtime2[2].add(WinterWeek2Tuesday[j]);
		}
		
		for(int k = 0; k < 6; k++){
			Winterxtime2[3].add(WinterWeek2Wednesday[k]);
		}
		
		for(int l = 0; l < 6; l++){
			Winterxtime2[4].add(WinterWeek2Thursday[l]);
		}
		
		for(int m = 0; m < 6; m++){
			Winterxtime2[5].add(WinterWeek2Friday[m]);
		}
		
		for(int n = 0; n < 6; n++){
			Winterxtime2[6].add(WinterWeek2Saturday[n]);
		}
		
		for(int i = 0; i < 7; i++){
		WinterCell[3].add(Winterxtime2[i]);
		Winterxtime2[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
		}
		
		class WinterBtnListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				
				Term WinterTerm;
				WinterTerm = new Term();
				WinterTerm.setStartDay((Integer) day2.getValue());
				WinterTerm.setStartMonth(month2.getSelectedItem().toString());
				WinterTerm.setStartYear((Integer) year2.getValue());
				WinterTerm.setTermName("Winter");
				WinterTerm.setEndDay((Integer) day3.getValue());
				WinterTerm.setEndMonth(month3.getSelectedItem().toString());
				WinterTerm.setEndYear((Integer) year3.getValue());
				
				ArrayList<String> WinterWeek1MondayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					WinterWeek1MondayList.add(a, WinterWeek1Monday[a].getText());
				}
				WinterTerm.setWeek1MondaySlots(WinterWeek1MondayList);
				
				ArrayList<String> WinterWeek1TuesdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					WinterWeek1TuesdayList.add(a, WinterWeek1Tuesday[a].getText());
				}
				WinterTerm.setWeek1TuesdaySlots(WinterWeek1TuesdayList);
				
				ArrayList<String> WinterWeek1WednesdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					WinterWeek1WednesdayList.add(a, WinterWeek1Wednesday[a].getText());
				}
				WinterTerm.setWeek1WednesdaySlots(WinterWeek1WednesdayList);
				
				ArrayList<String> WinterWeek1ThursdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					WinterWeek1ThursdayList.add(a, WinterWeek1Thursday[a].getText());
				}
				WinterTerm.setWeek1ThursdaySlots(WinterWeek1ThursdayList);
				
				ArrayList<String> WinterWeek1FridayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					WinterWeek1FridayList.add(a, WinterWeek1Friday[a].getText());
				}
				WinterTerm.setWeek1FridaySlots(WinterWeek1FridayList);
				
				ArrayList<String> WinterWeek1SaturdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					WinterWeek1SaturdayList.add(a, WinterWeek1Saturday[a].getText());
				}
				WinterTerm.setWeek1SaturdaySlots(WinterWeek1SaturdayList);
				
				ArrayList<String> WinterWeek2MondayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					WinterWeek2MondayList.add(a, WinterWeek2Monday[a].getText());
				}
				WinterTerm.setWeek2MondaySlots(WinterWeek2MondayList);
				
				ArrayList<String> WinterWeek2TuesdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					WinterWeek2TuesdayList.add(a, WinterWeek2Tuesday[a].getText());
				}
				WinterTerm.setWeek2TuesdaySlots(WinterWeek2TuesdayList);
				
				ArrayList<String> WinterWeek2WednesdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					WinterWeek2WednesdayList.add(a, WinterWeek2Wednesday[a].getText());
				}
				WinterTerm.setWeek2WednesdaySlots(WinterWeek2WednesdayList);
				
				ArrayList<String> WinterWeek2ThursdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					WinterWeek2ThursdayList.add(a, WinterWeek2Thursday[a].getText());
				}
				WinterTerm.setWeek2ThursdaySlots(WinterWeek2ThursdayList);
				
				ArrayList<String> WinterWeek2FridayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					WinterWeek2FridayList.add(a, WinterWeek2Friday[a].getText());
				}
				WinterTerm.setWeek2FridaySlots(WinterWeek2FridayList);
				
				ArrayList<String> WinterWeek2SaturdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					WinterWeek2SaturdayList.add(a, WinterWeek2Saturday[a].getText());
				}
				WinterTerm.setWeek2SaturdaySlots(WinterWeek2SaturdayList);
				
				// Create File
				 
				try {
					File Winterfile = new File("Winter.txt");
					FileWriter Winterwriter = new FileWriter(Winterfile, false);
					PrintWriter WinterPW = new PrintWriter(Winterwriter); 
					
					// Print Monday Week 1 Time Slots
					for(int a = 0; a < WinterTerm.getWeek1MondaySlots().size(); a++){
						if(WinterTerm.getWeek1MondaySlots().get(a).toString().equals("")){							
						}
						else{
							WinterPW.print(WinterTerm.getWeek1MondaySlots().get(a).toString() + " ");
						}
					}
					WinterPW.println();
					
					// Print Tuesday Week 1 Time Slots
					for(int a = 0; a < WinterTerm.getWeek1TuesdaySlots().size(); a++){
						if(WinterTerm.getWeek1TuesdaySlots().get(a).toString().equals("")){							
						}
						else{
							WinterPW.print(WinterTerm.getWeek1TuesdaySlots().get(a).toString() + " ");
						}
					}
					WinterPW.println();
					
					// Print Wednesday Week 1 Time Slots
					for(int a = 0; a < WinterTerm.getWeek1WednesdaySlots().size(); a++){
						if(WinterTerm.getWeek1WednesdaySlots().get(a).toString().equals("")){							
						}
						else{
							WinterPW.print(WinterTerm.getWeek1WednesdaySlots().get(a).toString() + " ");
						}
					}
					WinterPW.println();
					
					// Print Thursday Week 1 Time Slots
					for(int a = 0; a < WinterTerm.getWeek1ThursdaySlots().size(); a++){
						if(WinterTerm.getWeek1ThursdaySlots().get(a).toString().equals("")){							
						}
						else{
							WinterPW.print(WinterTerm.getWeek1ThursdaySlots().get(a).toString() + " ");
						}
					}
					WinterPW.println();
					
					// Print Friday Week 1 Time Slots
					for(int a = 0; a < WinterTerm.getWeek1FridaySlots().size(); a++){
						if(WinterTerm.getWeek1FridaySlots().get(a).toString().equals("")){							
						}
						else{
							WinterPW.print(WinterTerm.getWeek1FridaySlots().get(a).toString() + " ");
						}
					}
					WinterPW.println();
					
					// Print Saturday Week 1 Time Slots
					for(int a = 0; a < WinterTerm.getWeek1SaturdaySlots().size(); a++){
						if(WinterTerm.getWeek1SaturdaySlots().get(a).toString().equals("")){							
						}
						else{
							WinterPW.print(WinterTerm.getWeek1SaturdaySlots().get(a).toString() + " ");
						}
					}
					WinterPW.println();
					
					// Print Monday Week 2 Time Slots
					for(int a = 0; a < WinterTerm.getWeek2MondaySlots().size(); a++){
						if(WinterTerm.getWeek2MondaySlots().get(a).toString().equals("")){							
						}
						else{
							WinterPW.print(WinterTerm.getWeek2MondaySlots().get(a).toString() + " ");
						}
					}
					WinterPW.println();
					
					// Print Tuesday Week 2 Time Slots
					for(int a = 0; a < WinterTerm.getWeek2TuesdaySlots().size(); a++){
						if(WinterTerm.getWeek2TuesdaySlots().get(a).toString().equals("")){							
						}
						else{
							WinterPW.print(WinterTerm.getWeek2TuesdaySlots().get(a).toString() + " ");
						}
					}
					WinterPW.println();
					
					// Print Wednesday Week 2 Time Slots
					for(int a = 0; a < WinterTerm.getWeek2WednesdaySlots().size(); a++){
						if(WinterTerm.getWeek2WednesdaySlots().get(a).toString().equals("")){							
						}
						else{
							WinterPW.print(WinterTerm.getWeek2WednesdaySlots().get(a).toString() + " ");
						}
					}
					WinterPW.println();
					
					// Print Thursday Week 2 Time Slots
					for(int a = 0; a < WinterTerm.getWeek2ThursdaySlots().size(); a++){
						if(WinterTerm.getWeek2ThursdaySlots().get(a).toString().equals("")){							
						}
						else{
							WinterPW.print(WinterTerm.getWeek2ThursdaySlots().get(a).toString() + " ");
						}
					}
					WinterPW.println();
					
					// Print Friday Week 2 Time Slots
					for(int a = 0; a < WinterTerm.getWeek2FridaySlots().size(); a++){
						if(WinterTerm.getWeek2FridaySlots().get(a).toString().equals("")){							
						}
						else{
							WinterPW.print(WinterTerm.getWeek2FridaySlots().get(a).toString() + " ");
						}
					}
					WinterPW.println();
					
					// Print Saturday Week 2 Time Slots
					for(int a = 0; a < WinterTerm.getWeek2SaturdaySlots().size(); a++){
						if(WinterTerm.getWeek2SaturdaySlots().get(a).toString().equals("")){							
						}
						else{
							WinterPW.print(WinterTerm.getWeek2SaturdaySlots().get(a).toString() + " ");
						}
					}
					WinterPW.println();
					WinterPW.println();
					
					// Start month
					WinterPW.println(WinterTerm.getStartMonth().toString());
					
					// Start day
					WinterPW.println(WinterTerm.getStartDay());
					
					// Start year
					WinterPW.println(WinterTerm.getStartYear());
					WinterPW.println();
					
					// End month
					WinterPW.println(WinterTerm.getEndMonth().toString());
					
					// End day
					WinterPW.println(WinterTerm.getEndDay());
					
					// End Year
					WinterPW.println(WinterTerm.getEndYear());
					
					WinterPW.close();
				}
				catch (IOException u) {
					return;
				}
			}
		}
		
		WinterBtnListener y = new WinterBtnListener();
		WinterSave.addActionListener(y);
		
		Terms.add(WinterPanel);
		
		// Spring
		
		JPanel SpringPanel;
		SpringPanel = new JPanel();
		SpringPanel.setPreferredSize(new Dimension(1420,300));
		SpringPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		BoxLayout xSpring;
		xSpring = new BoxLayout(SpringPanel, BoxLayout.X_AXIS);
		
		JPanel[] SpringCell;
		SpringCell = new JPanel[4];
		BoxLayout[] Springybox;
		Springybox = new BoxLayout[3];
		
		for(int a = 0; a < 4; a++){
			SpringCell[a] = new JPanel();
			if(a==0){
				SpringPanel.add(SpringCell[a]);
			}
			else{
			SpringCell[a].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			SpringPanel.add(SpringCell[a]);
			}
		}
		
		for(int w = 0; w < 3; w++){
			Springybox[w] = new BoxLayout(SpringCell[w+1],BoxLayout.Y_AXIS);
		}
		
		//SpringCell[0]
		SpringCell[0].setPreferredSize(new Dimension(120,290));
		JPanel SpringLabelPanel;
		SpringLabelPanel = new JPanel();
		SpringLabelPanel.setPreferredSize(new Dimension(100, 250));
		
		BorderLayout centerSpringLabel;
		centerSpringLabel = new BorderLayout();
		SpringLabelPanel.setLayout(centerSpringLabel);
		
		JLabel Spring;
		Spring = new JLabel("Spring");
		Spring.setFont(new Font("Serif", Font.PLAIN, 35));
		Font SpringFont = Spring.getFont();
		Map SpringAttributes = SpringFont.getAttributes();
		SpringAttributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		Spring.setFont(SpringFont.deriveFont(SpringAttributes));
		Spring.setHorizontalAlignment(SwingConstants.CENTER);
		
		SpringLabelPanel.add(Spring, BorderLayout.CENTER);
		SpringCell[0].add(SpringLabelPanel, BorderLayout.CENTER);
		
		//SpringCell[1]
		SpringCell[1].setPreferredSize(new Dimension(430,290));
		
		JPanel[] SpringxDate;
		SpringxDate = new JPanel[3];
		
		for(int c = 0; c < 3; c++){
			SpringxDate[c] = new JPanel();
			SpringxDate[c].setPreferredSize(new Dimension(424,80));
			SpringCell[1].add(SpringxDate[c]);
		}
		
		JLabel SpringstartDate;
		SpringstartDate = new JLabel("Term Start Date:");
		SpringxDate[0].add(SpringstartDate);
		
		JPanel[] SpringyDatePanel;
		SpringyDatePanel = new JPanel[3];
		BoxLayout[] SpringyDate;
		SpringyDate = new BoxLayout[3];
		
		for(int d = 0; d < 3; d++){
			SpringyDatePanel[d] = new JPanel();
			SpringyDate[d] = new BoxLayout(SpringyDatePanel[d], BoxLayout.Y_AXIS);
			SpringxDate[0].add(SpringyDatePanel[d]);
		}
		
		SpringyDatePanel[0].setPreferredSize(new Dimension(120,72));
		
		JLabel SpringmonthLabel;
		SpringmonthLabel = new JLabel("Month");
		SpringyDatePanel[0].add(SpringmonthLabel);
		
		String[] SpringMonth = {" ","January","February","March","April","May","June","July","August","September","October","November","December"};
		Springmonth = new JComboBox(SpringMonth);
		SpringyDatePanel[0].add(Springmonth);
		
		SpringyDatePanel[1].setPreferredSize(new Dimension(73,72));
		
		JLabel SpringdayLabel;
		SpringdayLabel = new JLabel("Day");
		SpringyDatePanel[1].add(SpringdayLabel);
		SpinnerNumberModel SpringDay = new SpinnerNumberModel(1,1,31,1);
		Springday = new JSpinner(SpringDay);
		SpringyDatePanel[1].add(Springday);
		
		SpringyDatePanel[2].setPreferredSize(new Dimension(98,72));
		
		JLabel SpringyearLabel;
		SpringyearLabel = new JLabel("Year");
		SpringyDatePanel[2].add(SpringyearLabel);
		SpinnerNumberModel SpringYear = new SpinnerNumberModel(2013,2013,null,1);
		Springyear = new JSpinner(SpringYear);
		SpringyDatePanel[2].add(Springyear);
		
		JLabel SpringTermEndDate;
		SpringTermEndDate = new JLabel("Term End Date:");
		SpringxDate[1].add(SpringTermEndDate);
		
		JPanel[] SpringyDatePanel2;
		SpringyDatePanel2 = new JPanel[3];
		BoxLayout[] SpringyDate2;
		SpringyDate2 = new BoxLayout[3];
		
		for(int d = 0; d < 3; d++){
			SpringyDatePanel2[d] = new JPanel();
			SpringyDate2[d] = new BoxLayout(SpringyDatePanel2[d], BoxLayout.Y_AXIS);
			SpringxDate[1].add(SpringyDatePanel2[d]);
		}
		
		SpringyDatePanel2[0].setPreferredSize(new Dimension(120,72));
		
		JLabel SpringmonthLabel2;
		SpringmonthLabel2 = new JLabel("Month");
		SpringyDatePanel2[0].add(SpringmonthLabel2);
		
		String[] SpringMonth2 = {" ","January","February","March","April","May","June","July","August","September","October","November","December"};
		Springmonth2 = new JComboBox(SpringMonth2);
		SpringyDatePanel2[0].add(Springmonth2);
		
		SpringyDatePanel2[1].setPreferredSize(new Dimension(73,72));
		
		JLabel SpringdayLabel2;
		SpringdayLabel2 = new JLabel("Day");
		SpringyDatePanel2[1].add(SpringdayLabel2);
		SpinnerNumberModel SpringDay2 = new SpinnerNumberModel(1,1,31,1);
		Springday2 = new JSpinner(SpringDay2);
		SpringyDatePanel2[1].add(Springday2);
		
		SpringyDatePanel2[2].setPreferredSize(new Dimension(98,72));
		
		JLabel SpringyearLabel2;
		SpringyearLabel2 = new JLabel("Year");
		SpringyDatePanel2[2].add(SpringyearLabel2);
		SpinnerNumberModel SpringYear2 = new SpinnerNumberModel(2013,2013,null,1);
		Springyear2 = new JSpinner(SpringYear2);
		SpringyDatePanel2[2].add(Springyear2);
		
		JButton SpringSave;
		SpringSave = new JButton("Save");
		
		SpringxDate[2].add(SpringSave);
		
		//SpringCell[2]
		SpringCell[2].setPreferredSize(new Dimension(424,290));
		
		JPanel SpringtopWeek1;
		SpringtopWeek1 = new JPanel();
		SpringtopWeek1.setPreferredSize(new Dimension(110,30));
		JLabel Springweek1Heading;
		Springweek1Heading = new JLabel("Week 1");
		Springweek1Heading.setFont(new Font("Serif", Font.PLAIN, 20));
		Font Springfont1 = week1Heading.getFont();
		Map Springattributes1 = Springfont1.getAttributes();
		Springattributes1.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		Springweek1Heading.setFont(Springfont1.deriveFont(Springattributes1));
		SpringtopWeek1.add(Springweek1Heading);
		SpringCell[2].add(SpringtopWeek1);
		
		JPanel[] Springxtime;
		Springxtime = new JPanel[7];
		
		BoxLayout[] Springhorizontal1;
		Springhorizontal1 = new BoxLayout[7];
		
		SpringWeek1Monday = new JTextField[6];
		SpringWeek1Tuesday = new JTextField[6];
		SpringWeek1Wednesday = new JTextField[6];
		SpringWeek1Thursday = new JTextField[6];
		SpringWeek1Friday = new JTextField[6];
		SpringWeek1Saturday = new JTextField[6];
		
		JLabel[] SpringtimeSlotHeading1;
		SpringtimeSlotHeading1 = new JLabel[7];
		
		SpringtimeSlotHeading1[0] = new JLabel("Time Slot:");
		SpringtimeSlotHeading1[0].setPreferredSize(new Dimension(75,20));
		SpringtimeSlotHeading1[1] = new JLabel("Monday:");
		SpringtimeSlotHeading1[1].setPreferredSize(new Dimension(75,20));
		SpringtimeSlotHeading1[2] = new JLabel("Tuesday:");
		SpringtimeSlotHeading1[2].setPreferredSize(new Dimension(75,20));
		SpringtimeSlotHeading1[3] = new JLabel("Wednesday:");
		SpringtimeSlotHeading1[3].setPreferredSize(new Dimension(75,20));
		SpringtimeSlotHeading1[4] = new JLabel("Thursday:");
		SpringtimeSlotHeading1[4].setPreferredSize(new Dimension(75,20));
		SpringtimeSlotHeading1[5] = new JLabel("Friday:");
		SpringtimeSlotHeading1[5].setPreferredSize(new Dimension(75,20));
		SpringtimeSlotHeading1[6] = new JLabel("Saturday:");
		SpringtimeSlotHeading1[6].setPreferredSize(new Dimension(75,20));
		
		JLabel[] SpringSlotNumber1;
		SpringSlotNumber1 = new JLabel[6];
		
		SpringSlotNumber1[0] = new JLabel("1");
		SpringSlotNumber1[1] = new JLabel("2");
		SpringSlotNumber1[2] = new JLabel("3");
		SpringSlotNumber1[3] = new JLabel("4");
		SpringSlotNumber1[4] = new JLabel("5");
		SpringSlotNumber1[5] = new JLabel("6");
		
		for(int f = 0; f < 6; f++){
			SpringSlotNumber1[f].setPreferredSize(new Dimension(50,20));
			SpringSlotNumber1[f].setHorizontalAlignment(SwingConstants.CENTER);
		}
		
		for(int h = 0; h < 6; h++){
			SpringWeek1Monday[h] = new JTextField();
			SpringWeek1Monday[h].setPreferredSize(new Dimension(50,20));
			SpringWeek1Tuesday[h] = new JTextField();
			SpringWeek1Tuesday[h].setPreferredSize(new Dimension(50,20));
			SpringWeek1Wednesday[h] = new JTextField();
			SpringWeek1Wednesday[h].setPreferredSize(new Dimension(50,20));
			SpringWeek1Thursday[h] = new JTextField();
			SpringWeek1Thursday[h].setPreferredSize(new Dimension(50,20));
			SpringWeek1Friday[h] = new JTextField();
			SpringWeek1Friday[h].setPreferredSize(new Dimension(50,20));
			SpringWeek1Saturday[h] = new JTextField();
			SpringWeek1Saturday[h].setPreferredSize(new Dimension(50,20));
		}
		
		for(int e = 0; e < 7; e++){
			Springxtime[e] = new JPanel();
			Springxtime[e].setPreferredSize(new Dimension(414,30));
			Springhorizontal1[e] = new BoxLayout(Springxtime[e], BoxLayout.X_AXIS);
			Springxtime[e].add(SpringtimeSlotHeading1[e]);
			if(e == 0){
				for(int g = 0; g < 6; g++){
					Springxtime[0].add(SpringSlotNumber1[g]);
				}
			}
		}
		
		for(int i = 0; i < 6; i++){
			Springxtime[1].add(SpringWeek1Monday[i]);
		}
		
		for(int j = 0; j < 6; j++){
			Springxtime[2].add(SpringWeek1Tuesday[j]);
		}
		
		for(int k = 0; k < 6; k++){
			Springxtime[3].add(SpringWeek1Wednesday[k]);
		}
		
		for(int l = 0; l < 6; l++){
			Springxtime[4].add(SpringWeek1Thursday[l]);
		}
		
		for(int m = 0; m < 6; m++){
			Springxtime[5].add(SpringWeek1Friday[m]);
		}
		
		for(int n = 0; n < 6; n++){
			Springxtime[6].add(SpringWeek1Saturday[n]);
		}
		
		for(int i = 0; i < 7; i++){
		SpringCell[2].add(Springxtime[i]);
		Springxtime[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
		}
		
		//SpringCell[3]
		SpringCell[3].setPreferredSize(new Dimension(424,290));
		
		JPanel SpringtopWeek2;
		SpringtopWeek2 = new JPanel();
		SpringtopWeek2.setPreferredSize(new Dimension(110,30));
		JLabel Springweek2Heading;
		Springweek2Heading = new JLabel("Week 2");
		Springweek2Heading.setFont(new Font("Serif", Font.PLAIN, 20));
		Font Springfont2 = week1Heading.getFont();
		Map Springattributes2 = Springfont2.getAttributes();
		Springattributes2.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		Springweek2Heading.setFont(Springfont2.deriveFont(Springattributes2));
		SpringtopWeek2.add(Springweek2Heading);
		SpringCell[3].add(SpringtopWeek2);
		
		JPanel[] Springxtime2;
		Springxtime2 = new JPanel[7];
		
		BoxLayout[] Springhorizontal2;
		Springhorizontal2 = new BoxLayout[7];
		
		SpringWeek2Monday = new JTextField[6];
		SpringWeek2Tuesday = new JTextField[6];
		SpringWeek2Wednesday = new JTextField[6];
		SpringWeek2Thursday = new JTextField[6];
		SpringWeek2Friday = new JTextField[6];
		SpringWeek2Saturday = new JTextField[6];
		
		JLabel[] SpringtimeSlotHeading2;
		SpringtimeSlotHeading2 = new JLabel[7];
		
		SpringtimeSlotHeading2[0] = new JLabel("Time Slot:");
		SpringtimeSlotHeading2[0].setPreferredSize(new Dimension(75,20));
		SpringtimeSlotHeading2[1] = new JLabel("Monday:");
		SpringtimeSlotHeading2[1].setPreferredSize(new Dimension(75,20));
		SpringtimeSlotHeading2[2] = new JLabel("Tuesday:");
		SpringtimeSlotHeading2[2].setPreferredSize(new Dimension(75,20));
		SpringtimeSlotHeading2[3] = new JLabel("Wednesday:");
		SpringtimeSlotHeading2[3].setPreferredSize(new Dimension(75,20));
		SpringtimeSlotHeading2[4] = new JLabel("Thursday:");
		SpringtimeSlotHeading2[4].setPreferredSize(new Dimension(75,20));
		SpringtimeSlotHeading2[5] = new JLabel("Friday:");
		SpringtimeSlotHeading2[5].setPreferredSize(new Dimension(75,20));
		SpringtimeSlotHeading2[6] = new JLabel("Saturday:");
		SpringtimeSlotHeading2[6].setPreferredSize(new Dimension(75,20));
		
		JLabel[] SpringSlotNumber2;
		SpringSlotNumber2 = new JLabel[6];
		
		SpringSlotNumber2[0] = new JLabel("1");
		SpringSlotNumber2[1] = new JLabel("2");
		SpringSlotNumber2[2] = new JLabel("3");
		SpringSlotNumber2[3] = new JLabel("4");
		SpringSlotNumber2[4] = new JLabel("5");
		SpringSlotNumber2[5] = new JLabel("6");
		
		for(int f = 0; f < 6; f++){
			SpringSlotNumber2[f].setPreferredSize(new Dimension(50,20));
			SpringSlotNumber2[f].setHorizontalAlignment(SwingConstants.CENTER);
		}
		
		for(int h = 0; h < 6; h++){
			SpringWeek2Monday[h] = new JTextField();
			SpringWeek2Monday[h].setPreferredSize(new Dimension(50,20));
			SpringWeek2Tuesday[h] = new JTextField();
			SpringWeek2Tuesday[h].setPreferredSize(new Dimension(50,20));
			SpringWeek2Wednesday[h] = new JTextField();
			SpringWeek2Wednesday[h].setPreferredSize(new Dimension(50,20));
			SpringWeek2Thursday[h] = new JTextField();
			SpringWeek2Thursday[h].setPreferredSize(new Dimension(50,20));
			SpringWeek2Friday[h] = new JTextField();
			SpringWeek2Friday[h].setPreferredSize(new Dimension(50,20));
			SpringWeek2Saturday[h] = new JTextField();
			SpringWeek2Saturday[h].setPreferredSize(new Dimension(50,20));
		}
		
		for(int e = 0; e < 7; e++){
			Springxtime2[e] = new JPanel();
			Springxtime2[e].setPreferredSize(new Dimension(414,30));
			Springhorizontal2[e] = new BoxLayout(Springxtime2[e], BoxLayout.X_AXIS);
			Springxtime2[e].add(SpringtimeSlotHeading2[e]);
			if(e == 0){
				for(int g = 0; g < 6; g++){
					Springxtime2[0].add(SpringSlotNumber2[g]);
				}
			}
		}
		
		for(int i = 0; i < 6; i++){
			Springxtime2[1].add(SpringWeek2Monday[i]);
		}
		
		for(int j = 0; j < 6; j++){
			Springxtime2[2].add(SpringWeek2Tuesday[j]);
		}
		
		for(int k = 0; k < 6; k++){
			Springxtime2[3].add(SpringWeek2Wednesday[k]);
		}
		
		for(int l = 0; l < 6; l++){
			Springxtime2[4].add(SpringWeek2Thursday[l]);
		}
		
		for(int m = 0; m < 6; m++){
			Springxtime2[5].add(SpringWeek2Friday[m]);
		}
		
		for(int n = 0; n < 6; n++){
			Springxtime2[6].add(SpringWeek2Saturday[n]);
		}
		
		for(int i = 0; i < 7; i++){
		SpringCell[3].add(Springxtime2[i]);
		Springxtime2[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
		}
		
		class SpringBtnListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				
				Term SpringTerm;
				SpringTerm = new Term();
				SpringTerm.setStartDay((Integer) Springday.getValue());
				SpringTerm.setStartMonth(Springmonth.getSelectedItem().toString());
				SpringTerm.setStartYear((Integer) Springyear.getValue());
				SpringTerm.setTermName("Spring");
				SpringTerm.setEndDay((Integer) Springday2.getValue());
				SpringTerm.setEndMonth(Springmonth2.getSelectedItem().toString());
				SpringTerm.setEndYear((Integer) Springyear2.getValue());
				
				ArrayList<String> SpringWeek1MondayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SpringWeek1MondayList.add(a, SpringWeek1Monday[a].getText());
				}
				SpringTerm.setWeek1MondaySlots(SpringWeek1MondayList);
				
				ArrayList<String> SpringWeek1TuesdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SpringWeek1TuesdayList.add(a, SpringWeek1Tuesday[a].getText());
				}
				SpringTerm.setWeek1TuesdaySlots(SpringWeek1TuesdayList);
				
				ArrayList<String> SpringWeek1WednesdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SpringWeek1WednesdayList.add(a, SpringWeek1Wednesday[a].getText());
				}
				SpringTerm.setWeek1WednesdaySlots(SpringWeek1WednesdayList);
				
				ArrayList<String> SpringWeek1ThursdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SpringWeek1ThursdayList.add(a, SpringWeek1Thursday[a].getText());
				}
				SpringTerm.setWeek1ThursdaySlots(SpringWeek1ThursdayList);
				
				ArrayList<String> SpringWeek1FridayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SpringWeek1FridayList.add(a, SpringWeek1Friday[a].getText());
				}
				SpringTerm.setWeek1FridaySlots(SpringWeek1FridayList);
				
				ArrayList<String> SpringWeek1SaturdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SpringWeek1SaturdayList.add(a, SpringWeek1Saturday[a].getText());
				}
				SpringTerm.setWeek1SaturdaySlots(SpringWeek1SaturdayList);
				
				ArrayList<String> SpringWeek2MondayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SpringWeek2MondayList.add(a, SpringWeek2Monday[a].getText());
				}
				SpringTerm.setWeek2MondaySlots(SpringWeek2MondayList);
				
				ArrayList<String> SpringWeek2TuesdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SpringWeek2TuesdayList.add(a, SpringWeek2Tuesday[a].getText());
				}
				SpringTerm.setWeek2TuesdaySlots(SpringWeek2TuesdayList);
				
				ArrayList<String> SpringWeek2WednesdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SpringWeek2WednesdayList.add(a, SpringWeek2Wednesday[a].getText());
				}
				SpringTerm.setWeek2WednesdaySlots(SpringWeek2WednesdayList);
				
				ArrayList<String> SpringWeek2ThursdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SpringWeek2ThursdayList.add(a, SpringWeek2Thursday[a].getText());
				}
				SpringTerm.setWeek2ThursdaySlots(SpringWeek2ThursdayList);
				
				ArrayList<String> SpringWeek2FridayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SpringWeek2FridayList.add(a, SpringWeek2Friday[a].getText());
				}
				SpringTerm.setWeek2FridaySlots(SpringWeek2FridayList);
				
				ArrayList<String> SpringWeek2SaturdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SpringWeek2SaturdayList.add(a, SpringWeek2Saturday[a].getText());
				}
				SpringTerm.setWeek2SaturdaySlots(SpringWeek2SaturdayList);
				
				// Create File
				 
				try {
					File Springfile = new File("Spring.txt");
					FileWriter Springwriter = new FileWriter(Springfile, false);
					PrintWriter SpringPW = new PrintWriter(Springwriter);  
					
					// Print Monday Week 1 Time Slots
					for(int a = 0; a < SpringTerm.getWeek1MondaySlots().size(); a++){
						if(SpringTerm.getWeek1MondaySlots().get(a).toString().equals("")){							
						}
						else{
							SpringPW.print(SpringTerm.getWeek1MondaySlots().get(a).toString() + " ");
						}
					}
					SpringPW.println();
					
					// Print Tuesday Week 1 Time Slots
					for(int a = 0; a < SpringTerm.getWeek1TuesdaySlots().size(); a++){
						if(SpringTerm.getWeek1TuesdaySlots().get(a).toString().equals("")){							
						}
						else{
							SpringPW.print(SpringTerm.getWeek1TuesdaySlots().get(a).toString() + " ");
						}
					}
					SpringPW.println();
					
					// Print Wednesday Week 1 Time Slots
					for(int a = 0; a < SpringTerm.getWeek1WednesdaySlots().size(); a++){
						if(SpringTerm.getWeek1WednesdaySlots().get(a).toString().equals("")){							
						}
						else{
							SpringPW.print(SpringTerm.getWeek1WednesdaySlots().get(a).toString() + " ");
						}
					}
					SpringPW.println();
					
					// Print Thursday Week 1 Time Slots
					for(int a = 0; a < SpringTerm.getWeek1ThursdaySlots().size(); a++){
						if(SpringTerm.getWeek1ThursdaySlots().get(a).toString().equals("")){							
						}
						else{
							SpringPW.print(SpringTerm.getWeek1ThursdaySlots().get(a).toString() + " ");
						}
					}
					SpringPW.println();
					
					// Print Friday Week 1 Time Slots
					for(int a = 0; a < SpringTerm.getWeek1FridaySlots().size(); a++){
						if(SpringTerm.getWeek1FridaySlots().get(a).toString().equals("")){							
						}
						else{
							SpringPW.print(SpringTerm.getWeek1FridaySlots().get(a).toString());
						}
					}
					SpringPW.println();
					
					// Print Saturday Week 1 Time Slots
					for(int a = 0; a < SpringTerm.getWeek1SaturdaySlots().size(); a++){
						if(SpringTerm.getWeek1SaturdaySlots().get(a).toString().equals("")){							
						}
						else{
							SpringPW.print(SpringTerm.getWeek1SaturdaySlots().get(a).toString() + " ");
						}
					}
					SpringPW.println();
					
					// Print Monday Week 2 Time Slots;
					for(int a = 0; a < SpringTerm.getWeek2MondaySlots().size(); a++){
						if(SpringTerm.getWeek2MondaySlots().get(a).toString().equals("")){							
						}
						else{
							SpringPW.print(SpringTerm.getWeek2MondaySlots().get(a).toString() + " ");
						}
					}
					SpringPW.println();
					
					// Print Tuesday Week 2 Time Slots
					for(int a = 0; a < SpringTerm.getWeek2TuesdaySlots().size(); a++){
						if(SpringTerm.getWeek2TuesdaySlots().get(a).toString().equals("")){							
						}
						else{
							SpringPW.print(SpringTerm.getWeek2TuesdaySlots().get(a).toString() + " ");
						}
					}
					SpringPW.println();
					
					// Print Wednesday Week 2 Time Slots
					for(int a = 0; a < SpringTerm.getWeek2WednesdaySlots().size(); a++){
						if(SpringTerm.getWeek2WednesdaySlots().get(a).toString().equals("")){							
						}
						else{
							SpringPW.print(SpringTerm.getWeek2WednesdaySlots().get(a).toString() + " ");
						}
					}
					SpringPW.println();
					
					// Print Thursday Week 2 Time SLots
					for(int a = 0; a < SpringTerm.getWeek2ThursdaySlots().size(); a++){
						if(SpringTerm.getWeek2ThursdaySlots().get(a).toString().equals("")){							
						}
						else{
							SpringPW.print(SpringTerm.getWeek2ThursdaySlots().get(a).toString() + " ");
						}
					}
					SpringPW.println();
					
					// Print Friday Week 2 Time Slots 
					for(int a = 0; a < SpringTerm.getWeek2FridaySlots().size(); a++){
						if(SpringTerm.getWeek2FridaySlots().get(a).toString().equals("")){							
						}
						else{
							SpringPW.print(SpringTerm.getWeek2FridaySlots().get(a).toString() + " ");
						}
					}
					SpringPW.println();
					
					// Print Saturday Week 2 Time Slots
					for(int a = 0; a < SpringTerm.getWeek2SaturdaySlots().size(); a++){
						if(SpringTerm.getWeek2SaturdaySlots().get(a).toString().equals("")){							
						}
						else{
							SpringPW.print(SpringTerm.getWeek2SaturdaySlots().get(a).toString() + " ");
						}
					}
					SpringPW.println();
					SpringPW.println();
					
					// Start month
					SpringPW.println(SpringTerm.getStartMonth().toString());
					
					// Start Day
					SpringPW.println(SpringTerm.getStartDay());
					
					// Start Year
					SpringPW.println(SpringTerm.getStartYear());
					SpringPW.println();
					
					// End month
					SpringPW.println(SpringTerm.getEndMonth().toString());
					
					// End Day
					SpringPW.println(SpringTerm.getEndDay());
					
					// End Year
					SpringPW.println(SpringTerm.getEndYear());
					
					SpringPW.close();
				}
				catch (IOException u) {
					return;
				}
				
			}
		}
		
		SpringBtnListener z = new SpringBtnListener();
		SpringSave.addActionListener(z);
		
		Terms.add(SpringPanel);
		
		// Summer
		
		JPanel SummerPanel;
		SummerPanel = new JPanel();
		SummerPanel.setPreferredSize(new Dimension(1420,300));
		SummerPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		BoxLayout xSummer;
		xSummer = new BoxLayout(SpringPanel, BoxLayout.X_AXIS);
		
		JPanel[] SummerCell;
		SummerCell = new JPanel[4];
		BoxLayout[] Summerybox;
		Summerybox = new BoxLayout[3];
		
		for(int a = 0; a < 4; a++){
			SummerCell[a] = new JPanel();
			if(a==0){
				SummerPanel.add(SummerCell[a]);
			}
			else{
			SummerCell[a].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			SummerPanel.add(SummerCell[a]);
			}
		}
		
		for(int p = 0; p < 3; p++){
			Summerybox[p] = new BoxLayout(SummerCell[p+1],BoxLayout.Y_AXIS);
		}
		
		//SummerCell[0]
		SummerCell[0].setPreferredSize(new Dimension(120,290));
		JPanel SummerLabelPanel;
		SummerLabelPanel = new JPanel();
		SummerLabelPanel.setPreferredSize(new Dimension(120, 250));
		
		BorderLayout centerSummerLabel;
		centerSummerLabel = new BorderLayout();
		SummerLabelPanel.setLayout(centerSummerLabel);
		
		JLabel Summer;
		Summer = new JLabel("Summer");
		Summer.setFont(new Font("Serif", Font.PLAIN, 35));
		Font SummerFont = Summer.getFont();
		Map SummerAttributes = SummerFont.getAttributes();
		SummerAttributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		Summer.setFont(SummerFont.deriveFont(SummerAttributes));
		Summer.setHorizontalAlignment(SwingConstants.CENTER);
		
		SummerLabelPanel.add(Summer, BorderLayout.CENTER);
		SummerCell[0].add(SummerLabelPanel, BorderLayout.CENTER);
		
		//SummerCell[1]
		SummerCell[1].setPreferredSize(new Dimension(430,290));
		
		JPanel[] SummerxDate;
		SummerxDate = new JPanel[3];
		
		for(int c = 0; c < 3; c++){
			SummerxDate[c] = new JPanel();
			SummerxDate[c].setPreferredSize(new Dimension(424,80));
			SummerCell[1].add(SummerxDate[c]);
		}
		
		JLabel SummerstartDate;
		SummerstartDate = new JLabel("Term Start Date:");
		SummerxDate[0].add(SummerstartDate);
		
		JPanel[] SummeryDatePanel;
		SummeryDatePanel = new JPanel[3];
		BoxLayout[] SummeryDate;
		SummeryDate = new BoxLayout[3];
		
		for(int d = 0; d < 3; d++){
			SummeryDatePanel[d] = new JPanel();
			SummeryDate[d] = new BoxLayout(SummeryDatePanel[d], BoxLayout.Y_AXIS);
			SummerxDate[0].add(SummeryDatePanel[d]);
		}
		
		SummeryDatePanel[0].setPreferredSize(new Dimension(120,72));
		
		JLabel SummermonthLabel;
		SummermonthLabel = new JLabel("Month");
		SummeryDatePanel[0].add(SummermonthLabel);
		
		String[] SummerMonth = {" ","January","February","March","April","May","June","July","August","September","October","November","December"};
		Summermonth = new JComboBox(SummerMonth);
		SummeryDatePanel[0].add(Summermonth);
		
		SummeryDatePanel[1].setPreferredSize(new Dimension(73,72));
		
		JLabel SummerdayLabel;
		SummerdayLabel = new JLabel("Day");
		SummeryDatePanel[1].add(SummerdayLabel);
		SpinnerNumberModel SummerDay = new SpinnerNumberModel(1,1,31,1);
		Summerday = new JSpinner(SummerDay);
		SummeryDatePanel[1].add(Summerday);
		
		SummeryDatePanel[2].setPreferredSize(new Dimension(98,72));
		
		JLabel SummeryearLabel;
		SummeryearLabel = new JLabel("Year");
		SummeryDatePanel[2].add(SummeryearLabel);
		SpinnerNumberModel SummerYear = new SpinnerNumberModel(2013,2013,null,1);
		Summeryear = new JSpinner(SummerYear);
		SummeryDatePanel[2].add(Summeryear);
		
		JLabel SummerTermEndDate;
		SummerTermEndDate = new JLabel("Term End Date:");
		SummerxDate[1].add(SummerTermEndDate);
		
		JPanel[] SummeryDatePanel2;
		SummeryDatePanel2 = new JPanel[3];
		BoxLayout[] SummeryDate2;
		SummeryDate2 = new BoxLayout[3];
		
		for(int d = 0; d < 3; d++){
			SummeryDatePanel2[d] = new JPanel();
			SummeryDate2[d] = new BoxLayout(SummeryDatePanel2[d], BoxLayout.Y_AXIS);
			SummerxDate[1].add(SummeryDatePanel2[d]);
		}
		
		SummeryDatePanel2[0].setPreferredSize(new Dimension(120,72));
		
		JLabel SummermonthLabel2;
		SummermonthLabel2 = new JLabel("Month");
		SummeryDatePanel2[0].add(SummermonthLabel2);
		
		String[] SummerMonth2 = {" ","January","February","March","April","May","June","July","August","September","October","November","December"};
		Summermonth2 = new JComboBox(SummerMonth2);
		SummeryDatePanel2[0].add(Summermonth2);
		
		SummeryDatePanel2[1].setPreferredSize(new Dimension(73,72));
		
		JLabel SummerdayLabel2;
		SummerdayLabel2 = new JLabel("Day");
		SummeryDatePanel2[1].add(SummerdayLabel2);
		SpinnerNumberModel SummerDay2 = new SpinnerNumberModel(1,1,31,1);
		Summerday2 = new JSpinner(SummerDay2);
		SummeryDatePanel2[1].add(Summerday2);
		
		SummeryDatePanel2[2].setPreferredSize(new Dimension(98,72));
		
		JLabel SummeryearLabel2;
		SummeryearLabel2 = new JLabel("Year");
		SummeryDatePanel2[2].add(SummeryearLabel2);
		SpinnerNumberModel SummerYear2 = new SpinnerNumberModel(2013,2013,null,1);
		Summeryear2 = new JSpinner(SummerYear2);
		SummeryDatePanel2[2].add(Summeryear2);
		
		JButton SummerSave;
		SummerSave = new JButton("Save");
		
		SummerxDate[2].add(SummerSave);
		
		//SummerCell[2]
		SummerCell[2].setPreferredSize(new Dimension(424,290));
		
		JPanel SummertopWeek1;
		SummertopWeek1 = new JPanel();
		SummertopWeek1.setPreferredSize(new Dimension(110,30));
		JLabel Summerweek1Heading;
		Summerweek1Heading = new JLabel("Week 1");
		Summerweek1Heading.setFont(new Font("Serif", Font.PLAIN, 20));
		Font Summerfont1 = Summerweek1Heading.getFont();
		Map Summerattributes1 = Summerfont1.getAttributes();
		Summerattributes1.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		Summerweek1Heading.setFont(Summerfont1.deriveFont(Summerattributes1));
		SummertopWeek1.add(Summerweek1Heading);
		SummerCell[2].add(SummertopWeek1);
		
		JPanel[] Summerxtime;
		Summerxtime = new JPanel[7];
		
		BoxLayout[] Summerhorizontal1;
		Summerhorizontal1 = new BoxLayout[7];
		
		SummerWeek1Monday = new JTextField[6];
		SummerWeek1Tuesday = new JTextField[6];
		SummerWeek1Wednesday = new JTextField[6];
		SummerWeek1Thursday = new JTextField[6];
		SummerWeek1Friday = new JTextField[6];
		SummerWeek1Saturday = new JTextField[6];
		
		JLabel[] SummertimeSlotHeading1;
		SummertimeSlotHeading1 = new JLabel[7];
		
		SummertimeSlotHeading1[0] = new JLabel("Time Slot:");
		SummertimeSlotHeading1[0].setPreferredSize(new Dimension(75,20));
		SummertimeSlotHeading1[1] = new JLabel("Monday:");
		SummertimeSlotHeading1[1].setPreferredSize(new Dimension(75,20));
		SummertimeSlotHeading1[2] = new JLabel("Tuesday:");
		SummertimeSlotHeading1[2].setPreferredSize(new Dimension(75,20));
		SummertimeSlotHeading1[3] = new JLabel("Wednesday:");
		SummertimeSlotHeading1[3].setPreferredSize(new Dimension(75,20));
		SummertimeSlotHeading1[4] = new JLabel("Thursday:");
		SummertimeSlotHeading1[4].setPreferredSize(new Dimension(75,20));
		SummertimeSlotHeading1[5] = new JLabel("Friday:");
		SummertimeSlotHeading1[5].setPreferredSize(new Dimension(75,20));
		SummertimeSlotHeading1[6] = new JLabel("Saturday:");
		SummertimeSlotHeading1[6].setPreferredSize(new Dimension(75,20));
		
		JLabel[] SummerSlotNumber1;
		SummerSlotNumber1 = new JLabel[6];
		
		SummerSlotNumber1[0] = new JLabel("1");
		SummerSlotNumber1[1] = new JLabel("2");
		SummerSlotNumber1[2] = new JLabel("3");
		SummerSlotNumber1[3] = new JLabel("4");
		SummerSlotNumber1[4] = new JLabel("5");
		SummerSlotNumber1[5] = new JLabel("6");
		
		for(int f = 0; f < 6; f++){
			SummerSlotNumber1[f].setPreferredSize(new Dimension(50,20));
			SummerSlotNumber1[f].setHorizontalAlignment(SwingConstants.CENTER);
		}
		
		for(int h = 0; h < 6; h++){
			SummerWeek1Monday[h] = new JTextField();
			SummerWeek1Monday[h].setPreferredSize(new Dimension(50,20));
			SummerWeek1Tuesday[h] = new JTextField();
			SummerWeek1Tuesday[h].setPreferredSize(new Dimension(50,20));
			SummerWeek1Wednesday[h] = new JTextField();
			SummerWeek1Wednesday[h].setPreferredSize(new Dimension(50,20));
			SummerWeek1Thursday[h] = new JTextField();
			SummerWeek1Thursday[h].setPreferredSize(new Dimension(50,20));
			SummerWeek1Friday[h] = new JTextField();
			SummerWeek1Friday[h].setPreferredSize(new Dimension(50,20));
			SummerWeek1Saturday[h] = new JTextField();
			SummerWeek1Saturday[h].setPreferredSize(new Dimension(50,20));
		}
		
		for(int e = 0; e < 7; e++){
			Summerxtime[e] = new JPanel();
			Summerxtime[e].setPreferredSize(new Dimension(414,30));
			Summerhorizontal1[e] = new BoxLayout(Summerxtime[e], BoxLayout.X_AXIS);
			Summerxtime[e].add(SummertimeSlotHeading1[e]);
			if(e == 0){
				for(int g = 0; g < 6; g++){
					Summerxtime[0].add(SummerSlotNumber1[g]);
				}
			}
		}
		
		for(int i = 0; i < 6; i++){
			Summerxtime[1].add(SummerWeek1Monday[i]);
		}
		
		for(int j = 0; j < 6; j++){
			Summerxtime[2].add(SummerWeek1Tuesday[j]);
		}
		
		for(int k = 0; k < 6; k++){
			Summerxtime[3].add(SummerWeek1Wednesday[k]);
		}
		
		for(int l = 0; l < 6; l++){
			Summerxtime[4].add(SummerWeek1Thursday[l]);
		}
		
		for(int m = 0; m < 6; m++){
			Summerxtime[5].add(SummerWeek1Friday[m]);
		}
		
		for(int n = 0; n < 6; n++){
			Summerxtime[6].add(SummerWeek1Saturday[n]);
		}
		
		for(int i = 0; i < 7; i++){
			SummerCell[2].add(Summerxtime[i]);
			Summerxtime[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
		}
		
		//SummerCell[3]
		SummerCell[3].setPreferredSize(new Dimension(424,290));
		
		JPanel SummertopWeek2;
		SummertopWeek2 = new JPanel();
		SummertopWeek2.setPreferredSize(new Dimension(110,30));
		JLabel Summerweek2Heading;
		Summerweek2Heading = new JLabel("Week 2");
		Summerweek2Heading.setFont(new Font("Serif", Font.PLAIN, 20));
		Font Summerfont2 = Summerweek2Heading.getFont();
		Map Summerattributes2 = Summerfont2.getAttributes();
		Summerattributes2.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
		Summerweek2Heading.setFont(Summerfont2.deriveFont(Summerattributes2));
		SummertopWeek2.add(Summerweek2Heading);
		SummerCell[3].add(SummertopWeek2);
		
		JPanel[] Summerxtime2;
		Summerxtime2 = new JPanel[7];
		
		BoxLayout[] Summerhorizontal2;
		Summerhorizontal2 = new BoxLayout[7];
		
		SummerWeek2Monday = new JTextField[6];
		SummerWeek2Tuesday = new JTextField[6];
		SummerWeek2Wednesday = new JTextField[6];
		SummerWeek2Thursday = new JTextField[6];
		SummerWeek2Friday = new JTextField[6];
		SummerWeek2Saturday = new JTextField[6];
		
		JLabel[] SummertimeSlotHeading2;
		SummertimeSlotHeading2 = new JLabel[7];
		
		SummertimeSlotHeading2[0] = new JLabel("Time Slot:");
		SummertimeSlotHeading2[0].setPreferredSize(new Dimension(75,20));
		SummertimeSlotHeading2[1] = new JLabel("Monday:");
		SummertimeSlotHeading2[1].setPreferredSize(new Dimension(75,20));
		SummertimeSlotHeading2[2] = new JLabel("Tuesday:");
		SummertimeSlotHeading2[2].setPreferredSize(new Dimension(75,20));
		SummertimeSlotHeading2[3] = new JLabel("Wednesday:");
		SummertimeSlotHeading2[3].setPreferredSize(new Dimension(75,20));
		SummertimeSlotHeading2[4] = new JLabel("Thursday:");
		SummertimeSlotHeading2[4].setPreferredSize(new Dimension(75,20));
		SummertimeSlotHeading2[5] = new JLabel("Friday:");
		SummertimeSlotHeading2[5].setPreferredSize(new Dimension(75,20));
		SummertimeSlotHeading2[6] = new JLabel("Saturday:");
		SummertimeSlotHeading2[6].setPreferredSize(new Dimension(75,20));
		
		JLabel[] SummerSlotNumber2;
		SummerSlotNumber2 = new JLabel[6];
		
		SummerSlotNumber2[0] = new JLabel("1");
		SummerSlotNumber2[1] = new JLabel("2");
		SummerSlotNumber2[2] = new JLabel("3");
		SummerSlotNumber2[3] = new JLabel("4");
		SummerSlotNumber2[4] = new JLabel("5");
		SummerSlotNumber2[5] = new JLabel("6");
		
		for(int f = 0; f < 6; f++){
			SummerSlotNumber2[f].setPreferredSize(new Dimension(50,20));
			SummerSlotNumber2[f].setHorizontalAlignment(SwingConstants.CENTER);
		}
		
		for(int h = 0; h < 6; h++){
			SummerWeek2Monday[h] = new JTextField();
			SummerWeek2Monday[h].setPreferredSize(new Dimension(50,20));
			SummerWeek2Tuesday[h] = new JTextField();
			SummerWeek2Tuesday[h].setPreferredSize(new Dimension(50,20));
			SummerWeek2Wednesday[h] = new JTextField();
			SummerWeek2Wednesday[h].setPreferredSize(new Dimension(50,20));
			SummerWeek2Thursday[h] = new JTextField();
			SummerWeek2Thursday[h].setPreferredSize(new Dimension(50,20));
			SummerWeek2Friday[h] = new JTextField();
			SummerWeek2Friday[h].setPreferredSize(new Dimension(50,20));
			SummerWeek2Saturday[h] = new JTextField();
			SummerWeek2Saturday[h].setPreferredSize(new Dimension(50,20));
		}
		
		for(int e = 0; e < 7; e++){
			Summerxtime2[e] = new JPanel();
			Summerxtime2[e].setPreferredSize(new Dimension(414,30));
			Summerhorizontal2[e] = new BoxLayout(Summerxtime2[e], BoxLayout.X_AXIS);
			Summerxtime2[e].add(SummertimeSlotHeading2[e]);
			if(e == 0){
				for(int g = 0; g < 6; g++){
					Summerxtime2[0].add(SummerSlotNumber2[g]);
				}
			}
		}
		
		for(int i = 0; i < 6; i++){
			Summerxtime2[1].add(SummerWeek2Monday[i]);
		}
		
		for(int j = 0; j < 6; j++){
			Summerxtime2[2].add(SummerWeek2Tuesday[j]);
		}
		
		for(int k = 0; k < 6; k++){
			Summerxtime2[3].add(SummerWeek2Wednesday[k]);
		}
		
		for(int l = 0; l < 6; l++){
			Summerxtime2[4].add(SummerWeek2Thursday[l]);
		}
		
		for(int m = 0; m < 6; m++){
			Summerxtime2[5].add(SummerWeek2Friday[m]);
		}
		
		for(int n = 0; n < 6; n++){
			Summerxtime2[6].add(SummerWeek2Saturday[n]);
		}
		
		for(int i = 0; i < 7; i++){
			SummerCell[3].add(Summerxtime2[i]);
			Summerxtime2[i].setBorder(BorderFactory.createLineBorder(Color.BLACK));
		}
		
		class SummerBtnListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				
				Term SummerTerm;
				SummerTerm = new Term();
				SummerTerm.setStartDay((Integer) Summerday.getValue());
				SummerTerm.setStartMonth(Summermonth.getSelectedItem().toString());
				SummerTerm.setStartYear((Integer) Summeryear.getValue());
				SummerTerm.setTermName("Summer");
				SummerTerm.setEndDay((Integer) Summerday2.getValue());
				SummerTerm.setEndMonth(Summermonth2.getSelectedItem().toString());
				SummerTerm.setEndYear((Integer) Summeryear2.getValue());
				
				ArrayList<String> SummerWeek1MondayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SummerWeek1MondayList.add(a, SummerWeek1Monday[a].getText());
				}
				SummerTerm.setWeek1MondaySlots(SummerWeek1MondayList);
				
				ArrayList<String> SummerWeek1TuesdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SummerWeek1TuesdayList.add(a, SummerWeek1Tuesday[a].getText());
				}
				SummerTerm.setWeek1TuesdaySlots(SummerWeek1TuesdayList);
				
				ArrayList<String> SummerWeek1WednesdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SummerWeek1WednesdayList.add(a, SummerWeek1Wednesday[a].getText());
				}
				SummerTerm.setWeek1WednesdaySlots(SummerWeek1WednesdayList);
				
				ArrayList<String> SummerWeek1ThursdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SummerWeek1ThursdayList.add(a, SummerWeek1Thursday[a].getText());
				}
				SummerTerm.setWeek1ThursdaySlots(SummerWeek1ThursdayList);
				
				ArrayList<String> SummerWeek1FridayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SummerWeek1FridayList.add(a, SummerWeek1Friday[a].getText());
				}
				SummerTerm.setWeek1FridaySlots(SummerWeek1FridayList);
				
				ArrayList<String> SummerWeek1SaturdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SummerWeek1SaturdayList.add(a, SummerWeek1Saturday[a].getText());
				}
				SummerTerm.setWeek1SaturdaySlots(SummerWeek1SaturdayList);
				
				ArrayList<String> SummerWeek2MondayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SummerWeek2MondayList.add(a, SummerWeek2Monday[a].getText());
				}
				SummerTerm.setWeek2MondaySlots(SummerWeek2MondayList);
				
				ArrayList<String> SummerWeek2TuesdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SummerWeek2TuesdayList.add(a, SummerWeek2Tuesday[a].getText());
				}
				SummerTerm.setWeek2TuesdaySlots(SummerWeek2TuesdayList);
				
				ArrayList<String> SummerWeek2WednesdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SummerWeek2WednesdayList.add(a, SummerWeek2Wednesday[a].getText());
				}
				SummerTerm.setWeek2WednesdaySlots(SummerWeek2WednesdayList);
				
				ArrayList<String> SummerWeek2ThursdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SummerWeek2ThursdayList.add(a, SummerWeek2Thursday[a].getText());
				}
				SummerTerm.setWeek2ThursdaySlots(SummerWeek2ThursdayList);
				
				ArrayList<String> SummerWeek2FridayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SummerWeek2FridayList.add(a, SummerWeek2Friday[a].getText());
				}
				SummerTerm.setWeek2FridaySlots(SummerWeek2FridayList);
				
				ArrayList<String> SummerWeek2SaturdayList = new ArrayList<String>();
				for(int a = 0; a < 6; a++){
					SummerWeek2SaturdayList.add(a, SummerWeek2Saturday[a].getText());
				}
				SummerTerm.setWeek2SaturdaySlots(SummerWeek2SaturdayList);
				
				try {
					File Summerfile = new File("Summer.txt");
					FileWriter Summerwriter = new FileWriter(Summerfile, false);
					PrintWriter SummerPW = new PrintWriter(Summerwriter);  
				
					// Print Monday Week 1 Time Slots
					for(int a = 0; a < SummerTerm.getWeek1MondaySlots().size(); a++){
						if(SummerTerm.getWeek1MondaySlots().get(a).toString().equals("")){							
						}
						else{
							SummerPW.print(SummerTerm.getWeek1MondaySlots().get(a).toString() + " ");
						}
					}
					SummerPW.println();
					
					// Print Tuesday Week 1 Time Slots
					for(int a = 0; a < SummerTerm.getWeek1TuesdaySlots().size(); a++){
						if(SummerTerm.getWeek1TuesdaySlots().get(a).toString().equals("")){							
						}
						else{
							SummerPW.print(SummerTerm.getWeek1TuesdaySlots().get(a).toString() + " ");
						}
					}
					SummerPW.println();
					
					// Print Wednesday Week 1 Time Slots
					for(int a = 0; a < SummerTerm.getWeek1WednesdaySlots().size(); a++){
						if(SummerTerm.getWeek1WednesdaySlots().get(a).toString().equals("")){							
						}
						else{
							SummerPW.print(SummerTerm.getWeek1WednesdaySlots().get(a).toString() + " ");
						}
					}
					SummerPW.println();
					
					// Print Thursday Week 1 Time Slots
					for(int a = 0; a < SummerTerm.getWeek1ThursdaySlots().size(); a++){
						if(SummerTerm.getWeek1ThursdaySlots().get(a).toString().equals("")){							
						}
						else{
							SummerPW.print(SummerTerm.getWeek1ThursdaySlots().get(a).toString() + " ");
						}
					}
					SummerPW.println();
					
					// Print Friday Week 1 Time Slots
					for(int a = 0; a < SummerTerm.getWeek1FridaySlots().size(); a++){
						if(SummerTerm.getWeek1FridaySlots().get(a).toString().equals("")){							
						}
						else{
							SummerPW.print(SummerTerm.getWeek1FridaySlots().get(a).toString() + " ");
						}
					}
					SummerPW.println();
					
					// Print Saturday Week 1 Time Slots
					for(int a = 0; a < SummerTerm.getWeek1SaturdaySlots().size(); a++){
						if(SummerTerm.getWeek1SaturdaySlots().get(a).toString().equals("")){							
						}
						else{
							SummerPW.print(SummerTerm.getWeek1SaturdaySlots().get(a).toString() + " ");
						}
					}
					SummerPW.println();
					
					// Print Monday Week 2 Time Slots
					for(int a = 0; a < SummerTerm.getWeek2MondaySlots().size(); a++){
						if(SummerTerm.getWeek2MondaySlots().get(a).toString().equals("")){							
						}
						else{
							SummerPW.print(SummerTerm.getWeek2MondaySlots().get(a).toString() + " ");
						}
					}
					SummerPW.println();
					
					// Print Tuesday Week 2 Time Slots
					for(int a = 0; a < SummerTerm.getWeek2TuesdaySlots().size(); a++){
						if(SummerTerm.getWeek2TuesdaySlots().get(a).toString().equals("")){							
						}
						else{
							SummerPW.print(SummerTerm.getWeek2TuesdaySlots().get(a).toString() + " ");
						}
					}
					SummerPW.println();
					
					// Print Wednesday Week 2 Time Slots
					for(int a = 0; a < SummerTerm.getWeek2WednesdaySlots().size(); a++){
						if(SummerTerm.getWeek2WednesdaySlots().get(a).toString().equals("")){							
						}
						else{
							SummerPW.print(SummerTerm.getWeek2WednesdaySlots().get(a).toString() + " ");
						}
					}
					SummerPW.println();
					
					// Print Thursday Week 2 Time Slots;
					for(int a = 0; a < SummerTerm.getWeek2ThursdaySlots().size(); a++){
						if(SummerTerm.getWeek2ThursdaySlots().get(a).toString().equals("")){							
						}
						else{
							SummerPW.print(SummerTerm.getWeek2ThursdaySlots().get(a).toString() + " ");
						}
					}
					SummerPW.println();
					
					// Print Friday Week 2 Time Slots
					for(int a = 0; a < SummerTerm.getWeek2FridaySlots().size(); a++){
						if(SummerTerm.getWeek2FridaySlots().get(a).toString().equals("")){							
						}
						else{
							SummerPW.print(SummerTerm.getWeek2FridaySlots().get(a).toString() + " ");
						}
					}
					SummerPW.println();
					
					// Print Saturday Week 2 Time Slots
					for(int a = 0; a < SummerTerm.getWeek2SaturdaySlots().size(); a++){
						if(SummerTerm.getWeek2SaturdaySlots().get(a).toString().equals("")){							
						}
						else{
							SummerPW.print(SummerTerm.getWeek2SaturdaySlots().get(a).toString() + " ");
						}
					}
					SummerPW.println();
					SummerPW.println();
					
					// Start Month
					SummerPW.println(SummerTerm.getStartMonth().toString());
					
					// Start Day
					SummerPW.println(SummerTerm.getStartDay());
					
					// Start Year
					SummerPW.println(SummerTerm.getStartYear());
					SummerPW.println();
					
					// End month
					SummerPW.println(SummerTerm.getEndMonth().toString());
					
					// End Day
					SummerPW.println(SummerTerm.getEndDay());
				
					// End Year
					SummerPW.println(SummerTerm.getEndYear());
					
					SummerPW.close();
				}
				catch (IOException u) {
					return;
				}
				
			}
		}
		
		SummerBtnListener t = new SummerBtnListener();
		SummerSave.addActionListener(t);
		
		Terms.add(SummerPanel);
		
		// Inputting times from saved files into the textboxes of this screen
		
		FileData filedata = new FileData();
		filedata.Read("Fall");
		ArrayList<ArrayList<String>> DisplayTimeSlots = filedata.Read("Fall");
		Monday1 = new ArrayList<String>(DisplayTimeSlots.get(0));
		Tuesday1 = new ArrayList<String>(DisplayTimeSlots.get(1));
		Wednesday1 = new ArrayList<String>(DisplayTimeSlots.get(2));
		Thursday1 = new ArrayList<String>(DisplayTimeSlots.get(3));
		Friday1 = new ArrayList<String>(DisplayTimeSlots.get(4));
		Saturday1 = new ArrayList<String>(DisplayTimeSlots.get(5));
		Monday2 = new ArrayList<String>(DisplayTimeSlots.get(6));
		Tuesday2 = new ArrayList<String>(DisplayTimeSlots.get(7));
		Wednesday2 = new ArrayList<String>(DisplayTimeSlots.get(8));
		Thursday2 = new ArrayList<String>(DisplayTimeSlots.get(9));
		Friday2 = new ArrayList<String>(DisplayTimeSlots.get(10));
		Saturday2 = new ArrayList<String>(DisplayTimeSlots.get(11));
		TermStartDateFile = new ArrayList<String>(DisplayTimeSlots.get(12));
		TermEndDateFile = new ArrayList<String>(DisplayTimeSlots.get(13));
		
			for(int k = 0; k < 5; k++){
				FallWeek1Monday[k].setText(Monday1.get(k));
				FallWeek1Wednesday[k].setText(Wednesday1.get(k));
				FallWeek1Thursday[k].setText(Thursday1.get(k));
				FallWeek1Friday[k].setText(Friday1.get(k));
				FallWeek2Monday[k].setText(Monday2.get(k));
				FallWeek2Wednesday[k].setText(Wednesday2.get(k));
				FallWeek2Thursday[k].setText(Thursday2.get(k));
				FallWeek2Friday[k].setText(Friday2.get(k));
			}
		   for(int l = 0; l < 6; l++){
			   FallWeek1Tuesday[l].setText(Tuesday1.get(l));
			   FallWeek2Tuesday[l].setText(Tuesday2.get(l));
		   }
		   for(int m = 0; m < 4; m++){
			   FallWeek1Saturday[m].setText(Saturday1.get(m));
			   FallWeek2Saturday[m].setText(Saturday2.get(m));
		   }
		   
		   if(TermStartDateFile.get(0).equals("January")){
			   month.setSelectedIndex(1);
		   }
		   else if(TermStartDateFile.get(0).equals("February")){
			   month.setSelectedIndex(2);
		   }
		   else if(TermStartDateFile.get(0).equals("March")){
			   month.setSelectedIndex(3);
		   }
		   else if(TermStartDateFile.get(0).equals("April")){
			   month.setSelectedIndex(4);
		   }
		   else if(TermStartDateFile.get(0).equals("May")){
			   month.setSelectedIndex(5);
		   }
		   else if(TermStartDateFile.get(0).equals("June")){
			   month.setSelectedIndex(6);
		   }
		   else if(TermStartDateFile.get(0).equals("July")){
			   month.setSelectedIndex(7);
		   }
		   else if(TermStartDateFile.get(0).equals("August")){
			   month.setSelectedIndex(8);
		   }
		   else if(TermStartDateFile.get(0).equals("September")){
			   month.setSelectedIndex(9);
		   }
		   else if(TermStartDateFile.get(0).equals("October")){
			   month.setSelectedIndex(10);
		   }
		   else if(TermStartDateFile.get(0).equals("November")){
			   month.setSelectedIndex(11);
		   }
		   else if(TermStartDateFile.get(0).equals("December")){
			   month.setSelectedIndex(12);
		   }
		   
		   int StartDay = Integer.parseInt(TermStartDateFile.get(1));
		   day.setValue(StartDay);
		   
		   int StartYear = Integer.parseInt(TermStartDateFile.get(2));
		   year.setValue(StartYear);
		   
		   if(TermEndDateFile.get(0).equals("January")){
			   month1.setSelectedIndex(1);
		   }
		   else if(TermEndDateFile.get(0).equals("February")){
			   month1.setSelectedIndex(2);
		   }
		   else if(TermEndDateFile.get(0).equals("March")){
			   month1.setSelectedIndex(3);
		   }
		   else if(TermEndDateFile.get(0).equals("April")){
			   month1.setSelectedIndex(4);
		   }
		   else if(TermEndDateFile.get(0).equals("May")){
			   month1.setSelectedIndex(5);
		   }
		   else if(TermEndDateFile.get(0).equals("June")){
			   month1.setSelectedIndex(6);
		   }
		   else if(TermEndDateFile.get(0).equals("July")){
			   month1.setSelectedIndex(7);
		   }
		   else if(TermEndDateFile.get(0).equals("August")){
			   month1.setSelectedIndex(8);
		   }
		   else if(TermEndDateFile.get(0).equals("September")){
			   month1.setSelectedIndex(9);
		   }
		   else if(TermEndDateFile.get(0).equals("October")){
			   month1.setSelectedIndex(10);
		   }
		   else if(TermEndDateFile.get(0).equals("November")){
			   month1.setSelectedIndex(11);
		   }
		   else if(TermEndDateFile.get(0).equals("December")){
			   month1.setSelectedIndex(12);
		   }
		   
		   int EndDay = Integer.parseInt(TermEndDateFile.get(1));
		   day1.setValue(EndDay);
		   
		   int EndYear = Integer.parseInt(TermEndDateFile.get(2));
		   year1.setValue(EndYear);
		   
		    FileData Winterfiledata = new FileData();
			Winterfiledata.Read("Winter");
			ArrayList<ArrayList<String>> WinterDisplayTimeSlots = Winterfiledata.Read("Winter");
			WinterMonday1 = new ArrayList<String>(WinterDisplayTimeSlots.get(0));
			WinterTuesday1 = new ArrayList<String>(WinterDisplayTimeSlots.get(1));
			WinterWednesday1 = new ArrayList<String>(WinterDisplayTimeSlots.get(2));
			WinterThursday1 = new ArrayList<String>(WinterDisplayTimeSlots.get(3));
			WinterFriday1 = new ArrayList<String>(WinterDisplayTimeSlots.get(4));
			WinterSaturday1 = new ArrayList<String>(WinterDisplayTimeSlots.get(5));
			WinterMonday2 = new ArrayList<String>(WinterDisplayTimeSlots.get(6));
			WinterTuesday2 = new ArrayList<String>(WinterDisplayTimeSlots.get(7));
			WinterWednesday2 = new ArrayList<String>(WinterDisplayTimeSlots.get(8));
			WinterThursday2 = new ArrayList<String>(WinterDisplayTimeSlots.get(9));
			WinterFriday2 = new ArrayList<String>(WinterDisplayTimeSlots.get(10));
			WinterSaturday2 = new ArrayList<String>(WinterDisplayTimeSlots.get(11));
			WinterTermStartDateFile = new ArrayList<String>(WinterDisplayTimeSlots.get(12));
			WinterTermEndDateFile = new ArrayList<String>(WinterDisplayTimeSlots.get(13));
			
				for(int k = 0; k < 5; k++){
					WinterWeek1Monday[k].setText(WinterMonday1.get(k));
					WinterWeek1Wednesday[k].setText(WinterWednesday1.get(k));
					WinterWeek1Thursday[k].setText(WinterThursday1.get(k));
					WinterWeek1Friday[k].setText(WinterFriday1.get(k));
					WinterWeek2Monday[k].setText(WinterMonday2.get(k));
					WinterWeek2Wednesday[k].setText(WinterWednesday2.get(k));
					WinterWeek2Thursday[k].setText(WinterThursday2.get(k));
					WinterWeek2Friday[k].setText(WinterFriday2.get(k));
				}
			   for(int l = 0; l < 6; l++){
				   WinterWeek1Tuesday[l].setText(WinterTuesday1.get(l));
				   WinterWeek2Tuesday[l].setText(WinterTuesday2.get(l));
			   }
			   for(int m = 0; m < 4; m++){
				   WinterWeek1Saturday[m].setText(WinterSaturday1.get(m));
				   WinterWeek2Saturday[m].setText(WinterSaturday2.get(m));
			   }
			   
			   if(WinterTermStartDateFile.get(0).equals("January")){
				   month2.setSelectedIndex(1);
			   }
			   else if(WinterTermStartDateFile.get(0).equals("February")){
				   month2.setSelectedIndex(2);
			   }
			   else if(WinterTermStartDateFile.get(0).equals("March")){
				   month2.setSelectedIndex(3);
			   }
			   else if(WinterTermStartDateFile.get(0).equals("April")){
				   month2.setSelectedIndex(4);
			   }
			   else if(WinterTermStartDateFile.get(0).equals("May")){
				   month2.setSelectedIndex(5);
			   }
			   else if(WinterTermStartDateFile.get(0).equals("June")){
				   month2.setSelectedIndex(6);
			   }
			   else if(WinterTermStartDateFile.get(0).equals("July")){
				   month2.setSelectedIndex(7);
			   }
			   else if(WinterTermStartDateFile.get(0).equals("August")){
				   month2.setSelectedIndex(8);
			   }
			   else if(WinterTermStartDateFile.get(0).equals("September")){
				   month2.setSelectedIndex(9);
			   }
			   else if(WinterTermStartDateFile.get(0).equals("October")){
				   month2.setSelectedIndex(10);
			   }
			   else if(WinterTermStartDateFile.get(0).equals("November")){
				   month2.setSelectedIndex(11);
			   }
			   else if(WinterTermStartDateFile.get(0).equals("December")){
				   month2.setSelectedIndex(12);
			   }
			   
			   int WinterStartDay = Integer.parseInt(WinterTermStartDateFile.get(1));
			   day2.setValue(WinterStartDay);
			   
			   int WinterStartYear = Integer.parseInt(WinterTermStartDateFile.get(2));
			   year2.setValue(WinterStartYear);
			   
			   if(WinterTermEndDateFile.get(0).equals("January")){
				   month3.setSelectedIndex(1);
			   }
			   else if(WinterTermEndDateFile.get(0).equals("February")){
				   month3.setSelectedIndex(2);
			   }
			   else if(WinterTermEndDateFile.get(0).equals("March")){
				   month3.setSelectedIndex(3);
			   }
			   else if(WinterTermEndDateFile.get(0).equals("April")){
				   month3.setSelectedIndex(4);
			   }
			   else if(WinterTermEndDateFile.get(0).equals("May")){
				   month3.setSelectedIndex(5);
			   }
			   else if(WinterTermEndDateFile.get(0).equals("June")){
				   month3.setSelectedIndex(6);
			   }
			   else if(WinterTermEndDateFile.get(0).equals("July")){
				   month3.setSelectedIndex(7);
			   }
			   else if(WinterTermEndDateFile.get(0).equals("August")){
				   month3.setSelectedIndex(8);
			   }
			   else if(WinterTermEndDateFile.get(0).equals("September")){
				   month3.setSelectedIndex(9);
			   }
			   else if(WinterTermEndDateFile.get(0).equals("October")){
				   month3.setSelectedIndex(10);
			   }
			   else if(WinterTermEndDateFile.get(0).equals("November")){
				   month3.setSelectedIndex(11);
			   }
			   else if(WinterTermEndDateFile.get(0).equals("December")){
				   month3.setSelectedIndex(12);
			   }
			   
			   int WinterEndDay = Integer.parseInt(WinterTermEndDateFile.get(1));
			   day3.setValue(WinterEndDay);
			   
			   int WinterEndYear = Integer.parseInt(WinterTermEndDateFile.get(2));
			   year3.setValue(WinterEndYear);
			   
			   
			   FileData Springfiledata = new FileData();
				Springfiledata.Read("Spring");
				ArrayList<ArrayList<String>> SpringDisplayTimeSlots = Springfiledata.Read("Spring");
				SpringMonday1 = new ArrayList<String>(SpringDisplayTimeSlots.get(0));
				SpringTuesday1 = new ArrayList<String>(SpringDisplayTimeSlots.get(1));
				SpringWednesday1 = new ArrayList<String>(SpringDisplayTimeSlots.get(2));
				SpringThursday1 = new ArrayList<String>(SpringDisplayTimeSlots.get(3));
				SpringFriday1 = new ArrayList<String>(SpringDisplayTimeSlots.get(4));
				SpringSaturday1 = new ArrayList<String>(SpringDisplayTimeSlots.get(5));
				SpringMonday2 = new ArrayList<String>(SpringDisplayTimeSlots.get(6));
				SpringTuesday2 = new ArrayList<String>(SpringDisplayTimeSlots.get(7));
				SpringWednesday2 = new ArrayList<String>(SpringDisplayTimeSlots.get(8));
				SpringThursday2 = new ArrayList<String>(SpringDisplayTimeSlots.get(9));
				SpringFriday2 = new ArrayList<String>(SpringDisplayTimeSlots.get(10));
				SpringSaturday2 = new ArrayList<String>(SpringDisplayTimeSlots.get(11));
				SpringTermStartDateFile = new ArrayList<String>(SpringDisplayTimeSlots.get(12));
				SpringTermEndDateFile = new ArrayList<String>(SpringDisplayTimeSlots.get(13));
				
					for(int k = 0; k < 5; k++){
						SpringWeek1Monday[k].setText(SpringMonday1.get(k));
						SpringWeek1Wednesday[k].setText(SpringWednesday1.get(k));
						SpringWeek1Thursday[k].setText(SpringThursday1.get(k));
						SpringWeek1Friday[k].setText(SpringFriday1.get(k));
						SpringWeek2Monday[k].setText(SpringMonday2.get(k));
						SpringWeek2Wednesday[k].setText(SpringWednesday2.get(k));
						SpringWeek2Thursday[k].setText(SpringThursday2.get(k));
						SpringWeek2Friday[k].setText(SpringFriday2.get(k));
					}
				   for(int l = 0; l < 6; l++){
					   SpringWeek1Tuesday[l].setText(SpringTuesday1.get(l));
					   SpringWeek2Tuesday[l].setText(SpringTuesday2.get(l));
				   }
				   for(int m = 0; m < 4; m++){
					   SpringWeek1Saturday[m].setText(SpringSaturday1.get(m));
					   SpringWeek2Saturday[m].setText(SpringSaturday2.get(m));
				   }
				   
				   if(SpringTermStartDateFile.get(0).equals("January")){
					   Springmonth.setSelectedIndex(1);
				   }
				   else if(SpringTermStartDateFile.get(0).equals("February")){
					   Springmonth.setSelectedIndex(2);
				   }
				   else if(SpringTermStartDateFile.get(0).equals("March")){
					   Springmonth.setSelectedIndex(3);
				   }
				   else if(SpringTermStartDateFile.get(0).equals("April")){
					   Springmonth.setSelectedIndex(4);
				   }
				   else if(SpringTermStartDateFile.get(0).equals("May")){
					   Springmonth.setSelectedIndex(5);
				   }
				   else if(SpringTermStartDateFile.get(0).equals("June")){
					   Springmonth.setSelectedIndex(6);
				   }
				   else if(SpringTermStartDateFile.get(0).equals("July")){
					   Springmonth.setSelectedIndex(7);
				   }
				   else if(SpringTermStartDateFile.get(0).equals("August")){
					   Springmonth.setSelectedIndex(8);
				   }
				   else if(SpringTermStartDateFile.get(0).equals("September")){
					   Springmonth.setSelectedIndex(9);
				   }
				   else if(SpringTermStartDateFile.get(0).equals("October")){
					   Springmonth.setSelectedIndex(10);
				   }
				   else if(SpringTermStartDateFile.get(0).equals("November")){
					   Springmonth.setSelectedIndex(11);
				   }
				   else if(SpringTermStartDateFile.get(0).equals("December")){
					   Springmonth.setSelectedIndex(12);
				   }
				   
				   int SpringStartDay = Integer.parseInt(SpringTermStartDateFile.get(1));
				   Springday.setValue(SpringStartDay);
				   
				   int SpringStartYear = Integer.parseInt(SpringTermStartDateFile.get(2));
				   Springyear.setValue(SpringStartYear);
				   
				   if(SpringTermEndDateFile.get(0).equals("January")){
					   Springmonth2.setSelectedIndex(1);
				   }
				   else if(SpringTermEndDateFile.get(0).equals("February")){
					   Springmonth2.setSelectedIndex(2);
				   }
				   else if(SpringTermEndDateFile.get(0).equals("March")){
					   Springmonth2.setSelectedIndex(3);
				   }
				   else if(SpringTermEndDateFile.get(0).equals("April")){
					   Springmonth2.setSelectedIndex(4);
				   }
				   else if(SpringTermEndDateFile.get(0).equals("May")){
					   Springmonth2.setSelectedIndex(5);
				   }
				   else if(SpringTermEndDateFile.get(0).equals("June")){
					   Springmonth2.setSelectedIndex(6);
				   }
				   else if(SpringTermEndDateFile.get(0).equals("July")){
					   Springmonth2.setSelectedIndex(7);
				   }
				   else if(SpringTermEndDateFile.get(0).equals("August")){
					   Springmonth2.setSelectedIndex(8);
				   }
				   else if(SpringTermEndDateFile.get(0).equals("September")){
					   Springmonth2.setSelectedIndex(9);
				   }
				   else if(SpringTermEndDateFile.get(0).equals("October")){
					   Springmonth2.setSelectedIndex(10);
				   }
				   else if(SpringTermEndDateFile.get(0).equals("November")){
					   Springmonth2.setSelectedIndex(11);
				   }
				   else if(SpringTermEndDateFile.get(0).equals("December")){
					   Springmonth2.setSelectedIndex(12);
				   }
				   
				   int SpringEndDay = Integer.parseInt(SpringTermEndDateFile.get(1));
				   Springday2.setValue(SpringEndDay);
				   
				   int SpringEndYear = Integer.parseInt(SpringTermEndDateFile.get(2));
				   Springyear2.setValue(SpringEndYear);
				   
				   FileData Summerfiledata = new FileData();
					Summerfiledata.Read("Summer");
					ArrayList<ArrayList<String>> SummerDisplayTimeSlots = Summerfiledata.Read("Summer");
					SummerMonday1 = new ArrayList<String>(SummerDisplayTimeSlots.get(0));
					SummerTuesday1 = new ArrayList<String>(SummerDisplayTimeSlots.get(1));
					SummerWednesday1 = new ArrayList<String>(SummerDisplayTimeSlots.get(2));
					SummerThursday1 = new ArrayList<String>(SummerDisplayTimeSlots.get(3));
					SummerFriday1 = new ArrayList<String>(SummerDisplayTimeSlots.get(4));
					SummerSaturday1 = new ArrayList<String>(SummerDisplayTimeSlots.get(5));
					SummerMonday2 = new ArrayList<String>(SummerDisplayTimeSlots.get(6));
					SummerTuesday2 = new ArrayList<String>(SummerDisplayTimeSlots.get(7));
					SummerWednesday2 = new ArrayList<String>(SummerDisplayTimeSlots.get(8));
					SummerThursday2 = new ArrayList<String>(SummerDisplayTimeSlots.get(9));
					SummerFriday2 = new ArrayList<String>(SummerDisplayTimeSlots.get(10));
					SummerSaturday2 = new ArrayList<String>(SummerDisplayTimeSlots.get(11));
					SummerTermStartDateFile = new ArrayList<String>(SummerDisplayTimeSlots.get(12));
					SummerTermEndDateFile = new ArrayList<String>(SummerDisplayTimeSlots.get(13));
					
						for(int k = 0; k < 5; k++){
							SummerWeek1Monday[k].setText(SummerMonday1.get(k));
							SummerWeek1Wednesday[k].setText(SummerWednesday1.get(k));
							SummerWeek1Thursday[k].setText(SummerThursday1.get(k));
							SummerWeek1Friday[k].setText(SummerFriday1.get(k));
							SummerWeek2Monday[k].setText(SummerMonday2.get(k));
							SummerWeek2Wednesday[k].setText(SummerWednesday2.get(k));
							SummerWeek2Thursday[k].setText(SummerThursday2.get(k));
							SummerWeek2Friday[k].setText(SummerFriday2.get(k));
						}
					   for(int l = 0; l < 6; l++){
						   SummerWeek1Tuesday[l].setText(SummerTuesday1.get(l));
						   SummerWeek2Tuesday[l].setText(SummerTuesday2.get(l));
					   }
					   for(int m = 0; m < 4; m++){
						   SummerWeek1Saturday[m].setText(SummerSaturday1.get(m));
						   SummerWeek2Saturday[m].setText(SummerSaturday2.get(m));
					   }
					   
					   if(SummerTermStartDateFile.get(0).equals("January")){
						   Summermonth.setSelectedIndex(1);
					   }
					   else if(SummerTermStartDateFile.get(0).equals("February")){
						   Summermonth.setSelectedIndex(2);
					   }
					   else if(SummerTermStartDateFile.get(0).equals("March")){
						   Summermonth.setSelectedIndex(3);
					   }
					   else if(SummerTermStartDateFile.get(0).equals("April")){
						   Summermonth.setSelectedIndex(4);
					   }
					   else if(SummerTermStartDateFile.get(0).equals("May")){
						   Summermonth.setSelectedIndex(5);
					   }
					   else if(SummerTermStartDateFile.get(0).equals("June")){
						   Summermonth.setSelectedIndex(6);
					   }
					   else if(SummerTermStartDateFile.get(0).equals("July")){
						   Summermonth.setSelectedIndex(7);
					   }
					   else if(SummerTermStartDateFile.get(0).equals("August")){
						   Summermonth.setSelectedIndex(8);
					   }
					   else if(SummerTermStartDateFile.get(0).equals("September")){
						   Summermonth.setSelectedIndex(9);
					   }
					   else if(SummerTermStartDateFile.get(0).equals("October")){
						   Summermonth.setSelectedIndex(10);
					   }
					   else if(SummerTermStartDateFile.get(0).equals("November")){
						   Summermonth.setSelectedIndex(11);
					   }
					   else if(SummerTermStartDateFile.get(0).equals("December")){
						   Summermonth.setSelectedIndex(12);
					   }
					   
					   int SummerStartDay = Integer.parseInt(SummerTermStartDateFile.get(1));
					   Summerday.setValue(SummerStartDay);
					   
					   int SummerStartYear = Integer.parseInt(SummerTermStartDateFile.get(2));
					   Summeryear.setValue(SummerStartYear);
					   
					   if(SummerTermEndDateFile.get(0).equals("January")){
						   Summermonth2.setSelectedIndex(1);
					   }
					   else if(SummerTermEndDateFile.get(0).equals("February")){
						   Summermonth2.setSelectedIndex(2);
					   }
					   else if(SummerTermEndDateFile.get(0).equals("March")){
						   Summermonth2.setSelectedIndex(3);
					   }
					   else if(SummerTermEndDateFile.get(0).equals("April")){
						   Summermonth2.setSelectedIndex(4);
					   }
					   else if(SummerTermEndDateFile.get(0).equals("May")){
						   Summermonth2.setSelectedIndex(5);
					   }
					   else if(SummerTermEndDateFile.get(0).equals("June")){
						   Summermonth2.setSelectedIndex(6);
					   }
					   else if(SummerTermEndDateFile.get(0).equals("July")){
						   Summermonth2.setSelectedIndex(7);
					   }
					   else if(SummerTermEndDateFile.get(0).equals("August")){
						   Summermonth2.setSelectedIndex(8);
					   }
					   else if(SummerTermEndDateFile.get(0).equals("September")){
						   Summermonth2.setSelectedIndex(9);
					   }
					   else if(SummerTermEndDateFile.get(0).equals("October")){
						   Summermonth2.setSelectedIndex(10);
					   }
					   else if(SummerTermEndDateFile.get(0).equals("November")){
						   Summermonth2.setSelectedIndex(11);
					   }
					   else if(SummerTermEndDateFile.get(0).equals("December")){
						   Summermonth2.setSelectedIndex(12);
					   }
					   
					   int SummerEndDay = Integer.parseInt(SummerTermEndDateFile.get(1));
					   Summerday2.setValue(SummerEndDay);
					   
					   int SummerEndYear = Integer.parseInt(SummerTermEndDateFile.get(2));
					   Summeryear2.setValue(SummerEndYear);
		
		
	
		ManageSchedule.setSize(1440,835);
		ManageSchedule.setResizable(false);
		ManageSchedule.setVisible(true);
	}
		
}
	

		
		
		
	


