package module4_3;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<String>> content = List.of(
                List.of("Name", "Job", "Age"),
                List.of("Zaremba", "Teacher", "39"),
                List.of("John", "Teacher", "30"),
                List.of("Doe", "Student", "31")
        );
        try {
            csv.createCSVFile("test.csv", content);
            System.out.println(csv.getCSVFileContent("test.csv"));
            System.out.println(csv.getRow("test.csv", 2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}