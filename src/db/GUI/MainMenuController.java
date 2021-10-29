package db.GUI;

import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainMenuController implements Initializable {
	@FXML
	private PasswordField PasswordTextField;

	@FXML
	private TextField UserTextField;
	@FXML
	private Label labelDate;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		}

		

	@FXML
	void OnSignUpClick(ActionEvent event) {

		

	}
    @FXML
    void opengit(MouseEvent event) {
    	try {

            Desktop.getDesktop().browse(new URI("https://github.com/afuente9/COVID_APP"));

        } catch (URISyntaxException ex) {


        }catch(IOException e){


        }
    }
    @FXML
    void openyt(MouseEvent event) {
    	try {

            Desktop.getDesktop().browse(new URI("https://www.youtube.com/channel/UCBQV-dq1lpqNpiz5kmO7V8Q"));

        } catch (URISyntaxException ex) {


            
        }catch(IOException e){


        }}
	 @FXML
	    void openurl(MouseEvent event) {
		 try {

	            Desktop.getDesktop().browse(new URI("https://alvarodelafuentebo.wixsite.com/covidist"));

	        } catch (URISyntaxException ex) {


	        }catch(IOException e){


	        }
	    }

	@FXML
	void onClose(ActionEvent event) {
		Stage stage = (Stage) this.PasswordTextField.getScene().getWindow();
		
		stage.close();

		System.exit(0);
	}

	@FXML
	void OnEnterUser(ActionEvent event) {
		
		}

		
	void openWindow(String name, Object controller, String title) {
		try {
			Pane root0 = (Pane) this.PasswordTextField.getScene().getRoot();

			 ColorAdjust adj = new ColorAdjust(0, -0.9, -0.5, 0);

			 GaussianBlur blur = new GaussianBlur(10); 
			    adj.setInput(blur);
			 root0.setEffect(adj);
			FXMLLoader loader = new FXMLLoader(getClass().getResource(name));
			Parent root;

			root = loader.load();

			controller = loader.getController();
			Scene scene = new Scene(root);
			Stage stage = new Stage();
			stage.setResizable(false);
stage.setTitle(title);
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(scene);
			stage.getIcons().add(new Image("https://image.flaticon.com/icons/png/512/2833/2833315.png"));

			stage.showAndWait();
			
			root0.setEffect(null);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@FXML
    void ondeleteaccount(MouseEvent event) {
		

		
    }
	
}

