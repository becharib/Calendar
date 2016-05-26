package fr.iutvalence.info.dut.m2107.swing;

import javafx.animation.FillTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BoutonApple extends Application{
   
    private boolean isSwitch = false;
   
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
       
        Pane root = new Pane();
        root.setPrefSize(400, 400);
        Rectangle rg = new Rectangle(65, 30);
        rg.setFill(Color.WHITE);
        rg.setStroke(Color.LIGHTGRAY);
       
        rg.setTranslateY(175);
        rg.setTranslateX(125);
       
       
        rg.setArcHeight(65);
        rg.setArcWidth(30);
       
   
       
        Circle cs = new Circle(15);
        cs.setFill(Color.WHITE);
        cs.setStroke(Color.LIGHTGRAY);
       
        cs.setTranslateY(190);
        cs.setTranslateX(140);
       
        rg.setOnMouseClicked(event -> {
           
            if(isSwitch == false){
           
            TranslateTransition tr = new TranslateTransition(Duration.seconds(0.25), cs);
            FillTransition ft = new FillTransition(Duration.seconds(0.25), rg);
           
            tr.setToX(180);
            ft.setFromValue(Color.WHITE);
            ft.setToValue((Color) Paint.valueOf("#46d86b"));
            tr.play();
            ft.play();
            ft.setOnFinished(evt -> {
               
                isSwitch = true;
                //Mettre vos instructions quand le bouton est ON
            });
           
           
            }if(isSwitch == true){
               
                TranslateTransition tr = new TranslateTransition(Duration.seconds(0.25), cs);
                FillTransition ft = new FillTransition(Duration.seconds(0.25), rg);
               
                tr.setToX(140);
                ft.setFromValue((Color) Paint.valueOf("#46d86b"));
                ft.setToValue(Color.WHITE);
                tr.play();
                ft.play();
                ft.setOnFinished(evt -> {
                    isSwitch = false;
                   
                    //Mettre vos instructions quand le bouton est OFF
                    });
               
                }
           
        });
       
        root.getChildren().addAll(rg, cs);
        Scene scene = new Scene(root);
       
        stage.setScene(scene);
        stage.show();
    }

}