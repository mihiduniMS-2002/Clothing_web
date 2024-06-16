/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clothes.Controller;

import clothes.Model.itemModel;
import clothes.View.itemView;
import clothes.dao.itemDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author ITBIN-2211-0249
 */
public class itemController {
    
   
    private final itemView view;
    private  itemDAO dao; 
    
    
    public itemController(itemView view) {
        this.view = view;
        this.dao = new itemDAO(); 
        initComponents();
    }
    
    private void initComponents() {
         //To change body of generated methods, choose Tools | Templates.
        
    }
    
 public void delete(int id) {
        try {
            dao.delete(id);
            //view.refreshTableData(); // Optional: Update table data after successful deletion (implementation depends on your table model)
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Error deleting user: " + e.getMessage());
        }
    }
    
     public void update1(itemModel item ) {
     
        try {
            dao.update(item);
            //view.refreshTableData(); // Optional: Update table data after successful deletion (implementation depends on your table model)
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Error deleting user: " + e.getMessage());
        }
    }
}
