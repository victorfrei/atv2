
package atv2;


public class Funcionario extends Pessoa {
    private double salario;
    private String turno;

    public double getSalario() {
        return salario;
    }

    public Funcionario(double salario, String turno, String nome, int idade) {
        super(nome, idade);
        this.salario = salario;
        this.turno = turno;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
