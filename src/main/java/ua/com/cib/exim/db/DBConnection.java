//package ua.com.cib.exim.db;
//
//        import ua.com.cib.exim.Application;
//
//        import java.sql.Connection;
//        import java.sql.DriverManager;
//        import java.sql.SQLException;
//        import java.util.Properties;
//
//public class DBConnection {
//    public static final String JDBC_URL =
//            Application.context.getBean("JDBC_URL",String.class);
//    private static final String user = Application.context.getBean("JDBC_USER",String.class);
//    private static final String password = Application.context.getBean("JDBC_PASSWD",String.class);
//
//    public static Connection connection = null;
//
//    static {
//        try {
//            try {
//                Class.forName("com.mysql.jdbc.Driver");
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//            connection = DriverManager.getConnection(JDBC_URL, user, password);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//}
