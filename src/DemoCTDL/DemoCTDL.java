package DemoCTDL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Stack;

//Stack_Visualizer - Testing 1
public class DemoCTDL extends JFrame {
    private Stack<Integer> stack;
    private JPanel stackPanel;
    private JTextField inputField;
    private JLabel statusLabel;
    private static final int MAX_STACK_SIZE = 10;

    public DemoCTDL() {
        stack = new Stack<>();
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Stack Visualizer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 600);
        setLayout(new BorderLayout());

        // Input panel
        JPanel inputPanel = new JPanel();
        inputField = new JTextField(10);
        JButton pushButton = new JButton("Push");
        JButton popButton = new JButton("Pop");
        JButton peekButton = new JButton("Peek");
        JButton clearButton = new JButton("Clear");

        inputPanel.add(new JLabel("Value:"));
        inputPanel.add(inputField);
        inputPanel.add(pushButton);
        inputPanel.add(popButton);
        inputPanel.add(peekButton);
        inputPanel.add(clearButton);

        // Stack visualization panel
        stackPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawStack(g);
            }
        };
        stackPanel.setPreferredSize(new Dimension(300, 400));
        stackPanel.setBackground(Color.WHITE);

        // Status label
        statusLabel = new JLabel("Stack is empty");
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Add components to frame
        add(inputPanel, BorderLayout.NORTH);
        add(stackPanel, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);

        // Add action listeners
        pushButton.addActionListener(e -> push());
        popButton.addActionListener(e -> pop());
        peekButton.addActionListener(e -> peek());
        clearButton.addActionListener(e -> clear());

        setLocationRelativeTo(null);
    }

    private void drawStack(Graphics g) {
        int width = stackPanel.getWidth();
        int height = stackPanel.getHeight();
        int boxHeight = 40;
        int boxWidth = 100;
        int startX = (width - boxWidth) / 2;
        int startY = height - boxHeight - 10;

        // Draw stack container
        g.setColor(Color.BLACK);
        g.drawRect(startX - 5, 10, boxWidth + 10, height - 20);

        // Draw stack elements
        for (int i = 0; i < stack.size(); i++) {
            int value = stack.get(i);
            int y = startY - (i * boxHeight);
            
            // Draw box
            g.setColor(new Color(100, 200, 255));
            g.fillRect(startX, y, boxWidth, boxHeight - 5);
            g.setColor(Color.BLACK);
            g.drawRect(startX, y, boxWidth, boxHeight - 5);
            
            // Draw value
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 16));
            String text = String.valueOf(value);
            FontMetrics fm = g.getFontMetrics();
            int textX = startX + (boxWidth - fm.stringWidth(text)) / 2;
            int textY = y + (boxHeight + fm.getAscent()) / 2;
            g.drawString(text, textX, textY);
        }
    }

    private void push() {
        try {
            if (stack.size() >= MAX_STACK_SIZE) {
                JOptionPane.showMessageDialog(this, "Stack is full!");
                return;
            }
            int value = Integer.parseInt(inputField.getText());
            stack.push(value);
            inputField.setText("");
            statusLabel.setText("Pushed: " + value);
            stackPanel.repaint();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number!");
        }
    }

    private void pop() {
        if (stack.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Stack is empty!");
            return;
        }
        int value = stack.pop();
        statusLabel.setText("Popped: " + value);
        stackPanel.repaint();
    }

    private void peek() {
        if (stack.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Stack is empty!");
            return;
        }
        int value = stack.peek();
        statusLabel.setText("Top element: " + value);
    }

    private void clear() {
        stack.clear();
        statusLabel.setText("Stack cleared");
        stackPanel.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DemoCTDL().setVisible(true);
        });
    }
} 