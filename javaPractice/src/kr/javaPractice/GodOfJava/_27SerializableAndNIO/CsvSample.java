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
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CsvSample {
	private static List<String> lines = new ArrayList<>();


	public static void main(String[] args) throws Exception {
		String sfileName = "C:\\godofjava\\test.csv";
		Path fileName = Paths.get("C:\\godofjava\\test.csv");
		Path fileName2 = Paths.get("C:\\godofjava\\test2.csv");
		Path fileName3 = Paths.get("C:\\godofjava\\test3.csv");
		Path customjuso = Paths.get("C:\\godofjava\\customjuso.csv");
		Path customjusoResult = Paths.get("C:\\godofjava\\customjusoResult.csv");
		// readWriteFile(fileName, fileName3);
		readWriteTest(customjuso,customjusoResult);
		// readFile(fileName);
		// writeFile(fileName3);
		// readEncode(fileName);
		// readUnicodeJava11(sfileName);
	}



	private static void readWriteTest(Path fileName, Path fileName2) throws IOException{
		FileChannel open = FileChannel.open(Paths.get(String.valueOf(fileName)), StandardOpenOption.CREATE_NEW,
				StandardOpenOption.TRUNCATE_EXISTING);
		List<String> strings = Files.readAllLines(Paths.get(String.valueOf(fileName)));
		try (BufferedReader br = Files.newBufferedReader(fileName, StandardCharsets.UTF_8);
			 BufferedWriter bw = Files.newBufferedWriter(fileName2, StandardCharsets.UTF_8)){
			String line = "";
			String[] tempArr = new String[8];
			String address = "";
			int cntCk = 0;
			while((line = br.readLine()) != null) {
				if (cntCk == 0) {
					cntCk++;
					continue;
				}
				String[] linesSplit = line.split(",");
				System.out.println("linesSplit = " + Arrays.toString(linesSplit));
				// 1. 리의 주소가 있는지 확인한다.
				// 1.1. 리 주소가 없다면, 데이터를 그대로 저장한다.
				if (linesSplit[4].equals("")) {
					bw.append(line);
					bw.newLine();
					continue;
				}
				// 1.2. 리 주소가 있다면 temp 데이터에 동까지의 주와, 리, x, y 값을 저장한다.
				address = linesSplit[3];

				// 1.2.1. 다음 주소가 temp 데이터의 동까지의 주소와 동일하다면 temp의 리 값과 x, y 값을 더한다.
				// 1.2.2. 다음 주소가 temp 데이터의 동까지의 주소와 다르다면  temp의 리 값과 x, y 값을 저장한다.



				bw.append(line);
				// bw.append(line);
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
