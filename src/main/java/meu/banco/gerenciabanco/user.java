/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meu.banco.gerenciabanco;

/**
 *
 * @author Agaci
 */
public class user {
    
    private String nome;
    private String sobreNome;
    private String cpf;
    private double saldo;
    
    public user(){
    }
    
    public user(String nome, String sobreNome, String cpf){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }
 
   public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return this.saldo;
    }
    
    public void deposito(double valor) throws Exception {
        if(valor <= 0.0) 
            throw new Exception("Valor inválido!");
        
        this.saldo += valor;
    }

    public void saque(double valor) throws Exception {
        if(this.saldo - valor < 0.0) 
            throw new Exception("Não há saldo disponível para sacar o valor indicado!");
        
        this.saldo -= valor;
    }
}
