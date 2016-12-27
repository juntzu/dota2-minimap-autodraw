package DrawEngine;

import java.awt.*;

/**
 * Created by Chris on 27/12/2016.
 */
public class PicturePainter {

//TODO refactor class

    float desiredSpeed = 1.9999f;
    int keyPressDelay = 20;
    int movementDelay = 6;
    InputController inputController = new InputController();

    public PicturePainter() throws AWTException {}


    public void drawPicture(Picture picture){
        for(int[][] polygon:picture.getPolygons()){
            drawPolygon(polygon);
        }
    }

    public void drawPolygon(int[][] polygon){
        int mouseX = polygon[0][0], mouseY = polygon[0][1];
        setup(mouseX,mouseY);
        for(int i =1; i<polygon.length;i++){
            while(true) {
                float dirX = polygon[i][0] - mouseX;
                float dirY = polygon[i][1] - mouseY;
                double length = Math.sqrt(dirX*dirX + dirY*dirY);
                double xSpeed = dirX/length;
                double ySpeed = dirY/length;
                
                if(Double.isNaN(xSpeed)&&Double.isNaN(ySpeed)){
                    break;
                }

                mouseX += (xSpeed)*desiredSpeed;
                mouseY += (ySpeed)*desiredSpeed;
                inputController.delay(movementDelay);
                inputController.move(mouseX,mouseY);
            }

        }
       tearDown();
    }

    public void setup(int mouseX, int mouseY){
        inputController.move(mouseX,mouseY);
        inputController.pressCtrl();
        inputController.delay(keyPressDelay);
        inputController.pressLeftClick();
        inputController.delay(keyPressDelay);
    }

    public void tearDown(){
        inputController.releaseCtrl();
        inputController.releaseLeftClick();
        inputController.delay(keyPressDelay);
    }
}

