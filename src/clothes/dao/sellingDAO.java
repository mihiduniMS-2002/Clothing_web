/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clothes.dao;

import clothes.DataBase.DBConnection;
import clothes.Model.sellingModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author TUF
 */
public class sellingDAO {
    
   public void selling(sellingModel selling2 ) {
        
        
         String sql;
        sql = "INSERT INTO billtbl (Seller,Amount) VALUES(?,?)";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,selling2.getSeller());
            stmt.setString(3,selling2.getAmount());
          
         
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
