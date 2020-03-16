import java.util.Scanner;

class Grafite {
    float espessura;
    float tamanho;

    public Grafite(float espessura, float tamanho){
        this.espessura = espessura;
        this.tamanho = tamanho;
    }
}

public class Lapiseira {
	 Grafite grafite;
     float espessura;

	public Lapiseira(float espessura){
            this.espessura = espessura;
	}
	
	void inserir(Grafite grafite) {
		if(this.grafite == null){
                    this.grafite = grafite;
                    System.out.println("Tem grafite!");
		}
	}
	
	void retirar() {
		if(this.grafite != null){
                    this.grafite = null;
                    System.out.println("Retirou,agora,insira outro para escrever.");
                } else{
                    System.out.println("Nem tem grafite aqui, insira para poder escrever.");
                }
	}
        
        void escrever(int letras){
            if(this.grafite == null){
                System.out.println("Não há grafite na lapiseira");
            }else if(this.grafite.espessura != this.espessura){
                System.out.println("Impossível escrever, o grafite inserido não serve nessa lapiseira, insira um compativel!");
                retirar();
            }else{
                if(grafite.tamanho>0.1){
                    System.out.println("...writing...");
                    this.grafite.tamanho-=letras/10;
                }
                else{
                    System.out.println("insira outro grafite");
                    grafite=null;
                    }
            }
        }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Lapiseira lapiseira  = new Lapiseira(1);
		while(true) {
			String line = scanner.nextLine();
			String ui[] = line.split(" ");
			if(ui[0].equals("acabou")) {
				break;
			}else if(ui[0].equals("iniciar")) { //iniciar o tipo da lapiseira
                            lapiseira = new Lapiseira(Float.parseFloat(ui[1]));
			}else if(ui[0].equals("inserir")) { 
                            lapiseira.inserir(new Grafite(Float.parseFloat(ui[1]),Float.parseFloat(ui[2])));
			}else if(ui[0].equals("retirar")) {
                            lapiseira.retirar();
			}else if(ui[0].equals("escrever")) {
                            int letras = Integer.parseInt(ui[1]);
                            lapiseira.escrever(letras);
			}else{
                            System.out.println("Comando invalido");
			}
		}
		scanner.close();
	}
}