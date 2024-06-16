/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clothes.Model;

/**
 *
 * @author ITBIN-2211-0249
 */
public class sellingModel {
    private String seller;
    private String date;
    private String Itemquantity;
    private String  amount;
    

    public sellingModel(){

}    

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
  public sellingModel(String Itemquantity){
    this.Itemquantity = Itemquantity;
}  

    public void setItemquantity(String Itemquantity) {
        this.Itemquantity = Itemquantity;
    }

    public String getItemquantity() {
        return Itemquantity;
    }

    public String getSeller() {
        return seller;
    }

    public String getDate() {
        return date;
    }

    public String getAmount() {
        return amount;
    }

  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
