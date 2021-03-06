/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerLogin;
import java.awt.Color;
import javax.swing.JOptionPane;
import models.Usuario;

/**
 *
 * @author demil
 */
public class ViewLogin extends javax.swing.JFrame {
    public static final Color COLOR_ERROR = Color.red;
    public static final Color COLOR_OK = Color.black;

    /**
     * Creates new form viewLogin
     */
    public ViewLogin() {
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
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(315, 130));
        setPreferredSize(new java.awt.Dimension(315, 180));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel1.setText("Contraseña");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(33, 62, 107, 21);

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel2.setText("Cedula");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(33, 16, 65, 21);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(120, 10, 150, 30);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(170, 60, 130, 30);

        jButton1.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-entrar-40.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(102, 99, 73, 38);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/turquoise-wood-images-texture-on-260nw-683949346.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 320, 160);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(this.validar()){
            try {
                if(!this.controller.login(this.addUser())){
                    JOptionPane.showMessageDialog(this, "Usuario o Contraseña incorrecta");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE); 
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Inserte los datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }            
    }//GEN-LAST:event_jButton1ActionPerformed

    ControllerLogin controller;
    
    Usuario addUser(){
        Usuario user = new Usuario();
        user.setCedula(jTextField1.getText());
        user.setContrasenia(new String(this.jPasswordField1.getPassword()));
        return user;
   }
    public boolean validar(){
        boolean error=false;
        this.jLabel1.setForeground(COLOR_OK); 
        if (this.jTextField1.getText().isEmpty()){
            this.jLabel1.setForeground(COLOR_ERROR);
             error=true;
        }
        this.jLabel2.setForeground(COLOR_OK); 
        if ( (new String(this.jPasswordField1.getPassword())).isEmpty()){
            this.jLabel2.setForeground(COLOR_ERROR);
             error=true;
        }
        return !error;
    }
    
    
    public void reset(){
        this.jTextField1.setText("");
        this.jPasswordField1.setText("");
    }
    
    public void setController(ControllerLogin controller){
        this.controller=controller;
    }

 
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
