
package AcademiaDevs;

public class Array {

	public static void main(String[] args) {
		
		//Armazenar vários valores do mesmo tipo
		
		// Tipo [] nomeVariavel = new tipo[5];
		String[] nomes = new String[5];
		
		nomes[0] = "Goku";
		nomes[1] = "Pider";
		nomes[2] = "Trevor";
		nomes[3] = "Franklin";
		nomes[4] = "Mchael";

		
		for(int posicaoVetor =0; posicaoVetor<5; posicaoVetor++) {
			System.out.println(nomes [posicaoVetor]);
		}
		
	}

}