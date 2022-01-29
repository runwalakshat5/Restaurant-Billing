package forms;

import java.awt.Color;

public class HOMEPAGE extends javax.swing.JFrame {

    public HOMEPAGE() {
        
        initComponents();
        getContentPane().setBackground(Color.black);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MYCAT = new javax.swing.JMenu();
        CATEGORIES = new javax.swing.JMenuItem();
        SHOWITEMS = new javax.swing.JMenuItem();
        BILLS = new javax.swing.JMenuItem();
        SEARCHBILLS = new javax.swing.JMenuItem();
        SHOWALLBILLS = new javax.swing.JMenuItem();
        EXIT = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 0));

        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Algerian", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("THE TAJ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 10, 290, 40);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(260, 0, 110, 0);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\12p4.PEARL\\Desktop\\ocean-reef.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-10, -10, 650, 390);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setForeground(new java.awt.Color(51, 51, 255));

        MYCAT.setText("WELCOME");
        MYCAT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MYCATMouseClicked(evt);
            }
        });

        CATEGORIES.setText("SHOW CATEGORIES");
        CATEGORIES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CATEGORIESActionPerformed(evt);
            }
        });
        MYCAT.add(CATEGORIES);

        SHOWITEMS.setText("SHOW ITEMS");
        SHOWITEMS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SHOWITEMSMouseClicked(evt);
            }
        });
        SHOWITEMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SHOWITEMSActionPerformed(evt);
            }
        });
        MYCAT.add(SHOWITEMS);

        BILLS.setText("BILLING");
        BILLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BILLSActionPerformed(evt);
            }
        });
        MYCAT.add(BILLS);

        SEARCHBILLS.setText("SEARCH BILLS");
        SEARCHBILLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHBILLSActionPerformed(evt);
            }
        });
        MYCAT.add(SEARCHBILLS);

        SHOWALLBILLS.setText("SHOW ALL BILLS");
        SHOWALLBILLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SHOWALLBILLSActionPerformed(evt);
            }
        });
        MYCAT.add(SHOWALLBILLS);

        EXIT.setText("EXIT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });
        MYCAT.add(EXIT);

        jMenuBar1.add(MYCAT);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CATEGORIESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CATEGORIESActionPerformed
        Categories frmCategories=new Categories();
        frmCategories.setVisible(true);
    }//GEN-LAST:event_CATEGORIESActionPerformed

    private void MYCATMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MYCATMouseClicked
        
    }//GEN-LAST:event_MYCATMouseClicked

    private void SHOWITEMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SHOWITEMSActionPerformed
         Items frmItems=new Items();
     frmItems.setVisible(true);
     
    }//GEN-LAST:event_SHOWITEMSActionPerformed

    private void SHOWITEMSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHOWITEMSMouseClicked
     
     
      Items frmItems=new Items();
     frmItems.setVisible(true);
     
    }//GEN-LAST:event_SHOWITEMSMouseClicked

    private void BILLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BILLSActionPerformed
        Bill frmBill=new Bill();
        frmBill.setVisible(true);
        
    }//GEN-LAST:event_BILLSActionPerformed

    private void SEARCHBILLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHBILLSActionPerformed
       SearchBills frmSearch=new SearchBills();
       frmSearch.setVisible(true);
       
    }//GEN-LAST:event_SEARCHBILLSActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
       System.exit(0);
    }//GEN-LAST:event_EXITActionPerformed

    private void SHOWALLBILLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SHOWALLBILLSActionPerformed
        ShowAllBills frmRecords=new ShowAllBills();
        frmRecords.setVisible(true);
    }//GEN-LAST:event_SHOWALLBILLSActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HOMEPAGE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BILLS;
    private javax.swing.JMenuItem CATEGORIES;
    private javax.swing.JMenuItem EXIT;
    private javax.swing.JMenu MYCAT;
    private javax.swing.JMenuItem SEARCHBILLS;
    private javax.swing.JMenuItem SHOWALLBILLS;
    private javax.swing.JMenuItem SHOWITEMS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
