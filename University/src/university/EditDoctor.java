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

public class EditDoctor extends javax.swing.JFrame {
    Connection con =null;
PreparedStatement com=null;
ResultSet res=null;

    /**
     * Creates new form EditDoctor
     */
    public EditDoctor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        E_D_N2 = new javax.swing.JLabel();
        D_Name2 = new javax.swing.JTextField();
        D_password2 = new javax.swing.JPasswordField();
        D_Mobile2 = new javax.swing.JTextField();
        E_D_M2 = new javax.swing.JLabel();
        E_D_P2 = new javax.swing.JLabel();
        Edit_d_show2 = new javax.swing.JLabel();
        D_ID2 = new javax.swing.JTextField();
        Edit2 = new javax.swing.JButton();

        setName("editDoctor"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText(" Edit Doctor");

        E_D_N2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        E_D_N2.setText(" Doctor Name");

        D_Name2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_Name2ActionPerformed(evt);
            }
        });

        D_password2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_password2ActionPerformed(evt);
            }
        });

        D_Mobile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_Mobile2ActionPerformed(evt);
            }
        });

        E_D_M2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        E_D_M2.setText("       Mobile");

        E_D_P2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        E_D_P2.setText(" Doctor password");

        Edit_d_show2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Edit_d_show2.setText(" Doctor Id");

        D_ID2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_ID2ActionPerformed(evt);
            }
        });
        D_ID2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                D_ID2KeyPressed(evt);
            }
        });

        Edit2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Edit2.setText("Edit");
        Edit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Edit_d_show2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E_D_N2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(E_D_P2)))
                            .addComponent(E_D_M2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(D_Name2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D_password2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D_Mobile2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(Edit2)))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit_d_show2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(E_D_N2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D_Name2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(E_D_P2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D_password2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(E_D_M2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D_Mobile2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(Edit2)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        setSize(new java.awt.Dimension(622, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void D_Name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_Name2ActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_D_Name2ActionPerformed

    private void D_password2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_password2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D_password2ActionPerformed

    private void D_Mobile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_Mobile2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D_Mobile2ActionPerformed

    private void D_ID2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_ID2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D_ID2ActionPerformed

    private void Edit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit2ActionPerformed
        // TODO add your handling code here:
         if(D_ID2.getText().equals("")||D_Name2.getText().equals("")||D_password2.getText().equals("")||D_Mobile2.getText().equals("")){
        JOptionPane.showMessageDialog(null, " data is uncomplete");
        
        }else{
           try{
            int DID2=Integer.parseInt(D_ID2.getText().trim());
            try{
            int mobile= Integer.parseInt(D_Mobile2.getText()); // to make sure the phone number is correct
            }catch(Exception e){
                    JOptionPane.showMessageDialog(null, " please enter mobile number correctly");

            }
             if(DID2>=2000&&DID2<=3000){
            try {
                con=connectionDataBase.connect();
                String sql="UPDATE Doctor SET doctor_name =?, password= ?,mobile=? where D_id='"+DID2+"'";
                com=con.prepareStatement(sql);
                com.setString(1, D_Name2.getText());
                                com.setString(2, D_password2.getText());
                com.setString(3, D_Mobile2.getText());
com.executeUpdate();
          //      com=con.prepareStatement("update Doctor where D_id='"+DID2+"' set doctor_name ='"+D_Name2.getText()+"',password='"+D_password2.getText()+"',mobile="+D_Mobile2.getText()+")");
             /*com=con.prepareStatement("UPDATE Doctor SET doctor_name = '"+D_Name2.getText()+"', password= '" +D_password2.getText()+"',mobile='"+ D_Mobile2.getText()+"WHERE D_id='"+DID2+")");
                
             
                */
               D_ID2.setText("");
               D_Name2.setText("");
               D_password2.setText("");
               D_Mobile2.setText("");
               D_ID2.setEnabled(true);
                D_Name2.setEnabled(false);
                  D_password2.setEnabled(false);
                  D_Mobile2.setEnabled(false);
               
                     JOptionPane.showMessageDialog(null, "student Edited");

                  
         
         
         
         }catch(Exception e){
         
         System.out.println(e);
         
         }
            
                  
                 
          
           
        
        
        }else{
             JOptionPane.showMessageDialog(null, " Doctor id must be in the range of 2000 to 3000");
            }}catch(Exception e){
                JOptionPane.showMessageDialog(null, "ID must be interger");
            }finally{
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AddDoctor.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }
       
        
        }
            
            
    
        
        
        
        
    }//GEN-LAST:event_Edit2ActionPerformed

    private void D_ID2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_D_ID2KeyPressed
if(evt.getKeyCode()==evt.VK_ENTER){
if(D_ID2.getText().equals("")){
        JOptionPane.showMessageDialog(null, "please enter ID ");


}else{
try{
int D_ID_INT=Integer.parseInt(D_ID2.getText());
try{
con=connectionDataBase.connect();
com=con.prepareStatement("select *from Doctor where D_id='"+D_ID_INT+"' ");
res=com.executeQuery();
if(!(res.next())){
  JOptionPane.showMessageDialog(null, " ID is not in the database");
    
}else{
 D_ID2.setEnabled(false);
  D_Name2.setEnabled(true);
  D_Mobile2.setEnabled(true);
  D_password2.setEnabled(true);
  Edit2.setEnabled(true);
 D_Name2.setText(res.getString(1));
 D_Mobile2.setText(res.getString(3));



}
}catch(Exception e){
System.out.println(e);

}

}catch(Exception e){
  JOptionPane.showMessageDialog(null, " ID must be intger");

}finally{

    try {
        con.close();
    } catch (SQLException ex) {
        Logger.getLogger(EditDoctor.class.getName()).log(Level.SEVERE, null, ex);
    }
}

} 

}


        // TODO add your handling code here:
    }//GEN-LAST:event_D_ID2KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField D_ID2;
    public javax.swing.JTextField D_Mobile2;
    public javax.swing.JTextField D_Name2;
    public javax.swing.JPasswordField D_password2;
    private javax.swing.JLabel E_D_M2;
    private javax.swing.JLabel E_D_N2;
    private javax.swing.JLabel E_D_P2;
    protected javax.swing.JButton Edit2;
    private javax.swing.JLabel Edit_d_show2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void Clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
