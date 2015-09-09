package ui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CharacterPage {
	
	public static Scene createCharacterPage(Stage stage, Parent root) throws IOException {
		
		Scene scene = new Scene(root, 400, 200);
		HBox row = new HBox();
		row.setPadding(new Insets(20));
		VBox names = new VBox();
		names.setPadding(new Insets(20));
		BufferedReader input = new BufferedReader(new FileReader("res\\skills.txt"));
		String line = null;
		
			do {
				try {
					line = input.readLine();
					System.out.println(line);
				} catch (IOException e) {
					e.printStackTrace();
				} 
			} while (line != null);
		input.close();
		return scene;
	}

}
