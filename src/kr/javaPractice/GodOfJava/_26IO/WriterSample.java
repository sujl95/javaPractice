package kr.javaPractice.GodOfJava._26IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterSample {
    public static void main(String[] args) throws IOException {
        Writer writer = new FileWriter("C:\\godofjava\\text\\bufferedSample.txt");
        writer.append("writer");
        writer.close();
    }
}
