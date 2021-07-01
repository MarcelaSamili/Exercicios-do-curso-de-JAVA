/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operando;

/**
 *
 * @author Marcela
 */
public class CalculadoraSuper extends javax.swing.JFrame {

    /**
     * Creates new form CalculadoraSuper
     */
    public CalculadoraSuper() {//CONSTRUTOR
        initComponents();
        txtPainel.setVisible(false);
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
        btCalc = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtPainel = new javax.swing.JPanel();
        lblRaizc = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblValab = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblRestDiv = new javax.swing.JLabel();
        lblCubo = new javax.swing.JLabel();
        lblRaizq = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNun = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Informe um valor:");

        btCalc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calculo.jpg"))); // NOI18N
        btCalc.setText("Calcular");
        btCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calculadora.png"))); // NOI18N

        txtPainel.setBackground(new java.awt.Color(204, 204, 204));
        txtPainel.setForeground(new java.awt.Color(0, 0, 255));

        lblRaizc.setBackground(new java.awt.Color(204, 204, 204));
        lblRaizc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRaizc.setText("0");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("Valor Absoluto");

        lblValab.setBackground(new java.awt.Color(204, 204, 204));
        lblValab.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblValab.setText("0");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Resto da divisão por 2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Elevado ao cubo");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Raiz Quadrada");

        lblRestDiv.setBackground(new java.awt.Color(204, 204, 204));
        lblRestDiv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRestDiv.setText("0");

        lblCubo.setBackground(new java.awt.Color(204, 204, 204));
        lblCubo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCubo.setText("0");

        lblRaizq.setBackground(new java.awt.Color(204, 204, 204));
        lblRaizq.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRaizq.setText("0");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Raiz Cubica");

        javax.swing.GroupLayout txtPainelLayout = new javax.swing.GroupLayout(txtPainel);
        txtPainel.setLayout(txtPainelLayout);
        txtPainelLayout.setHorizontalGroup(
            txtPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtPainelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(txtPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addGap(43, 43, 43)
                .addGroup(txtPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValab)
                    .addComponent(lblRaizc)
                    .addComponent(lblRaizq)
                    .addComponent(lblCubo)
                    .addComponent(lblRestDiv))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        txtPainelLayout.setVerticalGroup(
            txtPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtPainelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(txtPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblRestDiv))
                .addGap(18, 18, 18)
                .addGroup(txtPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblCubo))
                .addGap(18, 18, 18)
                .addGroup(txtPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblRaizq))
                .addGap(18, 18, 18)
                .addGroup(txtPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblRaizc))
                .addGap(18, 18, 18)
                .addGroup(txtPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lblValab))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNun, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btCalc, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btCalc)
                    .addComponent(txtNun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcActionPerformed
        // TODO add your handling code here:
        int nun = Integer.parseInt(txtNun.getValue().toString());
        int r = nun % 2;
        double cubo =  Math.pow(nun,3);
        double raizq =  Math.sqrt(nun);
        double raizc = Math.cbrt(nun);
        int abso =  Math.abs(nun);
        lblRestDiv.setText(Integer.toString(r));
        lblCubo.setText(Double.toString(cubo));
        lblRaizq.setText(String.format("%.2f",raizq));
        lblRaizc.setText(String.format("%.2f",raizc));
        lblValab.setText(Integer.toString(abso));
        txtPainel.setVisible(true);
    }//GEN-LAST:event_btCalcActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraSuper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraSuper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraSuper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraSuper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraSuper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCubo;
    private javax.swing.JLabel lblRaizc;
    private javax.swing.JLabel lblRaizq;
    private javax.swing.JLabel lblRestDiv;
    private javax.swing.JLabel lblValab;
    private javax.swing.JSpinner txtNun;
    private javax.swing.JPanel txtPainel;
    // End of variables declaration//GEN-END:variables
}