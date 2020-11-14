package kr.javaPractice.GodOfJava._27SerializableAndNIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesSample {
    public static void main(String[] args) throws IOException{
        FilesCreateTest();
        FileCreateTest();
        FileDirTest();
        FilesDirTest();
        FileDirs();
        FilesDirs();
        FileGet();
        FilesGet();
    }


    public static void FileCreateTest() throws IOException{
        //파일 생성
        File file = new File("C:\\godofjava\\text\\text.txt");
        file.createNewFile();
    }

    public static void FilesCreateTest() throws IOException {
        //파일 생성
        Path path = Paths.get("C:\\godofjava\\text\\text.txt");
        Files.createFile(path);

    }

    public static void FileDirTest() throws IOException{
        //디렉터리 생성
        File file = new File("C:\\godofjava\\FileDir");
        file.mkdir();
    }

    public static void FilesDirTest() throws IOException {
        //디렉터리 생성
        Path path = Paths.get("C:\\godofjava\\FilesDir");
        Files.createDirectory(path);
    }

    public static void FileDirs() throws IOException {
        // 여러 단계 디렉터리 생성
        File file = new File("C:\\godofjava\\FileDirs");
        file.mkdirs();
    }

    public static void FilesDirs() throws IOException {
        // 여러 단계 디렉터리 생성
        Path path = Paths.get("C:\\godofjava\\FilesDirs");
        Files.createDirectories(path);
    }

    public static void FileGet() throws IOException {
        // 파일 존재 확인
        File file = new File("C:\\godofjava\\text\\test.txt");
        System.out.println(file.exists());
    }

    public static void FilesGet() throws IOException {
        // 파일 존재 확인
        Path path = Paths.get("C:\\godofjava\\text\\test.txt");
        System.out.println(Files.exists(path));
    }

}
