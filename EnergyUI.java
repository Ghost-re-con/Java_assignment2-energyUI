package java_second_assignment_GUI;

import java_second_assignment_GUI.Energy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnergyUI implements ActionListener {

        Energy energy = new Energy();
        JFrame frame = new JFrame();

        JFrame periodFrame = new JFrame();
        JTextField length = new JTextField("length");
        JButton calculatePeriod = new JButton("Calculate");

        JFrame potentialEnergyFrame = new JFrame();
        JTextField mass = new JTextField("mass");
        JTextField height = new JTextField("height");
        JButton calculatePotentialEnergy = new JButton("Calculate");

        JFrame forceFrame = new JFrame();
        JTextField mas = new JTextField("mass");
        JButton calculateForce = new JButton("Calculate");

        JFrame workFrame = new JFrame();
        JTextField force = new JTextField("force");
        JTextField displacement = new JTextField("displacement");
        JButton calculateWork = new JButton("Calculate");

        JFrame heightFrame = new JFrame();
        JTextField time = new JTextField("time");
        JButton calculateHeight = new JButton("Calculate");

        JButton Period = new JButton("Period");
        JButton potentialEnergy = new JButton("potentialEnergy");
        JButton Force = new JButton("Force");
        JButton Work = new JButton("Work");
        JButton Height = new JButton("Height");
        
         EnergyUI() {
        frame.add(Period);
        frame.add(potentialEnergy);
        frame.add(Force);
        frame.add(Work);
        frame.add(Height);
        frame.setSize(150, 200);
        frame.setLayout(new GridLayout(7, 1));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Period.addActionListener(this);
        potentialEnergy.addActionListener(this);
        Force.addActionListener(this);
        Work.addActionListener(this);
        Height.addActionListener(this);

    }
         public void actionPerformed (ActionEvent e){

        if (e.getSource() == Period) {
            periodFrame.setVisible(true);
            periodFrame.setLayout(new GridLayout(7, 1));
            periodFrame.setSize(150, 200);
            periodFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            periodFrame.add(length);
            periodFrame.add(calculatePeriod);
            calculatePeriod.addActionListener(this);

        } else if (e.getSource() == potentialEnergy) {
            potentialEnergyFrame.setVisible(true);
            potentialEnergyFrame.setLayout(new GridLayout(7, 1));
            potentialEnergyFrame.setSize(150, 200);
            potentialEnergyFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            potentialEnergyFrame.add(mass);
            potentialEnergyFrame.add(height);
            potentialEnergyFrame.add(calculatePotentialEnergy);
            calculatePotentialEnergy.addActionListener(this);

        } else if (e.getSource() == Force) {
            forceFrame.setVisible(true);
            forceFrame.setLayout(new GridLayout(7, 1));
            forceFrame.setSize(150, 200);
            forceFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            forceFrame.add(mas);
            forceFrame.add(calculateForce);
            calculateForce.addActionListener(this);

        } else if (e.getSource() == Work) {
            workFrame.setVisible(true);
            workFrame.setLayout(new GridLayout(7, 1));
            workFrame.setSize(150, 200);
            workFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            workFrame.add(force);
            workFrame.add(displacement);
            workFrame.add(calculateWork);
            calculateWork.addActionListener(this);

        } else if (e.getSource() == Height) {
            heightFrame.setVisible(true);
            heightFrame.setLayout(new GridLayout(7, 1));
            heightFrame.setSize(150, 200);
            heightFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            heightFrame.add(time);
            heightFrame.add(calculateHeight);
            calculateHeight.addActionListener(this);

        } else if (e.getSource() == calculatePeriod) {
            try{JOptionPane.showMessageDialog(null, energy.Period(Float.parseFloat(length.getText())));}
            catch(Exception f){JOptionPane.showMessageDialog(null,"Use only numbers","Error",JOptionPane.ERROR_MESSAGE);}

        } else if (e.getSource() == calculatePotentialEnergy) {
            try{JOptionPane.showMessageDialog(null,energy.potentialEnergy(Float.parseFloat(mass.getText()), Float.parseFloat(height.getText())));}
            catch(Exception f){JOptionPane.showMessageDialog(null,"Use only numbers","Error",JOptionPane.ERROR_MESSAGE);}

        } else if (e.getSource() == calculateForce) {
            try{JOptionPane.showMessageDialog(null, energy.Force(Float.parseFloat(mas.getText())));}
            catch(Exception f){JOptionPane.showMessageDialog(null,"Use only numbers","Error",JOptionPane.ERROR_MESSAGE);}

        } else if (e.getSource() == calculateWork) {
            try{JOptionPane.showMessageDialog(null, energy.Work(Float.parseFloat(force.getText()), Float.parseFloat(displacement.getText())));}
            catch(Exception f){JOptionPane.showMessageDialog(null,"Use only numbers","Error",JOptionPane.ERROR_MESSAGE);}

        } else if (e.getSource() == calculateHeight) {
            try{JOptionPane.showMessageDialog(null, energy.Height(Float.parseFloat(time.getText())));}
            catch(Exception f){JOptionPane.showMessageDialog(null,"Use only numbers","Error",JOptionPane.ERROR_MESSAGE);}
        }
    

}

}
