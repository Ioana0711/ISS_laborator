package bugs;

public interface IProgramatorRepo {
    void deleteBug(Integer id) throws ValidationException;
    void updateBug(Bug bug) throws ValidationException;
}
