package module4_3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class csv {

    public static void createCSVFile(String filePath, List<List<String>> content) throws IOException {
        StringBuilder toBeWritten = new StringBuilder();
        for (List<String> row : content) {
            StringBuilder sb = new StringBuilder();
            for (String cell : row) {
                sb.append(cell).append(",");
            }
            sb.replace(sb.length() - 1, sb.length(), "\n");
            toBeWritten.append(sb);
        }
        // Remove the last newline character.
        toBeWritten.delete(toBeWritten.length() - 1, toBeWritten.length());
        Files.writeString(Path.of(filePath), toBeWritten);
    }

    public static List<List<String>> getCSVFileContent(String filePath) throws IOException {
        List<List<String>> content = new ArrayList<>();
        for (String column : Files.readAllLines(Path.of(filePath))) {
            List<String> row = List.of(column.split(","));
            content.add(row);
        }
        return content;
    }
    public static List<String> getRow(String filePath, int rowNumber) throws IOException {
        List<List<String>> content = getCSVFileContent(filePath);
        List<String> row = new ArrayList<>();

        // Start at i = 1 because i = 0 is the headers.
        for (int i = 1; i < content.size(); i++) {
            List<String> column = content.get(i);
            row.add(column.get(rowNumber));
        }
        return row;
    }

}