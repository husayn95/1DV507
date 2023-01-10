package hg222ii_assign2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Snowman extends Application {

    public void start(Stage primaryStage) {

    	Group gr = new Group();
    	
    	Circle c1 = new Circle(700, 100, 80);
    	c1.setStroke(Color.YELLOW);
    	c1.setFill(Color.YELLOW);
    	Scene scene1 = new Scene(gr, 800, 600);
    	scene1.setFill(Color.AQUA);
    	
    	Rectangle r1 = new Rectangle(0,400,800,200);
    	r1.setFill(Color.WHITE);
    	
    	Circle c2 = new Circle(400,350,80);
    	c2.setFill(Color.WHITE);
    	
    	Circle c3 = new Circle(400,230,60);
    	c3.setFill(Color.WHITE);
    	
    	Circle c4 = new Circle(400,140,40);
    	c4.setFill(Color.WHITE);
    	
    	Rectangle r2 = new Rectangle(380,150,40,7);
    	r2.setFill(Color.BLACK);    	
    	
    	Circle c5 = new Circle(400, 260, 5);
    	c5.setFill(Color.BLACK);
    	
    	
    	Circle c6 = new Circle(400, 230, 5);
    	c6.setFill(Color.BLACK);
    	
    	
    	Circle c7 = new Circle(400, 200, 5);
    	c7.setFill(Color.BLACK);
    	
    	
    	Circle c8 = new Circle(380, 130, 5);
    	c8.setFill(Color.BLACK);
    	
    	
    	Circle c9 = new Circle(420, 130, 5);
    	c9.setFill(Color.BLACK);
    	
    	gr.getChildren().addAll(c1, r1, c2, c3, c4, r2, c5, c6, c7, c8, c9);
    	primaryStage.setTitle("Snowman");
    	primaryStage.setScene(scene1);
    	primaryStage.show();
    }

    public static void main(String[] args) { //to launch the application

        launch(args);

    }
}
