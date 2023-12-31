/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.Iterator;
import java.util.Stack;
import javax.swing.JFrame;
import mal.Messages;
import mal.User;

/**
 *
 * @author ammar
 */
public class Inbox extends javax.swing.JFrame {

    /**
     * Creates new form Inbox
     */
    
    String currentUser;
    JFrame parentFrame;
    
    public Inbox(JFrame parentFrame ,String currentUser) {
        System.out.println("Inbox Contructor");
        this.currentUser = currentUser;
        this.parentFrame = parentFrame;
        
        System.out.println("Parent frame is: " + parentFrame.getClass().getName());
        
        initComponents();
        
        System.out.println("Stack area");
        Stack<Messages> stack = User.users.get(currentUser).inbox.inboxStack;
        String[] strings = new String[stack.size()];
        
        title.setText(stack.size() + " Messages");
        
        for(int i = stack.size()-1; i >= 0; i--){
            strings[i] = stack.get(i).text;
        }
        
        inboxList.setModel(new javax.swing.AbstractListModel<String>() {
           // String[] strings = { "Ali", "Ammar", "labwa", "maryam sara", "ibrahim", "nimra", "ira", "liza", "iris" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        
        
        System.out.println("After stack");
        
        
        //populateInbox(currentUser);
    }
    
    /*
    public void populateInbox(String current){
        
        
        
        Stack<Messages> stack = User.users.get(current).inbox.inboxStack;
        String[] strings = new String[stack.size()];
        int size = stack.size();
        for(int i = 0; i < size; i++)
            strings[i] = stack.pop().text;
        
        inboxList.setModel(new javax.swing.AbstractListModel<String>() {
           // String[] strings = { "Ali", "Ammar", "labwa", "maryam sara", "ibrahim", "nimra", "ira", "liza", "iris" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        
        
        title.setText("You got (" +  strings.length + ") Messages");
    }
    
    */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inboxList = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        textDetail = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-right-arrow-64.png"))); // NOI18N
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        back.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                backKeyPressed(evt);
            }
        });

        title.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        title.setText("0 Messages");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-chat-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        inboxList.setFont(new java.awt.Font("Product Sans", 0, 14)); // NOI18N
        inboxList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        inboxList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                inboxListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(inboxList);

        textDetail.setEditable(false);
        textDetail.setColumns(20);
        textDetail.setFont(new java.awt.Font("Product Sans", 0, 18)); // NOI18N
        textDetail.setLineWrap(true);
        textDetail.setRows(5);
        textDetail.setText("Sent By\nMessage...................");
        jScrollPane3.setViewportView(textDetail);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_backKeyPressed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
      if( parentFrame.getClass().getName().equals("gui.Newsfeed")){
          
        Newsfeed r = new Newsfeed(User.users.get(currentUser));
        //start r = new start();
            r.setVisible(true);
            r.pack();
            r.setLocationRelativeTo(null);
            r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
      }
      else{
       MyProfile r = new MyProfile(User.users.get(currentUser));
            r.setVisible(true);
            r.pack();
            r.setLocationRelativeTo(null);
            r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dispose();
            }
        
    }//GEN-LAST:event_backMouseClicked

    private void inboxListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_inboxListValueChanged
        // TODO add your handling code here:
        Stack<Messages> stack = User.users.get(currentUser).inbox.inboxStack;
        User[] strings = new User[stack.size()];
        String[] textx = new String[stack.size()];
        
        for(int i = 0; i < stack.size() ;i++){
            strings[i] = stack.get(i).sender;
            textx[i] = stack.get(i).text;
        }
        
        
        
        if (!evt.getValueIsAdjusting()) {
            String text = "";
            text += "Sent by: " + strings[inboxList.getSelectedIndex()].name + "\n";
            text += textx[inboxList.getSelectedIndex()];
            
            textDetail.setText(text);
        }
        
        
        
    }//GEN-LAST:event_inboxListValueChanged

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
            java.util.logging.Logger.getLogger(Inbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inbox().setVisible(true);
            }
        });
*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JList<String> inboxList;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea textDetail;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
