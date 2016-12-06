
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Sort extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) {
		VBox vbox = new VBox();
		Scene scene = new Scene(vbox);
		String [] list = new String[10];
		TextField[] text = new TextField[10];
		Button btn = new Button("Submit");
		for(int i=0; i<text.length; i++) {
		text [i] = new TextField("Textfield " + (i+1));
		vbox.getChildren().add(text[i]);

	}

	vbox.getChildren().add(btn);
	btn.setOnAction(e-> {
		String before = "Before sort:\n";
		String after = "\nAfter sort:\n";
		for(int i=0; i<text.length; i++) {
		list[i] = text[i].getText();
		before+=list[i] + "\t";

	}

	SortArray.sort(list);
	for(int i=0; i<text.length; i++) {
	after+=list[i] + "\t";

	}

	Alert alert = new Alert(AlertType.INFORMATION);
	alert.setContentText(before + after);
	alert.showAndWait();

	});

	primaryStage.setScene(scene);
	primaryStage.show();

	}

}
