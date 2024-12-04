public class EsportivoVeiculoFactory extends VeiculoFactory {
  public Carro criarCarro() {
      return new CarroEsportivo();
  }

  public Moto criarMoto() {
      return new MotoEsportiva();
  }
}