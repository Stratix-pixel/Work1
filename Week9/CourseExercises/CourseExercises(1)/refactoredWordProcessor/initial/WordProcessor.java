package week9.wordprocessor.initial;

import java.io.*;
import java.util.Scanner;

public class WordProcessor {
    public void wordWrap3(String input, String output) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            File inputFile = new File(input);
            br = new BufferedReader(new FileReader(inputFile));
            File outputFile = new File(output);
            bw = new BufferedWriter(new FileWriter(outputFile));
            String line;
            while ((line = br.readLine()) != null) {
                while (line.length() > 60) {
                    if (line.charAt(60) == ' ') {
                        bw.write(line.substring(0, 60));
                        bw.newLine();
                        line = line.substring(61);
                    } else {
                        int index = line.substring(0, 60).lastIndexOf(" ");

                        bw.write(line.substring(0, index));
                        bw.newLine();
                        line = line.substring(index + 1);
                    }
                }
                bw.write(line);
                bw.newLine();

            }
        } finally {
            if (br != null) {
                br.close();
            }
            if (bw != null) {
                bw.close();
            }

        }
    }
}



