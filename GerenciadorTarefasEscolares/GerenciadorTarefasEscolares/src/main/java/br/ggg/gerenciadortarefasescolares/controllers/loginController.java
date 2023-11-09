package br.ggg.gerenciadortarefasescolares.controllers;

        import br.ggg.gerenciadortarefasescolares.entity.Login;
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

        //Login l = new Login(UserName.getText(), "25-11-1998", UserCPF.getText(), "325465239", "igor@fdsdf", "lkasfnlaksfn");

        //session.pesist(l);

        MeuNome.setText(UserName.getText());
        MeuCPF.setText(UserCPF.getText());
        MeuEndereco.setText(UserEndereco.getText());

    }

}