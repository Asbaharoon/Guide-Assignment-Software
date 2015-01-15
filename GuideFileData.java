import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GuideFileData {

	private ArrayList<ArrayList<ArrayList<String>>> allGuides;
	private ArrayList<ArrayList<String>> Preps;
	private ArrayList<ArrayList<String>> Lowers;
	private ArrayList<ArrayList<String>> Uppers;
	private ArrayList<ArrayList<String>> Seniors;
	private String Grade;
	
	
	public ArrayList<ArrayList<ArrayList<String>>> Read(){
		try{
			ReadGuideFile ReadGuide = new ReadGuideFile("Guides.txt");
			String[] GuideLines = ReadGuide.OpenFile();
			
			Preps = new ArrayList<ArrayList<String>>();
			Lowers = new ArrayList<ArrayList<String>>();
			Uppers = new ArrayList<ArrayList<String>>();
			Seniors = new ArrayList<ArrayList<String>>();
			allGuides = new ArrayList<ArrayList<ArrayList<String>>>();
			
			for(int a = 0; a < GuideLines.length; a++){
				int LineLength = GuideLines[a].length();
				int counter = 0;
				int previousSpace = 0;
				ArrayList<String> guide = new ArrayList<String>();
				for(int b = 0; b < LineLength; b++){
					if(GuideLines[a].charAt(b) == 95){
						if(counter == 0){
							if(GuideLines[a].substring(0, b).equals("Prep")){
								Grade = "Prep";
								counter++;
							}
							else if(GuideLines[a].substring(0, b).equals("Lower")){
								Grade = "Lower";
								counter++;
							}
							else if(GuideLines[a].substring(0, b).equals("Upper")){
								Grade = "Upper";
								counter++;
							}
							else if(GuideLines[a].substring(0, b).equals("Senior")){
								Grade = "Senior";
								counter++;
							}
						}
						else{
						}
					}
					else if(GuideLines[a].charAt(b) == 32){
						if(Grade.equals("Prep")){
							guide.add(GuideLines[a].substring(previousSpace,b));
							previousSpace = b+1;
						}
						else if(Grade.equals("Lower")){
							guide.add(GuideLines[a].substring(previousSpace,b));
							previousSpace = b+1;
						}
						else if(Grade.equals("Upper")){
							guide.add(GuideLines[a].substring(previousSpace,b));
							previousSpace = b+1;
						}
						else if(Grade.equals("Senior")){
							guide.add(GuideLines[a].substring(previousSpace,b));
							previousSpace = b+1;
						}
					}
				}
				if(Grade.equals("Prep")){
					Preps.add(guide);
				}
				if(Grade.equals("Lower")){
					Lowers.add(guide);
				}
				if(Grade.equals("Upper")){
					Uppers.add(guide);
				}
				if(Grade.equals("Senior")){
					Seniors.add(guide);
				}
			}
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		allGuides.add(Preps);
		allGuides.add(Lowers);
		allGuides.add(Uppers);
		allGuides.add(Seniors);
		
		return allGuides;
	}
	
}
