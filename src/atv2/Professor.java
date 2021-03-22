/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv2;

public class Professor extends Funcionario {
    private String curso;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Professor(String curso, double salario, String turno, String nome, int idade) {
        super(salario, turno, nome, idade);
        this.curso = curso;
    }
    
}
