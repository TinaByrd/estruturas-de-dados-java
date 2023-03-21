module com.example.stack {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stack to javafx.fxml;
    exports com.example.stack;
}