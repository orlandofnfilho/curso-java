package cap200;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBufferWriter {

	public static void main(String[] args) {

		String[] lines = new String[] { "Texto1", "texto2", "texto3" };

		String path = "C:\\Users\\Orlando\\Desktop\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {

			for (String line : lines) {
				bw.write(line);
				bw.newLine();

			}

		} catch (IOException e) {
			e.printStackTrace();

		}
	}

}
