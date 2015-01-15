import java.util.ArrayList;


public class ArrayListMatrix {
	private ArrayList<ArrayList<Object>> matrix;
	private int guides;
	private int applicants;

	// O(1)
	public ArrayListMatrix(int numGuides, int numApplicants) {
		matrix = new ArrayList<ArrayList<Object>>();
		guides = numGuides;
		applicants = numApplicants;
	}
	
	// O(n^2)
	public void Initialize() {
		if(matrix.size() == 0){
			for (int i = 0; i < guides; i++) {
				ArrayList<Object> scoreList = new ArrayList<Object>();
				for (int a = 0; a < applicants; a++) {
					scoreList.add(0);
				}
				matrix.add(scoreList);
			}
		}
		else{
			for (int j = 0; j < guides; j++) {
				for (int b = 0; b < applicants; b++) {
					matrix.get(j).set(b, 0);
				}
			}
		}
	}

	// O(1)
	public Object getElement(int row, int column) {
		return matrix.get(row).get(column);
	}
	// O(1)
	public void setElement(int row, int column, Object weight) {
		matrix.get(row).set(column, weight);
	}
	
	// O(1)
	public void removeGuide(int guide){
		matrix.remove(guide);
		guides--;
	}
	
	// O(n) because only traversing a single column
	public Object find(int findColumn, int returnColumn, Object element){
		for(int a = guides - 1; a >= 0; a--){
			if(matrix.get(a).get(findColumn).equals(element)){
				return this.getElement(a,returnColumn);
			}
		}
		return -1;
	}
	
	// O(1)
	public void printRow(int row){
		System.out.println(matrix.get(row));
	}
	
	// O(n) because only traversing single column
	public int getRow(int findColumn, Object element){
		for(int a = guides - 1; a >= 0; a--){
			if(matrix.get(a).get(findColumn).equals(element)){
				return a;
			}
		}
		return -1;
	}

	// O(1)
	public int numGuides() {
		return guides;
	}
	// O(1)
	public int numApplicants() {
		return applicants;
	}

}
