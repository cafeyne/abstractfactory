public class LuxuosoVeiculoFactory extends VeiculoFactory {
  public Carro criarCarro() {
      return new CarroLuxuoso();
  }

  public Moto criarMoto() {
      return new MotoLuxuosa();
  }
}
