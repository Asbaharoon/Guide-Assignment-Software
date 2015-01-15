public class ArrayMatrix {

	private Object[][] matrix;
	private int guides;
	private int applicants;

	// Don't have a "remove" method since an ArrayListMatrix would be more suitably used in that scenario
	
	// O(1)
	public ArrayMatrix(int numGuides, int numApplicants) {
		matrix = new Object[numGuides][numApplicants];
		guides = numGuides;
		applicants = numApplicants;
	}

	// O(n^2)
	public void Initialize() {
		for (int i = 0; i < guides; i++) {
			for (int a = 0; a < applicants; a++) {
				matrix[i][a] = 0;
			}
		}
	}

	// O(1)
	public Object getElement(int row, int column) {
		return matrix[row][column];
	}

	// O(1)
	public void setElement(int row, int column, Object weight) {
		matrix[row][column] = weight;
	}
	
	// O(n)
	public Object find(int findColumn, int returnColumn, Object element){
		for(int a = guides - 1; a >= 0; a--){
			if(matrix[a][findColumn].equals(element)){
				return this.getElement(a,returnColumn);
			}
		}
		return -1;
	}
	
	// O(n)
	public int getRow(int findColumn, Object element){
		for(int a = guides - 1; a >= 0; a--){
			if(matrix[a][findColumn].equals(element)){
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
