/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;

/**
 *
 * @author ahmed
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Check_data_exist {
   Connection con=null;
    PreparedStatement com=null;
    ResultSet res=null;
  
   public void CheckDataExist(String table,String id,int equals) throws SQLException{

       try{
       String sql="select *from '"+table+"'  where '"+id+"' ='"+equals+"' ";
      // "delete from Doctor where D_id='"+Check_D_Int+"' ";
    //   sql=select *from Doctor  where  D_id='"+Check_D_Int+"'";
con=connectionDataBase.connect();
       com=con.prepareStatement(sql);
      // com.setString(1,table);
        //      com.setString(2,id);
           //  String  equalsString=Integer.toString(equals);
                     //com.setString(1,equals);
res=com.executeQuery();
if(res.next()){
System.out.print(" done");

}


       }catch(Exception e){
System.out.print(e+" ");

        }

       
   
   //return R;
   }
    
    
    
    
}
