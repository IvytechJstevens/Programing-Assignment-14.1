import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ImageGridPane extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a GridPane
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Load the images
        Image image1 = new Image("https://cdn.britannica.com/79/4479-050-6EF87027/flag-Stars-and-Stripes-May-1-1795.jpg");
        Image image2 = new Image("https://starspangledflags.com/wp-content/uploads/argentina-flag.jpg");
        Image image3 = new Image("https://starspangledflags.com/wp-content/uploads/mexico-flag.jpg");
        Image image4 = new Image("https://www.cia.gov/the-world-factbook/static/2f47299974bd75267d861aa6b1651ca6/0f3a1/AX-flag.jpg");

        // Create ImageViews for each image
        ImageView imageView1 = new ImageView(image1);
        ImageView imageView2 = new ImageView(image2);
        ImageView imageView3 = new ImageView(image3);
        ImageView imageView4 = new ImageView(image4);

        // Set preferred size for the ImageViews (optional)
        imageView1.setFitWidth(150);
        imageView1.setFitHeight(150);
        imageView2.setFitWidth(150);
        imageView2.setFitHeight(150);
        imageView3.setFitWidth(150);
        imageView3.setFitHeight(150);
        imageView4.setFitWidth(150);
        imageView4.setFitHeight(150);

        // Add ImageViews to the GridPane
        gridPane.add(imageView1, 0, 0);
        gridPane.add(imageView2, 1, 0);
        gridPane.add(imageView3, 0, 1);
        gridPane.add(imageView4, 1, 1);

        // Create a scene and set it in the stage
        Scene scene = new Scene(gridPane, 340, 340); // Set size according to images
        primaryStage.setTitle("Image Grid");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
