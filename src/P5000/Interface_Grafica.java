package P5000;

import java.awt.EventQueue;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.ServiceUI;
import javax.print.SimpleDoc;
import javax.print.attribute.HashDocAttributeSet;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Copies;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFileChooser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Interface_Grafica extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private static JTextField textField_6;
	private static JTextField textField_7;
	private static JTextField textField_8;
	private static JTextField textField_9;
	private static JTextField textField_10;
	private static JTextField textField_11;
	private static JTextField textField_12;
	private static JTextField textField_13;
	private static JTextField textField_14;
	private static JTextField textField_15;
	private static JTextField textField_16;
	private static JTextField textField_17;
	private static JTextField textField_18;
	private static JTextField textField_19;
	private static JTextField textField_20;
	private static JTextField textField_21;
	private static JTextField textField_22;
	private static JTextField textField_23;
	private static JTextField text00;
	private static JTextField text01;
	private static JTextField text02;
	private static JTextField text03;
	private static JTextField text04;
	private static JTextField text05;
	private static JTextField text06;
	private static JTextField text07;
	private static JTextField text08;
	private static JTextField text09;
	private static JTextField text10;
	private static JTextField text11;
	private static JTextField text12;
	private static JTextField text13;
	private static JTextField text14;
	private static JTextField text15;
	private static JTextField text16;
	private static JTextField text17;
	private static JTextField text18;

	
	public class ExemploJPS {
		public ExemploJPS(boolean mostrarDialogo) {
		System.out.println(mostrarDialogo);
		try {
		// Localiza todas as impressoras com suporte a arquivos txt
		PrintService[] servicosImpressao =PrintServiceLookup.lookupPrintServices(
		DocFlavor.INPUT_STREAM.AUTOSENSE, null);

		System.out.println("Impressoras com suporte: "+ servicosImpressao.length);

		// Localiza a impressora padrão
		PrintService impressora = PrintServiceLookup.lookupDefaultPrintService();

		System.out.println("Impressora: " + impressora.getName());

		System.out.println("Imprimindo arquivo-texto");

		// Definição de atributos do conteúdo a ser impresso:
		DocFlavor docFlavor = DocFlavor.INPUT_STREAM.AUTOSENSE;

		// Atributos de impressão do documento
		HashDocAttributeSet attributes = new HashDocAttributeSet();


		// InputStream apontando para o conteúdo a ser impresso
		FileInputStream fi = new FileInputStream("p5000.txt");

		// Cria um Doc para impressão a partir do arquivo exemplo.txt
		Doc documentoTexto = new SimpleDoc(fi, docFlavor, attributes);

		// Configura o conjunto de parametros para a impressora
		PrintRequestAttributeSet printerAttributes = new HashPrintRequestAttributeSet();

		System.out.println(mostrarDialogo);

		//mostrarDialogo = false;

		if (mostrarDialogo) {
		// exibe um dialogo de configuracoes de impressao
		PrintService servico = ServiceUI.printDialog(null, 300, 200,
		servicosImpressao, impressora, docFlavor, printerAttributes);

		if (servico != null) {
		DocPrintJob printJob = servico.createPrintJob();
		printJob.print(documentoTexto, printerAttributes);
		}
		}
		else {
		// Cria uma tarefa de impressão
		DocPrintJob printJob = impressora.createPrintJob();

		// Adiciona propriedade de impressão: imprimir uma cópias
		printerAttributes.add(new Copies(1));

		// Imprime o documento sem exibir uma tela de dialogo
		printJob.print(documentoTexto, printerAttributes);
		}
		}
		catch (FileNotFoundException ex) {
		System.out.println("Arquivo file.txt não encontrado!");
		}
		catch (PrintException ex2) {
		System.out.println("Erro de impressão: " + ex2.getMessage());
		}
		}

		}
	/**
	 * Launch the application.
	 */
	public static void TextoIni(int i,String s){
		switch (i){
		case 0: text00.setText(s);break;
		case 1: text01.setText(s);break;
		case 2: text02.setText(s);break;
		case 3: text03.setText(s);break;
		case 4: text04.setText(s);break;
		case 5: text05.setText(s);break;
		case 6: text06.setText(s);break;
		case 7: text07.setText(s);break;
		case 8: text08.setText(s);break;
		case 9: text09.setText(s);break;
		case 10: text10.setText(s);break;
		case 11: text11.setText(s);break;
		case 12: text12.setText(s);break;
		case 13: text13.setText(s);break;
		case 14: text14.setText(s);break;
		case 15: text15.setText(s);break;
		case 16: text16.setText(s);break;
		case 17: text17.setText(s);break;
		case 18: text18.setText(s);break;
		}
	}//fim mudar mudarTexto
	
	
	public static void mudarTexto(int i,String s){
		switch (i){
		case 0: textField.setText(s);break;
		case 1: textField_1.setText(s);break;
		case 2: textField_2.setText(s);break;
		case 3: textField_3.setText(s);break;
		case 4: textField_4.setText(s);break;
		case 5: textField_5.setText(s);break;
		case 6: textField_6.setText(s);break;
		case 7: textField_7.setText(s);break;
		case 8: textField_8.setText(s);break;
		case 9: textField_9.setText(s);break;
		case 10: textField_10.setText(s);break;
		case 11: textField_11.setText(s);break;
		case 12: textField_12.setText(s);break;
		case 13: textField_13.setText(s);break;
		case 14: textField_14.setText(s);break;
		case 15: textField_15.setText(s);break;
		case 16: textField_16.setText(s);break;
		case 17: textField_17.setText(s);break;
		case 18: textField_18.setText(s);break;
		case 19: textField_19.setText(s);break;
		case 20: textField_20.setText(s);break;
		case 21: textField_21.setText(s);break;
		case 22: textField_22.setText(s);break;
		case 23: textField_23.setText(s);break;
		
		}
	}//fim mudar mudarTexto


	public String lerTexto(int i){
		String 	resp = null;
		switch (i){
		case 0: resp = textField.getText();break;
		case 1: resp = textField_1.getText();break;
		case 2: resp = textField_2.getText();break;
		case 3: resp = textField_3.getText();break;
		case 4: resp = textField_4.getText();break;
		case 5: resp = textField_5.getText();break;
		case 6: resp = textField_6.getText();break;
		case 7: resp = textField_7.getText();break;
		case 8: resp = textField_8.getText();break;
		case 9: resp = textField_9.getText();break;
		case 10: resp = textField_10.getText();break;
		case 11: resp = textField_11.getText();break;
		case 12: resp = textField_12.getText();break;
		case 13: resp = textField_13.getText();break;
		case 14: resp = textField_14.getText();break;
		case 15: resp = textField_15.getText();break;
		case 16: resp = textField_16.getText();break;
		case 17: resp = textField_17.getText();break;
		case 18: resp = textField_18.getText();break;
		case 19: resp = textField_19.getText();break;
		case 20: resp = textField_20.getText();break;
		}
		return resp;
	}//fim mudar LerTexto

	public static String valdecimal(double x) {  
		//System.out.println(String.format("%.1f", x));
		String resp = String.format("%.1f", x);
		resp = resp.replace(",", ".");
		return  resp;
	    
	} 

	public double valor_ponto(String texto){
		double ValorRet = 0;
		int ponto = 0;
		String Str1 = new String(texto);
		char c = '.';  
		for (int i = 0; i < Str1.length(); i++) {  
		  if (Str1.charAt(i) == c) {
			  ValorRet = i;
			  ponto = i;
			  i = Str1.length()+1;
		  }  
		}
		int total = Str1.length();
		int decimal = total - ponto - 1;
		String texto1 = texto.replace(".", "");
		double val = Integer.parseInt(texto1);
		switch (decimal){
		case 1:ValorRet = val/10;break;
		case 2:ValorRet = val/100;break;	
		}
		//System.out.println("ValorRet:" +ValorRet);
		return ValorRet;  
	}//Final valor_ponto
	
	public static void main(String[] args) {
		//new ExemploJPS(true);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface_Grafica frame = new Interface_Grafica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setCurrentDirectory(new File("."));
			    String arquivo = "p5000.ini";
			    try {
		        	FileReader arq = new FileReader(arquivo); 
		        	BufferedReader lerArq = new BufferedReader(arq);
		        	// lê as linhas do arquivo num laço for
		        	for(int i=0;i<19;i++){ 
		        		String linha = lerArq.readLine();
		        		TextoIni(i,linha);
		        	}
		        	String linha = null; 
		        	linha = lerArq.readLine();
		        	mudarTexto(21,linha);
		        	linha = lerArq.readLine();
		        	mudarTexto(22,linha);
		        	linha = lerArq.readLine();
		        	mudarTexto(23,linha);
		        	//Cria uma variavel vazia
		        	
		        	//lê enquanto não é null senão fecha o arquivo
		        	while (linha != null) {
		        		linha = lerArq.readLine(); 
		        	} 
		        	arq.close();
		        	
		        	} 	catch (IOException f) {
		        		System.err.printf("Erro na abertura do arquivo: %s.\n", 
		        			f.getMessage()); 
		        	} 
		        	//System.out.println(); 
		        	}
		});
	}

	
	/**
	 * Create the frame.
	 */
    
	public Interface_Grafica() {
		getContentPane().setFocusable(false);
		getContentPane().setFocusTraversalKeysEnabled(false);
		getContentPane().setEnabled(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);//janela fixa não redimensiona
		setBounds(350, 150, 442, 474);
		
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
				
				for(int i=0;i<21;i++) mudarTexto(i,""); //Apaga todos os campos
			
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
		        	// lê as linhas do arquivo num laço for
		        	for(int i=0;i<21;i++){ 
		        		String linha = lerArq.readLine();
		        		mudarTexto(i,linha);
		        	}
		        	//Cria uma variavel vazia
		        	String linha = null; 
		        	//lê enquanto não é null senão fecha o arquivo
		        	while (linha != null) {
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
					//Grava todas as linha num laço for
					for(int i=0;i<21;i++){
						gravarArq.write(lerTexto(i) +"\r\n");
					}
					gravarArq.close();
					JOptionPane.showMessageDialog(null,  nome + ".plq salvo com sucesso!");
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
		        	String linha1 = linha.replace("*", " ");  
		            String linha2 = linha1.replaceAll("   ", " ");  
		            String str = linha2;
		            str = str.trim(); 
		            textField_2.setText(str);
		            
		        	linha = lerArq.readLine();       //3 - Cliente
		        	textField.setText(linha);	
		        	linha = lerArq.readLine();       //4 - Não usado
		        	linha = lerArq.readLine();       //5 - TAG
		        	textField_3.setText(linha);
		        	textField_3.setForeground(Color.RED);
		        	linha = lerArq.readLine();       //6 - Pedido de venda
		        	textField_4.setText(linha);
		        	linha = lerArq.readLine();       //7 - 0 - Não usado
		        	linha = lerArq.readLine();       //8 - Serie
		        	textField_6.setText(linha);
		        	textField_6.setForeground(Color.RED);
		        	textField_1.setText(linha);
		        	linha = lerArq.readLine();       //9 - Não usado
		        	linha = lerArq.readLine();       //10 - Não usado
		        	linha = lerArq.readLine();       //11 - Temperatura de trabalho
		        	linha1 = lerArq.readLine();      //12 - Temperatura maxima
		        	textField_11.setText(linha + "/" + linha1);
		        	textField_11.setForeground(Color.RED);
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
		        	textField_13.setForeground(Color.RED);
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
		        	textField_17.setForeground(Color.RED);
		        	DateFormat dateFormat = new SimpleDateFormat("yyyy");//formata o Ano corrente;
		        	Date date = new Date(); 
		        	textField_18.setText(dateFormat.format(date));
		        	textField_18.setForeground(Color.RED);
		        	
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
				
		
				fileChooser.setCurrentDirectory(new File("." + "//Arquivos" ));
				
				//fileChooser.setApproveButtonText("Exportar");//mudar o nome do botao salvar/abrir -nao funfa ainda
				//fileChooser.setApproveButtonMnemonic('e');//mudar a letra de atalho - nao funfa ainda, tem que investigar
								
				fileChooser.setApproveButtonToolTipText("Exportar Arquivo Selecionado");
				fileChooser.setSelectedFile ( new  File ( textField_1.getText() + ".tml" )); 
				
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
						gravarArq.write(a + "" + b + "" + c + "" + "TML(Propen-P5000 Pn-P5000-" + dateFormat.format(date) + "-TML V0.11)" + "\r\n");
						gravarArq.write("BH()" + "\r\n");
						gravarArq.write(" SP(20,20,100)" + "\r\n");
						gravarArq.write(" OH(A,Y,2,1)" + "\r\n");
						gravarArq.write("EH()" + "\r\n");
						gravarArq.write("BM()" + "\r\n");
						//Final de cabeçalho
						
						//Tipo
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						//double lx = valor_ponto(text00.getText()); //valor do X do campo tipo
						double x = (valor_ponto(textField_21.getText()) + valor_ponto(text00.getText()));
						double y =  valor_ponto(textField_22.getText());
						double inc =valor_ponto(textField_23.getText());
						String xx = valdecimal(x);String yy = valdecimal(y);
						gravarArq.write("  MV(" + xx  + "," + yy  + ")" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_2.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//TAG
						//lx = valor_ponto(text01.getText()); //valor do X do campo tipo
						x = (valor_ponto(textField_21.getText()) + valor_ponto(text01.getText()) );
						y=y+inc;
						xx = valdecimal(x);yy = valdecimal(y);
						//System.out.println(x);
						//System.out.println(y+inc);
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(" + xx  + "," + yy  + ")" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_3.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");						
						//Pedido de Venda
						//lx = valor_ponto(text02.getText()); //valor do X do campo tipo
						x = (valor_ponto(textField_21.getText()) + valor_ponto(text02.getText()));
						xx = valdecimal(x);
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(" + xx  + "," + yy  + ")" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_4.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");						
						//Produto
						//lx = valor_ponto(text03.getText()); //valor do X do campo tipo
						x = (valor_ponto(textField_21.getText()) + valor_ponto(text03.getText()));
						y=y+inc;
						xx = valdecimal(x);yy = valdecimal(y);
						//System.out.println(x);
						//System.out.println(y+inc);
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(" + xx  + "," + yy  + ")" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_5.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//Serie
						//lx = valor_ponto(text04.getText()); //valor do X do campo tipo
						x = (valor_ponto(textField_21.getText()) + valor_ponto(text04.getText()));
						xx = valdecimal(x);
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(" + xx  + "," + yy  + ")" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_6.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");						
						//Vazão
						//lx = valor_ponto(text05.getText()); //valor do X do campo tipo
						x = (valor_ponto(textField_21.getText()) + valor_ponto(text05.getText()));
						y=y+inc;
						xx = valdecimal(x);yy = valdecimal(y);
						//System.out.println(x);
						//System.out.println(y+inc);
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(" + xx + "," + yy  + ")" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_7.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//Altura
						//lx = valor_ponto(text06.getText()); //valor do X do campo tipo
						x = (valor_ponto(textField_21.getText()) + valor_ponto(text06.getText()));
						xx = valdecimal(x);
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(" + xx  + "," + yy + ")" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_8.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");						
						//RPM
						//lx = valor_ponto(text07.getText()); //valor do X do campo tipo
						x = (valor_ponto(textField_21.getText()) + valor_ponto(text07.getText()));
						y=y+inc;
						xx = valdecimal(x);yy = valdecimal(y);
						//System.out.println(x);
						//System.out.println(y+inc);
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(" + xx  + "," + yy  + ")" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_9.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//POT
						//lx = valor_ponto(text08.getText()); //valor do X do campo tipo
						x = (valor_ponto(textField_21.getText()) + valor_ponto(text08.getText()));
						xx = valdecimal(x);
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(" + xx  + "," + yy  + ")" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_10.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//Pressão diferencial
						//lx = valor_ponto(text09.getText()); //valor do X do campo tipo
						x = (valor_ponto(textField_21.getText()) + valor_ponto(text09.getText()));
						y=y+inc;
						xx = valdecimal(x);yy = valdecimal(y);
						//System.out.println(x);
						//System.out.println(y+inc);
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(" + xx  + "," + yy  + ")" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_11.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//Temperatura
						//lx = valor_ponto(text10.getText()); //valor do X do campo tipo
						x = (valor_ponto(textField_21.getText()) + valor_ponto(text10.getText()));
						xx = valdecimal(x);
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(" + xx  + "," + yy  + ")" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_12.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//NPWHr
						//lx = valor_ponto(text11.getText()); //valor do X do campo tipo
						x = (valor_ponto(textField_21.getText()) + valor_ponto(text11.getText()));
						y=y+inc;
						xx = valdecimal(x);yy = valdecimal(y);
						//System.out.println(x);
						//System.out.println(y+inc);
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(" + xx  + "," + yy  + ")" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_13.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//Diametro do Rotor
						//lx = valor_ponto(text12.getText()); //valor do X do campo tipo
						x = (valor_ponto(textField_21.getText()) + valor_ponto(text12.getText()));
						xx = valdecimal(x);
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(" + xx  + "," + yy  + ")" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_14.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//Pressão de teste
						//lx = valor_ponto(text13.getText()); //valor do X do campo tipo
						x = (valor_ponto(textField_21.getText()) + valor_ponto(text13.getText()));
						y=y+inc;
						xx = valdecimal(x);yy = valdecimal(y);
						//System.out.println(x);
						//System.out.println(y+inc);
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(" + xx  + "," + yy  + ")" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_15.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//Densidade
						//lx = valor_ponto(text14.getText()); //valor do X do campo tipo
						x = (valor_ponto(textField_21.getText()) +  valor_ponto(text14.getText()));
						xx = valdecimal(x);
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(" + xx + "," + yy  + ")" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_16.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//Mancais
						//lx = valor_ponto(text15.getText()); //valor do X do campo tipo
						x = (valor_ponto(textField_21.getText()) + valor_ponto(text15.getText()));
						y=y+inc;
						xx = valdecimal(x);yy = valdecimal(y);
						//System.out.println(x);
						//System.out.println(y+inc);
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(" + xx  + "," + yy  + ")" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_17.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//Ano de Fabricação
						//lx = valor_ponto(text16.getText()); //valor do X do campo tipo
						x = (valor_ponto(textField_21.getText()) + valor_ponto(text16.getText()));
						xx = valdecimal(x);
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(" + xx  + "," + yy  + ")" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_18.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//Material
						//lx = valor_ponto(text17.getText()); //valor do X do campo tipo
						x = (valor_ponto(textField_21.getText()) + valor_ponto(text17.getText()));
						y=y+inc;
						xx = valdecimal(x);yy = valdecimal(y);
						//System.out.println(x);
						//System.out.println(y+inc);
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(" + xx  + "," + yy + ")" + "\r\n");//local x,y
						gravarArq.write(" FO(0,2.5,100,100,C,N,0,N)" + "\r\n");
						gravarArq.write("  MP(0)" + "\r\n");
						gravarArq.write("  QL(25,1)" + "\r\n");
						gravarArq.write("  MK(" + (char)34 + textField_19.getText() + (char)34 + ")" + "\r\n");
						gravarArq.write(" EB(C)" + "\r\n");
						//Pressão
						//lx = valor_ponto(text18.getText()); //valor do X do campo tipo
						x = (valor_ponto(textField_21.getText()) + valor_ponto(text18.getText()));
						y=y+inc;
						xx = valdecimal(x);yy = valdecimal(y);
						//System.out.println(x);
						//System.out.println(y+inc);
						gravarArq.write(" BB(ON,L,,L2R)" + "\r\n");
						gravarArq.write("  MV(" + xx  + "," + yy  + ")" + "\r\n");//local x,y
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
						JOptionPane.showMessageDialog(null, arq + " exportado com sucesso!");
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
		MnuImpressao.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				//JOptionPane.showMessageDialog(null, "Faça a rotina da visualização aqui!");
				new ExemploJPS(true);
			}


		});
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
		textField_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				textField_3.setForeground(Color.BLACK);
			}
		});
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
			@Override
			public void keyTyped(KeyEvent e) {
				textField_6.setForeground(Color.BLACK);
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
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textField_11.setForeground(Color.BLACK);
			}
		});
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
		textField_13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textField_13.setForeground(Color.BLACK);
			}
		});
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
		textField_17.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				textField_17.setForeground(Color.BLACK);
			}
		});
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
		textField_18.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				textField_18.setForeground(Color.BLACK);
			}
		});
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
		panel.setBounds(339, 90, 79, 102);
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
		textField_23.setText("5.4");
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setColumns(10);
		textField_23.setBounds(23, 74, 49, 20);
		panel.add(textField_23);
		
		JLabel lblYl = new JLabel("yl:");
		lblYl.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblYl.setBounds(8, 78, 12, 14);
		panel.add(lblYl);
		
		text00 = new JTextField();
		text00.setText("10.0");
		text00.setHorizontalAlignment(SwingConstants.CENTER);
		text00.setColumns(10);
		text00.setBounds(455, 10, 49, 14);
		getContentPane().add(text00);
		
		text01 = new JTextField();
		text01.setText("10.0");
		text01.setHorizontalAlignment(SwingConstants.CENTER);
		text01.setColumns(10);
		text01.setBounds(455, 25, 49, 14);
		getContentPane().add(text01);
		
		text02 = new JTextField();
		text02.setText("10.0");
		text02.setHorizontalAlignment(SwingConstants.CENTER);
		text02.setColumns(10);
		text02.setBounds(455, 40, 49, 14);
		getContentPane().add(text02);
		
		text03 = new JTextField();
		text03.setText("10.0");
		text03.setHorizontalAlignment(SwingConstants.CENTER);
		text03.setColumns(10);
		text03.setBounds(455, 55, 49, 14);
		getContentPane().add(text03);
		
		text04 = new JTextField();
		text04.setText("10.0");
		text04.setHorizontalAlignment(SwingConstants.CENTER);
		text04.setColumns(10);
		text04.setBounds(455, 70, 49, 14);
		getContentPane().add(text04);
		
		text05 = new JTextField();
		text05.setText("10.0");
		text05.setHorizontalAlignment(SwingConstants.CENTER);
		text05.setColumns(10);
		text05.setBounds(455, 85, 49, 14);
		getContentPane().add(text05);
		
		text06 = new JTextField();
		text06.setText("10.0");
		text06.setHorizontalAlignment(SwingConstants.CENTER);
		text06.setColumns(10);
		text06.setBounds(455, 100, 49, 14);
		getContentPane().add(text06);
		
		text07 = new JTextField();
		text07.setText("10.0");
		text07.setHorizontalAlignment(SwingConstants.CENTER);
		text07.setColumns(10);
		text07.setBounds(455, 115, 49, 14);
		getContentPane().add(text07);
		
		text08 = new JTextField();
		text08.setText("10.0");
		text08.setHorizontalAlignment(SwingConstants.CENTER);
		text08.setColumns(10);
		text08.setBounds(455, 130, 49, 14);
		getContentPane().add(text08);
		
		text09 = new JTextField();
		text09.setText("10.0");
		text09.setHorizontalAlignment(SwingConstants.CENTER);
		text09.setColumns(10);
		text09.setBounds(455, 145, 49, 14);
		getContentPane().add(text09);
		
		text10 = new JTextField();
		text10.setText("10.0");
		text10.setHorizontalAlignment(SwingConstants.CENTER);
		text10.setColumns(10);
		text10.setBounds(455, 160, 49, 14);
		getContentPane().add(text10);
		
		text11 = new JTextField();
		text11.setText("10.0");
		text11.setHorizontalAlignment(SwingConstants.CENTER);
		text11.setColumns(10);
		text11.setBounds(455, 175, 49, 14);
		getContentPane().add(text11);
		
		text12 = new JTextField();
		text12.setText("10.0");
		text12.setHorizontalAlignment(SwingConstants.CENTER);
		text12.setColumns(10);
		text12.setBounds(455, 190, 49, 14);
		getContentPane().add(text12);
		
		text13 = new JTextField();
		text13.setText("10.0");
		text13.setHorizontalAlignment(SwingConstants.CENTER);
		text13.setColumns(10);
		text13.setBounds(455, 205, 49, 14);
		getContentPane().add(text13);
		
		text14 = new JTextField();
		text14.setText("10.0");
		text14.setHorizontalAlignment(SwingConstants.CENTER);
		text14.setColumns(10);
		text14.setBounds(455, 220, 49, 14);
		getContentPane().add(text14);
		
		text15 = new JTextField();
		text15.setText("10.0");
		text15.setHorizontalAlignment(SwingConstants.CENTER);
		text15.setColumns(10);
		text15.setBounds(455, 235, 49, 14);
		getContentPane().add(text15);
		
		text16 = new JTextField();
		text16.setText("10.0");
		text16.setHorizontalAlignment(SwingConstants.CENTER);
		text16.setColumns(10);
		text16.setBounds(455, 250, 49, 14);
		getContentPane().add(text16);
		
		text17 = new JTextField();
		text17.setText("10.0");
		text17.setHorizontalAlignment(SwingConstants.CENTER);
		text17.setColumns(10);
		text17.setBounds(455, 265, 49, 14);
		getContentPane().add(text17);
		
		text18 = new JTextField();
		text18.setText("10.0");
		text18.setHorizontalAlignment(SwingConstants.CENTER);
		text18.setColumns(10);
		text18.setBounds(455, 280, 49, 14);
		getContentPane().add(text18);
	}
}
