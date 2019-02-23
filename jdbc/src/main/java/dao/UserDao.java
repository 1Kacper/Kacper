package dao;

import config.Database;
import domain.User;
import jdk.nashorn.internal.objects.annotations.Where;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserDao {
    private Database db;

    public UserDao(Database database) {
        this.db = database;
    }


    //inser
        public void save (User user) throws SQLException {

            Connection connection = db.getConnection();

            PreparedStatement ps = connection.prepareStatement("INSERT INTO user(first_name,last_name,email)" + " VALUES (?,?,?)");
            ps.setString(1,user.getFirstName());
            ps.setString(2,user.getLastName());
            ps.setString(3,user.getEmail());

            ps.executeUpdate();
        }
        //Upadate
        public void upadete (User user) throws SQLException{
        Connection connection = db.getConnection();
      String sql = "UPDATE user SET first_name=?,last_name=?,email=?" + "WHERE id = ?";

      PreparedStatement ps = connection.prepareStatement(sql);
      ps.setString(1,user.getFirstName());
      ps.setString(2,user.getLastName());
      ps.setString(3,user.getEmail());
      ps.setInt(4,user.getId());
             ps.executeUpdate();
        }
        //delete
        public void delete ( int id){

        }
        //findAll
        public List<User> findAll () {
            return null;
        }
        //findById
        public User findById ( int id){
            return null;
        }
    }

