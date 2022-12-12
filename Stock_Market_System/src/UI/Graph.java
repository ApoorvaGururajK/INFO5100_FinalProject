/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author meenalsarwaiya
 */
public class Graph extends javax.swing.JFrame {

    /**
     * Creates new form Graph
     */
    public Graph() {
        initComponents();
        showLineChartNas();
        showLineChartNyse();
    }
    
         public void showLineChartNas(){
        //create dataset for the graph
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(11127.85, "Amount", "july");
        dataset.setValue(12368.98, "Amount", "august");
        dataset.setValue(11785.13, "Amount", "september");
        dataset.setValue(10575.62, "Amount", "october");
        dataset.setValue(10890.85, "Amount", "november");
        dataset.setValue(11482.45, "Amount", "december");
        
        //create chart
        JFreeChart linechart = ChartFactory.createLineChart("Nasdaq Composite","6 months","amount", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        //create plot object
         CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
       // lineCategoryPlot.setRangeGridlinePaint(Color.BLUE);
        lineCategoryPlot.setBackgroundPaint(Color.white);
        
        //create render object to change the moficy the line properties like color
        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(204,0,51);
        lineRenderer.setSeriesPaint(0, lineChartColor);
        
         //create chartPanel to display chart(graph)
        ChartPanel lineChartPanel = new ChartPanel(linechart);
        graph1.removeAll();
        graph1.add(lineChartPanel, BorderLayout.CENTER);
        graph1.validate();
    }
     
         
         






         public void showLineChartNyse(){
        //create dataset for the graph
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(15291.05, "Amount", "12/09/22");
        dataset.setValue(15399.94, "Amount", "12/08/22");
        dataset.setValue(15311.80, "Amount", "12/07/22");
        dataset.setValue(15328.44, "Amount", "12/06/22");
        dataset.setValue(15474.79, "Amount", "12/05/22");
        dataset.setValue(15767.02, "Amount", "12/04/22");
        dataset.setValue(15761.12, "Amount", "12/03/22");
        dataset.setValue(15780.02, "Amount", "12/02/22");
        dataset.setValue(15352.69, "Amount", "12/01/22");
        dataset.setValue(15228.99, "Amount", "11/30/22");
        dataset.setValue(15309.77, "Amount", "11/29/22");
//        dataset.setValue(15370.44, "Amount", "11/28/22");
//        dataset.setValue(15605.67, "Amount", "11/27/22");
//        dataset.setValue(15265.25, "Amount", "11/26/22");
//        dataset.setValue(15481.76, "Amount", "11/25/22");
//        dataset.setValue(15381.00, "Amount", "11/24/22");
//        dataset.setValue(15545.52, "Amount", "11/23/22");
//        dataset.setValue(15223.96, "Amount", "11/22/22");
        
        //create chart
        JFreeChart linechart = ChartFactory.createLineChart("NYSE Composite","1 months","amount", 
                dataset, PlotOrientation.VERTICAL, true,true,true);
        
        //create plot object
         CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
       // lineCategoryPlot.setRangeGridlinePaint(Color.BLUE);
        lineCategoryPlot.setBackgroundPaint(Color.white);
        
        //create render object to change the moficy the line properties like color
        LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
        Color lineChartColor = new Color(204,0,51);
        lineRenderer.setSeriesPaint(0, lineChartColor);
        
         //create chartPanel to display chart(graph)
        ChartPanel lineChartPanel = new ChartPanel(linechart);
        graph4.removeAll();
        graph4.add(lineChartPanel, BorderLayout.CENTER);
        graph4.validate();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
      

              
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        graph1 = new javax.swing.JPanel();
        graph2 = new javax.swing.JPanel();
        graph3 = new javax.swing.JPanel();
        graph4 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Kavivanar", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Graphs");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        graph1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(graph1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 410, 250));

        graph2.setLayout(new java.awt.BorderLayout());
        getContentPane().add(graph2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 310, 200));

        graph3.setLayout(new java.awt.BorderLayout());
        getContentPane().add(graph3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 280, 230));

        graph4.setLayout(new java.awt.BorderLayout());
        getContentPane().add(graph4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 400, 230));

        btnHome.setBackground(new java.awt.Color(0, 0, 0));
        btnHome.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        getContentPane().add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        dispose();
        Home home= new Home();
        home.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graph().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JPanel graph1;
    private javax.swing.JPanel graph2;
    private javax.swing.JPanel graph3;
    private javax.swing.JPanel graph4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}