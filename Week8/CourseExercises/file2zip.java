import java.io.*;
import java.nio.file.Paths;
import java.util.*;

public class file2zip {

    public static void writeToFileZipFileContents(String zipFileName, String outputFileName) throws java.io.IOException {
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.US_ASCII;
        java.nio.file.Path outputFilePath = java.nio.file.Paths.get(outputFileName);

        try (java.util.zip.ZipFile zf = new java.util.zip.ZipFile(zipFileName); java.io.BufferedWriter writer = java.nio.file.Files.newBufferedWriter(outputFilePath, charset)) {
            for (java.util.Enumeration entries = zf.entries(); entries.hasMoreElements(); ) {
                String newLine = System.getProperty("line.separator");
                String zipEntryName = ((java.util.zip.ZipEntry) entries.nextElement()).getName() + newLine;
                writer.write(zipEntryName, 0, zipEntryName.length());
            }
        }
    }

    public static void listFilesForFolder(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {
                System.out.println(fileEntry.getName());
            }
        }
    }

    public static void checkFile(final File f) {
        if (f.exists() && !f.isDirectory()) {
            System.out.println("The file " + f + " exists\n");
        } else {
            System.out.println("The file " + f + " specified doesn't exist\n");
        }
    }

    public static void checkPermissions(final File f) {
        if (f.canWrite() && f.canRead()) {
            System.out.println("The file " + f + " has write and read access\n");
        } else {
            System.out.println("The file " + f + " doesn't have write and read access\n");
        }
    }

    public static String findLongestWords() throws FileNotFoundException {
        String longestWord = "";
        String current;
        String f = "C:\\wantsome\\week7\\ex123.txt";
        Scanner sc = new Scanner(new File(f));
        while (sc.hasNext()) {
            current = sc.next();
            if (current.length() > longestWord.length()) {
                longestWord = current;
            }
        }
        System.out.println("\n" + "The longest word from the file " + f + " is: " + longestWord + "\n");
        return longestWord;
    }

    public static void extractWords(String inputFileName, String startLetter, String outputFileName) {
        File file = null;
        Scanner scanner = null;
        String currentWord;
        try {
            file = new File(String.valueOf(Paths.get(inputFileName)));
            scanner = new Scanner(file);
            FileWriter fileWriter = new FileWriter(String.valueOf(Paths.get(outputFileName)));
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            List<String> reverseWords = new LinkedList<>();
            while (scanner.hasNext()) {
                currentWord = scanner.next();
                if (currentWord.startsWith(startLetter)) {
                    reverseWords.add(currentWord);
                }
            }
            Collections.reverse(reverseWords);
            for (String word : reverseWords) {
                fileWriter.write(word + " ");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
