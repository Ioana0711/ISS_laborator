import bug.Service;
import bugs.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginBugController{
        public TextField username;
        public PasswordField password;
        public Button submitBtn;
        private Service service;

        public void setService(Service service){
            this.service = service;
        }

        private void openVerificatorWindow(User user) throws IOException {
            Stage stage = (Stage) submitBtn.getScene().getWindow();
            stage.close();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/Verificator.fxml"));
            AnchorPane root = loader.load();
            /*
            SubscriberController controller = loader.getController();
            controller.setService(this.service, user);
            controller.initialize_();
            */
            Scene scene = new Scene(root);
            Stage stage2 = new Stage();
            stage2.setTitle("Verificator " + user.getEmail() + "'s menu");
            stage2.setScene(scene);
            stage2.show();
        }

        private void openProgramatorWindow(User user) throws IOException{
            Stage stage = (Stage) submitBtn.getScene().getWindow();
            stage.close();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/Programator.fxml"));
            AnchorPane root = loader.load();
            /*
            SubscriberController controller = loader.getController();
            controller.setService(this.service, user);
            controller.initialize_();
            */
            Scene scene = new Scene(root);
            Stage stage2 = new Stage();
            stage2.setTitle("Programator " + user.getEmail() + "'s menu");
            stage2.setScene(scene);
            stage2.show();
        }

        public void login(ActionEvent actionEvent) throws IOException {

            String user = username.getText();
            String pass = password.getText();
            String type = service.loginState(new User(user, pass, "unknown"));
            switch (type) {
                case "verificator": {
                    System.out.println("Verificator");
                    openVerificatorWindow(new User(user, pass, type));
                    break;
                }
                case "programator":
                    System.out.println("Programator");
                    openProgramatorWindow(new User(user, pass, type));
                    break;
                default:
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setTitle("Wrong credentials");
                    alert.setHeaderText("");
                    alert.setContentText("Username or password are incorrect");
                    alert.show();
                    break;
                }
        }

        public void openSignUpWindow(User user) throws IOException{

        }
}
