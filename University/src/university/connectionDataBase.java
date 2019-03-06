
package university;

import java.awt.HeadlessException;
import static java.lang.Character.UnicodeBlock.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class connectionDataBase {
static Connection con=null;
    public static Connection connect(){
    try{
         Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
    //class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
    con=DriverManager.getConnection("jdbc:ucanaccess://University.accdb");
   // JOptionPane.showMessageDialog(null, "connection done");
    
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
        
    
    }
return con;    
    
       
   }
    
   public static void main(String[] args ){
   con=connect();
   
   } 
    
}
