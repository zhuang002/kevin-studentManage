/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementfront;

import java.text.SimpleDateFormat;
import java.util.Date;
import studentmanagementbackend.ExamReport;

/**
 *
 * @author zhuan
 */
public class ExamReportJPanel extends ContentJPanel {

    /**
     * Creates new form ExamReportJPanel
     */
    public ExamReportJPanel() {
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
        jLabelStatus = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelExamId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelStudentId = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldScore = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jButtonSave = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();

        jLabel1.setText("Status:");

        jLabelStatus.setText("NA");

        jLabel2.setText("ExamId:");

        jLabelExamId.setText("NA");

        jLabel3.setText("StudentId: ");

        jLabelStudentId.setText("NA");

        jLabel4.setText("Score: ");

        jTextFieldScore.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldScore.setText("0");
        jTextFieldScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldScoreActionPerformed(evt);
            }
        });

        jLabel5.setText("Date:");

        jLabelDate.setText("01/01/1970");

        jButtonSave.setText("Save");
        jButtonSave.setToolTipText("");

        jButtonClear.setText("Clear");
        jButtonClear.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jButtonSave))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonClear)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelExamId, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                        .addComponent(jLabelStudentId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextFieldScore, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabelStatus, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelExamId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelStudentId))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonClear))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldScoreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelExamId;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelStudentId;
    private javax.swing.JTextField jTextFieldScore;
    // End of variables declaration//GEN-END:variables

    void setData(ExamReport report) {
        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
        this.jLabelDate.setText(format.format(new Date()));
        this.jLabelExamId.setText(report.getExamId());
        this.jLabelStudentId.setText(report.getStudentId());
        if (report.getId()==null)
            this.jLabelStatus.setText("New Exam Paper");
        else 
            this.jLabelStatus.setText("Update Exam Paper");
        this.jTextFieldScore.setText(""+report.getScore());
    }
    
    
    
    @Override
    public void clearAll() {
        this.jLabelDate.setText("01/01/1970");
        this.jLabelExamId.setText("NA");
        this.jLabelStatus.setText("NA");
        this.jLabelStudentId.setText("NA");
        this.jTextFieldScore.setText("0");
    }
}