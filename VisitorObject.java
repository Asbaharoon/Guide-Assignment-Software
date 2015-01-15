import java.util.ArrayList;


public class VisitorObject {

	private ArrayList<String> visitor;
	private String visitorName;
	private ArrayList<String> tally;
	private ArrayList<Integer> guideOrder;
	private int guideName;
	private boolean assignment;
	private int guideCounter;
	private ArrayList<String> mirror;
	private ArrayList<String> order;
	
	public void setVisitor(ArrayList<String> Visitor){
		visitor = Visitor;
	}
	
	public ArrayList<String> getVisitor(){
		return visitor;
	}
	
	public void setName(String name){
		visitorName = name;
	}
	
	public String getName(){
		return visitorName;
	}
	
	public void setScore(ArrayList<String> scores){
		tally = scores;
	}
	
	public ArrayList<String> getScore(){
		return tally;
	}
	
	public void setGuideOrder(ArrayList<Integer> guides){
		guideOrder = guides;
	}
	
	public ArrayList<Integer> getGuideOrder(){
		return guideOrder;
	}
	
	public void setGuide(int guidename){
		guideName = guidename;
		assignment = true;
	}
	
	public int getGuide(){
		return guideName;
	}
	
	public boolean assignment(){
		return assignment;
	}
	
	public void setCounter(int counter){
		guideCounter = counter;
	}
	
	public int getCounter(){
		return guideCounter;
	}
	
	public ArrayList<String> clone(ArrayList<String> copy){
		mirror = new ArrayList<String>(copy);
		return mirror;
	}
	
	public void setReplaceOrder(ArrayList<String> replace){
		order = replace;
	}
	
	public ArrayList<String> getReplaceOrder(){
		return order;
	}
	
}
