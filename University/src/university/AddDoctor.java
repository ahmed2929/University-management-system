/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

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
public class AddDoctor extends javax.swing.JFrame {
Connection con =null;
PreparedStatement com=null;
ResultSet res=null;
    /**
     * Creates new form AddDoctor
     */
    public AddDoctor() {
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
        AddDoctor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        D_Name = new javax.swing.JTextField();
        D_ID = new javax.swing.JTextField();
        AddButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        D_Mobile = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        D_male = new javax.swing.JRadioButton();
        D_Female = new javax.swing.JRadioButton();
        D_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Doctor");
        setMaximumSize(new java.awt.Dimension(559, 412));
        setMinimumSize(new java.awt.Dimension(559, 412));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("  AddDoctor");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText(" Doctor Id");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText(" Doctor password");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText(" Doctor Name");

        D_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_NameActionPerformed(evt);
            }
        });

        D_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_IDActionPerformed(evt);
            }
        });

        AddButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddButton.setText("ADD");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("       Mobile");

        D_Mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_MobileActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("   Gender");

        buttonGroup1.add(D_male);
        D_male.setText("Male");

        buttonGroup1.add(D_Female);
        D_Female.setText("female");
        D_Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_FemaleActionPerformed(evt);
            }
        });

        D_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddDoctorLayout = new javax.swing.GroupLayout(AddDoctor);
        AddDoctor.setLayout(AddDoctorLayout);
        AddDoctorLayout.setHorizontalGroup(
            AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddDoctorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AddButton)
                .addGap(230, 230, 230))
            .addGroup(AddDoctorLayout.createSequentialGroup()
                .addGroup(AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddDoctorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddDoctorLayout.createSequentialGroup()
                                .addGroup(AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(45, 45, 45)
                                .addGroup(AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(D_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(D_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(D_password, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(D_Mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(AddDoctorLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(D_male)
                                .addGap(18, 18, 18)
                                .addComponent(D_Female))))
                    .addGroup(AddDoctorLayout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        AddDoctorLayout.setVerticalGroup(
            AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddDoctorLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D_Mobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(AddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D_male)
                    .addComponent(D_Female))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(AddButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(AddDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(25, Short.MAX_VALUE)
                    .addComponent(AddDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        setSize(new java.awt.Dimension(575, 514));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void D_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D_NameActionPerformed

    private void D_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D_IDActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        if(D_ID.getText().equals("")||D_Name.getText().equals("")||D_password.getText().equals("")||D_Mobile.getText().equals("")||(!D_male.isSelected()&&!D_Female.isSelected())){
        JOptionPane.showMessageDialog(null, " data is uncomplete");
        
        }else{
            try{
            int DID=Integer.parseInt(D_ID.getText().trim());
            try{
            int mobile= Integer.parseInt(D_Mobile.getText()); // to make sure the phone number is correct
            }catch(Exception e){
                    JOptionPane.showMessageDialog(null, " please enter mobile number correctly");

            }
            if(DID>=2000&&DID<=3000){
            try {
                con=connectionDataBase.connect();
                com=con.prepareStatement("select *from Doctor  where  D_id='"+DID+"'");
                 res=com.executeQuery();
                  if(res.next()){
            JOptionPane.showMessageDialog(null, " the id id already exist");
            
            }else{
                  //add code
                  String g="male";
                  if(D_Female.isSelected()){
                      g="female";
                 }
                 try{
                 // com=con.prepareStatement("insert into Doctor values('"+DID+"','"+D_Name.getText()+"','"+D_password.getText()+"','"+D_Mobile.getText()+"','"+"suez"+"','"+g+"')");
                  
                  
                  
                  
                 
                  
                  com  = con.prepareStatement("INSERT INTO Doctor(D_id,doctor_name,password,mobile,gender) VALUES ("
                 + "'" + DID +"'," 
                 + "'" + D_Name.getText() +"',"
                 + "'" + D_password.getText() +"',"
                 + "'" + D_Mobile.getText() +"',"
                 + "'" + g +"'"
                 +")");
               
                  com.execute();
                   JOptionPane.showMessageDialog(null, " doctor added ");
                  clean();
                  
                 
                 }catch(HeadlessException | SQLException e){
                     System.out.println(e);
                 
                 }
            
            
                  }
           
            } catch (SQLException ex) {
               Logger.getLogger(AddDoctor.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        
        
        }else{
             JOptionPane.showMessageDialog(null, " Doctor id must be in the range of 2000 to 3000");
            }
        

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "ID mudt be interger");
            }finally{
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AddDoctor.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }
       
        
        }
            
            
    
        
                
            
    }//GEN-LAST:event_AddButtonActionPerformed

    private void D_MobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_MobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D_MobileActionPerformed

    private void D_FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_FemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D_FemaleActionPerformed

    private void D_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_D_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JPanel AddDoctor;
    private javax.swing.JRadioButton D_Female;
    private javax.swing.JTextField D_ID;
    private javax.swing.JTextField D_Mobile;
    private javax.swing.JTextField D_Name;
    private javax.swing.JRadioButton D_male;
    private javax.swing.JPasswordField D_password;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    private void clean() {
      //D_ID.getText().equals("")||D_Name.getText().equals("")||D_password.getText().equals("")||D_Mobile.getText().equals("")||(!D_male
      D_ID.setText("");
      D_Name.setText("");
      D_password.setText("");
      D_Mobile.setText("");
      D_Female.setSelected(false);
       D_male.setSelected(false);


      
    }
}
