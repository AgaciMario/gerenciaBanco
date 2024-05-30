/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package meu.banco.gerenciabanco;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Agaci
 */
public class main {

    public static void main(String[] args) throws UnsupportedEncodingException {
        PrintStream ps = new  PrintStream(System.out, true, "UTF-8");
        user usuario = new user();
        
        ps.println("Informe o nome do usuário:");
        usuario.setNome(System.console().readLine());
        
        ps.println("Informe o sobre nome do usuário:");
        usuario.setSobreNome(System.console().readLine());
        
        ps.println("Informe o CPF do usuário:");
        usuario.setCpf(System.console().readLine());

        boolean executar = true;
        while(executar){
            
            ps.println("+___Meu Banco___+");
            ps.println("1 - Consultar saldo");
            ps.println("2 - Relizar deposito");
            ps.println("3 - Relizar saque");
            ps.println("0 - Encerrar programa \n");
        
            ps.print("opção > ");
            int opcao = Integer.parseInt(System.console().readLine());
            
            switch (opcao){
                case 1 -> consultarSaldo(usuario, ps);
                case 2 -> realizarDeposito(usuario, ps);
                case 3 -> realizarSaque(usuario, ps);
                case 0 -> { 
                    ps.println("Obrigado! e volte sempre.");
                    executar = false;
                }
                default -> ps.println("Opção invalida!");
            }
        }
    }
    
    private static void consultarSaldo(user usuario, PrintStream ps){
        ps.println("Usuário: "+ usuario.getNome() +" "+ usuario.getSobreNome());
        ps.println("Saldo: "+ usuario.getSaldo());
    }
    
    private static void realizarDeposito(user usuario, PrintStream ps){
        try {
            ps.print("Digite o valor que deseja depositar: ");
            double ValorDeposito = Double.parseDouble(System.console().readLine());
            usuario.deposito(ValorDeposito);
        } catch (Exception ex){
            ps.println(ex.getMessage());
        }
    }
    
    private static void realizarSaque(user usuario, PrintStream ps){
        try {
            ps.print("Digite o valor que deseja sacar: ");
            double valorSaque = Double.parseDouble(System.console().readLine());
            usuario.saque(valorSaque);
            ps.println("Saque no valor " + valorSaque + " realizado!");
        } catch (Exception ex) {
            ps.println(ex.getMessage());
        }
    }
}
