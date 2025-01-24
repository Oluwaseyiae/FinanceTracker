module com.financetracker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.financetracker to javafx.fxml;
    exports com.financetracker;
    exports com.financetracker.controllers;
    opens com.financetracker.controllers to javafx.fxml;
}