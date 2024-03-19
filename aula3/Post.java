package aula3;

import java.time.LocalDateTime;

import aula1.Carro;

public class Post {
	private LocalDateTime dataHorario;
	private String textoPost;
	
	public Post(String textoPost) {
		this.dataHorario = LocalDateTime.now();
		this.textoPost = textoPost;
	}
	
	public Post() {
		this.dataHorario = LocalDateTime.now();
		this.textoPost = null;
	}
	
	public LocalDateTime getDataHorario() {
		return dataHorario;
	}
	public String getTextoPost() {
		return textoPost;
	}
	
	 public boolean equals(Object obj){
	        if (this == obj)
	            return true;
	        if(obj == null)
	            return false;
	        if (obj.getClass() != getClass())
	            return false;
	        Post other = (Post) obj;
	        return this.dataHorario.equals(other.getDataHorario()) && this.textoPost.equals(other.getTextoPost());
	    }
	
	public int HashCode(){
		final int prime = 31;
        int result = super.hashCode();

        result = prime * result + ((this.dataHorario == null) ? 0 : (dataHorario.hashCode()));
        result = prime * result + ((this.textoPost == null) ? 0 : (textoPost.hashCode()));

        return result;
	}
	
	public String toString() {
		return ("dataHorario: " + dataHorario + "; textoPost: " + textoPost);
	}
	
	public int compareTo(Post obj) {
        return this.dataHorario.compareTo(obj.getDataHorario());
    }
	
}
