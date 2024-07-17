module com.example.almost_withdrawn_pitak {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.almost_withdrawn_pitak to javafx.fxml;
    exports com.example.almost_withdrawn_pitak;
}