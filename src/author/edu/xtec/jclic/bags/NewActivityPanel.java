/*
 * File    : NewActivityPanel.java
 * Created : 28-apr-2003 17:11
 * By      : fbusquets
 *
 * JClic - Authoring and playing system for educational activities
 *
 * Copyright (C) 2000 - 2018 Francesc Busquets & Departament
 * d'Educacio de la Generalitat de Catalunya
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details (see the LICENSE file).
 */

package edu.xtec.jclic.bags;

import edu.xtec.util.Options;
import edu.xtec.util.StrUtils;

/**
 * @author Francesc Busquets (fbusquets@xtec.cat)
 * @version 13.08.29
 */
public class NewActivityPanel extends javax.swing.JPanel {

  Options options;
  SelectActivityClass sac;

  /** Creates new form NewActivityPanel */
  public NewActivityPanel(Options options) {
    this.options = options;
    initComponents();
    sac = (SelectActivityClass) classPanel;
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  private void initComponents() { // GEN-BEGIN:initComponents
    java.awt.GridBagConstraints gridBagConstraints;
    javax.swing.JLabel nameLb;
    javax.swing.JPanel namePanel;

    classPanel = new SelectActivityClass(options);
    namePanel = new javax.swing.JPanel();
    nameLb = new javax.swing.JLabel();
    nameField = new javax.swing.JTextField();

    setLayout(new java.awt.GridBagLayout());

    classPanel.setBorder(new javax.swing.border.TitledBorder(options.getMsg("edit_act_prompt_class")));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 1.0;
    add(classPanel, gridBagConstraints);

    namePanel.setLayout(new java.awt.GridBagLayout());

    namePanel.setBorder(new javax.swing.border.TitledBorder(options.getMsg("edit_act_prompt_name")));
    nameLb.setLabelFor(nameField);
    nameLb.setText(options.getMsg("edit_act_newActivity_name"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    namePanel.add(nameLb, gridBagConstraints);

    nameField.setToolTipText(options.getMsg("edit_act_newActivity_name_tooltip"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 1.0;
    namePanel.add(nameField, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    add(namePanel, gridBagConstraints);
  } // GEN-END:initComponents

  public String gectActivityClassName() {
    return sac.getCurrentClassName();
  }

  public void setActivityClassName(String className) {
    sac.setCurrentClassName(className);
  }

  public String getActivityName() {
    return StrUtils.nullableString(nameField.getText());
  }

  public void setActivityName(String name) {
    nameField.setText(StrUtils.secureString(name));
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel classPanel;
  protected javax.swing.JTextField nameField;
  // End of variables declaration//GEN-END:variables

}
