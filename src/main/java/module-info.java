module edu.farmingdale.module3_w4_lab {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.module3_w4_lab to javafx.fxml;
    exports edu.farmingdale.module3_w4_lab;
}