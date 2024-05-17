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
        
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VSCWindow().setVisible(true);
            }
        });
    }
}