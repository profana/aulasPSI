/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anaesteves;

import java.util.Scanner;

/**
 *
 * @author ana esteves
 */
public class Caes extends veterinario{
    private String raca;
    private String cordepelo;
    private int anodenascimento;

    public Caes() {
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getCordepelo() {
        return cordepelo;
    }

    public void setCordepelo(String cordepelo) {
        this.cordepelo = cordepelo;
    }

    public int getAnodenascimento() {
        return anodenascimento;
    }

    public void setAnodenascimento(int anodenascimento) {
        this.anodenascimento = anodenascimento;
    }
    @Override
    public void animais(){
        super.animais();
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduza a raça do cão");
        raca=sc.nextLine();
        System.out.println("Introduza a cor de pelo do cão");
        cordepelo=sc.next();
        System.out.println("Introduza o ano de nascimento do cão");
        anodenascimento=sc.nextInt();
    }
    public void maisNovo(){
        
    }
}
