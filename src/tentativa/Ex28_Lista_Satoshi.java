package tentativa;

import javax.swing.JOptionPane;

public class Ex28_Lista_Satoshi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double precoatual, mediamensal,preconovo;
		
		
		precoatual=Double.parseDouble(JOptionPane.showInputDialog("Informe valor do Produto"));
		mediamensal=Double.parseDouble(JOptionPane.showInputDialog("Informe média do Produto"));
		
		
		 if (mediamensal < 500);
			{
				preconovo = (precoatual+(10*100));
			}
		if (mediamensal >= 500 && mediamensal > 100);
		{
			preconovo = (precoatual+(15*100));
		}
		
		if(mediamensal >= 1000);
		 {
			 preconovo=(precoatual+(5*100));
			 }
			
			JOptionPane.showMessageDialog(null,"Novo preço é: " + preconovo);				 
			 }
}
