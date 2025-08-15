package ra.spring_hibernate_orm.models.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ra.spring_hibernate_orm.models.dao.IUserDao;
import ra.spring_hibernate_orm.models.entity.User;

import java.util.List;

@Repository
public class UserDaoImpl implements IUserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<User> findAll() {
        // mở session
        Session session = sessionFactory.openSession();
        // thực hiện truy vấn
        List<User> userList = session.createQuery("SELECT u FROM User u", User.class).list();
        // đóng session
        session.close();
        return userList;
    }

    @Override
    public boolean addUser(User user) {
        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            return false;
        } finally {
            session.close();
        }
        return true;
    }
}
