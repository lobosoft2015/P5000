package P5000;

//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
//import javax.swing.JButton;
//import javax.swing.JCheckBox;
//import javax.swing.JList;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import java.awt.Color;

//import javax.swing.JSplitPane;
//import javax.swing.JTabbedPane;
//import javax.swing.JInternalFrame;
//import javax.swing.JDesktopPane;

//import java.awt.Panel;

import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFileChooser;

import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Interface_Grafica extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface_Grafica frame = new Interface_Grafica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

    public static String removeCaracteresFromString(String str, String charsRemove, String delimiter) {
        
        if (charsRemove!=null && charsRemove.length()>0 && str!=null) {
         
        String[] remover = charsRemove.split(delimiter);
         
        for(int i =0; i < remover.length ; i++) {
            //System.out.println("i: " + i + " ["+ remover[i]+"]");
            if (str.indexOf(remover[i]) != -1){
                str = str.replace(remover[i], "");
            }
        }
    }
     
    return str;
}	
	/**
	 * Create the frame.
	 */
    
	public Interface_Grafica() {
		getContentPane().setFocusable(false);
		getContentPane().setFocusTraversalKeysEnabled(false);
		getContentPane().setEnabled(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 474);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setToolTipText("Menu");
		setJMenuBar(menuBar);
		
		JMenu MnuArquivos = new JMenu("Arquivos");
		menuBar.add(MnuArquivos);
		;
		JMenuItem MnuNovo = new JMenuItem("Novo");
		MnuNovo.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				textField.setText("");	
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
			}
		});
		MnuArquivos.add(MnuNovo);
		
		JMenuItem MnuAbrirPlaqueta= new JMenuItem("Abrir Plaqueta");
		MnuAbrirPlaqueta.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Abrindo plaqueta");
			    FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivo de plaquetas", "PLQ");
			    fileChooser.setFileFilter(filter);
			    fileChooser.setCurrentDirectory(new File("." + "//Arquivos"));// Caminho de destino 
			    //fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));//Vai para a pasta do projeto
			    //fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));//Vai para a pasta do usuario
		        int resultado = fileChooser.showOpenDialog(fileChooser);// Chama a caixa de dialogo
		        if (resultado == JFileChooser.APPROVE_OPTION) {
		        	File Arquivo = fileChooser.getSelectedFile(); //Seleciona o arquivo
		        	//System.out.println("O arquivo selecionado: " + resultado); // Imprime no console
		        	try {
		        	FileReader arq = new FileReader(Arquivo); 
		        	BufferedReader lerArq = new BufferedReader(arq);
		        	// lê linha por linha
		        	String linha = lerArq.readLine();
		        	textField.setText(linha);
		        	linha = lerArq.readLine();       
		        	textField_1.setText(linha);
		        	linha = lerArq.readLine();       
		        	textField_2.setText(linha);
		        	linha = lerArq.readLine();       
		        	textField_3.setText(linha);
		        	linha = lerArq.readLine();       
		        	textField_4.setText(linha);
		        	linha = lerArq.readLine();       
		        	textField_5.setText(linha);
		        	linha = lerArq.readLine();       
		        	textField_6.setText(linha);
		        	linha = lerArq.readLine();       
		        	textField_7.setText(linha);
		        	linha = lerArq.readLine();       
		        	textField_8.setText(linha);
		        	linha = lerArq.readLine();       
		        	textField_9.setText(linha);
		        	linha = lerArq.readLine();       
		        	textField_10.setText(linha);
		        	linha = lerArq.readLine();       
		        	textField_11.setText(linha);
		        	linha = lerArq.readLine();       
		        	textField_12.setText(linha);
		        	linha = lerArq.readLine();       
		        	textField_13.setText(linha);
		        	linha = lerArq.readLine();       
		        	textField_14.setText(linha);
		        	linha = lerArq.readLine();       
		        	textField_15.setText(linha);
		        	linha = lerArq.readLine();       
		        	textField_16.setText(linha);
		        	linha = lerArq.readLine();       
		        	textField_17.setText(linha);
		        	linha = lerArq.readLine();       
		        	textField_18.setText(linha);
		        	linha = lerArq.readLine();       
		        	textField_19.setText(linha);
		        	linha = lerArq.readLine();       
		        	textField_20.setText(linha);
		        	linha = lerArq.readLine();       
		        	textField_21.setText(linha);
		        	linha = lerArq.readLine();       
		        	textField_22.setText(linha);
		        	linha = lerArq.readLine();       
		        	textField_23.setText(linha);
		        	
		        	while (linha != null) {
		        		//lê enquanto não é null senão fecha o arquivo
		        		linha = lerArq.readLine(); 
		        	} 
		        	arq.close();
		        	
		        	} 	catch (IOException f) {
		        		System.err.printf("Erro na abertura do arquivo: %s.\n", 
		        			f.getMessage()); 
		        	} 
		        	//System.out.println(); 
		        	}
			}
		});
		MnuArquivos.add(MnuAbrirPlaqueta);
		
		JMenuItem MnuSalvaPlaquetas= new JMenuItem("Salvar Plaqueta");
		MnuSalvaPlaquetas.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setCurrentDirectory(new File("."));
				String nome = textField_1.getText(); 
			    String arq = "Arquivos/" + nome + ".plq";
			    try {
					PrintWriter gravarArq = new PrintWriter(arq); 
					gravarArq.write(textField.getText()+"\r\n");
					gravarArq.write(textField_1.getText()+"\r\n");
					gravarArq.write(textField_2.getText()+"\r\n");
					gravarArq.write(textField_3.getText()+"\r\n");
					gravarArq.write(textField_4.getText()+"\r\n");
					gravarArq.write(textField_5.getText()+"\r\n");
					gravarArq.write(textField_6.getText()+"\r\n");
					gravarArq.write(textField_7.getText()+"\r\n");
					gravarArq.write(textField_8.getText()+"\r\n");
					gravarArq.write(textField_9.getText()+"\r\n");
					gravarArq.write(textField_10.getText()+"\r\n");
					gravarArq.write(textField_11.getText()+"\r\n");
					gravarArq.write(textField_12.getText()+"\r\n");
					gravarArq.write(textField_13.getText()+"\r\n");
					gravarArq.write(textField_14.getText()+"\r\n");
					gravarArq.write(textField_15.getText()+"\r\n");
					gravarArq.write(textField_16.getText()+"\r\n");
					gravarArq.write(textField_17.getText()+"\r\n");
					gravarArq.write(textField_18.getText()+"\r\n");
					gravarArq.write(textField_19.getText()+"\r\n");
					gravarArq.write(textField_20.getText()+"\r\n");
					gravarArq.write(textField_21.getText()+"\r\n");
					gravarArq.write(textField_22.getText()+"\r\n");
					gravarArq.write(textField_23.getText()+"\r\n");
					gravarArq.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					} 
			}
		});
		MnuArquivos.add(MnuSalvaPlaquetas);
		
		JMenuItem MnuImportarDados= new JMenuItem("Importar Dados");
		MnuImportarDados.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Importando dados de plaqueta");
			    FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivo de Importação", "PDD");
			    fileChooser.setFileFilter(filter);
			    fileChooser.setCurrentDirectory(new File("D:\\plaqueta\\pedidos"));// Caminho de destino 
			    //fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));//Vai para a pasta do projeto
			    //fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));//Vai para a pasta do usuario
		        int resultado = fileChooser.showOpenDialog(fileChooser);// Chama a caixa de dialogo
		        if (resultado == JFileChooser.APPROVE_OPTION) {
		        	File Arquivo = fileChooser.getSelectedFile(); //Seleciona o arquivo
		        	//System.out.println("O arquivo selecionado: " + resultado); // Imprime no console
		        	try {
		        	FileReader arq = new FileReader(Arquivo); 
		        	BufferedReader lerArq = new BufferedReader(arq);
		        	// lê linha por linha
		        	String linha = lerArq.readLine();//0 - Não usado
		        	linha = lerArq.readLine();       //1 - produto
		        	textField_5.setText(linha);	
		        	
		        	linha = lerArq.readLine();       //2 - modelo (Tipo)
		        	//linha = removeCaracteresFromString(linha, "*", ";"); //elimina caracteres da string

		        	String linha1 = linha;  
		            String linha2 = linha1.replace("*", " ");  
		            String linha3 = linha2.replaceAll("   ", " "); 
		            String str = linha3;
		            str = str.trim(); 
		            textField_2.setText(str);
		            
		        	linha = lerArq.readLine();       //3 - Cliente
		        	textField.setText(linha);	
		        	linha = lerArq.readLine();       //4 - Não usado
		        	linha = lerArq.readLine();       //5 - TAG
		        	textField_3.setText(linha);
		        	linha = lerArq.readLine();       //6 - Pedido de venda
		        	textField_4.setText(linha);
		        	linha = lerArq.readLine();       //7 - 0 - Não usado
		        	linha = lerArq.readLine();       //8 - Serie
		        	textField_6.setText(linha);
		        	textField_1.setText(linha);
		        	linha = lerArq.readLine();       //9 - Não usado
		        	linha = lerArq.readLine();       //10 - Não usado
		        	linha = lerArq.readLine();       //11 - Temperatura de trabalho
		        	linha1 = lerArq.readLine();//12 - Temperatura maxima
		        	textField_11.setText(linha + "/" + linha1);
		        	linha = lerArq.readLine();       //13 - Não usado
		        	linha = lerArq.readLine();       //14 - Densidade
		        	textField_16.setText(linha);
		        	linha = lerArq.readLine();       //15 - vazão máxima
		        	linha1 = lerArq.readLine();       //16 - vazão mínima
		        	textField_7.setText(linha + "/" + linha1);		        	
		        	linha = lerArq.readLine();       //17 - Altura
		        	textField_8.setText(linha);
		        	linha = lerArq.readLine();       //18 - Pressão direrencial
		        	textField_12.setText(linha);
		        	linha = lerArq.readLine();       //19 - Não usado
		        	linha = lerArq.readLine();       //20 - NPSH Requerido
		        	textField_14.setText(linha);
		        	linha = lerArq.readLine();       //21 - RPM
		        	textField_10.setText(linha);
		        	linha = lerArq.readLine();       //22 - POT
		        	textField_9.setText(linha);
		        	int x;
		        	for(x=0;x<=3;x++){
		        	linha = lerArq.readLine();       //23,24,25 e 26 - Não usado
		        	}
		        	linha = lerArq.readLine();       //27 - Ø Rotor
		        	textField_13.setText(linha);
		        	for(x=0;x<=32;x++){
		        	linha = lerArq.readLine();       //de 28 ate 60 - Não usado
		        	}
		        	linha = lerArq.readLine();       //61 - Material
		        	textField_19.setText(linha);
		        	linha = lerArq.readLine();       //62 - Pressão de teste
		        	textField_15.setText(linha);
		        	for(x=0;x<=6;x++){
		        	linha = lerArq.readLine();       //de 63 ate 69 - Não usado
		        	}		        	
		        	linha = lerArq.readLine();       //70 - Pressão
		        	textField_20.setText(linha);

		        	linha = "Rolamento";             //Mancais
		        	textField_17.setText(linha);
		        	DateFormat dateFormat = new SimpleDateFormat("yyyy");//formata o Ano corrente;
		        	Date date = new Date(); 
		        	textField_18.setText(dateFormat.format(date));
		        	
		        	//caminho do arquivo
		        	//File f =fileChooser.getSelectedFile();// Quero tornar essa variavel publica
		        	//System.out.println(f.getName());
		        	
		        	while (linha != null) {
		        		//lê enquanto não é null senão fecha o arquivo
		        		linha = lerArq.readLine(); 
		        	} 
		        	arq.close();
		        	
		        	} 	catch (IOException f) {
		        		System.err.printf("Erro na abertura do arquivo: %s.\n", 
		        			f.getMessage()); 
		        	} 
		        	//System.out.println(); 
		        	}
			}
		});
		MnuArquivos.add(MnuImportarDados);
		
		JMenuItem MnuExportarDados= new JMenuItem("Exportar Arquivos");
		MnuExportarDados.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Exportando Programa para P5000 no Pendrive");
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivo de Exportação", "tml");
				fileChooser.setFileFilter(filter);
				fileChooser.setName(textField_1.getText());
		
				fileChooser.setCurrentDirectory(new File("User.home" ));
				int userSelection = fileChooser.showSaveDialog(fileChooser);
				if (userSelection == JFileChooser.APPROVE_OPTION) {
				    File fileToSave = fileChooser.getSelectedFile();
				    String arq = fileToSave.getAbsolutePath() ;
				    try {
			        	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");//formata o Ano corrente;
			        	Date date = new Date(); 
						PrintWriter gravarArq = new PrintWriter(arq);
						//Chr(239) + Chr(187) + Chr(191) + 
						int cod_1=239;int cod_2=187;int cod_3=191;
						char a = (char) cod_1;
						char b = (char) cod_2;
						char c = (char) cod_3;
						gravarArq.write(a + "" + b + "" + c + "TML(Propen-P5000 Pn-P5000-" + dateFormat.format(date) + "-TML V0.11)" + "\r\n");
						gravarArq.write("BH()" + "\r\n");
						gravarArq.write(" SP(20,20,100)" + "\r\n");
						gravarArq.write(" OH(A,Y,2,1)" + "\r\n");
						gravarArq.write("EH()" + "\r\n");
						gravarArq.write("BM()" + "\r\n");
						//Final de cabeçalho
						
						//Tipo
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(39.3,13.9)" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_2.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//TAG
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(39.3,13.9)" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_3.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");						
						//Pedido de Venda
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(39.3,13.9)" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_4.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");						
						//Produto
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(39.3,13.9)" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_5.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//Serie
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(39.3,13.9)" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_6.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");						
						//Vazão
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(39.3,13.9)" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_7.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//Altura
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(39.3,13.9)" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_8.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");						
						//RPM
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(39.3,13.9)" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_9.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//POT
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(39.3,13.9)" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_10.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//Pressão diferencial
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(39.3,13.9)" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_11.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//Temperatura
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(39.3,13.9)" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_12.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//NPWHr
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(39.3,13.9)" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_13.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//Diametro do Rotor
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(39.3,13.9)" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_14.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//Pressão de teste
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(39.3,13.9)" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_15.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//Densidade
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(39.3,13.9)" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_16.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//Mancais
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(39.3,13.9)" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_17.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//Ano de Fabricação
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(39.3,13.9)" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_18.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//Material
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(39.3,13.9)" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_19.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//Pressão
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(39.3,13.9)" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_20.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");

						//finaliza o programa
						gravarArq.write("EM()" + "\r\n");
						gravarArq.write("BF()" + "\r\n");
						gravarArq.write(" OH(A,Y,0,)" + "\r\n");
						gravarArq.write("EF()" + "\r\n");
						
						gravarArq.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						} 
						//System.out.println("Arquivo salvo: " + fileToSave.getAbsolutePath());
				}
			}
		});
		MnuArquivos.add(MnuExportarDados);
		
		JMenuItem MnuSair= new JMenuItem("Sair");
		MnuSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);  
			}
		});
		MnuArquivos.add(MnuSair);

		
		JMenu MnuVisualizar = new JMenu("Visualizar");
		menuBar.add(MnuVisualizar);

		JMenuItem MnuImpressao= new JMenuItem("Impressão");
		MnuVisualizar.add(MnuImpressao);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cliente:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 11, 47, 14);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setToolTipText("Nome do Cliente");
		textField.setBounds(61, 8, 363, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSrie = new JLabel("S\u00E9rie:");
		lblSrie.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblSrie.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSrie.setBounds(10, 39, 47, 14);
		getContentPane().add(lblSrie);
		
		textField_1 = new JTextField();
		textField_1.setVerifyInputWhenFocusTarget(false);
		textField_1.setToolTipText("N\u00FAmero de serie da bomba");
		textField_1.setColumns(10);
		textField_1.setBounds(61, 36, 363, 20);
		getContentPane().add(textField_1);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblTipo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipo.setBounds(10, 93, 47, 14);
		getContentPane().add(lblTipo);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setToolTipText("Modelo da bomba");
		textField_2.setColumns(10);
		textField_2.setBounds(61, 90, 250, 20);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setToolTipText("N\u00FAmero da TAG.");
		textField_3.setColumns(10);
		textField_3.setBounds(60, 118, 109, 20);
		getContentPane().add(textField_3);
		
		JLabel lblTag = new JLabel("TAG:");
		lblTag.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblTag.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTag.setBounds(20, 118, 36, 14);
		getContentPane().add(lblTag);
		
		JLabel lblPv = new JLabel("PV:");
		lblPv.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPv.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPv.setBounds(170, 121, 29, 14);
		getContentPane().add(lblPv);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setToolTipText("Pedido de Venda");
		textField_4.setColumns(10);
		textField_4.setBounds(202, 118, 109, 20);
		getContentPane().add(textField_4);
		
		JLabel lblProduto = new JLabel("Produto:");
		lblProduto.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblProduto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblProduto.setBounds(0, 143, 56, 14);
		getContentPane().add(lblProduto);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setToolTipText("Produto: BM ou BP");
		textField_5.setColumns(10);
		textField_5.setBounds(60, 143, 109, 20);
		getContentPane().add(textField_5);
		
		JLabel lblNrB = new JLabel("Nr B:");
		lblNrB.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNrB.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNrB.setBounds(171, 146, 29, 14);
		getContentPane().add(lblNrB);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				textField_1.setText(textField_6.getText());
			}
		});
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setToolTipText("N\u00FAmero de serie da bomba");
		textField_6.setColumns(10);
		textField_6.setBounds(202, 143, 109, 20);
		getContentPane().add(textField_6);
		
		JLabel lblQ = new JLabel("Q:");
		lblQ.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblQ.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQ.setBounds(20, 171, 36, 14);
		getContentPane().add(lblQ);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setToolTipText("Vaz\u00E3o em metros c\u00FAbicos por hora");
		textField_7.setColumns(10);
		textField_7.setBounds(60, 168, 79, 20);
		getContentPane().add(textField_7);
		
		JLabel lblH = new JLabel("H:");
		lblH.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblH.setHorizontalAlignment(SwingConstants.RIGHT);
		lblH.setBounds(178, 171, 16, 14);
		getContentPane().add(lblH);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setToolTipText("Altura do bombeamento");
		textField_8.setColumns(10);
		textField_8.setBounds(198, 168, 91, 20);
		getContentPane().add(textField_8);
		
		JLabel lblMh = new JLabel("m\u00B3/h");
		lblMh.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblMh.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMh.setBounds(137, 171, 29, 14);
		getContentPane().add(lblMh);
		
		JLabel lblMa = new JLabel("ma");
		lblMa.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblMa.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMa.setBounds(294, 171, 14, 14);
		getContentPane().add(lblMa);
		
		JLabel lblCv = new JLabel("CV");
		lblCv.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblCv.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCv.setBounds(291, 196, 17, 14);
		getContentPane().add(lblCv);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setToolTipText("Potencia da bomba em Cavalo Vapor");
		textField_9.setColumns(10);
		textField_9.setBounds(198, 193, 91, 20);
		getContentPane().add(textField_9);
		
		JLabel lblPot = new JLabel("Pot:");
		lblPot.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPot.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPot.setBounds(168, 196, 26, 14);
		getContentPane().add(lblPot);
		
		JLabel lblRpm = new JLabel("rpm");
		lblRpm.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblRpm.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRpm.setBounds(137, 196, 25, 14);
		getContentPane().add(lblRpm);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setToolTipText("Revolu\u00E7\u00F5es por minuto");
		textField_10.setColumns(10);
		textField_10.setBounds(60, 193, 79, 20);
		getContentPane().add(textField_10);
		
		JLabel lblR = new JLabel("R:");
		lblR.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblR.setHorizontalAlignment(SwingConstants.RIGHT);
		lblR.setBounds(20, 196, 36, 14);
		getContentPane().add(lblR);
		
		JLabel lblc = new JLabel("\u00B0C");
		lblc.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblc.setHorizontalAlignment(SwingConstants.LEFT);
		lblc.setBounds(294, 221, 14, 14);
		getContentPane().add(lblc);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setToolTipText("Temperaturas de trabalho");
		textField_11.setColumns(10);
		textField_11.setBounds(198, 218, 91, 20);
		getContentPane().add(textField_11);
		
		JLabel lblT = new JLabel("t:");
		lblT.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblT.setHorizontalAlignment(SwingConstants.RIGHT);
		lblT.setBounds(178, 221, 16, 14);
		getContentPane().add(lblT);
		
		JLabel lblKgfcm = new JLabel("kgf/cm\u00B2");
		lblKgfcm.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblKgfcm.setHorizontalAlignment(SwingConstants.LEFT);
		lblKgfcm.setBounds(143, 221, 54, 14);
		getContentPane().add(lblKgfcm);
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setToolTipText("Press\u00E3o diferencial");
		textField_12.setColumns(10);
		textField_12.setBounds(60, 218, 79, 20);
		getContentPane().add(textField_12);
		
		JLabel lblPd = new JLabel("PD:");
		lblPd.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPd.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPd.setBounds(20, 221, 36, 14);
		getContentPane().add(lblPd);
		
		JLabel lblMm = new JLabel("mm");
		lblMm.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblMm.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMm.setBounds(294, 246, 17, 14);
		getContentPane().add(lblMm);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setToolTipText("Diametro Real do rotor");
		textField_13.setColumns(10);
		textField_13.setBounds(198, 243, 91, 20);
		getContentPane().add(textField_13);
		
		JLabel label_1 = new JLabel("\u00D8");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(178, 246, 16, 14);
		getContentPane().add(label_1);
		
		JLabel lblM = new JLabel("m");
		lblM.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblM.setHorizontalAlignment(SwingConstants.LEFT);
		lblM.setBounds(149, 246, 29, 14);
		getContentPane().add(lblM);
		
		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setToolTipText("NPSH Requerido");
		textField_14.setColumns(10);
		textField_14.setBounds(60, 243, 86, 20);
		getContentPane().add(textField_14);
		
		JLabel lblNpshr = new JLabel("NPSHr:");
		lblNpshr.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNpshr.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNpshr.setBounds(20, 246, 36, 14);
		getContentPane().add(lblNpshr);
		
		JLabel lblPTestHid = new JLabel("Pres test Hid:");
		lblPTestHid.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPTestHid.setHorizontalAlignment(SwingConstants.LEFT);
		lblPTestHid.setBounds(10, 272, 66, 14);
		getContentPane().add(lblPTestHid);
		
		textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setToolTipText("Press\u00E3o de teste Hidrost\u00E1tico");
		textField_15.setColumns(10);
		textField_15.setBounds(81, 269, 65, 20);
		getContentPane().add(textField_15);
		
		JLabel lblKgfcm_1 = new JLabel("kgf/cm\u00B2");
		lblKgfcm_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblKgfcm_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblKgfcm_1.setBounds(148, 271, 41, 14);
		getContentPane().add(lblKgfcm_1);
		
		JLabel label_3 = new JLabel("?");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(179, 272, 16, 14);
		getContentPane().add(label_3);
		
		textField_16 = new JTextField();
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setToolTipText("Densidade do l\u00EDquido bombeado");
		textField_16.setColumns(10);
		textField_16.setBounds(198, 269, 65, 20);
		getContentPane().add(textField_16);
		
		JLabel lblKgfdm = new JLabel("kgf/dm\u00B3");
		lblKgfdm.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblKgfdm.setHorizontalAlignment(SwingConstants.RIGHT);
		lblKgfdm.setBounds(273, 272, 38, 14);
		getContentPane().add(lblKgfdm);
		
		textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setToolTipText("C\u00F3digos dos Rolamentos");
		textField_17.setColumns(10);
		textField_17.setBounds(61, 293, 156, 20);
		getContentPane().add(textField_17);
		
		JLabel lblMancais = new JLabel("Mancais:");
		lblMancais.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblMancais.setHorizontalAlignment(SwingConstants.LEFT);
		lblMancais.setBounds(10, 296, 47, 14);
		getContentPane().add(lblMancais);
		
		JLabel lblAno = new JLabel("Ano:");
		lblAno.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblAno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAno.setBounds(216, 296, 29, 14);
		getContentPane().add(lblAno);
		
		textField_18 = new JTextField();
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setToolTipText("Ano de fabrica\u00E7\u00E3o registrado na folha de dados");
		textField_18.setColumns(10);
		textField_18.setBounds(246, 293, 65, 20);
		getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setToolTipText("Material Principal de constru\u00E7\u00E3o da bomba");
		textField_19.setColumns(10);
		textField_19.setBounds(61, 317, 250, 20);
		getContentPane().add(textField_19);
		
		JLabel lblMat = new JLabel("Mat.:");
		lblMat.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMat.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblMat.setBounds(10, 320, 47, 14);
		getContentPane().add(lblMat);
		
		textField_20 = new JTextField();
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setToolTipText("Press\u00E3o Maxima de trabalho (Shut off)");
		textField_20.setColumns(10);
		textField_20.setBounds(103, 342, 171, 20);
		getContentPane().add(textField_20);
		
		JLabel lblPressMaxTrab = new JLabel("Press. Max. Trab.:");
		lblPressMaxTrab.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPressMaxTrab.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblPressMaxTrab.setBounds(10, 345, 83, 14);
		getContentPane().add(lblPressMaxTrab);
		
		JLabel lblMcl = new JLabel("mcl");
		lblMcl.setHorizontalAlignment(SwingConstants.LEFT);
		lblMcl.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblMcl.setBounds(282, 348, 29, 14);
		getContentPane().add(lblMcl);
		
		JLabel lblProgramadorRenatoLbo = new JLabel("Programador: Renato L\u00F4bo Rodrigues");
		lblProgramadorRenatoLbo.setForeground(Color.BLUE);
		lblProgramadorRenatoLbo.setHorizontalAlignment(SwingConstants.LEFT);
		lblProgramadorRenatoLbo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblProgramadorRenatoLbo.setBounds(61, 391, 250, 14);
		getContentPane().add(lblProgramadorRenatoLbo);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(344, 90, 79, 109);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Ponto Zero:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(10, 5, 62, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblX = new JLabel("X:");
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblX.setBounds(8, 30, 10, 14);
		panel.add(lblX);
		
		JLabel lblY = new JLabel("Y:");
		lblY.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblY.setBounds(10, 54, 10, 14);
		panel.add(lblY);
		
		textField_21 = new JTextField();
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setText("10.0");
		textField_21.setBounds(23, 26, 49, 20);
		panel.add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setText("13.5");
		textField_22.setColumns(10);
		textField_22.setBounds(23, 50, 49, 20);
		panel.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setText("4.1");
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setColumns(10);
		textField_23.setBounds(23, 74, 49, 20);
		panel.add(textField_23);
		
		JLabel lblYl = new JLabel("yl:");
		lblYl.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblYl.setBounds(8, 78, 12, 14);
		panel.add(lblYl);
	}
}
