public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade){ //nao eh metodo, eh invocado automaticaticamente na criacao
        this.nome = nome;
        this.idade = idade;
    }
}

public class motoca {
	Pessoa pessoa; //agregacao

	public motoca(){
	}
	
	void embarcar(Pessoa pessoa) {
		if(this.pessoa == null)
			this.pessoa = pessoa;
		else
			System.out.println("Ja tem gente na motoca");
	}
	
	void desembarcar() {
		if(this.pessoa != null)
			this.pessoa = null;
		else
			System.out.println("Nao tem ninguem na moto");
	}

	void dirigir(){
		if(this.pessoa == null)
			System.out.println("Nao tem ninguem na moto");
		else if(this.pessoa.idade < 2)
			System.out.println("Muito pequeno pra andar de moto");
		else if(this.pessoa.idade > 10)
			System.out.println("Muito grande pra andar de moto");
		else
			System.out.println(this.pessoa.nome + ": Run Run Run...");
	}


	public static void main(String[] args) {
		Pessoa beah = new Pessoa("Beah", 10);

		motoca moto = new motoca();
		moto.embarcar(beah);
		moto.dirigir();
		moto.desembarcar();

		motoca moto2 = new motoca();
		moto2.embarcar(beah);
		moto2.dirigir();
		moto2.desembarcar();

		System.out.println(beah.nome);
	}
/*
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		motoca motoca  = new motoca();
		while(true) {
			String line = scanner.nextLine();
			String ui[] = line.split(" ");
			if(ui[0].equals("end")) {
				break;
			}else if(ui[0].equals("embarcar")) { //nome  idade
				int idade = Integer.parseInt(ui[2]);
				motoca.embarcar(ui[1], idade);
			}else if(ui[0].equals("desembarcar")) {
				motoca.desembarcar();
			}else if(ui[0].equals("dirigir")) {
				motoca.dirigir();
			}else {
				System.out.println("Comando invalido");
			}
		}
		scanner.close();
	}
*/
}





