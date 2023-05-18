package com.webapp.dao;
import com.webapp.model.User;
import com.webapp.util.DatabaseConnectionUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
public class UserDaoImpl implements UserDao{
    private Connection connection;
    public UserDaoImpl() {
        try{
            connection = DatabaseConnectionUtil.getConnection();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    @Override
    public void createUser(User user) {
    }
    @Override
    public void updateUser(User user) {
    }
    @Override
    public void deleteUser(int userId) {
    }
    @Override
    public User getUserById(int userId) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
