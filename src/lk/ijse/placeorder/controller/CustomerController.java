
package lk.ijse.placeorder.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.placeorder.db.DBConnection;
import lk.ijse.placeorder.modal.Customer;

public class CustomerController {
    
    public List<String> getAllCustomerIds() throws ClassNotFoundException, SQLException{
        Connection connection= DBConnection.getInstance().getConnection();
        String sql="SELECT id FROM Customer";
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet set = stm.executeQuery();
        
        List<String> list= new ArrayList<>();
        
        while (set.next()) {            
            list.add(set.getString(1));
        }
        return list;
    }
    
    public Customer getCustomer(String id) throws ClassNotFoundException, SQLException{
         Connection connection= DBConnection.getInstance().getConnection();
        String sql="SELECT * FROM Customer WHERE id=?";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setString(1, id);
        ResultSet set = stm.executeQuery();
        
        if (set.next()) {
            return new Customer(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getDouble(4)
            );
        }
        
        return null;
    }
    
}
