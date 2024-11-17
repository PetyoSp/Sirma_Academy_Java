import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordLengths {
    public static void main(String[] args) {

        String path = "src/input.txt";
        try (
                BufferedReader reader = new BufferedReader(new FileReader(path));
        ) {
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                String[] words = line.split(" ");
                for (var word : words) {
                    System.out.print(word.length() + ", ");
                }
                line = reader.readLine();
                System.out.println();


            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
