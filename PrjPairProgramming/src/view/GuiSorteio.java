package view;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Desenvolvedor;
import model.Sorteio;

/**
 *
 * @author jullia
 */
public class GuiSorteio extends javax.swing.JFrame {

    public GuiSorteio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpXP = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rbtSenior = new javax.swing.JRadioButton();
        rbtPleno = new javax.swing.JRadioButton();
        rbtJunior = new javax.swing.JRadioButton();
        rbtEstagiario = new javax.swing.JRadioButton();
        txtNome = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnSortearPares = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPares = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstDevs = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sorteio Pair Programming");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Nome do Desenvolvedor:");

        jLabel2.setText("Nível de Experiência:");

        btnGrpXP.add(rbtSenior);
        rbtSenior.setText("Senior");

        btnGrpXP.add(rbtPleno);
        rbtPleno.setText("Pleno");

        btnGrpXP.add(rbtJunior);
        rbtJunior.setText("Junior");

        btnGrpXP.add(rbtEstagiario);
        rbtEstagiario.setText("Estagiario");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnSortearPares.setText("Sortear Par");
        btnSortearPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortearParesActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstPares);

        jLabel3.setText("Par:");

        jLabel4.setText("Lista de devs:");

        jScrollPane2.setViewportView(lstDevs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtJunior)
                                    .addComponent(rbtSenior))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtPleno)
                                    .addComponent(rbtEstagiario)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSortearPares, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rbtSenior)
                    .addComponent(rbtPleno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtJunior)
                    .addComponent(rbtEstagiario))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnSortearPares)
                    .addComponent(btnSair))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        if (rbtSenior.isSelected()) {
            devSenior.add(new Desenvolvedor(txtNome.getText(), rbtSenior.getText()));
        } else if (rbtPleno.isSelected()) {
            devPleno.add(new Desenvolvedor(txtNome.getText(), rbtPleno.getText()));
        } else if (rbtJunior.isSelected()) {
            devJunior.add(new Desenvolvedor(txtNome.getText(), rbtJunior.getText()));
        } else if (rbtEstagiario.isSelected()) {
            devEstagiario.add(new Desenvolvedor(txtNome.getText(), rbtEstagiario.getText()));
        }
        addItemsJListDevs(devSenior, devPleno, devJunior, devEstagiario);
        txtNome.setText("");
    }//GEN-LAST:event_btnCadastrarActionPerformed

    public void addItemsJListDevs(ArrayList<Desenvolvedor> devSenior, ArrayList<Desenvolvedor> devPleno,
            ArrayList<Desenvolvedor> devJunior, ArrayList<Desenvolvedor> devEstagiario) {
        DefaultListModel lista = new DefaultListModel();
        lstDevs.setModel(lista);
        for (int x = 0; x < devSenior.size(); x++) {
            lista.add(x, devSenior.get(x).getNome() + " - " + devSenior.get(x).getNivelXP());
        }
        for (int x = 0; x < devPleno.size(); x++) {
            lista.add(x, devPleno.get(x).getNome() + " - " + devPleno.get(x).getNivelXP());
        }
        for (int x = 0; x < devJunior.size(); x++) {
            lista.add(x, devJunior.get(x).getNome() + " - " + devJunior.get(x).getNivelXP());
        }
        for (int x = 0; x < devEstagiario.size(); x++) {
            lista.add(x, devEstagiario.get(x).getNome() + " - " + devEstagiario.get(x).getNivelXP());
        }
    }

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSortearParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortearParesActionPerformed

        String driver, nav = "";
        Sorteio sorteio = new Sorteio();
        DefaultListModel lista = new DefaultListModel();
        lstPares.setModel(lista);
        
        //sorteio do driver
        driver = sorteio.gerarDriver();

        if (driver.equals(rbtSenior.getText())) {
            //substituindo pelo nome da pessoa
            drivers.add(sorteio.sorteiaPessoa(devSenior));
            nav = sorteio.gerarParesSenior();
        } else if (driver.equals(rbtPleno.getText())) {
            drivers.add(sorteio.sorteiaPessoa(devPleno));
            nav = sorteio.gerarParesPleno();
        } else if (driver.equals(rbtJunior.getText())) {
            drivers.add(sorteio.sorteiaPessoa(devJunior));
            nav = sorteio.gerarParesJunior();
        } else if (driver.equals(rbtEstagiario.getText())) {
            drivers.add(sorteio.sorteiaPessoa(devEstagiario));
            nav = sorteio.gerarParesEstagiario();
        }

        //sorteio para quem será o navigator
        if (nav.equals(rbtSenior.getText())) {
            //colocando o nome do navigator
            navigators.add(sorteio.sorteiaPessoa(devSenior));
        } else if (nav.equals(rbtPleno.getText())) {
            navigators.add(sorteio.sorteiaPessoa(devPleno));
        } else if (nav.equals(rbtJunior.getText())) {
            navigators.add(sorteio.sorteiaPessoa(devJunior));
        } else if (nav.equals(rbtEstagiario.getText())) {
            navigators.add(sorteio.sorteiaPessoa(devEstagiario));
        }
        
        if (verificaPar(drivers.size()-1)) {
            lista.addElement(drivers.get(drivers.size()-1) + " e " + navigators.get(navigators.size()-1));
        } else {
            btnSortearParesActionPerformed(evt);
        }
    }//GEN-LAST:event_btnSortearParesActionPerformed

    public boolean verificaPar(int x) {
        if (x > 0) {
            if ((drivers.get(x).equals(navigators.get(x))) || ((drivers.get(x).equals(drivers.get(x - 1))
                    && navigators.get(x).equals(navigators.get(x - 1)))
                    || (drivers.get(x).equals(navigators.get(x - 1))
                    && navigators.get(x).equals(drivers.get(x - 1))))) {
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }

    }

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
            java.util.logging.Logger.getLogger(GuiSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiSorteio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.ButtonGroup btnGrpXP;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSortearPares;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lstDevs;
    private javax.swing.JList<String> lstPares;
    private javax.swing.JRadioButton rbtEstagiario;
    private javax.swing.JRadioButton rbtJunior;
    private javax.swing.JRadioButton rbtPleno;
    private javax.swing.JRadioButton rbtSenior;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
    private ArrayList<String> drivers = new ArrayList<String>();
    private ArrayList<String> navigators = new ArrayList<String>();
    private ArrayList<Desenvolvedor> devSenior = new ArrayList<Desenvolvedor>();
    private ArrayList<Desenvolvedor> devPleno = new ArrayList<Desenvolvedor>();
    private ArrayList<Desenvolvedor> devJunior = new ArrayList<Desenvolvedor>();
    private ArrayList<Desenvolvedor> devEstagiario = new ArrayList<Desenvolvedor>();
}
