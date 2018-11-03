package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApp extends Application {
	int x = 0;
	private static final Logger log = LoggerFactory.getLogger(MainApp.class);

	public static void main(String[] args) throws Exception {
		launch(args);
	}

	public void start(Stage primaryStage) throws Exception {
		Image image = new Image("images/p.png");
		Group group = new Group();
		final ImageView myImage = new ImageView();
		myImage.setImage(image);
		group.getChildren().add(myImage);
		Scene scene = new Scene(group, 400, 400);
		final KeyCombination left = new KeyCodeCombination(KeyCode.LEFT);
		final KeyCombination right = new KeyCodeCombination(KeyCode.RIGHT);
		final KeyCombination z = new KeyCodeCombination(KeyCode.Z);
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

			public void handle(KeyEvent event) {
				if (left.match(event)) {
					System.out.println("LEFT");
					x-=20;
					myImage.setX(x);

				}else if (right.match(event)) {
					System.out.println("RIGHT");
					x+=20;
					myImage.setX(x);

				}else if (z.match(event)) {
					new Thread(new MyTask(myImage)).start();

				}

			}
		});

		try {

			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
