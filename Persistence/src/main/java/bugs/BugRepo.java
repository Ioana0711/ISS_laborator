package bugs;

import bug.HibernateSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class BugRepo implements IBugRepo{
    @Override
    public void addBug(Bug bug) throws ValidationException {

    }

    @Override
    public void deleteBug(Integer id) throws ValidationException {

    }

    @Override
    public void updateBug(Bug bug) throws ValidationException {

    }

    @Override
    public Bug findBug(Integer id) throws ValidationException {
        return null;
    }

    @Override
    public List<Bug> getAll() {
        SessionFactory sessionFactory = HibernateSession.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            List result = session.createQuery("from Bug").list();
            List<Bug> bugs = new ArrayList<>();
            for(Object o : result){
                Bug bug = (Bug) o;
                bugs.add(bug);
            }
            session.getTransaction().commit();
            return bugs;
        }

    }
}
