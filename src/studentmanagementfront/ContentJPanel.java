/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementfront;

import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.text.JTextComponent;

/**
 *
 * @author zhuan
 */
abstract public class ContentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ContentJPanel
     */
    public ContentJPanel() {
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    protected ContentJPanel parentPanel;
    
    public void setState(PanelState state) {
        this.enableAllControls(false);
        if (state==PanelState.InNew || state==PanelState.InUpdate) {
            this.enableAllInputControls(true);
        } else if (state==PanelState.InView || state==PanelState.Initial) {
            this.enableAllInputControls(false);
        } 
        if (state==PanelState.InNew || state==PanelState.Initial) {
            clearAll();
        }
    }
    
    
    
    public void enableAllControls(boolean enable) {
        for (Component comp : this.getComponents()) {
            if (!(comp instanceof JLabel)) {
                comp.setEnabled(enable);
            }            
        }
    }
    
    public void enableAllInputControls(boolean enable) {
        for (Component comp: this.getComponents()) {
            if (comp instanceof JTextComponent) {
                ((JTextComponent) comp).setEnabled(enable);
            } else if (comp instanceof JComboBox) {
                ((JComboBox) comp).setEnabled(enable);
            }
        }
    }
    
    public void clearAll() {
        for (Component comp : this.getComponents()) {
            if (comp instanceof JTextComponent) {
                ((JTextComponent) comp).setText("");
            } else if (comp instanceof JComboBox) {
                if (((JComboBox)comp).getModel().getSize()>0)
                    ((JComboBox) comp).setSelectedIndex(0);
                else 
                    ((JComboBox) comp).setSelectedIndex(-1);
            }
        }
    }
    
    public  void setParentPanel(ContentJPanel parent) {
        this.parentPanel=parent;
    }
}
