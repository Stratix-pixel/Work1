package lab8prob1;

import java.io.*;
import java.net.*;
import java.util.*;


public class HTTP {
    public static void main(String[] args) {
        String urlStr = "https://en.wikipedia.org/wiki/Java";
        String path = "C:\\wantsome\\week7\\input.txt";
        //List<String> links = extractLinks(readUrl(urlStr));
        //Path path= Paths.get("C:\\wantsome\\week7\\arizona2.txt");
        File file = new File("C:\\wantsome\\week7\\arizona2.txt");
        //writeToFile(links, file);
        //readFile(file);
        readFile2(path);


    }

    public static void writeToFile(List<String> links, File file) {
        try (FileWriter out = new FileWriter(file.getAbsolutePath())) {
            for (String s : links) {
                out.write(s, 0, s.length());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readUrl(String urlStr) {
        StringBuilder response = new StringBuilder();
        try {
            URL url = new URL(urlStr);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            System.out.println(urlConnection.getResponseCode());
            System.out.println(urlConnection.getResponseMessage());
            System.out.println(urlConnection.getHeaderFields());
            InputStreamReader streamReader = new InputStreamReader(urlConnection.getInputStream());
            try (BufferedReader bufferedReader = new BufferedReader(streamReader)) {
                String inputLine;
                while ((inputLine = bufferedReader.readLine()) != null) {
                    response.append(inputLine);
                }
                System.out.println(response.toString());
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response.toString();
    }

    public static List<String> extractLinks(String input) {
        List<String> responseLinks = new ArrayList<>();
        int start = 0;
        int end = 0;
        while ((start != -1)) {
            start = input.indexOf("www.", end);
            if (start == -1) break;
            end = input.indexOf("\"", start + "www.".length() + 1);
            responseLinks.add(input.substring(start + "www.".length() + 1, end));
        }
        for (String s : responseLinks) {
            System.out.println(s);
        }
        return responseLinks;
    }

    public static void readFile(File file) {
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                int i = sc.nextInt();
                System.out.println(i);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void readFile2(String filename) {
        List<String> records = new ArrayList<String>();
        List<String> response = new ArrayList<String>();
        int start = 0;
        int end = 0;
        //List<String> urls = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                records.add(line);

                StringTokenizer st = new StringTokenizer(line, ",");
                while (st.hasMoreTokens()) {
                    System.out.println(st.nextToken());
                    while ((start != -1)) {
                        start = line.indexOf("www.", end);
                        if (start == -1) break;
                        end = line.indexOf("\"", start + "www.".length());
                        response.add(line.substring(start + "www.".length(), end));
                    }
                    for (String s : response) {
                        System.out.println(s);
                    }
                    System.out.println(response);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
