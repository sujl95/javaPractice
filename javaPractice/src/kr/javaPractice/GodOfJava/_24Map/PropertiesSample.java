package kr.javaPractice.GodOfJava._24Map;

import java.util.Properties;

public class PropertiesSample {
    public static void main(String[] args) {
        PropertiesSample sample = new PropertiesSample();
        sample.checkProperties();
    }

    public void checkProperties() {
        Properties prop = System.getProperties();
        for(Object tempObject : prop.keySet()){
            System.out.println(tempObject+"="+prop.get(tempObject));
        }
    }
}
