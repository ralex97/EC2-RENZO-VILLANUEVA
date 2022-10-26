package ec2.renzo.villanueva.services;

import java.util.List;

import ec2.renzo.villanueva.model.Bodega;

public interface BodegaService {
  List<Bodega> listar();
  Bodega obtener(Integer id);
  void guardar(Bodega bodega);
  void actualizar(Bodega bodega);
  void eliminar(Integer id);
}
