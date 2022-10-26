package ec2.renzo.villanueva.services;

import java.util.List;

import ec2.renzo.villanueva.model.Cliente;

public interface ClienteService {
  List<Cliente> listar();
  Cliente obtener(Integer id);
  void guardar(Cliente cliente);
  void actualizar(Cliente cliente);
  void eliminar(Integer id);
}
