/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liquidhub;

/**
 *
 * @author bharatPC
 */
public class terms_new extends javax.swing.JFrame {

    /**
     * Creates new form terms_new
     */
    public terms_new() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("TERMS AND CONDITIONS :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 20, 290, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\bharatPC\\Desktop\\aa.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 300, 50);

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(500, 10, 100, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\bharatPC\\Desktop\\aa.png")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(300, 0, 300, 50);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("1. you should be aware that the Car Park is open to the general public. We cannot guarantee that members of the general public will not enter our Car Park and cause damage to property and/or engage in criminal activity. Accordingly, you park your vehicle in the Car Park at your own risk. We cannot and do not guarantee the security of your vehicle and/or its contents.  \n2.The parking tariff payable by you (as varied from time to time) is displayed on the tariff board at the on our website. You are obliged to pay the parking tariff and to comply with any instructions on the tariff board as supplemented by these Terms, and failure to do so may result in us issuing you with a Parking Charge Notice (please refer to clause 5 (Parking Contraventions) of these Terms).\n3.If your vehicle sustains damage while in the Car Park, your vehicle is stolen or any possessions are stolen from your vehicle while it is in the Car Park you should:\na)       immediately inform either a member of staff at the Car Park or otherwise notify our Customer Services Department \n\nb)       in the case of theft, immediately inform the police; and\n\nc)       notify your insurers promptly.\n\n4.  It is important for the effective management of the Car Park that:\n\na)       you comply with all signs in the Car Park, including these Terms and the tariff board;\n\nb)       you park within the limits of a marked bay;\n\nc)       you do not park within a bay designated for a specific purpose when you are not entitled to do so (for example,  and without limitation, parking in a space designated for disabled persons without an appropriate disability badge displayed, and/or parking in a space for electric vehicles when you are not using the charging facility); and\n\nd)      you pay all amounts due for your parking and comply with the requirements set out at clause 10 (Ticket Types and Payment Methods) of these Terms. For the avoidance of doubt, if you choose to pay the parking tariff by using the “Pay By Mobile” service, the payment must be made at the time of parking your vehicle in the Car Park and in any event, before you leave your vehicle in the Car Park.\n\n5.    If you do not comply with these requirements we may issue you with a Parking Charge Notice requiring you to pay any unpaid parking charge(s), together with an additional amount representing an estimate of the additional expenses we will incur as a result of your non-compliance (including without limitation debt recovery costs) (the “Parking Charge”). Specific details about the Parking Charge payable are available in each Car Park.\n\n6.    Details/information relating to how to pay the Parking Charge, deadlines for payment, what will happen if you fail to make payment within the stipulated deadline, and the appeal process will be set out on the Parking Charge Notice");
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
front_new first=new front_new();
first.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(terms_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(terms_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(terms_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(terms_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new terms_new().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
