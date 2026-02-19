package com.vape.injector;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.dnd.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.*;
import java.util.jar.*;
import com.sun.tools.attach.*;

public class EnhancedInjector extends JFrame {
    
    // Modern color palette - Dark cyberpunk theme
    private static final Color BG_PRIMARY = new Color(10, 12, 16);
    private static final Color BG_SECONDARY = new Color(16, 20, 28);
    private static final Color BG_TERTIARY = new Color(24, 28, 38);
    private static final Color BG_HOVER = new Color(32, 38, 52);
    private static final Color ACCENT_PRIMARY = new Color(88, 166, 255);
    private static final Color ACCENT_SECONDARY = new Color(118, 255, 186);
    private static final Color SUCCESS = new Color(118, 255, 186);
    private static final Color WARNING = new Color(255, 196, 88);
    private static final Color DANGER = new Color(255, 107, 129);
    private static final Color TEXT_PRIMARY = new Color(236, 240, 248);
    private static final Color TEXT_SECONDARY = new Color(156, 163, 175);
    private static final Color TEXT_MUTED = new Color(100, 107, 120);
    
    private JPanel processListPanel;
    private JLabel agentLabel;
    private JButton injectBtn;
    private JLabel statusLabel;
    private JProgressBar progressBar;
    private File selectedAgent;
    private ProcessInfo selectedProcess;
    private List<ProcessInfo> processes = new ArrayList<>();
    private JComboBox<String> recentFilesCombo;
    private DefaultComboBoxModel<String> recentFilesModel;
    private List<String> recentFiles = new ArrayList<>();
    private JCheckBox autoWrapCheckbox;
    private JTextArea logArea;
    
    public EnhancedInjector() {
        setTitle("Universal Injector Pro");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(650, 800);
        setLocationRelativeTo(null);
        setResizable(true);
        
        // Modern UI
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}
        
        // Main container
        JPanel main = new JPanel(new BorderLayout(0, 0));
        main.setBackground(BG_PRIMARY);
        
        // Top bar with gradient
        JPanel topBar = createTopBar();
        main.add(topBar, BorderLayout.NORTH);
        
        // Content area
        JPanel content = createContent();
        JScrollPane contentScroll = new JScrollPane(content);
        contentScroll.setBorder(null);
        contentScroll.getVerticalScrollBar().setUnitIncrement(16);
        main.add(contentScroll, BorderLayout.CENTER);
        
        // Bottom status bar
        JPanel bottomBar = createBottomBar();
        main.add(bottomBar, BorderLayout.SOUTH);
        
        setContentPane(main);
        
        // Load recent files
        loadRecentFiles();
        refreshProcesses();
        
        // Add keyboard shortcuts
        setupKeyBindings();
    }
    
    private JPanel createTopBar() {
        JPanel bar = new JPanel(new BorderLayout(15, 0));
        bar.setBackground(BG_SECONDARY);
        bar.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createMatteBorder(0, 0, 1, 0, BG_HOVER),
            BorderFactory.createEmptyBorder(20, 30, 20, 30)
        ));
        
        // Left side - Title
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));
        titlePanel.setOpaque(false);
        
        JLabel title = new JLabel("Universal Injector");
        title.setFont(new Font("SF Pro Display", Font.BOLD, 32));
        title.setForeground(TEXT_PRIMARY);
        
        JLabel subtitle = new JLabel("Advanced Java Agent Injection Tool");
        subtitle.setFont(new Font("SF Pro Text", Font.PLAIN, 13));
        subtitle.setForeground(TEXT_SECONDARY);
        
        titlePanel.add(title);
        titlePanel.add(Box.createVerticalStrut(5));
        titlePanel.add(subtitle);
        
        // Right side - Status indicator
        JPanel statusPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        statusPanel.setOpaque(false);
        
        JLabel statusDot = new JLabel("●");
        statusDot.setFont(new Font("Arial", Font.PLAIN, 20));
        statusDot.setForeground(SUCCESS);
        
        JLabel statusText = new JLabel("System Ready");
        statusText.setFont(new Font("SF Pro Text", Font.BOLD, 13));
        statusText.setForeground(TEXT_SECONDARY);
        
        statusPanel.add(statusDot);
        statusPanel.add(statusText);
        
        bar.add(titlePanel, BorderLayout.WEST);
        bar.add(statusPanel, BorderLayout.EAST);
        
        return bar;
    }
    
    private JPanel createContent() {
        JPanel content = new JPanel();
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        content.setBackground(BG_PRIMARY);
        content.setBorder(BorderFactory.createEmptyBorder(25, 30, 25, 30));
        
        // Process section
        content.add(createProcessSection());
        content.add(Box.createVerticalStrut(25));
        
        // Agent section
        content.add(createAgentSection());
        content.add(Box.createVerticalStrut(25));
        
        // Options section
        content.add(createOptionsSection());
        content.add(Box.createVerticalStrut(25));
        
        // Inject button
        content.add(createInjectButton());
        content.add(Box.createVerticalStrut(25));
        
        // Log section
        content.add(createLogSection());
        
        return content;
    }
    
    private JPanel createProcessSection() {
        JPanel section = new JPanel();
        section.setLayout(new BoxLayout(section, BoxLayout.Y_AXIS));
        section.setOpaque(false);
        section.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        // Header
        JPanel header = new JPanel(new BorderLayout());
        header.setOpaque(false);
        header.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        
        JLabel label = new JLabel("TARGET PROCESSES");
        label.setFont(new Font("SF Pro Text", Font.BOLD, 11));
        label.setForeground(TEXT_MUTED);
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JButton refreshBtn = createModernButton("↻ Refresh", ACCENT_SECONDARY, false);
        refreshBtn.addActionListener(e -> refreshProcesses());
        
        header.add(label, BorderLayout.WEST);
        header.add(refreshBtn, BorderLayout.EAST);
        
        section.add(header);
        section.add(Box.createVerticalStrut(12));
        
        // Process list
        processListPanel = new JPanel();
        processListPanel.setLayout(new BoxLayout(processListPanel, BoxLayout.Y_AXIS));
        processListPanel.setBackground(BG_SECONDARY);
        processListPanel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(BG_HOVER, 1),
            BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));
        
        JScrollPane scroll = new JScrollPane(processListPanel);
        scroll.setBorder(null);
        scroll.setBackground(BG_SECONDARY);
        scroll.setPreferredSize(new Dimension(590, 200));
        scroll.setMaximumSize(new Dimension(Integer.MAX_VALUE, 200));
        scroll.getVerticalScrollBar().setUnitIncrement(16);
        
        section.add(scroll);
        section.setMaximumSize(new Dimension(Integer.MAX_VALUE, 252));
        
        return section;
    }
    
    private JPanel createAgentSection() {
        JPanel section = new JPanel();
        section.setLayout(new BoxLayout(section, BoxLayout.Y_AXIS));
        section.setOpaque(false);
        section.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        // Header
        JLabel label = new JLabel("AGENT JAR FILE");
        label.setFont(new Font("SF Pro Text", Font.BOLD, 11));
        label.setForeground(TEXT_MUTED);
        label.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        section.add(label);
        section.add(Box.createVerticalStrut(12));
        
        // Drag & Drop area
        JPanel dropPanel = new JPanel(new BorderLayout(15, 0));
        dropPanel.setBackground(BG_SECONDARY);
        dropPanel.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(BG_HOVER, 2, true),
            BorderFactory.createEmptyBorder(20, 20, 20, 20)
        ));
        dropPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 100));
        
        // Enable drag and drop
        new DropTarget(dropPanel, new DropTargetAdapter() {
            @Override
            public void drop(DropTargetDropEvent dtde) {
                try {
                    dtde.acceptDrop(DnDConstants.ACTION_COPY);
                    @SuppressWarnings("unchecked")
                    List<File> files = (List<File>) dtde.getTransferable()
                        .getTransferData(DataFlavor.javaFileListFlavor);
                    
                    if (!files.isEmpty() && files.get(0).getName().endsWith(".jar")) {
                        selectAgentFile(files.get(0));
                    }
                } catch (Exception ex) {
                    log("Error: " + ex.getMessage(), DANGER);
                }
            }
        });
        
        // Icon and text
        JPanel iconPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 0));
        iconPanel.setOpaque(false);
        
        JLabel icon = new JLabel("📦");
        icon.setFont(new Font("Arial", Font.PLAIN, 32));
        
        agentLabel = new JLabel("Drop JAR here or click to browse");
        agentLabel.setFont(new Font("SF Pro Text", Font.PLAIN, 14));
        agentLabel.setForeground(TEXT_SECONDARY);
        
        iconPanel.add(icon);
        iconPanel.add(agentLabel);
        
        // Browse button
        JButton browseBtn = createModernButton("Browse Files", ACCENT_PRIMARY, false);
        browseBtn.addActionListener(e -> browseForAgent());
        
        dropPanel.add(iconPanel, BorderLayout.CENTER);
        dropPanel.add(browseBtn, BorderLayout.EAST);
        
        // Make clickable
        dropPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        dropPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                browseForAgent();
            }
        });
        
        section.add(dropPanel);
        section.add(Box.createVerticalStrut(12));
        
        // Recent files dropdown
        JPanel recentPanel = new JPanel(new BorderLayout(10, 0));
        recentPanel.setOpaque(false);
        recentPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));
        
        JLabel recentLabel = new JLabel("Recent:");
        recentLabel.setFont(new Font("SF Pro Text", Font.PLAIN, 12));
        recentLabel.setForeground(TEXT_SECONDARY);
        
        recentFilesModel = new DefaultComboBoxModel<>();
        recentFilesCombo = new JComboBox<>(recentFilesModel);
        recentFilesCombo.setFont(new Font("SF Pro Text", Font.PLAIN, 12));
        recentFilesCombo.setBackground(BG_TERTIARY);
        recentFilesCombo.setForeground(TEXT_PRIMARY);
      recentFilesCombo.addActionListener(e -> {
    String selected = (String) recentFilesCombo.getSelectedItem();
    if (selected != null && !selected.equals("No recent files")) {
        // Extract path from "filename.jar (/path/to/file.jar)"
        int start = selected.indexOf('(');
        int end = selected.lastIndexOf(')');
        if (start > 0 && end > start) {
            String path = selected.substring(start + 1, end);
            File file = new File(path);
            if (file.exists()) {
                selectAgentFile(file);
            } else {
                log("File not found: " + path, DANGER);
            }
        }
    }
});
        
        recentPanel.add(recentLabel, BorderLayout.WEST);
        recentPanel.add(recentFilesCombo, BorderLayout.CENTER);
        
        section.add(recentPanel);
        section.setMaximumSize(new Dimension(Integer.MAX_VALUE, 162));
        
        return section;
    }
    
    private JPanel createOptionsSection() {
        JPanel section = new JPanel();
        section.setLayout(new BoxLayout(section, BoxLayout.Y_AXIS));
        section.setOpaque(false);
        section.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JLabel label = new JLabel("OPTIONS");
        label.setFont(new Font("SF Pro Text", Font.BOLD, 11));
        label.setForeground(TEXT_MUTED);
        
        section.add(label);
        section.add(Box.createVerticalStrut(12));
        
        // Options panel
        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new BoxLayout(optionsPanel, BoxLayout.Y_AXIS));
        optionsPanel.setBackground(BG_SECONDARY);
        optionsPanel.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(BG_HOVER, 1, true),
            BorderFactory.createEmptyBorder(15, 15, 15, 15)
        ));
        optionsPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 120));
        
        // Auto-wrap checkbox
        autoWrapCheckbox = new JCheckBox("Automatically wrap JAR in UniversalAgent");
        autoWrapCheckbox.setSelected(true);
        autoWrapCheckbox.setFont(new Font("SF Pro Text", Font.PLAIN, 13));
        autoWrapCheckbox.setForeground(TEXT_PRIMARY);
        autoWrapCheckbox.setBackground(BG_SECONDARY);
        autoWrapCheckbox.setFocusPainted(false);
        
        JLabel autoWrapDesc = new JLabel("Wraps non-agent JARs to make them injectable");
        autoWrapDesc.setFont(new Font("SF Pro Text", Font.PLAIN, 11));
        autoWrapDesc.setForeground(TEXT_MUTED);
        autoWrapDesc.setBorder(BorderFactory.createEmptyBorder(0, 25, 0, 0));
        
        optionsPanel.add(autoWrapCheckbox);
        optionsPanel.add(Box.createVerticalStrut(5));
        optionsPanel.add(autoWrapDesc);
        
        section.add(optionsPanel);
        section.setMaximumSize(new Dimension(Integer.MAX_VALUE, 155));
        
        return section;
    }
    
    private JPanel createInjectButton() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setOpaque(false);
        panel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
        
        injectBtn = createModernButton("INJECT AGENT", ACCENT_PRIMARY, true);
        injectBtn.setEnabled(false);
        injectBtn.addActionListener(e -> inject());
        
        panel.add(injectBtn, BorderLayout.CENTER);
        
        return panel;
    }
    
    private JPanel createLogSection() {
        JPanel section = new JPanel();
        section.setLayout(new BoxLayout(section, BoxLayout.Y_AXIS));
        section.setOpaque(false);
        section.setAlignmentX(Component.LEFT_ALIGNMENT);
        
        JLabel label = new JLabel("ACTIVITY LOG");
        label.setFont(new Font("SF Pro Text", Font.BOLD, 11));
        label.setForeground(TEXT_MUTED);
        
        section.add(label);
        section.add(Box.createVerticalStrut(12));
        
        // Log area
        logArea = new JTextArea();
        logArea.setEditable(false);
        logArea.setFont(new Font("JetBrains Mono", Font.PLAIN, 11));
        logArea.setBackground(BG_SECONDARY);
        logArea.setForeground(TEXT_SECONDARY);
        logArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        logArea.setLineWrap(true);
        logArea.setWrapStyleWord(true);
        
        JScrollPane logScroll = new JScrollPane(logArea);
        logScroll.setBorder(new LineBorder(BG_HOVER, 1));
        logScroll.setPreferredSize(new Dimension(590, 150));
        logScroll.setMaximumSize(new Dimension(Integer.MAX_VALUE, 150));
        
        section.add(logScroll);
        section.setMaximumSize(new Dimension(Integer.MAX_VALUE, 175));
        
        log("System initialized", TEXT_SECONDARY);
        
        return section;
    }
    
    private JPanel createBottomBar() {
        JPanel bar = new JPanel(new BorderLayout());
        bar.setBackground(BG_SECONDARY);
        bar.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createMatteBorder(1, 0, 0, 0, BG_HOVER),
            BorderFactory.createEmptyBorder(15, 30, 15, 30)
        ));
        
        statusLabel = new JLabel("Ready");
        statusLabel.setFont(new Font("SF Pro Text", Font.PLAIN, 12));
        statusLabel.setForeground(TEXT_SECONDARY);
        
        progressBar = new JProgressBar();
        progressBar.setIndeterminate(false);
        progressBar.setStringPainted(true);
        progressBar.setVisible(false);
        progressBar.setForeground(ACCENT_PRIMARY);
        progressBar.setBackground(BG_TERTIARY);
        progressBar.setBorder(null);
        progressBar.setPreferredSize(new Dimension(200, 20));
        
        JLabel version = new JLabel("v2.0.0");
        version.setFont(new Font("SF Pro Text", Font.PLAIN, 11));
        version.setForeground(TEXT_MUTED);
        
        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 0));
        leftPanel.setOpaque(false);
        leftPanel.add(statusLabel);
        leftPanel.add(progressBar);
        
        bar.add(leftPanel, BorderLayout.WEST);
        bar.add(version, BorderLayout.EAST);
        
        return bar;
    }
    
    private JButton createModernButton(String text, Color color, boolean large) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("SF Pro Text", large ? Font.BOLD : Font.BOLD, large ? 14 : 12));
        btn.setForeground(TEXT_PRIMARY);
        btn.setBackground(color);
        btn.setBorder(BorderFactory.createEmptyBorder(large ? 15 : 10, large ? 30 : 20, large ? 15 : 10, large ? 30 : 20));
        btn.setFocusPainted(false);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn.setOpaque(true);
        
        // Hover effect
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn.setBackground(color.brighter());
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                btn.setBackground(color);
            }
        });
        
        return btn;
    }
    
    private void refreshProcesses() {
        processListPanel.removeAll();
        processes.clear();
        selectedProcess = null;
        updateInjectButton();
        
        log("Scanning for Java processes...", TEXT_SECONDARY);
        status("Scanning...");
        
        new SwingWorker<List<ProcessInfo>, Void>() {
            @Override
            protected List<ProcessInfo> doInBackground() {
                return findProcesses();
            }
            
            @Override
            protected void done() {
                try {
                    List<ProcessInfo> found = get();
                    processes.addAll(found);
                    
                    if (found.isEmpty()) {
                        JLabel empty = new JLabel("<html><center><div style='padding:20px'>"
                            + "No Java processes found<br><br>"
                            + "<span style='color:#64676F'>Launch your target application and click Refresh</span>"
                            + "</div></center></html>");
                        empty.setFont(new Font("SF Pro Text", Font.PLAIN, 13));
                        empty.setForeground(TEXT_SECONDARY);
                        empty.setHorizontalAlignment(SwingConstants.CENTER);
                        processListPanel.add(empty);
                        log("No processes found", WARNING);
                        status("No processes found");
                    } else {
                        for (ProcessInfo p : found) {
                            processListPanel.add(createProcessCard(p));
                            processListPanel.add(Box.createVerticalStrut(8));
                        }
                        log("Found " + found.size() + " process(es)", SUCCESS);
                        status("Found " + found.size() + " processes");
                    }
                    
                    processListPanel.revalidate();
                    processListPanel.repaint();
                } catch (Exception e) {
                    log("Error: " + e.getMessage(), DANGER);
                    status("Scan failed");
                }
            }
        }.execute();
    }
    
    private JPanel createProcessCard(ProcessInfo proc) {
        JPanel card = new JPanel(new BorderLayout(15, 0));
        card.setBackground(BG_TERTIARY);
        card.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(BG_HOVER, 1, true),
            BorderFactory.createEmptyBorder(12, 15, 12, 15)
        ));
        card.setMaximumSize(new Dimension(Integer.MAX_VALUE, 60));
        card.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        // Info panel
        JPanel info = new JPanel();
        info.setLayout(new BoxLayout(info, BoxLayout.Y_AXIS));
        info.setOpaque(false);
        
        JLabel name = new JLabel(proc.name);
        name.setFont(new Font("SF Pro Text", Font.BOLD, 13));
        name.setForeground(TEXT_PRIMARY);
        
        JLabel pid = new JLabel("PID: " + proc.pid + " | " + proc.version);
        pid.setFont(new Font("JetBrains Mono", Font.PLAIN, 11));
        pid.setForeground(TEXT_MUTED);
        
        info.add(name);
        info.add(Box.createVerticalStrut(4));
        info.add(pid);
        
        // Checkbox
        JLabel check = new JLabel("○");
        check.setFont(new Font("Arial", Font.PLAIN, 20));
        check.setForeground(TEXT_MUTED);
        proc.checkLabel = check;
        proc.card = card;
        
        card.add(info, BorderLayout.CENTER);
        card.add(check, BorderLayout.EAST);
        
        // Click handler
        card.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (selectedProcess != proc) {
                    card.setBackground(BG_HOVER);
                }
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                if (selectedProcess != proc) {
                    card.setBackground(BG_TERTIARY);
                }
            }
            
            @Override
            public void mouseClicked(MouseEvent e) {
                selectProcess(proc);
            }
        });
        
        return card;
    }
    
    private void selectProcess(ProcessInfo proc) {
        for (ProcessInfo p : processes) {
            p.card.setBackground(BG_TERTIARY);
            p.checkLabel.setText("○");
            p.checkLabel.setForeground(TEXT_MUTED);
        }
        
        selectedProcess = proc;
        proc.card.setBackground(new Color(88, 166, 255, 30));
        proc.checkLabel.setText("●");
        proc.checkLabel.setForeground(ACCENT_PRIMARY);
        
        updateInjectButton();
        log("Selected: " + proc.name, ACCENT_PRIMARY);
        status("Process selected: " + proc.name);
    }
    
    private void browseForAgent() {
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("JAR Files", "jar"));
        fc.setDialogTitle("Select Agent JAR");
        
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            selectAgentFile(fc.getSelectedFile());
        }
    }
    
   private void selectAgentFile(File file) {
    // Get the absolute path to avoid relative path issues
    try {
        selectedAgent = file.getCanonicalFile();
    } catch (IOException e) {
        selectedAgent = file.getAbsoluteFile();
    }
    
    agentLabel.setText(file.getName());
    agentLabel.setForeground(TEXT_PRIMARY);
    
    addToRecentFiles(selectedAgent.getAbsolutePath());
    updateInjectButton();
    
    log("Selected agent: " + selectedAgent.getAbsolutePath(), ACCENT_SECONDARY);
    status("Agent ready: " + file.getName());
}
    
    private void updateInjectButton() {
        boolean ready = selectedProcess != null && selectedAgent != null;
        injectBtn.setEnabled(ready);
        
        if (ready) {
            injectBtn.setBackground(ACCENT_PRIMARY);
            injectBtn.setText("INJECT AGENT →");
        } else {
            injectBtn.setBackground(BG_HOVER);
            injectBtn.setText("SELECT PROCESS & AGENT");
        }
    }
    
    private void inject() {
        if (selectedProcess == null || selectedAgent == null) return;
        
        injectBtn.setEnabled(false);
        progressBar.setVisible(true);
        progressBar.setIndeterminate(true);
        status("Injecting...");
        log("Starting injection process...", WARNING);
        
        new SwingWorker<Boolean, String>() {
            String error;
            File agentToInject;
            
            @Override
            protected Boolean doInBackground() throws Exception {
                // Check if JAR needs wrapping
                agentToInject = selectedAgent;
                
                if (autoWrapCheckbox.isSelected() && !isValidAgent(selectedAgent)) {
                    publish("JAR is not a valid agent, wrapping...");
                    agentToInject = wrapInUniversalAgent(selectedAgent);
                    
                    if (agentToInject == null) {
                        error = "Failed to wrap JAR in UniversalAgent";
                        return false;
                    }
                    
                    publish("Wrapped JAR successfully");
                }
                
                // Inject
                publish("Attaching to process...");
                Thread.sleep(500); // Small delay for UI feedback
                
                try {
                    VirtualMachine vm = VirtualMachine.attach(selectedProcess.pid);
                    publish("Loading agent...");
                    vm.loadAgent(agentToInject.getAbsolutePath());
                    vm.detach();
                    publish("Agent loaded successfully");
                    return true;
                } catch (Exception e) {
                    error = e.getMessage();
                    return false;
                }
            }
            
            @Override
            protected void process(List<String> chunks) {
                for (String msg : chunks) {
                    log(msg, ACCENT_SECONDARY);
                }
            }
            
            @Override
            protected void done() {
                try {
                    progressBar.setVisible(false);
                    progressBar.setIndeterminate(false);
                    
                    if (get()) {
                        log("✓ SUCCESS! Agent injected into " + selectedProcess.name, SUCCESS);
                        status("Injection successful!");
                        showSuccessAnimation();
                    } else {
                        log("✗ FAILED: " + error, DANGER);
                        status("Injection failed");
                        JOptionPane.showMessageDialog(EnhancedInjector.this,
                            "Injection failed:\n" + error,
                            "Injection Error",
                            JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception e) {
                    log("✗ FAILED: " + e.getMessage(), DANGER);
                    status("Injection failed");
                }
                
                updateInjectButton();
            }
        }.execute();
    }
    
    private boolean isValidAgent(File jar) {
        try (JarFile jarFile = new JarFile(jar)) {
            Manifest manifest = jarFile.getManifest();
            if (manifest == null) return false;
            
            Attributes attrs = manifest.getMainAttributes();
            return attrs.getValue("Agent-Class") != null || 
                   attrs.getValue("Premain-Class") != null;
        } catch (Exception e) {
            return false;
        }
    }
    
   
private File wrapInUniversalAgent(File targetJar) {
    try {
     log("Creating UniversalAgent wrapper...", ACCENT_SECONDARY);

        // Verify target JAR exists and is readable
        if (!targetJar.exists()) {
            log("Target JAR not found: " + targetJar.getAbsolutePath(), DANGER);
            return null;
        }
        
        if (!targetJar.canRead()) {
            log("Cannot read target JAR: " + targetJar.getAbsolutePath(), DANGER);
            return null;
        }

        // 1️⃣ Create temp directory
        Path tempDir = Files.createTempDirectory("injector-wrap");
        File agentFile = new File(tempDir.toFile(), "agent.jar");

        // 2️⃣ Copy target JAR into temp (use try-catch with better error handling)
        File targetCopy = new File(tempDir.toFile(), "target.jar");
        try {
            Files.copy(targetJar.toPath(), targetCopy.toPath(), StandardCopyOption.REPLACE_EXISTING);
            log("Copied JAR to temp: " + targetCopy.getAbsolutePath(), ACCENT_SECONDARY);
        } catch (IOException e) {
            log("Failed to copy JAR: " + e.getMessage(), DANGER);
            log("Source: " + targetJar.getAbsolutePath(), DANGER);
            log("Dest: " + targetCopy.getAbsolutePath(), DANGER);
            return null;
        }        // 3️⃣ Create UniversalAgent.java
        File javaFile = new File(tempDir.toFile(), "UniversalAgent.java");
       String agentCode =
    "import java.lang.instrument.Instrumentation;\n" +
    "import java.util.jar.*;\n" +
    "import java.io.*;\n" +
    "import java.net.*;\n\n" +
    "public class UniversalAgent {\n" +
    "    public static void agentmain(String args, Instrumentation inst) {\n" +
    "        try {\n" +
    "            System.out.println(\"[UniversalAgent] Starting injection...\");\n" +
    "            \n" +
    "            // Get the agent JAR location properly\n" +
    "            String jarPath = UniversalAgent.class.getProtectionDomain()\n" +
    "                .getCodeSource().getLocation().toURI().getPath();\n" +
    "            System.out.println(\"[UniversalAgent] Agent JAR: \" + jarPath);\n" +
    "            \n" +
    "            JarFile jar = new JarFile(jarPath);\n" +
    "            JarEntry entry = jar.getJarEntry(\"target.jar\");\n" +
    "            \n" +
    "            if (entry != null) {\n" +
    "                System.out.println(\"[UniversalAgent] Extracting target.jar...\");\n" +
    "                File tempJar = File.createTempFile(\"injected\", \".jar\");\n" +
    "                tempJar.deleteOnExit();\n" +
    "                \n" +
    "                try (InputStream in = jar.getInputStream(entry);\n" +
    "                     FileOutputStream out = new FileOutputStream(tempJar)) {\n" +
    "                    byte[] buf = new byte[8192];\n" +
    "                    int len;\n" +
    "                    while ((len = in.read(buf)) > 0) {\n" +
    "                        out.write(buf, 0, len);\n" +
    "                    }\n" +
    "                }\n" +
    "                \n" +
    "                System.out.println(\"[UniversalAgent] Adding to classpath: \" + tempJar.getAbsolutePath());\n" +
    "                inst.appendToSystemClassLoaderSearch(new JarFile(tempJar));\n" +
    "                System.out.println(\"[UniversalAgent] SUCCESS!\");\n" +
    "            } else {\n" +
    "                System.err.println(\"[UniversalAgent] ERROR: target.jar not found in agent!\");\n" +
    "            }\n" +
    "            \n" +
    "            jar.close();\n" +
    "        } catch (Exception e) {\n" +
    "            System.err.println(\"[UniversalAgent] FAILED: \" + e.getMessage());\n" +
    "            e.printStackTrace();\n" +
    "        }\n" +
    "    }\n" +
    "    \n" +
    "    public static void premain(String args, Instrumentation inst) {\n" +
    "        agentmain(args, inst);\n" +
    "    }\n" +
    "}\n";
        Files.writeString(javaFile.toPath(), agentCode);

        // 4️⃣ Compile UniversalAgent.java
        Process compile = new ProcessBuilder("javac", javaFile.getAbsolutePath())
            .redirectErrorStream(true)
            .start();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(compile.getInputStream()))) {
            String line;
            while ((line = br.readLine()) != null) log(line, WARNING);
        }
        if (compile.waitFor() != 0) {
            log("Compilation failed", DANGER);
            return null;
        }

        // 5️⃣ Create manifest
        File manifestFile = new File(tempDir.toFile(), "MANIFEST.MF");
        String manifest =
            "Manifest-Version: 1.0\n" +
            "Agent-Class: UniversalAgent\n" +
            "Premain-Class: UniversalAgent\n" +
            "Can-Redefine-Classes: true\n" +
            "Can-Retransform-Classes: true\n\n"; // important: double newline
        Files.writeString(manifestFile.toPath(), manifest);

        // 6️⃣ Package JAR including UniversalAgent.class and target.jar
        Process jar = new ProcessBuilder(
                "jar", "cvfm", agentFile.getAbsolutePath(),
                manifestFile.getAbsolutePath(),
                "-C", tempDir.toString(), "UniversalAgent.class",
                "-C", tempDir.toString(), "target.jar"
        ).redirectErrorStream(true).start();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(jar.getInputStream()))) {
            String line;
            while ((line = br.readLine()) != null) log(line, WARNING);
        }
        if (jar.waitFor() != 0) {
            log("JAR creation failed", DANGER);
            return null;
        }

        log("UniversalAgent created: " + agentFile.getAbsolutePath(), SUCCESS);
        return agentFile;

    } catch (Exception e) {
        log("Failed to wrap JAR: " + e.getMessage(), DANGER);
        e.printStackTrace();
        return null;
    }
}

    
    private void showSuccessAnimation() {
      
javax.swing.Timer timer = new javax.swing.Timer(100, null);
        final int[] count = {0};
        
        timer.addActionListener(e -> {
            if (count[0] < 3) {
                injectBtn.setBackground(SUCCESS);
                count[0]++;
            } else if (count[0] < 6) {
                injectBtn.setBackground(ACCENT_PRIMARY);
                count[0]++;
            } else {
               
((javax.swing.Timer) e.getSource()).stop();
            }
        });
        
        timer.start();
    }
    
    private List<ProcessInfo> findProcesses() {
        List<ProcessInfo> list = new ArrayList<>();
        try {
            for (VirtualMachineDescriptor vm : VirtualMachine.list()) {
                String d = vm.displayName();
                String name = d.isEmpty() ? "Java Process" : d;
                String version = parseVersion(d);
                list.add(new ProcessInfo(vm.id(), name, version));
            }
        } catch (Exception ignored) {}
        return list;
    }
    
    private String parseVersion(String d) {
        var m = java.util.regex.Pattern.compile("1\\.\\d+(\\.\\d+)?").matcher(d);
        return m.find() ? m.group() : "Unknown";
    }
    
    private void log(String msg, Color color) {
        String timestamp = new java.text.SimpleDateFormat("HH:mm:ss").format(new java.util.Date());
        logArea.append("[" + timestamp + "] " + msg + "\n");
        logArea.setCaretPosition(logArea.getDocument().getLength());
    }
    
    private void status(String msg) {
        statusLabel.setText(msg);
    }
    
    private void loadRecentFiles() {
        try {
            File configFile = new File(System.getProperty("user.home"), ".injector_recent");
            if (configFile.exists()) {
                recentFiles = Files.readAllLines(configFile.toPath());
                updateRecentFilesCombo();
            }
        } catch (Exception ignored) {}
    }
    
    private void saveRecentFiles() {
        try {
            File configFile = new File(System.getProperty("user.home"), ".injector_recent");
            Files.write(configFile.toPath(), recentFiles);
        } catch (Exception ignored) {}
    }
    
   private void addToRecentFiles(String path) {
    // Create new list to avoid concurrent modification
    List<String> newList = new ArrayList<>(recentFiles);
    newList.remove(path);
    newList.add(0, path);
    if (newList.size() > 5) {
        newList = new ArrayList<>(newList.subList(0, 5));
    }
    recentFiles = newList;
    saveRecentFiles();
    updateRecentFilesCombo();
}
    
   private void updateRecentFilesCombo() {
    recentFilesModel.removeAllElements();
    if (recentFiles.isEmpty()) {
        recentFilesModel.addElement("No recent files");
    } else {
        for (String file : recentFiles) {
            // BUG: This includes the parentheses in the display
            recentFilesModel.addElement(new File(file).getName() + " (" + file + ")");
        }
    }
}
    
    private void setupKeyBindings() {
        // Ctrl+R to refresh
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
            .put(KeyStroke.getKeyStroke(KeyEvent.VK_R, KeyEvent.CTRL_DOWN_MASK), "refresh");
        getRootPane().getActionMap().put("refresh", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshProcesses();
            }
        });
        
        // Ctrl+O to open file
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
            .put(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_DOWN_MASK), "open");
        getRootPane().getActionMap().put("open", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                browseForAgent();
            }
        });
        
        // Enter to inject
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
            .put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), "inject");
        getRootPane().getActionMap().put("inject", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (injectBtn.isEnabled()) {
                    inject();
                }
            }
        });
    }
    
    static class ProcessInfo {
        String pid, name, version;
        JPanel card;
        JLabel checkLabel;
        ProcessInfo(String p, String n, String v) {
            pid = p;
            name = n;
            version = v;
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignored) {}
            new EnhancedInjector().setVisible(true);
        });
    }
}
