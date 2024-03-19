package aula3;

import java.util.ArrayList;

public class Usuario {
	private String nome;
	private ArrayList<Post> posts;
	
	public Usuario (String nome, ArrayList<Post> posts) {
		this.nome = nome;
		this.posts = posts;
	}
	public Usuario (String nome) {
		this.nome = nome;
		this.posts = new ArrayList<>;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Post> getPosts() {
		return posts;
	}
	public void setPosts(ArrayList<Post> posts) {
		this.posts = posts;
	}

	public boolean equals(Object obj){
        if (this == obj)
            return true;
        if(obj == null)
            return false;
        if (obj.getClass() != getClass())
            return false;
        Usuario other = (Usuario) obj;
        return this.nome.equals(other.getNome()) && this.posts.equals(other.getPosts());
    }

	public int HashCode(){
		final int prime = 31;
	    int result = super.hashCode();
	
	    result = prime * result + ((this.nome == null) ? 0 : (nome.hashCode()));
	    result = prime * result + ((this.posts == null) ? 0 : (posts.hashCode()));
	
	    return result;
	}
	
	public String toString() {
		return ("nome: " + nome + "; posts: " + posts);
	}

}

