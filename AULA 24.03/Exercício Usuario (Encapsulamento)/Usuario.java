package pkg;

public class Usuario {
	private String nome;
	private String senha;
	
	public Usuario(String nome, String senha) {
		this.nome = nome;
		setSenha(senha);
		System.out.println("Nome: " + this.nome + " | Senha: " + getSenha());
	}
	
	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
	
	public String getSenha() {
		return "*".repeat(this.senha.length());
	}
	
	public void setSenha(String senha) {
	    String senhaLimpa = senha.trim(); 
	    if (senhaLimpa.length() >= 8) {
	        this.senha = senhaLimpa;
	        System.out.println("Senha atualizada com sucesso!");
	    } else {
	        if (this.senha == null) {
	            this.senha = "INVALIDA"; 
	        }
	        System.out.println("Erro: A senha deve ter no mínimo 8 caracteres!");
	    }
	}
}
