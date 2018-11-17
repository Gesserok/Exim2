package ua.com.cib.exim.interfaces;

import ua.com.cib.exim.dao.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Set;

public interface IUser {
    User getUserByLogin(String login) throws SQLException, IOException;
    Set<User> getAllUsers();
}
