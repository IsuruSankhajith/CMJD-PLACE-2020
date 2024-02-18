
package lk.ijse.placeorder.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.placeorder.db.DBConnection;
import lk.ijse.placeorder.modal.Customer;
import lk.ijse.placeorder.modal.Item;

public class ItemController {
      public List<String> getAllItemCodes() throws ClassNotFoundException, SQLException{
        Connection connection= DBConnection.getInstance().getConnection();
        String sql="SELECT code FROM Item";
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet set = stm.executeQuery();
        
        List<String> list= new ArrayList<>();
        
        while (set.next()) {            
            list.add(set.getString(1));
        }
        return list;
    }
      
      
      
      
         public Item getItem(String id) throws ClassNotFoundException, SQLException{
         Connection connection= DBConnection.getInstance().getConnection();
        String sql="SELECT * FROM Item WHERE code=?";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setString(1, id);
        ResultSet set = stm.executeQuery();
        
        if (set.next()) {
            return new Item(
                    set.getString(1),
                    set.getString(2),
                    set.getDouble(3),
                    set.getInt(4)
            );
        }
        
        return null;
    }
      
      
}
