public class App {
	
	public static void main(String[] args) {
		
		System.out.println("Aprendendo POO com Java");
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.idade = 21;
		pessoa1.nome = "Vitor";
		
		Carro meuCarro = new Carro();
		meuCarro.ano = 2021;
		meuCarro.cor = "Preto";
		meuCarro.modelo = "Gol";
			
		System.out.println("Pessoa");
		System.out.println("Nome = " + pessoa1.nome);
		System.out.println("Idade = " + pessoa1.idade);
		
		System.out.println();
		
		System.out.println("Carro 1 = ");
		System.out.println("Modelo = " + meuCarro.modelo);
		System.out.println("Cor do carro = " + meuCarro.cor);
		System.out.println("Ano cadsrrdso = " + meuCarro.ano);
		//
		
		
		
		
		
	}
}