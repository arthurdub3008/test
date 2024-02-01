module sio.premierprojet {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.premierprojet to javafx.fxml;
    exports sio.premierprojet;
}