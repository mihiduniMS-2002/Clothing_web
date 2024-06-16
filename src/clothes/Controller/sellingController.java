/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clothes.Controller;

import clothes.Model.sellingModel;
import clothes.View.sellingView;
import clothes.dao.sellingDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author ITBIN-2211-0249
 */
public class sellingController {
   
    
    private final sellingView view;
    private  sellingDAO dao;
    
    
      public sellingController(sellingView view) {
         this.view = view;
         this.dao = new sellingDAO(); 
        initComponents();
    }
    
    public sellingController() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
     public void selling1(  sellingModel selling2    ) {
        try {
            dao.selling(selling2);
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Error deleting user: " + e.getMessage());
        }
    }
    

    
}
