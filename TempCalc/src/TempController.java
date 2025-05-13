import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class TempController {
	
	@FXML
	private TextField eingabe;
	@FXML
	private RadioButton celsius;
	@FXML
	private RadioButton fahrenheit;
	@FXML
	private Label ausgabe;

	@FXML
	private void initialize() {
		ausgabe.setText("");
		ausgabe.setMaxWidth(Double.MAX_VALUE);
		ausgabe.setAlignment(Pos.CENTER);
	}
	
	@FXML
	private void berechen(ActionEvent event) {
		double eingabeWert = Double.parseDouble(eingabe.getText());
		double finalWert = 0;
		String finalErgebnis;
		
		if (celsius.isSelected()) {
			finalWert = (eingabeWert - 32) * (5.0 / 9);
			finalErgebnis = String.format("%.2f", finalWert);
			ausgabe.setText(eingabeWert + " Fahrenheit sind "+finalErgebnis+" Celsius.");
		}
		if (fahrenheit.isSelected()) {
			finalWert = (eingabeWert * (9.0 / 5)) + 32;
			finalErgebnis = String.format("%.2f", finalWert);
			ausgabe.setText(eingabeWert + " Celsius sind "+finalErgebnis+" Fahrenheit.");
		}
		
	}
}
