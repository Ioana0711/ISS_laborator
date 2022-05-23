package bugs;

import bug.HibernateSession;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class UserRepo implements IUserRepo{
    @Override
    public User findUser(String email) throws ValidationException {
        System.out.println(findUser("ioana@yahoo.com").getParola());
        if(email.equals("")) throw new ValidationException("Email can't be null!");
        SessionFactory sessionFactory = HibernateSession.getSessionFactory();
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Query query = session.createQuery("from User where email = ?");
            query.setParameter(0, email);
            List result = query.getResultList();
            session.getTransaction().commit();
            if(result.size() == 0) throw new ValidationException("User not found!");
            return (User) result.get(0);
        }
    }
}
