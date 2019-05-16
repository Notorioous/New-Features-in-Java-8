package streamFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFiles {
    public static void main(String[] args) {
        //Old Version with BufferedReader

        List<String> lines = new ArrayList<>();
        Path path = Paths.get("file.txt");

        try(BufferedReader reader = Files.newBufferedReader(path)) {

            String line = null;
            while ((line = reader.readLine()) !=null){
                lines.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

//        System.out.println(lines);

        //With Scanner
        try(Scanner scanner = new Scanner(new File("file.txt"))) {
            while (scanner.hasNext()){
                lines.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //В Java 8 в класс Files добавили метод lines() который возвращает Stream из строк

        List<String> newLines = new ArrayList<>();
        Path path1 = Paths.get("file.txt");

        try ( Stream<String> lineStream = Files.lines(path1)) {
            newLines = lineStream.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(newLines);

        List<String> lists = Arrays.asList("qwe","asd","zxc");
        IntStream intStream = lists.stream()
                .mapToInt(Integer::parseInt);
        intStream.forEach(System.out::println);
    }
}
