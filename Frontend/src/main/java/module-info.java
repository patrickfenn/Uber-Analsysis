module com.example.uberanalysis {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires org.json;


    opens com.example.uberanalysis to javafx.fxml;
    exports com.example.uberanalysis;
}