
import java.io.*;


public class ReadFile{
	private String path;
	private String[] textData;
	private String[] StartDate;
	private String[] EndDate;
	
	public ReadFile(String file_path){
		path = file_path;
	}
	
	public String[] OpenFile() throws IOException{
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		
		int numberOfLines = 12;
		textData = new String[numberOfLines];
		
		for(int i = 0; i < numberOfLines; i++){
			textData[i] = textReader.readLine();
		}
		
		textReader.close();
		return textData;
	}
	
	public String[] findStartDate() throws IOException{
		FileReader Datefr = new FileReader(path);
		BufferedReader DateTextReader = new BufferedReader(Datefr);
		
		int numberOfLines = 3;
		StartDate = new String[numberOfLines];
		
		for(int a = 0; a < 13; a++){
			DateTextReader.readLine();
		}
		
		for(int b = 0; b < numberOfLines; b++){
			StartDate[b] = DateTextReader.readLine();
		}
		
		DateTextReader.close();
		return StartDate;
	}
	
	public String[] findEndDate() throws IOException{
		FileReader Datefr = new FileReader(path);
		BufferedReader DateTextReader = new BufferedReader(Datefr);
		
		int numberOfLines = 3;
		EndDate = new String[numberOfLines];
		
		for(int a = 0; a < 17; a++){
			DateTextReader.readLine();
		}
		
		for(int b = 0; b < numberOfLines; b++){
			EndDate[b] = DateTextReader.readLine();
		}
		
		DateTextReader.close();
		return EndDate;
	}
	
}