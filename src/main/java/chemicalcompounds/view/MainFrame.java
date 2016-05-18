package chemicalcompounds.view;

public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lR = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lL = new javax.swing.JLabel();
        bPrev = new javax.swing.JButton();
        bNext = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbWith = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfEC = new javax.swing.JTextField();
        tfCasNum = new javax.swing.JTextField();
        cbRegType = new javax.swing.JComboBox();
        cbTotalTonnageBand = new javax.swing.JComboBox();
        cbSubType = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "id", "Name", "EC / List Number", "Cas Number", "Registration Type", "Submission Type", "Total tonnage Band"
                }
        ));
        jScrollPane1.setViewportView(jTable1);

        lR.setText("0");

        jLabel2.setText("z");

        lL.setText("0");

        bPrev.setText("<");

        bNext.setText(">");

        jLabel4.setText("Ilość rekordów na stronie: ");

        cbWith.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "25", "50", "75", "100", "150", "200" }));
        cbWith.setSelectedIndex(1);

        jButton3.setText("Wyjście");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Name:");

        jLabel6.setText("EC / List Number:");

        jLabel7.setText("Cas Number:");

        jLabel8.setText("Registration Type:");

        jLabel9.setText("Submission Type:");

        jLabel10.setText("Total tonnage Band:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tfName)
                                        .addComponent(tfEC)
                                        .addComponent(tfCasNum)
                                        .addComponent(cbRegType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbTotalTonnageBand, javax.swing.GroupLayout.Alignment.TRAILING, 0, 137, Short.MAX_VALUE)
                                        .addComponent(cbSubType, 0, 137, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbWith, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(bPrev)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lR)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lL)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(bNext)
                                                .addGap(256, 256, 256)
                                                .addComponent(jButton3)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(tfEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(24, 24, 24)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(tfCasNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(cbRegType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel9)
                                                                        .addComponent(cbSubType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(35, 35, 35)
                                                                .addComponent(jLabel10))
                                                        .addComponent(cbTotalTonnageBand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lR)
                                        .addComponent(jLabel2)
                                        .addComponent(lL)
                                        .addComponent(bPrev)
                                        .addComponent(bNext)
                                        .addComponent(jLabel4)
                                        .addComponent(cbWith, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    // Variables declaration - do not modify
    private javax.swing.JButton bNext;
    private javax.swing.JButton bPrev;
    private javax.swing.JComboBox cbRegType;
    private javax.swing.JComboBox cbSubType;
    private javax.swing.JComboBox cbTotalTonnageBand;
    private javax.swing.JComboBox cbWith;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lL;
    private javax.swing.JLabel lR;
    private javax.swing.JTextField tfCasNum;
    private javax.swing.JTextField tfEC;
    private javax.swing.JTextField tfName;
    // End of variables declaration
}
