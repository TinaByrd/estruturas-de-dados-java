module com.example.projetono {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projetono to javafx.fxml;
    exports com.example.projetono;
}