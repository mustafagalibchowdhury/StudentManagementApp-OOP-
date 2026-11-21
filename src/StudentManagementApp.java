import javax.swing.*;
import java.awt.*;

public class StudentManagementApp extends JFrame {

    JLabel titleLabel;
    JLabel idLabel, nameLabel, deptLabel, cgpaLabel;
    JTextField idField, nameField, deptField, cgpaField;

    StudentManagementApp() {
        setTitle("Student Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setSize(700, 520);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        Font titleFont = new Font("Arial", Font.BOLD, 22);
        Font labelFont = new Font("Arial", Font.BOLD, 14);

        titleLabel = new JLabel("Student Management System");
        titleLabel.setFont(titleFont);
        titleLabel.setBounds(190, 15, 350, 35);
        add(titleLabel);


        idLabel = new JLabel("Student ID:");
        idLabel.setFont(labelFont);
        idLabel.setBounds(40, 75, 110, 30);
        add(idLabel);

        idField = new JTextField();
        idField.setBounds(150, 75, 180, 30);
        add(idField);


        nameLabel = new JLabel("Full Name:");
        nameLabel.setFont(labelFont);
        nameLabel.setBounds(40, 120, 110, 30);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(150, 120, 180, 30);
        add(nameField);


        deptLabel = new JLabel("Department:");
        deptLabel.setFont(labelFont);
        deptLabel.setBounds(40, 165, 110, 30);
        add(deptLabel);

        deptField = new JTextField();
        deptField.setBounds(150, 165, 180, 30);
        add(deptField);

       
        cgpaLabel = new JLabel("CGPA:");
        cgpaLabel.setFont(labelFont);
        cgpaLabel.setBounds(40, 210, 110, 30);
        add(cgpaLabel);

        cgpaField = new JTextField();
        cgpaField.setBounds(150, 210, 180, 30);
        add(cgpaField);

        setVisible(true);
    }

    public static void main(String[] args) {
        new StudentManagementApp();
    }
}