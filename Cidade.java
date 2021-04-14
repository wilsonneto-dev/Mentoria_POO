/*
  Crie uma classe para representar uma casa 
  e crie instâncias desta classe em uma classe de execução chamada cidade. 
  
  OBS.: 
  A classe casa deve possuir atributos de acordo com os cômodos que possui 
  e cada atributo deverá possuir visibilidades diferentes
*/

import java.util.ArrayList;

public class Cidade {
  public static void main(String[] args) {
    Casa[] casas = new Casa[5];

    casas[0] = new Casa(4, 50, "Amarela", "Rua 01");
    casas[1] = new Casa(5, 60, "Verde", "Rua 01");
    casas[2] = new Casa(5, 60, "Azul", "Rua 02");
    casas[3] = new Casa(5, 60, "Azul", "Rua 02");
    casas[4] = new Casa(5, 60, "Azul", "Rua 02");

    for(int indice = 0; indice < 5; indice++)
      System.out.println(casas[indice]);
  }
}

class Casa {
  public Casa(int comodos, int metros, String cor, String endereco) {
    this.quantidadeDeComodos = comodos;
    this.metrosQuadrados = metros;
    this.corDaCasa = cor;
    this.endereco = endereco;
  }

  public int quantidadeDeComodos;
  protected int metrosQuadrados;
  private String corDaCasa;
  String endereco;

  @Override
  public String toString() 
  {
      String dadosDaCasa = 
        String.format("Qtd de Comodos: %d / Metros: %d / Cor: %s", 
          this.quantidadeDeComodos, 
          this.metrosQuadrados, 
          this.corDaCasa
        );
      return dadosDaCasa;
  }
}