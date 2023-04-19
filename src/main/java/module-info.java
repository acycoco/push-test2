module com.example.pushtest2 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.pushtest2 to javafx.fxml;
    exports com.example.pushtest2;
}