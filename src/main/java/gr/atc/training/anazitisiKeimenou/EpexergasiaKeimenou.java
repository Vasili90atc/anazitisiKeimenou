package gr.atc.training.anazitisiKeimenou;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;

public class EpexergasiaKeimenou {

	public void readFile(String path, String regex) {
		String line = "";// dilwsi metavlitwn
		BufferedReader reader = null;// dilwsi eidikou tupou metavlitwn
		Pattern p = Pattern.compile(regex);
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path)), "UTF-8"));// anoigei
			
			int lineNumber = 1;
			line = reader.readLine();
			while (line != null) {
				Matcher m = p.matcher(line);
				
				if (m.find()) {
					String word = m.group();
					
					System.out.println(lineNumber + ".("+word+") " + line);
				}
				lineNumber++;
				line = reader.readLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

