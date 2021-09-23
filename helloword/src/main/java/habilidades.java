import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class habilidades {
	
	@RestController
	@RequestMapping("/persistencia")
	public class persistencia {
		
	    @GetMapping
		public String mostrarpersistencia() {
			return "persistencia";

	}



	}
}
