import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] vetor = new float[3];//cria um vetor de poontos flutuantes
		Scanner input = new Scanner(System.in);//cria um objeto da classe scanner para a leitura
		float soma = 0;
		
		for(int i = 0; i < 3; i++){//Repete as intru��es a quantidade de vezes que preciso, no caso 3
			System.out.println("Digite a nota "+(i+1)+" do aluno");
			vetor[i] = input.nextFloat();// leio a nota do teclado
			soma += vetor[i];//soma os valores(Na verdade, depois que fiz isso eu notei que n�o precisava necessariamente de vetor)
		}
		
		float media = soma/3;// divide
		if (media <5.0){//faz a verifica��o da media, e diz se ele ficou em recupera��o, reprovado ou aprovado
			System.out.println("Voc� est� reprovado. s2 SEU C&*$ s2");
		}
		else if(media<7.0){
			System.out.println("Voc� est� em recupera��o!!!");
		}
		else if(media<10.0){
			System.out.println("Voc� foi aprovado!!");
		}

	}

}
