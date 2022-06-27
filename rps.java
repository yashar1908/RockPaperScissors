import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class rps
{ 
    int ctr = 0;   
    int upx = 100;
    int usx = 100;
    int urx = 100;
    int csc = 0; // computer-score
    int usc = 0; // user-score  
        
    public void start() throws Exception
    {
        Random r = new Random();
        
        JFrame f = new JFrame("Rock Paper Scissors");
        f.setSize(1920,1080);
        f.setLayout(null);                                       // the frame user will play in
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f.setDefaultLookAndFeelDecorated(false);
        f.getContentPane().setBackground(Color.YELLOW);
        f.setVisible(true);
        
        JFrame f2 = new JFrame("Rock Paper Scissors");
        f2.setSize(1920,1080);
        f2.setLayout(null);                               // the frame that will be displayed in the end
        f2.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
        f2.setDefaultLookAndFeelDecorated(false);
        f2.getContentPane().setBackground(Color.YELLOW);
        
        JFrame inst = new JFrame();
        inst.setSize(800,600);                         // instructions displaying-frame
        inst.setLocationRelativeTo(null);                 
        inst.setResizable(false);
        inst.getContentPane().setBackground(Color.BLACK);
        
        JLabel Header = new JLabel("Rock Paper Scissors");
        Header.setBounds(650,0,700,80); // x, y, length, breadth
        Header.setFont(new Font("Calibri",Font.ITALIC, 70));
        Header.setForeground(Color.BLUE);
        f.add(Header);
        
        JLabel cpsc = new JLabel("Computer's Score: "+ csc);
        cpsc.setBounds(1450,150,300,50);
        cpsc.setFont(new Font("Arial Bold", Font.PLAIN, 25));
        cpsc.setForeground(Color.BLACK);
        f.add(cpsc);
       
        JLabel usrsc = new JLabel("Your Score: "+ usc);
        usrsc.setBounds(75,150,300,50); // x, y, length, breadth
        usrsc.setFont(new Font("Arial Bold", Font.PLAIN, 25));
        usrsc.setForeground(Color.BLACK);
        f.add(usrsc);
        
        JButton uRock = new JButton("Rock");
        uRock.setBounds(100,300,300,100);
        uRock.setBackground(Color.GRAY);
        uRock.setFont(new Font("Arial Black", Font.PLAIN, 15));
        f.add(uRock);
        
        JButton uPaper = new JButton("Paper");
        uPaper.setBounds(100,500,300,100);
        uPaper.setBackground(Color.WHITE);
        uPaper.setFont(new Font("Arial Black", Font.PLAIN, 15));
        f.add(uPaper);
        
        JButton uScissors = new JButton("Scissors");
        uScissors.setBounds(100,700,300,100);
        uScissors.setBackground(Color.LIGHT_GRAY);
        uScissors.setFont(new Font("Arial Black", Font.PLAIN, 15));
        f.add(uScissors);
        
        JButton cRock = new JButton("Rock");
        cRock.setBounds(1475,300,300,100);
        cRock.setBackground(Color.GRAY);
        cRock.setFont(new Font("Arial Black", Font.PLAIN, 15));
        f.add(cRock);
        
        JButton cPaper = new JButton("Paper");
        cPaper.setBounds(1475,500,300,100);
        cPaper.setBackground(Color.WHITE);
        cPaper.setFont(new Font("Arial Black", Font.PLAIN, 15));
        f.add(cPaper);
        
        JButton cScissors = new JButton("Scissors");
        cScissors.setBounds(1475,700,300,100);
        cScissors.setBackground(Color.LIGHT_GRAY);
        cScissors.setFont(new Font("Arial Black", Font.PLAIN, 15));
        f.add(cScissors);
        
        JButton opq1 = new JButton("You");
        opq1.setBounds(500,500,300,100);
        opq1.setBackground(Color.YELLOW);
        opq1.setFont(new Font("Arial Black", Font.PLAIN, 15));
        opq1.setOpaque(false);
        f.add(opq1);
        
        JButton opq2 = new JButton("Computer");
        opq2.setBounds(1050,500,300,100);
        opq2.setBackground(Color.YELLOW);
        opq2.setFont(new Font("Arial Black", Font.PLAIN, 15));
        opq2.setOpaque(false);
        f.add(opq2);
        
        JLabel vs = new JLabel("V/S");
        vs.setBounds(700,500,300,1000);
        vs.setFont(new Font("Arial Black", Font.PLAIN, 69));
        //f.add(vs);
        
        JButton htp = new JButton("How To Play");
        htp.setBounds(1600,10,300,100);
        htp.setBackground(Color.GREEN);
        htp.setFont(new Font("Arial Black", Font.PLAIN, 15));
        f.add(htp);
        
        JButton res = new JButton("Reset");
        res.setFont(new Font("Arial Black", Font.PLAIN, 15));
        res.setBounds(30,10,300,100);
        res.setBackground(Color.PINK);
        f.add(res);
        
        JLabel instl1 = new JLabel("Press either of the three buttons to make your choice.");
        instl1.setBounds(100,200,100,200);
        instl1.setFont(new Font("Arial Black", Font.PLAIN, 20));
        instl1.setForeground(Color.WHITE);
        inst.add(instl1);
        
        JButton ok = new JButton("OK");
        ok.setFont(new Font("Calibri Header", Font.PLAIN, 20));
        ok.setBounds(700,600,100,50);
        ok.setBackground(Color.WHITE);
        
        JLabel uwin = new JLabel("You Win!!");
        uwin.setBounds(500,500,1000,1000);
        uwin.setFont(new Font("ALGERIAN", Font.BOLD, 50));
        uwin.setForeground(Color.BLUE);
        
        JLabel ulose = new JLabel("You Lose!!");
        ulose.setBounds(500,500,1000,1000);
        ulose.setFont(new Font("ALGERIAN", Font.BOLD, 50));
        ulose.setForeground(Color.RED);
        
        JButton replay = new JButton("Replay");
        replay.setBounds(1000,500,300,100);
        replay.setFont(new Font("Arial Black", Font.PLAIN, 20));
        replay.setBackground(Color.GREEN);
        
        JButton exit = new JButton("Exit");
        exit.setBounds(1400,500,300,100);
        exit.setFont(new Font("Arial Black", Font.PLAIN, 20));
        exit.setBackground(Color.BLUE);

        res.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent rese)
            {
               f.dispose();
            }
        });
        
        htp.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent htpe)
            {
                inst.setVisible(true);
            }
        });
        
        uPaper.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent upe)
            {   
                 upx = 500;
                 uPaper.setBounds(upx,500,300,100);
                 uRock.setBounds(100,300,300,100);
                 uScissors.setBounds(100,700,300,100);
                 f.add(ok);
            }
        });
        
        uRock.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ure)
            {
                urx = 500;
                uPaper.setBounds(100,500,300,100);
                uScissors.setBounds(100,700,300,100);
                uRock.setBounds(urx,500,300,100);
                f.add(ok);
            }
        } );
            
        uScissors.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent use)
            {
                usx = 500;
                uPaper.setBounds(100,500,300,100);
                uScissors.setBounds(usx,500,300,100);
                uRock.setBounds(100,300,300,100);
                f.add(ok);
            }
        });
        
        ok.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent conf)
            {  
                 String cchoice[] = {"Rock", "Paper","Scissors"};
                 int icch = r.nextInt(cchoice.length);
                 String scch = cchoice[icch];
                 System.out.println(scch);
                 if(scch.equals("Rock"))
                  {
                    cRock.setBounds(1050,500,300,100);
                    cScissors.setBounds(1475,700,300,100);
                    cPaper.setBounds(1475,500,300,100);
                    if(upx==500)
                    {
                        usc++;
                        usrsc.setText("Your Score: "+usc);
                    }
                    else if(usx == 500)
                    {
                        csc++;
                        cpsc.setText("Computer's Score: "+csc);
                    }
                 }
                 else if(scch.equals("Paper"))
                  {
                    cRock.setBounds(1475,300,300,100);
                    cScissors.setBounds(1475,700,300,100);
                    cPaper.setBounds(1050,500,300,100);
                    if(usx==500)
                    {
                        usc++;
                        usrsc.setText("Your Score: "+usc);
                    }
                    else if(urx == 500)
                    {
                        csc++;
                        cpsc.setText("Computer's Score: "+csc);
                    }
                 }
                 else if(scch.equals("Scissors"))
                  {
                    cRock.setBounds(1475,300,300,100);
                    cScissors.setBounds(1050,500,300,100);
                    cPaper.setBounds(1475,500,300,100);
                    if(urx==500)
                    {
                        usc++;
                        usrsc.setText("Your Score: "+usc);
                    }
                    else if(upx == 500)
                    {
                        csc++;
                        cpsc.setText("Computer's Score: "+csc);
                    }
                 }
              }
            });
        if(usc == 10 || csc == 10)
        {
            f.dispose();
            f2.setVisible(true);
            f2.add(replay);
            f2.add(exit);
            if(usc == 10)
            {
                f2.add(uwin);
            }
            else if(csc == 10)
            {
                f2.add(ulose);
            }
        }
    }
    public static void main()
    {
         rps obj = new rps(); // object creation 
    }
}
