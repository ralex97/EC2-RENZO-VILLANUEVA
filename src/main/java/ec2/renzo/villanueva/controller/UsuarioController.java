package ec2.renzo.villanueva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ec2.renzo.villanueva.dto.UsuarioDTORequest;
import ec2.renzo.villanueva.dto.UsuarioDTOResponse;
import ec2.renzo.villanueva.security.TokenUtil;
import ec2.renzo.villanueva.security.UserDetailService;

@RestController
public class UsuarioController {
  
  @Autowired
	private TokenUtil util;
	
	@Autowired
	private UserDetailService service;

  @RequestMapping(path = "/crearToken",method = RequestMethod.POST)
	public ResponseEntity<?> crearToken(@RequestBody UsuarioDTORequest request){
		
		UserDetails user = service.loadUserByUsername(request.getUser());
		if(user.getPassword().equals(request.getPassword()))
			return ResponseEntity.ok(new UsuarioDTOResponse(util.generateToken(user.getUsername())));
		else
			throw new UsernameNotFoundException("Contraseña invalida");
	}
}
