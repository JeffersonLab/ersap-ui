/*
 * Created by JFormDesigner on Wed Jan 17 17:25:23 EST 2024
 */

package org.jlab.ersap.ui;

import java.awt.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import com.jgoodies.forms.factories.*;

/**
 * @author gurjyan
 */
public class Main extends JFrame {
    public Main() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menu2 = new JMenu();
        menu3 = new JMenu();
        menu4 = new JMenu();
        toolBar1 = new JToolBar();
        hSpacer1 = new JPanel(null);
        saveConfigurationButton = new JButton();
        deployProcessesButton = new JButton();
        stopProcessesButton = new JButton();
        scrollPane1 = new JScrollPane();
        componentList = new JList<>();
        designCanvas = new JScrollPane();
        scrollPane3 = new JScrollPane();
        terminal = new JTextArea();
        label1 = new JLabel();
        configurationName = new JTextField();

        //======== this ========
        setTitle("ERSAP");
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //======== menuBar1 ========
                {

                    //======== menu1 ========
                    {
                        menu1.setText("File");
                    }
                    menuBar1.add(menu1);

                    //======== menu2 ========
                    {
                        menu2.setText("Edit");
                    }
                    menuBar1.add(menu2);

                    //======== menu3 ========
                    {
                        menu3.setText("View");
                    }
                    menuBar1.add(menu3);

                    //======== menu4 ========
                    {
                        menu4.setText("Control");
                    }
                    menuBar1.add(menu4);

                    //======== toolBar1 ========
                    {
                        toolBar1.add(hSpacer1);
                        toolBar1.addSeparator();

                        //---- saveConfigurationButton ----
                        saveConfigurationButton.setText("Save");
                        toolBar1.add(saveConfigurationButton);

                        //---- deployProcessesButton ----
                        deployProcessesButton.setText("Deploy");
                        toolBar1.add(deployProcessesButton);

                        //---- stopProcessesButton ----
                        stopProcessesButton.setText("Stop");
                        toolBar1.add(stopProcessesButton);
                    }
                    menuBar1.add(toolBar1);
                }

                //======== scrollPane1 ========
                {

                    //---- componentList ----
                    componentList.setModel(new AbstractListModel<String>() {
                        String[] values = {
                            "DS",
                            "DL",
                            "LB",
                            "DAG",
                            "DPU"
                        };
                        @Override
                        public int getSize() { return values.length; }
                        @Override
                        public String getElementAt(int i) { return values[i]; }
                    });
                    scrollPane1.setViewportView(componentList);
                }

                //======== scrollPane3 ========
                {
                    scrollPane3.setViewportView(terminal);
                }

                //---- label1 ----
                label1.setText("Configuration");

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(menuBar1, GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(designCanvas, GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(label1)
                                    .addGap(18, 18, 18)
                                    .addComponent(configurationName, GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE))
                                .addComponent(scrollPane3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE))
                            .addContainerGap())
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(menuBar1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label1)
                                .addComponent(configurationName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                                .addComponent(designCanvas, GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenu menu2;
    private JMenu menu3;
    private JMenu menu4;
    private JToolBar toolBar1;
    private JPanel hSpacer1;
    private JButton saveConfigurationButton;
    private JButton deployProcessesButton;
    private JButton stopProcessesButton;
    private JScrollPane scrollPane1;
    private JList<String> componentList;
    private JScrollPane designCanvas;
    private JScrollPane scrollPane3;
    private JTextArea terminal;
    private JLabel label1;
    private JTextField configurationName;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
