import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		JFrame janela = new JFrame("Projeto Semestral - FIAP Movies - Beatriz Gardusi Manoel - Rm:81856 - APMD - 3ECA");
		
		JTabbedPane paineis = new JTabbedPane();
		
		JPanel painelCadastro = new JPanel();
		BorderLayout bd = new BorderLayout();
		bd.setHgap(20);
		painelCadastro.setLayout(bd);
		JLabel imagem =new JLabel(new ImageIcon(new ImageIcon("res/capa.jpg").getImage().getScaledInstance(200, 250, Image.SCALE_SMOOTH))); 
		painelCadastro.add(imagem, BorderLayout.WEST);
		
		JPanel cadastro = new JPanel();
		cadastro.setLayout(new GridLayout(6,1));
		
		cadastro.add(new JLabel("Titulo do Filme"));
		JTextField textoTítulo = new JTextField();
		cadastro.add(textoTítulo);
		
		cadastro.add(new JLabel("Sinopse"));
		JTextField textoSinopse = new JTextField();
		cadastro.add(textoSinopse);
		
		cadastro.add(new JLabel("Gênero do Filme"));
		JComboBox<String> genero = new JComboBox<>();
		genero.addItem("Romance");
		genero.addItem("Ação");
		genero.addItem("Suspense");
		genero.addItem("Ficção");
		genero.addItem("Drama");
		genero.addItem("Terror");
		genero.addItem("Animação");
		cadastro.add(genero);
		
		JPanel ondeAssistir = new JPanel();
		
		ondeAssistir.setLayout(new GridLayout(7,1));
		
		ondeAssistir.add(new JLabel("Onde Assistir"));
		
		ButtonGroup botaoAssistir = new ButtonGroup();
		
		JRadioButton netflix = new JRadioButton("Netflix");
		netflix.setActionCommand("Netflix");
		botaoAssistir.add(netflix);
		ondeAssistir.add(netflix);
		
		JRadioButton primeVideo = new JRadioButton("Prime Video");
		primeVideo.setActionCommand("Prime Video");
		botaoAssistir.add(primeVideo);
		ondeAssistir.add(primeVideo);
				
		JRadioButton pirateBay = new JRadioButton("Pirate Bay");
		pirateBay.setActionCommand("Pirate Bay");
		botaoAssistir.add(pirateBay);
		ondeAssistir.add(pirateBay);
		
		JCheckBox assistido = new JCheckBox("Assistido");
		ondeAssistir.add(assistido);
		
		ondeAssistir.add(new JLabel("Avaliação"));
		StarRater avaliacao = new StarRater(5);
		ondeAssistir.add(avaliacao);
		
		JPanel botoes = new JPanel();
		JButton botaoSalvar = new JButton("Salvar");
		botaoSalvar.addActionListener(action -> {
			Filme filme = new Filme();
			filme.setAvaliacao(avaliacao.getSelection());
			filme.setGenero((String)genero.getSelectedItem());
			filme.setOndeAssisstir(botaoAssistir.getSelection().getActionCommand());
			filme.setSinopse(textoSinopse.getText());
			filme.setTitulo(textoTítulo.getText());
			filme.setAssistido(assistido.isSelected());
			System.out.println(filme);
		});
		botoes.add(botaoSalvar);
		JButton botaoCancelar = new JButton("Cancelar");
		botoes.add(botaoCancelar);
		painelCadastro.add(botoes, BorderLayout.SOUTH);
		
		
		painelCadastro.add(ondeAssistir, BorderLayout.EAST);
		
		
		
		painelCadastro.add(cadastro, BorderLayout.CENTER);
		
		paineis.add("Cadastro", painelCadastro);
		
		
		JPanel painelLista = new JPanel();
		paineis.add("Lista", painelLista);
		
		janela.add(paineis);
		
		
		janela.setSize(700,300);
		janela.setVisible(true);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
}
