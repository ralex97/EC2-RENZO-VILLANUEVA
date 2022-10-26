package ec2.renzo.villanueva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec2.renzo.villanueva.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer> {
  
}
