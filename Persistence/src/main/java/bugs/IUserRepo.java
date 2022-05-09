package bugs;

public interface IUserRepo {
    User findUser(String username) throws ValidationException;
}
