/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marks;

import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author 325252633
 */
public class code extends javax.swing.JFrame {

    /**
     * Creates new form code
     */
    public code() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        WhitePanel = new javax.swing.JPanel();
        realstart = new javax.swing.JPanel();
        startbtn = new javax.swing.JButton();
        tittlelbl = new javax.swing.JLabel();
        start = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        stud1btn = new javax.swing.JButton();
        stud2btn = new javax.swing.JButton();
        stud3btn = new javax.swing.JButton();
        stud4btn = new javax.swing.JButton();
        stud5btn = new javax.swing.JButton();
        stud10btn = new javax.swing.JButton();
        stud9btn = new javax.swing.JButton();
        stud8btn = new javax.swing.JButton();
        stud7btn = new javax.swing.JButton();
        stud6btn = new javax.swing.JButton();
        marks = new javax.swing.JPanel();
        studnametxt = new javax.swing.JTextField();
        Mark1txt = new javax.swing.JTextField();
        Mark2txt = new javax.swing.JTextField();
        Mark3txt = new javax.swing.JTextField();
        Mark4txt = new javax.swing.JTextField();
        Mark5txt = new javax.swing.JTextField();
        Mark6txt = new javax.swing.JTextField();
        Mark7txt = new javax.swing.JTextField();
        Mark8txt = new javax.swing.JTextField();
        Mark9txt = new javax.swing.JTextField();
        Mark10txt = new javax.swing.JTextField();
        mark10txt = new javax.swing.JTextField();
        mark9txt = new javax.swing.JTextField();
        mark8txt = new javax.swing.JTextField();
        mark7txt = new javax.swing.JTextField();
        mark6txt = new javax.swing.JTextField();
        mark5txt = new javax.swing.JTextField();
        mark4txt = new javax.swing.JTextField();
        mark3txt = new javax.swing.JTextField();
        mark1txt = new javax.swing.JTextField();
        mark2txt = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();
        randobtn = new javax.swing.JButton();
        avglbl = new javax.swing.JLabel();
        refreshbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        WhitePanel.setLayout(new java.awt.CardLayout());

        startbtn.setText("Start!");
        startbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startbtnActionPerformed(evt);
            }
        });

        tittlelbl.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        tittlelbl.setText("Elite Markz");

        javax.swing.GroupLayout realstartLayout = new javax.swing.GroupLayout(realstart);
        realstart.setLayout(realstartLayout);
        realstartLayout.setHorizontalGroup(
            realstartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(realstartLayout.createSequentialGroup()
                .addGroup(realstartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(realstartLayout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(tittlelbl))
                    .addGroup(realstartLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(startbtn)))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        realstartLayout.setVerticalGroup(
            realstartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(realstartLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(tittlelbl)
                .addGap(89, 89, 89)
                .addComponent(startbtn)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        WhitePanel.add(realstart, "card4");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Students");

        stud1btn.setText("Student1");
        stud1btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stud1btnActionPerformed(evt);
            }
        });

        stud2btn.setText("Student2");
        stud2btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stud2btnActionPerformed(evt);
            }
        });

        stud3btn.setText("Student3");
        stud3btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stud3btnActionPerformed(evt);
            }
        });

        stud4btn.setText("Student4");
        stud4btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stud4btnActionPerformed(evt);
            }
        });

        stud5btn.setText("Student5");
        stud5btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stud5btnActionPerformed(evt);
            }
        });

        stud10btn.setText("Student10");
        stud10btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stud10btnActionPerformed(evt);
            }
        });

        stud9btn.setText("Student9");
        stud9btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stud9btnActionPerformed(evt);
            }
        });

        stud8btn.setText("Student8");
        stud8btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stud8btnActionPerformed(evt);
            }
        });

        stud7btn.setText("Student7");
        stud7btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stud7btnActionPerformed(evt);
            }
        });

        stud6btn.setText("Student6");
        stud6btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stud6btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout startLayout = new javax.swing.GroupLayout(start);
        start.setLayout(startLayout);
        startLayout.setHorizontalGroup(
            startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(stud5btn)
                    .addComponent(stud4btn)
                    .addComponent(stud3btn)
                    .addComponent(stud2btn)
                    .addComponent(stud1btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startLayout.createSequentialGroup()
                        .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(stud10btn)
                            .addComponent(stud9btn)
                            .addComponent(stud8btn)
                            .addComponent(stud7btn)
                            .addComponent(stud6btn))
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(214, 214, 214))))
        );
        startLayout.setVerticalGroup(
            startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startLayout.createSequentialGroup()
                .addGroup(startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(startLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stud6btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stud7btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stud8btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stud9btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stud10btn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startLayout.createSequentialGroup()
                        .addGap(0, 44, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(34, 34, 34)
                        .addComponent(stud1btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stud2btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stud3btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stud4btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stud5btn)))
                .addGap(122, 122, 122))
        );

        WhitePanel.add(start, "card2");

        studnametxt.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        studnametxt.setText("Student");
        studnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studnametxtActionPerformed(evt);
            }
        });

        Mark1txt.setText("Mark1");
        Mark1txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mark1txtActionPerformed(evt);
            }
        });

        Mark2txt.setText("Mark2");
        Mark2txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mark2txtActionPerformed(evt);
            }
        });

        Mark3txt.setText("Mark3");
        Mark3txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mark3txtActionPerformed(evt);
            }
        });

        Mark4txt.setText("Mark4");
        Mark4txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mark4txtActionPerformed(evt);
            }
        });

        Mark5txt.setText("Mark5");

        Mark6txt.setText("Mark6");

        Mark7txt.setText("Mark7");

        Mark8txt.setText("Mark8");

        Mark9txt.setText("Mark9");

        Mark10txt.setText("Mark10");

        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        randobtn.setText("randomize");
        randobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randobtnActionPerformed(evt);
            }
        });

        avglbl.setText("Average: ");

        refreshbtn.setText("Refresh");
        refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout marksLayout = new javax.swing.GroupLayout(marks);
        marks.setLayout(marksLayout);
        marksLayout.setHorizontalGroup(
            marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(marksLayout.createSequentialGroup()
                .addGroup(marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(marksLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Mark7txt)
                                .addComponent(Mark10txt, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Mark1txt, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Mark2txt, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Mark3txt, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Mark4txt, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Mark5txt, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Mark6txt, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Mark8txt, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Mark9txt, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(avglbl))
                        .addGap(106, 106, 106)
                        .addComponent(backbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(randobtn)
                        .addGroup(marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(marksLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(mark9txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                    .addComponent(mark8txt)
                                    .addComponent(mark7txt)
                                    .addComponent(mark6txt)
                                    .addComponent(mark5txt)
                                    .addComponent(mark4txt)
                                    .addComponent(mark3txt)
                                    .addComponent(mark2txt)
                                    .addComponent(mark1txt)
                                    .addComponent(mark10txt)))
                            .addGroup(marksLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(refreshbtn))))
                    .addGroup(marksLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(studnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        marksLayout.setVerticalGroup(
            marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(marksLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marksLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backbtn)
                            .addComponent(randobtn)
                            .addComponent(avglbl)
                            .addComponent(refreshbtn)))
                    .addGroup(marksLayout.createSequentialGroup()
                        .addGroup(marksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(marksLayout.createSequentialGroup()
                                .addComponent(Mark1txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mark2txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mark3txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mark4txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mark5txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mark6txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mark7txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mark8txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mark9txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mark10txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(marksLayout.createSequentialGroup()
                                .addComponent(mark1txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mark2txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mark3txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mark4txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mark5txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mark6txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mark7txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mark8txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mark9txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mark10txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );

        WhitePanel.add(marks, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WhitePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(WhitePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    static int student = 0;
    static JButton[] but = new JButton[10];
    static JTextField[] marktxt = new JTextField[10];
    static JTextField[] markstxt = new JTextField[10];
    static String[] studs = {"Student1","Student2","Student3","Student4","Student5","Student6","Student7","Student8","Student9","Student10"};
    static String[] ass = {"mark1","mark2","mark3","mark4","mark5","mark6","mark7","mark8","mark9","mark10"};
    static double[][] mark = {
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
        {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1}
    };
    static double[] average = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,};
    static int[] num = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,};
    private void stud1btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stud1btnActionPerformed
        tomarks(0);
    }//GEN-LAST:event_stud1btnActionPerformed

    private void stud2btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stud2btnActionPerformed
        tomarks(1);
    }//GEN-LAST:event_stud2btnActionPerformed

    private void stud3btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stud3btnActionPerformed
        tomarks(2);
    }//GEN-LAST:event_stud3btnActionPerformed

    private void stud4btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stud4btnActionPerformed
        tomarks(3);
    }//GEN-LAST:event_stud4btnActionPerformed

    private void stud5btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stud5btnActionPerformed
        tomarks(4);
    }//GEN-LAST:event_stud5btnActionPerformed

    private void stud10btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stud10btnActionPerformed
        tomarks(9);
    }//GEN-LAST:event_stud10btnActionPerformed

    private void stud9btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stud9btnActionPerformed
        tomarks(8);
    }//GEN-LAST:event_stud9btnActionPerformed

    private void stud8btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stud8btnActionPerformed
        tomarks(7);
    }//GEN-LAST:event_stud8btnActionPerformed

    private void stud7btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stud7btnActionPerformed
        tomarks(6);
    }//GEN-LAST:event_stud7btnActionPerformed

    private void stud6btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stud6btnActionPerformed
        tomarks(5);
    }//GEN-LAST:event_stud6btnActionPerformed

    public static void tomarks(int x){
        WhitePanel.removeAll();
        WhitePanel.add(marks);
        WhitePanel.repaint();
        WhitePanel.revalidate();
        student = x;
        for (int y = 0; y < 10; y++){
            marktxt[y].setText(ass[y]);
            if (mark[student][y] == -1){
                markstxt[y].setText("");
            }
            else{
                markstxt[y].setText("" + Math.round(mark[student][y]));
            }
        }
        studnametxt.setText(studs[student]);
        if (average[student] != -1){
            avglbl.setText("Average: " + Math.round(average[student]));
        }
        else{
            avglbl.setText("Average: ");
        }
    }
    public static void sup(){
        but[0] = stud1btn;
        but[1] = stud2btn;
        but[2] = stud3btn;
        but[3] = stud4btn;
        but[4] = stud5btn;
        but[5] = stud6btn;
        but[6] = stud7btn;
        but[7] = stud8btn;
        but[8] = stud9btn;
        but[9] = stud10btn;
        marktxt[0] = Mark1txt;
        marktxt[1] = Mark2txt;
        marktxt[2] = Mark3txt;
        marktxt[3] = Mark4txt;
        marktxt[4] = Mark5txt;
        marktxt[5] = Mark6txt;
        marktxt[6] = Mark7txt;
        marktxt[7] = Mark8txt;
        marktxt[8] = Mark9txt;
        marktxt[9] = Mark10txt;
        markstxt[0] = mark1txt;
        markstxt[1] = mark2txt;
        markstxt[2] = mark3txt;
        markstxt[3] = mark4txt;
        markstxt[4] = mark5txt;
        markstxt[5] = mark6txt;
        markstxt[6] = mark7txt;
        markstxt[7] = mark8txt;
        markstxt[8] = mark9txt;
        markstxt[9] = mark10txt;
    }
    public static void setup(JButton butt[]){
        for (int x = 0; x<10; x++){
            butt[x].setText(studs[x]);
        }
    }
    
    public static void back(){
        int y = 0;
        double total = 0;
        for (int x = 0; x < 10; x++){
            ass[x] = marktxt[x].getText();
            try{
                double in = Double.parseDouble(markstxt[x].getText());
                System.out.println(in);
                if (in>100 || in<0){
                    mark[student][x] = -1;
                }
                else{
                    mark[student][x] = in;
                    y++;
                    total = total + in;
                }
            }
            catch(Exception e){
                mark[student][x] = -1;
            }
            studs[student] = studnametxt.getText();
        }
        if (y > 0){
            average[student] = total/y;
            System.out.println(y);
            System.out.println(average[student]);
        }
        else{
            average[student] = -1;
        }
    }
    
    public static void refresh(){
        if (average[student] != -1){
            avglbl.setText("Average: " + Math.round(average[student]));
        }
        else{
            avglbl.setText("Average: ");
        }
        for(int x = 0; x < 10; x++){
            if(mark[student][x] != -1){
                markstxt[x].setText("" + mark[student][x]);
            }
            else{
                markstxt[x].setText("");
            }
        }
    }
    
    private void studnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studnametxtActionPerformed

    private void Mark1txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mark1txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mark1txtActionPerformed

    private void Mark3txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mark3txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mark3txtActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        WhitePanel.removeAll();
        WhitePanel.add(start);
        WhitePanel.repaint();
        WhitePanel.revalidate();
        back();
        setup(but);
    }//GEN-LAST:event_backbtnActionPerformed

    private void Mark2txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mark2txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mark2txtActionPerformed

    private void Mark4txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mark4txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mark4txtActionPerformed

    private void startbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startbtnActionPerformed
        // TODO add your handling code here:
        WhitePanel.removeAll();
        WhitePanel.add(start);
        WhitePanel.repaint();
        WhitePanel.revalidate();
        sup();
        setup(but);
    }//GEN-LAST:event_startbtnActionPerformed

    private void refreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbtnActionPerformed
        // TODO add your handling code here:
        back();
        refresh();
    }//GEN-LAST:event_refreshbtnActionPerformed

    private void randobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randobtnActionPerformed
        // TODO add your handling code here:
        for(int x = 0; x < 10; x++){
            if (mark[student][x] == -1){
                mark[student][x] = (Math.random()*100);
                System.out.println("Ramdomizing " + mark[student][x]);
            }
        }
        for(int x = 0; x < 10; x++){
            if(mark[student][x] != -1){
                markstxt[x].setText("" + mark[student][x]);
            }
            else{
                markstxt[x].setText("");
            }
        }
        back();
        refresh();
    }//GEN-LAST:event_randobtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new code().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Mark10txt;
    public static javax.swing.JTextField Mark1txt;
    public static javax.swing.JTextField Mark2txt;
    public static javax.swing.JTextField Mark3txt;
    public static javax.swing.JTextField Mark4txt;
    public static javax.swing.JTextField Mark5txt;
    public static javax.swing.JTextField Mark6txt;
    public static javax.swing.JTextField Mark7txt;
    public static javax.swing.JTextField Mark8txt;
    public static javax.swing.JTextField Mark9txt;
    public static javax.swing.JPanel WhitePanel;
    public static javax.swing.JLabel avglbl;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JTextField mark10txt;
    public static javax.swing.JTextField mark1txt;
    public static javax.swing.JTextField mark2txt;
    public static javax.swing.JTextField mark3txt;
    public static javax.swing.JTextField mark4txt;
    public static javax.swing.JTextField mark5txt;
    public static javax.swing.JTextField mark6txt;
    public static javax.swing.JTextField mark7txt;
    public static javax.swing.JTextField mark8txt;
    public static javax.swing.JTextField mark9txt;
    public static javax.swing.JPanel marks;
    private javax.swing.JButton randobtn;
    private javax.swing.JPanel realstart;
    private javax.swing.JButton refreshbtn;
    private javax.swing.JPanel start;
    private javax.swing.JButton startbtn;
    public static javax.swing.JButton stud10btn;
    public static javax.swing.JButton stud1btn;
    public static javax.swing.JButton stud2btn;
    public static javax.swing.JButton stud3btn;
    public static javax.swing.JButton stud4btn;
    public static javax.swing.JButton stud5btn;
    public static javax.swing.JButton stud6btn;
    public static javax.swing.JButton stud7btn;
    public static javax.swing.JButton stud8btn;
    public static javax.swing.JButton stud9btn;
    public static javax.swing.JTextField studnametxt;
    private javax.swing.JLabel tittlelbl;
    // End of variables declaration//GEN-END:variables
}