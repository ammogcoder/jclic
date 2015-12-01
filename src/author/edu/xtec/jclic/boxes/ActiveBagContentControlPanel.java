/*
 * File    : ActiveBagContentControlPanel.java
 * Created : 01-apr-2003 10:38
 * By      : fbusquets
 *
 * JClic - Authoring and playing system for educational activities
 *
 * Copyright (C) 2000 - 2005 Francesc Busquets & Departament
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
import edu.xtec.jclic.beans.*;
import edu.xtec.jclic.shapers.Shaper;
import edu.xtec.util.Options;
import edu.xtec.util.TripleString;
import java.awt.Dimension;
import java.util.EventObject;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Francesc Busquets (fbusquets@xtec.cat)
 * @version 13.09.09
 */
public class ActiveBagContentControlPanel extends edu.xtec.util.CtrlPanel {
    
    ActiveBagContentEditor parent;
    ActiveBagContent abc, altAbc;    
    ActiveBagContentControlPanel syncPanel;
    
    boolean altNull;
    Options options;
    int index;
    int altIndex;
    int visualIndex;
    boolean simpleMode;
    
    /** Creates new form ActiveBagContentControlPanel */
    public ActiveBagContentControlPanel(ActiveBagContentEditor parent, int index, int altIndex, int visualIndex, boolean simpleMode){
        setInitializing(true);
        this.simpleMode=simpleMode;
        this.parent=parent;
        options=parent.getOptions();
        this.index=index;
        this.altIndex=altIndex;
        this.visualIndex=visualIndex;
        altNull=altIndex>=0;
        initComponents();
        if(altIndex<0 || simpleMode){
            altChk.setEnabled(false);
            altChk.setVisible(false);
            toggleAlt.setEnabled(false);
            toggleAlt.setVisible(false);
        }
        if(simpleMode){
            shaperLb.setVisible(false);
            shaperCombo.setVisible(false);
            shaperEditBtn.setVisible(false);
            scrambleChk.setVisible(false);
            nRowsLb.setVisible(false);
            nRowsEdit.setVisible(false);
            nColsLb.setVisible(false);
            nColsEdit.setVisible(false);
            imgLb.setVisible(false);
            imgButton.setVisible(false);
        }
        setInitializing(false);
    }
        
    protected void setSyncpanel(ActiveBagContentControlPanel syncPanel){
        this.syncPanel=syncPanel;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        javax.swing.JLabel spacer3 = new javax.swing.JLabel();
        shaperLb = new javax.swing.JLabel();
        shaperCombo = new javax.swing.JComboBox(edu.xtec.jclic.shapers.Shaper.getSystemShaperList(options).toArray());
        shaperEditBtn = new javax.swing.JButton();
        scrambleChk = new javax.swing.JCheckBox();
        altChk = new javax.swing.JCheckBox();
        toggleAlt = new javax.swing.JToggleButton();
        javax.swing.JLabel spacer2 = new javax.swing.JLabel();
        nRowsLb = new javax.swing.JLabel();
        nRowsEdit = new edu.xtec.jclic.beans.SmallIntEditor();
        nColsLb = new javax.swing.JLabel();
        nColsEdit = new edu.xtec.jclic.beans.SmallIntEditor();
        imgLb = new javax.swing.JLabel();
        imgButton = new edu.xtec.jclic.beans.ImgButton();
        imgButton.setOptions(options);
        javax.swing.JLabel widthLb = new javax.swing.JLabel();
        widthEdit = new edu.xtec.jclic.beans.SmallIntEditor();
        javax.swing.JLabel heightLb = new javax.swing.JLabel();
        heightEdit = new edu.xtec.jclic.beans.SmallIntEditor();
        javax.swing.JLabel styleLb = new javax.swing.JLabel();
        boxBaseButton = new edu.xtec.jclic.beans.BoxBaseButton();
        boxBaseButton.setOptions(options);
        borderChk = new javax.swing.JCheckBox();

        setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weighty = 1.0;
        add(spacer3, gridBagConstraints);

        shaperLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/xtec/resources/icons/select_shaper.gif"))); // NOI18N
        shaperLb.setLabelFor(shaperCombo);
        shaperLb.setText(":");
        shaperLb.setIconTextGap(0);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(shaperLb, gridBagConstraints);

        shaperCombo.setToolTipText(options.getMsg("edit_act_shaper_tooltip"));
        shaperCombo.addActionListener(this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(shaperCombo, gridBagConstraints);

        shaperEditBtn.setText("...");
        shaperEditBtn.setMargin(new java.awt.Insets(0, 4, 0, 4));
        shaperEditBtn.setEnabled(false);
        shaperEditBtn.addActionListener(this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(shaperEditBtn, gridBagConstraints);

        scrambleChk.setText(options.getMsg("edit_act_scramble"));
        scrambleChk.addActionListener(this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(scrambleChk, gridBagConstraints);

        altChk.setToolTipText(options.getMsg("edit_act_alt_tooltip"));
        altChk.setText(options.getMsg("edit_act_alt"));
        altChk.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        altChk.addActionListener(this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(altChk, gridBagConstraints);

        toggleAlt.setToolTipText(options.getMsg("edit_act_alt_toggle_tooltip"));
        toggleAlt.setText(options.getMsg("edit_act_alt_toggle"));
        toggleAlt.setMargin(new java.awt.Insets(0, 4, 0, 4));
        toggleAlt.setEnabled(false);
        toggleAlt.addActionListener(this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(toggleAlt, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(spacer2, gridBagConstraints);

        nRowsLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/xtec/resources/icons/adjust_rows.gif"))); // NOI18N
        nRowsLb.setLabelFor(nRowsEdit);
        nRowsLb.setText(":");
        nRowsLb.setIconTextGap(0);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(nRowsLb, gridBagConstraints);

        nRowsEdit.setToolTipText(options.getMsg("edit_act_num_rows_tooltip"));
        nRowsEdit.setMax(30);
        nRowsEdit.setMin(1);
        nRowsEdit.addPropertyChangeListener(SmallIntEditor.PROP_VALUE, this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(nRowsEdit, gridBagConstraints);

        nColsLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/xtec/resources/icons/adjust_cols.gif"))); // NOI18N
        nColsLb.setLabelFor(nColsEdit);
        nColsLb.setText(":");
        nColsLb.setIconTextGap(0);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(nColsLb, gridBagConstraints);

        nColsEdit.setToolTipText(options.getMsg("edit_act_num_cols_tooltip"));
        nColsEdit.setMax(30);
        nColsEdit.setMin(1);
        nColsEdit.addPropertyChangeListener(SmallIntEditor.PROP_VALUE, this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(nColsEdit, gridBagConstraints);

        imgLb.setLabelFor(imgButton);
        imgLb.setText(options.getMsg("edit_act_image"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(imgLb, gridBagConstraints);

        imgButton.setToolTipText(options.getMsg("edit_act_image_tooltip"));
        imgButton.addPropertyChangeListener(ImgButton.PROP_IMG_NAME, this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(imgButton, gridBagConstraints);

        widthLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/xtec/resources/icons/adjust_width.gif"))); // NOI18N
        widthLb.setLabelFor(widthEdit);
        widthLb.setText(":");
        widthLb.setIconTextGap(0);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(widthLb, gridBagConstraints);

        widthEdit.setToolTipText(options.getMsg("edit_act_cell_width_tooltip"));
        widthEdit.setMax(999);
        widthEdit.setMin(edu.xtec.jclic.Constants.MIN_CELL_SIZE);
        widthEdit.addPropertyChangeListener(SmallIntEditor.PROP_VALUE, this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(widthEdit, gridBagConstraints);

        heightLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/xtec/resources/icons/adjust_height.gif"))); // NOI18N
        heightLb.setLabelFor(heightEdit);
        heightLb.setText(":");
        heightLb.setIconTextGap(0);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(heightLb, gridBagConstraints);

        heightEdit.setToolTipText(options.getMsg("edit_act_cell_height_tooltip"));
        heightEdit.setMax(999);
        heightEdit.setMin(edu.xtec.jclic.Constants.MIN_CELL_SIZE);
        heightEdit.addPropertyChangeListener(SmallIntEditor.PROP_VALUE, this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(heightEdit, gridBagConstraints);

        styleLb.setLabelFor(boxBaseButton);
        styleLb.setText(options.getMsg("edit_act_style"));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(styleLb, gridBagConstraints);

        boxBaseButton.setToolTipText(options.getMsg("edit_style_tooltip"));
        boxBaseButton.addPropertyChangeListener(BoxBaseButton.PROP_BOX_BASE, this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(boxBaseButton, gridBagConstraints);

        borderChk.setText(options.getMsg("edit_act_border"));
        borderChk.addActionListener(this);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        add(borderChk, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    public boolean eventPerformed(EventObject ev){
        boolean result=true;
        if(abc!=null && ev!=null && ev.getSource()!=null){
            Object src=ev.getSource();
            if(src==altChk)
                altChkActionPerformed();
            else if(src==toggleAlt){
                toggleAltActionPerformed();
                result=false;
            }
            else if(src==shaperCombo){
                shaperComboActionPerformed();
            }
            else if(src==shaperEditBtn){
                result=shaperEditBtnActionPerformed();
            }
            else if(src==boxBaseButton){
                boxBaseButtonActionPerformed();
            }
            else if(src==imgButton){
                imgButtonActionPerformed();
            }
            else if(src==borderChk){
                borderChkActionPerformed();
            }
            
            if(src==widthEdit || src==heightEdit){
                parent.abcpp.doResize(visualIndex, widthEdit.getValue(), heightEdit.getValue(), true);
            }
            else{
                if(src==nColsEdit || src==nRowsEdit || src==shaperCombo || src==shaperEditBtn){
                    shaperChange();
                    sync();
                }
                
                parent.abcpp.setActiveBagContent(visualIndex, abc, altNull ? null : altAbc, null);
                ActiveBoxBag abg=(ActiveBoxBag)parent.abcpp.getAbstractBox(visualIndex);
                if(abg!=null){
                    boxBaseButton.setPreview(abg);                    
                    abg.setAlternative(toggleAlt.isSelected());
                }
            }
        }
        return result;
    }
    
    protected void resized(){
        if(abc!=null){
            widthEdit.setValue((int)abc.w);
            heightEdit.setValue((int)abc.h);
        }
    }        
    
    public void fillData(Activity act){
        abc = (act!=null && act.abc!=null && act.abc.length>index ? act.abc[index] : null);
        altAbc=(act!=null && act.abc!=null && altIndex>=0 && altIndex<act.abc.length) ? act.abc[altIndex] : null;
        setActiveBagContent(abc, altAbc);
        scrambleChk.setSelected(act!=null && (act.shuffleAlways() || (act.scramble!=null && act.scramble.length>index ? act.scramble[index] : false)));
        scrambleChk.setEnabled(act!=null && !act.shuffleAlways());
    }
    
    public void setActiveBagContent(ActiveBagContent abc, ActiveBagContent altAbc){
        this.abc=abc;
        this.altAbc=altAbc;
        altNull=(altAbc==null);
        // ADDED
        // Modified to solve bug 38: Data lost when editing crosswords
        // ActiveBagContent.checkCells sets the number of cells to the values specified by the
        // Shaper. This can cause lost of data in Crossword activities, because they sould use
        // ActiveBagContent objects with more cells than the specified by the Shaper.
        if(abc!=null && !simpleMode)
            abc.checkCells();
        if(altAbc!=null && !simpleMode)
            altAbc.checkCells();
        // -----
        altChk.setSelected(!altNull);
        altChk.setEnabled(abc!=null);
        toggleAlt.setSelected(false);
        toggleAlt.setEnabled(!altNull);
        imgButton.setMediaBagEditor(parent.mediaBagEditor);
        imgButton.setImgName(abc!=null ? abc.imgName : null);
        imgButton.setEnabled(abc!=null);
        boxBaseButton.setBoxBase(abc!=null ? abc.bb : null);
        parent.abcpp.setActiveBagContent(visualIndex, abc, altAbc, null);
        boxBaseButton.setPreview(parent.abcpp.getAbstractBox(visualIndex));
        boxBaseButton.setEnabled(abc!=null);
        Shaper sh=(abc!=null ? abc.getShaper() : null);
        ComboBoxModel model=shaperCombo.getModel();
        int modelSize=model.getSize();                
        int i=-1;                
        if(sh!=null){
            String s=sh.getClassName();
            for(i=0; i<modelSize; i++){
                TripleString ts=(TripleString)model.getElementAt(i);
                if(s.equals(ts.getClassName()))
                    break;
            }
        }
        shaperCombo.setSelectedIndex(i<modelSize ? i : -1);
        shaperCombo.setEnabled(abc!=null);
        shaperEditBtn.setEnabled(sh!=null && sh.getEditorPanelClassName()!=null);
        nColsEdit.setValue(sh!=null ? sh.getNumColumns() : 1);
        nColsEdit.setEnabled(abc!=null);
        nRowsEdit.setValue(sh!=null ? sh.getNumRows() : 1);
        nRowsEdit.setEnabled(abc!=null);
        widthEdit.setValue(abc!=null ? (int)abc.w : 30);
        widthEdit.setEnabled(abc!=null);
        heightEdit.setValue(abc!=null ? (int)abc.h : 20);
        heightEdit.setEnabled(abc!=null);
        borderChk.setSelected(abc!=null ? abc.border : false);
        borderChk.setEnabled(abc!=null);
    }
        
    public void saveData(Activity act){
        if(act!=null && act.abc!=null && act.abc.length>index){
            act.abc[index]=abc;
            act.scramble[index]=scrambleChk.isSelected();
            if(altIndex>=0 && altIndex<act.abc.length)
                act.abc[altIndex] = altNull ? null : altAbc;
        }
    }
    
    // Control actions
    
    private void altChkActionPerformed(){
        if(toggleAlt.isSelected()){
            toggleAlt.setSelected(false);
            toggleAltActionPerformed();
        }
        altNull=!altChk.isSelected();
        if(abc!=null && !altNull && altAbc==null){
            //altAbc=new ActiveBagContent(abc.ncw, abc.nch);
            altAbc=ActiveBagContent.initNew(abc.ncw, abc.nch, 'A');            
            if(parent.abcpp!=null)
                parent.abcpp.setActiveBagContent(visualIndex, abc, altAbc, null);
        }
        toggleAlt.setEnabled(!altNull);
    }
    
    private void toggleAltActionPerformed(){
        if(abc!=null && !altNull && altAbc!=null &&
        parent.abcpp!=null && parent.abcpp.getAbstractBox(visualIndex)!=null){
            boolean alt=toggleAlt.isSelected();
            ((ActiveBoxGrid)parent.abcpp.getAbstractBox(visualIndex)).setAlternative(alt);
            imgButton.setImgName(alt ? altAbc.imgName : abc.imgName);
        }
    }
    
    private void shaperComboActionPerformed(){
        TripleString ts=(TripleString)shaperCombo.getSelectedItem();
    }
    
    private boolean shaperEditBtnActionPerformed(){
        if(abc==null)
            return false;
        AbstractBox bx=parent.abcpp.getAbstractBox(visualIndex);
        Dimension d=new Dimension((int)bx.getWidth(), (int)bx.getHeight());
        Dimension dBak=(Dimension)d.clone();
        Shaper sh=abc.shaper.edit(this, options, d, abc.img, bx.getBoxBaseResolve());
        if(sh==null)
            return false;
        abc.setShaper(sh);
        abc.ncw=Math.max(1, sh.getNumColumns());
        abc.nch=Math.max(1, sh.getNumRows());
        nColsEdit.setValue(abc.ncw);
        nRowsEdit.setValue(abc.nch);
        abc.checkCells();
        //abc.removeUnusedCells();
        
        if(!dBak.equals(d)){
            abc.w=d.width/abc.ncw;
            abc.h=d.height/abc.nch;
        }
        return true;
    }
    
    private void boxBaseButtonActionPerformed(){
        BoxBase bb=boxBaseButton.getBoxBase();
        if(abc!=null && bb!=null){
            abc.setBoxBase(bb);
            if(altAbc!=null && simpleMode){
                altAbc.setBoxBase(bb);
            }
        }
    }
    
    private void imgButtonActionPerformed(){
        if(abc!=null){
            ActiveBagContent abcDest=toggleAlt.isSelected() ? altAbc : abc;
            if(abcDest.imgName!=null)
                abcDest.img=null;
            abcDest.imgName=imgButton.getImgName();
            if(parent.mediaBagEditor!=null){
                try{
                    if(abcDest.imgName!=null)
                        abcDest.setImgContent(parent.mediaBagEditor.getMediaBag().getImageElement(abcDest.imgName), true);
                    else
                        abcDest.setImgContent(null, false);
                } catch(Exception ex){
                    options.getMessages().showErrorWarning(this, "ERROR", ex);
                }
            }
        }
    }
    
    protected void sync(){
        if(abc!=null && syncPanel!=null && syncPanel.abc!=null){
            syncPanel.nColsEdit.setValue(nColsEdit.getValue());
            syncPanel.nRowsEdit.setValue(nRowsEdit.getValue());
            syncPanel.shaperCombo.setSelectedItem(shaperCombo.getSelectedItem());
            syncPanel.shaperChange();
        }
    }
    
    private void shaperChange(){
        if(abc==null)
            return;
        try{
            // AFEGIT:
            abc.ncw=nColsEdit.getValue();
            abc.nch=nRowsEdit.getValue();
            //
            TripleString ts=(TripleString)shaperCombo.getSelectedItem();
            String newShaperClass=ts.getClassName();
            if(!abc.getShaper().getClassName().equals(newShaperClass)){
                abc.setShaper(Shaper.createShaper(newShaperClass, abc.ncw, abc.nch));
                //abc.removeUnusedCells();
                abc.checkCells();
            }
            else{
                // adjust resizing of columns
                //abc.getShaper().reset(nColsEdit.getValue(), nRowsEdit.getValue());
                abc.getShaper().reset(abc.ncw, abc.nch);
                //abc.removeUnusedCells();
                abc.checkCells();
            }
            if(abc.imgName!=null)
                abc.setImgContent(parent.mediaBagEditor.getMediaBag().getImageElement(abc.imgName), true);
            if(altAbc!=null){
                altAbc.setShaper(abc.getShaper());
                //altAbc.removeUnusedCells();
                altAbc.checkCells();
                if(altAbc.imgName!=null)
                    altAbc.setImgContent(parent.mediaBagEditor.getMediaBag().getImageElement(altAbc.imgName), true);
            }
            shaperEditBtn.setEnabled(abc.getShaper().getEditorPanelClassName()!=null);
        }
        catch(Exception ex){
            options.getMessages().showErrorWarning(this, "edit_act_shaper_err", ex);
        }
    }
    
    private void borderChkActionPerformed(){
        if(abc!=null)    
            abc.border=borderChk.isSelected();
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox altChk;
    private javax.swing.JCheckBox borderChk;
    private edu.xtec.jclic.beans.BoxBaseButton boxBaseButton;
    private edu.xtec.jclic.beans.SmallIntEditor heightEdit;
    private edu.xtec.jclic.beans.ImgButton imgButton;
    private javax.swing.JLabel imgLb;
    private edu.xtec.jclic.beans.SmallIntEditor nColsEdit;
    private javax.swing.JLabel nColsLb;
    private edu.xtec.jclic.beans.SmallIntEditor nRowsEdit;
    private javax.swing.JLabel nRowsLb;
    private javax.swing.JCheckBox scrambleChk;
    private javax.swing.JComboBox shaperCombo;
    private javax.swing.JButton shaperEditBtn;
    private javax.swing.JLabel shaperLb;
    private javax.swing.JToggleButton toggleAlt;
    private edu.xtec.jclic.beans.SmallIntEditor widthEdit;
    // End of variables declaration//GEN-END:variables
    
}