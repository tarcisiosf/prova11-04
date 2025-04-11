module com.example.prova1104 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.prova1104 to javafx.fxml;
    exports com.example.prova1104;
}