/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI.Commandes;

import Commandes.Commandes;
import GUI.Atelier;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author matteoarnone
 */
public class CommandesHistoriques extends javax.swing.JDialog {

    private final Atelier Parent;
    
    /**
     * Creates new form PriseEnCharge
     * @param parent
     * @param modal
     */
    public CommandesHistoriques(java.awt.Frame parent, boolean modal) {
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
        Scroll_TableListeTravaux = new javax.swing.JScrollPane();
        Table_Commandes = new javax.swing.JTable();
        Bouton_OK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Label_TravauxAttente.setText("Listes Commandes en Cours:");

        Table_Commandes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nom Produit", "Type Produit", "Quantitée"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Scroll_TableListeTravaux.setViewportView(Table_Commandes);

        Bouton_OK.setText("OK");
        Bouton_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bouton_OKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Label_TravauxAttente))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(Bouton_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(Scroll_TableListeTravaux, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Label_TravauxAttente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Scroll_TableListeTravaux, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bouton_OK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("UnusedAssignment")
    private void Bouton_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bouton_OKActionPerformed
        this.dispose();
    }//GEN-LAST:event_Bouton_OKActionPerformed

    public void RefreshTable()
    {
        //On récupère le modèle de la table
        DefaultTableModel model = (DefaultTableModel) Table_Commandes.getModel();
        for(int i = 0 ; i < Parent.getContainer().getListeCommandes().size() ; i++)
        {
            Commandes cmd = (Commandes) Parent.getContainer().getListeCommandes().get(i);
            System.out.println(cmd);
            
            Vector vec= new Vector();

            vec.add(cmd.getLibellé());
            vec.add(cmd.getType());
            vec.add(cmd.getQuantité());
            
            System.out.println(vec);
            model.addRow(vec);
        }
        
        Table_Commandes.setModel(model);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bouton_OK;
    private javax.swing.JLabel Label_TravauxAttente;
    private javax.swing.JScrollPane Scroll_TableListeTravaux;
    private javax.swing.JTable Table_Commandes;
    // End of variables declaration//GEN-END:variables
}