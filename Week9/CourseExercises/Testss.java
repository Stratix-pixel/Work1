import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Testss {
    public static void main(String[] args) throws Exception{

        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String s1 = "Ala bala portcola, a b,c d";

        //int count = WordProcessor.countWords(s1);
        //int count2 = WordProcessor.countWords2(s1);

        //System.out.println(count);
        //System.out.println(count2);


        File f = new File("C:\\wantsome\\week7\\input.txt");
        //WordProcessor.countFromFile(f);
        File f1 = new File("C:\\wantsome\\week7\\output.txt");

        BufferedReader br1 = new BufferedReader(new FileReader(f));
        BufferedWriter bw1 = new BufferedWriter(new FileWriter(f1));
        //System.out.println(br1);
        //WordProcessor.wordWrap(br1);
        WordProcessor.wordWrap2(br1, bw1);



    }
}
