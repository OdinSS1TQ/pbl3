package view.login;

import java.awt.event.KeyEvent;

import controller.login_controller.LoginController;

public class Login extends javax.swing.JFrame {
    LoginController controller;

    public Login() {
        initComponents();
        controller = new LoginController(this, submitButton, usernameTextField, passwordTextField, messageLabel);
        controller.setEvent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jpnRoot = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        usernameTextField = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpnRoot.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setForeground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jpnRoot.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 430));

        usernameTextField.setText("Username");
        usernameTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameTextFieldMouseClicked(evt);
            }
        });
        usernameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextFieldActionPerformed(evt);
            }
        });
        usernameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usernameTextFieldKeyPressed(evt);
            }
        });
        jpnRoot.add(usernameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(469, 156, 180, 30));

        passwordTextField.setText("jPasswordField1");
        passwordTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordTextFieldFocusGained(evt);
            }
        });
        passwordTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordTextFieldMouseClicked(evt);
            }
        });
        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });
        passwordTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordTextFieldKeyTyped(evt);
            }
        });
        jpnRoot.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 180, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Boarding Management");
        jpnRoot.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        submitButton.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        submitButton.setText("Login");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        jpnRoot.add(submitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Login");
        jpnRoot.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 20));
        jpnRoot.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 103, 180, 10));

        jLabel5.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseline_person_black_24dp.png"))); // NOI18N
        jpnRoot.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 40, -1));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/baseline_lock_black_24dp.png"))); // NOI18N
        jpnRoot.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 40, -1));

        messageLabel.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 12)); // NOI18N
        messageLabel.setForeground(new java.awt.Color(255, 0, 0));
        jpnRoot.add(messageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        getContentPane().add(jpnRoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
//        String temp = "123456789";
//        char[] currentText = passwordTextField.getPassword();
//
//        // Check if the current text equals the default text
//        if (currentText.equals(temp)) {
//            // Clear the text field
//            passwordTextField.setText("");
//        }
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void usernameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextFieldActionPerformed
//        String temp = "Username";
//        String currentText = usernameTextField.getText();
//
//        // Check if the current text equals the default text
//        if (currentText.equals(temp)) {
//            // Clear the text field
//            usernameTextField.setText("");
//        }
    }//GEN-LAST:event_usernameTextFieldActionPerformed

    private void usernameTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTextFieldMouseClicked
        // TODO add your handling code here:
//        if (usernameTextField.getText().equals("Username\0"))
//            usernameTextField.setText("");
    }//GEN-LAST:event_usernameTextFieldMouseClicked

    private void passwordTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTextFieldMouseClicked
        // TODO add your handling code here:
//        if (passwordTextField.getPassword().equals("123456789\0"))
//            passwordTextField.setText("");
    }//GEN-LAST:event_passwordTextFieldMouseClicked

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
//        if (usernameTextField.getText().equals("admin") && Arrays.equals(passwordTextField.getPassword(), "123".toCharArray())) {
//        new AdminDashboard().setVisible(true);
//} 
    
    }//GEN-LAST:event_submitButtonActionPerformed

    private void usernameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTextFieldKeyPressed
        // TODO add your handling code here:
                String temp = "Username";
        String currentText = usernameTextField.getText();

        // Check if the current text equals the default text
        if (currentText.contains(temp)) {
            // Clear the text field
            usernameTextField.setText("");
        }
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    passwordTextField.requestFocusInWindow();
                }
    }//GEN-LAST:event_usernameTextFieldKeyPressed

    private void passwordTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextFieldKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            controller.login();
        }    
    }//GEN-LAST:event_passwordTextFieldKeyPressed

    private void passwordTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTextFieldFocusGained
        // TODO add your handling code here:
        passwordTextField.setText("");
        
    }//GEN-LAST:event_passwordTextFieldFocusGained

    private void passwordTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTextFieldKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_passwordTextFieldKeyTyped

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton submitButton;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
}
