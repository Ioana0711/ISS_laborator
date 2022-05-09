package bugs;

public interface IVerificatorRepo {
    void addBug(Bug bug) throws ValidationException;
}
