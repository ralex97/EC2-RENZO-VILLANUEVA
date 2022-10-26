package ec2.renzo.villanueva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec2.renzo.villanueva.model.Bodega;

public interface BodegaRepository extends JpaRepository<Bodega,Integer> {
  
}
