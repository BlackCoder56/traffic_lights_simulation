
package code_package;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;


public class pole extends javax.swing.JFrame {

    
    public pole() {
        initComponents();
        T.start();
    }

    
    int a = 0;   
    
    
    Color go = Color.gray;
    Color ready = Color.gray;
    Color stop = Color.gray;
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0, 0, 250, 380);
        g.setColor(stop);
        g.fillOval(40, 42, 100, 100);
        g.setColor(ready);
        g.fillOval(40, 150, 100, 100);
        g.setColor(go);
        g.fillOval(40, 260, 100, 100);
    }
    
    
    Timer T = new Timer(2000, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            a++;
            switch(a){
                case 1:
                    go = Color.gray;
                    stop = Color.red;
                    repaint();
                    break;
                case 10:
                    stop = Color.gray;
                    ready = Color.yellow;
                    repaint();
                    break;
                case 11:
                    ready = Color.gray;
                    go = Color.green;
                    repaint();
                    break;
            }
            
            if(a==18){
                a = 0;
            }
        }
            
            });
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      // T.start();
    }//GEN-LAST:event_formWindowOpened

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pole().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
