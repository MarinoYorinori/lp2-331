package aula1;

public class Moto extends Veiculo{
    private String cor;

    public void Moto(){
        super();
        this.cor = null;
    }
    public void Moto(String cor){
        super();
        this.cor = cor;
    }

    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if(obj == null)
            return false;
        if (obj.getClass() != getClass())
            return false;
            
        Moto other = (Moto) obj;
        
        if (cor == null){
            if (other.cor != null)
                return false;
        }
        else if (!cor.equals(other.cor))
            return false;
            
        return true;
    }
    
    public int hashCode(){
        final int prime = 31;
        int result = super.hashCode();

        result = prime * result + ((this.cor == null) ? 0 : (cor.hashCode()));
        
        return result;
    }
}