import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Guide {

	private JFrame GuideFrame;
	private BoxLayout xpanels;
	private BoxLayout yLeft;
	private BoxLayout yRight;
	private ArrayList<ArrayList<ArrayList<String>>> allGuides;
	private ArrayList<String> guide;
	private String country;
	private String Gender;
	private String academicInterest;
	private String Fall;
	private String Winter;
	private String Spring;
	private String TopClub;
	private String BottomClub;
	private String boarding;
	
	public void construct(String Grade, int index){
		GuideFrame = new JFrame("Guide Information");
		
		// Top of Frame
		JPanel topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(800, 50));
		topPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
		JLabel Heading = new JLabel("Guide Information");
		topPanel.add(Heading, BorderLayout.CENTER);
		
		
		GuideFrame.add(topPanel, BorderLayout.NORTH);
		// Bottom of Frame
		JPanel bottomPanel = new JPanel();
		bottomPanel.setPreferredSize(new Dimension(800,750));
		bottomPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		xpanels = new BoxLayout(bottomPanel, BoxLayout.X_AXIS);
		
		JPanel leftInfo = new JPanel();
		leftInfo.setPreferredSize(new Dimension(355, 740));
		leftInfo.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
		JPanel leftsmall = new JPanel();
		leftsmall.setPreferredSize(new Dimension(350, 650));
		yLeft = new BoxLayout(leftsmall, BoxLayout.Y_AXIS);
		leftInfo.add(leftsmall, BorderLayout.CENTER);
		bottomPanel.add(leftInfo);
		
		JPanel[] leftPanels;
		leftPanels = new JPanel[6];
		
		JLabel[] fillIn;
		fillIn = new JLabel[6];
		
		for(int a = 0; a < 6; a++){
			leftPanels[a] = new JPanel();
			leftPanels[a].setPreferredSize(new Dimension(350,40));
			fillIn[a] = new JLabel();
			fillIn[a].setPreferredSize(new Dimension(220,30));
		}
		
		// Extract data from day text files
		GuideFileData guideData = new GuideFileData();
		allGuides = new ArrayList<ArrayList<ArrayList<String>>>();
		allGuides = guideData.Read();
		
		if(Grade.equals("Prep")){
			guide = allGuides.get(0).get(index);
		}
		else if(Grade.equals("Lower")){
			guide = allGuides.get(1).get(index);
		}
		else if(Grade.equals("Upper")){
			guide = allGuides.get(2).get(index);
		}
		else if(Grade.equals("Senior")){
			guide = allGuides.get(3).get(index);
		}
		
		
		
		JLabel firstName = new JLabel("First Name:");
		firstName.setPreferredSize(new Dimension(120,30));
		leftPanels[0].add(firstName);
		fillIn[0].setText(guide.get(0));
		JLabel lastName = new JLabel("Last Name:");
		lastName.setPreferredSize(new Dimension(120,30));
		leftPanels[1].add(lastName);
		fillIn[1].setText(guide.get(0));
		JLabel homeCountry = new JLabel("Home Country:");
		homeCountry.setPreferredSize(new Dimension(120,30));
		leftPanels[2].add(homeCountry);
		if(guide.get(2).equals("0.0")){
			country = "United States of America";
		}
		if(guide.get(2).equals("1.0")){
			country = "Argentina";
		}
		if(guide.get(2).equals("2.0")){
			country = "Australia";
		}
		if(guide.get(2).equals("3.0")){
			country = "Austria";
		}
		if(guide.get(2).equals("4.0")){
			country = "Bermuda";
		}
		if(guide.get(2).equals("5.0")){
			country = "Bosnia";
		}
		if(guide.get(2).equals("6.0")){
			country = "Brazil";
		}
		if(guide.get(2).equals("7.0")){
			country = "Canada";
		}
		if(guide.get(2).equals("8.0")){
			country = "Chile";
		}
		if(guide.get(2).equals("9.0")){
			country = "Czech Republic";
		}
		if(guide.get(2).equals("10.0")){
			country = "England";
		}
		if(guide.get(2).equals("11.0")){
			country = "France";
		}
		if(guide.get(2).equals("12.0")){
			country = "Hong Kong";
		}
		if(guide.get(2).equals("13.0")){
			country = "Hungary";
		}
		if(guide.get(2).equals("14.0")){
			country = "Indonesia";
		}
		if(guide.get(2).equals("12.0")){
			country = "Italy";
		}
		if(guide.get(2).equals("16.0")){
			country = "Jamaica";
		}
		if(guide.get(2).equals("17.0")){
			country = "Japan";
		}
		if(guide.get(2).equals("18.0")){
			country = "Malaysia";
		}
		if(guide.get(2).equals("19.0")){
			country = "Mexico";
		}
		if(guide.get(2).equals("20.0")){
			country = "Morocco";
		}
		if(guide.get(2).equals("21.0")){
			country = "Nepal";
		}
		if(guide.get(2).equals("22.0")){
			country = "Nigeria";
		}
		if(guide.get(2).equals("23.0")){
			country = "P.R.China";
		}
		if(guide.get(2).equals("24.0")){
			country = "Philippines";
		}
		if(guide.get(2).equals("25.0")){
			country = "Poland";
		}
		if(guide.get(2).equals("26.0")){
			country = "Republic of Kazakhstan";
		}
		if(guide.get(2).equals("27.0")){
			country = "Republic of Korea";
		}
		if(guide.get(2).equals("28.0")){
			country = "Russia";
		}
		if(guide.get(2).equals("29.0")){
			country = "Saudi Arabia";
		}
		if(guide.get(2).equals("30.0")){
			country = "Switzerland";
		}
		if(guide.get(2).equals("31.0")){
			country = "Taiwan";
		}
		if(guide.get(2).equals("32.0")){
			country = "Thailand";
		}
		if(guide.get(2).equals("33.0")){
			country = "Turkey";
		}
		if(guide.get(2).equals("34.0")){
			country = "United Arab Emirates";
		}
		if(guide.get(2).equals("35.0")){
			country = "United Kingdom";
		}
		if(guide.get(2).equals("36.0")){
			country = "Vietnam";
		}
		fillIn[2].setText(country);
		JLabel currentGrade = new JLabel("Current Grade:");
		currentGrade.setPreferredSize(new Dimension(120,30));
		leftPanels[3].add(currentGrade);
		fillIn[3].setText(guide.get(4));
		JLabel studentEmail = new JLabel("Student Email:");
		studentEmail.setPreferredSize(new Dimension(120,30));
		leftPanels[4].add(studentEmail);
		fillIn[4].setText(guide.get(0) + "@gmail.com");
		JLabel studentSchedule = new JLabel("Guide Frees:");
		studentSchedule.setPreferredSize(new Dimension(120,30));
		leftPanels[5].add(studentSchedule);
		String schedule = "";
		String health;
		String day1 = "";
		String day2 = "";
		String singleFree;
		int previousUnder = 0;
		
		if(guide.get(4).equals("9")){
			previousUnder = 12;
			health = guide.get(1).substring(0,7);
			day1 = health.substring(0,3);
			day2 = health.substring(4,7);
			singleFree = guide.get(1).substring(8,11);
			schedule = singleFree.substring(0,1) + "/" + singleFree.substring(2,3) + " (Health " + day1 + " and " + day2 + "), ";
			for(int d = 12; d < guide.get(1).length(); d++){
				if(guide.get(1).charAt(d) == 95){
					if(d == guide.get(1).length() - 1){
						schedule = schedule + guide.get(1).substring(previousUnder, d);
						previousUnder = d+1;
					}
					else{
						schedule = schedule + guide.get(1).substring(previousUnder, d) + ", ";
						previousUnder = d+1;
					}
				}
			}
		}
		else{
			for(int d = 0; d < guide.get(1).length(); d++){
				if(guide.get(1).charAt(d) == 95){
					if(d == guide.get(1).length() - 1){
						schedule = schedule + guide.get(1).substring(previousUnder, d);
						previousUnder = d+1;
					}
					else{
						schedule = schedule + guide.get(1).substring(previousUnder, d) + ", ";
						previousUnder = d+1;
					}
				}
			}
		}
		
		fillIn[5].setText(schedule);
		
		for(int b = 0; b < 6; b++){
			fillIn[b].setHorizontalAlignment(SwingConstants.LEFT);
			leftPanels[b].add(fillIn[b]);
			leftsmall.add(leftPanels[b]);
		}
		
		JPanel rightInfo = new JPanel();
		rightInfo.setPreferredSize(new Dimension(355, 740));
		rightInfo.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
		JPanel rightsmall = new JPanel();
		rightsmall.setPreferredSize(new Dimension(350, 650));
		yRight = new BoxLayout(rightsmall, BoxLayout.Y_AXIS);
		rightInfo.add(rightsmall, BorderLayout.CENTER);
		bottomPanel.add(rightInfo);
		
		JPanel[] rightPanels;
		rightPanels = new JPanel[8];
		
		JLabel[] rightfillIn;
		rightfillIn = new JLabel[8];
		
		for(int a = 0; a < 8; a++){
			rightPanels[a] = new JPanel();
			rightPanels[a].setPreferredSize(new Dimension(350,40));
			rightfillIn[a] = new JLabel();
			rightfillIn[a].setPreferredSize(new Dimension(190,30));
		}

		JLabel gender = new JLabel("Gender:");
		gender.setPreferredSize(new Dimension(150,30));
		rightPanels[0].add(gender);
		if(guide.get(3).equals("0.0")){
			Gender = "Female";
		}
		else if(guide.get(3).equals("1.0")){
			Gender = "Male";
		}
		rightfillIn[0].setText(Gender);
		JLabel residence = new JLabel("Residence:");
		residence.setPreferredSize(new Dimension(150,30));
		rightPanels[1].add(residence);
		if(guide.get(11).equals("yes")){
			boarding = "Boarding Student";
		}
		else if(guide.get(11).equals("yes")){
			boarding = "Boarding Student";
		}
		rightfillIn[1].setText(boarding);
		JLabel academic = new JLabel("Academic Interest:");
		academic.setPreferredSize(new Dimension(150,30));
		rightPanels[2].add(academic);
		if(guide.get(5).equals("0.0")){
			academicInterest = "Math/Science";
		}
		else if(guide.get(5).equals("1.0")){
			academicInterest = "Humanities";
		}
		else if(guide.get(5).equals("2.0")){
			academicInterest = "Languages";
		}
		else if(guide.get(5).equals("3.0")){
			academicInterest = "Arts";
		}
		else if(guide.get(5).equals("4.0")){
			academicInterest = "All";
		}
		rightfillIn[2].setText(academicInterest);
		JLabel FallSport = new JLabel("Fall Sport:");
		FallSport.setPreferredSize(new Dimension(150,30));
		rightPanels[3].add(FallSport);
		if(guide.get(6).equals("0.0")){
			Fall = "";
		}
		else if(guide.get(6).equals("1.0")){
			Fall = "Cross Country";
		}
		else if(guide.get(6).equals("2.0")){
			Fall = "Field Hockey";
		}
		else if(guide.get(6).equals("3.0")){
			Fall = "Football";
		}
		else if(guide.get(6).equals("4.0")){
			Fall = "Soccer";
		}
		else if(guide.get(6).equals("5.0")){
			Fall = "Volleyball";
		}
		else if(guide.get(6).equals("6.0")){
			Fall = "Water Polo";
		}
		
		rightfillIn[3].setText(Fall);
		JLabel WinterSport = new JLabel("Winter Sport:");
		WinterSport.setPreferredSize(new Dimension(150,30));
		rightPanels[4].add(WinterSport);
		if(guide.get(7).equals("0.0")){
			Winter = "";
		}
		else if(guide.get(7).equals("1.0")){
			Winter = "Basketball";
		}
		else if(guide.get(7).equals("2.0")){
			Winter = "Ice Hockey";
		}
		else if(guide.get(7).equals("3.0")){
			Winter = "Squash";
		}
		else if(guide.get(7).equals("4.0")){
			Winter = "Swimming & Diving";
		}
		else if(guide.get(7).equals("5.0")){
			Winter = "Winter Track";
		}
		else if(guide.get(7).equals("6.0")){
			Winter = "Wrestling";
		}
		
		rightfillIn[4].setText(Winter);
		JLabel SpringSport = new JLabel("Spring Sport:");
		SpringSport.setPreferredSize(new Dimension(150,30));
		rightPanels[5].add(SpringSport);
		if(guide.get(8).equals("0.0")){
			Spring = "";
		}
		else if(guide.get(8).equals("1.0")){
			Spring = "Baseball";
		}
		else if(guide.get(8).equals("2.0")){
			Spring = "Crew";
		}
		else if(guide.get(8).equals("3.0")){
			Spring = "Cycling";
		}
		else if(guide.get(8).equals("4.0")){
			Spring = "Golf";
		}
		else if(guide.get(8).equals("5.0")){
			Spring = "Lacrosse";
		}
		else if(guide.get(8).equals("6.0")){
			Spring = "Softball";
		}
		else if(guide.get(8).equals("7.0")){
			Spring = "Tennis";
		}
		else if(guide.get(8).equals("8.0")){
			Spring = "Track";
		}
		else if(guide.get(8).equals("9.0")){
			Spring = "Water Polo";
		}
		
		rightfillIn[5].setText(Spring);
		JLabel Club1 = new JLabel("Club 1:");
		Club1.setPreferredSize(new Dimension(150,30));
		rightPanels[6].add(Club1);
		if(guide.get(9).equals("0.0")){
			TopClub = "";
		}
		else if(guide.get(9).equals("1.0")){
			TopClub = "Culture";
		}
		else if(guide.get(9).equals("2.0")){
			TopClub = "Dance";
		}
		else if(guide.get(9).equals("3.0")){
			TopClub = "Debate/Public Speaking";
		}
		else if(guide.get(9).equals("4.0")){
			TopClub = "Language";
		}
		else if(guide.get(9).equals("5.0")){
			TopClub = "Math/Science";
		}
		else if(guide.get(9).equals("6.0")){
			TopClub = "Music";
		}
		else if(guide.get(9).equals("7.0")){
			TopClub = "Newspaper/Yearbook";
		}
		
		rightfillIn[6].setText(TopClub);
		JLabel Club2 = new JLabel("Club 2:");
		Club2.setPreferredSize(new Dimension(150,30));
		rightPanels[7].add(Club2);
		if(guide.get(10).equals("0.0")){
			TopClub = "";
		}
		else if(guide.get(10).equals("1.0")){
			TopClub = "Culture";
		}
		else if(guide.get(10).equals("2.0")){
			TopClub = "Dance";
		}
		else if(guide.get(10).equals("3.0")){
			TopClub = "Debate/Public Speaking";
		}
		else if(guide.get(10).equals("4.0")){
			TopClub = "Language";
		}
		else if(guide.get(10).equals("5.0")){
			TopClub = "Math/Science";
		}
		else if(guide.get(10).equals("6.0")){
			TopClub = "Music";
		}
		else if(guide.get(10).equals("7.0")){
			TopClub = "Newspaper/Yearbook";
		}
		
		rightfillIn[7].setText(BottomClub);
		
		for(int b = 0; b < 8; b++){
			rightfillIn[b].setHorizontalAlignment(SwingConstants.LEFT);
			rightPanels[b].add(rightfillIn[b]);
			rightsmall.add(rightPanels[b]);
		}
		
		
		GuideFrame.add(bottomPanel, BorderLayout.SOUTH);
		
		
		GuideFrame.setSize(800,800);
		GuideFrame.setResizable(false);
		GuideFrame.setVisible(true);
	}
}
