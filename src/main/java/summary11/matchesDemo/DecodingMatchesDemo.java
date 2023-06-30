package summary11.matchesDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

public class DecodingMatchesDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("src/main/java/summary11/matchesDemo/matches.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String readingLine;

        List<Match> matches = new ArrayList<>();

        while ((readingLine = bufferedReader.readLine()) != null) {
            String[] lineParsed = readingLine.split(",");
            System.out.println(Arrays.toString(lineParsed));

/*
2022, 1, 7, FC Bayern Munich, 1:02, Borussia Monchengladbach, NULL, NULL

String[] = {2022, 1, 7, FC Bayern Munich, 1:02, Borussia Monchengladbach, NULL, NULL}
 */
            matches.add(new Match(
                    new GregorianCalendar(
                            Integer.parseInt(lineParsed[0].trim()),
                            Integer.parseInt(lineParsed[1].trim()),
                            Integer.parseInt(lineParsed[2].trim())
                            ),
                    lineParsed[3],
                    lineParsed[4],
                    lineParsed[5],
                    lineParsed[6],
                    lineParsed[7]
                    ));
        }

        System.out.println(matches.size());
    }
}
