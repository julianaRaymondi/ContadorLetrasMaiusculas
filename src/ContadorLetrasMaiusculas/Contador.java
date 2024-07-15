package ContadorLetrasMaiusculas;

public class Contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		String[] frase = {"Juliana, Raymondi , Dorneles De Queiroz"};		
		// TODO Auto-generated method stub
		
		System.out.print(" quantidade de letras maiusculas : "+ letrasMaiuscula(frase));
		
				
	}
		
		public static int letrasMaiuscula(String[] frase) {
			
			int cont=0;
			for (int i=0;i<frase.length;i++)
			{
				
				String lerIndice= frase[i];
				
				
			for (int j=0;j<lerIndice.length();j++)
			{
				char caracter=lerIndice.charAt(j);
				
				if(Character.isUpperCase(caracter)) {
					cont++;
				}		
				
			}			
			}
			return cont;
		}
		
	}



