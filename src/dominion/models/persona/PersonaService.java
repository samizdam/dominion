package dominion.models.persona;

public interface PersonaService {

    public Man createMan(Man father, Woman mother);
    
    public Woman createWoman(Man father, Woman mother);

    public Persona createUnknownPersona();
}