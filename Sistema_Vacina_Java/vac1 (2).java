package vacina;

public class vac1 {
	private String nome;
	private int lote;
	private int quantidade;
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public int getLote(){
		return lote;
	}
	
	public void setLote(int lote){
		this.lote = lote;
	}

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}
	
	public void registro(String data){
		//realizar registro de data
	}
	public void exclui(int opt){
		//exclui o registro da dose opt
	}
		
	public void modifica(int opt, String data){
		//modifica a data da vacina opt
	}

}
