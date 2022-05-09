package bugs;

import java.util.List;

public interface IBugRepo {
    void addBug(Bug bug) throws ValidationException;
    void deleteBug(Integer id) throws ValidationException;
    void updateBug(Bug bug) throws ValidationException;
    Bug findBug(Integer id) throws ValidationException;
    List<Bug> getAll();
}
