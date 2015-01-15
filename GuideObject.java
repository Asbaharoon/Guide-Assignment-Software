import java.util.ArrayList;


public class GuideObject {

	private ArrayList<String> guide;
	private String guideName;
	private ArrayList<String> tally;
	private ArrayList<Integer> visitorOrder;
	private int visitorName;
	private boolean assignment;
	
	public void setGuide(ArrayList<String> Guide){
		guide = Guide;
	}
	
	public ArrayList<String> getGuide(){
		return guide;
	}
	
	public void setName(String name){
		guideName = name;
	}
	
	public String getName(){
		return guideName;
	}
	
	public void setScore(ArrayList<String> scores){
		tally = scores;
	}
	
	public ArrayList<String> getScore(){
		return tally;
	}
	
	public void setVisitorOrder(ArrayList<Integer> visitors){
		visitorOrder = visitors;
	}
	
	public ArrayList<Integer> getVisitorOrder(){
		return visitorOrder;
	}
	
	public void setVisitor(int visitorname){
		visitorName = visitorname;
		assignment = true;
	}
	
	public int getVisitor(){
		return visitorName;
	}
	
	public boolean assignment(){
		return assignment;
	}
	
}
