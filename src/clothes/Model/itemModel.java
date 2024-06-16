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
public class itemModel {
    
    private  String Itemname;
    private  String Itemcategory;
    private  String Itemprice;
    private  String Itemfilter;
    private int  Id;
    
public itemModel(){
}

public itemModel(String Itemname,String Itemcategory, String Itemprice,String Itemfilter){
   this.Itemname=Itemname;
   this.Itemcategory=Itemcategory;
   this.Itemprice=Itemprice;
   this.Itemfilter=Itemfilter; 
}

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setItemname(String Itemname) {
        this.Itemname = Itemname;
    }

    public void setItemcategory(String Itemcategory) {
        this.Itemcategory = Itemcategory;
    }

    public void setItemprice(String Itemprice) {
        this.Itemprice = Itemprice;
    }

    public void setItemfilter(String Itemfilter) {
        this.Itemfilter = Itemfilter;
    }

    public String getItemname() {
        return Itemname;
    }

    public String getItemcategory() {
        return Itemcategory;
    }

    public String getItemprice() {
        return Itemprice;
    }

    public String getItemfilter() {
        return Itemfilter;
    }

    public int getId() {
        return Id;
    }



    
    
    
    
    
    
    
    
    
    
}
