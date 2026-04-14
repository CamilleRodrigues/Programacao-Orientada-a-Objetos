// EXERCÍCIO 01 
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Primeiro número: ");
            int n1 = sc.nextInt();
            System.out.print("Segundo número: ");
            int n2 = sc.nextInt();
            System.out.println("Resultado: " + (n1 / n2));
        } catch (ArithmeticException e) {
            System.out.println("Erro matemático: impossível dividir por zero!");
        }
    }
}


// EXERCÍCIO 02
import java.util.Scanner;

public class EscalaMusical {
    public static void main(String[] args) {
        String[] notas = {"Dó", "Ré", "Mi", "Fá", "Sol", "Lá", "Si"};
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Digite um número de 1 a 7: ");
            int escolha = sc.nextInt();
            System.out.println("A nota é: " + notas[escolha - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Digite apenas números entre 1 e 7.");
        }
    }
}


// EXERCÍCIO 03
import java.util.Scanner;

public class FormularioIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        String entrada = sc.nextLine();
        
        try {
            int idade = Integer.parseInt(entrada);
            System.out.println("Idade registrada: " + idade);
        } catch (NumberFormatException e) {
            System.out.println("Por favor, utilize apenas algarismos numéricos.");
        }
    }
}


// EXERCÍCIO 04
public class Catraca {
    public static void validarIngresso(int idade, boolean isSocio) {
        if (!isSocio && idade < 18) {
            throw new IllegalArgumentException("Acesso negado: Menores não-sócios precisam de acompanhante.");
        }
        System.out.println("Acesso liberado! Bom jogo.");
    }

    public static void main(String[] args) {
        try {
            validarIngresso(15, false);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}


// EXERCÍCIO 05
import java.io.IOException;

public class Marcenaria {
    public static void lerProjeto() throws IOException {
        throw new IOException("Falha ao abrir arquivo projeto_mesa.txt.");
    }

    public static void main(String[] args) {
        try {
            lerProjeto();
        } catch (IOException e) {
            System.out.println("Erro de leitura: " + e.getMessage());
        } finally {
            System.out.println("Limpando a bancada e desligando as máquinas...");
        }
    }
}


// EXERCÍCIO 06
public class AlimentadorPet {
    public static void liberarRacao(int gramas) {
        if (gramas < 0) throw new IllegalArgumentException("Quantidade negativa inválida.");
        if (gramas > 100) throw new IllegalStateException("A tigela vai transbordar!");
        System.out.println("Liberando " + gramas + "g de ração.");
    }

    public static void main(String[] args) {
        try {
            liberarRacao(150);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro no valor: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Erro no estado: " + e.getMessage());
        }
    }
}


// EXERCÍCIO 07
import java.util.InputMismatchException;
import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            if (nome.isEmpty()) throw new NullPointerException();
            
            System.out.print("Peso: ");
            double peso = sc.nextDouble();
            System.out.println("Paciente " + nome + " cadastrado.");
        } catch (NullPointerException e) {
            System.out.println("Erro: Nome não pode ser vazio.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Peso inválido.");
        } catch (Exception e) {
            System.out.println("Erro interno no sistema do hospital: " + e.getMessage());
        }
    }
}


// EXERCÍCIO 08
class AcordeInvalidoException extends Exception {
    public AcordeInvalidoException(String msg) { super(msg); }
}

class Partitura {
    public void registrarAcorde(String acorde) throws AcordeInvalidoException {
        if (!acorde.matches("[ABCDEFG]")) {
            throw new AcordeInvalidoException("Acorde " + acorde + " não existe!");
        }
        System.out.println("Acorde registrado.");
    }
}

public class TestePartitura {
    public static void main(String[] args) {
        Partitura p = new Partitura();
        try {
            p.registrarAcorde("H");
        } catch (AcordeInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}


// EXERCÍCIO 09
class MadeiraInsuficienteException extends RuntimeException {
    public MadeiraInsuficienteException(String msg) { super(msg); }
}

class Estoque {
    double mdf = 10.0;

    public void cortarPeca(double metros) {
        if (metros > mdf) throw new MadeiraInsuficienteException("Falta MDF no estoque!");
        mdf -= metros;
        System.out.println("Corte realizado.");
    }
}

public class TesteEstoque {
    public static void main(String[] args) {
        Estoque e = new Estoque();
        e.cortarPeca(50.0); 
    }
}


// EXERCÍCIO 10
class AlunoNaoEncontradoException extends Exception {
    public AlunoNaoEncontradoException(String msg) { super(msg); }
}

class BancoDados {
    public static void buscarAluno(int matricula) throws Exception {
        throw new Exception("Falha de conexão com o SQL Server.");
    }
}

class Negocio {
    public void gerarBoletim(int matricula) throws AlunoNaoEncontradoException {
        try {
            BancoDados.buscarAluno(matricula);
        } catch (Exception e) {
            throw new AlunoNaoEncontradoException("Não foi possível localizar o aluno " + matricula);
        }
    }
}

public class MainAcademico {
    public static void main(String[] args) {
        Negocio n = new Negocio();
        try {
            n.gerarBoletim(123);
        } catch (AlunoNaoEncontradoException e) {
            System.out.println("Mensagem ao usuário: " + e.getMessage());
        }
    }
}

