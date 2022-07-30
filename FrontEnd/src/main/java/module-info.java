module group1.cs180_proj {
    requires javafx.fxml;
    requires javafx.controls;
    requires java.net.http;
    requires org.json;
    opens group1.cs180_proj to javafx.fxml;
    exports group1.cs180_proj;
}
