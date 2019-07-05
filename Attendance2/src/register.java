

import java.sql.*;
import javax.swing.*;



public class register extends JFrame 
{
	
	private JPanel contentPane;
        private JLabel idLabel;
        
	
	public register() 
	{
		
		setTitle("register");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setBounds(100, 100, 450, 300);
		
		
		JPanel contentPane = new JPanel();
		
		
		setContentPane(contentPane);
	
		contentPane.setLayout(null);
    

		JLabel id = new JLabel("Student ID");
		id.setBounds(90, 50, 500, 39);
		contentPane.add(id);
                
                JLabel date = new JLabel("Date(dd-mm-yyyy)");
		date.setBounds(90, 100, 700, 39);
		contentPane.add(date);
                
                JButton registerButton = new JButton("Register");
		registerButton.setBounds(180, 170, 100, 30);
		contentPane.add(registerButton);
                
                
                JTextField idField = new JTextField("");
                idField.setBounds(200, 55, 150, 30);
                contentPane.add(idField);
             
                JTextField dateField = new JTextField("");
                dateField.setBounds(200, 105, 150, 30);
                contentPane.add(dateField);
              
	}
        
   public void insert(String ID, String Student_Name, String Course, String Record){
     
      
      try{
        Connection con = new Database().getConnection();
        Statement stmt=con.createStatement();
         String insert = "SET @ID = " + "" + ",\n" +
                        "    @Student_Name = '" + "" + "',\n" +
                        "    @Course = '" + "" + "',\n" +
                        "    @Record = " + "" + ";\n" +
                        
        stmt.executeUpdate(insert);
      }
      catch(Exception e){
        System.out.println("Databse Error : "+e);
      }
      
   }


    
}