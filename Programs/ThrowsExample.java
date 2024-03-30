/**
 * Author: omteja04
 * Description: ThrowsExample
 */

package Programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ThrowsExample {
    static Connection connection;

    /**
     * The function `connect` establishes a connection to a database using the
     * provided URL, username,
     * password, and database name.
     * 
     * @param url      The `url` parameter typically represents the connection URL
     *                 for the database. It
     *                 usually includes information such as the protocol, host,
     *                 port, and database name. For example, a
     *                 MySQL connection URL might look like
     *                 `jdbc:mysql://localhost:3306/`.
     * @param username The `username` parameter is typically a string that
     *                 represents the username used
     *                 to authenticate and connect to a database. It is usually
     *                 associated with a specific user account
     *                 that has been granted access to the database.
     * @param password The `password` parameter in the `connect` method is a
     *                 `String` type, and it
     *                 represents the password required to establish a connection to
     *                 the database specified by the
     *                 `url` and `database` parameters. This password is typically
     *                 used for authentication purposes to
     *                 ensure secure access to the database.
     * @param database The `database` parameter in the `connect` method represents
     *                 the name of the
     *                 database to which you want to establish a connection. It is
     *                 used to specify the specific
     *                 database within the database server that you want to connect
     *                 to.
     */
    static void connect(String url, String username, String password, String database) throws SQLException {
        connection = DriverManager.getConnection(url + database, username, password);
    }

    public static void main(String[] args) {
        try {
            connect("jdbc:mysql://localhost:3306/", "omteja", "teja1234", "jdbc_temp");
            if (connection != null) {
                JOptionPane.showMessageDialog(null, "Successfully Connected", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e.getMessage(), "Oops!!!", JOptionPane.ERROR_MESSAGE);
        }

    }
}
// cSpell:disable
// NOTE
/*
 * SOLID Lo O ante Oper Closed Principle
 * Ippudu manam raasina connect ane function anedhi extend cheskodaniki veelu
 * undali kani modify cheyyadaniki kaadhu so aa conncet function ni evaru
 * vaadinaa sare vaallaki nacchinattu exception handling cheskovali
 * kabatti manam aa connect funcntion ki throws vaadutunnamu
 */
// cSpell:enable
// NOTE
/*
 * It is used with a method to transfer exception without handling it
 */
// ! consider method1() throws exception
/*
 * If method1() throws an exception & method2() calls method1(), then method2()
 * should provide the handling code for the exception being thrown from
 * method1();
 */