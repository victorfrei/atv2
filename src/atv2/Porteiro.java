
package atv2;

public class Porteiro extends Funcionario{
    private int codPorteiro;

    public Porteiro(int codPorteiro, double salario, String turno, String nome, int idade) {
        super(salario, turno, nome, idade);
        this.codPorteiro = codPorteiro;
    }

    public int getCodPorteiro() {
        return codPorteiro;
    }

    public void setCodPorteiro(int codPorteiro) {
        this.codPorteiro = codPorteiro;
    }
    
    
}
