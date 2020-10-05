package variaveis;

import javax.swing.JOptionPane;

public class ManipulaString {

	public static void main(String[] args) {
		
		String email = JOptionPane.showInputDialog("Digite seu e-mail");
		System.out.println("E-mail: " + email);
		System.out.println("Minusculo: " + email.toLowerCase());
		System.out.println("Maiusculo: " + email.toUpperCase());
		System.out.println("Posi��o do @: " + email.indexOf("@"));
		System.out.println("Existe @? " + email.contains("@"));
		System.out.println("Quantidade caracteres? " + email.length());
		System.out.println("Do 2 ao 4: " + email.substring(1,4));
		System.out.println("A partir do 2: " + email.substring(1));
		System.out.println("Usu�rio: " + email.substring(0,email.indexOf("@")));
		System.out.println("Servidor: " + email.substring(email.indexOf("@")+1));
		System.out.println("Apenas o dom�nio: " + email.substring(email.indexOf("@")+1,email.indexOf(".com")));
		System.out.println("Primeira metade do e-mail: " + email.substring(0,email.length()/2));
		System.out.println("Compara��o com case sensitive: " + email.equals("caio_giacomo@hotmail.com"));
		System.out.println("Compara��o sem case sensitive: " + email.equalsIgnoreCase("caio_giacomo@hotmail.com"));
		
		
		
		
		
		

	}

}
