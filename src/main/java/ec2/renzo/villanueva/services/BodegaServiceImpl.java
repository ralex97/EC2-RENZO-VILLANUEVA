package ec2.renzo.villanueva.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec2.renzo.villanueva.model.Bodega;
import ec2.renzo.villanueva.repository.BodegaRepository;

@Service
public class BodegaServiceImpl implements BodegaService {

  @Autowired
  private BodegaRepository repository;

  @Override
  public List<Bodega> listar() {
    return repository.findAll();
  }

  @Override
  public Bodega obtener(Integer id) {
    return repository.findById(id).orElse(null);
  }

  @Override
  public void guardar(Bodega bodega) {
    repository.save(bodega);
  }

  @Override
  public void actualizar(Bodega bodega) {
    repository.saveAndFlush(bodega);
  }

  @Override
  public void eliminar(Integer id) {
    repository.deleteById(id);
  }
  
}
