/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gordon;

/**
 *
 * @author bradlye
 */
public class qtrackIntoUI extends javax.swing.JFrame {

    /**
     * Creates new form qtrackIntoUI
     */
    public qtrackIntoUI() {
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

        welcomeLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        logoLabel = new javax.swing.JLabel();
        rememberCheckBox = new javax.swing.JCheckBox();
        urlField = new javax.swing.JTextField();
        urlLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        userLabel = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeLabel.setFont(new java.awt.Font("Umpush", 0, 15)); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Welcome, to begin, type in the link to your database");

        startButton.setFont(new java.awt.Font("Umpush", 0, 15)); // NOI18N
        startButton.setText("Start");

        helpButton.setFont(new java.awt.Font("Umpush", 0, 15)); // NOI18N
        helpButton.setText("Help");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        logoLabel.setFont(new java.awt.Font("Ubuntu", 1, 145)); // NOI18N
        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setText("QTrack");

        rememberCheckBox.setText("Remember URL/Pass");

        urlField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                urlFieldActionPerformed(evt);
            }
        });

        urlLabel.setFont(new java.awt.Font("Umpush", 0, 15)); // NOI18N
        urlLabel.setText("URL");

        passwordLabel.setFont(new java.awt.Font("Umpush", 0, 15)); // NOI18N
        passwordLabel.setText("Password");

        userLabel.setFont(new java.awt.Font("Umpush", 0, 15)); // NOI18N
        userLabel.setText("User");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(helpButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rememberCheckBox)
                        .addGap(40, 40, 40)
                        .addComponent(startButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(urlLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(passwordLabel)
                                    .addGap(20, 20, 20)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(userLabel)
                                .addGap(53, 53, 53)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(urlField)
                            .addComponent(passwordField)
                            .addComponent(userField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(welcomeLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(urlField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(urlLabel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userLabel)
                    .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton)
                    .addComponent(helpButton)
                    .addComponent(rememberCheckBox))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpButtonActionPerformed

    private void urlFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_urlFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_urlFieldActionPerformed

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
            java.util.logging.Logger.getLogger(qtrackIntoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(qtrackIntoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(qtrackIntoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(qtrackIntoUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new qtrackIntoUI().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton helpButton;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JCheckBox rememberCheckBox;
    private javax.swing.JButton startButton;
    private javax.swing.JTextField urlField;
    private javax.swing.JLabel urlLabel;
    private javax.swing.JTextField userField;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
