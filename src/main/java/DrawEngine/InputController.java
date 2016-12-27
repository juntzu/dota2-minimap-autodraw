package DrawEngine;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * Created by Chris on 18/12/2016.
 */
public class InputController {

    static Robot robot;

    public InputController() throws AWTException {
        robot = new Robot();
    }

    void move(int x,int y){
        robot.mouseMove(x,1080-y);
    }

    void pressCtrl(){
        robot.keyPress(KeyEvent.VK_CONTROL);
    }
    void releaseCtrl(){
        robot.keyRelease(KeyEvent.VK_CONTROL);
    }
    void pressLeftClick(){
        robot.mousePress(InputEvent.BUTTON1_MASK);
    }
    void releaseLeftClick(){
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }
    void delay(int ms){
        robot.delay(ms);
    }
}
