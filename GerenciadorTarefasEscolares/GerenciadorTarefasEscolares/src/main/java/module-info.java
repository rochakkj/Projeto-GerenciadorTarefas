module br.ggg.gerenciadortarefasescolares {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.hibernate.orm.core;
    requires jakarta.persistence;


    opens br.ggg.gerenciadortarefasescolares to javafx.fxml;
    exports br.ggg.gerenciadortarefasescolares;
}