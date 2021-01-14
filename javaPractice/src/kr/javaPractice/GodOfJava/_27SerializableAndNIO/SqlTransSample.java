package kr.javaPractice.GodOfJava._27SerializableAndNIO;

import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SqlTransSample {
	public static void main(String[] args) {

		try (final var out = FileChannel.open(Paths.get("C:\\godofjava\\output.sql"),
				StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
			final var in = Files.readAllLines(Paths.get("C:\\godofjava\\data.sql"));
			in.stream().filter(s -> s.trim().length() > 0).
				forEach(s1 -> {
				final var str = s1.split("VALUES \\(");
				final var prefix = str[0];
				final var contents = str[1].split(",");
				final var result = IntStream.range(0, contents.length)
						.peek(i -> {
							contents[i] = contents[i].trim();
							if (i == 11 || i == 12) {
								contents[i] = Integer.parseInt(contents[i]) == 1 ? "'Y'" : "'N'";
							}
						})
						.mapToObj(i -> contents[i])
						.collect(Collectors.joining(", "));
				try {
					out.write(Charset.defaultCharset().encode(prefix + "VALUES (" + result + "\n"));
				} catch (IOException exception) {
					exception.printStackTrace();
				}
			});
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
}
