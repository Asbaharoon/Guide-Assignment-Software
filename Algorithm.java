import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;


public class Algorithm {

	private ArrayList<String> parameters;
	private ArrayList<ArrayList<ArrayList<String>>> monday;
	private ArrayList<ArrayList<ArrayList<String>>> tuesday;
	private ArrayList<ArrayList<ArrayList<String>>> wednesday;
	private ArrayList<ArrayList<ArrayList<String>>> thursday;
	private ArrayList<ArrayList<ArrayList<String>>> friday;
	private ArrayList<ArrayList<ArrayList<String>>> saturday;
	private ArrayList<ArrayList<ArrayList<String>>> guides;
	private ArrayList<ArrayList<String>> allVisitors;
	private ArrayList<ArrayList<String>> allGuides;
	private GuideObject[] dummies;
	private VisitorObject[] visitors; 
	private int weekVisitors;
	private int numGuides;
	private int multiplier;
	private String mult;
	private int intMultiplier;
	private int difference;
	private boolean week1;
	private boolean week2;
	private int[] scoreTally;
	private ArrayList<GuideObject> completeGuideList;
	private Scanner file;
	private FileWriter writer;
	private PrintWriter MondayPW;
	private PrintWriter TuesdayPW;
	private PrintWriter WednesdayPW;
	private PrintWriter ThursdayPW;
	private PrintWriter FridayPW;
	private PrintWriter SaturdayPW;
	private int Dateyear;
	private int Datemonth;
	private int Dateday;

	/*
	Matching tour guides and applicants might seem like a very straight forward process.
	Why not just create a graph in which tour guides and applicants are represented as nodes?
	Each applicant could be connected to each tour guide using edges that store weights
	whose values depend on the number of characteristics tour guides and applicants have in common.
	Then, through an iterative process, each visitor could be assigned his/her top weighted guide.
	Unfortunately, proceeding applicant by applicant does not guarantee a superior solution.
	Scenarios in which multiple applicants rank a specific tour guide as their top ranked guide, must be considered.
	In these scenarios it is impossible for all applicants to be matched to their top ranked guide.
	I turned to the Gale-Shapley algorithm for help. 
	In step one, the weights establish a vector of preferred guides for each applicant. 
	In step two, the weights establish a vector of preferred applicants for each guide. 
	Next, in an iterative process, an attempt is made to assign each applicant his/her preferred guide. 
	When a conflict arises, guide preferences, which provide perspective across applicants, are used to break ties. 
	The algorithm terminates with stable guide assignments - for any paired guide G and applicant A, 
	there does not exist an alternative pairing in which both G and A are individually better off than in the current pairing.  
	In the best and worst cases, the Gayle-Shapley algorithm finds a solution for the Stable Matching Problem in O(n2) time.
	This is the case because no matter the scenario, creating the vectors of preferred guides for each visitor
	and the vectors of preferred applicants for each guide requires the program to navigate through nested for loops bounded
	by the number of applicants and guides. This is an O(n^2) process.
	 */
	public void Algorithm(int date, int mois, int annee){

		// Retrieving user set weights for matching criteria
		ParameterFileData parameterfiledata = new ParameterFileData();
		parameters = parameterfiledata.Read();

		// Getting Date so that correct Visitor data is retrieved
		Dateyear = annee;
		Datemonth = mois;
		Dateday = date;

		// Retrieving data from text files that contain information 
		// regarding applicants visiting over the course of the week of the input date
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

		// Given the date input in the Algorithm method's parameters, 
		// this sequence of if statements establishes the dates of the other days in the specified week
		// This will allow us to access the text files, that are named according to the dates of the days they are representing.
		if(monCheck.exists() == true){
			monDay = Dateday;
			monMonth = Datemonth;
			cal.set(Calendar.DATE, 1);
			cal.set(Calendar.MONTH, Datemonth + 1);
			cal.set(Calendar.YEAR, Dateyear);
			cal.set(Calendar.DATE, cal.get(Calendar.DATE) - 1);
			int monthDays = cal.get(Calendar.DATE);
			// Taking into account the possibility that not all days in a week are in the same month
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
			cal.set(Calendar.MONTH, Datemonth);
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

		// Retrieving applicant information from the specified text files in which their information is stored.
		// DayFileData.Read() sorts the applicants into the various time slots in which they will be touring the school.
		// This method also adds applicant data to an ArrayList<String>
		DayFileData mondayFile = new DayFileData();
		monday = mondayFile.Read("Monday" + "_" + monMonth + "_" + monDay);
		DayFileData tuesdayFile = new DayFileData();
		tuesday = tuesdayFile.Read("Tuesday" + "_" + tuesMonth + "_" + tuesDay);
		DayFileData wednesdayFile = new DayFileData();
		wednesday = wednesdayFile.Read("Wednesday" + "_" + wedMonth + "_" + wedDay);
		DayFileData thursdayFile = new DayFileData();
		thursday = thursdayFile.Read("Thursday" + "_" + thurMonth + "_" + thurDay);
		DayFileData fridayFile = new DayFileData();
		friday = fridayFile.Read("Friday" + "_" + friMonth + "_" + friDay);
		DayFileData saturdayFile = new DayFileData();
		saturday = saturdayFile.Read("Saturday" + "_" + satMonth + "_" + satDay);

		// Contains all the applicants touring the school in a given week.
		allVisitors = new ArrayList<ArrayList<String>>();

		// Checking to see whether or not an applicant is touring the school and needs a tour guide or is just interviewing
		for(int k = 0; k < monday.size(); k++){
			for(int l = 0; l < monday.get(k).size(); l++){
				if(monday.get(k).get(l).get(16).equals("no")){
				}
				else{
					allVisitors.add(monday.get(k).get(l));
				}
			}
		}
		for(int k = 0; k < tuesday.size(); k++){
			for(int l = 0; l < tuesday.get(k).size(); l++){
				if(tuesday.get(k).get(l).get(16).equals("no")){
				}
				else{
					allVisitors.add(tuesday.get(k).get(l));
				}
			}
		}
		for(int k = 0; k < wednesday.size(); k++){
			for(int l = 0; l < wednesday.get(k).size(); l++){
				if(wednesday.get(k).get(l).get(16).equals("no")){
				}
				else{
					allVisitors.add(wednesday.get(k).get(l));
				}
			}
		}
		for(int k = 0; k < thursday.size(); k++){
			for(int l = 0; l < thursday.get(k).size(); l++){
				if(thursday.get(k).get(l).get(16).equals("no")){
				}
				else{
					allVisitors.add(thursday.get(k).get(l));
				}
			}
		}
		for(int k = 0; k < friday.size(); k++){
			for(int l = 0; l < friday.get(k).size(); l++){
				if(friday.get(k).get(l).get(16).equals("no")){
				}
				else{
					allVisitors.add(friday.get(k).get(l));
				}
			}
		}
		for(int k = 0; k < saturday.size(); k++){
			for(int l = 0; l < saturday.get(k).size(); l++){
				if(saturday.get(k).get(l).get(16).equals("no")){
				}
				else{
					allVisitors.add(saturday.get(k).get(l));
				}
			}
		}

		// Instead of having to access Applicant data through the ArrayList<ArrayList<String>> "allVisitors",
		// applicants are turned into VisitorObjects and are stored in VisitorObject[] "visitors". 
		// This makes accessing applicants much easier.
		visitors = new VisitorObject[allVisitors.size()];
		for(int l = 0; l < allVisitors.size(); l++){
			VisitorObject applicant = new VisitorObject();
			applicant.setVisitor(allVisitors.get(l));
			applicant.setName(allVisitors.get(l).get(0));
			visitors[l] = applicant;
		}

		// Extracting Guide Data from text files as was done for visitors
		GuideFileData guideData = new GuideFileData();
		guides = guideData.Read();
		numGuides = 0;

		for(int b = 0; b < 4; b++){
			numGuides += guides.get(b).size();
		}

		// Checking to see how many tours guides will have to give each week -> Guides might have to give more 
		// than one tour per week, which would mean we would have to duplicate guides
		multiplier = allVisitors.size() / numGuides;
		multiplier ++;

		// allGuides contains all tour guides and their copies
		allGuides = new ArrayList<ArrayList<String>>();

		for(int c = 0; c < multiplier; c++){
			for(int e = 0; e < 4; e++){
				for(int d = 0; d < guides.get(e).size(); d++){
					allGuides.add(guides.get(e).get(d));
				}
			}
		}

		// As with the applicants, the tour guides are turned into GuideObjects and are stored in an array of GuideObjects: "dummies"
		dummies = new GuideObject[numGuides * multiplier];

		int counter = 0;
		int d = 0;
		while(counter < multiplier){
			if(d == (numGuides * multiplier)){
				break;
			}
			else{
				counter = (int)d/numGuides;
				GuideObject guide = new GuideObject();
				guide.setGuide(allGuides.get(d));
				guide.setName(allGuides.get(d).get(0) + "(" + (counter+1) + ")");
				dummies[d] = guide;
				d++;
			}
		}

		// setting scores describing the quality the matches between tour guides and applicants, based on user set parameter weights.
		// Given 'a' applicants and 'g' guides + copies, scores are stored in a matrix that has dimension (a+1) by (g+1)
		// The first column of the matrix holds the index of each of the tour guides within "dummies".
		// The first row of the matrix holds the index of each of the applicants within "visitors"

		// Initializing ArrayListMatrix
		ArrayListMatrix tabulate = new ArrayListMatrix(dummies.length + 1, visitors.length + 1);
		tabulate.Initialize();
		for(int a = 1; a <= dummies.length; a++){
			tabulate.setElement(a, 0, a - 1);
		}

		for(int b = 1; b <= visitors.length; b++){
			tabulate.setElement(0, b, b - 1);
		}

		// Populating the matrix with the scores used to determine the quality of a match
		// Parsing weights for each field from the text file that holds user set parameters
		for(int q = 0; q < visitors.length; q++){
			for(int r = 0; r < dummies.length; r++){
				if(dummies[r].getGuide().get(3).equals(visitors[q].getVisitor().get(7))){
					tabulate.setElement(r + 1, q + 1, (Integer)tabulate.getElement(r + 1, q + 1) + Integer.parseInt(parameters.get(0)));
				}
				if(dummies[r].getGuide().get(4).equals(visitors[q].getVisitor().get(8))){
					tabulate.setElement(r + 1, q + 1, (Integer)tabulate.getElement(r + 1, q + 1) + Integer.parseInt(parameters.get(1)));
				}
				if(dummies[r].getGuide().get(11).equals(visitors[q].getVisitor().get(15))){
					tabulate.setElement(r + 1, q + 1, (Integer)tabulate.getElement(r + 1, q + 1) + Integer.parseInt(parameters.get(2)));
				}
				if(dummies[r].getGuide().get(5).equals(visitors[q].getVisitor().get(9))){
					tabulate.setElement(r + 1, q + 1, (Integer)tabulate.getElement(r + 1, q + 1) + Integer.parseInt(parameters.get(3)));
				}
				if(dummies[r].getGuide().get(6).equals(visitors[q].getVisitor().get(10)) && dummies[r].getGuide().get(6).charAt(0) != '0'){
					tabulate.setElement(r + 1, q + 1, (Integer)tabulate.getElement(r + 1, q + 1) + Integer.parseInt(parameters.get(4)));
				}
				if(dummies[r].getGuide().get(7).equals(visitors[q].getVisitor().get(11)) && dummies[r].getGuide().get(7).charAt(0) != '0'){
					tabulate.setElement(r + 1, q + 1, (Integer)tabulate.getElement(r + 1, q + 1) + Integer.parseInt(parameters.get(5)));
				}
				if(dummies[r].getGuide().get(8).equals(visitors[q].getVisitor().get(12)) && dummies[r].getGuide().get(8).charAt(0) != '0'){
					tabulate.setElement(r + 1, q + 1, (Integer)tabulate.getElement(r + 1, q + 1) + Integer.parseInt(parameters.get(6)));
				}
				if((dummies[r].getGuide().get(9).equals(visitors[q].getVisitor().get(13)) && dummies[r].getGuide().get(9).charAt(0) != '0') || (visitors[q].getVisitor().get(13).equals(dummies[r].getGuide().get(10)) && dummies[r].getGuide().get(10).charAt(0) != '0')){
					tabulate.setElement(r + 1, q + 1, (Integer)tabulate.getElement(r + 1, q + 1) + Integer.parseInt(parameters.get(7)));
				}
				if((dummies[r].getGuide().get(10).equals(visitors[q].getVisitor().get(14)) && dummies[r].getGuide().get(10).charAt(0) != '0') || (visitors[q].getVisitor().get(14).equals(dummies[r].getGuide().get(9))) && dummies[r].getGuide().get(9).charAt(0) != '0'){
					tabulate.setElement(r + 1, q + 1, (Integer)tabulate.getElement(r + 1, q + 1) + Integer.parseInt(parameters.get(8)));
				}
				boolean match = false;
				// If a tour guide is not available when an applicant visits, the edge connecting the two = 0
				if(dummies[r].getName().substring(0,4).equals("Prep")){
					if(visitors[q].getVisitor().get(5).length() > 1){
						tabulate.setElement(r + 1, q + 1, (Integer)tabulate.getElement(r + 1, q + 1) + 1);
					}
					else{
						for(int g = 8; g < dummies[r].getGuide().get(1).length(); g++){
							if(dummies[r].getGuide().get(1).charAt(g) == visitors[q].getVisitor().get(5).charAt(0)){
								tabulate.setElement(r + 1, q + 1, (Integer)tabulate.getElement(r + 1, q + 1) + 1);
								match = true;
							}
						}
						if(match == false){
							tabulate.setElement(r + 1, q + 1, 0);
						}
					}
				}
				else{
					if(visitors[q].getVisitor().get(5).length() > 1){
						tabulate.setElement(r + 1, q + 1, (Integer)tabulate.getElement(r + 1, q + 1) + 1);
					}
					else{
						for(int g = 0; g < dummies[r].getGuide().get(1).length(); g++){
							if(dummies[r].getGuide().get(1).charAt(g) == visitors[q].getVisitor().get(5).charAt(0)){
								tabulate.setElement(r + 1, q + 1, (Integer)tabulate.getElement(r + 1, q + 1) + 1);
								match = true;
							}
						}
						if(match == false){
							tabulate.setElement(r + 1, q + 1, 0);
						}
					}
				}
			}
		}

		// In the scenario in which there are more tour guides than applicants, 
		// guides must be eliminated so that we can match an equal number of guides and applicants
		// To determine which guides should be eliminated, we create a matrix called "removeGuides" 
		// which contains the index of each guide and a score which is determined by how desirable the guide is.
		// For a given applicant (for a given column in "tabulate"), 
		// the guide that receives the highest score has 5 added to their score in 'removeGuides'.
		// The second place guide has 4 added to their score in 'removeGuides", and so on.
		// Once every column in "tabluate" has been visited, the guide scores in "removeGuides" are finalized.
		// These scores are added to a minHeap. We keep on removing scores from the minHeap
		// and eliminating the corresponding guides from "tabulate" until there are an equal number of guides and applicants.
		ArrayListMatrix removeGuides = new ArrayListMatrix(numGuides, 2);
		removeGuides.Initialize();
		for(int a = dummies.length - numGuides; a < dummies.length; a++){
			removeGuides.setElement(a - (dummies.length - numGuides), 0, a);
		}

		// Assign guides scores based on their rankings for individual visitors
		for(int c = 1; c <= visitors.length; c++){
			// 'rankings' is a 5by2 matrix that tracks which guides have the greatest scores for a given applicant. It is sorted
			ArrayMatrix rankings = new ArrayMatrix(5,2);
			rankings.Initialize();
			for(int e = dummies.length - numGuides + 1; e <= dummies.length; e++){
				if((Integer)tabulate.getElement(e, c) > (Integer)rankings.getElement(0, 1)){
					int scoreTemp = (Integer)rankings.getElement(0, 1);
					int indexTemp = (Integer)rankings.getElement(0, 0);
					rankings.setElement(0, 1, (Integer)tabulate.getElement(e, c));
					rankings.setElement(0, 0, e - 1);
					int scoreTemp2 = (Integer)rankings.getElement(1, 1);
					int indexTemp2 = (Integer)rankings.getElement(1, 0);
					rankings.setElement(1, 1, scoreTemp);
					rankings.setElement(1, 0, indexTemp);
					scoreTemp = (Integer)rankings.getElement(2, 1);
					indexTemp = (Integer)rankings.getElement(2, 0);
					rankings.setElement(2, 1, scoreTemp2);
					rankings.setElement(2, 0, indexTemp2);
					scoreTemp2 = (Integer)rankings.getElement(3, 1);
					indexTemp2 = (Integer)rankings.getElement(3, 0);
					rankings.setElement(3, 1, scoreTemp);
					rankings.setElement(3, 0, indexTemp);
					rankings.setElement(4, 1, scoreTemp2);
					rankings.setElement(4, 0, indexTemp2);
				}
				else if((Integer)tabulate.getElement(e, c) > (Integer)rankings.getElement(1, 1)){
					int scoreTemp = (Integer)rankings.getElement(1, 1);
					int indexTemp = (Integer)rankings.getElement(1, 0);
					rankings.setElement(1, 1, (Integer)tabulate.getElement(e, c));
					rankings.setElement(1, 0, e - 1);
					int scoreTemp2 = (Integer)rankings.getElement(2, 1);
					int indexTemp2 = (Integer)rankings.getElement(2, 0);
					rankings.setElement(2, 1, scoreTemp);
					rankings.setElement(2, 0, indexTemp);
					scoreTemp = (Integer)rankings.getElement(3, 1);
					indexTemp = (Integer)rankings.getElement(3, 0);
					rankings.setElement(3, 1, scoreTemp2);
					rankings.setElement(3, 0, indexTemp2);
					rankings.setElement(4, 1, scoreTemp);
					rankings.setElement(4, 0, indexTemp);
				}
				else if((Integer)tabulate.getElement(e, c) > (Integer)rankings.getElement(2, 1)){
					int scoreTemp = (Integer)rankings.getElement(2, 1);
					int indexTemp = (Integer)rankings.getElement(2, 0);
					rankings.setElement(2, 1, (Integer)tabulate.getElement(e, c));
					rankings.setElement(2, 0, e - 1);
					int scoreTemp2 = (Integer)rankings.getElement(3, 1);
					int indexTemp2 = (Integer)rankings.getElement(3, 0);
					rankings.setElement(3, 1, scoreTemp);
					rankings.setElement(3, 0, indexTemp);
					rankings.setElement(4, 1, scoreTemp2);
					rankings.setElement(4, 0, indexTemp2);
				}
				else if((Integer)tabulate.getElement(e, c) > (Integer)rankings.getElement(3, 1)){
					int scoreTemp = (Integer)rankings.getElement(3, 1);
					int indexTemp = (Integer)rankings.getElement(3, 0);
					rankings.setElement(3, 1, (Integer)tabulate.getElement(e, c));
					rankings.setElement(3, 0, e - 1);
					rankings.setElement(4, 1, scoreTemp);
					rankings.setElement(4, 0, indexTemp);
				}
				else if((Integer)tabulate.getElement(e, c) > (Integer)rankings.getElement(4, 1)){
					rankings.setElement(4, 1, (Integer)tabulate.getElement(e, c));
					rankings.setElement(4, 0, e - 1);
				}
				// 5, 4, 3, 2, and 1 are added to a guide's score in 'removeGuides' if it is among the top five finishers in a column of 'tabulate'
				if((Integer)rankings.getElement(0, 0) > 0){
					removeGuides.setElement((Integer)removeGuides.getRow(0,(Integer)rankings.getElement(0, 0)), 1, (Integer)removeGuides.getElement(removeGuides.getRow(0, rankings.getElement(0, 0)), 1) + 5);
				}
				if((Integer)rankings.getElement(1, 0) > 0){
					removeGuides.setElement((Integer)removeGuides.getRow(0,(Integer)rankings.getElement(1, 0)), 1, (Integer)removeGuides.getElement(removeGuides.getRow(0, rankings.getElement(1, 0)), 1) + 4);
				}
				if((Integer)rankings.getElement(2, 0) > 0){
					removeGuides.setElement((Integer)removeGuides.getRow(0,(Integer)rankings.getElement(2, 0)), 1, (Integer)removeGuides.getElement(removeGuides.getRow(0, rankings.getElement(2, 0)), 1) + 3);
				}
				if((Integer)rankings.getElement(3, 0) > 0){
					removeGuides.setElement((Integer)removeGuides.getRow(0,(Integer)rankings.getElement(3, 0)), 1, (Integer)removeGuides.getElement(removeGuides.getRow(0, rankings.getElement(3, 0)), 1) + 2);
				}
				if((Integer)rankings.getElement(4, 0) > 0){
					removeGuides.setElement((Integer)removeGuides.getRow(0,(Integer)rankings.getElement(4, 0)), 1, (Integer)removeGuides.getElement(removeGuides.getRow(0, rankings.getElement(4, 0)), 1) + 1);
				}
				for(int i = 0; i < removeGuides.numGuides(); i++){
					removeGuides.printRow(i);
				}
			}

			// Build MinHeap using scores in 'removeGuides' 
			Integer[] sortRank = new Integer[removeGuides.numGuides()];

			for(int q = 0; q < removeGuides.numGuides(); q++){
				sortRank[q] = (Integer)removeGuides.getElement(q, 1);
			}

			MinHeap<Integer> removeHeap = new MinHeap(sortRank, removeGuides.numGuides(), numGuides);

			for(int t = 0; t < dummies.length - visitors.length; t++){
				int min = removeHeap.removemin();
				int extraGuide = (Integer)removeGuides.find(1, 0, min);
				for(int v = 0; v < removeGuides.numGuides(); v++){
					if(removeGuides.getElement(v, 0).equals(extraGuide)){
						removeGuides.removeGuide(v);
					}
				}
				for(int u = 1; u <= tabulate.numGuides(); u++){
					if(tabulate.getElement(u, 0).equals(extraGuide)){
						tabulate.removeGuide(u);
						break;
					}
				}
			}

			// Using MaxHeaps and the heap-sort to create a sorted ArrayList of preferred guides for each visitor.
			// These sorted ArrayLists of preferred guides are stored in the VisitorObjects
			for(int e = 1; e < tabulate.numApplicants(); e++){
				ArrayListMatrix storeNameScore = new ArrayListMatrix(tabulate.numGuides() - 1, 2);
				storeNameScore.Initialize();
				Integer[] sortGuideScore = new Integer[tabulate.numGuides() - 1];
				ArrayList<Integer> GuideOrder = new ArrayList<Integer>();
				for(int f = 1; f < tabulate.numGuides(); f++){
					storeNameScore.setElement(f - 1, 0, tabulate.getElement(f, 0));
					storeNameScore.setElement(f - 1, 1, tabulate.getElement(f, e));
					sortGuideScore[f-1] = (Integer)tabulate.getElement(f, e); 
				}
				MaxHeap<Integer> HeapGuides = new MaxHeap(sortGuideScore, sortGuideScore.length, sortGuideScore.length);
				for(int g = 0; g < tabulate.numGuides() - 1; g++){
					int currScore = HeapGuides.removemax();
					int currGuide = (Integer)storeNameScore.find(1, 0, currScore);
					storeNameScore.removeGuide(storeNameScore.getRow(0, currGuide));
					GuideOrder.add(currGuide);
				}
				visitors[e-1].setGuideOrder(GuideOrder);
			}


			// Creating ArrayLists of preferred applicants for guides using MaxHeaps and heap-sort
			for(int f = 1; f < tabulate.numGuides(); f++){
				ArrayListMatrix GuideMatrix = new ArrayListMatrix(tabulate.numApplicants() - 1, 2);
				GuideMatrix.Initialize();
				Integer[] sortAppScore = new Integer[tabulate.numApplicants() - 1];
				ArrayList<Integer> AppOrder = new ArrayList<Integer>();
				for(int g = 1; g < tabulate.numApplicants(); g++){
					GuideMatrix.setElement(g - 1, 0, tabulate.getElement(0, g));
					GuideMatrix.setElement(g - 1, 1, tabulate.getElement(f, g));
					sortAppScore[g-1] = (Integer)tabulate.getElement(f, g); 
				}
				MaxHeap<Integer> HeapApps = new MaxHeap(sortAppScore, sortAppScore.length, sortAppScore.length);
				for(int h = 0; h < tabulate.numApplicants() - 1; h++){
					int currScore = HeapApps.removemax();
					int currGuide = (Integer)GuideMatrix.find(1, 0, currScore);
					GuideMatrix.removeGuide(GuideMatrix.getRow(0, currGuide));
					AppOrder.add(currGuide);
				}
				dummies[(Integer)tabulate.getElement(f, 0)].setVisitorOrder(AppOrder);
			}

			// MATCHING GUIDES AND VISITORS!

			// Cycling through each visitor, trying to assign them their preferred guide
			for(int a = 0; a < visitors.length; a++){
				int loopCount = 0; 
				boolean change = true;
				int temp = 0;
				int temporaryVisitor = 0;
				int listcounter = 0;
				int guide = 0;
				int replace = 0;
				while(change == true){
					// If a visitor hasn't had a guide assigned to it yet, 'guide' = the first guide in visitor[a]'s guideOrder
					if(loopCount == 0){
						// guide = current index in visitor's guide order
						guide = visitors[a].getGuideOrder().get(visitors[a].getCounter());
						// temp = current visitor
						temp = a;
					}
					else if(loopCount > 0){
						// guide = current index in visitor's guide order
						guide = visitors[temp].getGuideOrder().get(visitors[temp].getCounter());
					}
					// 'guide' already has a visitor assigned to it
					if(dummies[guide].assignment() == true){
						// Going through the visitor order of the specified guide, we want to see whether the currently 
						// assigned visitor or temp shows up first. Using guide's visitor order to break tie
						boolean winner = false;
						String listWinner = "";
						int b = 0;
						while(winner == false){
							if(dummies[guide].getVisitorOrder().get(b) == temp){
								listWinner = "current visitor";
								winner = true;
							}
							else if(dummies[guide].getVisitorOrder().get(b) == dummies[guide].getVisitor()){
								listWinner = "assigned visitor";
								winner = true;
							}
							else{
								b++;
							}
						}
						// what to do if we've reached the end of a visitor's ordered list of preferred guides. Have to backtrack
						if((guide == visitors[temp].getGuideOrder().get(visitors[temp].getGuideOrder().size() - 1)) && (guide == visitors[dummies[guide].getVisitor()].getGuideOrder().get(visitors[dummies[guide].getVisitor()].getGuideOrder().size() - 1))){
							boolean last = true;
							listcounter = visitors[temp].getCounter();
							while(last == true){	
								listcounter--;
								visitors[temp].setCounter(listcounter);
								temporaryVisitor = dummies[visitors[temp].getGuideOrder().get(visitors[temp].getCounter())].getVisitor();
								if(visitors[temporaryVisitor].getGuide() == visitors[temporaryVisitor].getGuideOrder().get(visitors[temporaryVisitor].getGuideOrder().size() - 1)){
								}
								else{
									visitors[temp].setGuide(visitors[temp].getGuideOrder().get(visitors[temp].getCounter()));
									visitors[temp].getGuideOrder().remove(visitors[temp].getGuideOrder().size() - 1);
									dummies[visitors[temp].getGuide()].setVisitor(temp);
									visitors[temporaryVisitor].setCounter(visitors[temporaryVisitor].getCounter() + 1);
									temp = temporaryVisitor;
									last = false;
								}
							}
							change = true;
						}
						// checking to see if the visitor we're currently analyzing has any guides remaining in its guide order. If it doesn't, we'll keep the match.
						else if(guide == visitors[temp].getGuideOrder().get(visitors[temp].getGuideOrder().size() - 1)){
							replace = dummies[guide].getVisitor();
							dummies[guide].setVisitor(temp);
							visitors[temp].setGuide(guide);
							visitors[replace].setCounter(visitors[replace].getCounter() + 1);
							temp = replace;
							change = true;
						}
						// does this guide index = the last guide in the already assigned visitor's guide order?
						else if(guide == visitors[dummies[guide].getVisitor()].getGuideOrder().get(visitors[dummies[guide].getVisitor()].getGuideOrder().size() - 1)){
							visitors[temp].setCounter(visitors[temp].getCounter() + 1);
							change = true;
						}
						else{
							if(listWinner.equals("current visitor")){
								replace = dummies[guide].getVisitor();
								dummies[guide].setVisitor(temp);
								visitors[temp].setGuide(guide);
								temp = replace;
								visitors[temp].setCounter(visitors[temp].getCounter() + 1);
								change = true;
							}
							else if(listWinner.equals("assigned visitor")){
								visitors[temp].setCounter(visitors[temp].getCounter() + 1);
								change = true;
							}
						}
					}
					else if(dummies[guide].assignment() == false){
						dummies[guide].setVisitor(temp);
						visitors[temp].setGuide(guide);
						change = false;
					}
					loopCount++;
				}
			}

			// Recording the guide assignments in the text files from which applicant data was retrieved.
			// These records will be used to display the assignment on the "Schedule Screen"
			try{
				for(int k = 0; k < monday.size(); k++){

					for(int l = 0; l < monday.get(k).size(); l++){
						boolean change = false;
						for(int a = 0; a < visitors.length; a++){
							if(monday.get(k).get(l).get(0).equals(visitors[a].getName())){
								MondayPW = new PrintWriter(new BufferedWriter(new FileWriter("MondayTemp.txt",true)));
								file = new Scanner(new FileReader("Monday" + "_" + monMonth + "_" + monDay + ".txt"));
								while(file.hasNextLine()){
									String line = file.nextLine();
									for(int h = 9; h < line.length(); h++){
										if(line.charAt(h) == ' '){
											if(line.substring(0,h).equals(visitors[a].getName())){
												for(int u = line.length() - 1; u >= 0; u--){
													if(line.charAt(u) == ' '){
														line = line.substring(0, u + 1) + dummies[visitors[a].getGuide()].getName().substring(0,dummies[visitors[a].getGuide()].getName().length() - 3);
														break;
													}
												}
												MondayPW.println(line);
												MondayPW.close();
												change = true;
											}
										}
									}
								}
							}
							else if((a == visitors.length - 1) && (change == false)){
								MondayPW = new PrintWriter(new BufferedWriter(new FileWriter("MondayTemp.txt",true)));
								String list = "";
								for(int b = 0; b < monday.get(k).get(l).size(); b++){
									list += monday.get(k).get(l).get(b) + " ";
								}
								MondayPW.println(list);
								MondayPW.close();
							}
						}
					}
				}
				File mondaytxt = new File("Monday" + "_" + monMonth + "_" + monDay + ".txt");
				mondaytxt.delete();
				File mondaytemptxt = new File("MondayTemp.txt");
				mondaytemptxt.renameTo(mondaytxt);

				for(int k = 0; k < tuesday.size(); k++){
					for(int l = 0; l < tuesday.get(k).size(); l++){
						boolean change = false;
						for(int a = 0; a < visitors.length; a++){
							if(tuesday.get(k).get(l).get(0).equals(visitors[a].getName())){
								TuesdayPW = new PrintWriter(new BufferedWriter(new FileWriter("TuesdayTemp.txt",true)));
								file = new Scanner(new FileReader("Tuesday" + "_" + tuesMonth + "_" + tuesDay + ".txt"));
								while(file.hasNextLine()){
									String line = file.nextLine();
									for(int y = 9; y < line.length(); y++){
										if(line.charAt(y) == ' '){
											if(line.substring(0,y).equals(visitors[a].getName())){
												for(int u = line.length() - 1; u >= 0; u--){
													if(line.charAt(u) == ' '){
														line = line.substring(0, u + 1) + dummies[visitors[a].getGuide()].getName().substring(0,dummies[visitors[a].getGuide()].getName().length() - 3);
														break;
													}
												}
												TuesdayPW.println(line);
												TuesdayPW.close();
												change = true;
											}
										}
									}
								}
							}
							else if((a == visitors.length - 1) && (change == false)){
								TuesdayPW = new PrintWriter(new BufferedWriter(new FileWriter("TuesdayTemp.txt",true)));
								String list = "";
								for(int b = 0; b < tuesday.get(k).get(l).size(); b++){
									list += tuesday.get(k).get(l).get(b) + " ";
								}
								TuesdayPW.println(list);
								TuesdayPW.close();
							}
						}
					}
				}
				File tuesdaytxt = new File("Tuesday" + "_" + tuesMonth + "_" + tuesDay + ".txt");
				tuesdaytxt.delete();
				File tuesdaytemptxt = new File("TuesdayTemp.txt");
				tuesdaytemptxt.renameTo(tuesdaytxt);

				for(int k = 0; k < wednesday.size(); k++){
					for(int l = 0; l < wednesday.get(k).size(); l++){
						boolean change = false;
						for(int a = 0; a < visitors.length; a++){
							if(wednesday.get(k).get(l).get(0).equals(visitors[a].getName())){
								WednesdayPW = new PrintWriter(new BufferedWriter(new FileWriter("WednesdayTemp.txt",true)));
								file = new Scanner(new FileReader("Wednesday" + "_" + wedMonth + "_" + wedDay + ".txt"));
								while(file.hasNextLine()){
									String line = file.nextLine();
									for(int o = 9; o < line.length(); o++){
										if(line.charAt(o) == ' '){
											if(line.substring(0,o).equals(visitors[a].getName())){
												for(int u = line.length() - 1; u >= 0; u--){
													if(line.charAt(u) == ' '){
														line = line.substring(0, u + 1) + dummies[visitors[a].getGuide()].getName().substring(0,dummies[visitors[a].getGuide()].getName().length() - 3);
														break;
													}
												}
												WednesdayPW.println(line);
												WednesdayPW.close();
												change = true;
											}
										}
									}
								}
							}
							else if((a == visitors.length - 1) && (change == false)){
								WednesdayPW = new PrintWriter(new BufferedWriter(new FileWriter("WednesdayTemp.txt",true)));
								String list = "";
								for(int b = 0; b < wednesday.get(k).get(l).size(); b++){
									list += wednesday.get(k).get(l).get(b) + " ";
								}
								WednesdayPW.println(list);
								WednesdayPW.close();
							}
						}
					}
				}
				File wednesdaytxt = new File("Wednesday" + "_" + wedMonth + "_" + wedDay + ".txt");
				wednesdaytxt.delete();
				File wednesdaytemptxt = new File("WednesdayTemp.txt");
				wednesdaytemptxt.renameTo(wednesdaytxt);

				for(int k = 0; k < thursday.size(); k++){
					for(int l = 0; l < thursday.get(k).size(); l++){
						boolean change = false;
						for(int a = 0; a < visitors.length; a++){
							if(thursday.get(k).get(l).get(0).equals(visitors[a].getName())){
								ThursdayPW = new PrintWriter(new BufferedWriter(new FileWriter("ThursdayTemp.txt",true)));
								file = new Scanner(new FileReader("Thursday" + "_" + thurMonth + "_" + thurDay + ".txt"));
								while(file.hasNextLine()){
									String line = file.nextLine();
									for(int r = 9; r < line.length(); r++){
										if(line.charAt(r) == ' '){
											if(line.substring(0,r).equals(visitors[a].getName())){
												for(int u = line.length() - 1; u >= 0; u--){
													if(line.charAt(u) == ' '){
														line = line.substring(0, u + 1) + dummies[visitors[a].getGuide()].getName().substring(0,dummies[visitors[a].getGuide()].getName().length() - 3);
														break;
													}
												}
												ThursdayPW.println(line);
												ThursdayPW.close();
												change = true;
											}
										}
									}
								}
							}
							else if((a == visitors.length - 1) && (change == false)){
								ThursdayPW = new PrintWriter(new BufferedWriter(new FileWriter("ThursdayTemp.txt",true)));
								String list = "";
								for(int b = 0; b < thursday.get(k).get(l).size(); b++){
									list += thursday.get(k).get(l).get(b) + " ";
								}
								ThursdayPW.println(list);
								ThursdayPW.close();
							}
						}
					}
				}
				File thursdaytxt = new File("Thursday" + "_" + thurMonth + "_" + thurDay + ".txt");
				thursdaytxt.delete();
				File thursdaytemptxt = new File("ThursdayTemp.txt");
				thursdaytemptxt.renameTo(thursdaytxt);

				for(int k = 0; k < friday.size(); k++){
					for(int l = 0; l < friday.get(k).size(); l++){
						boolean change = false;
						for(int a = 0; a < visitors.length; a++){
							if(friday.get(k).get(l).get(0).equals(visitors[a].getName())){
								FridayPW = new PrintWriter(new BufferedWriter(new FileWriter("FridayTemp.txt",true)));
								file = new Scanner(new FileReader("Friday" + "_" + friMonth + "_" + friDay + ".txt"));
								while(file.hasNextLine()){
									String line = file.nextLine();
									for(int w = 9; w < line.length(); w++){
										if(line.charAt(w) == ' '){
											if(line.substring(0,w).equals(visitors[a].getName())){
												for(int u = line.length() - 1; u >= 0; u--){
													if(line.charAt(u) == ' '){
														line = line.substring(0, u + 1) + dummies[visitors[a].getGuide()].getName().substring(0,dummies[visitors[a].getGuide()].getName().length() - 3);
														break;
													}
												}
												FridayPW.println(line);
												FridayPW.close();
												change = true;
											}
										}
									}
								}
							}
							else if((a == visitors.length - 1) && (change == false)){
								FridayPW = new PrintWriter(new BufferedWriter(new FileWriter("FridayTemp.txt",true)));
								String list = "";
								for(int b = 0; b < friday.get(k).get(l).size(); b++){
									list += friday.get(k).get(l).get(b) + " ";
								}
								FridayPW.println(list);
								FridayPW.close();
							}
						}
					}
				}
				File fridaytxt = new File("Friday" + "_" + friMonth + "_" + friDay + ".txt");
				fridaytxt.delete();
				File fridaytemptxt = new File("FridayTemp.txt");
				fridaytemptxt.renameTo(fridaytxt);

				for(int k = 0; k < saturday.size(); k++){
					for(int l = 0; l < saturday.get(k).size(); l++){
						boolean change = false;
						for(int a = 0; a < visitors.length; a++){
							if(saturday.get(k).get(l).get(0).equals(visitors[a].getName())){
								SaturdayPW = new PrintWriter(new BufferedWriter(new FileWriter("SaturdayTemp.txt",true)));
								file = new Scanner(new FileReader("Saturday" + "_" + satMonth + "_" + satDay + ".txt"));
								while(file.hasNextLine()){
									String line = file.nextLine();
									for(int p = 9; p < line.length(); p++){
										if(line.charAt(p) == ' '){
											if(line.substring(0,p).equals(visitors[a].getName())){
												for(int u = line.length() - 1; u >= 0; u--){
													if(line.charAt(u) == ' '){
														line = line.substring(0, u + 1) + dummies[visitors[a].getGuide()].getName().substring(0,dummies[visitors[a].getGuide()].getName().length() - 3);
														break;
													}
												}
												SaturdayPW.println(line);
												SaturdayPW.close();
												change = true;
											}
										}
									}
								}
							}
							if((a == visitors.length - 1) && (change == false)){
								SaturdayPW = new PrintWriter(new BufferedWriter(new FileWriter("SaturdayTemp.txt",true)));
								String list = "";
								for(int b = 0; b < saturday.get(k).get(l).size(); b++){
									list += saturday.get(k).get(l).get(b) + " ";
								}
								SaturdayPW.println(list);
								SaturdayPW.close();
							}
						}
					}
				}
				File saturdaytxt = new File("Saturday" + "_" + satMonth + "_" + satDay + ".txt");
				saturdaytxt.delete();
				File saturdaytemptxt = new File("SaturdayTemp.txt");
				saturdaytemptxt.renameTo(saturdaytxt);
			}
			catch (IOException u) {

			}

			// Creating statistics that can be used to judge the quality of a guide assignment over a week. Displayed in "Matching Statistics"
			double genderMatch = 0;
			double gradeMatch = 0;
			double academicMatch = 0;
			double fallMatch = 0;
			double winterMatch = 0;
			double springMatch = 0;
			double club1Match = 0;
			double club2Match = 0;
			double residenceMatch = 0;
			double totalMatch = 0;


			for(int q = 0; q < visitors.length; q++){
				if(visitors[q].getVisitor().get(7).equals(dummies[visitors[q].getGuide()].getGuide().get(3))){
					genderMatch = genderMatch + 1;
					totalMatch = totalMatch + 1;
				}
				if(visitors[q].getVisitor().get(8).equals(dummies[visitors[q].getGuide()].getGuide().get(4))){
					gradeMatch = gradeMatch + 1;
					totalMatch = totalMatch + 1;
				}
				if(visitors[q].getVisitor().get(15).equals(dummies[visitors[q].getGuide()].getGuide().get(11))){
					residenceMatch = residenceMatch + 1;
					totalMatch = totalMatch + 1;
				}
				if(visitors[q].getVisitor().get(9).equals(dummies[visitors[q].getGuide()].getGuide().get(5))){
					academicMatch = academicMatch + 1;
					totalMatch = totalMatch + 1;
				}
				if(visitors[q].getVisitor().get(10).equals(dummies[visitors[q].getGuide()].getGuide().get(6)) && dummies[visitors[q].getGuide()].getGuide().get(6).charAt(0) != '0'){
					fallMatch = fallMatch + 1;
					totalMatch = totalMatch + 1;
				}
				if(visitors[q].getVisitor().get(11).equals(dummies[visitors[q].getGuide()].getGuide().get(7)) && dummies[visitors[q].getGuide()].getGuide().get(7).charAt(0) != '0'){
					winterMatch = winterMatch + 1;
					totalMatch = totalMatch + 1;
				}
				if(visitors[q].getVisitor().get(12).equals(dummies[visitors[q].getGuide()].getGuide().get(8)) && dummies[visitors[q].getGuide()].getGuide().get(8).charAt(0) != '0'){
					springMatch = springMatch + 1;
					totalMatch = totalMatch + 1;
				}
				if((visitors[q].getVisitor().get(13).equals(dummies[visitors[q].getGuide()].getGuide().get(9)) && dummies[visitors[q].getGuide()].getGuide().get(9).charAt(0) != '0') || (visitors[q].getVisitor().get(13).equals(dummies[visitors[q].getGuide()].getGuide().get(10)) && dummies[visitors[q].getGuide()].getGuide().get(10).charAt(0) != '0')){
					club1Match = club1Match + 1;
					totalMatch = totalMatch + 1;
				}
				if((visitors[q].getVisitor().get(14).equals(dummies[visitors[q].getGuide()].getGuide().get(10)) && dummies[visitors[q].getGuide()].getGuide().get(10).charAt(0) != '0') || (visitors[q].getVisitor().get(14).equals(dummies[visitors[q].getGuide()].getGuide().get(9)) && dummies[visitors[q].getGuide()].getGuide().get(9).charAt(0) != '0')){
					club2Match = club2Match + 1;
					totalMatch = totalMatch + 1;
				}
			}

			double visitorlength = visitors.length;

			double genderPercent = (genderMatch * 100 / visitorlength);
			DecimalFormat genderDigit = new DecimalFormat("#,##0.00");
			genderPercent = Double.valueOf(genderDigit.format(genderPercent));

			double gradePercent = (gradeMatch * 100 / visitorlength);
			DecimalFormat gradeDigit = new DecimalFormat("#,##0.00");
			gradePercent = Double.valueOf(gradeDigit.format(gradePercent));

			double academicPercent = (academicMatch * 100/ visitorlength);
			DecimalFormat academicDigit = new DecimalFormat("#,##0.00");
			academicPercent = Double.valueOf(academicDigit.format(academicPercent));

			double fallPercent = (fallMatch * 100/ visitorlength);
			DecimalFormat fallDigit = new DecimalFormat("#,##0.00");
			fallPercent = Double.valueOf(fallDigit.format(fallPercent));

			double winterPercent = (winterMatch * 100/ visitorlength);
			DecimalFormat winterDigit = new DecimalFormat("#,##0.00");
			winterPercent = Double.valueOf(winterDigit.format(winterPercent));

			double springPercent = (springMatch * 100/ visitorlength);
			DecimalFormat springDigit = new DecimalFormat("#,##0.00");
			springPercent = Double.valueOf(springDigit.format(springPercent));

			double club1Percent = (club1Match * 100/ visitorlength);
			DecimalFormat club1Digit = new DecimalFormat("#,##0.00");
			club1Percent = Double.valueOf(club1Digit.format(club1Percent));

			double club2Percent = (club2Match * 100/ visitorlength);
			DecimalFormat club2Digit = new DecimalFormat("#,##0.00");
			club2Percent = Double.valueOf(club2Digit.format(club2Percent));

			double residencePercent = (residenceMatch * 100/ visitorlength);
			DecimalFormat residenceDigit = new DecimalFormat("#,##0.00");
			residencePercent = Double.valueOf(residenceDigit.format(residencePercent));

			double matchpervisitor = (totalMatch / visitorlength);
			DecimalFormat matchDigit = new DecimalFormat("#,##0.00");
			matchpervisitor = Double.valueOf(matchDigit.format(matchpervisitor));

			try{
				File MatchData = new File("MatchStats.txt");
				FileWriter MatchWriter = new FileWriter(MatchData, false);
				PrintWriter MatchPW = new PrintWriter(MatchWriter);

				MatchPW.println("September 9 - September 14");
				MatchPW.println(genderPercent);
				MatchPW.println(gradePercent);
				MatchPW.println(academicPercent);
				MatchPW.println(fallPercent);
				MatchPW.println(winterPercent);
				MatchPW.println(springPercent);
				MatchPW.println(club1Percent);
				MatchPW.println(club2Percent);
				MatchPW.println(residencePercent);
				MatchPW.println(matchpervisitor);

				for(int y = 0; y < parameters.size(); y++){
					MatchPW.println(parameters.get(y));
				}

				MatchPW.close();
			}
			catch (IOException u) {

			}
			try{
				File GuideReport = new File("GuideReport.txt");
				FileWriter ReportWriter = new FileWriter(GuideReport, false);
				PrintWriter ReportPW = new PrintWriter(ReportWriter);

				for(int a = 0; a < dummies.length; a++){
					ReportPW.println(dummies[a].getName().substring(0, dummies[a].getName().length() - 3) + " " + dummies[a].getName().substring(0, dummies[a].getName().length() - 3) + "@exeter.edu " + visitors[dummies[a].getVisitor()].getVisitor().get(1) + " " + visitors[dummies[a].getVisitor()].getVisitor().get(2) + ", " + visitors[dummies[a].getVisitor()].getVisitor().get(3) + " " + visitors[dummies[a].getVisitor()].getVisitor().get(4));
				}
				ReportPW.close();
			}
			catch (IOException u) {

			}
		}
	}
}