/* This work has been placed into the public domain. */

package kiyut.alkitab.options;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Window;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ResourceBundle;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;
import kiyut.alkitab.bookviewer.BookFontStore;
import kiyut.alkitab.util.ComponentOrientationSupport;
import kiyut.alkitab.util.FontUtilities;
import kiyut.alkitab.util.SwordUtilities;
import kiyut.swing.combo.SeparatorComboBox;
import org.crosswire.jsword.book.Book;
import org.crosswire.jsword.book.BookFilters;
import org.crosswire.jsword.book.Books;

final class GeneralOptionsPanel extends javax.swing.JPanel {

    private final GeneralOptionsPanelController controller;
    private ResourceBundle bundle = ResourceBundle.getBundle(this.getClass().getName());

    private static final Color LIGHT_YELLOW = OptionsUtilities.stringToColor("#FFFFE1");
    private static final Color LIGHT_WHITE = OptionsUtilities.stringToColor("#F5F5F5");
    private static final Color LIGHT_GRAY = OptionsUtilities.stringToColor("#EBEBEB");

    private Color customBackground;
    private boolean isRefreshing;


    GeneralOptionsPanel(GeneralOptionsPanelController controller) {
        this.controller = controller;
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

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        parallelBookLimitComboBox = new javax.swing.JComboBox<>();
        versesPerTabComboBox = new javax.swing.JComboBox<>();
        defaultSearchLimitComboBox = new javax.swing.JComboBox<>();
        fontPanel = new javax.swing.JPanel();
        fontComboBox =  new SeparatorComboBox();
        fontSizeComboBox = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        fontBoldCheckBox = new javax.swing.JCheckBox();
        fontItalicCheckBox = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        backgroundCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        defaultBibleComboBox = new javax.swing.JComboBox<>();
        defaultDictionaryComboBox = new javax.swing.JComboBox<>();
        defaultDailyDevotionsComboBox = new javax.swing.JComboBox<>();
        defaultGreekStrongsComboBox = new javax.swing.JComboBox<>();
        defaultHebrewStrongsComboBox = new javax.swing.JComboBox<>();
        defaultGreekMorphComboBox = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 6, 10));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel4.setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, bundle.getString("CTL_ParallelLimit.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 6);
        jPanel4.add(jLabel1, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel2, bundle.getString("CTL_VerseLimit.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 6);
        jPanel4.add(jLabel2, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel3, bundle.getString("CTL_SearchLimit.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 6);
        jPanel4.add(jLabel3, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel4, bundle.getString("CTL_Font.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 6);
        jPanel4.add(jLabel4, gridBagConstraints);

        parallelBookLimitComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel4.add(parallelBookLimitComboBox, gridBagConstraints);

        versesPerTabComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "25", "50", "75", "100", "125", "150", "176", "200" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel4.add(versesPerTabComboBox, gridBagConstraints);

        defaultSearchLimitComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unlimited", "10", "20", "30", "40", "50", "75", "100", "125", "150", "175", "200" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel4.add(defaultSearchLimitComboBox, gridBagConstraints);

        fontPanel.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 3);
        fontPanel.add(fontComboBox, gridBagConstraints);

        fontSizeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "9", "10", "11", "12", "13", "14", "15", "16", "18", "20", "22", "24", "26", "28", "32", "36", "40", "44", "48", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        fontPanel.add(fontSizeComboBox, gridBagConstraints);

        jPanel11.setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(fontBoldCheckBox, bundle.getString("CTL_FontBold.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 12);
        jPanel11.add(fontBoldCheckBox, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(fontItalicCheckBox, bundle.getString("CTL_FontItalic.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel11.add(fontItalicCheckBox, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        fontPanel.add(jPanel11, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel4.add(fontPanel, gridBagConstraints);

        jPanel10.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel4.add(jPanel10, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel10, bundle.getString("CTL_Background.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel4.add(jLabel10, gridBagConstraints);

        backgroundCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Default", "Light White", "Light Yellow", "Light Gray", "Custom ..." }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel4.add(backgroundCombo, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jPanel1.add(jPanel4, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel8, bundle.getString("CTL_DefaultBook.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 12);
        jPanel1.add(jLabel8, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 0, 0);
        jPanel1.add(jSeparator1, gridBagConstraints);

        jPanel9.setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(jLabel5, bundle.getString("CTL_DefaultBible.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 6);
        jPanel9.add(jLabel5, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel6, bundle.getString("CTL_DefaultDictionary.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 6);
        jPanel9.add(jLabel6, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel7, bundle.getString("CTL_DefaultDailyDevotions.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 6);
        jPanel9.add(jLabel7, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel9, bundle.getString("CTL_DefaultGreekDefinition.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 6);
        jPanel9.add(jLabel9, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel12, bundle.getString("CTL_DefaultHebrewDefinition.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 6);
        jPanel9.add(jLabel12, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(jLabel13, bundle.getString("CTL_DefaultGreekMorph.Text")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 6);
        jPanel9.add(jLabel13, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.5;
        jPanel9.add(defaultBibleComboBox, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel9.add(defaultDictionaryComboBox, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel9.add(defaultDailyDevotionsComboBox, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel9.add(defaultGreekStrongsComboBox, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel9.add(defaultHebrewStrongsComboBox, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel9.add(defaultGreekMorphComboBox, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(8, 10, 0, 0);
        jPanel1.add(jPanel9, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jPanel3, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> backgroundCombo;
    private javax.swing.JComboBox<String> defaultBibleComboBox;
    private javax.swing.JComboBox<String> defaultDailyDevotionsComboBox;
    private javax.swing.JComboBox<String> defaultDictionaryComboBox;
    private javax.swing.JComboBox<String> defaultGreekMorphComboBox;
    private javax.swing.JComboBox<String> defaultGreekStrongsComboBox;
    private javax.swing.JComboBox<String> defaultHebrewStrongsComboBox;
    private javax.swing.JComboBox<String> defaultSearchLimitComboBox;
    private javax.swing.JCheckBox fontBoldCheckBox;
    private javax.swing.JComboBox<String> fontComboBox;
    private javax.swing.JCheckBox fontItalicCheckBox;
    private javax.swing.JPanel fontPanel;
    private javax.swing.JComboBox<String> fontSizeComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> parallelBookLimitComboBox;
    private javax.swing.JComboBox<String> versesPerTabComboBox;
    // End of variables declaration//GEN-END:variables

    private void initCustom() {
        fontComboBox.setModel(new DefaultComboBoxModel<String>());
        defaultBibleComboBox.setModel(new DefaultComboBoxModel<String>());
        defaultDictionaryComboBox.setModel(new DefaultComboBoxModel<String>());
        defaultDailyDevotionsComboBox.setModel(new DefaultComboBoxModel<String>());

        fontSizeComboBox.setPrototypeDisplayValue("99");
        defaultBibleComboBox.setPrototypeDisplayValue("KJV - King James Version (1769) ...");
        backgroundCombo.setPrototypeDisplayValue("Light Yellow");

        refreshAvailableFonts();
        refreshDefaultBooks();

        // XXX workaround for NbPlatform OptionsDialog component orientation
        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent evt) {
                Window parent = SwingUtilities.getWindowAncestor(GeneralOptionsPanel.this);
                ComponentOrientation cOrient = ComponentOrientationSupport.getComponentOrientation();
                if (!cOrient.equals(parent.getComponentOrientation())) {
                    ComponentOrientationSupport.applyComponentOrientation(parent);
                    parent.invalidate();
                    parent.validate();
                    parent.repaint();
                }
            }
        });

        backgroundCombo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent evt) {
                backgroundComboItemStateChanged(evt);
            }
        });
    }

    void load() {
        isRefreshing = true;
        BookViewerOptions bookViewerOpts = BookViewerOptions.getInstance();

        parallelBookLimitComboBox.setSelectedItem(Integer.toString(bookViewerOpts.getParallelBookLimit()));
        versesPerTabComboBox.setSelectedItem(Integer.toString(bookViewerOpts.getVersesLimit()));
        defaultSearchLimitComboBox.setSelectedItem(Integer.toString(bookViewerOpts.getDefaultSearchLimit()));

        BookFontStore fontStore = BookFontStore.getInstance();
        String fontDef = fontStore.getDefaultFont();
        Font font = FontUtilities.string2Font(fontDef);
        fontComboBox.setSelectedItem(font.getName());
        fontSizeComboBox.setSelectedItem(font.getSize()+"");
        fontBoldCheckBox.setSelected(font.isBold());
        fontItalicCheckBox.setSelected(font.isItalic());

        Color background = bookViewerOpts.getBackground();
        if (background == null) {
            backgroundCombo.setSelectedIndex(0);
        } else if (background.equals(LIGHT_WHITE)) {
            backgroundCombo.setSelectedIndex(1);
        } else if (background.equals(LIGHT_YELLOW)) {
            backgroundCombo.setSelectedIndex(2);
        } else if (background.equals(LIGHT_GRAY)) {
            backgroundCombo.setSelectedIndex(3);
        } else {
            backgroundCombo.setSelectedIndex(4);
        }

        setDefaultBookComboBox(defaultBibleComboBox, bookViewerOpts.getDefaultBible());
        setDefaultBookComboBox(defaultDictionaryComboBox, bookViewerOpts.getDefaultDictionary());
        setDefaultBookComboBox(defaultDailyDevotionsComboBox, bookViewerOpts.getDefaultDailyDevotions());
        setDefaultBookComboBox(defaultGreekStrongsComboBox, bookViewerOpts.getDefaultGreekStrongs());
        setDefaultBookComboBox(defaultHebrewStrongsComboBox, bookViewerOpts.getDefaultHebrewStrongs());
        setDefaultBookComboBox(defaultGreekMorphComboBox, bookViewerOpts.getDefaultGreekMorph());

        isRefreshing = false;
    }

    void store() {
        BookViewerOptions bookViewerOpts = BookViewerOptions.getInstance();
        bookViewerOpts.setParallelBookLimit(Integer.parseInt(parallelBookLimitComboBox.getSelectedItem().toString()));
        bookViewerOpts.setVersesLimit(Integer.parseInt(versesPerTabComboBox.getSelectedItem().toString()));
        if (defaultSearchLimitComboBox.getSelectedIndex() == 0) {
            // unlimited
            bookViewerOpts.setDefaultSearchLimit(0);
        } else {
            bookViewerOpts.setDefaultSearchLimit(Integer.parseInt(defaultSearchLimitComboBox.getSelectedItem().toString()));
        }

        int index = backgroundCombo.getSelectedIndex();
        switch (index) {
            case 0:
                bookViewerOpts.setBackground(null);
                break;
            case 1:
                bookViewerOpts.setBackground(LIGHT_WHITE);
                break;
            case 2:
                bookViewerOpts.setBackground(LIGHT_YELLOW);
                break;
            case 3:
                bookViewerOpts.setBackground(LIGHT_GRAY);
                break;
            default:
                bookViewerOpts.setBackground(customBackground);
                break;
        }


        String initials;
        if (defaultBibleComboBox.getSelectedIndex() > 0) {
            initials = defaultBibleComboBox.getSelectedItem().toString();
            initials = initials.substring(0,initials.indexOf('-') - 1);
            //System.out.println(initials + "TEST");
            bookViewerOpts.setDefaultBible(initials);
        } else {
            bookViewerOpts.setDefaultBible(null);
        }

        if (defaultDictionaryComboBox.getSelectedIndex() > 0) {
            initials = defaultDictionaryComboBox.getSelectedItem().toString();
            initials = initials.substring(0,initials.indexOf('-') - 1);
            bookViewerOpts.setDefaultDictionary(initials);
        } else {
            bookViewerOpts.setDefaultDictionary(null);
        }

        if (defaultDailyDevotionsComboBox.getSelectedIndex() > 0) {
            initials = defaultDailyDevotionsComboBox.getSelectedItem().toString();
            initials = initials.substring(0,initials.indexOf('-') - 1);
            bookViewerOpts.setDefaultDailyDevotions(initials);
        } else {
            bookViewerOpts.setDefaultDailyDevotions(null);
        }

        if (defaultGreekStrongsComboBox.getSelectedIndex() > 0) {
            initials = defaultGreekStrongsComboBox.getSelectedItem().toString();
            initials = initials.substring(0,initials.indexOf('-') - 1);
            bookViewerOpts.setDefaultGreekStrongs(initials);
        } else {
            bookViewerOpts.setDefaultGreekStrongs(null);
        }

        if (defaultHebrewStrongsComboBox.getSelectedIndex() > 0) {
            initials = defaultHebrewStrongsComboBox.getSelectedItem().toString();
            initials = initials.substring(0,initials.indexOf('-') - 1);
            bookViewerOpts.setDefaultHebrewStrongs(initials);
        } else {
            bookViewerOpts.setDefaultHebrewStrongs(null);
        }

        if (defaultGreekMorphComboBox.getSelectedIndex() > 0) {
            initials = defaultGreekMorphComboBox.getSelectedItem().toString();
            initials = initials.substring(0,initials.indexOf('-') - 1);
            bookViewerOpts.setDefaultGreekMorph(initials);
        } else {
            bookViewerOpts.setDefaultGreekMorph(null);
        }

        // default font stuff
        int style = Font.PLAIN;
        style = fontBoldCheckBox.isSelected() ? style | Font.BOLD : style;
        style = fontItalicCheckBox.isSelected() ? style | Font.ITALIC : style;
        int size = Integer.parseInt(fontSizeComboBox.getSelectedItem().toString());
        Font font = new Font(fontComboBox.getSelectedItem().toString(), style, size);

        BookFontStore fontStore = BookFontStore.getInstance();
        fontStore.setDefaultFont(FontUtilities.font2String(font));
        //System.out.println(fontDefs + "   TEST ONLY");

        bookViewerOpts.store();
    }

    boolean valid() {
        return true;
    }

    /** Refresh available fonts */
    private void refreshAvailableFonts() {
        DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>)fontComboBox.getModel();
        model.removeAllElements();

        // add generic font family
        model.addElement("serif");
        model.addElement("sans-serif");
        model.addElement("monospace");
        model.addElement("cursive");
        model.addElement("fantasy");
        model.addElement(SeparatorComboBox.DEFAULT_SEPARATOR);

        String fontList[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for ( int i = 0; i < fontList.length; i++ ) {
            model.addElement(fontList[i]);
        }
    }

    /** Refresh default books {@code JComboBox} */
    @SuppressWarnings("unchecked")
    private void refreshDefaultBooks() {
        Comparator<Book> comparator = SwordUtilities.getBookInitialsComparator();
        List<Book> books = new ArrayList<>();

        books.clear();
        books.addAll(Books.installed().getBooks(BookFilters.getOnlyBibles()));
        refreshDefaultBookComboBox(defaultBibleComboBox,books,comparator);

        books.clear();
        books.addAll(Books.installed().getBooks(BookFilters.getDictionaries()));
        refreshDefaultBookComboBox(defaultDictionaryComboBox,books,comparator);

        books.clear();
        books.addAll(Books.installed().getBooks(BookFilters.getDailyDevotionals()));
        refreshDefaultBookComboBox(defaultDailyDevotionsComboBox,books,comparator);

        books.clear();
        books.addAll(Books.installed().getBooks(BookFilters.getGreekDefinitions()));
        refreshDefaultBookComboBox(defaultGreekStrongsComboBox,books,comparator);

        books.clear();
        books.addAll(Books.installed().getBooks(BookFilters.getHebrewDefinitions()));
        refreshDefaultBookComboBox(defaultHebrewStrongsComboBox,books,comparator);

        books.clear();
        books.addAll(Books.installed().getBooks(BookFilters.getGreekParse()));
        refreshDefaultBookComboBox(defaultGreekMorphComboBox,books,comparator);
    }


    /** Refresh Default Book ComboBox
     * @param comboBox the {@code JComboBox} to be refreshed
     * @param books the list of books which is used to refresh
     * @param comparator the {@code Comparator} for books order or null
     */
    private void refreshDefaultBookComboBox(JComboBox<String> comboBox, List<Book> books, Comparator<Book> comparator) {
        if (comparator != null) {
            Collections.sort(books, comparator);
        }
        DefaultComboBoxModel<String> model = (DefaultComboBoxModel<String>)comboBox.getModel();
        model.removeAllElements();
        model.addElement("None");
        for (Book book : books) {
            model.addElement(book.getInitials() + " - " + book.getName());
        }
    }

    private void setDefaultBookComboBox(JComboBox<String> comboBox, String name) {
        if (name == null) { return; }

        int index = -1;

        ComboBoxModel<String> model = comboBox.getModel();
        for (int i=0; i<model.getSize();i++) {
            String obj = model.getElementAt(i);
            if (obj.startsWith(name)) {
                index = i;
                break;
            }
        }

        if (index >= 0) {
            comboBox.setSelectedIndex(index);
        }
    }

     private void backgroundComboItemStateChanged(ItemEvent evt) {
         if (evt.getStateChange() == ItemEvent.DESELECTED) { return; }

         if (isRefreshing) { return; }

         // not custom background color
         if (backgroundCombo.getSelectedIndex() != 4) { return; }
         
         customBackground = JColorChooser.showDialog(this, "Choose Color", customBackground);
    }
}
