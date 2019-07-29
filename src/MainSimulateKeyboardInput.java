import java.awt.*;
import java.awt.event.KeyEvent;

public class MainSimulateKeyboardInput {

    public static void main(String[] args) {
        try {
            Robot robot = new Robot();

            robot.keyPress(65);
            robot.keyRelease(65);

            robot.keyPress(KeyEvent.VK_BACK_SLASH);
            robot.keyRelease(KeyEvent.VK_BACK_SLASH);

            robot.keyPress('A');                // gives "a"
            robot.keyRelease('A');

            robot.keyPress(KeyEvent.VK_SHIFT);      // gives "A"
            robot.keyPress('A');
            robot.keyRelease('A');
            robot.keyRelease(KeyEvent.VK_SHIFT);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);

            String string = "With text string It Is Not Easy";
            String stringCaps = string.toUpperCase();

            char[] chars = string.toCharArray();
            char[] charsCaps = stringCaps.toCharArray();
            for (int i = 0; i < charsCaps.length; i++) {
                if (chars[i] == charsCaps[i]) { robot.keyPress(KeyEvent.VK_SHIFT); }
                robot.keyPress(charsCaps[i]);
                robot.keyRelease(charsCaps[i]);
                robot.keyRelease(KeyEvent.VK_SHIFT);
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}


