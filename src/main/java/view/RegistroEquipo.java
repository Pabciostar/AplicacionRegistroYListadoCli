/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import cl.pablo.lopezpabloexamenpyg.Desktop;
import cl.pablo.lopezpabloexamenpyg.Laptop;
import java.util.Arrays;
import model.ArraysDB;

/**
 *
 * @author pablo
 */
public class RegistroEquipo extends javax.swing.JFrame {

    /**
     * Creates new form RegistroEquipo
     */
    public RegistroEquipo() {
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

        btn_desk_true = new javax.swing.JButton();
        btn_lap_true = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_modelo_eq = new javax.swing.JTextField();
        txt_cpu_eq = new javax.swing.JTextField();
        txt_tam_eq = new javax.swing.JTextField();
        txt_ram_eq = new javax.swing.JTextField();
        txt_prec_eq = new javax.swing.JTextField();
        lbl_tam_lap = new javax.swing.JLabel();
        lbl_cant_lap = new javax.swing.JLabel();
        txt_tam_panta_lap = new javax.swing.JTextField();
        txt_cant_usb_lap = new javax.swing.JTextField();
        lbl_fuent_desk = new javax.swing.JLabel();
        lbl_fac_desk = new javax.swing.JLabel();
        txt_fuent_pod_desk = new javax.swing.JTextField();
        txt_fact_form_desk = new javax.swing.JTextField();
        btn_guardar_eq = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        btn_lista_eq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_desk_true.setText("Desktop");
        btn_desk_true.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desk_trueActionPerformed(evt);
            }
        });

        btn_lap_true.setText("Laptop");
        btn_lap_true.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lap_trueActionPerformed(evt);
            }
        });

        jLabel1.setText("¿Qué tipo de equipo desea registrar?");

        jLabel2.setText("Modelo:");

        jLabel3.setText("CPU:");

        jLabel4.setText("Tamaño disco duro:");

        jLabel5.setText("RAM:");

        jLabel6.setText("Precio:");

        jLabel7.setText("Ingrese los datos del equipo");

        txt_modelo_eq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_modelo_eqActionPerformed(evt);
            }
        });

        lbl_tam_lap.setText("Tamaño pantalla:");

        lbl_cant_lap.setText("Cantidad puertos usb:");

        lbl_fuent_desk.setText("Fuente de poder:");

        lbl_fac_desk.setText("Factor forma:");

        btn_guardar_eq.setText("Guardar");
        btn_guardar_eq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar_eqActionPerformed(evt);
            }
        });

        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        btn_lista_eq.setText("Ver registro de equipos");
        btn_lista_eq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lista_eqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_cant_lap)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_cant_usb_lap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl_tam_lap))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_fuent_desk)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lbl_fac_desk)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_fact_form_desk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(125, 125, 125)
                                            .addComponent(txt_fuent_pod_desk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_ram_eq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_tam_eq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_prec_eq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_modelo_eq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_cpu_eq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btn_lap_true)
                                                    .addComponent(btn_desk_true)))))
                                    .addComponent(txt_tam_panta_lap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btn_guardar_eq)
                        .addGap(37, 37, 37)
                        .addComponent(btn_volver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_lista_eq)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btn_desk_true))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(btn_lap_true))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txt_modelo_eq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_cpu_eq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_tam_eq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_ram_eq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_prec_eq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_tam_lap)
                            .addComponent(txt_tam_panta_lap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_cant_lap)
                            .addComponent(txt_cant_usb_lap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_fuent_desk)
                            .addComponent(txt_fuent_pod_desk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_fac_desk)
                            .addComponent(txt_fact_form_desk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_guardar_eq)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_volver)
                        .addComponent(btn_lista_eq)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    boolean desk;
    boolean lap;
    private void btn_desk_trueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desk_trueActionPerformed
        // TODO add your handling code here:
        lbl_cant_lap.setVisible(false);
        lbl_tam_lap.setVisible(false);
        txt_cant_usb_lap.setVisible(false);
        txt_tam_panta_lap.setVisible(false);
        lbl_fac_desk.setVisible(true);
        lbl_fuent_desk.setVisible(true);
        txt_fact_form_desk.setVisible(true);
        txt_fuent_pod_desk.setVisible(true);
        desk = true;
        lap = false;
    }//GEN-LAST:event_btn_desk_trueActionPerformed

    private void txt_modelo_eqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_modelo_eqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_modelo_eqActionPerformed

    private void btn_lap_trueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lap_trueActionPerformed
        // TODO add your handling code here:
        lbl_fac_desk.setVisible(false);
        lbl_fuent_desk.setVisible(false);
        txt_fact_form_desk.setVisible(false);
        txt_fuent_pod_desk.setVisible(false);
        lbl_cant_lap.setVisible(true);
        lbl_tam_lap.setVisible(true);
        txt_cant_usb_lap.setVisible(true);
        txt_tam_panta_lap.setVisible(true);
        desk = false;
        lap = true;
    }//GEN-LAST:event_btn_lap_trueActionPerformed

    private void btn_guardar_eqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar_eqActionPerformed
        // TODO add your handling code here:
        String modelEq = txt_modelo_eq.getText();
        String cpu = txt_cpu_eq.getText();
        String tamDiscDur = txt_tam_eq.getText();
        String ram = txt_ram_eq.getText();
        String precioString = txt_prec_eq.getText();
        int precioInt = Integer.parseInt(precioString);
        
        if (txt_modelo_eq.getText().isEmpty() || txt_cpu_eq.getText().isEmpty() || txt_tam_eq.getText().isEmpty() || txt_ram_eq.getText().isEmpty() || txt_prec_eq.getText().isEmpty()) {
            System.out.println("Llene todos los campos por favor");
        }else {
            if (desk = true){
                String factorForma = txt_fact_form_desk.getText();
                String fuentePoder = txt_fuent_pod_desk.getText();
                
                Desktop desktop = new Desktop(fuentePoder,factorForma, modelEq, cpu, tamDiscDur, ram, precioInt);
                
                ArraysDB DB = ArraysDB.getConexion();
                
                DB.agregar_desktop(desktop);
            }else if (lap = true) {
                String tamPant = txt_tam_panta_lap.getText();
                String cantUsbString = txt_cant_usb_lap.getText();
                
                int cantUsbInt = Integer.parseInt(cantUsbString);
                
                Laptop laptop = new Laptop(tamPant, cantUsbInt, modelEq, cpu, tamDiscDur, ram, precioInt);
                
                ArraysDB DB = ArraysDB.getConexion();
                
                DB.agregar_laptop(laptop);
        }
        }
    }//GEN-LAST:event_btn_guardar_eqActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        // TODO add your handling code here:
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_lista_eqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lista_eqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_lista_eqActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroEquipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroEquipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_desk_true;
    private javax.swing.JButton btn_guardar_eq;
    private javax.swing.JButton btn_lap_true;
    private javax.swing.JButton btn_lista_eq;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbl_cant_lap;
    private javax.swing.JLabel lbl_fac_desk;
    private javax.swing.JLabel lbl_fuent_desk;
    private javax.swing.JLabel lbl_tam_lap;
    private javax.swing.JTextField txt_cant_usb_lap;
    private javax.swing.JTextField txt_cpu_eq;
    private javax.swing.JTextField txt_fact_form_desk;
    private javax.swing.JTextField txt_fuent_pod_desk;
    private javax.swing.JTextField txt_modelo_eq;
    private javax.swing.JTextField txt_prec_eq;
    private javax.swing.JTextField txt_ram_eq;
    private javax.swing.JTextField txt_tam_eq;
    private javax.swing.JTextField txt_tam_panta_lap;
    // End of variables declaration//GEN-END:variables
}
