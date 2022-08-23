//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Container;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class JavaBankList extends JFrame {
    private static final long serialVersionUID = 1L;
    public String Name;
    public int Accountnum;
    public int Balance;
    private JPanel inputDetailJPanel;
    private JLabel NameJLabel;
    private JTextField NameJTextField;
    private JLabel AccountnumJLabel;
    private JTextField AccountnumJTextField;
    private JLabel BalanceJLabel;
    private JTextField BalanceJTextField;
    private JLabel DepositJLabel;
    private JTextField DepositJTextField;
    private JLabel WithdrawJLabel;
    private JTextField WithdrawJTextField;
    private JButton CreateAccountJButton;
    private JButton DeleteAccountJButton;
    private JButton TransactionJButton;
    private JButton DisplayJButton;
    private JLabel displayJLabel;
    private static JTextArea displayJTextArea;
    ArrayList<Account> Accounts = new ArrayList();

    public JavaBankList() {
        this.createUserInterface();
    }

    private void createUserInterface() {
        Container contentPane = this.getContentPane();
        contentPane.setLayout((LayoutManager)null);
        this.inputDetailJPanel = new JPanel();
        this.inputDetailJPanel.setBounds(16, 16, 208, 250);
        this.inputDetailJPanel.setBorder(new TitledBorder("Input Details"));
        this.inputDetailJPanel.setLayout((LayoutManager)null);
        contentPane.add(this.inputDetailJPanel);
        this.NameJLabel = new JLabel();
        this.NameJLabel.setBounds(8, 32, 90, 23);
        this.NameJLabel.setText("Name:");
        this.inputDetailJPanel.add(this.NameJLabel);
        this.NameJTextField = new JTextField();
        this.NameJTextField.setBounds(112, 32, 80, 21);
        this.NameJTextField.setHorizontalAlignment(4);
        this.inputDetailJPanel.add(this.NameJTextField);
        this.AccountnumJLabel = new JLabel();
        this.AccountnumJLabel.setBounds(8, 56, 100, 23);
        this.AccountnumJLabel.setText("Account Number:");
        this.inputDetailJPanel.add(this.AccountnumJLabel);
        this.AccountnumJTextField = new JTextField();
        this.AccountnumJTextField.setBounds(112, 56, 80, 21);
        this.AccountnumJTextField.setHorizontalAlignment(4);
        this.inputDetailJPanel.add(this.AccountnumJTextField);
        this.BalanceJLabel = new JLabel();
        this.BalanceJLabel.setBounds(8, 80, 60, 23);
        this.BalanceJLabel.setText("Balance:");
        this.inputDetailJPanel.add(this.BalanceJLabel);
        this.BalanceJTextField = new JTextField();
        this.BalanceJTextField.setBounds(112, 80, 80, 21);
        this.BalanceJTextField.setHorizontalAlignment(4);
        this.inputDetailJPanel.add(this.BalanceJTextField);
        this.DepositJLabel = new JLabel();
        this.DepositJLabel.setBounds(8, 104, 80, 23);
        this.DepositJLabel.setText("Deposit:");
        this.inputDetailJPanel.add(this.DepositJLabel);
        this.DepositJTextField = new JTextField();
        this.DepositJTextField.setBounds(112, 104, 80, 21);
        this.DepositJTextField.setHorizontalAlignment(4);
        this.inputDetailJPanel.add(this.DepositJTextField);
        this.WithdrawJLabel = new JLabel();
        this.WithdrawJLabel.setBounds(8, 128, 60, 23);
        this.WithdrawJLabel.setText("Withdraw:");
        this.inputDetailJPanel.add(this.WithdrawJLabel);
        this.WithdrawJTextField = new JTextField();
        this.WithdrawJTextField.setBounds(112, 128, 80, 21);
        this.WithdrawJTextField.setHorizontalAlignment(4);
        this.inputDetailJPanel.add(this.WithdrawJTextField);
        this.CreateAccountJButton = new JButton();
        this.CreateAccountJButton.setBounds(112, 152, 80, 24);
        this.CreateAccountJButton.setText("Create");
        this.inputDetailJPanel.add(this.CreateAccountJButton);
        this.CreateAccountJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JavaBankList.this.CreateAccountJButtonActionPerformed(event);
            }
        });
        this.DeleteAccountJButton = new JButton();
        this.DeleteAccountJButton.setBounds(16, 152, 80, 24);
        this.DeleteAccountJButton.setText("Delete");
        this.inputDetailJPanel.add(this.DeleteAccountJButton);
        this.DeleteAccountJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JavaBankList.this.DeleteAccountJButtonActionPerformed(event);
            }
        });
        this.TransactionJButton = new JButton();
        this.TransactionJButton.setBounds(16, 180, 176, 24);
        this.TransactionJButton.setText("Make Transaction");
        this.inputDetailJPanel.add(this.TransactionJButton);
        this.TransactionJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JavaBankList.this.TransactionJButtonActionPerformed(event);
            }
        });
        this.DisplayJButton = new JButton();
        this.DisplayJButton.setBounds(16, 208, 176, 24);
        this.DisplayJButton.setText("Display Accounts");
        this.inputDetailJPanel.add(this.DisplayJButton);
        this.DisplayJButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JavaBankList.this.DisplayJButtonActionPerformed(event);
            }
        });
        this.displayJLabel = new JLabel();
        this.displayJLabel.setBounds(240, 16, 150, 23);
        this.displayJLabel.setText("Account Details:");
        contentPane.add(this.displayJLabel);
        displayJTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(displayJTextArea);
        scrollPane.setBounds(240, 48, 402, 184);
        scrollPane.setVerticalScrollBarPolicy(22);
        contentPane.add(scrollPane);
        displayJTextArea.setText("Welcome to Java Bank - There are currently no Accounts created");
        this.NameJTextField.setText("");
        this.AccountnumJTextField.setText("0");
        this.BalanceJTextField.setText("0");
        this.DepositJTextField.setText("0");
        this.WithdrawJTextField.setText("0");
        this.setTitle("Java Bank");
        this.setSize(670, 308);
        this.setVisible(true);
    }

    private void CreateAccountJButtonActionPerformed(ActionEvent event) {
        displayJTextArea.setText("");
        this.Name = "";
        this.Name = this.NameJTextField.getText();
        if (this.AccountnumJTextField.getText() == "0") {
            this.Accountnum = 0;
        } else {
            this.Accountnum = Integer.parseInt(this.AccountnumJTextField.getText());
        }

        if (this.BalanceJTextField.getText() == "0") {
            this.Balance = 0;
        } else {
            this.Balance = Integer.parseInt(this.BalanceJTextField.getText());
        }

        if (this.Name != "" & this.Accountnum != 0) {
            this.Accounts.add(new Account(this.Name, this.Accountnum, this.Balance));
            Account tempAccount = (Account)this.Accounts.get(this.Accounts.size() - 1);
            displayJTextArea.setText(this.Accounts.size() + " " + tempAccount.getAccountName() + " " + tempAccount.getAccountNum() + " " + tempAccount.getBalance());
        } else {
            displayJTextArea.setText("Both the Name field and Account Number must be completed");
        }

        this.NameJTextField.setText("");
        this.AccountnumJTextField.setText("0");
        this.BalanceJTextField.setText("0");
        this.DepositJTextField.setText("0");
        this.WithdrawJTextField.setText("0");
    }

    private void DeleteAccountJButtonActionPerformed(ActionEvent event) {
        displayJTextArea.setText("Oops this isnt coded in this version!");
        this.NameJTextField.setText(" ");
        this.AccountnumJTextField.setText("0");
        this.BalanceJTextField.setText("0");
        this.DepositJTextField.setText("0");
        this.WithdrawJTextField.setText("0");
    }

    private void TransactionJButtonActionPerformed(ActionEvent event) {
        displayJTextArea.setText("");
        if (this.Accounts.size() == 0) {
            displayJTextArea.setText("No Accounts currently created");
        } else {
            int Accountnum = Integer.parseInt(this.AccountnumJTextField.getText());
            int Deposit = Integer.parseInt(this.DepositJTextField.getText());
            int Withdraw = Integer.parseInt(this.WithdrawJTextField.getText());

            for(int i = 0; i < this.Accounts.size(); ++i) {
                Account tempAccount = (Account)this.Accounts.get(i);
                if (tempAccount.accountNum == Accountnum && Deposit > 0) {
                    tempAccount.setBalance(tempAccount.getBalance() + Deposit);
                    this.Accounts.set(i, tempAccount);
                    displayJTextArea.setText(tempAccount.getAccountName() + " " + tempAccount.getAccountNum() + " " + tempAccount.getBalance());
                }

                if (tempAccount.accountNum == Accountnum && Withdraw > 0) {
                    tempAccount.setBalance(tempAccount.getBalance() - Withdraw);
                    this.Accounts.set(i, tempAccount);
                    displayJTextArea.setText(tempAccount.getAccountName() + " " + tempAccount.getAccountNum() + " " + tempAccount.getBalance());
                }
            }
        }

        this.NameJTextField.setText("");
        this.AccountnumJTextField.setText("0");
        this.BalanceJTextField.setText("0");
        this.DepositJTextField.setText("0");
        this.WithdrawJTextField.setText("0");
    }

    private void DisplayJButtonActionPerformed(ActionEvent event) {
        this.Name = this.NameJTextField.getText();
        displayJTextArea.setText("");
        if (this.Accounts.isEmpty()) {
            displayJTextArea.setText("No Accounts currently created");
        } else {
            for(int i = 0; i < this.Accounts.size(); ++i) {
                Account tempAccount = (Account)this.Accounts.get(i);
                displayJTextArea.append(tempAccount.getAccountName() + " " + tempAccount.getAccountNum() + " " + tempAccount.getBalance() + "\n");
            }
        }

        this.NameJTextField.setText("");
        this.AccountnumJTextField.setText("0");
        this.BalanceJTextField.setText("0");
        this.DepositJTextField.setText("0");
        this.WithdrawJTextField.setText("0");
    }

    public static void main(String[] args) {
        JavaBankList application = new JavaBankList();
        application.setDefaultCloseOperation(3);
    }
}
