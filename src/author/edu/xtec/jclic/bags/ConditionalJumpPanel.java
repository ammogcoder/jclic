/*
 * File    : ConditionalJumpPanel.java
 * Created : 19-mar-2004 11:44
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

import edu.xtec.jclic.beans.SmallIntEditor;
import edu.xtec.util.Options;
import edu.xtec.util.ResourceManager;
import java.util.EventObject;
import javax.swing.Icon;
import javax.swing.JComboBox;

/**
 * @author Francesc Busquets (fbusquets@xtec.cat)
 * @version 13.08.09
 */
public class ConditionalJumpPanel extends edu.xtec.util.CtrlPanel {

  Options options;
  protected String[] jmpOptions;
  protected Icon[] jmpIcons;
  ActivitySequenceElementEditorPanel asep;
  ConditionalJumpInfo ji;
  String sType;

  /** Creates new form ConditionalJumpPanel */
  public ConditionalJumpPanel(Options options, ActivitySequenceElementEditorPanel asep, boolean up) {
    this.options = options;
    this.asep = asep;
    sType = up ? "up" : "down";
    ji = new ConditionalJumpInfo(JumpInfo.RETURN, null, 60);
    initObjects();
    initComponents();
  }

  private static final String[] OPTIONS_KEYS = { "edit_seq_action_jump", "edit_seq_action_stop",
      "edit_seq_action_return", "edit_seq_action_exit" },
      OPTIONS_ICONS = { "seq_next_jump", "seq_next_stop", "seq_next_return", "seq_exit" };

  private void initObjects() {
    int l = OPTIONS_KEYS.length;
    jmpOptions = new String[l];
    jmpIcons = new Icon[l];
    for (int i = 0; i < l; i++) {
      jmpOptions[i] = options.getMsg(OPTIONS_KEYS[i]);
      jmpIcons[i] = ResourceManager.getImageIcon("icons/" + OPTIONS_ICONS[i] + ".gif");
    }
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  // <editor-fold defaultstate="collapsed" desc="Generated
  // Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    javax.swing.JLabel actionLb = new javax.swing.JLabel();
    actionCombo = new JComboBox<Object>(jmpOptions);
    jumpBtn = new javax.swing.JButton();
    jumpLb = new javax.swing.JLabel();
    javax.swing.JLabel thresholdLb = new javax.swing.JLabel();
    thresholdInt = new edu.xtec.jclic.beans.SmallIntEditor();
    javax.swing.JLabel timeLb = new javax.swing.JLabel();
    timeInt = new edu.xtec.jclic.beans.SmallIntEditor();

    setLayout(new java.awt.GridBagLayout());

    actionLb.setLabelFor(actionCombo);
    actionLb.setText(options.getMsg("edit_seq_action"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    add(actionLb, gridBagConstraints);

    actionCombo.setToolTipText(options.getMsg("edit_seq_action_tooltip"));
    actionCombo.setRenderer(new edu.xtec.util.CustomListCellRenderer(jmpOptions, jmpIcons));
    actionCombo.addActionListener(this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    add(actionCombo, gridBagConstraints);

    jumpBtn.setText("...");
    jumpBtn.setToolTipText(options.getMsg("edit_seq_jump_tooltip"));
    jumpBtn.setMargin(new java.awt.Insets(0, 3, 0, 3));
    jumpBtn.setEnabled(false);
    jumpBtn.addActionListener(this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    add(jumpBtn, gridBagConstraints);

    jumpLb.setText(" ");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    add(jumpLb, gridBagConstraints);

    thresholdLb.setLabelFor(thresholdInt);
    thresholdLb.setText(options.getMsg("edit_seq_threshold"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    add(thresholdLb, gridBagConstraints);

    thresholdInt.setToolTipText(options.getMsg("edit_seq_threshold_tooltip_" + sType));
    thresholdInt.setMax(100);
    thresholdInt.setMin(-1);
    thresholdInt.setValue(60);
    thresholdInt.addPropertyChangeListener(SmallIntEditor.PROP_VALUE, this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    add(thresholdInt, gridBagConstraints);

    timeLb.setLabelFor(timeInt);
    timeLb.setText(options.getMsg("edit_seq_time"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    add(timeLb, gridBagConstraints);

    timeInt.setToolTipText(options.getMsg("edit_seq_time_tooltip_" + sType));
    timeInt.setMax(9999);
    timeInt.setMin(-1);
    timeInt.setValue(-1);
    timeInt.addPropertyChangeListener(SmallIntEditor.PROP_VALUE, this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    add(timeInt, gridBagConstraints);
  } // </editor-fold>//GEN-END:initComponents

  public void setJumpInfo(ConditionalJumpInfo ji, boolean up) {
    if (ji == null)
      ji = new ConditionalJumpInfo(JumpInfo.RETURN, null, up ? 80 : 20);
    else
      ji = new ConditionalJumpInfo(ji.action, ji.sequence, ji.threshold, ji.time);
    this.ji = ji;
    thresholdInt.setValue(ji.threshold);
    timeInt.setValue(ji.time);
    actionCombo.setSelectedIndex(ji.action);

    thresholdInt.setToolTipText(options.getMsg("edit_seq_threshold_tooltip_" + (up ? "up" : "down")));
    timeInt.setToolTipText(options.getMsg("edit_seq_time_tooltip_" + (up ? "up" : "down")));

    setJumpLabel();
    checkEnabled();
    setModified(false);
  }

  public ConditionalJumpInfo getJumpInfo() {
    ji.threshold = thresholdInt.getValue();
    ji.time = timeInt.getValue();
    return ji;
  }

  @Override
  public boolean eventPerformed(EventObject ev) {

    Object src = (ev == null ? null : ev.getSource());
    if (src == null)
      return false;

    if (src == actionCombo || src == jumpBtn) {
      asep.checkJump(ji, actionCombo, false, src == jumpBtn);
      setJumpLabel();
    }
    checkEnabled();
    repaint();
    return true;
  }

  public void checkEnabled() {
    jumpBtn.setEnabled(ji.action == JumpInfo.JUMP);
  }

  private void setJumpLabel() {
    StringBuilder sb = new StringBuilder();
    if (ji.action == JumpInfo.JUMP && ji.sequence != null) {
      sb.append(ji.sequence);
      if (ji.projectPath != null)
        sb.append(" (").append(ji.projectPath).append(")");
    }
    jumpLb.setText(sb.append(' ').substring(0));
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<Object> actionCombo;
  private javax.swing.JButton jumpBtn;
  private javax.swing.JLabel jumpLb;
  private edu.xtec.jclic.beans.SmallIntEditor thresholdInt;
  private edu.xtec.jclic.beans.SmallIntEditor timeInt;
  // End of variables declaration//GEN-END:variables

}
