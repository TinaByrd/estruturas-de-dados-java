module com.example.listaencadeada {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.listaencadeada to javafx.fxml;
    exports com.example.listaencadeada;
}