module com.berghofer.multipagetest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.berghofer.multipagetest to javafx.fxml;
    exports com.berghofer.multipagetest;
}