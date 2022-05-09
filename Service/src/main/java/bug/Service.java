package bug;

import bugs.*;

import java.util.List;

public class Service {

    IUserRepo userRepo;
    IBugRepo bugRepo;

    public Service(IUserRepo userRepo, IBugRepo bugRepo){
        this.userRepo = userRepo;
        this.bugRepo = bugRepo;
    }

    public String loginState(User user) throws ValidationException {

        if(userRepo.findUser(user.getEmail()) == null)
            return "null";
        if(userRepo.findUser(user.getEmail()).getParola().equals(user.getParola()))
            return userRepo.findUser(user.getEmail()).getTip();
        return "null";
    }

    public List<Bug> getBugs(){
        System.out.println("Entering getAll in repo");
        return bugRepo.getAll();
    }


}
