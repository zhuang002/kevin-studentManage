/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementfront;

import studentmanagementbackend.Report;
import studentmanagementbackend.Student;

/**
 *
 * @author Kevin
 */
public class ReportJPanel extends ContentJPanel {

    /**
     * Creates new form ReportJPanel
     */
    public ReportJPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneReport = new javax.swing.JTextPane();
        jLabelStudent = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxGrade = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxSemester = new javax.swing.JComboBox<>();

        jLabel1.setText("Student: ");

        jLabel2.setText("Report:");

        jTextPaneReport.setEditable(false);
        jScrollPane1.setViewportView(jTextPaneReport);

        jLabel3.setText("Grade");

        jComboBoxGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5", "Grade 6", "Grade 7", "Grade 8", "Grade 9", "Grade 10", "Grade 11", "Grade 12" }));
        jComboBoxGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGradeActionPerformed(evt);
            }
        });

        jLabel4.setText("Semester");

        jComboBoxSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First Semester", "Second Semester" }));
        jComboBoxSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSemesterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelStudent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGradeActionPerformed
        // TODO add your handling code here:
        onGradeSemesterSelected();
    }//GEN-LAST:event_jComboBoxGradeActionPerformed

    private void jComboBoxSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSemesterActionPerformed
        // TODO add your handling code here:
        onGradeSemesterSelected();
    }//GEN-LAST:event_jComboBoxSemesterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxGrade;
    private javax.swing.JComboBox<String> jComboBoxSemester;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelStudent;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPaneReport;
    // End of variables declaration//GEN-END:variables
    private Student student=null;
    
    void setData(Student student) {
        this.setState(PanelState.Initial);
        this.student=student;
        this.clearAll();
        this.jLabelStudent.setText(student.toString());
    }
    
    /**
     *Set the state to the child jPanel.
     * @param state the state that to be set.
     */
    @Override
    public void setState(PanelState state) {
        if(state==PanelState.Initial || this.student==null) {
            this.jLabelStudent.setText("N/A");
            this.jComboBoxGrade.setEnabled(false);
            this.jComboBoxSemester.setEnabled(false);
        } else {
            this.jLabelStudent.setText(this.student.toString());
            this.jComboBoxGrade.setEnabled(true);
            this.jComboBoxSemester.setEnabled(true);
        }
    }
    
    /**
     * Clear all the data in input controls to be init-value.
     */
    @Override
    public void clearAll() {
        this.jLabelStudent.setText("N/A");
        this.jComboBoxGrade.setSelectedIndex(0);
        this.jComboBoxSemester.setSelectedIndex(0);
    }

    /**
     * Process when the grade and semeter comboboxes are selected.
     */
    private void onGradeSemesterSelected() {
        if (this.jComboBoxGrade.getSelectedIndex()>=0 && this.jComboBoxSemester.getSelectedIndex()>=0) {
            Report report=new Report();
            report.setStudent(this.student);
            report.setGrade(this.jComboBoxGrade.getSelectedIndex()+1);
            report.setSemester(this.jComboBoxSemester.getSelectedIndex()+1);
            this.jTextPaneReport.setText(report.toString());
        }
    }
}
