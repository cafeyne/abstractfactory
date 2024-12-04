public abstract class VeiculoFactory {
  public abstract Carro criarCarro();
  public abstract Moto criarMoto();

  public static VeiculoFactory getFactory(String tipo) {
      if (tipo.equals("esportivo")) {
          return new EsportivoVeiculoFactory();
      } else if (tipo.equals("luxuoso")) {
          return new LuxuosoVeiculoFactory();
      }
      return null;
  }
}