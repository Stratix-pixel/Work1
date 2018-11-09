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

    public static void wordWrap(BufferedReader br) throws Exception {
        String s, ss;
        File file = new File("C:\\wantsome\\week7\\input.txt");
        StringBuilder lines = new StringBuilder((int) file.length());
        br = new BufferedReader(new FileReader(file));

        int j = 0;
        try {
            while ((s = br.readLine()) != null) {
                lines.append(s);
                lines.append('\n');
            }
            ss = lines.toString();
            StringBuilder sb = new StringBuilder((ss));

            while((j = sb.indexOf(" ", j + 60)) != -1){
                sb.replace(j, j + 1, "\n");
            }
            System.out.println(sb.toString());
        } finally {
            br.close();
        }
    }

  

}
