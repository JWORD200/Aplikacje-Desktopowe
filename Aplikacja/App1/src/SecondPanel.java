import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.io.Serial;

public class SecondPanel extends JPanel{
    static public DefaultTableModel tableModel = new DefaultTableModel();

    public SecondPanel(){

        this.setBackground(Color.darkGray);
        this.setBounds(0, 35, 600, 270);

        tableModel.addColumn("Klasa");
        tableModel.addColumn("Proponowana");
        tableModel.addColumn("Ile ocen");
        tableModel.addColumn("WYK");
        tableModel.addColumn("ĆW");

        JTable table = new JTable(tableModel);
        JScrollPane scroll = new JScrollPane(table);

        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(1).setCellRenderer(new CheckBoxRenderer());
        columnModel.getColumn(1).setCellEditor(new CheckBoxEditor(new JCheckBox()));

        this.add(scroll, BorderLayout.CENTER);
        this.setVisible(true);
    }
    static class CheckBoxRenderer extends DefaultTableCellRenderer {
        @Serial
        private static final long serialVersionUID = 1L;

        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            if (value instanceof Boolean) {
                JCheckBox checkBox = new JCheckBox();
                checkBox.setSelected((Boolean) value);
                return checkBox;
            } else {
                return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
            }
        }
    }

    static class CheckBoxEditor extends DefaultCellEditor {
        @Serial
        private static final long serialVersionUID = 1L;

        public CheckBoxEditor(JCheckBox checkBox) {
            super(checkBox);
        }

        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            if (value instanceof Boolean) {
                ((JCheckBox) editorComponent).setSelected((Boolean) value);
            }
            return editorComponent;
        }
    }
}
