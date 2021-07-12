package edu.utp.interfaces;

import java.awt.Component;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class GestionCeldas extends DefaultTableCellRenderer {

    private String tipo = "text";

    private Font normal = new Font("Verdana", Font.PLAIN, 12);
    private Font bold = new Font("Verdana", Font.BOLD, 12);
    private JLabel label = new JLabel();
    private ImageIcon iconoBuscar = new javax.swing.ImageIcon(getClass().getResource("/IMG/productos/delete.png"));
    private ImageIcon iconoPdf = new javax.swing.ImageIcon(getClass().getResource("/IMG/productos/download.png"));

    public GestionCeldas() {

    }

    public GestionCeldas(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
        if (tipo.equals("icono")) {
            if (String.valueOf(value).equals("icono")) {
                label.setIcon(iconoBuscar);
            }
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            return label;
        }
        if (tipo.equals("iconopdf")) {
            if (String.valueOf(value).equals("iconopdf")) {
                label.setIcon(iconoPdf);
            }
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            return label;
        }
        return this;

    }

}
