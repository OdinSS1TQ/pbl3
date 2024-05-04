package controller.dashboard_controller;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
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
import model.boardingroom.BoardingroomDatabase;
import model.classroom.ClassroomDatabase;
import model.people.pupil.PupilDatabase;
import model.people.teacher.Teacher;
import model.people.teacher.TeacherDatabase;
import view.dashboard.admin_dashboard.ManageTeacherJFrame;

public class InitController {

    private JPanel jpnView;
    private String FileName = "text_table.txt";
    private JTextField jtfSearch;
    private JLabel teacherLabel;
    private JLabel pupilLabel;
    private JLabel classroomLabel;
    private JLabel boardingroomLabel;
    private JTable table;
    private String[] listColumn = {"ID", "Name", "Class", "Time"};
    private TableRowSorter<TableModel> rowSorter = null;

    public InitController(JPanel jpnView, JTextField jtfSearch, JLabel teacherLabel, JLabel pupilLabel, JLabel classroomLabel, JLabel boardingroomLabel) {
        this.jpnView = jpnView;
        this.jtfSearch = jtfSearch;
        this.teacherLabel = teacherLabel;
        this.pupilLabel = pupilLabel;
        this.classroomLabel = classroomLabel;
        this.boardingroomLabel = boardingroomLabel;
    }

    public static DefaultTableModel loadFromFile(String fileName) {
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String[] columns = {"ID", "Name", "Class", "Time"};
        model.setColumnIdentifiers(columns);
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] rowData = line.split(",");
                model.addRow(new Object[]{
                    rowData[0], rowData[1], rowData[2], rowData[3]
                });
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return model;
    }

    public static void saveToFile(JTable table, String fileName) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = model.getRowCount();
        int colCount = model.getColumnCount();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int row = 0; row < rowCount; row++) {
                StringBuilder rowString = new StringBuilder();
                for (int col = 0; col < colCount; col++) {
                    rowString.append(model.getValueAt(row, col).toString());
                    if (col < colCount - 1) {
                        rowString.append(",");
                    }
                }
                writer.write(rowString.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setDataToTable() throws SQLException, ClassNotFoundException {
        List<Teacher> listItem = TeacherDatabase.getAllTeacher("SELECT * FROM teacher where ID="+"");
        DefaultTableModel model = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        model.setColumnIdentifiers(listColumn);

        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedTime = currentTime.format(formatter);

        for (Teacher teacher : listItem) {
            model.addRow(new Object[]{
                teacher.getID(),
                teacher.getName(),
                teacher.getClassID(),
                formattedTime // Adding the current date/time to each row
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

        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(50);
        table.validate();

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(1100, 400));

        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(scrollPane, BorderLayout.CENTER);
        jpnView.validate();
        jpnView.repaint();

        saveToFile(table, FileName);

        // Update labels with counts
        updateLabelCounts();
    }

    private void updateLabelCounts() throws ClassNotFoundException {
        try {
            // Get counts from the database using methods from TeacherDatabase class
            int teacherCount = TeacherDatabase.countTeachers();
            int pupilCount = PupilDatabase.countPupils(); // Assuming countPupils() is a method in PupilDatabase class
            int classroomCount = ClassroomDatabase.countClassrooms(); // Assuming countClassrooms() is a method in ClassroomDatabase class
            int boardingroomCount = BoardingroomDatabase.countBoardingrooms(); // Assuming countBoardingrooms() is a method in BoardingroomDatabase class

            // Update the labels with the counts
            teacherLabel.setText(""+teacherCount);
            pupilLabel.setText(""+pupilCount);
            classroomLabel.setText(""+classroomCount);
            boardingroomLabel.setText(""+boardingroomCount);
        } catch (SQLException ex) {
            // Handle exception
            ex.printStackTrace();
        }
    }
}
