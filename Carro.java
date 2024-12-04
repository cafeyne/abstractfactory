public abstract class Carro {
  protected String tipo;
  
  public Carro(String tipo) {
      this.tipo = tipo;
  }

  public abstract void exibirDetalhes();
}