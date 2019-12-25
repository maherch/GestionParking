import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import java.sql.Statement;
import java.sql.Date;
import java.util.Calendar;

public class Park {
	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private Connexion cnx=new Connexion();;
	PreparedStatement ps=null;
	ImageIcon img1=new ImageIcon("C:\\Users\\maher\\Desktop\\park\\Parking\\voituremonter2.gif");
	Connection con=cnx.getConnexion();

	
	public Park() {
		try {
			initialize();
		}
		catch (Exception e){
			System.out.println("erreur cnx");
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws SQLException {
		frame = new JFrame();
		frame.setBounds(100, 100, 1300, 850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* place 11 */
		frame.getContentPane().setLayout(null);
		JLabel p11 = new JLabel("P11");
		p11.setBounds(106, 0, 40, 82);
		p11.setHorizontalAlignment(SwingConstants.CENTER);
		p11.setFont(new Font("Arial Black", Font.BOLD, 14));
		frame.getContentPane().add(p11);

		try {
			String q1="select * from emplacement where nomemp='p11'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p11.setIcon(img1);
				p11.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
	
		/* place 12 */	
		JLabel p12 = new JLabel("P12");
		p12.setBounds(147, 0, 37, 82);
		p12.setHorizontalAlignment(SwingConstants.CENTER);
		p12.setFont(new Font("Arial Black", Font.BOLD, 14));
		frame.getContentPane().add(p12);
		try {
			String q1="select * from emplacement where nomemp='p12'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p12.setIcon(img1);
				p12.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place 13 */
		JLabel p13 = new JLabel("P13");
		p13.setBounds(184, 0, 37, 82);
		p13.setFont(new Font("Arial Black", Font.BOLD, 14));
		p13.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p13);
		try {
			String q1="select * from emplacement where nomemp='p13'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p13.setIcon(img1);
				p13.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		
		/* place14 */
		JLabel p14 = new JLabel("P14");
		p14.setBounds(221, 0, 36, 82);
		p14.setFont(new Font("Arial Black", Font.BOLD, 14));
		p14.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p14);
		try {
			String q1="select * from emplacement where nomemp='p14'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p14.setIcon(img1);
				p14.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place15 */
		JLabel p15 = new JLabel("P15");
		p15.setBounds(257, 0, 36, 82);
		p15.setFont(new Font("Arial Black", Font.BOLD, 14));
		p15.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p15);
		try {
			String q1="select * from emplacement where nomemp='p15'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p15.setIcon(img1);
				p15.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place16 */
		JLabel p16 = new JLabel("P16");
		p16.setBounds(293, 0, 36, 82);
		p16.setFont(new Font("Arial Black", Font.BOLD, 14));
		p16.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p16);
		try {
			String q1="select * from emplacement where nomemp='p16'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p16.setIcon(img1);
				p16.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place17 */
		JLabel p17 = new JLabel("P17");
		p17.setBounds(329, 0, 39, 82);
		p17.setFont(new Font("Arial Black", Font.BOLD, 14));
		p17.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p17);
		try {
			String q1="select * from emplacement where nomemp='p17'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p17.setIcon(img1);
				p17.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place18 */
		JLabel p18 = new JLabel("P18");
		p18.setBounds(426, 0, 39, 82);
		p18.setFont(new Font("Arial Black", Font.BOLD, 14));
		p18.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p18);
		try {
			String q1="select * from emplacement where nomemp='p18'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p18.setIcon(img1);
				p18.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place19 */
		JLabel p19 = new JLabel("P19");
		p19.setBounds(466, 0, 37, 82);
		p19.setFont(new Font("Arial Black", Font.BOLD, 14));
		p19.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p19);
		try {
			String q1="select * from emplacement where nomemp='p19'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p19.setIcon(img1);
				p19.setText("");
				break; 
			}
			}
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place 20 */
		JLabel p20 = new JLabel("P20");
		p20.setBounds(503, 0, 37, 82);
		p20.setFont(new Font("Arial Black", Font.BOLD, 14));
		p20.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p20);
		try {
			String q1="select * from emplacement where nomemp='p20'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p20.setIcon(img1);
				p20.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place 21 */
		JLabel p21 = new JLabel("P21");
		p21.setBounds(539, 0, 37, 82);
		p21.setFont(new Font("Arial Black", Font.BOLD, 14));
		p21.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p21);
		try {
			String q1="select * from emplacement where nomemp='p21'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p21.setIcon(img1);
				p21.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place 22 */
		JLabel p22 = new JLabel("P22");
		p22.setBounds(574, 0, 37, 82);
		p22.setFont(new Font("Arial Black", Font.BOLD, 14));
		p22.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p22);
		try {
			String q1="select * from emplacement where nomemp='p22'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p22.setIcon(img1);
				p22.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place 23 */
		JLabel p23 = new JLabel("P23");
		p23.setBounds(611, 0, 37, 82);
		p23.setFont(new Font("Arial Black", Font.BOLD, 14));
		p23.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p23);
		try {
			String q1="select * from emplacement where nomemp='p23'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p23.setIcon(img1);
				p23.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place 24 */
		JLabel p24 = new JLabel("P24");
		p24.setBounds(648, 0, 39, 82);
		p24.setFont(new Font("Arial Black", Font.BOLD, 14));
		p24.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p24);
		try {
			String q1="select * from emplacement where nomemp='p24'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p24.setIcon(img1);
				p24.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place 10 */
		JLabel p10 = new JLabel("P10");
		p10.setBounds(108, 179, 38, 82);
		p10.setHorizontalAlignment(SwingConstants.CENTER);
		p10.setFont(new Font("Arial Black", Font.BOLD, 14));
		frame.getContentPane().add(p10);
		try {
			String q1="select * from emplacement where nomemp='p10'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p10.setIcon(img1);
				p10.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place9 */
		JLabel p9 = new JLabel("P9");
		p9.setBounds(147, 179, 37, 82);
		p9.setHorizontalAlignment(SwingConstants.CENTER);
		p9.setFont(new Font("Arial Black", Font.BOLD, 14));
		frame.getContentPane().add(p9);
		try {
			String q1="select * from emplacement where nomemp='p9'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p9.setIcon(img1);
				p9.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place8 */
		JLabel p8 = new JLabel("P8");
		p8.setBounds(184, 179, 37, 82);
		p8.setFont(new Font("Arial Black", Font.BOLD, 14));
		p8.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p8);
		try {
			String q1="select * from emplacement where nomemp='p8'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p8.setIcon(img1);
				p8.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place7 */
		JLabel p7 = new JLabel("P7");
		p7.setBounds(220, 179, 37, 82);
		p7.setFont(new Font("Arial Black", Font.BOLD, 14));
		p7.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p7);
		try {
			String q1="select * from emplacement where nomemp='p7'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p7.setIcon(img1);
				p7.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place6 */
		JLabel p6 = new JLabel("P6");
		p6.setBounds(256, 179, 37, 82);
		p6.setFont(new Font("Arial Black", Font.BOLD, 14));
		p6.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p6);
		try {
			String q1="select * from emplacement where nomemp='p6'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p6.setIcon(img1);
				p6.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place5 */
		JLabel p5 = new JLabel("P5");
		p5.setBounds(292, 179, 37, 82);
		p5.setFont(new Font("Arial Black", Font.BOLD, 14));
		p5.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p5);
		try {
			String q1="select * from emplacement where nomemp='p5'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p5.setIcon(img1);
				p5.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place4 */
		JLabel p4 = new JLabel("P4");
		p4.setBounds(330, 179, 37, 82);
		p4.setFont(new Font("Arial Black", Font.BOLD, 14));
		p4.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p4);
		try {
			String q1="select * from emplacement where nomemp='p4'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p4.setIcon(img1);
				p4.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place3 */
		JLabel p3 = new JLabel("P3");
		p3.setBounds(428, 179, 37, 82);
		p3.setFont(new Font("Arial Black", Font.BOLD, 14));
		p3.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p3);
		try {
			String q1="select * from emplacement where nomemp='p3'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p3.setIcon(img1);
				p3.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place2 */
		JLabel p2 = new JLabel("P2");
		p2.setBounds(466, 179, 37, 82);
		p2.setFont(new Font("Arial Black", Font.BOLD, 14));
		p2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p2);
		try {
			String q1="select * from emplacement where nomemp='p2'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p2.setIcon(img1);
				p2.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place 1 */
		JLabel p1 = new JLabel("P1");
		p1.setBounds(503, 179, 37, 82);
		p1.setFont(new Font("Arial Black", Font.BOLD, 14));
		p1.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p1);
		try {
			String q1="select * from emplacement where nomemp='p1'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p1.setIcon(img1);
				p1.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place 28*/
		JLabel p28 = new JLabel("P28");
		p28.setBounds(436, 302, 50, 82);
		p28.setFont(new Font("Arial Black", Font.BOLD, 14));
		p28.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p28);
		try {
			String q1="select * from emplacement where nomemp='p28'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p28.setIcon(img1);
				p28.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place 27 */
		JLabel p27 = new JLabel("P27");
		p27.setBounds(489, 302, 37, 82);
		p27.setFont(new Font("Arial Black", Font.BOLD, 14));
		p27.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p27);
		try {
			String q1="select * from emplacement where nomemp='p27'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p27.setIcon(img1);
				p27.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place 26 */
		JLabel p26 = new JLabel("P26");
		p26.setBounds(529, 302, 46, 82);
		p26.setFont(new Font("Arial Black", Font.BOLD, 14));
		p26.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p26);
		try {
			String q1="select * from emplacement where nomemp='p26'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p26.setIcon(img1);
				p26.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place 25 */
		JLabel p25 = new JLabel("P25");
		p25.setBounds(683, 302, 37, 82);
		p25.setFont(new Font("Arial Black", Font.BOLD, 14));
		p25.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p25);
		try {
			String q1="select * from emplacement where nomemp='p25'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p25.setIcon(img1);
				p25.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* place 29 */
		JLabel p29 = new JLabel("P29");
		p29.setBounds(264, 302, 37, 82);
		p29.setFont(new Font("Arial Black", Font.BOLD, 14));
		p29.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p29);
		try {
			String q1="select * from emplacement where nomemp='p29'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p29.setIcon(img1);
				p29.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.println("erreur icon");
			}
		
		/* place 30 */
		JLabel p30 = new JLabel("P30");
		p30.setBounds(223, 302, 37, 82);
		p30.setFont(new Font("Arial Black", Font.BOLD, 14));
		p30.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(p30);
		try {
			String q1="select * from emplacement where nomemp='p30'";
			Statement st1=con.createStatement();						
			ResultSet rs1=st1.executeQuery(q1);
			
			String et=null;
			while(rs1.next()){
				et=rs1.getString(2);
			}
			switch (et) {			
			case "nd":
				p30.setIcon(img1);
				p30.setText("");
				break;
	 } }
			
			catch (Exception e){
				System.out.print("erreur icon");
			}
		
		/* Matricule */
		JLabel lblMatricule = new JLabel("Matricule :");
		lblMatricule.setBounds(837, 37, 87, 14);
		lblMatricule.setFont(new Font("Arial", Font.BOLD, 14));
		frame.getContentPane().add(lblMatricule);
		
		
		textField = new JTextField();
		textField.setBounds(838, 62, 105, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		/* emplacement */
		
		JLabel lblEmplacement = new JLabel("Emplacement :");
		lblEmplacement.setBounds(837, 193, 106, 14);
		lblEmplacement.setFont(new Font("Arial", Font.BOLD, 14));
		frame.getContentPane().add(lblEmplacement);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(837, 218, 105, 26);
		
		try {
			String query="select nomemp from emplacement where etat='d'";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			
			String[] list=new String[30];
			int nb=0;
			
			while (rs.next()){
				list[nb]=rs.getString("nomemp");
				nb++;
				}
			comboBox.setModel(new DefaultComboBoxModel(list));
			frame.getContentPane().add(comboBox);
		}
		
		catch (Exception e){
			JOptionPane.showMessageDialog(null,"e");
		}
		comboBox.setSelectedIndex(-1);
		
		/* nombre de places */
		JLabel lblNombreDePlaces = new JLabel("Nombre de places disponibles :");
		lblNombreDePlaces.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNombreDePlaces.setBounds(58, 532, 188, 20);
		frame.getContentPane().add(lblNombreDePlaces);
		
		JLabel nbre = new JLabel();
		nbre.setFont(new Font("Tahoma", Font.BOLD, 12));
		nbre.setBounds(255, 536, 46, 14);
		frame.getContentPane().add(nbre);
		
		
		
		try {
			
			String q="select count(nomemp) from emplacement where etat='d'";
			Statement st2=con.createStatement();						
			ResultSet rs3=st2.executeQuery(q);
			
			int nbr=0;
			while(rs3.next()){
			nbr=rs3.getInt(1);
			nbre.setText(""+nbr);
			}
		}
		
		catch (Exception ey){
			System.out.println("nt");
		}
		
		

		/* bouton entrer */
		JButton btnEntrer = new JButton("Entrer");
		btnEntrer.setBounds(848, 353, 72, 31);
		frame.getContentPane().add(btnEntrer);
		
		/* matricule */
		JLabel lblMatricule_1 = new JLabel("Matricule :");
		lblMatricule_1.setBounds(1052, 37, 87, 14);
		lblMatricule_1.setFont(new Font("Arial", Font.BOLD, 14));
		frame.getContentPane().add(lblMatricule_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(1052, 62, 105, 20);
		frame.getContentPane().add(comboBox_1);
		try {
			String query="select * from VOITURE_GARÉE vg,voiture v  where vg.etat='in' and v.id=vg.id";
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			
			String[] liste=new String[30];
			int nb=0;
			
			while (rs.next()){
				liste[nb]=rs.getString("matricule");
				nb++;
				}
			comboBox_1.setModel(new DefaultComboBoxModel(liste));
			frame.getContentPane().add(comboBox_1);
		}
		
		catch (Exception e){
			JOptionPane.showMessageDialog(null,"e");
		}
		comboBox_1.setSelectedIndex(-1);

		
		
		/* Marque */
		JLabel Marque = new JLabel("Marque :");
		Marque.setBounds(837,112, 106, 14);
		Marque.setFont(new Font("Arial", Font.BOLD, 14));
		frame.getContentPane().add(Marque);
		
		textField_1 = new JTextField();
		textField_1.setBounds(837, 137, 105, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		
		/* ticket */
		JLabel lblTicket = new JLabel("Ticket : ");
		lblTicket.setBounds(1052, 112, 72, 14);
		lblTicket.setFont(new Font("Arial", Font.BOLD, 14));
		frame.getContentPane().add(lblTicket);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Arial", Font.PLAIN, 12));
		textArea.setBounds(1052, 140, 140, 104);
		textArea.setText("");
		frame.getContentPane().add(textArea);
		
		/* sortir */
		JButton btnSortit = new JButton("Ticket");
		btnSortit.setBounds(1052, 353, 69, 31);
		frame.getContentPane().add(btnSortit);
		
		
		/* interagir avec l'interface */
		ImageIcon img1=new ImageIcon("C:\\Users\\maher\\Desktop\\park\\Parking\\voituremonter2.gif");

		
		p1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {	

				try {
						String query="select * from emplacement where nomemp='p1'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
	
						String et=null;
						String empp=null;
						String mat=null;
						String marq=null;
						while(rs2.next()){
							et=rs2.getString(2);
							empp=rs2.getString(1);
						}

						switch (et) {  
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P1: Disponible"); 
							comboBox.setSelectedItem(empp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p1' and v.id=vg.id  and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
							 mat=rs11.getString("matricule");
							 marq=rs11.getString("marque");
								comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
						
					
				 } }
				 catch (Exception ee){
						javax.swing.JOptionPane.showMessageDialog(null,"Erreur"); 
				 }
	
			}
		});
		
		p2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query2="select * from emplacement where NOMEMP='p2'";
						Statement stt=con.createStatement();						
						ResultSet rss=stt.executeQuery(query2);
						String marq=null;

						String empp=null;
						String ett=null;
						String mat=null;
						while(rss.next()){
							ett=rss.getString("etat");
							empp=rss.getString("nomemp");
							switch (ett) {
							case "d":
								javax.swing.JOptionPane.showMessageDialog(null,"P2: Disponible"); 
								comboBox.setSelectedItem(empp);
								break ;
								
							case "nd":
								String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p2' and v.id=vg.id  and etat='in'";
								Statement st11=con.createStatement();						
								ResultSet rs11=st11.executeQuery(q11);
								while(rs11.next()){
									 mat=rs11.getString("matricule");
									 marq=rs11.getString("marque");									
									 comboBox_1.setSelectedItem(mat);
									javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
								break;
					 }
						}
						
				 }
				 catch (Exception ee2){
						javax.swing.JOptionPane.showMessageDialog(null,"E"); 
				 }		}
		});
		
		p3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p3'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						
						String marq=null;
						String emp=null;
						String et=null;
						String mat=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P3: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p3' and v.id=vg.id  and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");									
								 comboBox_1.setSelectedItem(mat);
									javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p4'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						
						String marq=null;
						String emp=null;
						String et=null;
						String mat=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P4: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p4' and v.id=vg.id  and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
									javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p5'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;

						String emp=null;
						String et=null;
						String mat=null;

						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P5: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p5' and v.id=vg.id  and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");								
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p6'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;

						String emp=null;
						String et=null;
						String mat=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P6: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p6' and v.id=vg.id  and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p7'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;

						String emp=null;
						String et=null;
						String mat=null;
						
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P7: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p7'  and v.id=vg.id  and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }		}
		});
		
		p8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p8'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;

						String emp=null;
						String et=null;
						String mat=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P8: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p8' and v.id=vg.id  and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p9'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;

						String emp=null;
						String et=null;
						String mat=null;

						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P9: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p9' and v.id=vg.id  and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p10'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String mat=null;
						String emp=null;
						String et=null;
						String marq=null;

						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P10: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p10' and v.id=vg.id  and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		

		p11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p11'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;

						String mat=null;
						String emp=null;
						String et=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P11: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p11' and v.id=vg.id  and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
						
							
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }
				
			}
		});
		
		p12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p12'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;

						String emp=null;
						String et=null;
						String mat=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P12: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p12' and v.id=vg.id  and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p13'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;

						String emp=null;
						String et=null;
						String mat=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P13: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p13' and v.id=vg.id  and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p14'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;

						String emp=null;
						String et=null;
						String mat=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P14: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p14' and v.id=vg.id and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p15'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;

						String emp=null;
						String et=null;
						String mat=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P15: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p15' and v.id=vg.id and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p16'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;

						String emp=null;
						String et=null;
						String mat=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P16: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p16' and v.id=vg.id and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p17'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;

						String emp=null;
						String et=null;
						String mat=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P17: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p17' and v.id=vg.id and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p18'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;

						String emp=null;
						String et=null;
						String mat=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P18: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p18' and v.id=vg.id and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p19'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;

						String emp=null;
						String et=null;
						String mat=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P19: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p19' and v.id=vg.id and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p20'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;

						String emp=null;
						String et=null;
						String mat=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P20: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p20' and v.id=vg.id and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p21'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;
						String emp=null;
						String et=null;
						String mat=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P21: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p21' and v.id=vg.id and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p22'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;

						String emp=null;
						String et=null;
						String mat=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P22: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p22' and v.id=vg.id and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p23'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String mat=null;
						String emp=null;
						String marq=null;

						String et=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P23: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p23' and v.id=vg.id and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p24'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;

						String emp=null;
						String et=null;
						String mat=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P24: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p24' and v.id=vg.id and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p25'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;

						String emp=null;
						String et=null;
						String mat=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P25: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p25' and v.id=vg.id and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p26'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;

						String emp=null;
						String et=null;
						String mat=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P26: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p26' and v.id=vg.id and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p27'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;

						String emp=null;
						String et=null;
						String mat=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P27: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p27' and v.id=vg.id and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p28'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;

						String emp=null;
						String et=null;
						String mat=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P28: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p28' and v.id=vg.id and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p29'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;

						String emp=null;
						String et=null;
						String mat=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P29 Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p29' and v.id=vg.id and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		p30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 try {
						String query="select * from emplacement where nomemp='p30'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String marq=null;

						String emp=null;
						String et=null;
						String mat=null;
						while(rs2.next()){
							et=rs2.getString(2);
							emp=rs2.getString(1);
						}
						switch (et) {
						case "d":
							javax.swing.JOptionPane.showMessageDialog(null,"P30: Disponible"); 
							comboBox.setSelectedItem(emp);
							break ;
							
						case "nd":
							String q11="select * from VOITURE_GARÉE vg,voiture v where vg.nomemp='p30' and v.id=vg.id and etat='in'";
							Statement st11=con.createStatement();						
							ResultSet rs11=st11.executeQuery(q11);
							while(rs11.next()){
								mat=rs11.getString("matricule");
								 marq=rs11.getString("marque");
								 comboBox_1.setSelectedItem(mat);
								javax.swing.JOptionPane.showMessageDialog(null,"place occupée par :"+marq+" "+mat); }
							break;
				 }
				 }
				 
				 catch (Exception ee){
					 javax.swing.JOptionPane.showMessageDialog(null,"E");
				 }			}
		});
		
		
		
		btnEntrer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				
					try {
						String [] tab  =new String[50];
						int nm=0;
						String matr=textField.getText();
						boolean trouve=false;
						String mar=null;
						int coun=0;

						String sel=comboBox.getSelectedItem().toString();
						Statement ast=con.createStatement();						
						ResultSet ars=ast.executeQuery("select * from voiture v,VOITURE_GARÉE vg where v.id=vg.id and etat='in'");
					
						while (ars.next()) {
							tab[nm]=ars.getString("matricule");
							nm++; }
						
					for (int i=0;i<nm;i++){
						if (tab[i].equals(matr))
							trouve=true;
					}
					
					
					if (trouve==false){
					
						String sel2=comboBox.getSelectedItem().toString();
						Statement tst=con.createStatement();						
						ResultSet trs=tst.executeQuery("select count(id) from voiture where matricule='"+textField.getText()+"'");
						while (trs.next()){
							coun=trs.getInt(1);
						}
						if (coun==0){
						
						String queryy="INSERT INTO VOITURE (MATRICULE,Marque) VALUES (?,?)";
						PreparedStatement ps=con.prepareStatement(queryy,Statement.RETURN_GENERATED_KEYS);
						ps.setString(1,textField.getText());
						ps.setString(2,textField_1.getText());
						ps.execute();
						
						PreparedStatement psi=con.prepareStatement("select seq.currval from dual");
						 
						ResultSet rsi=psi.executeQuery();
						int idd=0;
						while (rsi.next()) {
						    idd = (int)rsi.getLong(1);
						}
						 
						
						
						
					

										
						String query="select * from emplacement where nomemp='"+sel+"'";
						Statement st=con.createStatement();						
						ResultSet rs2=st.executeQuery(query);
						String emp=null;
						while(rs2.next()){
							emp=rs2.getString(1);
						}
					
						Calendar cal = Calendar.getInstance();
				        int hour = cal.get(Calendar.HOUR_OF_DAY);
				        int minute = cal.get(Calendar.MINUTE);
						String heure=hour+":"+minute;
						
	
						
					
						
						
						
						String query2="INSERT INTO VOITURE_GARÉE (id,NOMEMP,etat,HEURE_ENTRÉE) VALUES (?,?,?,?)";
						PreparedStatement ps3=con.prepareStatement(query2);
						ps3.setInt(1,idd);
						ps3.setString(2,emp);
						ps3.setString(3,"in");
						ps3.setString(4,heure);
						ps3.execute();
						
						String query3="UPDATE emplacement SET etat='nd' where nomemp='"+sel+"'";
						PreparedStatement ps4=con.prepareStatement(query3);
						ps4.execute();
						JOptionPane.showMessageDialog(null,"Voiture ajoutée");
						
						comboBox_1.addItem(textField.getText());
						
						String q="select count(nomemp) from emplacement where etat='d'";
						Statement st2=con.createStatement();						
						ResultSet rs3=st2.executeQuery(q);
						int nbrr=0;
						while(rs3.next()){
						nbrr=rs3.getInt(1);
						nbre.setText(""+nbrr);
						}
						
						textField.setText("");
						textField_1.setText("");
						switch (sel) {
						case "p1":
							p1.setIcon(img1);
							p1.setText("");

							
							break ;
						case "p2":
							p2.setIcon(img1);
							p2.setText("");
							
							break ;
						case "p3":
							p3.setIcon(img1);
							p3.setText("");
							break ;
						case "p4":
							p4.setIcon(img1);
							p4.setText("");
							break ;	
						case "p5":
							p5.setIcon(img1);
							p5.setText("");
							break ;	
						case "p6":
							p6.setIcon(img1);
							p6.setText("");
							break ;	
						case "p7":
							p7.setIcon(img1);
							p7.setText("");
							break ;	
						case "p8":
							p8.setIcon(img1);
							p8.setText("");
							break ;	
						case "p9":
							p9.setIcon(img1);
							p9.setText("");
							break ;	
						case "p10":
							p10.setIcon(img1);
							p10.setText("");
							break ;	
						case "p11":
							p11.setIcon(img1);
							p11.setText("");
							break ;	
						case "p12":
							p12.setIcon(img1);
							p12.setText("");
							break ;	
						case "p13":
							p13.setIcon(img1);
							p13.setText("");
							break ;	
						case "p14":
							p14.setIcon(img1);
							p14.setText("");
							break ;	
						case "p15":
							p15.setIcon(img1);
							p15.setText("");
							break ;	
						case "p16":
							p16.setIcon(img1);
							p16.setText("");
							break ;	
						case "p17":
							p17.setIcon(img1);
							p17.setText("");
							break ;	
						case "p18":
							p18.setIcon(img1);
							p18.setText("");
							break ;	
						case "p19":
							p19.setIcon(img1);
							p19.setText("");
							break ;	
						case "p20":
							p20.setIcon(img1);
							p20.setText("");
							break ;	
						case "p21":
							p21.setIcon(img1);
							p21.setText("");
							break ;	
						case "p22":
							p22.setIcon(img1);
							p22.setText("");
							break ;	
						case "p23":
							p23.setIcon(img1);
							p23.setText("");
							break ;	
						case "p24":
							p24.setIcon(img1);
							p24.setText("");
							break ;	
						case "p25":
							p25.setIcon(img1);
							p25.setText("");
							break ;	
						case "p26":
							p26.setIcon(img1);
							p26.setText("");
							break ;	
						case "p27":
							p27.setIcon(img1);
							p27.setText("");
							break ;	
						case "p28":
							p28.setIcon(img1);
							p28.setText("");
							break ;	
						case "p29":
							p29.setIcon(img1);
							p29.setText("");
							break ;	
						case "p30":
							p30.setIcon(img1);
							p30.setText("");
							break ;	
						}
						comboBox.removeItem(sel);
						comboBox.setSelectedIndex(-1);
					} 
						else if (coun>0) {
						String sel3=comboBox.getSelectedItem().toString();
						Statement fst=con.createStatement();						
						ResultSet frs=fst.executeQuery("select * from voiture where matricule='"+textField.getText()+"'");
						
						while (frs.next()){
							mar=frs.getString("marque");
						}
						
						if(textField_1.getText().equals(mar)==false) {
							JOptionPane.showMessageDialog(null,"Matricule non correspondante");
						}
						
						else if (textField_1.getText().equals(mar)) {
							String queryy="INSERT INTO VOITURE (MATRICULE,Marque) VALUES (?,?)";
							PreparedStatement ps=con.prepareStatement(queryy,Statement.RETURN_GENERATED_KEYS);
							ps.setString(1,textField.getText());
							ps.setString(2,textField_1.getText());
							ps.execute();
							
							PreparedStatement psi=con.prepareStatement("select seq.currval from dual");
							 
							ResultSet rsi=psi.executeQuery();
							int idd=0;
							while (rsi.next()) {
							    idd = (int)rsi.getLong(1);
							}
							 
							
							
							
						

											
							String query="select * from emplacement where nomemp='"+sel+"'";
							Statement st=con.createStatement();						
							ResultSet rs2=st.executeQuery(query);
							String emp=null;
							while(rs2.next()){
								emp=rs2.getString(1);
							}
						
							Calendar cal = Calendar.getInstance();
					        int hour = cal.get(Calendar.HOUR_OF_DAY);
					        int minute = cal.get(Calendar.MINUTE);
							String heure=hour+":"+minute;
							
		
							
						
							
							
							
							String query2="INSERT INTO VOITURE_GARÉE (id,NOMEMP,etat,HEURE_ENTRÉE) VALUES (?,?,?,?)";
							PreparedStatement ps3=con.prepareStatement(query2);
							ps3.setInt(1,idd);
							ps3.setString(2,emp);
							ps3.setString(3,"in");
							ps3.setString(4,heure);
							ps3.execute();
							
							String query3="UPDATE emplacement SET etat='nd' where nomemp='"+sel+"'";
							PreparedStatement ps4=con.prepareStatement(query3);
							ps4.execute();
							JOptionPane.showMessageDialog(null,"Voiture ajoutée");
							
							comboBox_1.addItem(textField.getText());
							
							String q="select count(nomemp) from emplacement where etat='d'";
							Statement st2=con.createStatement();						
							ResultSet rs3=st2.executeQuery(q);
							int nbrr=0;
							while(rs3.next()){
							nbrr=rs3.getInt(1);
							nbre.setText(""+nbrr);
							}
							
							textField.setText("");
							textField_1.setText("");
							switch (sel) {
							case "p1":
								p1.setIcon(img1);
								p1.setText("");

								
								break ;
							case "p2":
								p2.setIcon(img1);
								p2.setText("");
								
								break ;
							case "p3":
								p3.setIcon(img1);
								p3.setText("");
								break ;
							case "p4":
								p4.setIcon(img1);
								p4.setText("");
								break ;	
							case "p5":
								p5.setIcon(img1);
								p5.setText("");
								break ;	
							case "p6":
								p6.setIcon(img1);
								p6.setText("");
								break ;	
							case "p7":
								p7.setIcon(img1);
								p7.setText("");
								break ;	
							case "p8":
								p8.setIcon(img1);
								p8.setText("");
								break ;	
							case "p9":
								p9.setIcon(img1);
								p9.setText("");
								break ;	
							case "p10":
								p10.setIcon(img1);
								p10.setText("");
								break ;	
							case "p11":
								p11.setIcon(img1);
								p11.setText("");
								break ;	
							case "p12":
								p12.setIcon(img1);
								p12.setText("");
								break ;	
							case "p13":
								p13.setIcon(img1);
								p13.setText("");
								break ;	
							case "p14":
								p14.setIcon(img1);
								p14.setText("");
								break ;	
							case "p15":
								p15.setIcon(img1);
								p15.setText("");
								break ;	
							case "p16":
								p16.setIcon(img1);
								p16.setText("");
								break ;	
							case "p17":
								p17.setIcon(img1);
								p17.setText("");
								break ;	
							case "p18":
								p18.setIcon(img1);
								p18.setText("");
								break ;	
							case "p19":
								p19.setIcon(img1);
								p19.setText("");
								break ;	
							case "p20":
								p20.setIcon(img1);
								p20.setText("");
								break ;	
							case "p21":
								p21.setIcon(img1);
								p21.setText("");
								break ;	
							case "p22":
								p22.setIcon(img1);
								p22.setText("");
								break ;	
							case "p23":
								p23.setIcon(img1);
								p23.setText("");
								break ;	
							case "p24":
								p24.setIcon(img1);
								p24.setText("");
								break ;	
							case "p25":
								p25.setIcon(img1);
								p25.setText("");
								break ;	
							case "p26":
								p26.setIcon(img1);
								p26.setText("");
								break ;	
							case "p27":
								p27.setIcon(img1);
								p27.setText("");
								break ;	
							case "p28":
								p28.setIcon(img1);
								p28.setText("");
								break ;	
							case "p29":
								p29.setIcon(img1);
								p29.setText("");
								break ;	
							case "p30":
								p30.setIcon(img1);
								p30.setText("");
								break ;	
							}
							comboBox.removeItem(sel);
							comboBox.setSelectedIndex(-1);
							
							
						}
							
						
						
						}
						
					
						
					}
						
						
						
					
					else 
					
						JOptionPane.showMessageDialog(null,"voiture déja stationnée");
					
					}

					catch (Exception e2){
						javax.swing.JOptionPane.showMessageDialog(null,"Erreur");
					}
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		btnSortit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
	
					String sel=comboBox_1.getSelectedItem().toString();
					String queryy="select * from VOITURE_GARÉE vg,voiture v where v.matricule='"+sel+"' and vg.id=v.id and vg.etat='in'";
					Statement st=con.createStatement();						
					ResultSet rs2=st.executeQuery(queryy);
					String emp=null;
					while(rs2.next()){
						emp=rs2.getString("NOMEMP");
					}
					
				Calendar cal = Calendar.getInstance();
		        int hour = cal.get(Calendar.HOUR_OF_DAY);
		        int minute = cal.get(Calendar.MINUTE);
		        String heure=hour+":"+minute;


		   
		        String query3="UPDATE VOITURE_GARÉE SET HEURE_SORTIE='"+heure+"'where etat='in' and id in (select id from voiture where matricule='"+sel+"')";
		        PreparedStatement ps4=con.prepareStatement(query3);
				ps4.execute();



		        
				
				String matr=null;
				String he=null;
				String hs=null;
				String marq=null;

				String queryy2="select * from VOITURE_GARÉE vg,voiture v where v.matricule='"+sel+"' and vg.id=v.id and vg.etat='in'";
				Statement st2=con.createStatement();						
				ResultSet rs3=st2.executeQuery(queryy2);

				JOptionPane.showMessageDialog(null,"Voici votre ticket");

				
				while(rs3.next()){
					matr=rs3.getString("MATRICULE");
					he=rs3.getString("HEURE_ENTRÉE");
					hs=rs3.getString("HEURE_SORTIE");
					textArea.setText("Matricule: "+matr+"\n Heure d'entrée: "+he+"\n Heure de sortie: "+hs+"\n Montant : 1dt");				
				}
				


				} 					
			
				catch (Exception ex){
					JOptionPane.showMessageDialog(null,"erreur");
				}
		
		} } );
		
		
		

		
		/* background */
		JLabel lblNewLabel =  new JLabel();
		lblNewLabel.setBounds(0, 0, 924, 601);
		Image img=new ImageIcon(this.getClass().getResource("Parking-Plan.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		frame.getContentPane().add(lblNewLabel);
		

		
		
		
		JButton btnPayer = new JButton("Sortir");
		btnPayer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if (textArea.getText().equals("")){
						JOptionPane.showMessageDialog(null,"ticket svp");
					}
					
					else {
						

					
					String sel=comboBox_1.getSelectedItem().toString();
					String queryy="select * from VOITURE_GARÉE vg,voiture v where v.matricule='"+sel+"' and vg.id=v.id and etat='in'";
					Statement st=con.createStatement();						
					ResultSet rs2=st.executeQuery(queryy);
					String emp=null;
					while(rs2.next()){
						emp=rs2.getString(2);
					}
					
					String query3="UPDATE VOITURE_GARÉE SET etat='out' where id in (select id from voiture where matricule='"+sel+"') and etat='in'";
					PreparedStatement ps4=con.prepareStatement(query3);
					ps4.execute();

					
					String query4="UPDATE emplacement SET  etat='d' where nomemp='"+emp+"'";
					PreparedStatement ps5=con.prepareStatement(query4);
					ps5.execute();
					
					JOptionPane.showMessageDialog(null,"Merci à bientot");
					
						String q="select count(nomemp) from emplacement where etat='d'";
						Statement st2=con.createStatement();						
						ResultSet rs3=st2.executeQuery(q);
						
						int nbr=0;
						while(rs3.next()){
						nbr=rs3.getInt(1);
						nbre.setText(""+nbr);
						}
					
			
					
					
					switch (emp) {
					case "p1":
						p1.setIcon(null);
						p1.setText("P1");
						
						break ;
					case "p2":
						p2.setIcon(null);
						p2.setText("P2");
						break ;
					case "p3":
						p3.setIcon(null);
						p3.setText("P3"); 
						break ;
					case "p4":
						p4.setIcon(null);
						p4.setText("P4");
						break ;	
					case "p5":
						p5.setIcon(null);
						p5.setText("P5");
						break ;	
					case "p6":
						p6.setIcon(null);
						p6.setText("p6");
						break ;	
					case "p7":
						p7.setIcon(null);
						p7.setText("P7");
						break ;	
					case "p8":
						p8.setIcon(null);
						p8.setText("p8");
						break ;	
					case "p9":
						p9.setIcon(null);
						p9.setText("p9");
						break ;	
					case "p10":
						p10.setIcon(null);
						p10.setText("P10");
						break ;	
					case "p11":
						p11.setIcon(null);
						p11.setText("p11");
						break ;	
					case "p12":
						p12.setIcon(null);
						p12.setText("P12");
						break ;	
					case "p13":
						p13.setIcon(null);
						p13.setText("P13");
						break ;	
					case "p14":
						p14.setIcon(null);
						p14.setText("P14");
						break ;	
					case "p15":
						p15.setIcon(null);
						p15.setText("P15");
						break ;	
					case "p16":
						p16.setIcon(null);
						p16.setText("P16");
						break ;	
					case "p17":
						p17.setIcon(null);
						p17.setText("P17");
						break ;	
					case "p18":
						p18.setIcon(null);
						p18.setText("p18");
						break ;	
					case "p19":
						p19.setIcon(null);
						p19.setText("P19");
						break ;	
					case "p20":
						p20.setIcon(null);
						p20.setText("P20");
						break ;	
					case "p21":
						p21.setIcon(null);
						p21.setText("P21");
						break ;	
					case "p22":
						p22.setIcon(null);
						p22.setText("P22");
						break ;	
					case "p23":
						p23.setIcon(null);
						p23.setText("P23");
						break ;	
					case "p24":
						p24.setIcon(null);
						p24.setText("P24");
						break ;	
					case "p25":
						p25.setIcon(null);
						p25.setText("P25");
						break ;	
					case "p26":
						p26.setIcon(null);
						p26.setText("P26");
						break ;	
					case "p27":
						p27.setIcon(null);
						p27.setText("P27");
						break ;	
					case "p28":
						p28.setIcon(null);
						p28.setText("P28");
						break ;	
					case "p29":
						p29.setIcon(null);
						p29.setText("P29");
						break ;	
					case "p30":
						p30.setIcon(null);
						p30.setText("P30");
						break ;	
					 }
					
					comboBox.addItem(emp);
					comboBox_1.removeItem(sel);
					comboBox_1.setSelectedIndex(-1);
						
					textArea.setText("");
					
					
				} 					}
				
				catch (Exception ex){
					JOptionPane.showMessageDialog(null,"Erreur");
				}
				
				
			}
		});
		btnPayer.setBounds(1130, 353, 69, 31);
		frame.getContentPane().add(btnPayer);
		
		JButton btnHistorique = new JButton("Historique");
		btnHistorique.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Historique hist = new Historique();
							hist.frameo.setVisible(true);
							
						} 
						catch (Exception e) {
							e.printStackTrace();
						}  } });} });
							
		btnHistorique.setBounds(1052, 406, 87, 31);
		frame.getContentPane().add(btnHistorique);
		
		
		
		
	}
}