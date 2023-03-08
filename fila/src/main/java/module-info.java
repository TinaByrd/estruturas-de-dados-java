module com.example.fila {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fila to javafx.fxml;
    exports com.example.fila;
}