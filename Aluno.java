public class Aluno{
    private String nome;
    private int id;
    
    public void Aluno(String nome, int id) { // Este é o metodo construtor
    	this.nome = "Victor";
    	this.id = "1";
    	
    }

    	public String getNome() { // metodo Get
    		return this.nome;
    	}
    	public int getId() {
    		return this.id;
    	}

	public void setNome(String nome) { // metodo Set
		this.nome = nome;
	}

	public void setId(int id) {
		this.id = id;
	}
}