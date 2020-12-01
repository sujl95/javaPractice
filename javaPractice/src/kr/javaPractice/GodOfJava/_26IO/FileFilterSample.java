package kr.javaPractice.GodOfJava._26IO;

import java.io.File;
import java.io.InputStream;
import java.io.Reader;

public class FileFilterSample {
    public static void main(String[] args) {
        FileFilterSample sample = new FileFilterSample();
        String pathName = File.separator + "godofjava" + File.separator + "text";
        sample.checkList(pathName);

    }

    public void checkList(String pathName) {
        File file;
        try {
            file = new File(pathName);
//            File[] mainFileList = file.listFiles();
//            File[] mainFileList = file.listFiles(new JPGFilenameFilter());
            File[] mainFileList = file.listFiles(new JPGFileFilter());
            for (File tempFile : mainFileList) {
                System.out.println(tempFile.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
