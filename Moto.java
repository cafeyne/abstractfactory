public abstract class Moto {
  protected String tipo;

  public Moto(String tipo) {
      this.tipo = tipo;
  }

  public abstract void exibirDetalhes();
}
