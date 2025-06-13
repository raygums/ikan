import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AplikasiSederhana extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Komponen UI
        Label label = new Label("Masukkan Nama:");
        TextField textField = new TextField();
        Button button = new Button("Tampilkan");

        // Event klik tombol
        button.setOnAction(e -> {
            String nama = textField.getText();
            label.setText("Halo, " + nama + "!");
        });

        // Susun dengan VBox
        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, textField, button);

        // Scene dan Stage
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setTitle("Contoh JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
