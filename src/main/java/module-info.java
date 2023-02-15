module com.example.batallamardewailord {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.batallamardewailord to javafx.fxml;
    exports com.example.batallamardewailord;
}