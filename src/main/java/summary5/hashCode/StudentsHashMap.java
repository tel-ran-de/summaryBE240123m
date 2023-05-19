package summary5.hashCode;

import java.util.HashMap;
import java.util.Map;

public class StudentsHashMap {
    public static void main(String[] args) {
        Map<Student, String> studentStringMap = new HashMap<>();

        studentStringMap.put(new Student("name1", 20, "town1"), "student 1");
        studentStringMap.put(new Student("name2", 21, "town2"), "student 2");
        studentStringMap.put(new Student("name3", 22, "town3"), "student 3");
        studentStringMap.put(new Student("name1", 20, "town4"), "student 4");
        studentStringMap.put(new Student("name5", 25, "town5"), "student 5");

        System.out.println(studentStringMap);

    }
}
