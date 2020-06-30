package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    TextArea textArea;

    @FXML
    TextArea textArea2;

    @FXML
    TextField textField;

    @FXML
    HBox hBox;

//    public boolean count;

    public void sendMessage() {

//        if(!count==true) {
//            textArea.setNodeOrientation(NodeOrientation.LEFT_TO_RIGHT);
//            textArea.appendText(" " + textField.getText() + "\n");
//            count = true;
//            textField.clear();
//            textField.requestFocus();
//        } else {
            textArea.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
            textArea.appendText(" " + textField.getText() + "\n");
//            count = false;
            textField.clear();
            textField.requestFocus();
        }
    }
//}



//        Text text = new Text();
//        text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 50));
//        text.setX(50);
//        text.setY(130);
//        text.setFill(Color.BLACK);
//        text.setStrokeWidth(3);
//        text.setStroke(Color.RED);
//        text.setText(textField.getText());


