package Quiz;

import javax.swing.*;
import java.awt.*;

public class GUIGamePanel {
    public GUIGamePanel() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        InformationBuilder information = new InformationBuilder();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.CENTER;

        frame.setVisible(true);
        frame.pack();
        frame.setSize(500, 600);
        frame.add(panel);
        frame.setTitle("Quizkampen");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Color panelColor = new Color(30, 120, 200);
        Color buttonColor = new Color(60, 80, 120);

        panel.setVisible(true);
        panel.setBackground(panelColor);

        JLabel jLabel = new JLabel(information.labelBuilder(), SwingConstants.CENTER);

        jLabel.setOpaque(true);
        jLabel.setBackground(Color.white);
        jLabel.setPreferredSize(new Dimension(200, 150));
        jLabel.setFont(new Font("Arial", Font.BOLD, 16));

        gbc.gridx = 0;
        gbc.weightx = 1;
        gbc.gridy = 0;
        gbc.weighty = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(jLabel, gbc);

        gbc.gridx = 0;
        gbc.weightx = 1;
        gbc.gridy = 1;
        gbc.weighty = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(information.getButton(0), gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        gbc.gridy = 1;
        gbc.weighty = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(information.getButton(1), gbc);

        gbc.gridx = 0;
        gbc.weightx = 1;
        gbc.gridy = 2;
        gbc.weighty = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(information.getButton(2), gbc);

        gbc.gridx = 1;
        gbc.weightx = 1;
        gbc.gridy = 2;
        gbc.weighty = 1;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.BOTH;
        panel.add(information.getButton(3), gbc);

    }
}
