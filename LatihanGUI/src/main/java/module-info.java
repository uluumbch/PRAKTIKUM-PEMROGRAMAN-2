module com.example.latihangui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.latihangui to javafx.fxml;
    exports com.example.latihangui;
}