package dominion.models.culture.slavic;

import dominion.models.persona.Man;
import dominion.models.persona.WellBornPersona;
import dominion.models.persona.name.FamilyName;
import dominion.models.persona.name.FirstName;
import dominion.models.persona.name.FirstNameRepository;
import dominion.models.persona.name.Patronym;
import dominion.models.persona.name.PersonaName;
import dominion.models.persona.name.PersonaNameGenerationStrategy;

public class RandomSlavicStrategy implements PersonaNameGenerationStrategy {

    @Override
    public PersonaName generateName(WellBornPersona persona) {
	FirstNameRepository nameRepo = new HardcodedSlavicFirstNameRepository();
	FirstName firstName = new FirstName(nameRepo.getRandomStringForName(persona.getGender()));
	Man father = (Man) persona.getFather();
	FirstName fatherName = father.getName().getFirstName();
	Patronym patronym = new Patronym(fatherName); 
	
	FamilyName familyName = father.getName().getFamilyName();
	return new SlavicTreePartName(firstName, patronym, familyName);
    }
    

}
