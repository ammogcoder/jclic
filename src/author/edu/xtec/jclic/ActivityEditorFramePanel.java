/*
 * File    : ActivityEditorFramePanel.java
 * Created : 10-jun-2002 09:59
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

package edu.xtec.jclic;

import edu.xtec.jclic.beans.*;
import edu.xtec.jclic.misc.Gradient;
import edu.xtec.jclic.misc.Utils;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.util.EventObject;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 * @author Francesc Busquets (fbusquets@xtec.cat)
 * @version 13.08.29
 */
public class ActivityEditorFramePanel extends ActivityEditorInternalPanel {

  edu.xtec.jclic.bags.MediaBagEditor mediaBagEditor;

  /** Creates new form MenuEditorPanel */
  public ActivityEditorFramePanel(ActivityEditorPanel parent) {
    super(parent);
    initComponents();
    setEnabled(false);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  private void initComponents() { // GEN-BEGIN:initComponents
    javax.swing.JLabel actBgColorLb;
    javax.swing.JLabel actGradientLb;
    javax.swing.JLabel bgColorLb;
    javax.swing.JPanel gameWindowPanel;
    javax.swing.JLabel gradientLb;
    java.awt.GridBagConstraints gridBagConstraints;
    javax.swing.JLabel imgLb;
    javax.swing.JPanel mainWindowPanel;
    javax.swing.JLabel marginLb;
    javax.swing.JPanel previewPanel0;
    javax.swing.JLabel spacer1;
    javax.swing.JLabel xLb;
    javax.swing.JLabel yLb;

    locationGroup = new javax.swing.ButtonGroup();
    previewPanel0 = new javax.swing.JPanel();
    previewPanel = new PreviewPanel();
    mainWindowPanel = new javax.swing.JPanel();
    bgColorLb = new javax.swing.JLabel();
    bgColorBtn = new edu.xtec.jclic.beans.ColorButton();
    bgColorBtn.setOptions(options);
    gradientLb = new javax.swing.JLabel();
    gradientButton = new edu.xtec.jclic.beans.GradientButton();
    gradientButton.setOptions(options);
    imgLb = new javax.swing.JLabel();
    imgButton = new edu.xtec.jclic.beans.ImgButton();
    imgButton.setOptions(options);
    tiledBgImgChk = new javax.swing.JCheckBox();
    gameWindowPanel = new javax.swing.JPanel();
    actBgColorLb = new javax.swing.JLabel();
    actBgColorBtn = new edu.xtec.jclic.beans.ColorButton();
    actBgColorBtn.setOptions(options);
    actGradientLb = new javax.swing.JLabel();
    actGradientButton = new edu.xtec.jclic.beans.GradientButton();
    actGradientButton.setOptions(options);
    transpChk = new javax.swing.JCheckBox();
    borderChk = new javax.swing.JCheckBox();
    marginLb = new javax.swing.JLabel();
    marginInt = new edu.xtec.jclic.beans.SmallIntEditor();
    spacer1 = new javax.swing.JLabel();
    locationLb = new javax.swing.JLabel();
    centeredBtn = new javax.swing.JRadioButton();
    absoluteBtn = new javax.swing.JRadioButton();
    xLb = new javax.swing.JLabel();
    xInt = new edu.xtec.jclic.beans.SmallIntEditor();
    yLb = new javax.swing.JLabel();
    yInt = new edu.xtec.jclic.beans.SmallIntEditor();

    setLayout(new java.awt.GridBagLayout());

    previewPanel0.setLayout(new java.awt.BorderLayout());

    previewPanel0.setBorder(new javax.swing.border.TitledBorder(options.getMsg("edit_act_preview")));
    previewPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
    previewPanel0.add(previewPanel, java.awt.BorderLayout.CENTER);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weighty = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    add(previewPanel0, gridBagConstraints);

    mainWindowPanel.setLayout(new java.awt.GridBagLayout());

    mainWindowPanel.setBorder(new javax.swing.border.TitledBorder(options.getMsg("edit_act_mainWindow")));
    bgColorLb.setLabelFor(bgColorBtn);
    bgColorLb.setText(options.getMsg("edit_act_bgColor"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    mainWindowPanel.add(bgColorLb, gridBagConstraints);

    bgColorBtn.setToolTipText(options.getMsg("edit_act_bgColor_tooltip"));
    bgColorBtn.addPropertyChangeListener(ColorButton.PROP_COLOR, this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    mainWindowPanel.add(bgColorBtn, gridBagConstraints);

    gradientLb.setLabelFor(gradientButton);
    gradientLb.setText(options.getMsg("edit_act_gradient"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    mainWindowPanel.add(gradientLb, gridBagConstraints);

    gradientButton.setToolTipText(options.getMsg("edit_act_gradient_tooltip"));
    gradientButton.addPropertyChangeListener(GradientButton.PROP_GRADIENT, this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    mainWindowPanel.add(gradientButton, gridBagConstraints);

    imgLb.setLabelFor(imgButton);
    imgLb.setText(options.getMsg("edit_act_image"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    mainWindowPanel.add(imgLb, gridBagConstraints);

    imgButton.setToolTipText(options.getMsg("edit_act_image_tooltip"));
    imgButton.addPropertyChangeListener(ImgButton.PROP_IMG_NAME, this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    mainWindowPanel.add(imgButton, gridBagConstraints);

    tiledBgImgChk.setToolTipText(options.getMsg("edit_act_tiledBgImg_tooltip"));
    tiledBgImgChk.setText(options.getMsg("edit_act_tiledBgImg"));
    tiledBgImgChk.addActionListener(this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 1.0;
    mainWindowPanel.add(tiledBgImgChk, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    add(mainWindowPanel, gridBagConstraints);

    gameWindowPanel.setLayout(new java.awt.GridBagLayout());

    gameWindowPanel.setBorder(new javax.swing.border.TitledBorder(options.getMsg("edit_act_gameWindow")));
    actBgColorLb.setLabelFor(actBgColorBtn);
    actBgColorLb.setText(options.getMsg("edit_act_bgColor"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gameWindowPanel.add(actBgColorLb, gridBagConstraints);

    actBgColorBtn.setToolTipText(options.getMsg("edit_act_bgColor_tooltip"));
    actBgColorBtn.addPropertyChangeListener(ColorButton.PROP_COLOR, this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gameWindowPanel.add(actBgColorBtn, gridBagConstraints);

    actGradientLb.setLabelFor(actGradientButton);
    actGradientLb.setText(options.getMsg("edit_act_gradient"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gameWindowPanel.add(actGradientLb, gridBagConstraints);

    actGradientButton.setToolTipText(options.getMsg("edit_act_gradient_tooltip"));
    actGradientButton.addPropertyChangeListener(GradientButton.PROP_GRADIENT, this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gameWindowPanel.add(actGradientButton, gridBagConstraints);

    transpChk.setToolTipText(options.getMsg("edit_act_transparent_tooltip"));
    transpChk.setText(options.getMsg("edit_act_transparent"));
    transpChk.addActionListener(this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.weightx = 1.0;
    gameWindowPanel.add(transpChk, gridBagConstraints);

    borderChk.setToolTipText(options.getMsg("edit_act_border_tooltip"));
    borderChk.setText(options.getMsg("edit_act_border"));
    borderChk.addActionListener(this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gameWindowPanel.add(borderChk, gridBagConstraints);

    marginLb.setLabelFor(marginInt);
    marginLb.setText(options.getMsg("edit_act_margin"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gameWindowPanel.add(marginLb, gridBagConstraints);

    marginInt.setToolTipText(options.getMsg("edit_act_margin_tooltip"));
    marginInt.setMax(999);
    marginInt.addPropertyChangeListener(SmallIntEditor.PROP_VALUE, this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gameWindowPanel.add(marginInt, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gameWindowPanel.add(spacer1, gridBagConstraints);

    locationLb.setText(options.getMsg("edit_act_location"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gameWindowPanel.add(locationLb, gridBagConstraints);

    centeredBtn.setToolTipText(options.getMsg("edit_act_centered_tooltip"));
    centeredBtn.setSelected(true);
    centeredBtn.setText(options.getMsg("edit_act_centered"));
    locationGroup.add(centeredBtn);
    centeredBtn.addActionListener(this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gameWindowPanel.add(centeredBtn, gridBagConstraints);

    absoluteBtn.setToolTipText(options.getMsg("edit_act_absolute_tooltip"));
    absoluteBtn.setText(options.getMsg("edit_act_absolute"));
    locationGroup.add(absoluteBtn);
    absoluteBtn.addActionListener(this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gameWindowPanel.add(absoluteBtn, gridBagConstraints);

    xLb.setLabelFor(xInt);
    xLb.setText(options.getMsg("edit_act_x"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gameWindowPanel.add(xLb, gridBagConstraints);

    xInt.setToolTipText(options.getMsg("edit_act_x_tooltip"));
    xInt.setMax(999);
    xInt.setMin(-999);
    xInt.addPropertyChangeListener(SmallIntEditor.PROP_VALUE, this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gameWindowPanel.add(xInt, gridBagConstraints);

    yLb.setLabelFor(yInt);
    yLb.setText(options.getMsg("edit_act_y"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gameWindowPanel.add(yLb, gridBagConstraints);

    yInt.setToolTipText(options.getMsg("edit_act_y_tooltip"));
    yInt.setMax(999);
    yInt.setMin(-999);
    yInt.addPropertyChangeListener(SmallIntEditor.PROP_VALUE, this);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
    gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gameWindowPanel.add(yInt, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
    gridBagConstraints.weightx = 0.5;
    gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
    add(gameWindowPanel, gridBagConstraints);
  } // GEN-END:initComponents

  @Override
  public void setEnabled(boolean enabled) {
    super.setEnabled(enabled);
    marginInt.setEnabled(enabled);
    bgColorBtn.setEnabled(enabled);
    gradientButton.setEnabled(enabled);
    imgButton.setEnabled(enabled);
    tiledBgImgChk.setEnabled(enabled && imgButton.getObject() != null);
    borderChk.setEnabled(enabled);
    transpChk.setEnabled(enabled);
    actBgColorBtn.setEnabled(enabled);
    actGradientButton.setEnabled(enabled);
    absoluteBtn.setEnabled(enabled);
    centeredBtn.setEnabled(enabled);
    xInt.setEnabled(enabled && absoluteBtn.isSelected());
    yInt.setEnabled(enabled && absoluteBtn.isSelected());
  }

  @Override
  public boolean eventPerformed(EventObject ev) {
    Object cmp = ev == null ? null : ev.getSource();
    if (cmp == null || cmp == imgButton) {
      tiledBgImgChk.setEnabled(imgButton.getObject() != null);
    }
    if (cmp == null || cmp == centeredBtn || cmp == absoluteBtn) {
      xInt.setEnabled(absoluteBtn.isSelected());
      yInt.setEnabled(absoluteBtn.isSelected());
    }
    ((PreviewPanel) previewPanel).reset();
    return ev != null;
  }

  /*
   * public void clear() { mediaBagEditor=null;
   * marginInt.setValue(Activity.DEFAULT_MARGIN);
   * ((ColorButton)bgColorBtn).setColor(Activity.DEFAULT_BG_COLOR);
   * gradientButton.setGradient(null); imgButton.setImgName(null);
   * imgButton.setMediaBagEditor(null); tiledBgImgChk.setSelected(true);
   * borderChk.setSelected(true); transpChk.setSelected(false);
   * ((ColorButton)actBgColorBtn).setColor(Activity.DEFAULT_BG_COLOR);
   * actGradientButton.setGradient(null); centeredBtn.setSelected(true);
   * absoluteBtn.setSelected(false); xInt.setValue(0); yInt.setValue(0);
   * eventPerformed(null); }
   */

  public void fillData() {
    Activity act = getActivity();
    marginInt.setValue(act == null ? Activity.DEFAULT_MARGIN : act.margin);
    mediaBagEditor = act == null ? null : getActivityEditor().getMediaBagEditor();
    ((ColorButton) bgColorBtn).setColor(act == null ? Activity.DEFAULT_BG_COLOR : act.bgColor);
    gradientButton.setGradient(act == null ? null : act.bgGradient);
    imgButton.setMediaBagEditor(mediaBagEditor);
    imgButton.setImgName(act == null ? null : act.bgImageFile);
    tiledBgImgChk.setSelected(act == null ? true : (act.tiledBgImg || act.bgImageFile == null));
    ((PreviewPanel) previewPanel).reset();
    borderChk.setSelected(act == null ? true : act.border);
    transpChk.setSelected(act == null ? false : act.transparentBg);
    ((ColorButton) actBgColorBtn).setColor(act == null ? Activity.DEFAULT_BG_COLOR : act.activityBgColor);
    actGradientButton.setGradient(act == null ? null : act.activityBgGradient);
    absoluteBtn.setSelected(act == null ? false : act.absolutePositioned);
    centeredBtn.setSelected(act == null ? true : !act.absolutePositioned);
    if (act != null && act.absolutePosition != null) {
      xInt.setValue(act.absolutePosition.x);
      yInt.setValue(act.absolutePosition.y);
    } else {
      xInt.setValue(0);
      yInt.setValue(0);
    }
    eventPerformed(null);
  }

  public void saveData() {
    Activity act = getActivity();
    if (act != null) {
      act.margin = marginInt.getValue();
      act.bgColor = ((ColorButton) bgColorBtn).getColor();
      act.bgGradient = gradientButton.getGradient();
      act.bgImageFile = imgButton.getImgName();
      act.tiledBgImg = tiledBgImgChk.isSelected() && act.bgImageFile != null;
      act.border = borderChk.isSelected();
      act.transparentBg = transpChk.isSelected();
      act.activityBgColor = ((ColorButton) actBgColorBtn).getColor();
      act.activityBgGradient = actGradientButton.getGradient();
      act.absolutePositioned = absoluteBtn.isSelected();
      if (act.absolutePositioned) {
        act.absolutePosition = new Point(xInt.getValue(), yInt.getValue());
      } else {
        act.absolutePosition = null;
      }
    }
  }

  /*
   * public boolean dataChanged(){ boolean result=false; Activity
   * act=getActivity(); if(act!=null){ result =
   * 
   * !act.bgColor.equals(((ColorButton)bgColorBtn).getColor()) ||
   * !Utils.compareObjects(act.bgGradient, gradientButton.getGradient()) ||
   * !Utils.compareObjects(act.bgImageFile, imgButton.getImgName()) ||
   * tiledBgImgChk.isSelected()!=act.tiledBgImg ||
   * marginInt.getValue()!=act.margin ||
   * 
   * !act.activityBgColor.equals(((ColorButton)actBgColorBtn).getColor()) ||
   * !Utils.compareObjects(act.activityBgGradient,
   * actGradientButton.getGradient()) || transpChk.isSelected()!=act.transparentBg
   * || borderChk.isSelected()!=act.border ||
   * centeredBtn.isSelected()==act.absolutePositioned || (absoluteBtn.isSelected()
   * && (act.absolutePosition==null || xInt.getValue()!=act.absolutePosition.x ||
   * yInt.getValue()!=act.absolutePosition.y)); } return result; }
   */

  protected javax.swing.Icon getIcon() {
    return edu.xtec.util.ResourceManager.getImageIcon("icons/frame.gif");
  }

  protected String getTitle() {
    return options.getMsg("edit_act_panels_frame");
  }

  protected String getTooltip() {
    return options.getMsg("edit_act_panels_frame_tooltip");
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JRadioButton absoluteBtn;
  private edu.xtec.jclic.beans.ColorButton actBgColorBtn;
  private edu.xtec.jclic.beans.GradientButton actGradientButton;
  private edu.xtec.jclic.beans.ColorButton bgColorBtn;
  private javax.swing.JCheckBox borderChk;
  private javax.swing.JRadioButton centeredBtn;
  private edu.xtec.jclic.beans.GradientButton gradientButton;
  private edu.xtec.jclic.beans.ImgButton imgButton;
  private javax.swing.ButtonGroup locationGroup;
  private javax.swing.JLabel locationLb;
  private edu.xtec.jclic.beans.SmallIntEditor marginInt;
  private javax.swing.JPanel previewPanel;
  private javax.swing.JCheckBox tiledBgImgChk;
  private javax.swing.JCheckBox transpChk;
  private edu.xtec.jclic.beans.SmallIntEditor xInt;
  private edu.xtec.jclic.beans.SmallIntEditor yInt;
  // End of variables declaration//GEN-END:variables

  class PreviewPanel extends JPanel {
    InnerPreviewPane innerPane;
    Image bgImage;
    boolean tiledBgImg;
    Gradient bgGradient, actBgGradient;
    Point bgImageOrigin = new Point();
    double scale = 1.0;

    PreviewPanel() {
      super();
      setLayout(null);
      innerPane = new InnerPreviewPane();
      add(innerPane);
    }

    class InnerPreviewPane extends JPanel {
      InnerPreviewPane() {
        super();
        setLayout(null);
      }

      public void fitTo(Rectangle proposedRect, Rectangle maxRect) {
        Activity act = getActivity();
        Dimension d = new Dimension(act == null ? Activity.DEFAULT_WIDTH : act.getWindowSize().width,
            act == null ? Activity.DEFAULT_HEIGHT : act.getWindowSize().height);
        int w = Math.max(Activity.MINIMUM_WIDTH, Math.min(proposedRect.width, (int) (scale * d.width)));
        int h = Math.max(Activity.MINIMUM_HEIGHT, Math.min(proposedRect.height, (int) (scale * d.height)));
        boolean b = centeredBtn.isSelected();
        int xp = (b ? 0 : bgImageOrigin.x)
            + Math.max(0, b ? proposedRect.x + (proposedRect.width - w) / 2 : (int) (scale * xInt.getValue()));
        int yp = (b ? 0 : bgImageOrigin.y)
            + Math.max(0, b ? proposedRect.y + (proposedRect.height - h) / 2 : (int) (scale * yInt.getValue()));

        if (xp > maxRect.width - Activity.MINIMUM_WIDTH)
          xp = maxRect.width - Activity.MINIMUM_WIDTH;
        if (xp + w > maxRect.width)
          w = maxRect.width - xp;

        if (yp > maxRect.height - Activity.MINIMUM_HEIGHT)
          yp = maxRect.height - Activity.MINIMUM_HEIGHT;
        if (yp + h > maxRect.height)
          h = maxRect.height - yp;

        setBounds(xp, yp, w, h);
      }

      @Override
      public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle rBounds = new Rectangle(0, 0, getWidth(), getHeight());

        if (!isOpaque() || actBgGradient == null || actBgGradient.hasTransparency())
          super.paintComponent(g);

        RenderingHints rh = g2.getRenderingHints();

        if (isOpaque() && actBgGradient != null) {
          g2.setRenderingHints(edu.xtec.jclic.Constants.DEFAULT_RENDERING_HINTS);
          actBgGradient.paint(g2, rBounds);
        }

        if (getActivityEditor() != null)
          getActivityEditor().drawPreview(g2, rBounds, marginInt.getValue());

        g2.setRenderingHints(rh);
      }
    }

    public void reset() {
      bgImage = null;
      bgGradient = null;
      actBgGradient = null;
      bgImage = null;
      tiledBgImg = true;
      if (mediaBagEditor != null) {
        String bgImageFile = imgButton.getImgName();
        if (bgImageFile != null) {
          try {
            bgImage = mediaBagEditor.getMediaBag().getImageElement(bgImageFile).getImage();
          } catch (Exception ex) {
            options.getMessages().showErrorWarning(this, "ERROR", ex);
          }
        }
        tiledBgImg = tiledBgImgChk.isSelected();
      }
      innerPane.setBorder(borderChk.isSelected() ? BorderFactory.createBevelBorder(BevelBorder.RAISED)
          : BorderFactory.createEmptyBorder());

      innerPane.setOpaque(!transpChk.isSelected());
      innerPane.setBackground(actBgColorBtn.getColor());
      actBgGradient = actGradientButton.getGradient();

      bgGradient = gradientButton.getGradient();
      setBackground(bgColorBtn.getColor());
      revalidate();
      repaint();
    }

    @Override
    public void doLayout() {
      scale = 1.0;
      bgImageOrigin.x = 0;
      bgImageOrigin.y = 0;
      Rectangle bounds = getBounds();
      int margin = marginInt.getValue();
      Rectangle proposedRect = new Rectangle(margin, margin, bounds.width - 2 * margin, bounds.height - 2 * margin);
      if (bgImage != null && !tiledBgImg) {
        int w = bgImage.getWidth(this);
        int h = bgImage.getHeight(this);
        if (w > 0 && h > 0 && (w > getWidth() || h > getHeight())) {
          scale = Math.min((double) getWidth() / w, (double) getHeight() / h);
          w = (int) (scale * w);
          h = (int) (scale * h);
        } else
          scale = 1.0;
        bgImageOrigin.x = (getWidth() - w) / 2;
        bgImageOrigin.y = (getHeight() - h) / 2;
        if (absoluteBtn.isSelected()) {
          proposedRect.x = bgImageOrigin.x;
          proposedRect.y = bgImageOrigin.y;
          proposedRect.width -= (bgImageOrigin.x - margin);
          proposedRect.height -= (bgImageOrigin.y - margin);
          proposedRect.width = Math.min(proposedRect.width, bounds.width);
          proposedRect.height = Math.min(proposedRect.height, bounds.height);
        }
      }
      innerPane.fitTo(proposedRect, bounds);
    }

    @Override
    public void paintComponent(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;

      Rectangle rBounds = new Rectangle(0, 0, getWidth(), getHeight());

      if (bgGradient == null || bgGradient.hasTransparency())
        super.paintComponent(g);

      if (bgGradient != null || bgImage != null) {
        RenderingHints rh = g2.getRenderingHints();
        g2.setRenderingHints(edu.xtec.jclic.Constants.DEFAULT_RENDERING_HINTS);

        if (bgGradient != null)
          bgGradient.paint(g2, rBounds);

        if (bgImage != null) {
          Rectangle r = new Rectangle(0, 0, bgImage.getWidth(this), bgImage.getHeight(this));
          Rectangle gBounds = g2.getClipBounds();

          if (!tiledBgImg) {
            r.setLocation(bgImageOrigin);
            if (r.intersects(gBounds)) {
              if (scale == 1.0)
                g2.drawImage(bgImage, bgImageOrigin.x, bgImageOrigin.y, this);
              else {
                int w0 = bgImage.getWidth(this);
                int h0 = bgImage.getHeight(this);
                int w = (int) (scale * w0);
                int h = (int) (scale * h0);
                g2.drawImage(bgImage, bgImageOrigin.x, bgImageOrigin.y, bgImageOrigin.x + w, bgImageOrigin.y + h, 0, 0,
                    w0, h0, this);
              }
            }
          } else {
            Utils.tileImage(g2, bgImage, rBounds, r, this);
          }
        }
        g2.setRenderingHints(rh);
      }
    }
  }
}
