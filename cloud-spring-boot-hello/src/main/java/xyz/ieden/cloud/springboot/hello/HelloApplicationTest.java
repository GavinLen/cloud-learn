package xyz.ieden.cloud.springboot.hello;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HelloApplicationTest {
    public static void main(String[] args) {
        MyMap myMap = new MyMap();
        for (Map.Entry<Integer, Integer> entry : myMap.getEntry()) {
            System.out.println("Key:" + entry.getKey() + "; Val:" + entry.getValue());
        }

        for (int i = 0; i < myMap.getEntry().size(); i++) {
            System.out.println(111);
        }

    }

}

class MyMap {
    private Map<Integer, Integer> map = new HashMap<>(10);

    public MyMap() {
        for (int i = 0; i < 10; i++) {
            map.put(i, i);
        }
    }

    public Set<Map.Entry<Integer, Integer>> getEntry() {
        System.out.println("---> getEntry");
        return map.entrySet();
    }

}