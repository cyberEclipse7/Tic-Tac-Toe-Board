package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Image oImage = new Image("images/o.gif");
        Image xImage = new Image("images/x.gif");

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11, 12, 13, 14));
        pane.setHgap(5);
        pane.setVgap(5);

        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                int randomNumber = (int)(Math.random() * 3);
                if(randomNumber == 0)
                {
                    ImageView O = new ImageView(oImage);
                    pane.add(O, i, j);
                }
                else if(randomNumber == 1)
                {
                    ImageView X = new ImageView(xImage);
                    pane.add(X, i, j);
                }
                else
                {
                    ImageView emptyCell = new ImageView();
                    pane.add(emptyCell,  i, j);
                }
            }
        }

        Scene scene = new Scene(pane, 130, 130);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
