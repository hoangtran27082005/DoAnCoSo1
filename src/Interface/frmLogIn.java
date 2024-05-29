package Interface;
import Models.TaiKhoan;
import Mysql.ConnectSQL;
import configs.AppConfig;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class frmLogIn extends javax.swing.JFrame {
    ConnectSQL cn = new ConnectSQL();
  
    public frmLogIn() {
    	try {
    		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    		initComponents();
            JRootPane rp = this.getRootPane();
            rp.setDefaultButton(btnLogIn);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    	   
        
        jPanel1.setLayout(null);
        jPanel1.add(jLabel3);
        jPanel1.add(jLabel2);
        jPanel1.add(btnLogIn);
        jPanel1.add(btnExit);
        jPanel1.add(txtPassWord);
        jPanel1.add(txtUserName);
        jPanel1.add(jLabel4);
        jPanel1.add(jLabel1);
        jPanel1.add(jLabel5);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ADMIN\\OneDrive\\Tài liệu\\Hình ảnh\\DoAnCoSo\\Purple Red Subtle Gradients Corporate Canva Banner (1).png"));
        lblNewLabel.setBounds(-10, 10, 764, 398);
        jPanel1.add(lblNewLabel);
        
        JLabel jLabel1_1 = new JLabel();
        jLabel1_1.setBounds(436, 293, 309, 76);
        jPanel1.add(jLabel1_1);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtUserName = new javax.swing.JTextField();
        txtUserName.setBounds(281, 119, 237, 27);
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(565, 120, 100, 50);
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(10, 10, 309, 76);
        btnLogIn = new javax.swing.JButton();
        btnLogIn.setBounds(283, 258, 120, 23);
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setBounds(192, 125, 98, 14);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setBounds(196, 193, 94, 14);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(353, 67, 152, 19);
        btnExit = new javax.swing.JButton();
        btnExit.setBounds(426, 258, 92, 23);
        txtPassWord = new javax.swing.JPasswordField();
        txtPassWord.setBounds(281, 187, 237, 27);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 0)));

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new ImageIcon(AppConfig.getImageURL("logginlogo.png"))); // NOI18N

        jLabel1.setIcon(new ImageIcon(AppConfig.getImageURL("Happy Coffee.png"))); // NOI18N

        btnLogIn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLogIn.setForeground(new java.awt.Color(102, 51, 0));
        btnLogIn.setText("Đăng nhập");
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText("Password");

        jLabel5.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 17)); // NOI18N
        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setText("Đăng nhập");

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExit.setForeground(new java.awt.Color(102, 51, 0));
        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 764, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 398, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
       
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed
    public void thoat(){
        txtPassWord.setText("");
        txtPassWord.requestFocus();
    }
    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        // TODO add your handling code here:
        String user, pass;
        user = txtUserName.getText();
        pass = txtPassWord.getText();

        TaiKhoan tk = new TaiKhoan();
        tk.SetUsername(user);
        tk.SetPassword(pass);
        boolean check = cn.CheckLogin(tk);
        int lv = cn.LVTK(tk);
        if(check == true){
            Run.tk = cn.GetTaiKhoan(user, pass);
            this.setVisible(false);
            Run.QLCF();
        }else{
            JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu không đúng", "Login Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLogInActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogIn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassWord;
    private javax.swing.JTextField txtUserName;
}
