/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevaGUI;

import Clases.Archivo;
import Lista.ListaDobleC;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author SONY
 */
public class Principal extends javax.swing.JFrame {

    static ListaDobleC lista = new ListaDobleC();
    static int id;

    /**
     * Creates new form Principal
     */
    public Principal() {
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/imagen2.png"));
        JLabel fondo= new JLabel(); 
        fondo.setIcon(uno); 
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        initComponents();
        File file = new File("listaD.txt");
        if (file.exists()) {
            
                lista = Archivo.cargarLista(Control.contfranq, Control.contsuc, Control.contauto);
                System.out.println(lista.getR().desp());
                file.delete();
                
        }
        File fileC = new File("cont.txt");
        if(fileC.exists()){
            int co[]=Archivo.abrirContadores();
                Control.contfranq=co[0];
                Control.contsuc=co[1];
                Control.contauto=co[2];
                fileC.delete();
        }
        if (Control.contfranq != 0) {
            eliminar.setEnabled(true);
            consultar.setEnabled(true);
        } else {
            eliminar.setEnabled(false);
            consultar.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregar = new javax.swing.JButton();
        consultar = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMINISTRACIÓN DE SISTEMAS AUTOMOTRICES.");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        agregar.setText("AGREGAR");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        consultar.setText("CONSULTAR");
        consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarActionPerformed(evt);
            }
        });

        eliminar.setText("ELIMINAR");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEMA PARA EL CONTROL DE FRANQUICIAS, SUCURSALES Y AUTOS");

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(agregar)
                        .addGap(47, 47, 47)
                        .addComponent(consultar)
                        .addGap(48, 48, 48)
                        .addComponent(eliminar)
                        .addGap(58, 58, 58)
                        .addComponent(jButton1))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregar)
                    .addComponent(consultar)
                    .addComponent(eliminar)
                    .addComponent(jButton1))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        new Informacion().setVisible(true);
        id = 1;
    }//GEN-LAST:event_agregarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        new Informacion().setVisible(true);
        id = 3;
    }//GEN-LAST:event_eliminarActionPerformed

    private void consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarActionPerformed
        // TODO add your handling code here:
        new Informacion().setVisible(true);
        id = 2;
    }//GEN-LAST:event_consultarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        if (Control.contfranq != 0) {
            eliminar.setEnabled(true);
            consultar.setEnabled(true);
        } else {
            eliminar.setEnabled(false);
            consultar.setEnabled(false);
        }
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int op = JOptionPane.showConfirmDialog(this, "¿SEGURO QUE DESEA SALIR?", "SALIDA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (JOptionPane.OK_OPTION == op) {
            Archivo.guardarNodo(lista);
             Archivo.guardarContadores(Control.contfranq, Control.contsuc, Control.contauto);
            System.exit(0);
           
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Archivo.guardarNodo(lista);
        Archivo.guardarContadores(Control.contfranq, Control.contsuc, Control.contauto);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton consultar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
