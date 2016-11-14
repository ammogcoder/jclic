/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.xtec;

/**
 *
 * @author fbusquet
 */
public class HTML5Lib extends javax.swing.JFrame {

  /**
   * Creates new form HTML5Lib
   */
  public HTML5Lib() {
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

    mainPanel = new javax.swing.JPanel();
    titlePanel = new javax.swing.JPanel();
    libName = new javax.swing.JLabel();
    pathLb = new javax.swing.JLabel();
    pathTxt = new javax.swing.JLabel();
    buttonsPanel = new javax.swing.JPanel();
    propBtn = new javax.swing.JButton();
    checkBtn = new javax.swing.JButton();
    updateBtn = new javax.swing.JButton();
    addBtn = new javax.swing.JButton();
    filtersPanel = new javax.swing.JPanel();
    combosPanel = new javax.swing.JPanel();
    langSelLb = new javax.swing.JLabel();
    langCombo = new javax.swing.JComboBox<String>();
    levelSelLb = new javax.swing.JLabel();
    levelCombo = new javax.swing.JComboBox<String>();
    areaSelLb = new javax.swing.JLabel();
    areaCombo = new javax.swing.JComboBox<String>();
    tagSelLb = new javax.swing.JLabel();
    tagCombo = new javax.swing.JComboBox<String>();
    textFieldsPanel = new javax.swing.JPanel();
    prjNameLb = new javax.swing.JLabel();
    prjNameTxt = new javax.swing.JTextField();
    authorLb = new javax.swing.JLabel();
    authorTxt = new javax.swing.JTextField();
    projectsPanel = new javax.swing.JPanel();
    prjListScroll = new javax.swing.JScrollPane();
    prjList = new javax.swing.JList<String>();
    okCancelPanel = new javax.swing.JPanel();
    cancelBtn = new javax.swing.JButton();
    saveBtn = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("edu/xtec/resources/messages/HTML5Lib"); // NOI18N
    setTitle(bundle.getString("appTitle")); // NOI18N

    libName.setText(bundle.getString("libraryNameLb")); // NOI18N

    pathLb.setLabelFor(pathLb);
    pathLb.setText(bundle.getString("pathLb")); // NOI18N

    pathTxt.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
    pathTxt.setText("...");

    javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
    titlePanel.setLayout(titlePanelLayout);
    titlePanelLayout.setHorizontalGroup(
      titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(titlePanelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(libName)
          .addGroup(titlePanelLayout.createSequentialGroup()
            .addComponent(pathLb)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(pathTxt)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    titlePanelLayout.setVerticalGroup(
      titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(titlePanelLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(libName)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(pathLb)
          .addComponent(pathTxt)))
    );

    propBtn.setText(bundle.getString("propBtnLb")); // NOI18N
    propBtn.setToolTipText(bundle.getString("propBtnTooltip")); // NOI18N

    checkBtn.setText(bundle.getString("checkBtnLb")); // NOI18N
    checkBtn.setToolTipText(bundle.getString("checkBtnTooltip")); // NOI18N

    updateBtn.setText(bundle.getString("updateBtnLb")); // NOI18N
    updateBtn.setToolTipText(bundle.getString("updateBtnTooltip")); // NOI18N

    addBtn.setText(bundle.getString("addBtnLb")); // NOI18N
    addBtn.setToolTipText(bundle.getString("addBtnTooltip")); // NOI18N

    javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
    buttonsPanel.setLayout(buttonsPanelLayout);
    buttonsPanelLayout.setHorizontalGroup(
      buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(buttonsPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(propBtn)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(checkBtn)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(updateBtn)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(addBtn)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    buttonsPanelLayout.setVerticalGroup(
      buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(buttonsPanelLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(propBtn)
          .addComponent(checkBtn)
          .addComponent(updateBtn)
          .addComponent(addBtn)))
    );

    filtersPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("filtersLb"))); // NOI18N

    langSelLb.setLabelFor(langCombo);
    langSelLb.setText(bundle.getString("langSelLb")); // NOI18N

    langCombo.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "All languages" }));

    levelSelLb.setLabelFor(levelCombo);
    levelSelLb.setText(bundle.getString("levelSelLb")); // NOI18N

    levelCombo.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "All levels" }));

    areaSelLb.setLabelFor(areaCombo);
    areaSelLb.setText(bundle.getString("areaSelLb")); // NOI18N

    areaCombo.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "All areas" }));

    tagSelLb.setLabelFor(tagCombo);
    tagSelLb.setText(bundle.getString("tagSelLb")); // NOI18N

    tagCombo.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "All tags" }));

    javax.swing.GroupLayout combosPanelLayout = new javax.swing.GroupLayout(combosPanel);
    combosPanel.setLayout(combosPanelLayout);
    combosPanelLayout.setHorizontalGroup(
      combosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(combosPanelLayout.createSequentialGroup()
        .addComponent(langSelLb)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(langCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(levelSelLb)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(levelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(areaSelLb)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(areaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(tagSelLb)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(tagCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 89, Short.MAX_VALUE))
    );
    combosPanelLayout.setVerticalGroup(
      combosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(combosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(langSelLb)
        .addComponent(langCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(levelSelLb)
        .addComponent(levelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(areaSelLb)
        .addComponent(areaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(tagSelLb)
        .addComponent(tagCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    prjNameLb.setLabelFor(prjNameTxt);
    prjNameLb.setText(bundle.getString("prjNameLb")); // NOI18N

    authorLb.setText(bundle.getString("authorLb")); // NOI18N

    javax.swing.GroupLayout textFieldsPanelLayout = new javax.swing.GroupLayout(textFieldsPanel);
    textFieldsPanel.setLayout(textFieldsPanelLayout);
    textFieldsPanelLayout.setHorizontalGroup(
      textFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(textFieldsPanelLayout.createSequentialGroup()
        .addComponent(prjNameLb)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(prjNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(authorLb)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(authorTxt))
    );
    textFieldsPanelLayout.setVerticalGroup(
      textFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(textFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
        .addComponent(prjNameLb)
        .addComponent(prjNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(authorLb)
        .addComponent(authorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    javax.swing.GroupLayout filtersPanelLayout = new javax.swing.GroupLayout(filtersPanel);
    filtersPanel.setLayout(filtersPanelLayout);
    filtersPanelLayout.setHorizontalGroup(
      filtersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(filtersPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(filtersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(combosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(filtersPanelLayout.createSequentialGroup()
            .addComponent(textFieldsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())))
    );
    filtersPanelLayout.setVerticalGroup(
      filtersPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(filtersPanelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(combosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(textFieldsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    projectsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("projectsLb"))); // NOI18N

    prjListScroll.setViewportView(prjList);

    javax.swing.GroupLayout projectsPanelLayout = new javax.swing.GroupLayout(projectsPanel);
    projectsPanel.setLayout(projectsPanelLayout);
    projectsPanelLayout.setHorizontalGroup(
      projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(prjListScroll)
    );
    projectsPanelLayout.setVerticalGroup(
      projectsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(prjListScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
    );

    cancelBtn.setText(bundle.getString("cancelBtnLb")); // NOI18N

    saveBtn.setText(bundle.getString("saveBtnLb")); // NOI18N

    javax.swing.GroupLayout okCancelPanelLayout = new javax.swing.GroupLayout(okCancelPanel);
    okCancelPanel.setLayout(okCancelPanelLayout);
    okCancelPanelLayout.setHorizontalGroup(
      okCancelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, okCancelPanelLayout.createSequentialGroup()
        .addGap(6, 6, 6)
        .addComponent(cancelBtn)
        .addGap(18, 18, 18)
        .addComponent(saveBtn)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    okCancelPanelLayout.setVerticalGroup(
      okCancelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(okCancelPanelLayout.createSequentialGroup()
        .addGroup(okCancelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(cancelBtn)
          .addComponent(saveBtn))
        .addGap(0, 12, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
    mainPanel.setLayout(mainPanelLayout);
    mainPanelLayout.setHorizontalGroup(
      mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(filtersPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(projectsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(okCancelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    mainPanelLayout.setVerticalGroup(
      mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(mainPanelLayout.createSequentialGroup()
        .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(filtersPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(projectsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(okCancelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

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
      java.util.logging.Logger.getLogger(HTML5Lib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(HTML5Lib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(HTML5Lib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(HTML5Lib.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new HTML5Lib().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton addBtn;
  private javax.swing.JComboBox<String> areaCombo;
  private javax.swing.JLabel areaSelLb;
  private javax.swing.JLabel authorLb;
  private javax.swing.JTextField authorTxt;
  private javax.swing.JPanel buttonsPanel;
  private javax.swing.JButton cancelBtn;
  private javax.swing.JButton checkBtn;
  private javax.swing.JPanel combosPanel;
  private javax.swing.JPanel filtersPanel;
  private javax.swing.JComboBox<String> langCombo;
  private javax.swing.JLabel langSelLb;
  private javax.swing.JComboBox<String> levelCombo;
  private javax.swing.JLabel levelSelLb;
  private javax.swing.JLabel libName;
  private javax.swing.JPanel mainPanel;
  private javax.swing.JPanel okCancelPanel;
  private javax.swing.JLabel pathLb;
  private javax.swing.JLabel pathTxt;
  private javax.swing.JList<String> prjList;
  private javax.swing.JScrollPane prjListScroll;
  private javax.swing.JLabel prjNameLb;
  private javax.swing.JTextField prjNameTxt;
  private javax.swing.JPanel projectsPanel;
  private javax.swing.JButton propBtn;
  private javax.swing.JButton saveBtn;
  private javax.swing.JComboBox<String> tagCombo;
  private javax.swing.JLabel tagSelLb;
  private javax.swing.JPanel textFieldsPanel;
  private javax.swing.JPanel titlePanel;
  private javax.swing.JButton updateBtn;
  // End of variables declaration//GEN-END:variables
}
