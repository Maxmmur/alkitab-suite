/* This work has been placed into the public domain. */

package kiyut.alkitab.bookviewer;

import java.awt.Component;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ResourceBundle;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import kiyut.alkitab.options.BookViewerOptions;

/**
 * Search Panel
 * 
 * @author Tonny Kohar <tonny.kohar@gmail.com>
 */
public class SearchPane extends javax.swing.JPanel {
    
    protected ResourceBundle bundle = ResourceBundle.getBundle(this.getClass().getName());    
    
    protected boolean ranked;
    protected int searchLimit;
    
    /** Creates new SearchPane */
    public SearchPane() {
        initComponents();
        initCustom();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        phraseField = new javax.swing.JTextField();
        includesField = new javax.swing.JTextField();
        excludesField = new javax.swing.JTextField();
        spellingField = new javax.swing.JTextField();
        startWithField = new javax.swing.JTextField();
        rankedCheckBox = new javax.swing.JCheckBox();
        searchLimitSlider = new javax.swing.JSlider();
        rangeCheckBox = new javax.swing.JCheckBox();
        rangePane = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        rangeComboBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        rangeIncludesField = new javax.swing.JTextField();
        rangeIncludesButton = new javax.swing.JButton();
        syntaxCheckBox = new javax.swing.JCheckBox();
        syntaxScrollPane = new javax.swing.JScrollPane();
        syntaxTextArea = new javax.swing.JTextArea();

        setLayout(new java.awt.GridBagLayout());

        jLabel1.setText(bundle.getString("CTL_Phrase.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 6);
        add(jLabel1, gridBagConstraints);

        jLabel2.setText(bundle.getString("CTL_Includes.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 6);
        add(jLabel2, gridBagConstraints);

        jLabel3.setText(bundle.getString("CTL_Excludes.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 6);
        add(jLabel3, gridBagConstraints);

        jLabel4.setText(bundle.getString("CTL_Spelling.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 6);
        add(jLabel4, gridBagConstraints);

        jLabel8.setText(bundle.getString("CTL_StartWith.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 6);
        add(jLabel8, gridBagConstraints);

        phraseField.setColumns(20);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        add(phraseField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        add(includesField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        add(excludesField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        add(spellingField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        add(startWithField, gridBagConstraints);

        rankedCheckBox.setBackground(javax.swing.UIManager.getDefaults().getColor("textHighlight"));
        rankedCheckBox.setText(bundle.getString("CTL_Ranked.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 0);
        add(rankedCheckBox, gridBagConstraints);

        searchLimitSlider.setMajorTickSpacing(50);
        searchLimitSlider.setMaximum(200);
        searchLimitSlider.setMinorTickSpacing(10);
        searchLimitSlider.setPaintLabels(true);
        searchLimitSlider.setPaintTicks(true);
        searchLimitSlider.setToolTipText(bundle.getString("CTL_SearchLimitSlider.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 24, 0, 0);
        add(searchLimitSlider, gridBagConstraints);

        rangeCheckBox.setBackground(javax.swing.UIManager.getDefaults().getColor("textHighlight"));
        rangeCheckBox.setText(bundle.getString("CTL_Range.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 0);
        add(rangeCheckBox, gridBagConstraints);

        rangePane.setLayout(new java.awt.GridBagLayout());

        jLabel5.setText(bundle.getString("CTL_RangePreset.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 6);
        rangePane.add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        rangePane.add(rangeComboBox, gridBagConstraints);

        jLabel6.setText(bundle.getString("CTL_RangeIncludes.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 6);
        rangePane.add(jLabel6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        rangePane.add(rangeIncludesField, gridBagConstraints);

        rangeIncludesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kiyut/alkitab/bookviewer/edit.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 0, 0);
        rangePane.add(rangeIncludesButton, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 24, 0, 0);
        add(rangePane, gridBagConstraints);

        syntaxCheckBox.setBackground(javax.swing.UIManager.getDefaults().getColor("textHighlight"));
        syntaxCheckBox.setText(bundle.getString("CTL_Syntax.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 0);
        add(syntaxCheckBox, gridBagConstraints);

        syntaxTextArea.setEditable(false);
        syntaxTextArea.setLineWrap(true);
        syntaxTextArea.setRows(5);
        syntaxTextArea.setWrapStyleWord(true);
        syntaxScrollPane.setViewportView(syntaxTextArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(8, 24, 0, 0);
        add(syntaxScrollPane, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField excludesField;
    private javax.swing.JTextField includesField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField phraseField;
    private javax.swing.JCheckBox rangeCheckBox;
    private javax.swing.JComboBox<String> rangeComboBox;
    private javax.swing.JButton rangeIncludesButton;
    private javax.swing.JTextField rangeIncludesField;
    private javax.swing.JPanel rangePane;
    private javax.swing.JCheckBox rankedCheckBox;
    private javax.swing.JSlider searchLimitSlider;
    private javax.swing.JTextField spellingField;
    private javax.swing.JTextField startWithField;
    private javax.swing.JCheckBox syntaxCheckBox;
    private javax.swing.JScrollPane syntaxScrollPane;
    private javax.swing.JTextArea syntaxTextArea;
    // End of variables declaration//GEN-END:variables
    
    protected void initCustom() {
        ranked = false;
        searchLimit = 0;
        searchLimitSlider.setVisible(false);
        rangePane.setVisible(false);
        
        syntaxCheckBox.setSelected(true);
        
        int limit = BookViewerOptions.getInstance().getDefaultSearchLimit();
        if (limit > 0) {
            searchLimitSlider.setValue(limit);
        }
                
        rankedCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                ranked = rankedCheckBox.isSelected();
                searchLimitSlider.setVisible(ranked);
                searchLimit = searchLimitSlider.getValue();
                pack();
            }
        });
        
        searchLimitSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent evt) {
                JSlider slider = (JSlider) evt.getSource();
                if (slider.getValueIsAdjusting()) {
                    return;
                }
                int val = slider.getValue();
                searchLimit = val;
            }
        });
        
        String[] presets = bundle.getString("Range.Preset").split("\\|");
        rangeComboBox.setModel(new DefaultComboBoxModel<String>(presets));
        
        rangeCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                boolean checked = rangeCheckBox.isSelected();
                rangePane.setVisible(checked);
                pack();
            }
        });
        
        rangeComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                JComboBox<String> comboBox = rangeComboBox;
                int index = comboBox.getSelectedIndex();
                if (index <= 0) {
                    return;
                }
                
                String preset = comboBox.getSelectedItem().toString();
                int start = preset.indexOf("(");
                int end = preset.indexOf(")");
                if (start < 0 || end < 0) {
                    return;
                }
                String includes = preset.substring(start+1, end);
                rangeIncludesField.setText(includes);
            }
        });
        
        rangeIncludesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PassageChooser passageChooser = new PassageChooser();
                passageChooser.setPassage(rangeIncludesField.getText());
                int choice = passageChooser.showDialog(SearchPane.this);
                if (choice != JOptionPane.OK_OPTION) {
                    return;
                }
                rangeIncludesField.setText(passageChooser.getKey().toString());
                if (rangeComboBox.getSelectedIndex() != 0) {
                    rangeComboBox.setSelectedIndex(0);
                }
            }
        });
        
        rangeIncludesField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent evt) {
                if (rangeComboBox.getSelectedIndex() == 0) {
                    return;
                }
                rangeComboBox.setSelectedIndex(0);
            }
        });
        
        syntaxCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                boolean checked = syntaxCheckBox.isSelected();
                syntaxScrollPane.setVisible(checked);
                pack();
            }
        });
        
        DocumentListener docListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent evt) {
                syntaxTextArea.setText(createSearchString());
            }

            @Override
            public void removeUpdate(DocumentEvent evt) {
                syntaxTextArea.setText(createSearchString());
            }

            @Override
            public void changedUpdate(DocumentEvent evt) {
                syntaxTextArea.setText(createSearchString());
            }
        };
        
        phraseField.getDocument().addDocumentListener(docListener);
        includesField.getDocument().addDocumentListener(docListener);
        excludesField.getDocument().addDocumentListener(docListener);
        spellingField.getDocument().addDocumentListener(docListener);
        startWithField.getDocument().addDocumentListener(docListener);
        rangeIncludesField.getDocument().addDocumentListener(docListener);
    }
    
    /** Pack this component if it is contained in Window (Frame or Dialog) */
    protected void pack() {
        Window window = SwingUtilities.getWindowAncestor(SearchPane.this);
        if (window != null) {
            window.pack();
        }
    }
    
    /** Show as Dialog 
     * @param parentComponent {@code Component}
     */
    public int showDialog(Component parentComponent) {
        int choice = JOptionPane.showConfirmDialog(parentComponent,this,bundle.getString("CTL_Title.Text"),JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        return choice;
    }
    
    /** 
     * Set search string to be parsed into the input box
     * TODO: not implemented yet
     * @param searchString Search String or null
     */
    public void setSearchString(String searchString) {
        /*if (searchString == null) {
            return;
        }*/
        
        // TODO not implmented yet; 
    }
    
    /** Return search string. Delegated into {@link #createSearchString()}
     * @return {@code String}
     */
    public String getSearchString() {
        return createSearchString();
    }
    
    /** Set ranked or prioritized search
     * @param ranked {@code true} or {@code false}
     */
    public void setRanked(boolean ranked) {
        this.ranked = ranked;
        if (ranked && !rankedCheckBox.isSelected()) {
            rankedCheckBox.doClick();
        }
    }
    
    /** 
     * Return ranked or prioritized search
     * @return {@code true} or {@code false}
     */
    public boolean isRanked() {
        return ranked;
    }
    
    /** Set search limit. Zero (0) is unlimited  
     * @param limit the search limit
     */
    public void setSearchLimit(int limit) {
        if (limit >= 0) {
            this.searchLimit = limit;
            searchLimitSlider.setValue(limit);
        }
    }
    
    /** Return search limit. Zero (0) is unlimited 
     * @return search limit
     */
    public int getSearchLimit() {
        return searchLimit;
    }
    
    /**
     * Create search string from the input boxes
     * @return {@code String}
     */
    protected String createSearchString() {
        StringBuilder sb = new StringBuilder();
        
        String str;
        String[] strs;
        
        str = rangeIncludesField.getText();
        if (!str.equals("")) {
            sb.append(" +[" + str + "] ");
        }
        
        str = phraseField.getText().trim();
        if (!str.equals("")) {
            sb.append("\"" +  str + "\"");
            
        }
        
        str = includesField.getText().trim();
        if (!str.equals("")) {
            strs = str.split(" ");
            for (int i=0; i< strs.length; i++) {
                sb.append(" +" + strs[i]);
            }
        }
        
        str = excludesField.getText().trim();
        if (!str.equals("")) {
            strs = str.split(" ");
            for (int i=0; i< strs.length; i++) {
                sb.append(" -" + strs[i]);
            }
        }
        
        str = spellingField.getText().trim();
        if (!str.equals("")) {
            strs = str.split(" ");
            for (int i=0; i< strs.length; i++) {
                sb.append(" " + strs[i] + "~");
            }
        }
        
        str = startWithField.getText().trim();
        if (!str.equals("")) {
            strs = str.split(" ");
            for (int i=0; i< strs.length; i++) {
                sb.append(" " + strs[i] + "*");
            }
        }

        // remove the start or leading space
        if (sb.length() > 0 && sb.charAt(0) == ' ') {
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
    }
    
}
