package revolution;
import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;

public class AddEmployee extends JFrame implements ActionListener
{

    private Random uniqID = new Random();
    private int UID = uniqID.nextInt(99999);
    private JTextField namefield, fnamefield, mnamefield, contfield, emfield, addfield, nidfield, dgfield, slrfield, erexpfield, gdyearfield, hscfield;
    private JDateChooser dbfield;
    private JComboBox msfield, bgpfield, bckgrndfield;
    private JLabel empUnqID;
    private JButton add, back, close, dmode;
    private Font e= new Font("Arial",Font.BOLD,15);
    private Font f= new Font("Arial",Font.BOLD,20);
    private Font g= new Font("Arial",Font.BOLD,25);
    private Font h= new Font("Arial",Font.BOLD,30);
    private Font i= new Font("Serif",Font.PLAIN,18);
    private Color c1 = new Color(53, 87, 255);
    private Color c2 = new Color(178, 0, 0);

    AddEmployee()
    {
        ImageIcon a = new ImageIcon(ClassLoader.getSystemResource("icons/Add_Employee.png"));
        Image a1 = a.getImage().getScaledInstance(870,770, Image.SCALE_SMOOTH);
        ImageIcon a2 = new ImageIcon(a1);
        JLabel image_01 = new JLabel(a2);
        image_01.setBounds(0, 0, 900, 700);
        add(image_01);

        JLabel empID = new JLabel("Employee Unique ID : ");
        empID.setBounds(225, 30, 500, 50);
        empID.setFont(g);
        image_01.add(empID);

        empUnqID = new JLabel(" " + UID);
        empUnqID.setBounds(480, 30, 500, 50);
        empUnqID.setFont(h);
        image_01.add(empUnqID);

        ImageIcon Dark = new ImageIcon(ClassLoader.getSystemResource("icons/dark_mode.png"));
        Image Dark1 = Dark.getImage().getScaledInstance(35,35, Image.SCALE_SMOOTH);
        ImageIcon Dark2 = new ImageIcon(Dark1);

        dmode = new JButton();
        dmode.setBounds(645, 38, 35, 35); //x=755
        dmode.addActionListener(this);
        dmode.setIcon(Dark2);
        dmode.setBackground(Color.WHITE);
        dmode.setFocusable(false);
        image_01.add(dmode);

        JLabel name = new JLabel("Full Name");
        name.setBounds(50, 130, 150, 30);
        name.setFont(f);
        image_01.add(name);

        namefield = new JTextField();
        namefield.setBounds(200, 130, 150, 30);
        namefield.setHorizontalAlignment(JTextField.CENTER);
        namefield.setFont(i);
        image_01.add(namefield);

        JLabel fname = new JLabel("Father's Name");
        fname.setBounds(50, 180, 150, 30);
        fname.setFont(f);
        image_01.add(fname);

        fnamefield = new JTextField();
        fnamefield.setBounds(200, 180, 150, 30);
        fnamefield.setHorizontalAlignment(JTextField.CENTER);
        fnamefield.setFont(i);
        image_01.add(fnamefield);

        JLabel mname = new JLabel("Mother's Name");
        mname.setBounds(50, 230, 150, 30);
        mname.setFont(f);
        image_01.add(mname);

        mnamefield = new JTextField();
        mnamefield.setBounds(200, 230, 150, 30);
        mnamefield.setHorizontalAlignment(JTextField.CENTER);
        mnamefield.setFont(i);
        image_01.add(mnamefield);

        JLabel dateOfBirth = new JLabel("Date of Birth");
        dateOfBirth.setBounds(50, 280, 150, 30);
        dateOfBirth.setFont(f);
        image_01.add(dateOfBirth);

        dbfield = new JDateChooser();
        dbfield.setBounds(200, 280, 150, 30);
        dbfield.setFont(i);
        image_01.add(dbfield);

        JLabel contNum = new JLabel("Contact No.");
        contNum.setBounds(50, 330, 150, 30);
        contNum.setFont(f);
        image_01.add(contNum);

        contfield = new JTextField();
        contfield.setBounds(200, 330, 150, 30);
        contfield.setHorizontalAlignment(JTextField.CENTER);
        contfield.setFont(i);
        image_01.add(contfield);

        JLabel email = new JLabel("Email");
        email.setBounds(50, 380, 150, 30);
        email.setFont(f);
        image_01.add(email);

        emfield = new JTextField();
        emfield.setBounds(200, 380, 150, 30);
        emfield.setHorizontalAlignment(JTextField.CENTER);
        emfield.setFont(i);
        image_01.add(emfield);

        JLabel mstatus = new JLabel("Marital Status");
        mstatus.setBounds(50, 430, 150, 30);
        mstatus.setFont(f);
        image_01.add(mstatus);

        String moptions[] = {"","Single","Married"};
        msfield = new JComboBox(moptions);
        msfield.setBackground(Color.WHITE);
        msfield.setBounds(200, 430, 150, 30);
        msfield.setFont(i);
        image_01.add(msfield);

        JLabel bGrp = new JLabel("Blood Group");
        bGrp.setBounds(50, 480, 150, 30);
        bGrp.setFont(f);
        image_01.add(bGrp);

        String boptions[] = {"","O+","O-","A+","A-","B+","B-","AB+","AB-"};
        bgpfield = new JComboBox(boptions);
        bgpfield.setBackground(Color.WHITE);
        bgpfield.setBounds(200, 480, 150, 30);
        bgpfield.setFont(i);
        image_01.add(bgpfield);

        JLabel address = new JLabel("Home Address");
        address.setBounds(400+30+15, 130, 150, 30);
        address.setFont(f);
        image_01.add(address);

        addfield = new JTextField();
        addfield.setBounds(600+30+15, 130, 150, 30);
        addfield.setHorizontalAlignment(JTextField.CENTER);
        addfield.setFont(i);
        image_01.add(addfield);

        JLabel bckgrnd = new JLabel("Background");
        bckgrnd.setBounds(400+30+15, 200-20, 150, 30);
        bckgrnd.setFont(f);
        image_01.add(bckgrnd);

        String hoptions[] = {"","PHD","BBA", "MBA", "BSC", "MSC", "BTech", "BCom", "B.A", "M.A"};
        bckgrndfield = new JComboBox(hoptions);
        bckgrndfield.setBackground(Color.WHITE);
        bckgrndfield.setBounds(600+30+15, 200-20, 150, 30);
        bckgrndfield.setFont(i);
        image_01.add(bckgrndfield);

        JLabel nid = new JLabel("NID Number");
        nid.setBounds(400+30+15, 250-20, 200, 30);
        nid.setFont(f);
        image_01.add(nid);

        nidfield = new JTextField();
        nidfield.setBounds(600+30+15, 250-20, 150, 30);
        nidfield.setHorizontalAlignment(JTextField.CENTER);
        nidfield.setFont(i);
        image_01.add(nidfield);

        JLabel hsc = new JLabel("HSC Batch");
        hsc.setBounds(400+30+15, 300-20, 200, 30);
        hsc.setFont(f);
        image_01.add(hsc);

        hscfield = new JTextField();
        hscfield.setBounds(600+30+15, 300-20, 150, 30);
        hscfield.setHorizontalAlignment(JTextField.CENTER);
        hscfield.setFont(i);
        image_01.add(hscfield);

        JLabel gdyear = new JLabel("Graduation Year");
        gdyear.setBounds(400+30+15, 350-20, 200, 30);
        gdyear.setFont(f);
        image_01.add(gdyear);

        gdyearfield = new JTextField();
        gdyearfield.setBounds(600+30+15, 350-20, 150, 30);
        gdyearfield.setHorizontalAlignment(JTextField.CENTER);
        gdyearfield.setFont(i);
        image_01.add(gdyearfield);

        JLabel pvex = new JLabel("Earlier Experience");
        pvex.setBounds(400+30+15, 400-20, 200, 30);
        pvex.setFont(f);
        image_01.add(pvex);

        erexpfield = new JTextField();
        erexpfield.setBounds(600+30+15, 400-20, 150, 30);
        erexpfield.setHorizontalAlignment(JTextField.CENTER);
        erexpfield.setFont(i);
        image_01.add(erexpfield);

        JLabel dg = new JLabel("Designation");
        dg.setBounds(400+30+15, 450-20, 200, 30);
        dg.setFont(f);
        image_01.add(dg);

        dgfield = new JTextField();
        dgfield.setBounds(600+30+15, 450-20, 150, 30);
        dgfield.setHorizontalAlignment(JTextField.CENTER);
        dgfield.setFont(i);
        image_01.add(dgfield);

        JLabel slr = new JLabel("Salary");
        slr.setBounds(400+30+15, 500-20, 200, 30);
        slr.setFont(f);
        image_01.add(slr);

        slrfield = new JTextField();
        slrfield.setBounds(600+30+15, 500-20, 150, 30);
        slrfield.setHorizontalAlignment(JTextField.CENTER);
        slrfield.setFont(i);
        image_01.add(slrfield);

        back = new JButton("< Back");
        back.setBounds(150, 575, 150, 40);
        back.setFont(e);
        back.addActionListener(this);
        //back.setBackground(Color.BLACK);
        back.setBackground(c1);
        back.setForeground(Color.WHITE);
        back.setFocusable(false);
        image_01.add(back);

        add = new JButton("Add Details");
        add.setBounds(350, 567, 150, 55);
        add.setFont(f);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.setFocusable(false);
        image_01.add(add);

        close = new JButton("Close >");
        close.setBounds(550, 575, 150, 40);
        close.setFont(e);
        close.addActionListener(this);
        //close.setBackground(Color.BLACK);
        close.setBackground(c2);
        close.setForeground(Color.WHITE);
        close.setFocusable(false);
        image_01.add(close);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("New Employee : " + UID);
        setSize(870, 770);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() == add)
        {

            String empId = empUnqID.getText();
            String name = namefield.getText();
            String fname = fnamefield.getText();
            String mname= mnamefield.getText();
            String dob = ((JTextField) dbfield.getDateEditor().getUiComponent()).getText();
            String phone = contfield.getText();
            String email = emfield.getText();
            String mstatus = (String) msfield.getSelectedItem();
            String bg= (String) bgpfield.getSelectedItem();
            String address = addfield.getText();
            String bckgrnd = (String) bckgrndfield.getSelectedItem();
            String nid = nidfield.getText();
            String hsc= hscfield.getText();
            String gdyear= gdyearfield.getText();
            String erexp= erexpfield.getText();
            String designation = dgfield.getText();
            String salary = slrfield.getText();

            try
            {
                sqlConnect conn = new sqlConnect();
                String query = "insert into employee values( '"+empId+"', '"+name+"', '"+fname+"', '"+mname+"', '"+dob+"', '"+phone+"', '"+email+"', '"+mstatus+"', '"+bg+"', '"+address+"', '"+bckgrnd+"', '"+nid+"', '"+hsc+"', '"+gdyear+"', '"+erexp+"', '"+designation+"', '"+salary+"' )";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
                setVisible(false);
                new Home();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        else if(ae.getSource() == back)
        {
            setVisible(false);
            new Home();
        }

        else if(ae.getSource() == close)
        {
            setVisible(false);
        }

        else if(ae.getSource() == dmode)
        {
            setVisible(false);
            new Dark_Add();
        }
        else{}
    }

    public static void main(String[] args)
    {
        new AddEmployee();
    }
}
