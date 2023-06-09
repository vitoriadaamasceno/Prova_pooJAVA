
package prova_poo;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
     
        System.out.println(" Pessoa Juridica");
        Juridica juridica = new Juridica("15-859-99/0001-52","1578", "Amplia Construções", "7133310386", "amplia@gmail.com", new Endereco("Rua Aplipio Dias", "108", "proximo a clinica Ampar", "40548825", "Salvador", UnidadeFederativa.BAHIA));
        System.out.println(juridica);
        System.out.println("");
        System.out.println(" Pessoas Fisicas");
        System.out.println("Cliente");
        Cliente cliente = new Cliente(1, LocalDate.of(1999, Month.MARCH, 5), Genero.FEMININO, "Maria Vitoria de Jesus", "7198565828","damasceno@gmail.com",new Endereco("Rua Alcebiades", "9", "proximo ao Mercado", "40548525", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
        System.out.println(cliente);
        System.out.println("");
        System.out.println("Motoboy");
        Motoboy motoboy = new Motoboy("785995775", "485968587-99", "15599985863", "333", Setor.OPERACOES, 1500, LocalDate.of(1998, Month.MAY, 10), Genero.MASCULINO, "Diego Pontes", "71985785965", "diego@outlook.com", new Endereco("Rua das Luzes", "10", "proximo ao bar ", "4848825", "Salvador", UnidadeFederativa.BAHIA));
        System.out.println(motoboy);
        System.out.println("");
        System.out.println("Medico");
        Medico medico = new Medico ("1586", "045586896586", "45245271288","444", Setor.SAUDE, 25000, LocalDate.of(1985, Month.DECEMBER, 5), Genero.MASCULINO,"Matheus Vitor", "7198558595", "matheus@gmail.com", new Endereco("Praça Aluis Freitas", "5", "Ao lado da clinica", "485955", "Salvador", UnidadeFederativa.BAHIA));
        System.out.println(medico);
        System.out.println("");
        System.out.println("Advogado");
        Advogado adv = new Advogado("5896", "89569588959", "1895578933", "555", Setor.JURIDICO, 10000, LocalDate.of(1980, Month.APRIL, 22), Genero.MASCULINO, "Bruno Silva", "7198595485", "bruninho@gmail.com", new Endereco("Rua Alvoredo", "5108", "casa azul", "859985", "Salvador", UnidadeFederativa.SAO_PAULO));
        System.out.println(adv);
        System.out.println("");
    }
}
