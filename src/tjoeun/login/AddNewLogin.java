/*
 * %W% %E% Hamza Yasin
 *
 * Copyright (c) 2017-2018 Miranz Technology. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Miranz
 * technology. You shall not disclose such Confidential Information and 
 * shall use it only in accordance with the terms of the license agreement 
 * you entered into with Miranz.
 *
 */
package tjoeun.login;

import java.awt.Color;
import java.awt.HeadlessException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/*
 * @version 1.10 25 Aug 2017
 * @author Hamza Yasin
 */
public class AddNewLogin extends javax.swing.JPanel {

    /**
     * Creates new form AddNewLogin
     */
    
    public AddNewLogin() {
        initComponents();
        setBackground(Color.white);
        LoginHandling.load();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        questincombo = new javax.swing.JComboBox<>();
        answertf = new javax.swing.JTextField();
        passwordtf = new javax.swing.JTextField();
        fullnametf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Save = new javax.swing.JButton();
        statusComboBox = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1359, 675));

        jLabel3.setFont(new java.awt.Font("NanumGothic", 1, 14)); // NOI18N
        jLabel3.setText("아이디:");

        username.setFont(new java.awt.Font("NanumGothic", 0, 14)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("NanumGothic", 1, 14)); // NOI18N
        jLabel4.setText("권한:");

        jLabel7.setFont(new java.awt.Font("NanumGothic", 1, 14)); // NOI18N
        jLabel7.setText("질문:");

        questincombo.setFont(new java.awt.Font("NanumGothic", 0, 13)); // NOI18N
        questincombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "당신의 좌우명은?", "기억에 남는 추억의 장소는?", "가장 기억에 남는 선생님 성함은?" }));
        questincombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        answertf.setFont(new java.awt.Font("NanumGothic", 0, 14)); // NOI18N
        answertf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        passwordtf.setFont(new java.awt.Font("NanumGothic", 0, 14)); // NOI18N
        passwordtf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fullnametf.setFont(new java.awt.Font("NanumGothic", 0, 14)); // NOI18N
        fullnametf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setFont(new java.awt.Font("NanumGothic", 1, 14)); // NOI18N
        jLabel8.setText("성명:");

        jLabel9.setFont(new java.awt.Font("NanumGothic", 1, 14)); // NOI18N
        jLabel9.setText("비밀번호:");

        jLabel12.setFont(new java.awt.Font("NanumGothic", 1, 14)); // NOI18N
        jLabel12.setText("답:");

        jLabel1.setFont(new java.awt.Font("NanumGothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("회원 가입 ");
        jLabel1.setToolTipText("");

        Save.setBackground(new java.awt.Color(255, 255, 255));
        Save.setFont(new java.awt.Font("NanumGothic", 0, 18)); // NOI18N
        Save.setForeground(new java.awt.Color(0, 153, 0));
        Save.setText("등록");
        Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        statusComboBox.setFont(new java.awt.Font("NanumGothic", 0, 13)); // NOI18N
        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "회원", "관리자" }));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tjoeun/images/icon2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel5)
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(questincombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(answertf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passwordtf, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fullnametf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(51, Short.MAX_VALUE))
                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(questincombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(answertf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(fullnametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    protected Boolean validityCheck() {
    	if(!Pattern.matches("^[a-zA-Z0-9]{4,9}$", username.getText())) {
    		JOptionPane.showMessageDialog(null, "아이디는 영문자 또는 숫자만 사용 가능합니다. (5자 이상 10자 이내)");
    	} else if(answertf.getText().equals("")) {
    		JOptionPane.showMessageDialog(null, "답을 입력해주십시오.");
    	} else if(fullnametf.getText().equals("")) {
    		JOptionPane.showMessageDialog(null, "성명을 입력해주십시오.");	
    	} else if(passwordtf.getText().equals("")) {
    		JOptionPane.showMessageDialog(null, "비밀번호를 입력해주십시오.");
    	} else {
    		try {
    	           if(LoginHandling.idDuplicateCheck(username.getText())) {
    	        	   JOptionPane.showMessageDialog(null, "\"" + username.getText() + "\"는 중복되는 아이디 입니다.");
    	        	   username.setText("");
    	           } else {
    	        	   return true;
    	           }
    	        }catch (HeadlessException e) {
    	            e.printStackTrace();
    	        }
    	} 
    	return false;
	}

	private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
      if(validityCheck()) {
    	  try {
              LoginHandling.save(getData());
              JOptionPane.showMessageDialog(null,"정상적으로 처리되었습니다.");
          }catch (HeadlessException e) {
              JOptionPane.showMessageDialog(null, "에러가 발생하였습니다.");
          }
      }
    }//GEN-LAST:event_SaveActionPerformed
    
    public Login_1 getData()
    {
        
        String name = fullnametf.getText();
        String user = username.getText();
        String pass = passwordtf.getText();
        String status = statusComboBox.getSelectedItem().toString();
        String qstn = String.valueOf(questincombo.getSelectedItem());
        String ans = answertf.getText();
        
        java.util.Calendar cal = new java.util.GregorianCalendar();
        return new Login_1(user, pass, qstn, ans, name, status, cal.getTime().toString());
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Save;
    private javax.swing.JTextField answertf;
    private javax.swing.JTextField fullnametf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField passwordtf;
    private javax.swing.JComboBox<String> questincombo;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
