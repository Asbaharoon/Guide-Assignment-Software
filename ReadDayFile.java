import java.io.*;
import java.util.Scanner;

public class ReadDayFile {
	private String fileName;
	private String[] textData;
	private String[] StartDate;
	private String[] EndDate;
	
	public ReadDayFile(String file_name){
		fileName = file_name;
	}
	
	public String[] OpenFile() throws IOException{
		FileReader fr = new FileReader(fileName);
		BufferedReader textReader = new BufferedReader(fr);
		
		int count = 0;
		Scanner ScanDayFile = new Scanner(new File(fileName));
		while (ScanDayFile.hasNextLine()) {
			  count++;
			  ScanDayFile.nextLine();
			}
		
		int numberOfLines = count;
		textData = new String[numberOfLines];
		
		for(int i = 0; i < numberOfLines; i++){
			textData[i] = textReader.readLine();
		}
		
		textReader.close();
		return textData;
	}
	
}