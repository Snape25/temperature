module com.example.temperature {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires javafx.graphics;

    opens com.example.heatapp to javafx.fxml;
    exports com.example.heatapp;
    exports com.example.TempCalc;
    opens com.example.TempCalc to javafx.fxml;
}