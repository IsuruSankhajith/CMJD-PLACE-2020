
package lk.ijse.placeorder.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.placeorder.db.DBConnection;

public class OrderController {
    
    
    public String getOrderId() throws ClassNotFoundException, SQLException{
        
        Connection c= DBConnection.getInstance().getConnection();
        String sql="SELECT id FROM Orders ORDER BY id DESC LIMIT 1";
        PreparedStatement stm = c.prepareStatement(sql);
        ResultSet set = stm.executeQuery();
        
        if(set.next()){
            return set.getString(1);
        }
        return null;
    }
    
}
