package Ex03;
/*
A fórmula, supostamente, é:
Seu primeiro nome na série Star Wars:
	i.Pegue as três primeiras letras de seu sobrenome
	ii.Adicione a ele as duas primeiras letras de seu nome
Seu sobrenome na série Star Wars:
	i.Pegue as duas primeiras letras do sobrenome de solteira de sua mãe
	ii.Adicione a ele as três primeiras letras do nome da cidade onde você nasceu

E  agora  sua missão:  crie  uma  classe  chamada NameGenerator.  
Esta  classe  deve  ter  um  método chamado generateStarWarsName que  gera  um  nome  completo  Star  Wars  
conforme explicado e  cuja assinatura é public static String generateStarWarsName(String[] entrada). 
O retorno  é  a  String  gerada  e  o  parâmetro  de  entrada  é  um  vetor  de  String  contendo  na  
primeira posição seu nome completo, na segunda posição o nome de solteira de sua mãe e na terceira posição 
o nome da cidade onde você nasceu. 
Investigue a classe String para auxiliá-lo.
Exemplo:
	entrada[0] = “João Aparecido da Silva”
	entrada[1] = “Dores”
	entrada[2] = “Blumenau”
	saída gerada → Siljo Doblu
*/

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NameGenerator implements ActionListener {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new NameGenerator();
			}
		});
	}
	
	public NameGenerator() {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNomeMae = new JLabel("Nome ");
		frame.getContentPane().add(lblNomeMae);
		
		JTextField txtNomeMae = new JTextField();
		txtNomeMae.setColumns(10);
		frame.getContentPane().add(txtNomeMae);
		
		JLabel lblNome = new JLabel("Nome completo");
		frame.getContentPane().add(lblNome);
		
		JTextField txtNome = new JTextField();
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		
		
	}
	
	public static String generateStarWarsName(String[] entrada) {
		
		return "";
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
}
