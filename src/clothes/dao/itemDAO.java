/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clothes.dao;

import clothes.DataBase.DBConnection;
import clothes.Model.itemModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import clothes.dao.itemDAO;
import clothes.DataBase.DBConnection;

/**
 *
 * @author TUF
 */
public class itemDAO {
    

public void additem( itemModel  item ) {
        
        
         String sql;
        sql = "INSERT INTO productbl(PName,category,price) VALUES(?,?,?)";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,item.getItemname());
            stmt.setString(2,item.getItemcategory());
            stmt.setString(3,item.getItemprice());
         
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

 public void update(itemModel item){
        String sql = "UPDATE productbl SET PName = ?, 	category = ?, 	price = ? WHERE PNum = ?";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,item.getItemname());
            stmt.setString(2,item.getItemcategory());
            stmt.setString(3,item.getItemprice());
            stmt.setInt(4,item.getId());
            stmt.executeUpdate();
//            JOptionPane.showMessageDialog(new JFrame(),"DATA Updated Successfully ");
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

 public void delete(int id) throws SQLException {
       
       System.out.println(id);
       
        String deleteQuery = "DELETE FROM productbl WHERE PNum = '"+id+"'";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement pst = connection.prepareStatement(deleteQuery);
          //  ResultSet rs = pst.executeQuery();
         
            pst.executeUpdate();
            
//            JOptionPane.showMessageDialog(new JFrame(),"DATA Deleted Successfully ");
        } catch (SQLException e) {
            e.printStackTrace();
    }
        
     }

 public List<String[]> getAllItems() {
    List<String[]> userData = new ArrayList<>();

    String getData = "SELECT * FROM productbl";

    try{
        Connection connection = DBConnection.getConnection();
         PreparedStatement pst = connection.prepareStatement(getData);
         ResultSet rs = pst.executeQuery();

      while (rs.next()) {
        String[] user = new String[4]; // Assuming username and password
        
                user[0] = String.valueOf(rs.getInt("PNum")); 
                user[1] = rs.getString("PName");
                user[2] = rs.getString("category");
                user[3] = rs.getString("price"); 
               
                
                
                userData.add(user);
       
      }
      } catch (SQLException e) {
      e.printStackTrace();
    }

    return userData;
    
  }
}   