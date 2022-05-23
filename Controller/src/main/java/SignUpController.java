import bug.Service;

import java.awt.event.ActionEvent;

public class SignUpController {

    private Service service;

    private void verifyData(){

    }

    public void handleSignUpButton(ActionEvent actionEvent){
        verifyData();
    }

    public void setService(Service service) {

        this.service = service;

    }
}
