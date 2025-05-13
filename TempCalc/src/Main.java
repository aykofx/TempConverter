import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double celsius = Double.parseDouble(JOptionPane.showInputDialog("Gebe den Celsius Wert ein"));
		
		//System.out.println(celsius+ " Grad sind "+(celsius*1.8+32)+" Fahrenheit");
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
        FXMLLoader loader = new FXMLLoader(getClass().getResource("temprechner.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        stage.setTitle("Temperaturen Converter");
        stage.setScene(scene);
        stage.show();
	}

}
