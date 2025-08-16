package ra.spring_hibernate_orm.models.dao;

import ra.spring_hibernate_orm.models.entity.User;

import java.util.List;

public interface IUserDao {

    List<User> findAll(int page,int size);

    boolean addUser(User user);

}
