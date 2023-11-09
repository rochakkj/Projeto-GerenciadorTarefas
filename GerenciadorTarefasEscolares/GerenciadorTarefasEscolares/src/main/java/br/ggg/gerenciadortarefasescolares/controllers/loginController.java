package br.ggg.gerenciadortarefasescolares.controllers;

        import javafx.event.ActionEvent;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.RadioButton;
        import javafx.scene.control.TextField;
        import javafx.scene.control.ToggleGroup;
        import javafx.scene.text.Text;

public class loginController {

    @FXML
    private RadioButton Feminino;

    @FXML
    private RadioButton Masculino;

    @FXML
    private ToggleGroup Sexo;

    @FXML
    private TextField UserCPF;

    @FXML
    private TextField UserEndereco;

    @FXML
    private TextField UserName;
    @FXML
    private Text MeuCPF;

    @FXML
    private Text MeuEndereco;

    @FXML
    private Text MeuNome;

    @FXML
    private Text MeuSexo;


    @FXML
    void clickLogin(ActionEvent event) {
        System.out.printf("clicou");
        //HelloApplication.mudarTela();

    }

    @FXML
    void getInformacoes(ActionEvent event) {

        if(Sexo.getSelectedToggle().equals(Masculino)){
            MeuSexo.setText("Masculino");
        } else if (Sexo.getSelectedToggle().equals(Feminino)) {
            MeuSexo.setText("Feminino");
        }

        MeuNome.setText(UserName.getText());
        MeuCPF.setText(UserCPF.getText());
        MeuEndereco.setText(UserEndereco.getText());

    }

}