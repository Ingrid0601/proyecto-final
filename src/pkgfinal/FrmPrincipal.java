/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
     DefaultTableModel modelotable = new DefaultTableModel();
    List<Atributos> Datos = new ArrayList<>();
    int posicion=0;
    public FrmPrincipal() {
        initComponents();
         TitulosTabla();
        Carga();
   
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtMatricula = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        txtPromedio = new javax.swing.JTextField();
        btnGrabar = new javax.swing.JButton();
        btnActualiza = new javax.swing.JButton();
        btnLimpia = new javax.swing.JButton();
        btnElimina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Promedios Finales");

        jLabel2.setText("Nombre");

        jLabel3.setText("Matricula");

        jLabel4.setText("Correo");

        jLabel5.setText("Promedio Final");

        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDatos);

        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnActualiza.setText("Actualizar");
        btnActualiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizaActionPerformed(evt);
            }
        });

        btnLimpia.setText("Limpiar");
        btnLimpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiaActionPerformed(evt);
            }
        });

        btnElimina.setText("Eliminar");
        btnElimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(212, 212, 212)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGrabar)
                            .addComponent(btnLimpia))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnElimina)
                            .addComponent(btnActualiza))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGrabar)
                        .addComponent(btnActualiza)))
                .addGap(5, 5, 5)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpia)
                            .addComponent(btnElimina))))
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        // TODO add your handling code here:
        Archivo conexion = new Archivo();
        Atributos dato = new Atributos();
        
        dato.setNombre(txtNombre.getText().toString());
        dato.setMatricula(txtMatricula.getText().toString());
        dato.setCorreo(txtCorreo.getText().toString());
        dato.setPromedio(txtPromedio.getText().toString());
        
        conexion.Agregar(dato);
        Datos = conexion.getDatos();
        
        if (conexion.Grabar(Datos,0)){
            modelotable = (DefaultTableModel) tbDatos.getModel();
            modelotable.getDataVector().removeAllElements();
            JOptionPane.showMessageDialog(this,"se grabo corectamente","Grabado",
                    JOptionPane.INFORMATION_MESSAGE);
            Carga();
            
        }else{
            JOptionPane.showMessageDialog(this,"Error al grabar la informacion","Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void tbDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDatosMouseClicked
        // TODO add your handling code here:
         int nfilas = tbDatos.getSelectedRowCount();
        int fila = 0;
        if(nfilas == 1){
            fila = tbDatos.getSelectedRow();
            posicion = fila;
            txtNombre.setText(tbDatos.getValueAt(fila , 0).toString());
            txtMatricula.setText(tbDatos.getValueAt(fila, 1).toString());
            txtCorreo.setText(tbDatos.getValueAt(fila, 2).toString());
            txtPromedio.setText(tbDatos.getValueAt(fila, 3).toString());
        }
    }//GEN-LAST:event_tbDatosMouseClicked

    private void btnLimpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiaActionPerformed
        // TODO add your handling code here:
        txtNombre.setText("");
        txtMatricula.setText("");
        txtCorreo.setText("");
        txtPromedio.setText("");
    }//GEN-LAST:event_btnLimpiaActionPerformed

    private void btnActualizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizaActionPerformed
        // TODO add your handling code here:
         Archivo conexion = new Archivo();
        Atributos dato = new Atributos();
        
        dato.setNombre(txtNombre.getText().toString());
        dato.setMatricula(txtMatricula.getText().toString());
        dato.setCorreo(txtCorreo.getText().toString());
        dato.setPromedio(txtPromedio.getText().toString());
        
        Datos.set(posicion,dato);
        
        if (conexion.Grabar(Datos,1)){
            modelotable = (DefaultTableModel) tbDatos.getModel();
            modelotable.getDataVector().removeAllElements();
            JOptionPane.showMessageDialog(this,"se actualizo corectamente","Actualizado",
                    JOptionPane.INFORMATION_MESSAGE);
            Carga();
            
        }else{
            JOptionPane.showMessageDialog(this,"Error al actualizar la informacion","Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizaActionPerformed

    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaActionPerformed
        // TODO add your handling code here:
         Archivo conexion = new Archivo();
        Datos.remove(posicion);
        
        if (conexion.Grabar(Datos,1)){
            modelotable = (DefaultTableModel) tbDatos.getModel();
            modelotable.getDataVector().removeAllElements();
            JOptionPane.showMessageDialog(this,"se elimino corectamente","Eliminado",
                    JOptionPane.INFORMATION_MESSAGE);
            Carga();
            
        }else{
            JOptionPane.showMessageDialog(this,"Error al eliminar la informacion","Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }
    private void Carga(){
        Archivo conexion = new Archivo();
        if(conexion.verificaArch()){
            if (conexion.Leer()){
                Datos= conexion.getDatos();
                CargarRegistroTabla();
            }else{
                JOptionPane.showMessageDialog(this,"No se puede leer la informacion",
                                                   "Error",JOptionPane.ERROR_MESSAGE);
               CargarRegistroTabla();
            }
        }else{
            JOptionPane.showMessageDialog(this,"No existe el archivo, caputre informacion",
                                                "No existe",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void TitulosTabla(){
    modelotable.addColumn("Nombre");
    modelotable.addColumn("Matricula");
    modelotable.addColumn("Correo");
    modelotable.addColumn("Promedio");
    tbDatos.setModel(modelotable);
}
    
    private void CargarRegistroTabla(){
        Object[] filatabla = new Object[4];
        for(Atributos dato: Datos){
            filatabla[0]=dato.getNombre();
            filatabla[1]=dato.getMatricula();
            filatabla[2]=dato.getCorreo();
            filatabla[3]=dato.getPromedio();
            modelotable.addRow(filatabla);
        }
        tbDatos.setModel(modelotable);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualiza;
    private javax.swing.JButton btnElimina;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnLimpia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPromedio;
    // End of variables declaration//GEN-END:variables
}
