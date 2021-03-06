package Vista;

import ConexionBD.ConectarBD;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import tp5ingsw4k9.Alumno;
import tp5ingsw4k9.Ejercicio;

public class MenuAlumno extends javax.swing.JFrame {

    Alumno al;
    int totalpuntos = 0;

    public MenuAlumno() {
        this.setLocationRelativeTo(null);
    }

    public MenuAlumno(Alumno a) {
        this.al = a;

        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnHacerEjerciciosNivel = new javax.swing.JButton();
        btnInventarEjercicio = new javax.swing.JButton();
        btnPuntaje = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Hola ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText(al.nombre);
        jLabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Tu nivel de aprendizaje es: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("¿Qué quieres hacer?");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText(al.nivel.numeroNivel+"");
        jLabel5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel5AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        btnHacerEjerciciosNivel.setText("Hacer ejercicios del nivel");
        btnHacerEjerciciosNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHacerEjerciciosNivelActionPerformed(evt);
            }
        });

        btnInventarEjercicio.setText("Inventar ejercicios");
        btnInventarEjercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarEjercicioActionPerformed(evt);
            }
        });

        btnPuntaje.setText("Ver mi puntaje");
        btnPuntaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntajeActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/mafalda.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel4)
                                .addGap(93, 93, 93))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnHacerEjerciciosNivel)
                                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(32, 32, 32)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnPuntaje)
                                        .addComponent(btnInventarEjercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHacerEjerciciosNivel)
                    .addComponent(btnInventarEjercicio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnPuntaje))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel2AncestorAdded

    }//GEN-LAST:event_jLabel2AncestorAdded

    private void jLabel5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel5AncestorAdded

    }//GEN-LAST:event_jLabel5AncestorAdded

    private void btnHacerEjerciciosNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHacerEjerciciosNivelActionPerformed

        try {
            ArrayList<Ejercicio> listEj = new ArrayList();

            ConectarBD con = new ConectarBD();
            Connection cn = null;
            cn = con.getCon();

            String sql = "SELECT * FROM ejercicio WHERE numNivel='" + al.nivel.numeroNivel + "'";

            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Ejercicio ej = new Ejercicio();
                ej.expresion = rs.getString("expresion");
                ej.resultado = parseInt(rs.getString("resultado"));
                ej.puntaje = parseInt(rs.getString("puntaje"));
                listEj.add(ej);
            }

            for (Ejercicio ej1 : listEj) {
                HacerEjercicioAlumno hacerEj = new HacerEjercicioAlumno(ej1, al);
                hacerEj.setVisible(true);

            }

        } catch (SQLException ex) {
            Logger.getLogger(MenuAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnHacerEjerciciosNivelActionPerformed

    private void btnPuntajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntajeActionPerformed
        try {
            ConectarBD con = new ConectarBD();
            Connection cn = null;

            cn = con.getCon();

            String sql = "SELECT * FROM alumno WHERE usuario='" + al.usuario + "'";

            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                al.puntajeAcumulado = parseInt(rs.getString("puntajeAcumulado"));
                al.nivel.numeroNivel = parseInt(rs.getString("numeroNivel"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "Tu puntaje acumulado es:" + al.puntajeAcumulado + ". Estas en el nivel: " + al.nivel.numeroNivel);

        this.jLabel5.setText(String.valueOf(al.nivel.numeroNivel));
    }//GEN-LAST:event_btnPuntajeActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.setVisible(false);
        Principal ppal = new Principal();
        ppal.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInventarEjercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarEjercicioActionPerformed
        CrearEjercicio cEj = new CrearEjercicio();
        cEj.setVisible(true);
    }//GEN-LAST:event_btnInventarEjercicioActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(MenuAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHacerEjerciciosNivel;
    private javax.swing.JButton btnInventarEjercicio;
    private javax.swing.JButton btnPuntaje;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
