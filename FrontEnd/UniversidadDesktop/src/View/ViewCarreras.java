/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerCarreras;
import ModelView.TablaModelView;
import static View.ViewLogin.COLOR_ERROR;
import static View.ViewLogin.COLOR_OK;
import exceptions.GlobalException;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import models.Carrera;

/**
 *
 * @author demil
 */
public class ViewCarreras extends javax.swing.JFrame implements java.util.Observer {

    ControllerCarreras controller;
    TablaModelView model;

    public ViewCarreras() {
        initComponents();
        this.saveEdit.setVisible(false);
        this.cancelBtn.setVisible(false);
        this.cursosBox.setVisible(false);
        this.Carreras.getTableHeader().setReorderingAllowed(false);
        this.Carreras.getTableHeader().setResizingAllowed(false);
    }

    public void setController(ControllerCarreras controller) {
        this.controller = controller;
    }

    public ControllerCarreras getController() {
        return controller;
    }

    public void setModel(TablaModelView model) {
        this.model = model;
        model.addObserver(this);
    }

    public TablaModelView getModel() {
        return model;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.Carreras.setModel(model.getTabla());
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for (int x = 0; x < this.Carreras.getColumnCount(); x++) {
            this.Carreras.getColumnModel().getColumn(x).setCellRenderer(centerRenderer);
        }
    }

    public JComboBox retornaBox() {
        return this.cursosBox;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanelAgregar = new javax.swing.JPanel();
        CodCarreraL = new javax.swing.JLabel();
        CodCarreraF = new javax.swing.JTextField();
        NombreCarreraL = new javax.swing.JLabel();
        NombreCarreraF = new javax.swing.JTextField();
        AddL = new javax.swing.JLabel();
        BtnAdd = new javax.swing.JButton();
        Titulos = new javax.swing.JComboBox<>();
        saveEdit = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        cursosBox = new javax.swing.JComboBox<>();
        jPanelBusqueda = new javax.swing.JPanel();
        BuscarL = new javax.swing.JLabel();
        BuscarBTN = new javax.swing.JButton();
        buscarF = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        Carreras = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        codnom1 = new javax.swing.JComboBox<>();
        homeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carreras");
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(115, 183, 175));

        jPanelAgregar.setBackground(new java.awt.Color(201, 229, 200));
        jPanelAgregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 98, 133), 4, true));
        jPanelAgregar.setToolTipText("");
        jPanelAgregar.setLayout(null);

        CodCarreraL.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        CodCarreraL.setText("Codigo");
        jPanelAgregar.add(CodCarreraL);
        CodCarreraL.setBounds(32, 28, 63, 21);

        CodCarreraF.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        CodCarreraF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodCarreraFActionPerformed(evt);
            }
        });
        jPanelAgregar.add(CodCarreraF);
        CodCarreraF.setBounds(100, 29, 78, 23);

        NombreCarreraL.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        NombreCarreraL.setText("Nombre");
        jPanelAgregar.add(NombreCarreraL);
        NombreCarreraL.setBounds(320, 28, 75, 21);

        NombreCarreraF.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        NombreCarreraF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreCarreraFActionPerformed(evt);
            }
        });
        jPanelAgregar.add(NombreCarreraF);
        NombreCarreraF.setBounds(400, 29, 148, 23);

        AddL.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        AddL.setText("Agregar Nueva Carrera");
        jPanelAgregar.add(AddL);
        AddL.setBounds(90, 80, 214, 30);

        BtnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-añadir-50.png"))); // NOI18N
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });
        jPanelAgregar.add(BtnAdd);
        BtnAdd.setBounds(440, 70, 104, 44);

        Titulos.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        Titulos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bachillerato", "Licenciatura", "Maestria" }));
        jPanelAgregar.add(Titulos);
        Titulos.setBounds(590, 20, 150, 34);

        saveEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-guardar-40.png"))); // NOI18N
        saveEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveEditActionPerformed(evt);
            }
        });
        jPanelAgregar.add(saveEdit);
        saveEdit.setBounds(440, 70, 50, 40);

        cancelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-cancelar-2-40.png"))); // NOI18N
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanelAgregar.add(cancelBtn);
        cancelBtn.setBounds(500, 70, 40, 40);

        cursosBox.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanelAgregar.add(cursosBox);
        cursosBox.setBounds(590, 70, 150, 30);

        jPanelBusqueda.setBackground(new java.awt.Color(201, 229, 200));
        jPanelBusqueda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(14, 98, 133), 4, true));

        BuscarL.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        BuscarL.setText("Buscar por:");

        BuscarBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-búsqueda-de-amor-30.png"))); // NOI18N
        BuscarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBTNActionPerformed(evt);
            }
        });

        Carreras.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        Carreras.setFont(new java.awt.Font("Georgia", 1, 13)); // NOI18N
        Carreras.setModel(new javax.swing.table.DefaultTableModel(
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
        Carreras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarrerasMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(Carreras);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-editar-30.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-eliminar-30.png"))); // NOI18N
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        codnom1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nombre" }));

        javax.swing.GroupLayout jPanelBusquedaLayout = new javax.swing.GroupLayout(jPanelBusqueda);
        jPanelBusqueda.setLayout(jPanelBusquedaLayout);
        jPanelBusquedaLayout.setHorizontalGroup(
            jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBusquedaLayout.createSequentialGroup()
                .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBusquedaLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanelBusquedaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BuscarL)
                        .addGap(18, 18, 18)
                        .addComponent(codnom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(buscarF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(BuscarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanelBusquedaLayout.setVerticalGroup(
            jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBusquedaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BuscarL)
                        .addComponent(buscarF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(codnom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BuscarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBusquedaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBusquedaLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        homeBtn.setBackground(new java.awt.Color(201, 229, 200));
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-universidad-64.png"))); // NOI18N
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jPanelAgregar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanelBusqueda, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(homeBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(jPanelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 784, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanelAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGap(0, 51, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBTNActionPerformed
        try {
            String a = this.buscarF.getText();
            int sel = this.codnom1.getSelectedIndex();
            controller.buscar(a,sel);
        } catch (GlobalException ex) {
            Logger.getLogger(ViewCarreras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ViewCarreras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BuscarBTNActionPerformed

    private void CodCarreraFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodCarreraFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodCarreraFActionPerformed

    private void NombreCarreraFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreCarreraFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreCarreraFActionPerformed

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        if (this.validar()) {
            try {
                this.controller.insertarCarrera(this.addCarrera());
                JOptionPane.showMessageDialog(this, "Carrera agregada correctamente");
                this.controller.buscarCarreras();
                this.clear();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Inserte los datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnAddActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        this.clear();
        this.setVisible(false);
        UniversidadDesktop.UniversidadDesktop.PRINCIPAL_CONTROLLER.enter();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void CarrerasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarrerasMouseClicked

    }//GEN-LAST:event_CarrerasMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Carrera car = null;
        try {
            if (this.toCod() != null) {
                car = controller.buscarCodCarrera(this.toCod());
                this.toCarrera(car);
            }
        } catch (GlobalException ex) {
            Logger.getLogger(ViewCarreras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ViewCarreras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.clear1();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void saveEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveEditActionPerformed
        if (this.validar()) {
            try {
                this.controller.updateCarrera(this.addCarrera());
                JOptionPane.showMessageDialog(this, "Carrera editada correctamente");
                this.controller.buscarCarreras();
                this.clear1();
            } catch (GlobalException | HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Inserte los datos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_saveEditActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        if (this.toCod() != null) {
            int d = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar la carrera?");
            if (d == 0) {
                try {
                    if (controller.deleteCarrera(this.toCod())) {
                        JOptionPane.showMessageDialog(this, "Carrera Eliminada correctamente");
                        this.controller.buscarCarreras();
                    } else {
                        JOptionPane.showMessageDialog(this, "Carrera contiene cursos, primero elimine los cursos", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (SQLException | GlobalException ex) {
                    Logger.getLogger(ViewCarreras.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    public Carrera addCarrera() {
        Carrera car = new Carrera();
        car.setCodigo(this.CodCarreraF.getText());
        car.setNombre(this.NombreCarreraF.getText());
        car.setTitulo(this.Titulos.getSelectedItem().toString());
        return car;
    }

    public String toCod() {
        if (this.Carreras.getSelectedRow() != -1) {
            String a = (String) this.Carreras.getValueAt(this.Carreras.getSelectedRow(), 0);
            return a;
        }
        this.AddL.setText("Editar Carrera");
        return null;
    }

    public void toCarrera(Carrera car) {
        this.CodCarreraF.setText(car.getCodigo());
        this.NombreCarreraF.setText(car.getNombre());
        this.Titulos.setSelectedItem(car.getTitulo());
        this.CodCarreraF.setEditable(false);
        this.saveEdit.setVisible(true);
        this.BtnAdd.setVisible(false);
        this.BuscarBTN.setEnabled(false);
        this.homeBtn.setEnabled(false);
        this.deleteBtn.setEnabled(false);
        this.AddL.setText("Editar Carrera");
        this.cancelBtn.setVisible(true);
    }

    public void clear1() {
        this.clear();
        this.saveEdit.setVisible(false);
        this.BtnAdd.setVisible(true);
        this.BuscarBTN.setEnabled(true);
        this.homeBtn.setEnabled(true);
        this.deleteBtn.setEnabled(true);
        this.AddL.setText("Agregar Nueva Carrera");
        this.cancelBtn.setVisible(false);
        this.CodCarreraF.setEditable(true);
    }

    public void clear() {
        this.CodCarreraF.setText("");
        this.NombreCarreraF.setText("");
        this.Titulos.setSelectedIndex(0);
    }

    public boolean validar() {
        boolean error = false;
        this.CodCarreraL.setForeground(COLOR_OK);
        if (this.CodCarreraF.getText().isEmpty()) {
            this.CodCarreraL.setForeground(COLOR_ERROR);
            error = true;
        }
        this.NombreCarreraL.setForeground(COLOR_OK);
        if (this.NombreCarreraF.getText().isEmpty()) {
            this.NombreCarreraL.setForeground(COLOR_ERROR);
            error = true;
        }
        return !error;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddL;
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BuscarBTN;
    private javax.swing.JLabel BuscarL;
    private javax.swing.JTable Carreras;
    private javax.swing.JTextField CodCarreraF;
    private javax.swing.JLabel CodCarreraL;
    private javax.swing.JTextField NombreCarreraF;
    private javax.swing.JLabel NombreCarreraL;
    private javax.swing.JComboBox<String> Titulos;
    private javax.swing.JTextField buscarF;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<String> codnom1;
    private javax.swing.JComboBox<String> cursosBox;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanelAgregar;
    private javax.swing.JPanel jPanelBusqueda;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton saveEdit;
    // End of variables declaration//GEN-END:variables

}
