
package DesarrolloWeb3Andrew.DesarrolloWeb3Andrew;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j  
public class ControladorInicio {
    

    @GetMapping("/")
    public String inici(){
        log.info("Ejecutando el Controlador");
        return "Este es el inicio Primo ecmano ";
    }
}