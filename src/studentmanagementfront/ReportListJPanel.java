/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementfront;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import studentmanagementbackend.Database;
import studentmanagementbackend.Student;

/**
 * The panel to select student and show the semeter report.
 * @author Kevin
 */
public class ReportListJPanel extends ContentJPanel {

    /**
     * Creates new form ReportListJPanel
     */
    public ReportListJPanel() {
        initComponents();
        this.reportJPanel1.setParentPanel((ContentJPanel)this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListStudents = new javax.swing.JList<>();
        reportJPanel1 = new studentmanagementfront.ReportJPanel();

        jSplitPane1.setDividerLocation(200);

        jListStudents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListStudentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListStudents);

        jSplitPane1.setLeftComponent(jScrollPane1);
        jSplitPane1.setRightComponent(reportJPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jListStudentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListStudentsMouseClicked
        // TODO add your handling code here:
        onSelected();
    }//GEN-LAST:event_jListStudentsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> jListStudents;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private studentmanagementfront.ReportJPanel reportJPanel1;
    // End of variables declaration//GEN-END:variables

    private void onSelected() {
        int idx=this.jListStudents.getSelectedIndex();
        if (idx<0) {
            this.reportJPanel1.clearAll();
            return;
        }
        Student student=(Student)((DefaultListModel)this.jListStudents.getModel()).get(idx);
        this.reportJPanel1.setData(student);
        this.reportJPanel1.setState(PanelState.InUpdate);
    }
    
    /**
     * Load all students from database to the jList.
     */
    public void loadStudents()  {
        ArrayList<Student> students=Database.getAllStudents();
        Collections.sort(students);
        DefaultListModel listModel=new DefaultListModel();
        listModel.addAll(students);
        this.jListStudents.setModel(listModel);
    }
}
