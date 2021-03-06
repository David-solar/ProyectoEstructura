/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevaGUI;

import Clases.Archivo;
import Clases.Franquicia;
import Lista.ListaDobleC;
import Lista.Nodo;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author SONY
 */
public class Agregarfranq extends javax.swing.JFrame implements Serializable {

    String fecha, tipo;
    Nodo print;

    public Agregarfranq() {
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/imagen2.png"));
        JLabel fondo= new JLabel(); 
        fondo.setIcon(uno); 
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
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

        Tipoempresa = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        mes = new javax.swing.JComboBox();
        año = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nacional = new javax.swing.JRadioButton();
        internacional = new javax.swing.JRadioButton();
        nombrefranq = new javax.swing.JTextField();
        clave = new javax.swing.JTextField();
        dia = new javax.swing.JComboBox();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ALTAS FRANQUICIAS");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel3.setText("FECHA INICIO");

        mes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE" }));
        mes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mesMouseClicked(evt);
            }
        });
        mes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mesKeyPressed(evt);
            }
        });

        año.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014" }));
        año.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                añoMouseClicked(evt);
            }
        });
        año.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                añoKeyPressed(evt);
            }
        });

        jLabel4.setText("TIPO DE FRANQUICIA");

        jLabel1.setText("CLAVE FRANQUICIA");

        jLabel2.setText("NOMBRE FRANQUICIA");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("DATOS FRANQUICIAS");

        Tipoempresa.add(nacional);
        nacional.setText("NACIONAL");
        nacional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nacionalMouseClicked(evt);
            }
        });

        Tipoempresa.add(internacional);
        internacional.setText("INTERNACIONAL");
        internacional.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                internacionalMouseClicked(evt);
            }
        });

        nombrefranq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombrefranqKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombrefranqKeyTyped(evt);
            }
        });

        clave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                claveMousePressed(evt);
            }
        });
        clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                claveKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                claveKeyTyped(evt);
            }
        });

        dia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diaMouseClicked(evt);
            }
        });
        dia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                diaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nacional)
                        .addGap(18, 18, 18)
                        .addComponent(internacional)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clave, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombrefranq, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(131, 131, 131))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombrefranq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nacional)
                            .addComponent(internacional)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(38, 38, 38))
        );

        aceptar.setText("AGREGAR");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });
        aceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                aceptarKeyPressed(evt);
            }
        });

        cancelar.setText("CANCELAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(aceptar)
                .addGap(57, 57, 57)
                .addComponent(cancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cancelar)
                    .addComponent(aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void agregar()
    {
        fecha = (dia.getSelectedItem().toString() + "/" + mes.getSelectedItem().toString() + "/" + año.getSelectedItem().toString());
        Franquicia obj = new Franquicia(nombrefranq.getText(), fecha, tipo);
        Nodo nod = new Nodo(obj, clave.getText());
        ListaDobleC.r = Principal.lista.insertar(nod, ListaDobleC.r);
        
        JOptionPane.showMessageDialog(this, "AGREGADO", "INFORMATIVO", JOptionPane.INFORMATION_MESSAGE);
        Control.contfranq++;
        limpiar();
        int op = JOptionPane.showConfirmDialog(this, "¿DESEA AGREGAR OTRA FRANQUICIA?", "AGREGAR FRANQUICIA", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (JOptionPane.OK_OPTION != op) 
        {
            this.hide();
        }
    }
    
    private void limpiar()
    {
        clave.setText("");
        nombrefranq.setText("");
        nombrefranq.setEnabled(false);
        dia.setEnabled(false);
        mes.setEnabled(false);
        año.setEnabled(false);
        nacional.setEnabled(false);
        internacional.setEnabled(false);
        aceptar.setEnabled(false);
    }
    
    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:
        agregar();
    }//GEN-LAST:event_aceptarActionPerformed

    private void nacionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nacionalMouseClicked
        // TODO add your handling code here:
        tipo = nacional.getLabel();
        aceptar.setEnabled(true);
        aceptar.requestFocus();

    }//GEN-LAST:event_nacionalMouseClicked

    private void internacionalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_internacionalMouseClicked
        // TODO add your handling code here:
        tipo = internacional.getLabel();
        aceptar.setEnabled(true);
        aceptar.requestFocus();
    }//GEN-LAST:event_internacionalMouseClicked

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        limpiar();
        int op=JOptionPane.showConfirmDialog(this, "SEGURO QUE DESEA CANCELAR", "CONFIRMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(JOptionPane.OK_OPTION==op)
        {
            this.hide();
        }
        else
        {
            clave.requestFocus();
        }        
    }//GEN-LAST:event_cancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        nombrefranq.setEnabled(false);
        dia.setEnabled(false);
        mes.setEnabled(false);
        año.setEnabled(false);
        nacional.setEnabled(false);
        internacional.setEnabled(false);
        aceptar.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void claveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_claveKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == '\n') 
        {
            if (clave.getText().length() > 0) 
            {
                if (clave.getText().charAt(0) != 'F') 
                {
                    clave.setText("F" + clave.getText());
                }
                nombrefranq.setEnabled(true);
                nombrefranq.requestFocus();
            } 
            else 
            {
                JOptionPane.showMessageDialog(this, "CAMPO VACIO", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_claveKeyPressed

    private void nombrefranqKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrefranqKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == '\n') 
        {
            if (nombrefranq.getText().length() > 0) 
            {
                nombrefranq.setText(nombrefranq.getText().toUpperCase());
                dia.setEnabled(true);
                dia.requestFocus();
            } 
            else 
            {
                JOptionPane.showMessageDialog(this, "CAMPO VACIO", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_nombrefranqKeyPressed

    private void mesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mesKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == '\n') 
        {
            año.setEnabled(true);
            año.requestFocus();
        }
    }//GEN-LAST:event_mesKeyPressed

    private void mesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mesMouseClicked
        // TODO add your handling code here:
        año.setEnabled(true);
        año.requestFocus();
    }//GEN-LAST:event_mesMouseClicked

    private void añoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_añoMouseClicked
        // TODO add your handling code here:
        nacional.setEnabled(true);
        internacional.setEnabled(true);
    }//GEN-LAST:event_añoMouseClicked

    private void diaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diaMouseClicked
        // TODO add your handling code here:
        mes.setEnabled(true);
        mes.requestFocus();
    }//GEN-LAST:event_diaMouseClicked

    private void diaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == '\n') 
        {
            mes.setEnabled(true);
            mes.requestFocus();
        }
    }//GEN-LAST:event_diaKeyPressed

    private void añoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_añoKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == '\n') 
        {
            nacional.setEnabled(true);
            internacional.setEnabled(true);
            nacional.requestFocus();
        }
    }//GEN-LAST:event_añoKeyPressed

    private void claveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_claveKeyTyped
        // TODO add your handling code here:
        Control.contarcadena(clave.getText(), 5);
        char c = evt.getKeyChar();
        if (!Control.band) 
        {
            evt.consume();
            clave.setText("");
            nombrefranq.setEnabled(false);
        }
        if (((c >= 33 && c<=47) || c>=58) && c != 'F') 
        {
            JOptionPane.showMessageDialog(this, "SOLO VALORES NUMÉRICOS", "ERROR", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_claveKeyTyped

    private void nombrefranqKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombrefranqKeyTyped
        // TODO add your handling code here:
        Control.contarcadena(nombrefranq.getText(), 15);
        if (!Control.band) {
            evt.consume();
            nombrefranq.setText("");
            dia.setEnabled(false);
        }
    }//GEN-LAST:event_nombrefranqKeyTyped

    private void claveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_claveMousePressed
      if(!clave.getText().isEmpty())
      {
        if (clave.getText().charAt(0) == 'F') 
        {
            String aux = clave.getText().substring(1, clave.getText().length());
            clave.setText(aux);
        }
      }
    }//GEN-LAST:event_claveMousePressed

    private void aceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aceptarKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar()=='\n')
        {   
            agregar();
        }
    }//GEN-LAST:event_aceptarKeyPressed

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
            java.util.logging.Logger.getLogger(Agregarfranq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregarfranq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregarfranq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregarfranq.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregarfranq().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Tipoempresa;
    private javax.swing.JButton aceptar;
    private javax.swing.JComboBox año;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField clave;
    private javax.swing.JComboBox dia;
    private javax.swing.JRadioButton internacional;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox mes;
    private javax.swing.JRadioButton nacional;
    private javax.swing.JTextField nombrefranq;
    // End of variables declaration//GEN-END:variables
}
