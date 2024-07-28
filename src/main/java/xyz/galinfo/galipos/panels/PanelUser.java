/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package xyz.galinfo.galipos.panels;

import at.favre.lib.crypto.bcrypt.BCrypt;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.lang.ArrayUtils;
import xyz.galinfo.galipos.models.CmbItem;
import xyz.galinfo.galipos.models.User;

/**
 *
 * @author janud
 */
public class PanelUser extends javax.swing.JPanel {

  private User currentUser;

  /**
   * Creates new form PanelDashboard
   */
  public PanelUser() {
    initComponents();
    String[] allowedAkses = User.getAllowedAkses();
    cmbUserAkses.removeAllItems();
    for (String akses : allowedAkses) {
      cmbUserAkses.addItem(new CmbItem(akses, akses.toUpperCase()));
    }
    loadDataUser(null, null);
  }

  private void loadDataUser(String columnName, String qWord) {
    ArrayList<User> users = User.getAll(columnName, qWord);
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    for (User user : users) {
      model.addRow(new Object[]{
        user.getId(),
        user.getNama(),
        user.getTelepon(),
        user.getAkses().toUpperCase(),
        user.getStatus().toUpperCase()
      });
    }
    jLabel10.setText(model.getRowCount() + "");
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
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    cmbUserAkses = new javax.swing.JComboBox<>();
    jLabel3 = new javax.swing.JLabel();
    txtUserNama = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    txtUserAlamat = new javax.swing.JTextField();
    jLabel5 = new javax.swing.JLabel();
    txtUserTelepon = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    txtUserUsername = new javax.swing.JTextField();
    jLabel7 = new javax.swing.JLabel();
    pwdUserPassword = new javax.swing.JPasswordField();
    jLabel8 = new javax.swing.JLabel();
    pwdUserKonfirmasiPassword = new javax.swing.JPasswordField();
    jLabel9 = new javax.swing.JLabel();
    jRadioButton1 = new javax.swing.JRadioButton();
    jRadioButton2 = new javax.swing.JRadioButton();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    jPanel3 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    txtUserKeyword = new javax.swing.JTextField();
    jButton4 = new javax.swing.JButton();
    jLabel10 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();

    jPanel1.setBackground(new java.awt.Color(0, 102, 153));

    jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("USER");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addContainerGap(752, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));
    jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel2.setText("Akses");
    jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, -1));

    cmbUserAkses.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cmbUserAksesActionPerformed(evt);
      }
    });
    jPanel2.add(cmbUserAkses, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 240, -1));

    jLabel3.setText("Nama");
    jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
    jPanel2.add(txtUserNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 240, -1));

    jLabel4.setText("Alamat");
    jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
    jPanel2.add(txtUserAlamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 240, -1));

    jLabel5.setText("Telepon");
    jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
    jPanel2.add(txtUserTelepon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 240, -1));

    jLabel6.setText("Username");
    jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
    jPanel2.add(txtUserUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 240, -1));

    jLabel7.setText("Password");
    jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));
    jPanel2.add(pwdUserPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 240, -1));

    jLabel8.setText("Konfirmasi password");
    jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));
    jPanel2.add(pwdUserKonfirmasiPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 240, -1));

    jLabel9.setText("Status");
    jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

    buttonGroup1.add(jRadioButton1);
    jRadioButton1.setSelected(true);
    jRadioButton1.setText("Aktif");
    jRadioButton1.setActionCommand("aktif");
    jPanel2.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

    buttonGroup1.add(jRadioButton2);
    jRadioButton2.setText("Nonaktif");
    jRadioButton2.setActionCommand("nonaktif");
    jPanel2.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

    jButton1.setText("Simpan");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

    jButton2.setText("Hapus");
    jButton2.setEnabled(false);
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

    jButton3.setText("Batal");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton3ActionPerformed(evt);
      }
    });
    jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, -1));

    jTable1.setAutoCreateRowSorter(true);
    jTable1.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "ID", "Nama", "Telepon", "Akses", "Status"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, true, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    jTable1.getTableHeader().setReorderingAllowed(false);
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jTable1MouseClicked(evt);
      }
    });
    jScrollPane1.setViewportView(jTable1);

    txtUserKeyword.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtUserKeywordActionPerformed(evt);
      }
    });

    jButton4.setText("Reset");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton4ActionPerformed(evt);
      }
    });

    jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
    jLabel10.setText("0");

    jLabel11.setText("Total:");

    jLabel12.setText("User");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addComponent(txtUserKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jButton4)
        .addGap(0, 0, Short.MAX_VALUE))
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel11)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel12))
          .addComponent(jScrollPane1))
        .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtUserKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton4))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel11)
          .addComponent(jLabel10)
          .addComponent(jLabel12))
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
          .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
    actionFormUser();
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    // TODO add your handling code here:
    actionClickDataUser();
  }//GEN-LAST:event_jTable1MouseClicked

  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    // TODO add your handling code here:
    resetForm();
  }//GEN-LAST:event_jButton3ActionPerformed
  private void resetForm() {
    currentUser = null;
    cmbUserAkses.setSelectedIndex(0);
    txtUserNama.setText(null);
    txtUserAlamat.setText(null);
    txtUserTelepon.setText(null);
    txtUserUsername.setText(null);
    pwdUserPassword.setText(null);
    pwdUserKonfirmasiPassword.setText(null);
    jButton2.setEnabled(false);
    jRadioButton1.setSelected(true);
  }
  private void cmbUserAksesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUserAksesActionPerformed
    // TODO add your handling code here:
    actionUserAkses();
  }//GEN-LAST:event_cmbUserAksesActionPerformed

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    // TODO add your handling code here:
    actionHapus();
  }//GEN-LAST:event_jButton2ActionPerformed

  private void txtUserKeywordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserKeywordActionPerformed
    String qWord = txtUserKeyword.getText();
    loadDataUser("nama", qWord);
  }//GEN-LAST:event_txtUserKeywordActionPerformed

  private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    // TODO add your handling code here:
    txtUserKeyword.setText(null);
    loadDataUser(null, null);
  }//GEN-LAST:event_jButton4ActionPerformed
  private void actionHapus() {
    int dialogOptios = JOptionPane.YES_NO_OPTION;
    int dialogResult = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin menghapus user dengan naama " + currentUser.getNama() + "?", "Hapus user", dialogOptios);
    if (dialogResult == JOptionPane.YES_OPTION) {
      if (currentUser.delete() != null) {
        JOptionPane.showMessageDialog(this, "User dengan nama " + currentUser.getNama() + " berhasil dihapus.", "Hapus user", 1);
        currentUser = null;
        resetForm();
        loadDataUser(null, null);
      }
    }
  }

  private void actionUserAkses() {
    String akses = cmbUserAkses.getItemAt(cmbUserAkses.getSelectedIndex()).getId();
    if (akses.equals("operator") || akses.equals("kasir")) {
      txtUserUsername.setEnabled(true);
      pwdUserPassword.setEnabled(true);
      pwdUserKonfirmasiPassword.setEnabled(true);
    } else {
      txtUserUsername.setText(null);
      pwdUserPassword.setText(null);
      pwdUserKonfirmasiPassword.setText(null);
      txtUserUsername.setEnabled(false);
      pwdUserPassword.setEnabled(false);
      pwdUserKonfirmasiPassword.setEnabled(false);
    }
  }

  private void actionClickDataUser() {
    int idUser = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
    User user = User.getById(idUser);
    if (user != null) {
      currentUser = user;
      int selectedAkses = -1;
      int totalItem = cmbUserAkses.getItemCount();
      for (int i = 0; i < totalItem; i++) {
        if (currentUser.getAkses().equals(cmbUserAkses.getItemAt(i).getId())) {
          selectedAkses = i;
        }
      }
      cmbUserAkses.setSelectedIndex(selectedAkses);
      txtUserNama.setText(currentUser.getNama());
      txtUserAlamat.setText(currentUser.getAlamat());
      txtUserTelepon.setText(currentUser.getTelepon());
      txtUserUsername.setText(currentUser.getUsername());
      if (currentUser.getStatus().equals("aktif")) {
        jRadioButton1.setSelected(true);
      } else {
        jRadioButton2.setSelected(true);
      }
      jButton2.setEnabled(true);
    }
  }

  private void actionFormUser() {
    String akses = cmbUserAkses.getItemAt(cmbUserAkses.getSelectedIndex()).getId();
    String nama = txtUserNama.getText();
    String alamat = txtUserAlamat.getText();
    String telepon = txtUserTelepon.getText();
    String username = txtUserUsername.getText();
    char[] password = pwdUserPassword.getPassword();
    char[] konfirmasiPassword = pwdUserKonfirmasiPassword.getPassword();
    String status = buttonGroup1.getSelection().getActionCommand();
    boolean isValid = true;
    boolean isUsernameRequired = true;
    if (!akses.equals("operator") && !akses.equals("kasir")) {
      isUsernameRequired = false;
    }
    boolean isPasswordRequired = true;
    if (currentUser != null) {
      isPasswordRequired = false;
    }
    if (nama.length() == 0) {
      isValid = false;
      JOptionPane.showMessageDialog(this, "Nama harus diisi.", "Input salah", 0);
    } else {
      if (isUsernameRequired) {
        if (username.length() < 8) {
          isValid = false;
          JOptionPane.showMessageDialog(this, "Username harus diisi, minimal 8 karakter.", "Input salah", 0);
        } else {
          User user = User.getByUsername(username, currentUser != null ? currentUser.getId() : 0);
          if (user != null) {
            isValid = false;
            JOptionPane.showMessageDialog(this, "Username tersebut sudah digunakan.", "Input salah", 0);
          } else {
            if (isPasswordRequired) {
              if (password.length < 8) {
                isValid = false;
                JOptionPane.showMessageDialog(this, "Password harus diisi, minimal 8 karakter.", "Input salah", 0);
              } else {
                if (!ArrayUtils.isEquals(password, konfirmasiPassword)) {
                  isValid = false;
                  JOptionPane.showMessageDialog(this, "Password dan konfirmasinya harus sama.", "Input salah", 0);
                }
              }
            }
          }
        }
      }
    }
    if (isValid) {
      String word1 = "Tambah";
      User user;
      if (currentUser == null) {
        user = new User();
      } else {
        user = currentUser;
        word1 = "Simpan";
      }
      user.setAkses(akses);
      user.setNama(nama);
      user.setAlamat(alamat);
      user.setTelepon(telepon);
      user.setUsername(username);
      if (password.length > 0) {
        user.setPassword(BCrypt.withDefaults().hashToString(12, password));
      }
      System.out.println(user.getPassword());
      user.setStatus(status);
      if (user.save() != null) {
        JOptionPane.showMessageDialog(this, "User " + user.getNama() + " berhasil disimpan.", word1 + " user", 1);
        resetForm();
      } else {
        JOptionPane.showMessageDialog(this, "User " + user.getNama() + " gagal disimpan.", word1 + " user", 0);
      }
      loadDataUser(null, null);
    }
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.JComboBox<CmbItem> cmbUserAkses;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JRadioButton jRadioButton1;
  private javax.swing.JRadioButton jRadioButton2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable1;
  private javax.swing.JPasswordField pwdUserKonfirmasiPassword;
  private javax.swing.JPasswordField pwdUserPassword;
  private javax.swing.JTextField txtUserAlamat;
  private javax.swing.JTextField txtUserKeyword;
  private javax.swing.JTextField txtUserNama;
  private javax.swing.JTextField txtUserTelepon;
  private javax.swing.JTextField txtUserUsername;
  // End of variables declaration//GEN-END:variables
}