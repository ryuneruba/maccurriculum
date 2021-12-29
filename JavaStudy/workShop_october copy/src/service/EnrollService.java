package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bean.LoginBean;


/**
 * ・社員情報検索サービス
 *
 * @author s.nanaumi
 * @since 2019/03/15
 *
 */

public class EnrollService {
    private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
    /** ・JDMC接続先情報 */
    private static final String JDBC_CONNECTION = "jdbc:postgresql://localhost:5432/lesson_db";

    /** ・ユーザー名 */
    private static final String USER = "postgres";
    /** ・パスワード */
    private static final String PASS = "postgres";

    private static final String SQL_INSERT = "INSERT into USERS(name, password) values (?, ?)";

    LoginBean loginData = null;


    public LoginBean search(String username, String password) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        try {
            // データベースに接続
            Class.forName(POSTGRES_DRIVER);
            connection = DriverManager.getConnection(JDBC_CONNECTION, USER, PASS);
            statement = connection.createStatement();
            preparedStatement = connection.prepareStatement(SQL_INSERT);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String loginId = resultSet.getString("id");
                String loginPass = resultSet.getString("password");
                String loginName = resultSet.getString("name");
                String loginTime = resultSet.getString("last_login");
                loginData = new LoginBean();
                loginData.setId(loginId);
                loginData.setPass(loginPass);
                loginData.setId(loginName);
                loginData.setPass(loginTime);
            }
            // forName()で例外発生
        } catch (ClassNotFoundException e) {
            e.printStackTrace();

            // getConnection()、createStatement()、executeQuery()で例外発生
        } catch (SQLException e) {
            e.printStackTrace();

        } finally {
            try {

                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return loginData;
    }

}
