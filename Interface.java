// INTERFACE
// OS MÉTODOS DA INTERFACE NÃO POSSUEM BLOCO DE CÓDIGO "{}"
interface Animal {
  public void animalSound();
  public void sleep();
}


// A CLASSE "PIG" IMPLEMENTA A INTERFACE "ANIMAL"
// AS CLASSES "FILHAS" IRÃO DETERMINAR O QUE OS MÉTODOS CRIADOS NA INTERFACE IRÃO FAZER
class Pig implements Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    System.out.println("Zzz");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig();  // CRIA UM OBJETO PARA A CLASSE PIG
    myPig.animalSound();
    myPig.sleep();
  }
}
