package javapplication4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.*;
import java.awt.Color;
/**
 *
 * @author BHAVESH
 */
public class slip16 extends javax.swing.JFrame {

    /**
     * Creates new form slip16
     */
    public slip16() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldGenre = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldId = new javax.swing.JTextField();
        jButtonSearch = new javax.swing.JButton();
        jButtonDisplay = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1450, 750));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Genre             :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 250, 150, 24);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel2.setText("BOOK");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 20, 140, 50);

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setText("Book Name    :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 180, 150, 24);

        jTextFieldGenre.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        getContentPane().add(jTextFieldGenre);
        jTextFieldGenre.setBounds(220, 250, 160, 30);

        jTextFieldName.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        getContentPane().add(jTextFieldName);
        jTextFieldName.setBounds(220, 180, 160, 30);

        jTextFieldId.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        getContentPane().add(jTextFieldId);
        jTextFieldId.setBounds(220, 120, 160, 30);

        jButtonSearch.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jButtonSearch.setText("SEARCH");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSearch);
        jButtonSearch.setBounds(730, 320, 180, 70);

        jButtonDisplay.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jButtonDisplay.setText("DISPLAY");
        jButtonDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDisplayActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDisplay);
        jButtonDisplay.setBounds(470, 320, 180, 70);

        jButtonAdd.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jButtonAdd.setText("ADD BOOK");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdd);
        jButtonAdd.setBounds(110, 320, 180, 70);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Name", "Genre"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(450, 120, 520, 190);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setText("Book ID         :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 120, 150, 24);

        pack();
    }// </editor-fold>                        

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {                                           
      try
         {
                  Connection con=DriverManager.getConnection("jdbc:mysql:///slip16","root","");  
                  int x=Integer.parseInt(jTextFieldId.getText());
                  String y=jTextFieldName.getText();
                  String z=jTextFieldGenre.getText();
                  PreparedStatement p=con.prepareStatement("Insert into Book values(?, ?, ?)");
                  p.setInt(1,x);
                  p.setString(2, y);
                  p.setString(3, z);
                  p.executeUpdate();
                  JOptionPane.showMessageDialog(this,"Record Inserted Successfully......");
          }
         catch(Exception e)
         {
            System.out.println(e);
         }
    }                                          

    private void jButtonDisplayActionPerformed(java.awt.event.ActionEvent evt) {                                               
       try
        {
            //Class.forName("com.mysql.jdbc.Driver");  
             Connection con = DriverManager.getConnection("jdbc:mysql:///slip16","root","");  
             Statement s =con.createStatement();
             String sql="select * from book";
             ResultSet rs=s.executeQuery(sql);

             while(rs.next())
             {
                String ID=String.valueOf(rs.getInt("Book_Id"));
                String Name=rs.getString("Book_Name");
                String Genre=rs.getString("Genre");
                

                  String tbData[]={ID,Name,Genre};
                  DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
                 tblModel.addRow(tbData);
             }
        }
        catch(Exception e)
        {
               JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }                                              

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {                                              
        Function f=new Function();
        ResultSet rs=null;
       
           rs=f.find(JOptionPane.showInputDialog(this, "Enter Book ID : "));
        //rs=f.find(jTextFieldSearch.getText());
        try
        {
            if(rs.next())
            {
                //jTextFieldD.setText(rs.getString("Source"));
                JOptionPane.showMessageDialog(null, "Data Found");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Data Not Found");
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
         /*  try
        {
              Connection con = DriverManager.getConnection("jdbc:mysql:///slip16","root","");  
             Statement s =con.createStatement();

              String a=JOptionPane.showInputDialog(this, "Enter Book ID : ");
             
            
             String sql="select * from book";
             ResultSet rs=s.executeQuery(sql);

             while(rs.next())
             {
                String ID=String.valueOf(rs.getInt("Book_Id"));
                String Name=rs.getString("Book_Name");
                String Genre=rs.getString("Genre");
                

                  String tbData[]={ID,Name,Genre};
                  DefaultTableModel tblModel=(DefaultTableModel)jTable1.getModel();
                 tblModel.addRow(tbData);

                 
             }
            jTable1.addRowSelectionInterval(3,3);
            jTable1.setForeground(Color.BLUE);
        }
        catch(Exception e)
        {
               //JOptionPane.showMessageDialog(null, e.getMessage());
        }*/

         
    }                                             
public class Function
{
       Connection con=null;
       ResultSet rs=null;
       PreparedStatement ps=null;

        public ResultSet find(String s)
        {
                try
                {
                        con = DriverManager.getConnection("jdbc:mysql:///slip16","root","");  
                         ps=con.prepareStatement("select * from book where Book_Id = ?");
                         ps.setString(1,s);
                        rs=ps.executeQuery();
                }
                catch(Exception ex)
                {
                        JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                return rs;
        }
        
}
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
            java.util.logging.Logger.getLogger(slip16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(slip16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(slip16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(slip16.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new slip16().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonDisplay;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldGenre;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration                   
}
