module com.example.quaternarycalculator {
    requires javafx.controls;
    requires javafx.fxml;

//    requires org.controlsfx.controls;
//    requires net.synedra.validatorfx;
//    requires org.kordamp.bootstrapfx.core;
//    requires junit;
//    requires org.testng;

    opens com.example.quaternarycalculator to javafx.fxml;
    exports com.example.quaternarycalculator;
}