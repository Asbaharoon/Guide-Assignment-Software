import java.io.IOException;
import java.util.ArrayList;


public class ParameterFileData {

	private ArrayList<String> weights;
	
	public ArrayList<String> Read(){
		try{
			ReadParameterFile ReadParameter = new ReadParameterFile("ParameterWeights.txt");
			String ParameterLines = ReadParameter.OpenFile();
			
			weights = new ArrayList<String>();
			int previousSpace = 0;
			int counter = 0;
			for(int a = 0; a < ParameterLines.length(); a++){
				if(counter == 0){ 
					if(ParameterLines.charAt(a) == 32){
					weights.add(ParameterLines.substring(0,a));
					previousSpace = a+1;
					counter++;
					}
				}
				else{
					if(ParameterLines.charAt(a) == 32){
						weights.add(ParameterLines.substring(previousSpace,a));
						previousSpace = a+1;
						counter++;
					}
				}
			}
			
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
		
		return weights;
	}
	
	
}
