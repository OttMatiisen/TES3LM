package ui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CharacterPage {
	
	public Scene createCharacterPage(Stage stage, Group root) {
		
		Scene scene = new Scene(root, 400, 200);
		HBox row = new HBox();
		row.setPadding(new Insets(20));
		VBox names = new VBox();
		names.setPadding(new Insets(20));
		BufferedReader input = new BufferedReader(new FileReader("res\\skills.txt"));
		
		while (input.readLine() =! null) {
			try {
			} catch (IOException ex) {
				ex.printStackTrace();
			} 
		}
		return scene;
	}

}
