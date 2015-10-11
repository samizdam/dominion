package dominion.models.persona;

public class PersonaFactory {
    
    public Man createMan(Man father, Woman mother){
	return new Man(father, mother);
    }
    
    public Woman createWoman(Man father, Woman mother){
	return new Woman(father, mother);
    }
    
    public UnknowPersona createUnknowPersona(){
	return new UnknowPersona();
    }
    
}
