module com.example.estruturasdados {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.estruturasdados to javafx.fxml;
    exports com.example.estruturasdados;
}