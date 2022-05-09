import bug.Service;
import bugs.BugRepo;
import bugs.IBugRepo;
import bugs.IUserRepo;
import bugs.UserRepo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartApp extends Application {

    public static void main(String[] args) {
        try {
            launch(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        IUserRepo userRepo = new UserRepo();
        IBugRepo bugRepo = new BugRepo();

        Service service = new Service(userRepo, bugRepo);

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/loginBug.fxml"));
        Parent loginWindow = loader.load();
        LoginBugController loginBugController = loader.getController();
        loginBugController.setService(service);
        primaryStage.setOnCloseRequest(event -> System.exit(0));
        primaryStage.setTitle("BugApplication");
        primaryStage.setScene(new Scene(loginWindow, 700, 500));
        primaryStage.show();

    }
}
