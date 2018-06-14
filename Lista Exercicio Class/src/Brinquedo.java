/**
 *
 * @author Gabriel Budke
 */
public class Brinquedo {
    
    String nome, marca, modelo;
    double preco;
    int codigo;
    long codigoBarras;
    String descricao;
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigoBarras(long codigoBarras){
        this.codigoBarras = codigoBarras;
    }
    
    public long getCodigoBarras(){
        return codigoBarras;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    } 
    
    public String getDescricao(){
        return descricao;
    }
    
}
