package ui;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class CharacterPage {

	public static Scene createCharacterPage(Stage stage, BorderPane root) throws IOException {

		Scene scene = new Scene(root, 400, 600);
		BorderPane titlePane = createTitlePane();
		GridPane managerPane = createManagerPane();
		root.setCenter(managerPane);
		root.setTop(titlePane);
		return scene;
	}

	/**
	 * @return
	 */
	private static BorderPane createTitlePane() {

		BorderPane titlePane = new BorderPane();
		titlePane.setPadding(new Insets(0, 0, 20, 0));
		Label title = new Label("Anuriel Delgado");
		title.setFont(new Font(20));
		Label level = new Label("Level 10");
		Label race = new Label("Redguard");
		VBox titleBox = new VBox();
		titleBox.setAlignment(Pos.CENTER);
		titlePane.setCenter(titleBox);
		titleBox.getChildren().addAll(title, level, race);
		return titlePane;
	}

	private static GridPane createManagerPane() {
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(5));
		try {
			String line = "a";
			int i = 0;
			BufferedReader reader = new BufferedReader(new FileReader("res\\skills.txt"));			
			while (!line.isEmpty()) {
				line = reader.readLine();
				pane.add(new Label(line), 0, i);
				TextArea text = new TextArea();
				text.setPrefWidth(20);
				text.setPrefHeight(15);
				if (!line.isEmpty()) {
					pane.add(text, 1, i);
				}
				i++;
			}
			reader.close();
			pane.add(new Label("aa"), 0, i);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pane;

	}

}
