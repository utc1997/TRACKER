/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expenses.gui;

import expenses.dao.CategoriesDAO;
import expenses.pojo.Categories;
import expenses.pojo.GlobalData;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author Lenovo
 */
public class PersonalExpenseFrame extends javax.swing.JFrame {

    ChartPanel chartPanel;
    Categories catwise;

    /**
     * Creates new form PersonalExpenseFrame
     */
    public PersonalExpenseFrame() {
        initComponents();
        super.setLocationRelativeTo(null);

        try {
            catwise=CategoriesDAO.getCatwiseExpense(GlobalData.getUsername());
        } catch (SQLException ex) {
            Logger.getLogger(PersonalExpenseFrame.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        display();

        //super.setLocation(340, 0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblLogout = new javax.swing.JLabel();
        InternalFrame = new javax.swing.JInternalFrame();
        jPanel5 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnTxHistory = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(2, 136, 209));

        jPanel4.setBackground(new java.awt.Color(255, 0, 51));

        lblLogout.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 966, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 80));

        InternalFrame.setBackground(new java.awt.Color(255, 255, 255));
        InternalFrame.setBorder(null);
        InternalFrame.setForeground(new java.awt.Color(255, 255, 255));
        InternalFrame.setEnabled(false);
        InternalFrame.setFocusable(false);
        InternalFrame.setVisible(true);
        InternalFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(InternalFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 50, 1100, 490));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdd.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnAdd.setText("Add Expense");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel5.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 270, 100));

        btnTxHistory.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnTxHistory.setText("Transaction History");
        btnTxHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTxHistoryActionPerformed(evt);
            }
        });
        jPanel5.add(btnTxHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, 260, 100));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1080, 470));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1080, 720));

        jPanel3.setBackground(new java.awt.Color(48, 48, 48));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 640));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblBack.setBackground(new java.awt.Color(255, 255, 255));
        lblBack.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        lblBack.setForeground(new java.awt.Color(51, 51, 51));
        lblBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBack.setText("Go Back");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBack, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblBack, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        InputCalculatorFrame cal = new InputCalculatorFrame();
        cal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnTxHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTxHistoryActionPerformed
        // TODO add your handling code here:

        ExpenseHistoryFrame ehf = new ExpenseHistoryFrame();
        ehf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTxHistoryActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        // TODO add your handling code here:
        UserDashboardFrame ud = new UserDashboardFrame();
        ud.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        // TODO add your handling code here:
        int ans=JOptionPane.showConfirmDialog(null, "Are you Sure you want to Logout??","Confirm Logout",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(ans==JOptionPane.YES_OPTION)
        {
        UserLoginFrame loginfrm=new UserLoginFrame();
        loginfrm.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_lblLogoutMouseClicked

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
            java.util.logging.Logger.getLogger(PersonalExpenseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonalExpenseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonalExpenseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonalExpenseFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PersonalExpenseFrame().setVisible(true);
                PersonalExpenseFrame pieChart = new PersonalExpenseFrame();

                pieChart.display();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame InternalFrame;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnTxHistory;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblLogout;
    // End of variables declaration//GEN-END:variables

    private JFreeChart create3DPieChart(PieDataset dataset) {

        /**
         * Create a PieDataSet*
         */
        /**
         * Create 3D Pie Chart based on this dataset*
         */
        
        JFreeChart chart = ChartFactory.createPieChart("", dataset, true, true, true);
        chart.getPlot().setBackgroundPaint(Color.WHITE);
        chart.getPlot().setOutlinePaint(Color.WHITE);
        //chartPanel.setBackground(Color.WHITE);
        

//JFreeChart chart = ChartFactory.createPieChart3D("Result", dataset, true, true, true);
        return chart;

    }

    private PieDataset createPieDataSet() {

        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Grocery", new Double(catwise.getGrocery()));
        pieDataset.setValue("Travel", new Double(catwise.getTravel()));
        pieDataset.setValue("Health", new Double(catwise.getHealth()));
        pieDataset.setValue("Eatout", new Double(catwise.getEatout()));
        
        pieDataset.setValue("Group", new Double(catwise.getGroupexp()));
        pieDataset.setValue("Bills", new Double(catwise.getBills()));
        pieDataset.setValue("Education", new Double(catwise.getEducation()));
        pieDataset.setValue("Other", new Double(catwise.getOther()));
        pieDataset.setValue("Shopping", new Double(catwise.getShopping()));
        
        pieDataset.setValue("Entertainment", new Double(catwise.getEntertain()));

    
        return pieDataset;

    }

    private void display() {

        final PieDataset dataset = this.createPieDataSet();
        final JFreeChart chart = this.create3DPieChart(dataset);

        chartPanel = new ChartPanel(chart, false);
        this.InternalFrame.setContentPane(chartPanel);
        this.InternalFrame.pack();
        this.InternalFrame.setVisible(true);
        this.InternalFrame.setSize(10, 10);

        this.pack();
        this.setVisible(true);

    }
}
