// CLASSIFICATION: UNCLASSIFIED

/*
 * _3ParamDatumPanel.java
 *
 * Created on March 27, 2008, 4:57 PM
 */

package geotrans3.gui;


import geotrans3.enumerations.DatumType;
import geotrans3.enumerations.ListType;
import geotrans3.exception.CoordinateConversionException;
import geotrans3.jni.JNIDatumLibrary;
import geotrans3.jni.JNIEllipsoidLibrary;
import geotrans3.jni.FillList;
import geotrans3.misc.Info;
import geotrans3.misc.StringHandler;
import geotrans3.utility.Platform;


/**
 *
 * @author  comstam
 */
public class _3ParamDatumPanel extends javax.swing.JPanel
{
///  private JNICoordinateConversionService jniCoordinateConversionService;
  private JNIDatumLibrary jniDatumLibrary;
  private JNIEllipsoidLibrary jniEllipsoidLibrary;


  /**
   * Creates new form _3ParamDatumPanel
   */
  public _3ParamDatumPanel(JNIDatumLibrary _jniDatumLibrary, JNIEllipsoidLibrary _jniEllipsoidLibrary) throws CoordinateConversionException
  {
///    jniCoordinateConversionService = _jniCoordinateConversionService;
    jniDatumLibrary = _jniDatumLibrary;
    jniEllipsoidLibrary = _jniEllipsoidLibrary;
    
    initComponents();
    new FillList(jniDatumLibrary, jniEllipsoidLibrary, ellipsoidComboBox, ListType.ELLIPSOID);

    if (Platform.isUnix)
    {
        datumCodeLabel.setFont(new java.awt.Font("Dialog", 1, 10));
        datumNameLabel.setFont(new java.awt.Font("Dialog", 1, 10));
        ellipsoidLabel.setFont(new java.awt.Font("Dialog", 1, 10));
        datumShiftLabel.setFont(new java.awt.Font("Dialog", 1, 10));
        deltaXLabel.setFont(new java.awt.Font("Dialog", 1, 10));
        deltaYLabel.setFont(new java.awt.Font("Dialog", 1, 10));
        deltaZLabel.setFont(new java.awt.Font("Dialog", 1, 10));
        sigmaXLabel.setFont(new java.awt.Font("Dialog", 1, 10));
        sigmaYLabel.setFont(new java.awt.Font("Dialog", 1, 10));
        sigmaZLabel.setFont(new java.awt.Font("Dialog", 1, 10));
        validDomainLabel.setFont(new java.awt.Font("Dialog", 1, 10));
        northLatLabel.setFont(new java.awt.Font("Dialog", 1, 10));
        westLonLabel.setFont(new java.awt.Font("Dialog", 1, 10));
        eastLonLabel.setFont(new java.awt.Font("Dialog", 1, 10));
        southLatLabel.setFont(new java.awt.Font("Dialog", 1, 10));
        ellipsoidComboBox.setFont(new java.awt.Font("Dialog", 1, 10));
    }

  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
  private void initComponents()
  {
    java.awt.GridBagConstraints gridBagConstraints;

    createDatumPanel = new javax.swing.JPanel();
    datumPanel = new javax.swing.JPanel();
    datumCodeLabel = new javax.swing.JLabel();
    datumNameLabel = new javax.swing.JLabel();
    datumCodeTextField = new javax.swing.JTextField();
    datumNameTextField = new javax.swing.JTextField();
    selectEllipsoidPanel = new javax.swing.JPanel();
    ellipsoidLabel = new javax.swing.JLabel();
    ellipsoidComboBox = new javax.swing.JComboBox();
    datumShiftLabel = new javax.swing.JLabel();
    deltaPanel = new javax.swing.JPanel();
    deltaXLabel = new javax.swing.JLabel();
    deltaYLabel = new javax.swing.JLabel();
    deltaZLabel = new javax.swing.JLabel();
    deltaXTextField = new javax.swing.JTextField();
    deltaYTextField = new javax.swing.JTextField();
    deltaZTextField = new javax.swing.JTextField();
    stdErrPanel = new javax.swing.JPanel();
    sigmaXLabel = new javax.swing.JLabel();
    sigmaYLabel = new javax.swing.JLabel();
    sigmaZLabel = new javax.swing.JLabel();
    sigmaXTextField = new javax.swing.JTextField();
    sigmaYTextField = new javax.swing.JTextField();
    sigmaZTextField = new javax.swing.JTextField();
    validDomainLabel = new javax.swing.JLabel();
    domainAPanel = new javax.swing.JPanel();
    northLatLabel = new javax.swing.JLabel();
    westLonLabel = new javax.swing.JLabel();
    northLatTextField = new javax.swing.JTextField();
    eastLonLabel = new javax.swing.JLabel();
    domainBPanel = new javax.swing.JPanel();
    westLonTextField = new javax.swing.JTextField();
    southLatLabel = new javax.swing.JLabel();
    eastLonTextField = new javax.swing.JTextField();
    southLatTextField = new javax.swing.JTextField();

    setLayout(new java.awt.GridBagLayout());

    createDatumPanel.setLayout(new java.awt.GridBagLayout());

    createDatumPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 18, 0, 18));
    createDatumPanel.setMaximumSize(new java.awt.Dimension(430, 500));
    createDatumPanel.setMinimumSize(new java.awt.Dimension(430, 200));
    datumPanel.setLayout(new java.awt.GridBagLayout());

    datumCodeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    datumCodeLabel.setText("Code:");
    datumCodeLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
    datumPanel.add(datumCodeLabel, gridBagConstraints);

    datumNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    datumNameLabel.setText("Name:");
    datumNameLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    datumPanel.add(datumNameLabel, gridBagConstraints);

    datumCodeTextField.setText("WGE");
    datumCodeTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    datumCodeTextField.setMinimumSize(new java.awt.Dimension(179, 19));
    datumCodeTextField.setPreferredSize(new java.awt.Dimension(179, 19));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
    datumPanel.add(datumCodeTextField, gridBagConstraints);

    datumNameTextField.setText("World Geodetic System  1984");
    datumNameTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    datumNameTextField.setMinimumSize(new java.awt.Dimension(179, 19));
    datumNameTextField.setPreferredSize(new java.awt.Dimension(179, 19));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    datumPanel.add(datumNameTextField, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    createDatumPanel.add(datumPanel, gridBagConstraints);

    selectEllipsoidPanel.setLayout(new java.awt.GridBagLayout());

    ellipsoidLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    ellipsoidLabel.setText("Ellipsoid:");
    ellipsoidLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    selectEllipsoidPanel.add(ellipsoidLabel, gridBagConstraints);

    ellipsoidComboBox.setMaximumSize(new java.awt.Dimension(400, 25));
    ellipsoidComboBox.setMinimumSize(new java.awt.Dimension(126, 8));
    ellipsoidComboBox.setPreferredSize(new java.awt.Dimension(250, 22));
    ellipsoidComboBox.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        ellipsoidComboBoxActionPerformed(evt);
      }
    });

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    selectEllipsoidPanel.add(ellipsoidComboBox, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(4, 0, 0, 0);
    createDatumPanel.add(selectEllipsoidPanel, gridBagConstraints);

    datumShiftLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    datumShiftLabel.setText("Datum Shift to WGS84");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
    createDatumPanel.add(datumShiftLabel, gridBagConstraints);

    deltaPanel.setLayout(new java.awt.GridBagLayout());

    deltaPanel.setPreferredSize(new java.awt.Dimension(220, 68));
    deltaXLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    deltaXLabel.setText("Delta X (m):");
    deltaXLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 12);
    deltaPanel.add(deltaXLabel, gridBagConstraints);

    deltaYLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    deltaYLabel.setText(" Delta Y (m):");
    deltaYLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 12);
    deltaPanel.add(deltaYLabel, gridBagConstraints);

    deltaZLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    deltaZLabel.setText("Delta Z (m):");
    deltaZLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    deltaPanel.add(deltaZLabel, gridBagConstraints);

    deltaXTextField.setText("0");
    deltaXTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    deltaXTextField.setMinimumSize(new java.awt.Dimension(115, 19));
    deltaXTextField.setPreferredSize(new java.awt.Dimension(115, 19));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 12);
    deltaPanel.add(deltaXTextField, gridBagConstraints);

    deltaYTextField.setText("0");
    deltaYTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    deltaYTextField.setMinimumSize(new java.awt.Dimension(115, 19));
    deltaYTextField.setPreferredSize(new java.awt.Dimension(115, 19));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 12);
    deltaPanel.add(deltaYTextField, gridBagConstraints);

    deltaZTextField.setText("0");
    deltaZTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    deltaZTextField.setMinimumSize(new java.awt.Dimension(115, 19));
    deltaZTextField.setPreferredSize(new java.awt.Dimension(115, 19));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    deltaPanel.add(deltaZTextField, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    createDatumPanel.add(deltaPanel, gridBagConstraints);

    stdErrPanel.setLayout(new java.awt.GridBagLayout());

    sigmaXLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    sigmaXLabel.setText("Std. Err in X (m):");
    sigmaXLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 12);
    stdErrPanel.add(sigmaXLabel, gridBagConstraints);

    sigmaYLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    sigmaYLabel.setText("Std. Err in Y (m):");
    sigmaYLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 12);
    stdErrPanel.add(sigmaYLabel, gridBagConstraints);

    sigmaZLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    sigmaZLabel.setText("Std. Err in Z (m):");
    sigmaZLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    stdErrPanel.add(sigmaZLabel, gridBagConstraints);

    sigmaXTextField.setText("-1");
    sigmaXTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    sigmaXTextField.setMinimumSize(new java.awt.Dimension(115, 19));
    sigmaXTextField.setPreferredSize(new java.awt.Dimension(115, 19));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 12);
    stdErrPanel.add(sigmaXTextField, gridBagConstraints);

    sigmaYTextField.setText("-1");
    sigmaYTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    sigmaYTextField.setMinimumSize(new java.awt.Dimension(115, 19));
    sigmaYTextField.setPreferredSize(new java.awt.Dimension(115, 19));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 12);
    stdErrPanel.add(sigmaYTextField, gridBagConstraints);

    sigmaZTextField.setText("-1");
    sigmaZTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    sigmaZTextField.setMinimumSize(new java.awt.Dimension(115, 19));
    sigmaZTextField.setPreferredSize(new java.awt.Dimension(115, 19));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    stdErrPanel.add(sigmaZTextField, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    createDatumPanel.add(stdErrPanel, gridBagConstraints);

    validDomainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    validDomainLabel.setText("Valid Domain");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
    createDatumPanel.add(validDomainLabel, gridBagConstraints);

    domainAPanel.setLayout(new java.awt.GridBagLayout());

    northLatLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    northLatLabel.setText("Northern Latitude:");
    northLatLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 12);
    domainAPanel.add(northLatLabel, gridBagConstraints);

    westLonLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    westLonLabel.setText("Western Longitude:");
    westLonLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
    westLonLabel.setMaximumSize(new java.awt.Dimension(115, 15));
    westLonLabel.setMinimumSize(new java.awt.Dimension(115, 15));
    westLonLabel.setOpaque(true);
    westLonLabel.setPreferredSize(new java.awt.Dimension(115, 15));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 12);
    domainAPanel.add(westLonLabel, gridBagConstraints);

    northLatTextField.setText("90 00 00.0N");
    northLatTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    northLatTextField.setMinimumSize(new java.awt.Dimension(115, 19));
    northLatTextField.setPreferredSize(new java.awt.Dimension(115, 19));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 12);
    domainAPanel.add(northLatTextField, gridBagConstraints);

    eastLonLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    eastLonLabel.setText("Eastern Longitude:");
    eastLonLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
    eastLonLabel.setMaximumSize(new java.awt.Dimension(115, 15));
    eastLonLabel.setMinimumSize(new java.awt.Dimension(115, 15));
    eastLonLabel.setPreferredSize(new java.awt.Dimension(115, 15));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    domainAPanel.add(eastLonLabel, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
    createDatumPanel.add(domainAPanel, gridBagConstraints);

    domainBPanel.setLayout(new java.awt.GridBagLayout());

    westLonTextField.setText("180 00 00.0W");
    westLonTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    westLonTextField.setMinimumSize(new java.awt.Dimension(115, 19));
    westLonTextField.setPreferredSize(new java.awt.Dimension(115, 19));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 12);
    domainBPanel.add(westLonTextField, gridBagConstraints);

    southLatLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    southLatLabel.setText("Southern Latitude:");
    southLatLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
    southLatLabel.setMaximumSize(new java.awt.Dimension(115, 15));
    southLatLabel.setMinimumSize(new java.awt.Dimension(115, 15));
    southLatLabel.setPreferredSize(new java.awt.Dimension(115, 15));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 12);
    domainBPanel.add(southLatLabel, gridBagConstraints);

    eastLonTextField.setText("180 00 00.0E");
    eastLonTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    eastLonTextField.setMinimumSize(new java.awt.Dimension(115, 19));
    eastLonTextField.setPreferredSize(new java.awt.Dimension(115, 19));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    domainBPanel.add(eastLonTextField, gridBagConstraints);

    southLatTextField.setText("90 00 00.0S");
    southLatTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    southLatTextField.setMinimumSize(new java.awt.Dimension(115, 19));
    southLatTextField.setPreferredSize(new java.awt.Dimension(115, 19));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 12);
    domainBPanel.add(southLatTextField, gridBagConstraints);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 7;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    createDatumPanel.add(domainBPanel, gridBagConstraints);

    add(createDatumPanel, new java.awt.GridBagConstraints());

  }// </editor-fold>//GEN-END:initComponents

  private void ellipsoidComboBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ellipsoidComboBoxActionPerformed
  {//GEN-HEADEREND:event_ellipsoidComboBoxActionPerformed
      ellipsoidComboBox.getSelectedIndex();
  }//GEN-LAST:event_ellipsoidComboBoxActionPerformed
public boolean createDatum()
{
    StringHandler stringHandler = new StringHandler();

    double deltaX = stringHandler.stringToDouble(deltaXTextField.getText().trim(), "Invalid Delta X");
    double deltaY = stringHandler.stringToDouble(deltaYTextField.getText().trim(), "Invalid Delta Y");
    double deltaZ = stringHandler.stringToDouble(deltaZTextField.getText().trim(), "Invalid Delta Z");
    double sigmaX = stringHandler.stringToDouble(sigmaXTextField.getText().trim(), "Invalid Std. Error in X");
    double sigmaY = stringHandler.stringToDouble(sigmaYTextField.getText().trim(), "Invalid Std. Error in Y");
    double sigmaZ = stringHandler.stringToDouble(sigmaZTextField.getText().trim(), "Invalid Std. Error in Z");
    double southLat = stringHandler.stringToLatitude(southLatTextField.getText().trim(), "Invalid Southern Latitude");
    double northLat = stringHandler.stringToLatitude(northLatTextField.getText().trim(), "Invalid Northern Latitude");
    double westLon = stringHandler.stringToLongitude(westLonTextField.getText().trim(), "Invalid Western Longitude");
    double eastLon = stringHandler.stringToLongitude(eastLonTextField.getText().trim(), "Invalid Eastern Longitude");

    if(stringHandler.getError())
    {
        stringHandler.displayErrorMsg(this);
    }
    else
    {
        try
        {
          Info ellipsoidInfo = jniEllipsoidLibrary.getEllipsoidInfo(ellipsoidComboBox.getSelectedIndex());
          jniDatumLibrary.defineDatum(DatumType.threeParamDatum, datumCodeTextField.getText().trim(), datumNameTextField.getText().trim(),
                                     ellipsoidInfo.getCode(),
                                     deltaX, deltaY, deltaZ, sigmaX, sigmaY, sigmaZ, westLon, eastLon, southLat, northLat,
                                     0.0, 0.0, 0.0, 0.0);
          return true;
        }
        catch(CoordinateConversionException e)
        {
            stringHandler.displayErrorMsg(this, e.getMessage());
        }
    }
    
    return false;
}

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel createDatumPanel;
  private javax.swing.JLabel datumCodeLabel;
  private javax.swing.JTextField datumCodeTextField;
  private javax.swing.JLabel datumNameLabel;
  private javax.swing.JTextField datumNameTextField;
  private javax.swing.JPanel datumPanel;
  private javax.swing.JLabel datumShiftLabel;
  private javax.swing.JPanel deltaPanel;
  private javax.swing.JLabel deltaXLabel;
  private javax.swing.JTextField deltaXTextField;
  private javax.swing.JLabel deltaYLabel;
  private javax.swing.JTextField deltaYTextField;
  private javax.swing.JLabel deltaZLabel;
  private javax.swing.JTextField deltaZTextField;
  private javax.swing.JPanel domainAPanel;
  private javax.swing.JPanel domainBPanel;
  private javax.swing.JLabel eastLonLabel;
  private javax.swing.JTextField eastLonTextField;
  private javax.swing.JComboBox ellipsoidComboBox;
  private javax.swing.JLabel ellipsoidLabel;
  private javax.swing.JLabel northLatLabel;
  private javax.swing.JTextField northLatTextField;
  private javax.swing.JPanel selectEllipsoidPanel;
  private javax.swing.JLabel sigmaXLabel;
  private javax.swing.JTextField sigmaXTextField;
  private javax.swing.JLabel sigmaYLabel;
  private javax.swing.JTextField sigmaYTextField;
  private javax.swing.JLabel sigmaZLabel;
  private javax.swing.JTextField sigmaZTextField;
  private javax.swing.JLabel southLatLabel;
  private javax.swing.JTextField southLatTextField;
  private javax.swing.JPanel stdErrPanel;
  private javax.swing.JLabel validDomainLabel;
  private javax.swing.JLabel westLonLabel;
  private javax.swing.JTextField westLonTextField;
  // End of variables declaration//GEN-END:variables

}

// CLASSIFICATION: UNCLASSIFIED
