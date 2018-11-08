import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.FileTime;


public class Test {
    public static void main(String[] args) throws Exception {

        //ZipInputStream in = null;

        //File f = new File("C:\\wantsome\\week7\\zip.zip");

        //ZipOutputStream out = new ZipOutputStream(new FileOutputStream(f));
        //ZipEntry e = new ZipEntry("mytext.txt");

        //ZipFile zipFile = new ZipFile("C:\\wantsome\\week7");
        // in = new ZipInputStream("C:\\wantsome\\week7\\zip.zip");
        // out = new ZipOutputStream("C:\\wantsome\\week7");
        //in = new ZipInputStream(zipFile);

        String ins = "C:\\wantsome\\week7\\ex.zip";
        String outs = "C:\\wantsome\\week7\\testzip.zip";


        //file2zip.writeToFileZipFileContents(ins, outs);

        final File folder = new File("C:\\wantsome\\week7");

        System.out.print("The files in the specified folder are: \n");
        file2zip.listFilesForFolder(folder);
        System.out.println("\n");

        File f = new File("C:\\wantsome\\week7\\ex123.txt");

        file2zip.checkFile(f);

        File f1 = new File("C:\\wantsome\\week7\\eztest.rtf");

        file2zip.checkPermissions(f1);


        FileTime fileT = Files.getLastModifiedTime(Paths.get("C:\\wantsome\\week7\\ex123.txt"));
        System.out.println("The last modified time for the file specified is " + fileT);

        file2zip.findLongestWords();


        file2zip.extractWords("C:\\wantsome\\week7\\ex123.txt","a","C:\\wantsome\\week7\\output.txt");



    }


}
