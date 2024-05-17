import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VSCWindow extends JFrame {
    public VSCWindow() {
        setTitle("VS Code - Inicio");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openFolderItem = new JMenuItem("Open Folder...");
        JMenuItem openFileItem = new JMenuItem("Open File...");
        fileMenu.add(openFolderItem);
        fileMenu.add(openFileItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);
        
        // Panel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        
        // Panel izquierdo (similar a la barra lateral de VS Code)
        JPanel sidePanel = new JPanel();
        sidePanel.setLayout(new BoxLayout(sidePanel, BoxLayout.Y_AXIS));
        sidePanel.setPreferredSize(new Dimension(200, getHeight()));
        
        JButton explorerButton = new JButton("Explorer");
        JButton searchButton = new JButton("Search");
        JButton gitButton = new JButton("Source Control");
        JButton debugButton = new JButton("Run and Debug");
        JButton extensionsButton = new JButton("Extensions");
        
        sidePanel.add(explorerButton);
        sidePanel.add(searchButton);
        sidePanel.add(gitButton);
        sidePanel.add(debugButton);
        sidePanel.add(extensionsButton);
        
        mainPanel.add(sidePanel, BorderLayout.WEST);
        
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VSCWindow().setVisible(true);
            }
        });
    }
}