
package atv2;

public class Atv2 {

    public static void main(String[] args) {
      
        Aluno a = new Aluno("Aluno",20);
        Professor prof = new Professor("Física",2000,"Noite","Professor",36);
        Porteiro port = new Porteiro(92173128,2039.5,"Tarde","Porteiro",40);
        System.out.println("------------Aluno---------------");
        System.out.println(a.getNome());
        System.out.println(a.getIdade());
        System.out.println("-----------Professor--------------");        
        System.out.println(prof.getCurso());
        System.out.println(prof.getIdade());
        System.out.println(prof.getNome());
        System.out.println(prof.getSalario());
        System.out.println(prof.getTurno());
        System.out.println("--------------Porteiro---------------");
        System.out.println(port.getCodPorteiro());
        System.out.println(port.getIdade());
        System.out.println(port.getNome());
        System.out.println(port.getSalario());
        System.out.println(port.getTurno());
        System.out.println("-------------------------------------");
        
        
    }
    
}
