/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp01.lp2l4;

/**
 *
 * @author Guilherme
 */
public class TP01LP2l4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    LivroDeBiblioteca L1 = new LivroDeBiblioteca("Introdução á POO usando JAVA", "Prof. Rafaek Santos", "Campus/SBC", (short) 2003, "g11p17");
    
    System.out.println(L1.getDados());

    //L1.Empresta();//
    if(L1.getEmprestado() == false){
      L1.Empresta();
      System.out.println("O livro Introducao a POO usando JAVA foi emprestado com sucesso! Devera ser devolvido em 7 dias.");
      
    } else {
      System.out.println("O livro já foi emprestado");
    }

  }
    
}
