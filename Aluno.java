public class Aluno{
    private String nome;
    private int id;
	
	public void Aluno(String nome, int id) { 
    	this.nome = "Victor";
    	this.id = "1";
	this.nome = "Guilherme";
	this.id = "2";
    	
    }

    	public String getNome() {
    		return this.nome;
    	}
    	public int getId() {
    		return this.id;
    	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setId(int id) {
		this.id = id;
	}
}
