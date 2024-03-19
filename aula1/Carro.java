package aula1;

public class Carro extends Veiculo{
    private String modelo;
    private String placa;

    public void Carro(){
        this.modelo = null;
        this.placa = null;
    }
    public Carro(String modelo, String placa){
        super();
        this.modelo = modelo;
        this.placa = placa;
    }
    public Carro(String modelo){
        super();
        this.modelo = modelo;
        this.placa = null;
    }
    public Carro(String placa){
        super();
        this.modelo = null;
        this.placa = placa;
    }

    public String getModelo(){
        return modelo;
    }
    public String getPlaca(){
        return placa;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if(obj == null)
            return false;
        if (obj.getClass() != getClass())
            return false;
            
        Carro other = (Carro) obj;
        
        if (modelo == null){
            if (other.modelo!= null)
                return false;
        }
        else if (!modelo.equals(other.modelo))
            return false;
        if (placa == null){
            if (placa.modelo != null)
                return false;
        }
        else if (!placa.equals(other.placa))
            return false;
            
        return true;
    }
    
    public int hashCode(){
        final int prime = 31;
        int result = super.hashCode();

        result = prime * result + ((this.modelo == null) ? 0 : (modelo.hashCode()));
        result = prime * result + ((this.placa == null) ? 0 : (placa.hashCode()));

        return result;
    }
}