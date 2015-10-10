package dominion.models.persona.name;

import dominion.models.persona.Man;
import dominion.models.persona.Persona;

public class RandomSlavicStrategy implements PersonaNameGenerationStrategy {

    @Override
    public PersonaName generateName(Persona persona) {
	FirstNameRepository nameRepo = new HardcodedSlavicFirstNameRepository();
	FirstName firstName = new FirstName(nameRepo.getRandomStringForName(persona.getGender()));
	Man father = (Man) persona.getFather();
	FirstName fatherName = father.getName().getFirstName();
	Patronym patronym = new Patronym(fatherName); 
	
	FamilyName familyName = father.getName().getFamilyName();
	return new SlavicTreePartName(firstName, patronym, familyName);
    }
    

}
