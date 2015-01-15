import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class MatchFileData {

	private ArrayList<ArrayList<String>> both;
	
	public ArrayList<ArrayList<String>> Read(){
		try{
			ReadMatchFile ReadMatch = new ReadMatchFile("MatchStats.txt");
			String[] MatchLines = ReadMatch.OpenFile();
			
			ArrayList<String> percents = new ArrayList<String>();
			ArrayList<String> parameters = new ArrayList<String>();
			
			for(int a = 0; a < MatchLines.length; a++){
				if(a < 11){
					percents.add(MatchLines[a]);
				}
				else if(a >= 11){
					parameters.add(MatchLines[a]);
				}
			}
			
			both = new ArrayList<ArrayList<String>>();
			both.add(percents);
			both.add(parameters);
			
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		return both;
	}
}
