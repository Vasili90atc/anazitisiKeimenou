package gr.atc.training.anazitisiKeimenou;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class EpexergasiaKeimenou {

	public void readFile(String path, String lexi) {
		String line = "";// dilwsi metavlitwn
		BufferedReader reader = null;// dilwsi eidikou tupou metavlitwn
		try {
			reader = new BufferedReader(new InputStreamReader(new FileInputStream(new String(path)), "UTF-8"));// anoigei
			
			int lineNumber = 1;
			line = reader.readLine();
			while (line != null) {
				if (line.contains(lexi)) {
					System.out.println(lineNumber + ". " + line);
				}
				lineNumber++;
				line = reader.readLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
}
