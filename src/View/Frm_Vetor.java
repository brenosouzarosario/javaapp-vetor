package View;

public class Frm_Vetor extends javax.swing.JFrame {

    public Frm_Vetor() {
        initComponents();
    }
    int[] vetor = new int[5];
    int numElementos = 0;
    String vetorString = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtVetor = new javax.swing.JTextField();
        txtVetorInvertido = new javax.swing.JTextField();
        txtQtPares = new javax.swing.JTextField();
        txtNoElementos = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();
        btnIncluirImpar = new javax.swing.JButton();
        btnIncluirInverter = new javax.swing.JButton();
        btnIncluirPares = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Vetor");

        jLabel2.setText("Número:");

        jLabel3.setText("Vetor:");

        jLabel4.setText("Vetor invertido:");

        jLabel5.setText("Qt No.Pares:");

        jLabel6.setText("N. Elementos:");

        txtNumero.setEnabled(false);
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        txtVetor.setEnabled(false);
        txtVetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVetorActionPerformed(evt);
            }
        });

        txtVetorInvertido.setEnabled(false);

        txtQtPares.setEnabled(false);

        txtNoElementos.setEnabled(false);

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnIncluirImpar.setText("Incluir Impar");
        btnIncluirImpar.setEnabled(false);
        btnIncluirImpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirImparActionPerformed(evt);
            }
        });

        btnIncluirInverter.setText("Incluir e Inverter");
        btnIncluirInverter.setEnabled(false);
        btnIncluirInverter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirInverterActionPerformed(evt);
            }
        });

        btnIncluirPares.setText("Incluir e QtPares");
        btnIncluirPares.setEnabled(false);
        btnIncluirPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirParesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNoElementos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtVetorInvertido)
                                        .addComponent(txtVetor, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNumero, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtQtPares, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnIncluirImpar)
                                    .addComponent(btnIniciar)
                                    .addComponent(btnIncluirInverter)
                                    .addComponent(btnIncluirPares)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNoElementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIniciar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnIncluirImpar)
                                .addComponent(txtVetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtVetorInvertido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIncluirInverter))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtQtPares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIncluirPares))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed

    }//GEN-LAST:event_txtNumeroActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        this.txtNumero.setText("");
        this.txtQtPares.setText("");
        this.txtVetor.setText("");
        this.txtNoElementos.setText("");
        this.txtVetorInvertido.setText("");
        this.txtNumero.setEnabled(true);
        this.btnIncluirImpar.setEnabled(true);
        this.btnIncluirPares.setEnabled(true);
        this.btnIncluirInverter.setEnabled(true);
        for (int ct = 0; ct < 5; ct++) {
            vetor[ct] = 0;
        }
    }//GEN-LAST:event_btnIniciarActionPerformed
    private void btnIncluirImparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirImparActionPerformed
        int numero;
        numero = Integer.valueOf(this.txtNumero.getText());
        /*for (int x = 0; x < 5; x++) {
            if (numero % 2 == 0) {
                numero = 0;
            }
            vetor[x] = numero;
            vetorString = vetorString + String.valueOf(vetor[x] + "-");
            this.txtVetor.setText(vetorString);
        }*/

        if ((numero % 2) == 0) {
            vetor[numElementos] = 0;
        } else {
            vetor[numElementos] = numero;
        }
        vetorString = vetorString + String.valueOf(vetor[numElementos]) + "-";
        this.txtVetor.setText(vetorString);
        numElementos++;
        this.txtNoElementos.setText((String.valueOf(numElementos)));
        if (numElementos == 5) {
            this.btnIncluirImpar.setEnabled(false);
        }
    }//GEN-LAST:event_btnIncluirImparActionPerformed

    private void btnIncluirInverterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirInverterActionPerformed
        int numero;
        numero = Integer.valueOf(this.txtNumero.getText());
        vetor[numElementos] = numero;
        vetorString = vetorString + String.valueOf(vetor[numElementos]) + "-";
        this.txtVetor.setText(vetorString);
        numElementos++;
        this.txtNoElementos.setText((String.valueOf(numElementos)));
        if (numElementos == 5) {
            this.btnIncluirInverter.setEnabled(false);
            vetorString = "";
            for (int ct = 4; ct >= 0; ct--) {
                vetorString = vetorString + String.valueOf(vetor[ct] + "");
            }
            this.txtVetorInvertido.setText(vetorString);
        }
    }//GEN-LAST:event_btnIncluirInverterActionPerformed

    private void btnIncluirParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirParesActionPerformed
        int numero;
        numero = Integer.valueOf(this.txtNumero.getText());
        vetor[numElementos] = numero;
        vetorString = vetorString + String.valueOf(vetor[numElementos]) + "-";
        this.txtVetor.setText(vetorString);
        numElementos++;
        this.txtNoElementos.setText((String.valueOf(numElementos)));
        int QtPares = 0;
        for (int x = 0; x <=4; x++) {
            if (vetor[x] % 2 == 0) {
                QtPares++;
            }
        }
        this.txtQtPares.setText(String.valueOf(QtPares));
    }//GEN-LAST:event_btnIncluirParesActionPerformed

    private void txtVetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVetorActionPerformed

    }//GEN-LAST:event_txtVetorActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Vetor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIncluirImpar;
    private javax.swing.JButton btnIncluirInverter;
    private javax.swing.JButton btnIncluirPares;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtNoElementos;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtQtPares;
    private javax.swing.JTextField txtVetor;
    private javax.swing.JTextField txtVetorInvertido;
    // End of variables declaration//GEN-END:variables
}
