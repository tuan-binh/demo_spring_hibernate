package ra.spring_hibernate_orm.models.dao;

import ra.spring_hibernate_orm.models.entity.User;

import java.util.List;

public interface IUserDao {

    List<User> findAll();

    boolean addUser(User user);

}
