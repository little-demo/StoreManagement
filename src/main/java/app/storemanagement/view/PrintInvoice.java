package app.storemanagement.view;

import app.storemanagement.model.Connection.DBConnection;
import app.storemanagement.utils.Util;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Hung Pham
 */
public class PrintInvoice extends javax.swing.JFrame {

    private int id;

    /**
     * Creates new form PrintInvoice
     *
     * @param id
     */
    public PrintInvoice(int id) {
        this.id = id;
        initComponents();
        getInvoiceInfo();
        formatTable();
        displayInvoiceTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tablePane = new javax.swing.JScrollPane();
        invoiceTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        customerName = new javax.swing.JLabel();
        employeeName = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        returnMoney = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        cusMoney = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        invID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(411, 575));

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jLabel1.setText("Cửa hàng ABC");

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jLabel2.setText("97 Man Thiện, Phường Hiệp Phú, TP.Thủ Đức");

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jLabel4.setText("---------------------------------------------------------");

        invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sản phẩm", "Đơn giá", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        invoiceTable.setGridColor(new java.awt.Color(255, 255, 255));
        invoiceTable.setRowHeight(28);
        invoiceTable.setRowSelectionAllowed(false);
        invoiceTable.setSelectionBackground(new java.awt.Color(76, 149, 108));
        invoiceTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        invoiceTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        invoiceTable.getTableHeader().setReorderingAllowed(false);
        tablePane.setViewportView(invoiceTable);
        invoiceTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        TableColumnModel columnModel = invoiceTable.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(233); // Đặt độ rộng mặc định cho cột 0
        columnModel.getColumn(1).setPreferredWidth(80); // Đặt độ rộng mặc định cho cột 1
        columnModel.getColumn(2).setPreferredWidth(60); // Đặt độ rộng mặc định cho cột 2

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        jLabel5.setText("Hóa đơn");

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jLabel6.setText("SDT: 034567890");

        customerName.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        customerName.setText("Khách hàng: ");

        employeeName.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        employeeName.setText("Nhân viên bán hàng:");

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jLabel9.setText("---------------------------------------------------------");

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jLabel10.setText("---------------------------------------------------------");

        jLabel11.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jLabel11.setText("Thank you!");

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jLabel3.setText("Tổng tiền");

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jLabel7.setText("Tiền trả");

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jLabel8.setText("Tiền khách đưa");

        returnMoney.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        returnMoney.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        returnMoney.setText("Tiền trả");
        returnMoney.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        total.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total.setText("Tổng tiền");
        total.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        cusMoney.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        cusMoney.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cusMoney.setText("Tiền khách đưa");
        cusMoney.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel12.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("time");

        jLabel13.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        jLabel13.setText("---------------------------------------------------------");

        invID.setFont(new java.awt.Font("Consolas", 0, 13)); // NOI18N
        invID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        invID.setText("id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cusMoney)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(215, 215, 215)
                                            .addComponent(total))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(returnMoney)))))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(invID)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customerName)
                                    .addComponent(employeeName)
                                    .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel5)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel2))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(invID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(5, 5, 5)
                .addComponent(customerName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePane, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(total)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cusMoney)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(returnMoney)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void getInvoiceInfo() {
        String sql = """
                     SELECT e.Full_Name AS Employee_Name, c.Full_Name AS Customer_Name, 
                     i.Total_Amount, i.Customer_Cash, i.Return_Money,
                     FORMAT(Created_At, 'HH:mm dd/MM/yyyy') as Created_Time
                     FROM Invoice i JOIN Employee e ON i.Employee_ID = e.Employee_ID
                     JOIN Customer c ON i.Customer_ID = c.Customer_ID
                     WHERE Invoice_ID = """ + id;
        try (Connection conn = DBConnection.getConnection(); Statement St = conn.createStatement(); ResultSet Rs = St.executeQuery(sql)) {
            if (Rs.next()) {
                invID.setText("Mã đơn hàng: " + id);
                jLabel12.setText(Rs.getString("Created_Time"));
                customerName.setText("Khách hàng: " + Rs.getString("Customer_Name"));
                employeeName.setText("Nhân viên bán hàng: " + Rs.getString("Employee_Name"));
                total.setText(Util.convertToVND(Rs.getDouble("Total_Amount")));
                cusMoney.setText(Util.convertToVND(Rs.getDouble("Customer_Cash")));
                returnMoney.setText(Util.convertToVND(Rs.getDouble("Return_Money")));
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }

    private void formatTable() {
//        JTableHeader header  = productTable.getTableHeader();
//        header.setVisible(false);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        invoiceTable.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        invoiceTable.setShowGrid(false);
//        tablePane.getColumnHeader().setVisible(false);
        tablePane.getViewport().setBackground(Color.WHITE);
    }

    private void displayInvoiceTable() {
        String sql = """
                 select p.Product_Name, p.Unit_Price, c.Quantity
                 from Invoice i inner join Contain c on i.Invoice_ID = c.Invoice_ID
                 inner join Product p on p.Product_ID = c.Product_ID where i.Invoice_ID = """ + id;
        try (Connection conn = DBConnection.getConnection(); Statement St = conn.createStatement(); ResultSet Rs = St.executeQuery(sql)) {
            // Lưu kích thước cột hiện tại
            int oldColumn0Width = invoiceTable.getColumnModel().getColumn(0).getWidth();
            int oldColumn1Width = invoiceTable.getColumnModel().getColumn(1).getWidth();
            int oldColumn2Width = invoiceTable.getColumnModel().getColumn(2).getWidth();

            DefaultTableModel tableModel = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            int columnCount = Rs.getMetaData().getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                tableModel.addColumn(Rs.getMetaData().getColumnName(i));
            }

            // Đổ dữ liệu từ ResultSet vào DefaultTableModel
            while (Rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    if (i == 2) { // Giả sử cột 2 là giá
                        double price = Rs.getDouble(i);
                        row[i - 1] = Util.convertToVND(price);
                    } else {
                        row[i - 1] = Rs.getObject(i);
                    }
                }
                tableModel.addRow(row);
            }
            // Đặt tên cột theo thiết kế
            String[] columnNames = {"Sản phẩm", "Đơn giá", "Số lượng"};
            tableModel.setColumnIdentifiers(columnNames);
            invoiceTable.setModel(tableModel);

            // Khôi phục kích thước cột
            invoiceTable.getColumnModel().getColumn(0).setPreferredWidth(oldColumn0Width);
            invoiceTable.getColumnModel().getColumn(1).setPreferredWidth(oldColumn1Width);
            invoiceTable.getColumnModel().getColumn(2).setPreferredWidth(oldColumn2Width);
            this.revalidate();
            printInv();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    private void printInv(){
        try{
            BufferedImage img = new BufferedImage(jPanel1.getWidth(), jPanel1.getHeight(), BufferedImage.TYPE_INT_RGB);
            jPanel1.paint(img.getGraphics());
            ImageIO.write(img, "jpg", new File("D:\\invoice.jpg"));
            Desktop.getDesktop().print(new File("D:\\invoice.jpg"));
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cusMoney;
    private javax.swing.JLabel customerName;
    private javax.swing.JLabel employeeName;
    private javax.swing.JLabel invID;
    private javax.swing.JTable invoiceTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel returnMoney;
    private javax.swing.JScrollPane tablePane;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
