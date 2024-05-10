package view.dashboard.pupil_dashboard;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import controller.dashboard_controller.pupil_dashboard_controller.PupilDashboardController;
import model.account.Account;
import view.dashboard.SideFeatureOption;
import view.login.Login;

public class PupilDashboard extends javax.swing.JFrame {
    public PupilDashboard(Account account) throws ClassNotFoundException, SQLException {
        initComponents();
        setTitle("Boarding Management");
        
        PupilDashboardController controller = new PupilDashboardController(viewPanel, mainPanel, mainLabel, account);
        List<SideFeatureOption> listItem = new ArrayList<>();
        listItem.add(new SideFeatureOption("Main", mainPanel, mainLabel));
        listItem.add(new SideFeatureOption("Absence register", absenceRegisterPanel, absenceRegisterLabel));
        listItem.add(new SideFeatureOption("View absence history", viewAbsenceHistoryPanel, viewAbsenceHistoryLabel));
        listItem.add(new SideFeatureOption("Payment", paymentPanel, paymentLabel));
        listItem.add(new SideFeatureOption("Info", informationPanel, informationLabel));
        controller.setEvent(listItem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        viewPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        mainLabel = new javax.swing.JLabel();
        jlbTeacher1 = new javax.swing.JLabel();
        paymentPanel = new javax.swing.JPanel();
        paymentLabel = new javax.swing.JLabel();
        informationPanel = new javax.swing.JPanel();
        informationLabel = new javax.swing.JLabel();
        logOutLabel = new javax.swing.JLabel();
        viewAbsenceHistoryPanel = new javax.swing.JPanel();
        viewAbsenceHistoryLabel = new javax.swing.JLabel();
        absenceRegisterPanel = new javax.swing.JPanel();
        absenceRegisterLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1500, 765));

        javax.swing.GroupLayout viewPanelLayout = new javax.swing.GroupLayout(viewPanel);
        viewPanel.setLayout(viewPanelLayout);
        viewPanelLayout.setHorizontalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1210, Short.MAX_VALUE)
        );
        viewPanelLayout.setVerticalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        menuPanel.setBackground(new java.awt.Color(74, 188, 253));
        menuPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        mainLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        mainLabel.setText("Boarding Management");

        jlbTeacher1.setBackground(new java.awt.Color(238, 238, 228));
        jlbTeacher1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jlbTeacher1.setForeground(new java.awt.Color(153, 153, 153));
        jlbTeacher1.setText("Hi, Pupil");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbTeacher1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mainLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbTeacher1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        paymentPanel.setBackground(new java.awt.Color(0, 153, 255));

        paymentLabel.setBackground(new java.awt.Color(238, 238, 228));
        paymentLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        paymentLabel.setForeground(new java.awt.Color(238, 238, 228));
        paymentLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wallet.png"))); // NOI18N
        paymentLabel.setText("View Payment");

        javax.swing.GroupLayout paymentPanelLayout = new javax.swing.GroupLayout(paymentPanel);
        paymentPanel.setLayout(paymentPanelLayout);
        paymentPanelLayout.setHorizontalGroup(
            paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        paymentPanelLayout.setVerticalGroup(
            paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(paymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        informationPanel.setBackground(new java.awt.Color(0, 153, 255));

        informationLabel.setBackground(new java.awt.Color(238, 238, 228));
        informationLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        informationLabel.setForeground(new java.awt.Color(238, 238, 228));
        informationLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/information.png"))); // NOI18N
        informationLabel.setText("Change Information");

        javax.swing.GroupLayout informationPanelLayout = new javax.swing.GroupLayout(informationPanel);
        informationPanel.setLayout(informationPanelLayout);
        informationPanelLayout.setHorizontalGroup(
            informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informationPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(informationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        informationPanelLayout.setVerticalGroup(
            informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(informationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        logOutLabel.setBackground(new java.awt.Color(238, 238, 228));
        logOutLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        logOutLabel.setForeground(new java.awt.Color(238, 238, 228));
        logOutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        logOutLabel.setText("Log Out");
        logOutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutLabelMouseClicked(evt);
            }
        });

        viewAbsenceHistoryPanel.setBackground(new java.awt.Color(0, 153, 255));

        viewAbsenceHistoryLabel.setBackground(new java.awt.Color(238, 238, 228));
        viewAbsenceHistoryLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        viewAbsenceHistoryLabel.setForeground(new java.awt.Color(238, 238, 228));
        viewAbsenceHistoryLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wallet.png"))); // NOI18N
        viewAbsenceHistoryLabel.setText("View absence history ");

        javax.swing.GroupLayout viewAbsenceHistoryPanelLayout = new javax.swing.GroupLayout(viewAbsenceHistoryPanel);
        viewAbsenceHistoryPanel.setLayout(viewAbsenceHistoryPanelLayout);
        viewAbsenceHistoryPanelLayout.setHorizontalGroup(
            viewAbsenceHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewAbsenceHistoryPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(viewAbsenceHistoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        viewAbsenceHistoryPanelLayout.setVerticalGroup(
            viewAbsenceHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewAbsenceHistoryPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(viewAbsenceHistoryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        absenceRegisterPanel.setBackground(new java.awt.Color(0, 153, 255));

        absenceRegisterLabel.setBackground(new java.awt.Color(238, 238, 228));
        absenceRegisterLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        absenceRegisterLabel.setForeground(new java.awt.Color(238, 238, 228));
        absenceRegisterLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wallet.png"))); // NOI18N
        absenceRegisterLabel.setText("Absence register");

        javax.swing.GroupLayout absenceRegisterPanelLayout = new javax.swing.GroupLayout(absenceRegisterPanel);
        absenceRegisterPanel.setLayout(absenceRegisterPanelLayout);
        absenceRegisterPanelLayout.setHorizontalGroup(
            absenceRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(absenceRegisterPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(absenceRegisterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        absenceRegisterPanelLayout.setVerticalGroup(
            absenceRegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(absenceRegisterPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(absenceRegisterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(informationPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paymentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewAbsenceHistoryPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(absenceRegisterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(logOutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(absenceRegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewAbsenceHistoryPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paymentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(informationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(logOutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(248, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(viewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logOutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_logOutLabelMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel absenceRegisterLabel;
    private javax.swing.JPanel absenceRegisterPanel;
    private javax.swing.JLabel informationLabel;
    private javax.swing.JPanel informationPanel;
    private javax.swing.JLabel jlbTeacher1;
    private javax.swing.JLabel logOutLabel;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JPanel paymentPanel;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JLabel viewAbsenceHistoryLabel;
    private javax.swing.JPanel viewAbsenceHistoryPanel;
    private javax.swing.JPanel viewPanel;
    // End of variables declaration//GEN-END:variables
}
