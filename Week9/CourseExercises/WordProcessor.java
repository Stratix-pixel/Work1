import java.io.*;
import java.util.*;

public class WordProcessor {

    public static int countWords(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        StringTokenizer tokens = new StringTokenizer(s);
        return tokens.countTokens();
    }

    public static int countWords2(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        String[] words = s.split("\\s+");
        return words.length;
    }

    public static void countFromFile(File f) throws Exception {
        f = new File("C:\\wantsome\\week7\\input.txt");
        try (Scanner sc = new Scanner(new FileInputStream(f))) {
            int count = 0;
            while (sc.hasNext()) {
                sc.next();
                count++;
            }
            System.out.println("Number of words: " + count);
        }
    }

    /*public static void wordWrap(BufferedReader br) throws Exception {
        br = new BufferedReader(new FileReader("C:\\wantsome\\week7\\input.txt"));
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i + 60 < sb.length() && (i = sb.lastIndexOf(" ", i + 60)) != -1) {
            sb.replace(i, i + 1, "\n");
        }
        System.out.println(sb.toString());
    }
*/

    public static void wordWrap2(BufferedReader br) throws Exception {
        br = new BufferedReader(new FileReader("C:\\wantsome\\week7\\input.txt"));
        String strCurrentLine;
        int i = 0;
        //while ((strCurrentLine = br.readLine()) != null && i + 60) {
      //      System.out.println(strCurrentLine);
    //    }
    }

    public static void wordWrap2() throws Exception {
        final int assumedLineLength = 50;
        File file = new File("");
        List<String> fileList = new ArrayList<String>((int) (file.length() / assumedLineLength) * 2);
        BufferedReader reader = null;
        int lineCount = 0;
        try {
            reader = new BufferedReader(new FileReader(file));
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                fileList.add(line);
                lineCount++;
            }
        } catch (IOException e) {
            System.err.format("Could not read %s: %s%n", file, e);
            System.exit(1);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                }
            }
        }
        int repeats = Integer.parseInt("");
        Random random = new Random();
        for (int i = 0; i < repeats; i++) {
            System.out.format("%d: %s%n", i, fileList.get(random.nextInt(lineCount - 1)));


        }
    }

}
