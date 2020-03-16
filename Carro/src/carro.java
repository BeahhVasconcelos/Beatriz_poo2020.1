import java.util.Scanner;

public class carro {
	int nPessoas = 0; //atributos
	int maxPessoas = 5;
	int acelerar = 0;
	
	void embarcar(int qtd) { //metodos
		if(qtd < 0)
			return;
		if(qtd + this.nPessoas > this.maxPessoas) {
			System.out.println("Nao cabe galera, flw");
			return;
		}
		this.nPessoas += qtd;
		System.out.println("Cai dentro");
	}
	
	void desembarcar(int qtd) {
		if(qtd < 0)
			return;
		if(this.nPessoas < qtd) {
			System.out.println("so tem " + this.nPessoas + " no carro");
			return;
		}
		this.nPessoas -= qtd;
		System.out.println("Pega o beco galera");
	}
	
	void baixarvidro() {
		System.out.println(" descendo vidro");
}
	void subirvidro() {
		System.out.println(" subindo vidro");
}
	void acelerar (int qtd) {
		if(qtd<0)
			System.out.println("ADICIONE UMA VELOCIDADE");
		
		if(qtd + this.acelerar > 0 ) {
			System.out.println("ACELERANDO");	
		}
	}
	void show() {
		System.out.println("Carro: nPessoas = " + this.nPessoas);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		carro carro = new carro();
		while(true) {
			String line = scanner.nextLine();
			String ui[] = line.split(" ");
			if(ui[0].equals("end")) {
				break;
			}else if(ui[0].equals("show")) {
				carro.show();
			}else if(ui[0].equals("embarcar")) {
				int qtd = Integer.parseInt(ui[1]);
				carro.embarcar(qtd);
			}else if(ui[0].equals("desembarcar")) {
				int qtd = Integer.parseInt(ui[1]);
				carro.desembarcar(qtd);
			}else if(ui[0].equals("acelerar")) {
				int qtd = Integer.parseInt(ui[1]);
				carro.acelerar(qtd);
			}else if(ui[0].equals("subir")) {
				carro.subirvidro();
			}else if(ui[0].equals("abaixar")) {
				carro.baixarvidro();
			}else {
				System.out.println("Comando invalido");
				
			}
		}
		
		scanner.close();
	}
}

