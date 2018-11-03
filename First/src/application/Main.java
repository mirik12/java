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


public class Main extends Application {
	//Stage primaryStage;
	@Override
	public void start(Stage primaryStage) {
	//	this.primaryStage=primaryStage;
		try {
			//setMyViewForm(primaryStage);
			Label loginLabel=new Label("Login");
			BorderPane root = new BorderPane();
			root.setLeft(loginLabel);
			
			Scene scene = new Scene(root,400,400);
			//root.getChildren().add(loginLabel);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setMyViewForm(Stage primaryStage){
		Label loginLabel=new Label("Login");
		TextField loginField=new TextField();
		Label passwordLabel=new Label("Password");
		PasswordField passwordField=new PasswordField();
		Button ok=new Button("OK");
		HBox box=new HBox(10);
		box.setAlignment(Pos.BOTTOM_RIGHT);
		box.getChildren().add(ok);
		GridPane grid=new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
	    grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		Scene scene = new Scene(grid,400,400);
		grid.add(loginLabel, 0, 0);
		grid.add(loginField, 1, 0);
		grid.add(passwordLabel, 0, 1);
		grid.add(passwordField, 1, 1);
		grid.add(box, 1, 2);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public void setMyView(Stage primaryStage){
		Button b1=new Button("Hello");
		Button b2=new Button("Left");
		Button b3=new Button("Right");
		Button b4=new Button("Something");
		GridPane grid=new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
	    grid.setVgap(10);
		grid.setPadding(new Insets(25,25,25,25));
		Scene scene = new Scene(grid,400,400);
		grid.add(b1, 0, 0);
		grid.add(b2, 1, 0);
		grid.add(b3, 0, 1);
		grid.add(b4, 1, 1);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
