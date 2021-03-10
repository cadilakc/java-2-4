package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea textChat;

    @FXML
    TextField message;

    @FXML
    Button send;

    public void clickSend() {
        textChat.appendText(message.getText() + "\n");
        message.clear();
    }
}
