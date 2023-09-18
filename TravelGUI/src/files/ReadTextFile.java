package files;

import java.io.*;

import travel.*;

public class ReadTextFile {
	
	private String filename;
	private BufferedReader reader;
	
	public ReadTextFile(String str){
		filename = str;
	}
	public void open() {

		try {
			reader = new BufferedReader(new FileReader(filename));
		}
		catch (IOException e) {
		    e.printStackTrace();
		}
	}

	public String readline() {
		
		String line = "";
			
		if (reader == null) {
			System.out.println("File not yet opened");
			return null;
		}
		
		try {
			line = reader.readLine();
	    }
		catch (IOException e) {
	         e.printStackTrace();
	    } 	
		return line;
	}
}
