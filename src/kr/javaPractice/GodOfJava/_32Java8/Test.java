package kr.javaPractice.GodOfJava._32Java8;

import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) throws Exception {
//        String common = "common";
//        Optional<String> nullableString = Optional.ofNullable(common);
//        getOptionalData(nullableString);

        joinStringOnlyComma(new String[]{"Study", "GodOfJava", "Book"});
        joinString(new String[]{"Study", "GodOfJava", "Book"});

    }

    private static void createOptionalObjects() {
        Optional<String> emptyString = Optional.empty();
        String common = null;
        Optional<String> nullableString = Optional.ofNullable(common);
        common = "common";
        Optional<String> commonString = Optional.of(common);
    }

    private static void checkOptionalData() {
        Optional<String> emptyString = Optional.empty();
        System.out.println(emptyString.toString());
        System.out.println(Optional.of("present").isPresent());
        System.out.println(Optional.ofNullable("present").isPresent());
        System.out.println(Optional.ofNullable(null).isPresent());
    }

    private static void getOptionalData(Optional<String> data) throws Exception {
        String defaultValue = "default";
        String result1 = data.get(); //1
        System.out.println("result1="+result1);
        String result2 = data.orElse(defaultValue); //2
        System.out.println("result2="+result2);
        Supplier<String> stringSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return "GodOfJava";
            }
        };
        System.out.println(stringSupplier);
        String result3 = data.orElseGet(stringSupplier); //3
        Supplier<Exception> exceptionSupplier = new Supplier<Exception>() {
            @Override
            public Exception get() {
                return new Exception();
            }
        };
        System.out.println(result3);
        String result4 = data.orElseThrow(exceptionSupplier); //4
        System.out.println(result4);
    }

    public static void joinStringOnlyComma(String...stringArray) {
        StringJoiner joiner = new StringJoiner(",");
        for (String string : stringArray) {
            joiner.add(string);
        }
        System.out.println(joiner);
    }

    public static void joinString(String...stringArrray) {
        StringJoiner joiner = new StringJoiner(",", "(", ")");
        for (String string : stringArrray) {
            joiner.add(string);
        }
        System.out.println(joiner);
    }
}
