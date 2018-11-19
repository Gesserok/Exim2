package ua.com.cib.exim.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import ua.com.cib.exim.dao.User;

import java.util.ArrayList;
import java.util.List;

public class DBAccess {
    final SessionFactory sessionFactory;
    Session session;

    @Autowired
    public DBAccess(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
         this.session = sessionFactory.openSession();
    }

    public String getVersion(){
        String version = (String) session.createSQLQuery("select version()").getSingleResult();
        session.close();
        return version;
    }

    public List<User> getUsers(){
        Query query = session.createNativeQuery("SELECT * FROM users;");
        query.setResultTransformer(Transformers.aliasToBean(User.class));
        List<User> users = (ArrayList<User>) query.getResultList();
        return users;
    }
}
