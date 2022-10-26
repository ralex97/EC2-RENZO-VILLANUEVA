package ec2.renzo.villanueva.services;

import java.util.List;

import ec2.renzo.villanueva.model.Producto;

public interface ProductoService {
  List<Producto> listar();
  Producto obtener(Integer id);
  void guardar(Producto producto);
  void actualizar(Producto producto);
  void eliminar(Integer id);
}
