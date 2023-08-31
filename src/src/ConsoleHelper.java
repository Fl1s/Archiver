package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static String readString() throws IOException {
        String string = reader.readLine();

        return string;
    }

    public static int readInt() throws IOException {
        String intString = readString();
        return Integer.parseInt(intString.trim());
    }

}
