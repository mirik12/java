package application;

import com.sun.javafx.logging.Logger;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Start extends Application {
	int x=0;
   private static final Logger log=loggerFactory.getLogger(MainApp.class);
   public static void main (String[] args) throws Exception {
	   launch(args);
   }
   public void start (Stage primaryStage) throws Exception {
	   Image image=new Image("images/p.jpg");
			   Group group=new Group ();
	  final  ImageView myImage=new ImageView();
	   myImage.setImage(image);
	   final KeyCombination left=new KeyCodeCombination(KeyCode.LEFT);
	    final KeyCombination right=new KeyCodeCombination(KeyCode.RIGHT);
	   scene.setOnKeyPressed ( new EventHandler<KeyEvent>() {
		   public void handle (KeyEvent event) {
			if (left.match(event)) {   
			   System.out.println("LEFT");
			   x-=20;
			   myImage.setX(x);
		   }else if (right.match(event)) {   
			   System.out.println("RIGHT");
			   x+=20;
			   myImage.setX(x);
	   }
	   
	   
	   group.getChildren().add(myImage);
	   Scene scene= new Scene (group,400,400);
   
        try {
           
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
}
}
  