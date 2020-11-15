package kr.javaPractice.GodOfJava._26IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterSample {
    public static void main(String[] args) {
        String hello = "Hello";
        String description = "this is Hello";

        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(new File("C:\\godofjava\\text\\bufferedSample.txt")));
            writer.write(hello);
            writer.newLine();
            writer.write(description);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
