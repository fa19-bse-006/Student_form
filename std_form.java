package std_form;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class std_form extends javax.swing.JFrame {

 
    public std_form() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void table_show(){
        int cc;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root", "");
            Statement st=conn.createStatement();
            ResultSet res=st.executeQuery("select * from std_table");
            ResultSetMetaData RSMD=res.getMetaData();
            cc=RSMD.getColumnCount();
            DefaultTableModel DFT= (DefaultTableModel)std_list.getModel();
            DFT.setRowCount(0);
            while(res.next()){
                Vector v2=new Vector();
                for(int i=1;i<=cc;i++){
                   v2.add(res.getString("id"));
                   v2.add(res.getString("Name"));
                   v2.add(res.getString("F_name"));
                   v2.add(res.getString("Address"));
                   v2.add(res.getString("Gender"));
                   v2.add(res.getString("Age"));
                }
                DFT.addRow(v2);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name_field = new javax.swing.JTextField();
        f_name_field = new javax.swing.JTextField();
        address_field = new javax.swing.JTextField();
        gender_field = new javax.swing.JTextField();
        age_field = new javax.swing.JTextField();
        Edit_button = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Hard_delete_button = new javax.swing.JButton();
        S_delete_button = new javax.swing.JButton();
        show_button = new javax.swing.JButton();
        Add_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        std_list = new javax.swing.JTable();
        editButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Form");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setName("Name_txt"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 80, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Father Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 80, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Address");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Gender");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Age");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_fieldActionPerformed(evt);
            }
        });
        jPanel1.add(name_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, -1));
        jPanel1.add(f_name_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 170, -1));
        jPanel1.add(address_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 170, -1));
        jPanel1.add(gender_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 170, -1));

        age_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age_fieldActionPerformed(evt);
            }
        });
        jPanel1.add(age_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 170, -1));

        Edit_button.setText("Edit");
        jPanel1.add(Edit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 90, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Student Registration Form");

        Hard_delete_button.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Hard_delete_button.setText("Hard Delete");
        Hard_delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hard_delete_buttonActionPerformed(evt);
            }
        });

        S_delete_button.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        S_delete_button.setText("Soft Delete");
        S_delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_delete_buttonActionPerformed(evt);
            }
        });

        show_button.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        show_button.setText("Show");
        show_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_buttonActionPerformed(evt);
            }
        });

        Add_button.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Add_button.setText("Add");
        Add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_buttonActionPerformed(evt);
            }
        });

        std_list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Name", "F' Name", "Address", "Gender", "Age"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        std_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                std_listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(std_list);

        editButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(show_button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(S_delete_button)
                .addGap(18, 18, 18)
                .addComponent(Hard_delete_button)
                .addGap(18, 18, 18)
                .addComponent(editButton)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_button)
                    .addComponent(show_button)
                    .addComponent(S_delete_button)
                    .addComponent(Hard_delete_button)
                    .addComponent(editButton))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_fieldActionPerformed

    private void age_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_age_fieldActionPerformed

    private void Add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_buttonActionPerformed
        try{
            //String name,f_name,address,gender,age;
            //name=name_field.getText();
            //f_name=f_name_field.getText();
            //address=address_field.getText();
            //gender=gender_field.getText();
           // age=age_field.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root", "");
            String sql="insert into std_table(Name,F_name,Address,Gender,Age) values(?,?,?,?,?)";
            PreparedStatement ptst=conn.prepareStatement(sql);
            ptst.setString(1, name_field.getText());
            ptst.setString(2, f_name_field.getText());
            ptst.setString(3, address_field.getText());
            ptst.setString(4, gender_field.getText());
            ptst.setString(5, age_field.getText());
            ptst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data stored successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        table_show();
        name_field.setText("");
        f_name_field.setText("");
        address_field.setText("");
        gender_field.setText("");
        age_field.setText("");
        name_field.requestFocus();
    }//GEN-LAST:event_Add_buttonActionPerformed

    private void show_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_buttonActionPerformed
        table_show();
    }//GEN-LAST:event_show_buttonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        table_show();
    }//GEN-LAST:event_formWindowOpened

    private void std_listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_std_listMouseClicked
        DefaultTableModel model= (DefaultTableModel)std_list.getModel();
        int selectedIndex=std_list.getSelectedRow();
        name_field.setText(model.getValueAt(selectedIndex, 1).toString());
        f_name_field.setText(model.getValueAt(selectedIndex, 2).toString());
        address_field.setText(model.getValueAt(selectedIndex, 3).toString());
        gender_field.setText(model.getValueAt(selectedIndex, 4).toString());
        age_field.setText(model.getValueAt(selectedIndex, 5).toString());
    }//GEN-LAST:event_std_listMouseClicked

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        
        try{
            DefaultTableModel model= (DefaultTableModel)std_list.getModel();
            int selectedIndex=std_list.getSelectedRow();
            int id=Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root", "");
            String sql="update std_table set Name=?,F_name=?,Address=?,Gender=?,Age=? deleted=0 where id=?";
            PreparedStatement ptst=conn.prepareStatement(sql);
            ptst.setString(1, name_field.getText());
            ptst.setString(2, f_name_field.getText());
            ptst.setString(3, address_field.getText());
            ptst.setString(4, gender_field.getText());
            ptst.setString(5, age_field.getText());
            ptst.setInt(6, id);
            ptst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Edited successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        table_show();
        name_field.setText("");
        f_name_field.setText("");
        address_field.setText("");            
        gender_field.setText("");
        age_field.setText("");
        name_field.requestFocus();
    }//GEN-LAST:event_editButtonActionPerformed

    private void Hard_delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hard_delete_buttonActionPerformed
        try{
            DefaultTableModel model= (DefaultTableModel)std_list.getModel();
            int selectedIndex=std_list.getSelectedRow();
            int id=Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root", "");
            String sql="delete from std_table where id=?";
            PreparedStatement ptst=conn.prepareStatement(sql);
            ptst.setInt(1, id);
            ptst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Deleted successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        table_show();
        name_field.setText("");
        f_name_field.setText("");
        address_field.setText("");
        gender_field.setText("");
        age_field.setText("");
        name_field.requestFocus();
    }//GEN-LAST:event_Hard_delete_buttonActionPerformed

    private void S_delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_delete_buttonActionPerformed
    DefaultTableModel model = (DefaultTableModel) std_list.getModel();
    int selectedIndex = std_list.getSelectedRow();

    if (selectedIndex != -1) {
        int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "")) {
            String sql = "UPDATE std_table SET deleted = 1 WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

            model.removeRow(selectedIndex);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_S_delete_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(std_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(std_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(std_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(std_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new std_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_button;
    private javax.swing.JButton Edit_button;
    private javax.swing.JButton Hard_delete_button;
    private javax.swing.JButton S_delete_button;
    private javax.swing.JTextField address_field;
    private javax.swing.JTextField age_field;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField f_name_field;
    private javax.swing.JTextField gender_field;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name_field;
    private javax.swing.JButton show_button;
    private javax.swing.JTable std_list;
    // End of variables declaration//GEN-END:variables
}
