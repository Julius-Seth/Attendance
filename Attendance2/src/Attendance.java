
//import statement
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Attendance extends JFrame 
{
	
	private final JPanel contentPane;

	
	public static void main(String[] args)
	{
		
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				
				try 
				{
		
					Attendance frame = new Attendance();
				
					frame.setVisible(true);					
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
    private Object panel;

        
	
	public Attendance()
	{
		
		setTitle("Attendance");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();
		
		contentPane.setBorder(new EmptyBorder(3, 3, 3, 3));
		contentPane.setBackground(Color.blue);
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
	
		final JButton Register = new JButton(" Register");
                final JButton Record = new JButton(" Record");
	
		Register.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{if (event.getSource() == Register){
                {
				
				register frame = new register();
				frame.setVisible(true);
			
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                }
			}
                        }
                        });
                
               Record.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{if (event.getSource() == Record){
                {
			
				Record frame = new Record();
				frame.setVisible(true);
				
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                }
			}
                        }
                        });
                
                
		
		Register.setFont(new Font("Micros", Font.BOLD, 15));
                Record.setFont(new Font("Micros", Font.BOLD, 15));
		
		Register.setBounds(45, 180, 160, 30);
                Record.setBounds(230, 180, 150, 30);
		
		contentPane.add(Register);
                contentPane.add(Record);
		

		JLabel mainText = new JLabel("Welcome To  Attendance");
		
		mainText.setForeground(Color.white);
		
                mainText.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 24));
	
		mainText.setBounds(80, 82, 300, 39);
		
		contentPane.add(mainText);
	
		
		
	}
}