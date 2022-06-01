/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI.Commandes;

import Commandes.Commandes;
import GUI.Atelier;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
/**
 *
 * @author matteoarnone
 */
public class ReceptionCommandes extends javax.swing.JDialog {

    private final Atelier Parent;
    
    /**
     * Creates new form PriseEnCharge
     * @param parent
     * @param modal
     */
    public ReceptionCommandes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //On récupère la ref vers le parent
        Parent = (Atelier) parent;
        RefreshTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Label_TravauxAttente = new javax.swing.JLabel();
        Bouton_OK = new javax.swing.JButton();
        jComboBox_Commandes = new javax.swing.JComboBox<>();
        Bouton_KO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        Label_TravauxAttente.setText("Listes Commandes en Cours:");

        Bouton_OK.setText("Supprimer");
        Bouton_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton_OKActionPerformed(evt);
            }
        });

        jComboBox_Commandes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Bouton_KO.setText("Annuler");
        Bouton_KO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton_KOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_TravauxAttente)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox_Commandes, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(Bouton_OK)
                        .addGap(59, 59, 59)
                        .addComponent(Bouton_KO, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_TravauxAttente)
                .addGap(18, 18, 18)
                .addComponent(jComboBox_Commandes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bouton_OK)
                    .addComponent(Bouton_KO))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("UnusedAssignment")
    private void Bouton_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton_OKActionPerformed
        Commandes cmd = (Commandes)jComboBox_Commandes.getModel().getSelectedItem();
        if(cmd == null){
            JOptionPane.showMessageDialog(this,"Veuillez sélectionner une commande a supprimer.","Erreur", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Parent.getContainer().getListeCommandes().remove(cmd);
        this.RefreshTable();
        Parent.SaveContainer();
        
    }//GEN-LAST:event_Bouton_OKActionPerformed

    private void Bouton_KOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton_KOActionPerformed
        this.dispose();
    }//GEN-LAST:event_Bouton_KOActionPerformed

    public void RefreshTable()
    {
        //On récupère le modèle de la table
        DefaultComboBoxModel model = (DefaultComboBoxModel) jComboBox_Commandes.getModel();
        //Supprime les anciens Row
        model.removeAllElements();
        
        for(int i = 0 ; i < Parent.getContainer().getListeCommandes().size() ; i++)
        {
            model.addElement( Parent.getContainer().getListeCommandes().get(i));
        }
        jComboBox_Commandes.setModel(model);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bouton_KO;
    private javax.swing.JButton Bouton_OK;
    private javax.swing.JLabel Label_TravauxAttente;
    private javax.swing.JComboBox<String> jComboBox_Commandes;
    // End of variables declaration//GEN-END:variables
}