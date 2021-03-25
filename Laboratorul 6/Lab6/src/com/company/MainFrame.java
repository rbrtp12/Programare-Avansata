package com.company;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    ConfigPanel configPanel;
    ControlPanel controlPanel;
    DrawingPanel canvas;

    public MainFrame()
    {
        super("bagameas pl in el java");
        init();
    }

    public void init()
    {
        configPanel = new ConfigPanel(this);
        add(configPanel, BorderLayout.NORTH);
        canvas = new DrawingPanel(this);
        add(canvas, BorderLayout.CENTER);
        pack();

    }

}
