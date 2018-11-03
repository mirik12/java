package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class App1 extends Application {
    Stage primaryStage;
    Button b1= new Button("Ok");
    Label lab1 = new Label("Success");
    Label lab2 = new Label("Error.Try again!");
    TextField t1 = new TextField();
    PasswordField t2 = new PasswordField();

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage=primaryStage;
        try {
            Label l1 = new Label("Login");
            Label l2 = new Label("Password");

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
            grid.add(t1,1,0);
            grid.add(l2, 0 ,1);
            grid.add(t2,1,1);
            grid.add(box,1,2);
            grid.add(lab1,0,2);
            lab1.setVisible(false);
            // grid.add(b2, 1, 0);
            //grid.add(b3, 0, 1);
            //grid.add(b4, 1, 1);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
        initListener();
    }

    private void initListener(){
        b1.setOnMouseClicked(new EventHandler<MouseEvent😠) {
            @Override
            public void handle(MouseEvent event) {
                primaryStage.setScene(getMyWiew());
               // primaryStage.setFullScreen(true);
                //b1.setVisible(false);
                if (t1.getText().equals("ua") && t2.getText().equals("ua")) {
                    primaryStage.setFullScreen(true);
                    lab1.setVisible(true);
                    lab2.setVisible(false);
                } else {
                    lab1.setVisible(false);
                    lab2.setVisible(true);
                    primaryStage.setFullScreen(false);
                }
            }
        });
    }

   /* public void setMyWiew(Stage primaryStage) {

        //Button b2= new Button("Left");
        //Button b3= new Button("Rigth");
        //Button b4= new Button("Something");
        Label l1 = new Label("Login");
        Label l2 = new Label("Password");
        TextField t1 = new TextField();
        PasswordField t2 = new PasswordField();
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
        grid.add(t1,1,0);
        grid.add(l2, 0 ,1);
        grid.add(t2,1,1);
        grid.add(box,1,2);
       // grid.add(b2, 1, 0);
        //grid.add(b3, 0, 1);
        //grid.add(b4, 1, 1);

        primaryStage.setScene(scene);
        primaryStage.show();

    }
*/

    public Scene getMyWiew() {

        //Button b2= new Button("Left");
        //Button b3= new Button("Rigth");
        //Button b4= new Button("Something");
        Label l1 = new Label("Login");
        Label l2 = new Label("Password");
        //TextField t1 = new TextField();
        //PasswordField t2 = new PasswordField();
        HBox box = new HBox(10);
        box.setAlignment(Pos.BOTTOM_RIGHT);
        box.getChildren().add(b1);
        Bogdan Bakun, [01.06.18 19:24]
        		GridPane grid = new GridPane();
        		        grid.setAlignment(Pos.CENTER);
        		        grid.setHgap(10);
        		        grid.setVgap(10);
        		        grid.setPadding(new Insets(25, 25, 25, 25));
        		        Scene scene = new Scene(grid, 400, 400);
        		        grid.add(l1, 0, 0);
        		        grid.add(t1, 1, 0);
        		        grid.add(l2, 0, 1);
        		        grid.add(t2, 1, 1);
        		        grid.add(box, 1, 2);
        		        //grid.add(b2, 1, 0);
        		        //grid.add(b3, 0, 1);
        		        //grid.add(b4, 1, 1);
        		        primaryStage.setScene(scene);
        		        primaryStage.show();
        		        grid.add(lab1,0,2);
        		        lab1.setVisible(false);
        		        grid.add(lab2,0,2);
        		        lab1.setVisible(false);
        		        return scene;
        		    }

        		    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
        		       /* Class.forName("com.mysql.jdbc.Driver").newInstance();
        		        Connection conn = null;
        		        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306:portal","root","");
        		        Statement st=conn.createStatement();
        		        String query="SELECT login FROM controller;";
        		        ResultSet rs=st.executeQuery(query);
        		        System.out.print(rs);
        		        //String name = "";
        		        //while(rs.next()){
        		          //  name = rs.getString(1);
        		        //}
        		        //System.out.println(name);*/
        		        launch(args);
        		    }
        		}
