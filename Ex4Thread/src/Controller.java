import java.util.Random;

public class Controller extends Thread {

	private String nameSapo;
	private int totalPercurso = 100;
	private int saltoSapo;
	private int percursoRealizado;
	Random p = new Random();
	private int posicao;
	private static int colocacao = 0;
	
	public Controller(int id){
		if (id == 1){
			this.nameSapo = "1"; 
		} else if (id == 2){
			this.nameSapo = "2";
		} else if (id == 3){
			this.nameSapo = "3";
		} else if (id == 4){
			this.nameSapo = "4";
		} else {
			this.nameSapo = "5";
		}
		this.percursoRealizado = 0;
		//this.posicao = 0;
	}
	
	@Override
	public void run() {
		while (this.percursoRealizado <= totalPercurso){
			this.saltoSapo = p.nextInt(10) + 0;
			this.percursoRealizado += this.saltoSapo;
			System.out.println(this.nameSapo + " deu um pulo de " + this.saltoSapo + "m. Percorreu " + this.percursoRealizado + "m até aqui");
			
			if (this.percursoRealizado > totalPercurso){
				//this.posicao = i++;
				break;
			}
		}
		
		System.out.println("ATENÇÃO: " + this.nameSapo + " cruzou a linha de chegada!!!");
		
		this.posicao = colocacao();	
		
		try {
			sleep(this.posicao * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (this.posicao == 1){
			System.out.println("=========================================================");
			System.out.println("=================== ORDEM DE CHEGADA ====================");
			System.out.println("=========================================================");
		}
		
		//JOptionPane.showMessageDialog(null, this.posicao + "º LUGAR ====> " + this.nameSapo);
		System.out.println(this.posicao + "º LUGAR ====> Sapinho número " + this.nameSapo);
		
		
	}
	
	public int colocacao(){
		
		colocacao++;
		return colocacao;
	}
}
