package kr.javaPractice.GodOfJava._26IO;

import java.io.File;
import java.io.FilenameFilter;

public class JPGFilenameFilter implements FilenameFilter {
    @Override
    public boolean accept(File file, String filename) {
        if (filename.endsWith(".jpg")) return true;
        return false;
    }
}
