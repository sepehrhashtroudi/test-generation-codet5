public DefaultAxisEditor(Axis axis) { [EOL]     this.labelFont = axis.getLabelFont(); [EOL]     this.labelPaintSample = new PaintSample(axis.getLabelPaint()); [EOL]     this.tickLabelFont = axis.getTickLabelFont(); [EOL]     this.tickLabelPaintSample = new PaintSample(axis.getTickLabelPaint()); [EOL]     this.tickLabelInsets = axis.getTickLabelInsets(); [EOL]     this.labelInsets = axis.getLabelInsets(); [EOL]     setLayout(new BorderLayout()); [EOL]     JPanel general = new JPanel(new BorderLayout()); [EOL]     general.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), localizationResources.getString("General"))); [EOL]     JPanel interior = new JPanel(new LCBLayout(5)); [EOL]     interior.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5)); [EOL]     interior.add(new JLabel(localizationResources.getString("Label"))); [EOL]     this.label = new JTextField(axis.getLabel()); [EOL]     interior.add(this.label); [EOL]     interior.add(new JPanel()); [EOL]     interior.add(new JLabel(localizationResources.getString("Font"))); [EOL]     this.labelFontField = new FontDisplayField(this.labelFont); [EOL]     interior.add(this.labelFontField); [EOL]     JButton b = new JButton(localizationResources.getString("Select...")); [EOL]     b.setActionCommand("SelectLabelFont"); [EOL]     b.addActionListener(this); [EOL]     interior.add(b); [EOL]     interior.add(new JLabel(localizationResources.getString("Paint"))); [EOL]     interior.add(this.labelPaintSample); [EOL]     b = new JButton(localizationResources.getString("Select...")); [EOL]     b.setActionCommand("SelectLabelPaint"); [EOL]     b.addActionListener(this); [EOL]     interior.add(b); [EOL]     general.add(interior); [EOL]     add(general, BorderLayout.NORTH); [EOL]     this.slot1 = new JPanel(new BorderLayout()); [EOL]     JPanel other = new JPanel(new BorderLayout()); [EOL]     other.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), localizationResources.getString("Other"))); [EOL]     this.otherTabs = new JTabbedPane(); [EOL]     this.otherTabs.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5)); [EOL]     JPanel ticks = new JPanel(new LCBLayout(3)); [EOL]     ticks.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4)); [EOL]     this.showTickLabelsCheckBox = new JCheckBox(localizationResources.getString("Show_tick_labels"), axis.isTickLabelsVisible()); [EOL]     ticks.add(this.showTickLabelsCheckBox); [EOL]     ticks.add(new JPanel()); [EOL]     ticks.add(new JPanel()); [EOL]     ticks.add(new JLabel(localizationResources.getString("Tick_label_font"))); [EOL]     this.tickLabelFontField = new FontDisplayField(this.tickLabelFont); [EOL]     ticks.add(this.tickLabelFontField); [EOL]     b = new JButton(localizationResources.getString("Select...")); [EOL]     b.setActionCommand("SelectTickLabelFont"); [EOL]     b.addActionListener(this); [EOL]     ticks.add(b); [EOL]     this.showTickMarksCheckBox = new JCheckBox(localizationResources.getString("Show_tick_marks"), axis.isTickMarksVisible()); [EOL]     ticks.add(this.showTickMarksCheckBox); [EOL]     ticks.add(new JPanel()); [EOL]     ticks.add(new JPanel()); [EOL]     this.otherTabs.add(localizationResources.getString("Ticks"), ticks); [EOL]     other.add(this.otherTabs); [EOL]     this.slot1.add(other); [EOL]     this.slot2 = new JPanel(new BorderLayout()); [EOL]     this.slot2.add(this.slot1, BorderLayout.NORTH); [EOL]     add(this.slot2); [EOL] } <line_num>: 173,290
public static DefaultAxisEditor getInstance(Axis axis) { [EOL]     if (axis != null) { [EOL]         if (axis instanceof NumberAxis) { [EOL]             return new DefaultNumberAxisEditor((NumberAxis) axis); [EOL]         } else { [EOL]             return new DefaultAxisEditor(axis); [EOL]         } [EOL]     } else { [EOL]         return null; [EOL]     } [EOL] } <line_num>: 148,164
public String getLabel() { [EOL]     return this.label.getText(); [EOL] } <line_num>: 297,299
public Font getLabelFont() { [EOL]     return this.labelFont; [EOL] } <line_num>: 306,308
public Paint getLabelPaint() { [EOL]     return this.labelPaintSample.getPaint(); [EOL] } <line_num>: 315,317
public boolean isTickLabelsVisible() { [EOL]     return this.showTickLabelsCheckBox.isSelected(); [EOL] } <line_num>: 324,326
public Font getTickLabelFont() { [EOL]     return this.tickLabelFont; [EOL] } <line_num>: 333,335
public Paint getTickLabelPaint() { [EOL]     return this.tickLabelPaintSample.getPaint(); [EOL] } <line_num>: 342,344
public boolean isTickMarksVisible() { [EOL]     return this.showTickMarksCheckBox.isSelected(); [EOL] } <line_num>: 352,354
public RectangleInsets getTickLabelInsets() { [EOL]     return (this.tickLabelInsets == null) ? new RectangleInsets(0, 0, 0, 0) : this.tickLabelInsets; [EOL] } <line_num>: 361,365
public RectangleInsets getLabelInsets() { [EOL]     return (this.labelInsets == null) ? new RectangleInsets(0, 0, 0, 0) : this.labelInsets; [EOL] } <line_num>: 372,375
public JTabbedPane getOtherTabs() { [EOL]     return this.otherTabs; [EOL] } <line_num>: 382,384
public void actionPerformed(ActionEvent event) { [EOL]     String command = event.getActionCommand(); [EOL]     if (command.equals("SelectLabelFont")) { [EOL]         attemptLabelFontSelection(); [EOL]     } else if (command.equals("SelectLabelPaint")) { [EOL]         attemptModifyLabelPaint(); [EOL]     } else if (command.equals("SelectTickLabelFont")) { [EOL]         attemptTickLabelFontSelection(); [EOL]     } [EOL] } <line_num>: 392,409
private void attemptLabelFontSelection() { [EOL]     FontChooserPanel panel = new FontChooserPanel(this.labelFont); [EOL]     int result = JOptionPane.showConfirmDialog(this, panel, localizationResources.getString("Font_Selection"), JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE); [EOL]     if (result == JOptionPane.OK_OPTION) { [EOL]         this.labelFont = panel.getSelectedFont(); [EOL]         this.labelFontField.setText(this.labelFont.getFontName() + " " + this.labelFont.getSize()); [EOL]     } [EOL] } <line_num>: 414,428
private void attemptModifyLabelPaint() { [EOL]     Color c; [EOL]     c = JColorChooser.showDialog(this, localizationResources.getString("Label_Color"), Color.blue); [EOL]     if (c != null) { [EOL]         this.labelPaintSample.setPaint(c); [EOL]     } [EOL] } <line_num>: 433,441
public void attemptTickLabelFontSelection() { [EOL]     FontChooserPanel panel = new FontChooserPanel(this.tickLabelFont); [EOL]     int result = JOptionPane.showConfirmDialog(this, panel, localizationResources.getString("Font_Selection"), JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE); [EOL]     if (result == JOptionPane.OK_OPTION) { [EOL]         this.tickLabelFont = panel.getSelectedFont(); [EOL]         this.tickLabelFontField.setText(this.tickLabelFont.getFontName() + " " + this.tickLabelFont.getSize()); [EOL]     } [EOL] } <line_num>: 446,461
public void setAxisProperties(Axis axis) { [EOL]     axis.setLabel(getLabel()); [EOL]     axis.setLabelFont(getLabelFont()); [EOL]     axis.setLabelPaint(getLabelPaint()); [EOL]     axis.setTickMarksVisible(isTickMarksVisible()); [EOL]     axis.setTickLabelsVisible(isTickLabelsVisible()); [EOL]     axis.setTickLabelFont(getTickLabelFont()); [EOL]     axis.setTickLabelPaint(getTickLabelPaint()); [EOL]     axis.setTickLabelInsets(getTickLabelInsets()); [EOL]     axis.setLabelInsets(getLabelInsets()); [EOL] } <line_num>: 506,517
