/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.awt.*;
import java.awt.event.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;

public class DatePicker {
 
    int month = java.util.Calendar.getInstance().get(java.util.Calendar.MONTH);
    int year = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
    JLabel l = new JLabel("", JLabel.CENTER);
    String day = "";
    JDialog d;
    JButton[] button = new JButton[49];
    int currentDay = 0;
    int currentMonth = 0;
    int currentYear = 0;
    Calendar today = Calendar.getInstance();
    
    public DatePicker(JInternalFrame parent) {
        DateFormat date = new SimpleDateFormat("dd");
        currentDay = Integer.parseInt(date.format(today.getTime()));
        currentMonth = today.get(java.util.Calendar.MONTH);
        currentYear = today.get(java.util.Calendar.YEAR);
        
        d = new JDialog();
        d.setModal(true);
        String[] header = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        JPanel p1 = new JPanel(new GridLayout(7, 7));
        p1.setPreferredSize(new Dimension(430, 300));
        for (int x = 0; x < button.length; x++) {
            final int selection = x;
            button[x] = new JButton();
            button[x].setFocusPainted(false);
            button[x].setBackground(Color.white);
            if (x > 6) {
                button[x].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent ae) {
                        day = button[selection].getActionCommand();
                        
                        Constants.selectedDate = day;
                        d.dispose();
                        
                    }
                });
            }
            if (x < 7) {
                button[x].setText(header[x]);
                button[x].setForeground(Color.BLUE);
                button[x].setFont(new Font("Arial",1,14));
            }
            p1.add(button[x]);
        }
        JPanel p2 = new JPanel(new GridLayout(1, 3));
        JButton previous = new JButton("<< Previous");
        previous.setForeground(Color.BLUE);
        previous.setFont(new Font("Arial", 1, 13));
        previous.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                month--;
                displayDate();
            }
        });
        p2.add(previous);
        p2.add(l);
        JButton next = new JButton("Next >>");
        next.setForeground(Color.BLUE);
        next.setFont(new Font("Arial", 1, 13));
        next.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                month++;
                displayDate();
            }
        });
        p2.add(next);
        d.add(p1, BorderLayout.CENTER);
        d.add(p2, BorderLayout.SOUTH);
        d.pack();
        d.setLocationRelativeTo(parent);
        displayDate();
        d.setVisible(true);

    }

    
    
    
    public void appointmentCalender(JPanel frame) {
        DateFormat date = new SimpleDateFormat("dd");
        currentDay = Integer.parseInt(date.format(today.getTime()));
        currentMonth = today.get(java.util.Calendar.MONTH);
        currentYear = today.get(java.util.Calendar.YEAR);
        String[] header = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        frame = new JPanel(new GridLayout(7, 7));
        frame.setPreferredSize(new Dimension(430, 300));
        for (int x = 0; x < button.length; x++) {
            final int selection = x;
            button[x] = new JButton();
            button[x].setFocusPainted(false);
            button[x].setBackground(Color.white);
            if (x > 6) {
                button[x].addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent ae) {
                        day = button[selection].getActionCommand();
                        d.dispose();
                    }
                });
            }
            if (x < 7) {
                button[x].setText(header[x]);
                button[x].setForeground(Color.BLUE);
                button[x].setFont(new Font("Arial",1,14));
            }
            frame.add(button[x]);
        }
        JPanel p2 = new JPanel(new GridLayout(1, 3));
        JButton previous = new JButton("<< Previous");
        previous.setForeground(Color.BLUE);
        previous.setFont(new Font("Arial", 1, 13));
        previous.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                month--;
                displayDate();
            }
        });
        p2.add(previous);
        p2.add(l);
        JButton next = new JButton("Next >>");
        next.setForeground(Color.BLUE);
        next.setFont(new Font("Arial", 1, 13));
        next.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                month++;
                displayDate();
            }
        });
        p2.add(next);
//        d.add(frame, BorderLayout.CENTER);
//        d.add(p2, BorderLayout.SOUTH);
//        d.pack();
//        d.setLocationRelativeTo(parent);
        displayDate();
//        d.setVisible(true);

    }
    
    
    public String displayDate() {
        for (int x = 7; x < button.length; x++) {
            button[x].setText("");
        }
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MMM-yy");
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(year, month, 1);
        //int month = cal.get(java.util.Calendar.MONTH);
        //int year = cal.get(java.util.Calendar.YEAR);
        int dayOfWeek = cal.get(java.util.Calendar.DAY_OF_WEEK);
        int daysInMonth = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
        for (int x = 6 + dayOfWeek, day = 1; day <= daysInMonth; x++, day++) {
            
            button[x].setForeground(Color.BLACK);
            //button[x].setBackground(new java.awt.Color(Constants.red , Constants.green , Constants.black));
            button[x].setBackground(Color.WHITE);
            button[x].setFont(new Font("Arial", 4, 13));
            
            button[x].setText("" + day);
            if(day==currentDay && month==currentMonth && year == currentYear){
                //button[x].setForeground(Color.RED);
                button[x].setBackground(Color.BLUE);
                button[x].setFont(new Font("Arial", 1, 14));
            }
        }
        l.setText(sdf.format(cal.getTime()));
        l.setFont(new Font("Arial", 1, 16));
        l.setForeground(Color.RED);
        d.setTitle("Select Date");
        Constants.selectedDate = sdf.format(cal.getTime());
        return sdf.format(cal.getTime());
       
    }

    public String setPickedDate() {
        if (day.equals("")) {
            return day;
        }
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(year, month, Integer.parseInt(day));
        return sdf.format(cal.getTime());
    }

    public static void main(String [] asrf){
        
        java.util.Calendar cal = java.util.Calendar.getInstance();
        int month = cal.get(java.util.Calendar.MONTH);
        int year = cal.get(java.util.Calendar.YEAR);
        //cal.set(year, month, 24);
        int dayOfWeek = cal.get(java.util.Calendar.DAY_OF_WEEK);
        int daysInMonth = cal.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);
        System.out.println("month = "+ month);
        System.out.println("year = "+ year);
        System.out.println("dayOfWeek = "+ dayOfWeek);
        System.out.println("daysInMonth = "+ daysInMonth);
        
    }

}

