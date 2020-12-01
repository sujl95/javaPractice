package kr.javaPractice.GodOfJava._33Java8Changed;

import java.util.ArrayList;
import java.util.List;

public class StudentForEachSample {
    public static void main(String[] args) {
        StudentForEachSample sample = new StudentForEachSample();
        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO("요다",43,43,10));
        studentList.add(new StudentDTO("만두",30,71,85));
        studentList.add(new StudentDTO("건빵",32,81,75));

        sample.printStudentNames(studentList);
    }

    private void printStudentNames(List<StudentDTO> students) {
        students.stream().map(student -> student.getName()).forEach(System.out::println);
    }
}
