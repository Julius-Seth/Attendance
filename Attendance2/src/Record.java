
//import statement
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class Record extends JFrame 
{

	private final JPanel contentPane;
	
	public Record() 
	{
		
		setTitle("Record");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
		setBounds(100, 100, 600, 600);
		
		
		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//set ContentPane
		setContentPane(contentPane);
		//set null
		contentPane.setLayout(null);
                
                JLabel id = new JLabel("Student ID");
		id.setBounds(170, 20, 500, 39);
		contentPane.add(id);
                
                JTextField idField = new JTextField("");
                idField.setBounds(250, 20, 150, 30);
                contentPane.add(idField);
                
                JButton searchButton = new JButton("search");
		searchButton.setBounds(240, 60, 100, 30);
		contentPane.add(searchButton);
                
                
 
      
       
        
                
                
  }


}