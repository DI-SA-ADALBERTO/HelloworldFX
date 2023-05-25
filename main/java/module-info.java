module com.example.hellowordfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hellowordfx to javafx.fxml;
    exports com.example.hellowordfx;
}