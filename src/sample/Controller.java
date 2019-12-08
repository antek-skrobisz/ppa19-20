package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class Controller {

    @FXML
    public Circle leftCircle;

    @FXML
    public Circle rightCircle;

    protected boolean leftPosition;

    public void initialize() {
        leftCircle.setFill(Color.RED);
        rightCircle.setFill(Color.BLUE);
        leftPosition = true;
    }

    public void clickCircle(MouseEvent mouseEvent) {
        Circle circle = (Circle) mouseEvent.getSource();
        circle.setFill(Color.GREEN);
    }

    public void changeColor(ActionEvent actionEvent) {
        Paint leftFill = leftCircle.getFill();
        if (leftPosition) {
            leftCircle.setFill(Color.BLUE);
            rightCircle.setFill(Color.RED);
            leftPosition = false;
        } else {
            leftCircle.setFill(Color.RED);
            rightCircle.setFill(Color.BLUE);
            leftPosition = true;
        }
    }
}
