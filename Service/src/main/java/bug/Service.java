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

    public void addBug(Bug bug) throws ValidationException{
        bugRepo.addBug(bug);
    }

    public void updateBug(Bug bug) throws ValidationException{
        bugRepo.updateBug(bug);
    }

    public void deleteBug(Integer id) throws ValidationException{
        bugRepo.deleteBug(id);
    }

    public boolean findUser(String username) throws ValidationException{
        return userRepo.findUser(username) != null;
    }

}
