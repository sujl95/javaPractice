package kr.javaPractice.GodOfJava._33Java8Changed;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentFilterSample {
    public static void main(String[] args) {
        StudentFilterSample sample = new StudentFilterSample();
        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO("요다", 43, 99, 10));
        studentList.add(new StudentDTO("만두", 30, 71, 85));
        studentList.add(new StudentDTO("건빵", 32, 81, 75));

        sample.filterWithScoreForLoop(studentList, 80);
    }

    private void filterWithScoreForLoop(List<StudentDTO> studentList, int scoreCutLine) {
        studentList.stream().filter(student -> student.getScoreMath() > scoreCutLine ).forEach(student -> System.out.println(student.getName()));
//        for (StudentDTO student : studentList) {
//            if (student.getScoreMath() > scoreCutLine) {
//                System.out.println(student.getName());
//            }
//        }
    }
}
