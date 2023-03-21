module com.example.equalshashcode {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.equalshashcode to javafx.fxml;
    exports com.example.equalshashcode;
}