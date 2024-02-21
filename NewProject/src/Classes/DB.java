package Classes;

import java.sql.*;
import java.util.ArrayList;

public class DB {
    private static final Connection connection;
    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres" , "postgres","postgres");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public static ArrayList<Items> getallItems() {
        ArrayList<Items> items = new ArrayList<>();

        try {
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM items");
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                Items item = new Items();
                item.setId(resultSet.getLong("id"));
                item.setName(resultSet.getString("name"));
                item.setDescription(resultSet.getString("description"));
                item.setPrice(resultSet.getDouble("price"));
                items.add(item);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return items;
    }

    public static Users getUser(String email){
        Users users = new Users();
        try {
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM users WHERE email = ?");
            stmt.setString(1, email);
            ResultSet resultSet = stmt.executeQuery();
            if(resultSet.next()){
                users.setFullName(resultSet.getString("full_name"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    public static boolean checkUser(String email, String password){
        try {
            PreparedStatement stmt = connection.prepareStatement("SELECT * FROM users " +
                    "WHERE email = ? and password = ?");
            stmt.setString(1, email);
            stmt.setString(2, password);
            ResultSet resultSet = stmt.executeQuery();
            if(resultSet.next()){
                return true;
            }
            else{
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
