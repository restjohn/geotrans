// CLASSIFICATION: UNCLASSIFIED
package mspccs_spreadsheet_tester.gui;



import mspccs_spreadsheet_tester.utility.Directory;


/*
 * FilePanel.java
 *
 * Created on October 30, 2002, 11:03 AM
 */

/**
 *
 * @author  amyc
 */
public class FilePanel extends javax.swing.JPanel {

    private Directory currentDir;
    /** Creates new form FilePanel */
    public FilePanel(String label, Directory _currentDir) {
        currentDir = _currentDir;
        
        initComponents();
        fileLabel.setText(label + ":");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    fileLabel = new javax.swing.JLabel();
    fileTextField = new javax.swing.JTextField();
    fileDirButton = new javax.swing.JButton();

    setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0))));
    setMinimumSize(new java.awt.Dimension(406, 64));
    setPreferredSize(new java.awt.Dimension(406, 64));
    setLayout(new java.awt.GridBagLayout());

    fileLabel.setText("File:");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(1, 0, 1, 6);
    add(fileLabel, gridBagConstraints);

    fileTextField.setEditable(false);
    fileTextField.setToolTipText("Absolute path and file name.");
    fileTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    fileTextField.setMaximumSize(new java.awt.Dimension(250, 20));
    fileTextField.setMinimumSize(new java.awt.Dimension(250, 20));
    fileTextField.setPreferredSize(new java.awt.Dimension(250, 20));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(1, 6, 1, 3);
    add(fileTextField, gridBagConstraints);

    fileDirButton.setText("...");
    fileDirButton.setToolTipText("Select a file.");
    fileDirButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
    fileDirButton.setMaximumSize(new java.awt.Dimension(20, 20));
    fileDirButton.setMinimumSize(new java.awt.Dimension(20, 20));
    fileDirButton.setPreferredSize(new java.awt.Dimension(20, 20));
    fileDirButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        fileDirButtonActionPerformed(evt);
      }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.ipadx = 10;
    gridBagConstraints.insets = new java.awt.Insets(1, 3, 1, 0);
    add(fileDirButton, gridBagConstraints);
  }// </editor-fold>//GEN-END:initComponents

    private void fileDirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileDirButtonActionPerformed
      javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser(currentDir.getDirectory());

      fileChooser.setFileSelectionMode(javax.swing.JFileChooser.FILES_ONLY);
      int state = fileChooser.showOpenDialog(this);
      if (state == javax.swing.JFileChooser.APPROVE_OPTION)
      {
          java.io.File fileName = fileChooser.getSelectedFile();
          currentDir.setDirectory(fileName.getParentFile().getAbsolutePath());
          fileTextField.setText(fileName.getAbsolutePath());
          fileTextField.setCaretPosition(0);
      }
    }//GEN-LAST:event_fileDirButtonActionPerformed

    public String getFileName()
    {
        return fileTextField.getText();
    }

    public Directory getCurrentDir()
    {
      return currentDir;
    }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton fileDirButton;
  private javax.swing.JLabel fileLabel;
  private javax.swing.JTextField fileTextField;
  // End of variables declaration//GEN-END:variables

}
// CLASSIFICATION: UNCLASSIFIED
