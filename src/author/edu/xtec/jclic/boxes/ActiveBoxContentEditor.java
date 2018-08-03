/*
 * File    : ActiveBoxContentEditor.java
 * Created : 02-oct-2002 12:53
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

import edu.xtec.jclic.Constants;
import edu.xtec.jclic.bags.MediaBagEditor;
import edu.xtec.jclic.beans.*;
import edu.xtec.jclic.media.MediaContentEditor;
import edu.xtec.util.Messages;
import edu.xtec.util.Options;
import edu.xtec.util.StrUtils;
import java.awt.Component;
import java.awt.Dimension;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Map;
import javax.swing.event.DocumentEvent;

/**
 * @author Francesc Busquets (fbusquets@xtec.cat)
 * @version 13.09.17
 */
public class ActiveBoxContentEditor extends edu.xtec.util.CtrlPanel {

  Options options;
  ActiveBoxContent abc;
  MediaBagEditor mbe;
  boolean eventsEnabled = true;
  public static final String PROP_ABC = "activeBoxContent";
  ActiveBox preview;

  /** Creates new form ActiveBoxContentEditor */
  public ActiveBoxContentEditor(Options options, ActiveBoxContent abc, MediaBagEditor mbe, ActiveBox ab) {
    this.options = options;
    initComponents();
    setMediaBagEditor(mbe);
    setActiveBoxContent(abc);
    textArea.getDocument().addDocumentListener(this);
    setPreview(ab);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  private void initComponents() { // GEN-BEGIN:initComponents
    java.awt.GridBagConstraints gridBagConstraints;
    javax.swing.JLabel imgLb;
    javax.swing.JSeparator sep1;
    javax.swing.JSeparator sep11;
    javax.swing.JSeparator sep2;
    javax.swing.JLabel textLb;

    hAlignGrp = new javax.swing.ButtonGroup();
    vAlignGrp = new javax.swing.ButtonGroup();
    textLb = new javax.swing.JLabel();
    textScroll = new javax.swing.JScrollPane();
    textArea = new javax.swing.JTextArea();
    textCompass = new edu.xtec.jclic.beans.Compass();
    sep1 = new javax.swing.JSeparator();
    imgLb = new javax.swing.JLabel();
    imgButton = new edu.xtec.jclic.beans.ImgButton();
    imgButton.setOptions(options);
    overlapChk = new javax.swing.JCheckBox();
    imgCompass = new edu.xtec.jclic.beans.Compass();
    sep2 = new javax.swing.JSeparator();
    styleLb = new javax.swing.JLabel();
    boxBaseButton = new edu.xtec.jclic.beans.BoxBaseButton();
    boxBaseButton.setOptions(options);
    borderChk = new javax.swing.JCheckBox();
    sep11 = new javax.swing.JSeparator();
    mcLb = new javax.swing.JLabel();
    mcButton = new edu.xtec.jclic.beans.MediaContentButton();
    mcButton.setOptions(options);
    sizeSep = new javax.swing.JSeparator();
    sizeLb = new javax.swing.JLabel();
    sizePanel = new javax.swing.JPanel();
    widthLb = new javax.swing.JLabel();
    widthEdit = new edu.xtec.jclic.beans.SmallIntEditor();
    heightLb = new javax.swing.JLabel();
    heightEdit = new edu.xtec.jclic.beans.SmallIntEditor();

    setLayout(new java.awt.GridBagLayout());

    setBorder(new javax.swing.border.EtchedBorder());
    textLb.setLabelFor(textArea);
    textLb.setText(options.getMsg("edit_act_text"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
    add(textLb, gridBagConstraints);

    textScroll.setPreferredSize(new java.awt.Dimension(300, 3));
    textArea.setWrapStyleWord(true);
    textArea.setLineWrap(true);
    textScroll.setViewportView(textArea);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 1.0;
    add(textScroll, gridBagConstraints);

    textCompass.addPropertyChangeListener(Compass.PROP_DIRECTION, this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    add(textCompass, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    add(sep1, gridBagConstraints);

    imgLb.setText(options.getMsg("edit_act_image"));
    imgLb.setLabelFor(imgButton);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    add(imgLb, gridBagConstraints);

    imgButton.setToolTipText(options.getMsg("edit_act_image_tooltip"));
    imgButton.addPropertyChangeListener(ImgButton.PROP_IMG_NAME, this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    add(imgButton, gridBagConstraints);

    overlapChk.setToolTipText(options.getMsg("edit_act_overlap_tooltip"));
    overlapChk.setText(options.getMsg("edit_act_overlap"));
    overlapChk.addActionListener(this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.insets = new java.awt.Insets(0, 3, 3, 3);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    add(overlapChk, gridBagConstraints);

    imgCompass.addPropertyChangeListener(Compass.PROP_DIRECTION, this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.gridheight = 2;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    add(imgCompass, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    add(sep2, gridBagConstraints);

    styleLb.setText(options.getMsg("edit_act_style"));
    styleLb.setLabelFor(boxBaseButton);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    add(styleLb, gridBagConstraints);

    boxBaseButton.setToolTipText(options.getMsg("edit_style_tooltip"));
    boxBaseButton.addPropertyChangeListener(BoxBaseButton.PROP_BOX_BASE, this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    add(boxBaseButton, gridBagConstraints);

    borderChk.setToolTipText(options.getMsg("edit_act_border_tooltip"));
    borderChk.setText(options.getMsg("edit_act_border"));
    borderChk.addActionListener(this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    add(borderChk, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    add(sep11, gridBagConstraints);

    mcLb.setLabelFor(mcButton);
    mcLb.setText(options.getMsg("edit_mc_label"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    add(mcLb, gridBagConstraints);

    mcButton.addPropertyChangeListener(MediaContentButton.PROP_MEDIA_CONTENT, this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    add(mcButton, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    add(sizeSep, gridBagConstraints);

    sizeLb.setLabelFor(sizePanel);
    sizeLb.setText(options.getMsg("edit_cell_size"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    add(sizeLb, gridBagConstraints);

    sizePanel.setLayout(new java.awt.GridBagLayout());

    widthLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/xtec/resources/icons/adjust_width.gif")));
    widthLb.setLabelFor(widthEdit);
    widthLb.setText(":");
    widthLb.setIconTextGap(0);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 2);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    sizePanel.add(widthLb, gridBagConstraints);

    widthEdit.setToolTipText(options.getMsg("edit_act_cell_width_tooltip"));
    widthEdit.setMax(999);
    widthEdit.setMin(edu.xtec.jclic.Constants.MIN_CELL_SIZE);
    widthEdit.addPropertyChangeListener(SmallIntEditor.PROP_VALUE, this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 2, 3, 3);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    sizePanel.add(widthEdit, gridBagConstraints);

    heightLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/xtec/resources/icons/adjust_height.gif")));
    heightLb.setLabelFor(widthEdit);
    heightLb.setText(":");
    heightLb.setIconTextGap(0);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 12, 3, 2);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    sizePanel.add(heightLb, gridBagConstraints);

    heightEdit.setToolTipText(options.getMsg("edit_act_cell_height_tooltip"));
    heightEdit.setMax(999);
    heightEdit.setMin(edu.xtec.jclic.Constants.MIN_CELL_SIZE);
    heightEdit.addPropertyChangeListener(SmallIntEditor.PROP_VALUE, this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(3, 2, 3, 3);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 1.0;
    sizePanel.add(heightEdit, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    add(sizePanel, gridBagConstraints);
  } // GEN-END:initComponents

  public void setPreview(ActiveBox ab) {
    preview = ab;
    boxBaseButton.setPreview(ab);
  }

  @Override
  public boolean genericEvent(Object event) {

    Object src = (event instanceof EventObject) ? ((EventObject) event).getSource()
        : (event instanceof DocumentEvent) ? textArea : null;

    if (eventsEnabled && src != null) {

      eventsEnabled = false;

      ActiveBoxContent oldAbc = getAbcClone();
      boolean resetPreviewFont = false;

      if (src == textArea) {
        String txt = textArea.getText();
        if (!StrUtils.compareTrimStringsIgnoreCase(txt, abc.rawText)) {
          abc.setTextContent(txt != null && txt.length() > 0 ? txt : null);
          if (abc.bb != null)
            abc.bb.resetFont();
        }
      } else if (src == imgButton) {
        if (abc.imgName != null)
          abc.img = null;
        abc.imgName = imgButton.getImgName();
      } else if (src == borderChk)
        abc.border = borderChk.isSelected();
      else if (src == overlapChk) {
        abc.avoidOverlapping = overlapChk.isSelected();
        resetPreviewFont = true;
      } else if (src == textCompass) {
        abc.txtAlign = textCompass.getDoubleDirection();
        resetPreviewFont = true;
      } else if (src == imgCompass) {
        abc.imgAlign = imgCompass.getDoubleDirection();
        resetPreviewFont = true;
      } else if (src == boxBaseButton) {
        abc.bb = boxBaseButton.getBoxBase();
        resetPreviewFont = true;
      } else if (src == mcButton) {
        abc.mediaContent = mcButton.getMediaContent();
      } else if (abc.dimension != null && src == widthEdit || src == heightEdit) {
        abc.setDimension(new Dimension(widthEdit.getValue(), heightEdit.getValue()));
      }

      if (mbe != null && (src == textArea || src == imgButton)) {
        try {
          abc.realizeContent(mbe.getMediaBag());
        } catch (Exception ex) {
          options.getMessages().showErrorWarning(this, "ERROR", ex);
        }
      }

      if (preview != null) {
        BoxBase bb = abc.bb;
        if (resetPreviewFont && bb != null)
          bb.resetFont();
        preview.setCurrentContent(abc);
      }

      checkAndFirePropertyChange(oldAbc);

      eventsEnabled = true;
    }
    return true;
  }

  public void setActiveBoxContent(ActiveBoxContent c) {
    if (c == null)
      c = new ActiveBoxContent();
    eventsEnabled = false;
    abc = (ActiveBoxContent) c.clone();
    textArea.setText(abc.text);
    imgButton.clear();
    imgButton.setImgName(abc.imgName);
    borderChk.setSelected(abc.border == null ? false : abc.border.booleanValue());
    textCompass.setDoubleDirection(abc.txtAlign);
    imgCompass.setDoubleDirection(abc.imgAlign);
    overlapChk.setSelected(abc.avoidOverlapping);
    boxBaseButton.setBoxBase(abc.bb);
    mcButton.clear();
    mcButton.setMediaContent(abc.mediaContent);

    Dimension size = abc.getDimension();
    sizeSep.setVisible(size != null);
    sizeLb.setVisible(size != null);
    sizePanel.setVisible(size != null);
    widthEdit.setValue(size == null ? 0 : size.width);
    heightEdit.setValue(size == null ? 0 : size.height);

    if (preview != null)
      preview.setCurrentContent(abc);
    eventsEnabled = true;
  }

  public ActiveBoxContent getAbc() {
    if (abc.dimension != null) {
      abc.setDimension(new Dimension(widthEdit.getValue(), heightEdit.getValue()));
    }
    return abc;
  }

  public ActiveBoxContent getAbcClone() {
    return abc == null ? null : (ActiveBoxContent) abc.clone();
  }

  private void checkAndFirePropertyChange(ActiveBoxContent oldAbc) {
    ActiveBoxContent currentAbc = getAbc();
    boolean eq = ((oldAbc == null && currentAbc == null) || (oldAbc != null && oldAbc.equals(currentAbc)));
    if (!eq)
      firePropertyChange(PROP_ABC, oldAbc, currentAbc);
  }

  public void setMediaBagEditor(MediaBagEditor mbe) {
    this.mbe = mbe;
    imgButton.setMediaBagEditor(mbe);
    mcButton.setMediaBagEditor(mbe);
  }

  private static Map<Options, ActiveBoxContentEditor> panels = new HashMap<Options, ActiveBoxContentEditor>();

  public static ActiveBoxContent getActiveBoxContent(ActiveBoxContent initialAbc, Component parent, Options options,
      MediaBagEditor mbe, ActiveBox preview) {
    if (initialAbc == null)
      initialAbc = new ActiveBoxContent();
    Messages msg = options.getMessages();
    ActiveBoxContentEditor abce = panels.get(options);
    if (abce == null) {
      abce = new ActiveBoxContentEditor(options, initialAbc, mbe, preview);
      panels.put(options, abce);
    } else {
      abce.setPreview(null);
      abce.setMediaBagEditor(mbe);
      abce.setActiveBoxContent(initialAbc);
      abce.setPreview(preview);
    }
    ActiveBoxContent abcBackup = null, abcOriginal = null;
    if (preview != null) {
      abcOriginal = preview.getCurrentContent();
      if (abcOriginal != null)
        abcBackup = (ActiveBoxContent) abcOriginal.clone();
    }
    boolean b = msg.showInputDlg(parent, abce, "edit_cell_title");
    if (!b && preview != null) {
      if (abcOriginal != null && abcBackup != null) {
        abcOriginal.copyRawDataFrom(abcBackup);
      }
      preview.setCurrentContent(abcOriginal);
    }
    return b ? abce.getAbc() : null;
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JCheckBox borderChk;
  private edu.xtec.jclic.beans.BoxBaseButton boxBaseButton;
  private javax.swing.ButtonGroup hAlignGrp;
  private edu.xtec.jclic.beans.SmallIntEditor heightEdit;
  private javax.swing.JLabel heightLb;
  private edu.xtec.jclic.beans.ImgButton imgButton;
  private edu.xtec.jclic.beans.Compass imgCompass;
  private edu.xtec.jclic.beans.MediaContentButton mcButton;
  private javax.swing.JLabel mcLb;
  private javax.swing.JCheckBox overlapChk;
  private javax.swing.JLabel sizeLb;
  private javax.swing.JPanel sizePanel;
  private javax.swing.JSeparator sizeSep;
  private javax.swing.JLabel styleLb;
  private javax.swing.JTextArea textArea;
  private edu.xtec.jclic.beans.Compass textCompass;
  private javax.swing.JScrollPane textScroll;
  private javax.swing.ButtonGroup vAlignGrp;
  private edu.xtec.jclic.beans.SmallIntEditor widthEdit;
  private javax.swing.JLabel widthLb;
  // End of variables declaration//GEN-END:variables

  // Utility functions

  public static boolean nameChanged(ActiveBoxContent abc, int type, String oldName, String newName) {
    boolean result = false;
    if ((type & Constants.T_IMAGE) != 0 && oldName.equals(abc.imgName)) {
      abc.imgName = newName;
      result = true;
    }
    if (abc.mediaContent != null)
      result |= MediaContentEditor.nameChanged(abc.mediaContent, type, oldName, newName);
    return result;
  }
}
