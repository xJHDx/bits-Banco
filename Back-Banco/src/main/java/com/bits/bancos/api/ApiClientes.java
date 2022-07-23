package com.bits.bancos.api;



import com.bits.bancos.services.ClienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente/")
public class ApiClientes {

    @Autowired
    ClienteServices clienteServices;

    @Value("${spring.application.version}")
    private String version;

    @GetMapping("version")
    public ResponseEntity<String> version() {
        return new ResponseEntity(version, HttpStatus.OK);
    }


    // creation
    @PostMapping("crear")
    public ResponseEntity<?> crearCliente(){ return new ResponseEntity<>(clienteServices.nuevoCliente(),HttpStatus.CONTINUE);}
    // modification
    // Consulta
    @GetMapping("todos")
    public ResponseEntity<?> consultaTodos(){return new ResponseEntity<>(clienteServices.consultarClientes(),HttpStatus.ACCEPTED); }
    // Elimination

}