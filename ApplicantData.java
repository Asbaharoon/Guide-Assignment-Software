import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.TextAttribute;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Map;
import java.util.Scanner;

import javax.swing.*;


public class ApplicantData {

	private JFrame ApplicantFrame;
	private BoxLayout xpanels;
	private BoxLayout yLeft;
	private BoxLayout yRight;
	private ArrayList<ArrayList<String>> TimeSlot1;
	private ArrayList<ArrayList<String>> TimeSlot2;
	private ArrayList<ArrayList<String>> TimeSlot3;
	private ArrayList<ArrayList<String>> TimeSlot4;
	private ArrayList<ArrayList<String>> TimeSlot5;
	private ArrayList<ArrayList<String>> TimeSlot6;
	private ArrayList<ArrayList<ArrayList<String>>> TimeSlots;
	private ArrayList<String> applicant;
	private String day;
	private String country;
	private String Gender;
	private String grade;
	private String applyGrade;
	private String academicInterest;
	private String Fall;
	private String Winter;
	private String Spring;
	private String TopClub;
	private String BottomClub;
	private String yesTour;
	private String yesInterview;
	private String boarding;
	private JTextField emergencyGuide;
	private PrintWriter MondayPW;
	private PrintWriter TuesdayPW;
	private PrintWriter WednesdayPW;
	private PrintWriter ThursdayPW;
	private PrintWriter FridayPW;
	private PrintWriter SaturdayPW;
	private Scanner file;
	private String weekDay1;
	private int slot1;
	private int index1;
	private int dayOfYear1;
	
	public void construct(String weekDay, int slot, int index, int dayOfYear){
		ApplicantFrame = new JFrame("Applicant Information");
		
		weekDay1 = weekDay;
		slot1 = slot;
		index1 = index;
		dayOfYear1 = dayOfYear;
		
		Calendar aujourdhui = Calendar.getInstance();
		aujourdhui.set(Calendar.DAY_OF_YEAR, dayOfYear);
		int Datemonth = aujourdhui.get(Calendar.MONTH);
		int Dateday = aujourdhui.get(Calendar.DATE);
		int Dateyear = aujourdhui.get(Calendar.YEAR);
		
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
			    cal.set(Calendar.MONTH, Datemonth - 1);
			    cal.set(Calendar.YEAR, Dateyear);
			    cal.set(Calendar.DATE, cal.get(Calendar.DATE) - 1);
			    monDay = cal.get(Calendar.DATE);
		    	wedDay = 2;
				thurDay = 3;
				friDay = 4;
				satDay = 5;
				monMonth = Datemonth--;
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
				monMonth = Datemonth--;
				tuesMonth = Datemonth--;
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
			    cal.set(Calendar.MONTH, Datemonth - 1);
			    cal.set(Calendar.YEAR, Dateyear);
			    cal.set(Calendar.DATE, cal.get(Calendar.DATE) - 1);
			    wedDay = cal.get(Calendar.DATE);
			    monDay = wedDay - 2;
			    tuesDay = wedDay - 1;
				friDay = 2;
				satDay = 3;
				monMonth = Datemonth--;
				tuesMonth = Datemonth--;
				wedMonth = Datemonth--;
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
			    cal.set(Calendar.MONTH, Datemonth - 1);
			    cal.set(Calendar.YEAR, Dateyear);
			    cal.set(Calendar.DATE, cal.get(Calendar.DATE) - 1);
			    thurDay = cal.get(Calendar.DATE);
			    monDay = thurDay - 3;
			    tuesDay = thurDay - 2;
			    wedDay = thurDay - 1;
				satDay = 2;
				monMonth = Datemonth--;
				tuesMonth = Datemonth--;
				wedMonth = Datemonth--;
				thurMonth = Datemonth--;
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
			    cal.set(Calendar.MONTH, Datemonth - 1);
			    cal.set(Calendar.YEAR, Dateyear);
			    cal.set(Calendar.DATE, cal.get(Calendar.DATE) - 1);
			    friDay = cal.get(Calendar.DATE);
			    monDay = friDay - 4;
			    tuesDay = friDay - 3;
			    wedDay = friDay - 2;
			    thurDay = friDay - 1;
				monMonth = Datemonth--;
				tuesMonth = Datemonth--;
				wedMonth = Datemonth--;
				thurMonth = Datemonth--;
				friMonth = Datemonth--;
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
		
		// Top of Frame
		JPanel topPanel = new JPanel();
		topPanel.setPreferredSize(new Dimension(800, 50));
		topPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
		JLabel Heading = new JLabel("Applicant Information");
		topPanel.add(Heading, BorderLayout.CENTER);
		
		
		ApplicantFrame.add(topPanel, BorderLayout.NORTH);
		// Bottom of Frame
		JPanel bottomPanel = new JPanel();
		bottomPanel.setPreferredSize(new Dimension(800,750));
		xpanels = new BoxLayout(bottomPanel, BoxLayout.X_AXIS);
		
		JPanel leftInfo = new JPanel();
		leftInfo.setPreferredSize(new Dimension(395, 740));
		leftInfo.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
		JPanel leftsmall = new JPanel();
		leftsmall.setPreferredSize(new Dimension(350, 650));
		yLeft = new BoxLayout(leftsmall, BoxLayout.Y_AXIS);
		leftInfo.add(leftsmall, BorderLayout.CENTER);
		bottomPanel.add(leftInfo);
		
		JPanel[] leftPanels;
		leftPanels = new JPanel[13];
		
		JLabel[] fillIn;
		fillIn = new JLabel[13];
		
		for(int a = 0; a < 13; a++){
			leftPanels[a] = new JPanel();
			leftPanels[a].setPreferredSize(new Dimension(350,40));
			fillIn[a] = new JLabel();
			fillIn[a].setPreferredSize(new Dimension(200,30));
		}
		
		day = weekDay;
		
		
		// Extract data from day text files
		if(day.equals("Monday")){
			DayFileData monday = new DayFileData();
			TimeSlots = monday.Read("Monday_" + monMonth + "_" + monDay);
			applicant = TimeSlots.get(slot).get(index);
		}
		else if(day.equals("Tuesday")){
			DayFileData tuesday = new DayFileData();
			TimeSlots = tuesday.Read("Tuesday_" + tuesMonth + "_" + tuesDay);
			applicant = TimeSlots.get(slot).get(index);
		}
		else if(day.equals("Wednesday")){
			DayFileData Wednesday = new DayFileData();
			TimeSlots = Wednesday.Read("Wednesday_" + wedMonth + "_" + wedDay);
			applicant = TimeSlots.get(slot).get(index);
		}
		else if(day.equals("Thursday")){
			DayFileData Thursday = new DayFileData();
			TimeSlots = Thursday.Read("Thursday_" + thurMonth + "_" + thurDay);
			applicant = TimeSlots.get(slot).get(index);
		}
		else if(day.equals("Friday")){
			DayFileData Friday = new DayFileData();
			TimeSlots = Friday.Read("Friday_" + friMonth + "_" + friDay);
			applicant = TimeSlots.get(slot).get(index);
		}
		else if(day.equals("Saturday")){
			DayFileData Saturday = new DayFileData();
			TimeSlots = Saturday.Read("Saturday_" + satMonth + "_" + satDay);
			applicant = TimeSlots.get(slot).get(index);
		}
		
		JLabel visitDate = new JLabel("Date of Visit:");
		visitDate.setPreferredSize(new Dimension(140,30));
		leftPanels[0].add(visitDate);
		fillIn[0].setText(applicant.get(1) + " " + applicant.get(2) + ", " + applicant.get(3));
		JLabel visitTime = new JLabel("Time of Visit:");
		visitTime.setPreferredSize(new Dimension(140,30));
		leftPanels[1].add(visitTime);
		fillIn[1].setText(applicant.get(4));
		JLabel firstName = new JLabel("First Name:");
		firstName.setPreferredSize(new Dimension(140,30));
		leftPanels[2].add(firstName);
		fillIn[2].setText(applicant.get(0));
		JLabel lastName = new JLabel("Last Name:");
		lastName.setPreferredSize(new Dimension(140,30));
		leftPanels[3].add(lastName);
		fillIn[3].setText(applicant.get(0));
		JLabel homeCountry = new JLabel("Home Country:");
		homeCountry.setPreferredSize(new Dimension(140,30));
		leftPanels[4].add(homeCountry);
		if(applicant.get(6).equals("0.0")){
			country = "United States of America";
		}
		if(applicant.get(6).equals("1.0")){
			country = "Argentina";
		}
		if(applicant.get(6).equals("2.0")){
			country = "Australia";
		}
		if(applicant.get(6).equals("3.0")){
			country = "Austria";
		}
		if(applicant.get(6).equals("4.0")){
			country = "Bermuda";
		}
		if(applicant.get(6).equals("5.0")){
			country = "Bosnia";
		}
		if(applicant.get(6).equals("6.0")){
			country = "Brazil";
		}
		if(applicant.get(6).equals("7.0")){
			country = "Canada";
		}
		if(applicant.get(6).equals("8.0")){
			country = "Chile";
		}
		if(applicant.get(6).equals("9.0")){
			country = "Czech Republic";
		}
		if(applicant.get(6).equals("10.0")){
			country = "England";
		}
		if(applicant.get(6).equals("11.0")){
			country = "France";
		}
		if(applicant.get(6).equals("12.0")){
			country = "Hong Kong";
		}
		if(applicant.get(6).equals("13.0")){
			country = "Hungary";
		}
		if(applicant.get(6).equals("14.0")){
			country = "Indonesia";
		}
		if(applicant.get(6).equals("15.0")){
			country = "Italy";
		}
		if(applicant.get(6).equals("16.0")){
			country = "Jamaica";
		}
		if(applicant.get(6).equals("17.0")){
			country = "Japan";
		}
		if(applicant.get(6).equals("18.0")){
			country = "Malaysia";
		}
		if(applicant.get(6).equals("19.0")){
			country = "Mexico";
		}
		if(applicant.get(6).equals("20.0")){
			country = "Morocco";
		}
		if(applicant.get(6).equals("21.0")){
			country = "Nepal";
		}
		if(applicant.get(6).equals("22.0")){
			country = "Nigeria";
		}
		if(applicant.get(6).equals("23.0")){
			country = "P.R.China";
		}
		if(applicant.get(6).equals("24.0")){
			country = "Philippines";
		}
		if(applicant.get(6).equals("25.0")){
			country = "Poland";
		}
		if(applicant.get(6).equals("26.0")){
			country = "Republic of Kazakhstan";
		}
		if(applicant.get(6).equals("27.0")){
			country = "Republic of Korea";
		}
		if(applicant.get(6).equals("28.0")){
			country = "Russia";
		}
		if(applicant.get(6).equals("29.0")){
			country = "Saudi Arabia";
		}
		if(applicant.get(6).equals("30.0")){
			country = "Switzerland";
		}
		if(applicant.get(6).equals("31.0")){
			country = "Taiwan";
		}
		if(applicant.get(6).equals("32.0")){
			country = "Thailand";
		}
		if(applicant.get(6).equals("33.0")){
			country = "Turkey";
		}
		if(applicant.get(6).equals("34.0")){
			country = "United Arab Emirates";
		}
		if(applicant.get(6).equals("35.0")){
			country = "United Kingdom";
		}
		if(applicant.get(6).equals("36.0")){
			country = "Vietnam";
		}
		fillIn[4].setText(country);
		JLabel currentGrade = new JLabel("Current Grade:");
		currentGrade.setPreferredSize(new Dimension(140,30));
		leftPanels[5].add(currentGrade);
		if(applicant.get(8).equals("9")){
			grade = "8";
		}
		else if(applicant.get(8).equals("10")){
			grade = "9";
		}
		else if(applicant.get(8).equals("11")){
			grade = "10";
		}
		else if(applicant.get(8).equals("12")){
			grade = "11";
		}
		else if(applicant.get(8).equals("PG")){
			grade = "12";
		}
		fillIn[5].setText(grade);
		JLabel EntryYear = new JLabel("Year of Entry:");
		EntryYear.setPreferredSize(new Dimension(140,30));
		leftPanels[6].add(EntryYear);
		fillIn[6].setText(applicant.get(3));
		JLabel studentEmail = new JLabel("Student Email:");
		studentEmail.setPreferredSize(new Dimension(140,30));
		leftPanels[7].add(studentEmail);
		fillIn[7].setText(applicant.get(0) + "@gmail.com");
		JLabel momName = new JLabel("Mother's Name:");
		momName.setPreferredSize(new Dimension(140,30));
		leftPanels[8].add(momName);
		fillIn[8].setText(applicant.get(0) + "mom");
		JLabel momEmail = new JLabel("Mother's Email:");
		momEmail.setPreferredSize(new Dimension(140,30));
		leftPanels[9].add(momEmail);
		fillIn[9].setText(applicant.get(0) + "mom@gmail.com");
		JLabel dadName = new JLabel("Father's Name:");
		dadName.setPreferredSize(new Dimension(140,30));
		leftPanels[10].add(dadName);
		fillIn[10].setText(applicant.get(0) + "dad");
		JLabel dadEmail = new JLabel("Father's Email:");
		dadEmail.setPreferredSize(new Dimension(140,30));
		leftPanels[11].add(dadEmail);
		fillIn[11].setText(applicant.get(0) + "dad@gmail.com");
		JLabel connections = new JLabel("Connections to PEA:");
		connections.setPreferredSize(new Dimension(140,30));
		leftPanels[12].add(connections);
		
		for(int b = 0; b < 13; b++){
			fillIn[b].setHorizontalAlignment(SwingConstants.LEFT);
			leftPanels[b].add(fillIn[b]);
			leftsmall.add(leftPanels[b]);
		}
		
		JPanel rightInfo = new JPanel();
		rightInfo.setPreferredSize(new Dimension(395, 740));
		rightInfo.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 
		JPanel rightsmall = new JPanel();
		rightsmall.setPreferredSize(new Dimension(350, 680));
		yRight = new BoxLayout(rightsmall, BoxLayout.Y_AXIS);
		rightInfo.add(rightsmall, BorderLayout.CENTER);
		bottomPanel.add(rightInfo);
		
		JPanel[] rightPanels;
		rightPanels = new JPanel[15];
		
		JLabel[] rightfillIn;
		rightfillIn = new JLabel[12];
		
		for(int a = 0; a < 12; a++){
			rightPanels[a] = new JPanel();
			rightPanels[a].setPreferredSize(new Dimension(350,40));
			rightfillIn[a] = new JLabel();
			rightfillIn[a].setPreferredSize(new Dimension(170,30));
		}
		rightPanels[12] = new JPanel();
		rightPanels[12].setPreferredSize(new Dimension(350,40));
		rightPanels[13] = new JPanel();
		rightPanels[13].setPreferredSize(new Dimension(350,40));
		rightPanels[14] = new JPanel();
		rightPanels[14].setPreferredSize(new Dimension(350,40));
		
		JLabel gender = new JLabel("Gender:");
		gender.setPreferredSize(new Dimension(170,30));
		rightPanels[0].add(gender);
		if(applicant.get(7).equals("0.0")){
			Gender = "Female";
		}
		else if(applicant.get(7).equals("1.0")){
			Gender = "Male";
		}
		rightfillIn[0].setText(Gender);
		JLabel ApplyingGrade = new JLabel("Grade Applying For:");
		ApplyingGrade.setPreferredSize(new Dimension(170,30));
		rightPanels[1].add(ApplyingGrade);
		if(applicant.get(8).equals("9")){
			applyGrade = "9";
		}
		else if(applicant.get(8).equals("10")){
			applyGrade = "10";
		}
		else if(applicant.get(8).equals("11")){
			applyGrade = "11";
		}
		else if(applicant.get(8).equals("12")){
			applyGrade = "12";
		}
		else if(applicant.get(8).equals("PG")){
			applyGrade = "PG";
		}
		rightfillIn[1].setText(applyGrade);
		JLabel residence = new JLabel("Residence:");
		residence.setPreferredSize(new Dimension(170,30));
		rightPanels[2].add(residence);
		if(applicant.get(15).equals("yes")){
			boarding = "Boarding Student";
		}
		else if(applicant.get(15).equals("yes")){
			boarding = "Boarding Student";
		}
		rightfillIn[2].setText(boarding);
		JLabel academic = new JLabel("Academic Interest:");
		academic.setPreferredSize(new Dimension(170,30));
		rightPanels[3].add(academic);
		if(applicant.get(9).equals("0.0")){
			academicInterest = "Math/Science";
		}
		else if(applicant.get(9).equals("1.0")){
			academicInterest = "Humanities";
		}
		else if(applicant.get(9).equals("2.0")){
			academicInterest = "Languages";
		}
		else if(applicant.get(9).equals("3.0")){
			academicInterest = "Arts";
		}
		else if(applicant.get(9).equals("4.0")){
			academicInterest = "All";
		}
		rightfillIn[3].setText(academicInterest);
		JLabel FallSport = new JLabel("Fall Sport:");
		FallSport.setPreferredSize(new Dimension(170,30));
		rightPanels[4].add(FallSport);
		if(applicant.get(10).equals("0.0")){
			Fall = "";
		}
		else if(applicant.get(10).equals("1.0")){
			Fall = "Cross Country";
		}
		else if(applicant.get(10).equals("2.0")){
			Fall = "Field Hockey";
		}
		else if(applicant.get(10).equals("3.0")){
			Fall = "Football";
		}
		else if(applicant.get(10).equals("4.0")){
			Fall = "Soccer";
		}
		else if(applicant.get(10).equals("5.0")){
			Fall = "Volleyball";
		}
		else if(applicant.get(10).equals("6.0")){
			Fall = "Water Polo";
		}
		
		rightfillIn[4].setText(Fall);
		JLabel WinterSport = new JLabel("Winter Sport:");
		WinterSport.setPreferredSize(new Dimension(170,30));
		rightPanels[5].add(WinterSport);
		if(applicant.get(11).equals("0.0")){
			Winter = "";
		}
		else if(applicant.get(11).equals("1.0")){
			Winter = "Basketball";
		}
		else if(applicant.get(11).equals("2.0")){
			Winter = "Ice Hockey";
		}
		else if(applicant.get(11).equals("3.0")){
			Winter = "Squash";
		}
		else if(applicant.get(11).equals("4.0")){
			Winter = "Swimming & Diving";
		}
		else if(applicant.get(11).equals("5.0")){
			Winter = "Winter Track";
		}
		else if(applicant.get(11).equals("6.0")){
			Winter = "Wrestling";
		}
		
		rightfillIn[5].setText(Winter);
		JLabel SpringSport = new JLabel("Spring Sport:");
		SpringSport.setPreferredSize(new Dimension(170,30));
		rightPanels[6].add(SpringSport);
		if(applicant.get(12).equals("0.0")){
			Spring = "";
		}
		else if(applicant.get(12).equals("1.0")){
			Spring = "Baseball";
		}
		else if(applicant.get(12).equals("2.0")){
			Spring = "Crew";
		}
		else if(applicant.get(12).equals("3.0")){
			Spring = "Cycling";
		}
		else if(applicant.get(12).equals("4.0")){
			Spring = "Golf";
		}
		else if(applicant.get(12).equals("5.0")){
			Spring = "Lacrosse";
		}
		else if(applicant.get(12).equals("6.0")){
			Spring = "Softball";
		}
		else if(applicant.get(12).equals("7.0")){
			Spring = "Tennis";
		}
		else if(applicant.get(12).equals("8.0")){
			Spring = "Track";
		}
		else if(applicant.get(12).equals("9.0")){
			Spring = "Water Polo";
		}
		rightfillIn[6].setText(Spring);
		JLabel Club1 = new JLabel("Club 1:");
		Club1.setPreferredSize(new Dimension(170,30));
		rightPanels[7].add(Club1);
		if(applicant.get(13).equals("0.0")){
			TopClub = "";
		}
		else if(applicant.get(13).equals("1.0")){
			TopClub = "Culture";
		}
		else if(applicant.get(13).equals("2.0")){
			TopClub = "Dance";
		}
		else if(applicant.get(13).equals("3.0")){
			TopClub = "Debate/Public Speaking";
		}
		else if(applicant.get(13).equals("4.0")){
			TopClub = "Language";
		}
		else if(applicant.get(13).equals("5.0")){
			TopClub = "Math/Science";
		}
		else if(applicant.get(13).equals("6.0")){
			TopClub = "Music";
		}
		else if(applicant.get(13).equals("7.0")){
			TopClub = "Newspaper/Yearbook";
		}
		
		rightfillIn[7].setText(TopClub);
		JLabel Club2 = new JLabel("Club 2:");
		Club2.setPreferredSize(new Dimension(170,30));
		rightPanels[8].add(Club2);
		if(applicant.get(14).equals("0.0")){
			BottomClub = "";
		}
		else if(applicant.get(14).equals("1.0")){
			BottomClub = "Culture";
		}
		else if(applicant.get(14).equals("2.0")){
			BottomClub = "Dance";
		}
		else if(applicant.get(14).equals("3.0")){
			BottomClub = "Debate/Public Speaking";
		}
		else if(applicant.get(14).equals("4.0")){
			BottomClub = "Language";
		}
		else if(applicant.get(14).equals("5.0")){
			BottomClub = "Math/Science";
		}
		else if(applicant.get(14).equals("6.0")){
			BottomClub = "Music";
		}
		else if(applicant.get(14).equals("7.0")){
			BottomClub = "Newspaper/Yearbook";
		}
		
		rightfillIn[8].setText(BottomClub);
		JLabel tour = new JLabel("Tour:");
		tour.setPreferredSize(new Dimension(170,30));
		rightPanels[9].add(tour);
		if(applicant.get(16).equals("yes")){
			yesTour = "Yes";
		}
		else if(applicant.get(16).equals("no")){
			yesTour = "No";
		}
		rightfillIn[9].setText(yesTour);
		JLabel tourguide = new JLabel("Tour Guide:");
		tourguide.setPreferredSize(new Dimension(170,30));
		rightPanels[11].add(tourguide);
		if(applicant.get(18).equals("null")){
			
		}
		else{
		rightfillIn[11].setText(applicant.get(18));
		}
		JLabel interview = new JLabel("Interview:");
		interview.setPreferredSize(new Dimension(170,30));
		rightPanels[10].add(interview);
		if(applicant.get(17).equals("yes")){
			yesInterview = "Yes";
		}
		else if(applicant.get(17).equals("no")){
			yesInterview = "No";
		}
		rightfillIn[10].setText(yesInterview);
		emergencyGuide = new JTextField();
		emergencyGuide.setPreferredSize(new Dimension(200, 20));
		rightPanels[12].add(emergencyGuide);
		JButton replace = new JButton("Replace");
		rightPanels[13].add(replace);
		JButton guideList = new JButton("Guide List");
		rightPanels[14].add(guideList);
		
		class GuideListBtnListener implements ActionListener{
			public void actionPerformed(ActionEvent e){
				GuideReplacement guidereplace = new GuideReplacement();
				guidereplace.construct(applicant.get(0));
			}
		}
		GuideListBtnListener listen = new GuideListBtnListener();
		guideList.addActionListener(listen);
		
		class ReplaceBtnListener implements ActionListener{
			public void actionPerformed(ActionEvent e){

				Calendar newCal = Calendar.getInstance();

				String newName = emergencyGuide.getText();

				if(applicant.get(1).equals("January")){
					newCal.set(Calendar.MONTH, 0);
				}
				else if(applicant.get(1).equals("February")){
					newCal.set(Calendar.MONTH, 1);
				}
				else if(applicant.get(1).equals("March")){
					newCal.set(Calendar.MONTH, 2);
				}
				else if(applicant.get(1).equals("April")){
					newCal.set(Calendar.MONTH, 3);
				}
				else if(applicant.get(1).equals("May")){
					newCal.set(Calendar.MONTH, 4);
				}
				else if(applicant.get(1).equals("June")){
					newCal.set(Calendar.MONTH, 5);
				}
				else if(applicant.get(1).equals("July")){
					newCal.set(Calendar.MONTH, 6);
				}
				else if(applicant.get(1).equals("August")){
					newCal.set(Calendar.MONTH, 7);
				}
				else if(applicant.get(1).equals("September")){
					newCal.set(Calendar.MONTH, 8);
				}
				else if(applicant.get(1).equals("October")){
					newCal.set(Calendar.MONTH, 9);
				}
				else if(applicant.get(1).equals("November")){
					newCal.set(Calendar.MONTH, 10);
				}
				else if(applicant.get(1).equals("December")){
					newCal.set(Calendar.MONTH, 11);
				}

				newCal.set(Calendar.DATE, Integer.parseInt(applicant.get(2)));
				newCal.set(Calendar.YEAR, Integer.parseInt(applicant.get(3)));

				if(newCal.get(Calendar.DAY_OF_WEEK) == 2){
					try{
						MondayPW = new PrintWriter(new BufferedWriter(new FileWriter("MondayTemp.txt",true)));
						file = new Scanner(new FileReader("Monday" + "_" + newCal.get(Calendar.MONTH) + "_" + newCal.get(Calendar.DATE) + ".txt"));
						while(file.hasNextLine()){
							String line = file.nextLine();
							int nameLength = applicant.get(0).length();
							int guideLength = applicant.get(18).length();
							if(line.substring(0, nameLength).equals(applicant.get(0))){
								for(int c = 9; c < line.length(); c++){
									for(int u = line.length() - 1; u >= 0; u--){
										if(line.charAt(u) == ' '){
											line = line.substring(0, line.length() - (guideLength)) + emergencyGuide.getText();
											break;
										}
									}
									MondayPW.println(line);
									break;
								}
							}
							else{
								MondayPW.println(line);
							}
						}
						MondayPW.close();
						File mondaytxt = new File("Monday" + "_" + newCal.get(Calendar.MONTH) + "_" + newCal.get(Calendar.DATE) + ".txt");
						mondaytxt.delete();
						File mondaytemptxt = new File("MondayTemp.txt");
						mondaytemptxt.renameTo(mondaytxt);
					}
					catch (IOException u) {

					}
				}
				if(newCal.get(Calendar.DAY_OF_WEEK) == 3){
					try{
						TuesdayPW = new PrintWriter(new BufferedWriter(new FileWriter("TuesdayTemp.txt",true)));
						file = new Scanner(new FileReader("Tuesday" + "_" + newCal.get(Calendar.MONTH) + "_" + newCal.get(Calendar.DATE) + ".txt"));
						while(file.hasNextLine()){
							String line = file.nextLine();
							int nameLength = applicant.get(0).length();
							int guideLength = applicant.get(18).length();
							if(line.substring(0, nameLength).equals(applicant.get(0))){
								for(int c = 9; c < line.length(); c++){
									for(int u = line.length() - 1; u >= 0; u--){
										if(line.charAt(u) == ' '){
											line = line.substring(0, line.length() - (guideLength)) + emergencyGuide.getText();
											break;
										}
									}
									TuesdayPW.println(line);
									break;
								}
							}
							else{
								TuesdayPW.println(line);
							}
						}
						TuesdayPW.close();
						File tuesdaytxt = new File("Tuesday" + "_" + newCal.get(Calendar.MONTH) + "_" + newCal.get(Calendar.DATE) + ".txt");
						tuesdaytxt.delete();
						File tuesdaytemptxt = new File("TuesdayTemp.txt");
						tuesdaytemptxt.renameTo(tuesdaytxt);
					}
					catch (IOException u) {

					}
				}
				if(newCal.get(Calendar.DAY_OF_WEEK) == 4){
					try{
						WednesdayPW = new PrintWriter(new BufferedWriter(new FileWriter("WednesdayTemp.txt",true)));
						file = new Scanner(new FileReader("Wednesday" + "_" + newCal.get(Calendar.MONTH) + "_" + newCal.get(Calendar.DATE) + ".txt"));
						while(file.hasNextLine()){
							String line = file.nextLine();
							int nameLength = applicant.get(0).length();
							int guideLength = applicant.get(18).length();
							if(line.substring(0, nameLength).equals(applicant.get(0))){
								for(int c = 9; c < line.length(); c++){
									for(int u = line.length() - 1; u >= 0; u--){
										if(line.charAt(u) == ' '){
											line = line.substring(0, line.length() - (guideLength)) + emergencyGuide.getText();
											break;
										}
									}
									WednesdayPW.println(line);
									break;
								}
							}
							else{
								WednesdayPW.println(line);
							}
						}
						WednesdayPW.close();
						File wednesdaytxt = new File("Wednesday" + "_" + newCal.get(Calendar.MONTH) + "_" + newCal.get(Calendar.DATE) + ".txt");
						wednesdaytxt.delete();
						File wednesdaytemptxt = new File("WednesdayTemp.txt");
						wednesdaytemptxt.renameTo(wednesdaytxt);
					}
					catch (IOException u) {

					}
				}
				if(newCal.get(Calendar.DAY_OF_WEEK) == 5){
					try{
						ThursdayPW = new PrintWriter(new BufferedWriter(new FileWriter("ThursdayTemp.txt",true)));
						file = new Scanner(new FileReader("Thursday" + "_" + newCal.get(Calendar.MONTH) + "_" + newCal.get(Calendar.DATE) + ".txt"));
						while(file.hasNextLine()){
							String line = file.nextLine();
							int nameLength = applicant.get(0).length();
							int guideLength = applicant.get(18).length();
							if(line.substring(0, nameLength).equals(applicant.get(0))){
								for(int c = 9; c < line.length(); c++){
									for(int u = line.length() - 1; u >= 0; u--){
										if(line.charAt(u) == ' '){
											line = line.substring(0, line.length() - (guideLength)) + emergencyGuide.getText();
											break;
										}
									}
									ThursdayPW.println(line);
									break;
								}
							}
							else{
								ThursdayPW.println(line);
							}
						}
						ThursdayPW.close();
						File thursdaytxt = new File("Thursday" + "_" + newCal.get(Calendar.MONTH) + "_" + newCal.get(Calendar.DATE) + ".txt");
						thursdaytxt.delete();
						File thursdaytemptxt = new File("ThursdayTemp.txt");
						thursdaytemptxt.renameTo(thursdaytxt);
					}
					catch (IOException u) {

					}
				}
				if(newCal.get(Calendar.DAY_OF_WEEK) == 6){
					try{
						FridayPW = new PrintWriter(new BufferedWriter(new FileWriter("FridayTemp.txt",true)));
						file = new Scanner(new FileReader("Friday" + "_" + newCal.get(Calendar.MONTH) + "_" + newCal.get(Calendar.DATE) + ".txt"));
						while(file.hasNextLine()){
							String line = file.nextLine();
							int nameLength = applicant.get(0).length();
							int guideLength = applicant.get(18).length();
							if(line.substring(0, nameLength).equals(applicant.get(0))){
								for(int c = 9; c < line.length(); c++){
									for(int u = line.length() - 1; u >= 0; u--){
										if(line.charAt(u) == ' '){
											line = line.substring(0, line.length() - (guideLength)) + emergencyGuide.getText();
											break;
										}
									}
									FridayPW.println(line);
									break;
								}
							}
							else{
								FridayPW.println(line);
							}
						}
						FridayPW.close();
						File fridaytxt = new File("Friday" + "_" + newCal.get(Calendar.MONTH) + "_" + newCal.get(Calendar.DATE) + ".txt");
						fridaytxt.delete();
						File fridaytemptxt = new File("FridayTemp.txt");
						fridaytemptxt.renameTo(fridaytxt);
					}
					catch (IOException u) {

					}
				}
				if(newCal.get(Calendar.DAY_OF_WEEK) == 7){
					try{
						SaturdayPW = new PrintWriter(new BufferedWriter(new FileWriter("SaturdayTemp.txt",true)));
						file = new Scanner(new FileReader("Saturday" + "_" + newCal.get(Calendar.MONTH) + "_" + newCal.get(Calendar.DATE) + ".txt"));
						while(file.hasNextLine()){
							String line = file.nextLine();
							int nameLength = applicant.get(0).length();
							int guideLength = applicant.get(18).length();
							if(line.substring(0, nameLength).equals(applicant.get(0))){
								for(int c = 9; c < line.length(); c++){
									for(int u = line.length() - 1; u >= 0; u--){
										if(line.charAt(u) == ' '){
											line = line.substring(0, line.length() - (guideLength)) + emergencyGuide.getText();
											break;
										}
									}
									SaturdayPW.println(line);
									break;
								}
							}
							else{
								SaturdayPW.println(line);
							}
						}
						SaturdayPW.close();
						File saturdaytxt = new File("Saturday" + "_" + newCal.get(Calendar.MONTH) + "_" + newCal.get(Calendar.DATE) + ".txt");
						saturdaytxt.delete();
						File saturdaytemptxt = new File("SaturdayTemp.txt");
						saturdaytemptxt.renameTo(saturdaytxt);
					}
					catch (IOException u) {

					}
				}
				
				ApplicantFrame.setVisible(false);
				ApplicantFrame.dispose();
				ApplicantData appFrame = new ApplicantData();
				appFrame.construct(weekDay1, slot1, index1, dayOfYear1);
			}
		}
		
		ReplaceBtnListener rep = new ReplaceBtnListener();
		replace.addActionListener(rep);
		
		for(int b = 0; b < 12; b++){
			rightfillIn[b].setHorizontalAlignment(SwingConstants.LEFT);
			rightPanels[b].add(rightfillIn[b]);
			rightsmall.add(rightPanels[b]);
		}
		rightsmall.add(rightPanels[12]);
		rightsmall.add(rightPanels[13]);
		rightsmall.add(rightPanels[14]);
		
		ApplicantFrame.add(bottomPanel, BorderLayout.SOUTH);
		
		ApplicantFrame.setSize(800,800);
		ApplicantFrame.setResizable(false);
		ApplicantFrame.setVisible(true);
	}
}
