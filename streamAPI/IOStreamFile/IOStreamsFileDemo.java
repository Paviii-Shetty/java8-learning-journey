package streamAPI.IOStreamFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class IOStreamsFileDemo {
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader(new File(
				"C:\\Users\\Desktop\\javaFeaturesSTS\\Java8Features\\src\\streamAPI\\IOStreamFile\\demo.txt"));
		BufferedReader br = new BufferedReader(reader);
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
		System.out.println("=====================================");
		String filename = "C:\\Desktop\\javaFeaturesSTS\\Java8Features\\src\\streamAPI\\IOStreamFile\\demo.txt";

		List<String> lines = new ArrayList<>();
		try (Stream<String> streamLine = Files.lines(Paths.get(filename))) {
			streamLine.filter(linesH -> linesH.startsWith("H")||linesH.startsWith("h"))
			.forEach(fileLine -> System.out.println(fileLine));
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}

	}

}

