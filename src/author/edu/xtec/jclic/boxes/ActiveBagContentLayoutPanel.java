/*
 * File    : ActiveBagContentLayoutPanel.java
 * Created : 03-apr-2003 12:54
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

package edu.xtec.jclic.boxes;

import edu.xtec.jclic.Activity;
import edu.xtec.util.Options;
import java.util.EventObject;

/**
 * @author Francesc Busquets (fbusquets@xtec.cat)
 * @version 13.09.09
 */
public class ActiveBagContentLayoutPanel extends javax.swing.JPanel {

  ActiveBagContentEditor parent;
  Options options;
  int boxGridPos = Activity.AB;

  /** Creates new form ActiveBagContentRelPanel */
  public ActiveBagContentLayoutPanel(ActiveBagContentEditor parent) {
    this.parent = parent;
    options = parent.getOptions();
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  private void initComponents() { // GEN-BEGIN:initComponents
    java.awt.GridBagConstraints gridBagConstraints;

    layoutGroup = new javax.swing.ButtonGroup();
    abBtn = new javax.swing.JToggleButton();
    baBtn = new javax.swing.JToggleButton();
    aubBtn = new javax.swing.JToggleButton();
    buaBtn = new javax.swing.JToggleButton();

    setLayout(new java.awt.GridBagLayout());

    abBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/xtec/resources/icons/ab_icon.gif")));
    abBtn.setToolTipText(options.getMsg("edit_act_gridLayout_tooltip"));
    layoutGroup.add(abBtn);
    abBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        abBtnActionPerformed(evt);
      }
    });

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 0);
    add(abBtn, gridBagConstraints);

    baBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/xtec/resources/icons/ba_icon.gif")));
    baBtn.setToolTipText(options.getMsg("edit_act_gridLayout_tooltip"));
    layoutGroup.add(baBtn);
    baBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        baBtnActionPerformed(evt);
      }
    });

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
    add(baBtn, gridBagConstraints);

    aubBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/xtec/resources/icons/aub_icon.gif")));
    aubBtn.setToolTipText(options.getMsg("edit_act_gridLayout_tooltip"));
    layoutGroup.add(aubBtn);
    aubBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        aubBtnActionPerformed(evt);
      }
    });

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 0);
    add(aubBtn, gridBagConstraints);

    buaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/xtec/resources/icons/bua_icon.gif")));
    buaBtn.setToolTipText(options.getMsg("edit_act_gridLayout_tooltip"));
    layoutGroup.add(buaBtn);
    buaBtn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        buaBtnActionPerformed(evt);
      }
    });

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 0, 3, 3);
    add(buaBtn, gridBagConstraints);
  } // GEN-END:initComponents

  private void buaBtnActionPerformed(java.awt.event.ActionEvent evt) { // GEN-FIRST:event_buaBtnActionPerformed

    resetPanel(evt);
  } // GEN-LAST:event_buaBtnActionPerformed

  private void aubBtnActionPerformed(java.awt.event.ActionEvent evt) { // GEN-FIRST:event_aubBtnActionPerformed

    resetPanel(evt);
  } // GEN-LAST:event_aubBtnActionPerformed

  private void baBtnActionPerformed(java.awt.event.ActionEvent evt) { // GEN-FIRST:event_baBtnActionPerformed

    resetPanel(evt);
  } // GEN-LAST:event_baBtnActionPerformed

  private void abBtnActionPerformed(java.awt.event.ActionEvent evt) { // GEN-FIRST:event_abBtnActionPerformed

    resetPanel(evt);
  } // GEN-LAST:event_abBtnActionPerformed

  private void resetPanel(EventObject ev) {
    if (ev != null && ev.getSource() != null) {
      Object src = ev.getSource();
      int v = src == abBtn ? Activity.AB
          : src == baBtn ? Activity.BA : src == aubBtn ? Activity.AUB : src == buaBtn ? Activity.BUA : boxGridPos;
      if (v != boxGridPos) {
        boxGridPos = v;
        selectItem();
        parent.abcpp.setBoxGridPos(boxGridPos);
      }
      parent.setModified(true);
    }
  }

  private void selectItem() {
    abBtn.setSelected(boxGridPos == Activity.AB);
    baBtn.setSelected(boxGridPos == Activity.BA);
    aubBtn.setSelected(boxGridPos == Activity.AUB);
    buaBtn.setSelected(boxGridPos == Activity.BUA);
  }

  public void clear() {
    boxGridPos = Activity.AB;
  }

  public void fillData(Activity act) {
    if (act != null) {
      boxGridPos = act.boxGridPos;
      selectItem();
    }
  }

  public void saveData(Activity act) {
    if (act != null)
      act.boxGridPos = boxGridPos;
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JToggleButton abBtn;
  private javax.swing.JToggleButton aubBtn;
  private javax.swing.JToggleButton baBtn;
  private javax.swing.JToggleButton buaBtn;
  private javax.swing.ButtonGroup layoutGroup;
  // End of variables declaration//GEN-END:variables

}
