public class Jogo {

  public static void main(String... args) throws Exception {
    Personagem cacador = new Personagem("John", 5, 0, 0);
    Personagem guloso = new Personagem("Guloso", 10, 15, 5); //estado do objeto 10,0, 0//
    Personagem soneca = new Personagem("Dorminhoco", 5, 10, 5);
  
    while (true) {
      cacador.cacar();
      cacador.cacar();
      guloso.comer();
      guloso.comer();
      guloso.comer();
      soneca.dormir();
      soneca.dormir();
      cacador.cacar();
      cacador.cacar();
      cacador.cacar();
      soneca.dormir();
      soneca.dormir();
      cacador.cacar();
      soneca.dormir();
      guloso.comer();

      System.out.println("=============");
      Thread.sleep(2000);
      System.out.println("=============");
      
    }
  }
}