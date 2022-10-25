module com.example.regularexpr {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.regularexpr to javafx.fxml;
    exports com.example.regularexpr;
}