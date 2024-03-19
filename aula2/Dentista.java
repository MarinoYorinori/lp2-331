package aula2;

public class Dentista {
    
	private String nome;
    private Integer idade;

    public Dentista(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(Integer idade){
        this.idade = idade;
    }
    
    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if(obj == null)
            return false;
        if (obj.getClass() != getClass())
            return false;
        
        Dentista other = (Dentista) obj;

        if (other.nome != nome)
            return false;
        if (other.idade != idade)
            return false;
        
        return true;
    }
    
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();

        result = prime * result + ((this.nome == null) ? 0 : (nome.hashCode()));
        result = prime * result + ((this.idade == null) ? 0 : (idade.hashCode()));

        return result;
    }
    
    @Override
    public String toString(){
        return ("nome = " + nome + "\n" + "idade = " + idade);
    }
}