package aula1;

public class Veiculo{
    private String marca;
    private Integer ano;

    public void Veiculo(){
        this.marca = null;
        this.ano = 0;
    }
    public void Veiculo(Integer ano){
        this.marca = null;
        this.ano = ano;
    }
    public void Veiculo(String marca, Integer ano){
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca(){
        return marca;
    }
    public Integer getAno(){
        return ano;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setAno(Integer ano){
        this.ano = ano;
    }

    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if(obj == null)
            return false;
        if (obj.getClass() != getClass())
            return false;
            
        Veiculo other = (Veiculo) obj;
        
        if (marca == null){
            if (other.marca != null)
            		return false;
        }
        else if (!marca.equals(other.marca))
            return false;
        if (ano == null){
            if (other.ano!= null)
                return false;
        }
        else if (!ano.equals(other.ano))
            return false;

        return true;
    }
    
    public int hashCode(){
        final int prime = 31;
        int result = 1;

        result = prime * result + ((this.marca == null) ? 0 : (marca.hashCode()));
        result = prime * result + ((this.ano == null) ? 0 : (ano.hashCode()));

        return result;
    }
}