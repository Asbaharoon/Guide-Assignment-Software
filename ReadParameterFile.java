import java.io.*;
import java.util.Scanner;

public class ReadParameterFile {

	private String fileName;
	private String textData;
	
	public ReadParameterFile(String file_name){
		fileName = file_name;
	}
	
	public String OpenFile() throws IOException{
		FileReader fr = new FileReader(fileName);
		BufferedReader textReader = new BufferedReader(fr);
		
		textData = new String();
		textData = textReader.readLine();
		
		textReader.close();
		return textData;
	}
	
}