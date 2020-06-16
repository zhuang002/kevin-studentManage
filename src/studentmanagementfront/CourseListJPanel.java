/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementfront;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import studentmanagementbackend.Course;
import studentmanagementbackend.Database;

/**
 *
 * @author zhuan
 */
public class CourseListJPanel extends ContentJPanel {

    /**
     * Creates new form CouseListJPanel
     */
    public CourseListJPanel() {
        initComponents();
        loadCourses();
        this.courseJPanel1.setParentPanel(this);
        this.courseJPanel1.clearAll();
        this.courseJPanel1.setState(PanelState.Initial);
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
        jScrollPaneCourseList = new javax.swing.JScrollPane();
        jListCourse = new javax.swing.JList<>();
        courseJPanel1 = new studentmanagementfront.CourseJPanel();

        jListCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListCourseMouseClicked(evt);
            }
        });
        jScrollPaneCourseList.setViewportView(jListCourse);

        jSplitPane1.setLeftComponent(jScrollPaneCourseList);
        jSplitPane1.setRightComponent(courseJPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jListCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListCourseMouseClicked
        // TODO add your handling code here:
        onSelected();
    }//GEN-LAST:event_jListCourseMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private studentmanagementfront.CourseJPanel courseJPanel1;
    private javax.swing.JList<String> jListCourse;
    private javax.swing.JScrollPane jScrollPaneCourseList;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables

    public void actionCompleted(Action action, Course course) {
        if (action==Action.New) {
            loadCourses();
            int idx=((DefaultListModel)this.jListCourse.getModel()).indexOf(course);
            this.jListCourse.setSelectedIndex(idx);
            onSelected();
        } else if (action==Action.Cancel) {
            if (this.jListCourse.getSelectedIndex()<0) {
                this.courseJPanel1.setState(PanelState.Initial);
            } else {
                onSelected();
            }
        } else if (action==Action.Delete) {
            course=(Course)((DefaultListModel)this.jListCourse.getModel()).get(this.jListCourse.getSelectedIndex());
            course.delete();
            loadCourses();
            this.courseJPanel1.setState(PanelState.Initial);
        }
    }

    private void loadCourses() {
        ArrayList<Course> courses=Database.getAllCourses();
        DefaultListModel model=new DefaultListModel();
        model.addAll(courses);
        this.jListCourse.setModel(model);
    }

    private void onSelected() {
        int idx=this.jListCourse.getSelectedIndex();
        Course course=(Course)((DefaultListModel)this.jListCourse.getModel()).get(idx);
        this.courseJPanel1.setData(course);
        this.courseJPanel1.setState(PanelState.InView);
    }
}