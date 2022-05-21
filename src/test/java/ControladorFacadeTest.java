import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControladorFacadeTest {

    @BeforeEach
    void setUp() {
        ControladorFacade.cadastrarAr("sala");
        ControladorFacade.cadastrarTv("sala");
        ControladorFacade.cadastrarLampada("sala");

        ControladorFacade.cadastrarLampada("cozinha");

        ControladorFacade.cadastrarAr("quarto");
        ControladorFacade.cadastrarTv("quarto");
        ControladorFacade.cadastrarLampada("quarto");
    }

    @Test
    void ligarSala(){
        assertEquals("Componente sala ligado Componente sala ligado Componente sala ligado ",ControladorFacade.ligarSala());
    }
    @Test
    void desligarSala(){
        assertEquals("Componente sala desligado Componente sala desligado Componente sala desligado ",ControladorFacade.desligarSala());
    }
    @Test
    void modoCinema(){
        assertEquals("Componente quarto desligado Componente quarto ligado Componente quarto ligado temperatura 15 ",ControladorFacade.momentoCinema());
    }
    @Test
    void aSalaTaFria(){
        assertEquals("Componente sala ligado temperatura 25 temperatura 30 temperatura 30 ",ControladorFacade.aSalaTaFria());
    }
    @Test
    void boaNoite(){
        assertEquals("Componente quarto ligado temperatura 15 Componente quarto desligado Componente quarto desligado ",ControladorFacade.boaNoite());
    }

}