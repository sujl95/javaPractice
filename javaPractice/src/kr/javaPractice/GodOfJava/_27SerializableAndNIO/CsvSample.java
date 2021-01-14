package kr.javaPractice.GodOfJava._27SerializableAndNIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class CsvSample {
	private static List<String> lines = new ArrayList<>();


	public static void main(String[] args) throws Exception {
		String sfileName = "C:\\godofjava\\test.csv";
		Path fileName = Paths.get("C:\\godofjava\\test.csv");
		Path fileName2 = Paths.get("C:\\godofjava\\test2.csv");
		Path fileName3 = Paths.get("C:\\godofjava\\test3.csv");
		// readWriteFile(fileName, fileName3);
		readWriteTest(fileName,fileName3);
		// readFile(fileName);
		// writeFile(fileName3);
		// readEncode(fileName);
		// readUnicodeJava11(sfileName);
	}

	private static void readWriteTest(Path fileName, Path fileName2) throws IOException{
		FileChannel open = FileChannel.open(Paths.get(String.valueOf(fileName)), StandardOpenOption.CREATE_NEW,
				StandardOpenOption.TRUNCATE_EXISTING);
		List<String> strings = Files.readAllLines(Paths.get(String.valueOf(fileName2)));
		System.out.println(strings);
		try (BufferedReader br = Files.newBufferedReader(fileName, StandardCharsets.UTF_8);
			 BufferedWriter bw = Files.newBufferedWriter(fileName2, StandardCharsets.UTF_8)){
			String line = "";
			while((line = br.readLine()) != null) {
				line = line.replace(';',',')
						.replace("특별자치도", "")
						.replace("청", "")
						.replace("라", "")
						.replace("상", "")
						.replace("도", "")
						.replace("특별시", "")
						.replace("광역시", "");
				System.out.println(line);
				bw.append(line);
				bw.newLine();
			}
		}
	}

	private static void readWriteFile(Path fileName, Path fileName2) throws IOException{
		try (BufferedReader br = Files.newBufferedReader(fileName, StandardCharsets.UTF_8);
			BufferedWriter bw = Files.newBufferedWriter(fileName2, StandardCharsets.UTF_8)){
			String line = "";
			while((line = br.readLine()) != null) {
				line = line.replace(';',',')
						.replace("특별자치도", "")
						.replace("청", "")
						.replace("라", "")
						.replace("상", "")
						.replace("도", "")
						.replace("특별시", "")
						.replace("광역시", "");
				System.out.println(line);
				bw.append(line);
				bw.newLine();
			}
		}
	}

	private static void writeFile(Path fileName) throws IOException {
		try (BufferedWriter writer = Files.newBufferedWriter(fileName, StandardCharsets.UTF_8);) {
			for (String line : lines) {
				writer.append(line);
				writer.newLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void readFile(Path fileName) throws Exception {
		try (BufferedReader br = Files.newBufferedReader(fileName, StandardCharsets.UTF_8);){
			String line = "";
			while((line = br.readLine()) != null) {
				line = line.replace(';',',');
				line = line.replace("특별자치도", "");
				line = line.replace("청", "");
				line = line.replace("라", "");
				line = line.replace("상", "");
				line = line.replace("도", "");
				line = line.replace("특별시", "");
				line = line.replace("광역시", "");
				lines.add(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Java 11, adds charset to FileReader
	public static void readUnicodeJava11(String fileName) {
		try (FileReader fr = new FileReader(fileName, StandardCharsets.UTF_8);
			 BufferedReader reader = new BufferedReader(fr)) {

			String str;
			while ((str = reader.readLine()) != null) {
				str = str.replace(';',',');
				str = str.replace("특별자치도", "");
				str = str.replace("청", "");
				str = str.replace("라", "");
				str = str.replace("상", "");
				str = str.replace("도", "");
				str = str.replace("특별시", "");
				str = str.replace("광역시", "");
				System.out.println(str);

				lines.add(str);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
