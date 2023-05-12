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
}
