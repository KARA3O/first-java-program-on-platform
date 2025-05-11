package group1.abc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;

public class ExpenseTracker extends JFrame {
    private JTextField dateField, categoryField, amountField;
    private JTextArea displayArea;
    private ArrayList<Expense> expenses = new ArrayList<>();

    public ExpenseTracker() {
        setTitle("Student Expense Tracker");
        setSize(450, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));

        inputPanel.add(new JLabel("Date (yyyy-mm-dd):"));
        dateField = new JTextField();
        inputPanel.add(dateField);

        inputPanel.add(new JLabel("Category:"));
        categoryField = new JTextField();
        inputPanel.add(categoryField);

        inputPanel.add(new JLabel("Amount:"));
        amountField = new JTextField();
        inputPanel.add(amountField);

        JButton addButton = new JButton("Add Expense");
        addButton.addActionListener(e -> addExpense());
        inputPanel.add(addButton);

        JButton loadButton = new JButton("Load Expenses");
        loadButton.addActionListener(e -> loadExpenses());
        inputPanel.add(loadButton);

        add(inputPanel, BorderLayout.NORTH);

        displayArea = new JTextArea();
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);

        setVisible(true);
    }

    private void addExpense() {
        try {
            String date = dateField.getText().trim();
            String category = categoryField.getText().trim();
            double amount = Double.parseDouble(amountField.getText().trim());

            Expense exp = new Expense(date, category, amount);
            expenses.add(exp);
            saveExpenseToFile(exp);

            displayArea.append("Added: " + exp.getSummary() + "\n");

            // Clear fields
            dateField.setText("");
            categoryField.setText("");
            amountField.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter correct values.");
        }
    }

    private void saveExpenseToFile(Expense exp) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("expenses.txt", true))) {
            writer.write(exp.getDate() + "," + exp.getCategory() + "," + exp.getAmount());
            writer.newLine();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error saving expense to file.");
        }
    }

    private void loadExpenses() {
        displayArea.setText("Loaded Expenses:\n");
        try (BufferedReader reader = new BufferedReader(new FileReader("expenses.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    Expense exp = new Expense(parts[0], parts[1], Double.parseDouble(parts[2]));
                    displayArea.append(exp.getSummary() + "\n");
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading expenses from file.");
        }
    }

    public static void main(String[] args) {
        new ExpenseTracker();
    }
}