package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import bean.LoginBean;


/**
 * ・社員情報検索サービス
 *
 * @author s.nanaumi
 * @since 2019/03/15
 *
 */

public class UserService {
    private static final String POSTGRES_DRIVER = "org.postgresql.Driver";
    /** ・JDMC接続先情報 */
    private static final String JDBC_CONNECTION = "jdbc:postgresql://localhost:5432/Employee";

    /** ・ユーザー名 */
    private static final String USER = "postgres";
    /** ・パスワード */
    private static final String PASS = "postgres";
    /** ・タイムフォーマット */
    private static final String TIME_FORMAT = "yyyy/MM/dd HH:mm:ss";

    /** ・SQL UPDATE文 */
    private static final String SQL_UPDATE = "UPDATE last_login SET login_time = ? WHERE id = ?";
    /** ・SQL SELECT文 */
    private static final String SQL_SELECT = "SELECT * FROM USERS WHERE id=? AND password=?";

    LoginBean loginData = null;

    // 送信されたIDとPassWordを元に社員情報を検索するためのメソッド
    public void search(String id, String password) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;



    }
}
