package br.ggg.gerenciadortarefasescolares.controllers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class relatoriosController {
    @FXML
    private Button ButtonSave;

    @FXML
    private Text Name;

    @FXML
    private TextField NameUser;

    @FXML
    private ImageView image1;

    @FXML
    private Button imageButton;

    @FXML
    void clickFotoPerfil(ActionEvent event) {

        image1.setVisible(true);
        //HelloApplication.mudarTela();

    }

    @FXML
    void NameChange(ActionEvent event) {
        Name.setText(NameUser.getText());
    }

}
