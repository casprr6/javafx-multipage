module com.berghofer.multipagetest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.berghofer.multipagetest to javafx.fxml;
    opens com.berghofer.multipagetest.controllers to javafx.fxml;
    exports com.berghofer.multipagetest;
    exports com.berghofer.multipagetest.controllers;
}