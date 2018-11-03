package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class Login extends Application {
	//Stage primaryStage;
	@Override
	public void start(Stage primaryStage) {
		//this.primaryStage=primaryStage;
		try {
			//setMyView(primaryStage);
			Label l1= new Label ( "login");
			BorderPane root = new BorderPane();
			root.setLeft(l1);
			
			Scene scene = new Scene(root,400,400);
			//root.getChildren().add(l1);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void setMyView(Stage primaryStage) {
		Button b1=new Button("OK");
		Label l1= new Label ( "Login");
		Label l2= new Label ( "password");
		TextField t1= new TextField ();
		PasswordField  t2= new PasswordField ();
		
		HBox box = new HBox(10);
		box.setAlignment(Pos.BOTTOM_RIGHT);
		box.getChildren().add(b1);
		
		GridPane grid=new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		Scene scene = new Scene(grid,400,400);
		grid.add(l1, 0, 0);
		grid.add(t1, 1, 0);
		grid.add(l2, 0, 1);
		grid.add(t2, 1, 1);
		grid.add(box, 1, 2);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
