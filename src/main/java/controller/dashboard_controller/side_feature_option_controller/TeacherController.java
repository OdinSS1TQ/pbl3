package controller.dashboard_controller.side_feature_option_controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import model.people.teacher.Teacher;
import model.people.teacher.TeacherDatabase;
import view.dashboard.side_feature_option.ManageTeacherJFrame;

public class TeacherController {

    private JPanel jpnView;
    private JButton btnAdd;
    private JButton btnRefresh;
    private JTextField jtfSearch;
    private JTable table;
    private String[] listColumn = {"Teacher ID", "Name", "Date of birth","Gender", "Phone", "Address", "Class ID"};
    private TableRowSorter<TableModel> rowSorter = null;

    public TeacherController(JPanel jpnView, JButton btnAdd, JTextField jtfSearch, JButton btnRefresh) {
        this.jpnView = jpnView;
        this.btnAdd = btnAdd;
        this.jtfSearch = jtfSearch;
        this.btnRefresh = btnRefresh;
    }

    public void setDataToTable() throws SQLException, ClassNotFoundException {
        List<Teacher> listItem = TeacherDatabase.getAllTeacher("SELECT * FROM teacher");
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.setColumnIdentifiers(listColumn);
        for (Teacher teacher : listItem) {
            model.addRow(new Object[]{
                teacher.getID(),
                teacher.getName(),
                teacher.getDoB(),
                (teacher.getGender()==0)?"Male":"Female",
                teacher.getPhone(),
                teacher.getAddress(),
                teacher.getClassID(),
            });
        }

        table = new JTable(model);
        rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);
        jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    int selectedRowIndex = table.getSelectedRow();
                    selectedRowIndex = table.convertRowIndexToModel(selectedRowIndex);

                    // Retrieve data from the selected row in the model
                    String id = model.getValueAt(selectedRowIndex, 0).toString();
                    String name = model.getValueAt(selectedRowIndex, 1).toString();
                    Date dateOfBirth = (Date) model.getValueAt(selectedRowIndex, 2);
                    int gender = ("Male".equals(model.getValueAt(selectedRowIndex, 3).toString())) ? 0 : 1;

                    String phone = model.getValueAt(selectedRowIndex, 4).toString();
                    String address = model.getValueAt(selectedRowIndex, 5).toString();
                    String classId = model.getValueAt(selectedRowIndex, 6).toString();
                    
                    // Create a new Teacher object with the parsed data
                    Teacher teacher = new Teacher(id, name, dateOfBirth, gender, phone,address,classId);

                    // Open the ManageTeacherJFrame to display detailed teacher information
                    ManageTeacherJFrame frame = new ManageTeacherJFrame(teacher, "edit");
                    frame.setTitle("Teacher Information");
                    frame.setResizable(false);
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                }
            }
        });
        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(50);
        table.validate();
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.getViewport().add(table);
        scrollPane.setPreferredSize(new Dimension(1100, 400));
        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(scrollPane);
        jpnView.validate();
        jpnView.repaint();
    }

    public void setEvent() {
        btnAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ManageTeacherJFrame frame = new ManageTeacherJFrame((new Teacher("", "", null,0, "", "","")), "add");
                frame.setTitle("Teacher Information");
                frame.setResizable(false);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnAdd.setBackground(new Color(0, 200, 83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnAdd.setBackground(new Color(100, 221, 23));
            }

        });
        btnRefresh.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    System.out.println("Refresh clicked");
                    // Retrieve the updated data from the database
                    setDataToTable();// Create a new RowSorter for the updated model
                } catch (SQLException ex) {
                    Logger.getLogger(TeacherController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(TeacherController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnRefresh.setBackground(new Color(252, 44, 3));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnRefresh.setBackground(Color.GRAY);
            }
        });

    }
}