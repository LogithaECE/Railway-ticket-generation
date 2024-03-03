package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SampleController {
	@FXML
	private Button SignUp,ticket;
	@FXML
	private Button chennai,theni;
	@FXML
	private Button nv,first;
	@FXML
	private Label destination,class1,bording,food;
	@FXML
	TextField txtuser = new TextField();
	@FXML
	private PasswordField txtpass;
@FXML
	
	public void switchtoHome(ActionEvent event) throws IOException {
		AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Sample.fxml"));
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
@FXML

public void switchtoregister(ActionEvent event) throws IOException {
	AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Ticketpage.fxml"));
	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	Scene scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
@FXML

public void switchtoverify(ActionEvent event) throws IOException {
	AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("last.fxml"));
	Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	Scene scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
@FXML
public void choice(ActionEvent event)throws IOException{
	destination.setText(chennai.getText());
	food.setText(nv.getText());
	class1.setText(first.getText());
	bording.setText(theni.getText());
}
}
