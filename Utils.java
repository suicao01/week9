import java.io.*;


public class Utils {

    private static final String path = "dtb1.txt";
    private static final String path1 = "temp.txt";
    public static String readContentFromFile(String path) throws IOException {

            StringBuilder res = new StringBuilder();
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;
            while ((line = br.readLine()) != null) {
                res.append(line).append("\n");

            }

            return res.toString();

    }

    public static void writeContentToFile(String path) throws IOException {
        String content = "This is the content to write into a file";
        File file = new File(path1);
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        if (file.length() ==0) {


            bw.write(content);
            bw.close();
        }
        else {

            bw.write("");
            bw.close();
        }
    }


    public static void writeAppendFile(String path) throws IOException {

        FileWriter fw = new FileWriter(path, true);
        fw.write("append a new line");
        fw.close();
    }

    public static File findFileByName(String folderPath, String fileName) {
       File folder = new File(folderPath);
       if (!folder.exists() || !folder.isDirectory()) {
           System.out.print("Cannot find folder");
           return null;
       }
       File []file = folder.listFiles();
        for (File f : file) {
           if (f.getName().equals(fileName)) {
               return f;
           }
       }
       return null;

    }

}