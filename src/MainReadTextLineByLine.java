import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MainReadTextLineByLine {

    public static void main(String[] args) {

        int lineNumber = 0;

        try {
            BufferedReader in = new BufferedReader(new FileReader("JavaQuickTip.txt"));
            String line = null;
            while ((line = in.readLine()) != null )  {
                lineNumber++;
                System.out.println("Line " + lineNumber + ": " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
