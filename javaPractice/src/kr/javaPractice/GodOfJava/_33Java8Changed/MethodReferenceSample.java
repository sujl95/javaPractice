package kr.javaPractice.GodOfJava._33Java8Changed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReferenceSample {
    public static void main(String[] args) {
        MethodReferenceSample sample = new MethodReferenceSample();
        String[] stringArray = {"요다", "만두", "건빵"};
//        sample.objectReference(stringArray);
//        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        sample.multiplyWithFor(intList);
//        intList.stream().map(i -> i * 3).forEach(System.out::println);
        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO("요다", 43, 99, 10));
        studentList.add(new StudentDTO("만두", 30, 71, 85));
        studentList.add(new StudentDTO("건빵", 32, 81, 75));

        List<String> nameList = studentList.stream().map(studentDTO -> studentDTO.getName()).collect(Collectors.toList());
        System.out.println(nameList);


    }

    private static void printResult(String value) {
        System.out.println(value);
    }

    private void staticReference(String[] stringArray) {
        Stream.of(stringArray).forEach(MethodReferenceSample::printResult);
    }

    private void objectReference(String[] stringArray) {
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        Arrays.asList(stringArray).stream().forEach(System.out::println);
    }

    interface MakeString {
        String fromBytes(char[] chars);
    }

    private void createInstance() {
        MakeString makeString = String::new;
        char[] chars = {'G','o','d','O','f','J','a','v','a'};
        String madeString = makeString.fromBytes(chars);
        System.out.println(madeString);
    }

    private void multiplyWithFor(List<Integer> intList) {
        for (int value : intList) {
            int tempValue=value*3;
            System.out.println(tempValue);
        }
    }
}
