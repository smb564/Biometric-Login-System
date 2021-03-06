package biometricsecurity.view;

import biometricsecurity.controller.MainController;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Supun
 */
public class KeyStrokeTrainDialog extends javax.swing.JDialog {

    private MainController controller;
    private String sentence;
    
    // Current position of the sentence
    private int currentPos;
    private long lastTime;
    private double[] times;
    private boolean completed;
    
    /**
     * Creates new form KeyStrokeTrainDialog
     * @param parent
     * @param modal
     * @param controller
     */
    public KeyStrokeTrainDialog(java.awt.Frame parent, boolean modal, MainController controller, String sentence) {
        super(parent, modal);
        initComponents();
        errorLbl.setVisible(false);
        this.sentence = sentence;
        currentPos = 0;
        completed = false;
        txtLbl.setText("");
        this.controller = controller;
        times = new double[sentence.length()-1];
        sentenceLbl.setText(sentence);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((int) (dim.width/2-this.getSize().getWidth()/2), (int) (dim.height/2 - this.getSize().getHeight()/2));
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
        sentenceLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInput = new javax.swing.JTextArea();
        btnSubmit = new javax.swing.JButton();
        btnRetry = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        errorLbl = new javax.swing.JLabel();
        txtLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Train Model");

        jLabel1.setText("Type the following sentence using your usual typing speed");

        sentenceLbl.setText("<<Sentence>>");

        txtInput.setColumns(20);
        txtInput.setRows(5);
        txtInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInputKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtInput);

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnRetry.setText("Retry");
        btnRetry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetryActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        errorLbl.setForeground(new java.awt.Color(255, 0, 0));
        errorLbl.setText("Please click submit button to submit the results. Or press retry.");

        txtLbl.setForeground(new java.awt.Color(255, 0, 0));
        txtLbl.setText("Text");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRetry, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sentenceLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(errorLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(sentenceLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLbl)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLbl)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetry, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInputKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInputKeyTyped
        if (currentPos == sentence.length()){
            txtInput.setText("");
            return;
        }
        
        if (evt.getKeyChar() == sentence.charAt(currentPos)){
            if (currentPos == 0){
                lastTime = System.currentTimeMillis();
                currentPos ++;
            }else{
                times[currentPos-1] = System.currentTimeMillis() - lastTime;
                lastTime = System.currentTimeMillis();
                currentPos++;
            }
            txtLbl.setText(sentence.substring(0, currentPos));
        }
        
        if (currentPos == sentence.length()){
            JOptionPane.showMessageDialog(this, "Data successfully recorded.", "Success", JOptionPane.INFORMATION_MESSAGE);
            completed = true;
            errorLbl.setVisible(true);
            return;
        }
    }//GEN-LAST:event_txtInputKeyTyped

    private void btnRetryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetryActionPerformed
        currentPos = 0;
        txtInput.setText("");
        txtLbl.setText("");
        errorLbl.setVisible(false);
        completed = false;
    }//GEN-LAST:event_btnRetryActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        if (!completed){
            JOptionPane.showMessageDialog(this, "You have to complete typing the sentence. A pop up dialog will appear after completion.");
            return ;
        }
        controller.updateCurrentDataSet(sentence, times);
        this.dispose();
    }//GEN-LAST:event_btnSubmitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRetry;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel errorLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel sentenceLbl;
    private javax.swing.JTextArea txtInput;
    private javax.swing.JLabel txtLbl;
    // End of variables declaration//GEN-END:variables
}
