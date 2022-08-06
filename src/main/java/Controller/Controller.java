package Controller;

import Model.User;

import java.io.*;

public class Controller {
    public static User loggedInUser = null;

    public static void savetoFile(String fileName, String text) throws FileNotFoundException {
        File file = new File(fileName);
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.write(text);
        printWriter.close();
    }

    public static String loadFromFile(String fileName) throws IOException {
        File file = new File(fileName);
        FileInputStream fileInputStream = new FileInputStream(file);
        String text = new String(fileInputStream.readAllBytes());
        fileInputStream.close();
        return text;
    }
}
