# CHANGELOG

## samizdam/dominion strategy game road map

### Added: for new features.
### Changed: for changes in existing functionality.
### Deprecated: for once-stable features removed in upcoming releases.
### Removed: for deprecated features removed in this release.
### Fixed: for any bug fixes.
### Security: to invite users to upgrade in case of vulnerabilities.

## Road Map
If current section will be too long, move to wiki on bitbucket. 

### Milestone 2
- Gui: client-server (rest + html) or single player desktop app.
- Think about multi-player. 
- Landscape conception development and introduce. 
- Add some user documentation. 
- Persistance. 

### Milestone 1
- Add Land demography and other profit characteristics. 
- Profit composite calculation for Feods from Lands. 
- Some Modifier implementations for change profit.  
- Normalize persons factoring and inheritance. 	
- Implement de-facto and de-jure title / feods owning. 
-/+ Culture interfaces and related types for plugin different logic in game. 
- Data providing for all types of names (files or database persisted). 
- Have some concept documentation.
- Think about issue / bug tracking system. See CI tools. 
- Think about license and open source. 
- Run application with some simple user interface CLI (not a full functional).   

## Unrealized   
- Demography Modifiers for Lands.
- Replace Enums in models with Interfaces, use existing enums to package, m.b.
- Titles and Ranges implementation. 
- Mark actual progress on dia.   
- Normalize Persona implementations visibility modifiers: all base classes protected via Factory.      

## Version 0.1.2 - 2015-10-19
### Added
- Introduce common interface for Entities and other types.
- UnkownPersona Interface. 

### Fixed
- Normalize implementations visibility modifiers.  

## Version 0.1.1 - 2015-10-17
### Added
- Drafts of base implementation for using models.

### Changed
- Extract Man and Woman interfaces, rename implentations with Base prefix. 
- Extract Slavic culture classes from core project. 

## Version 0.1.0 - 2015-10-16
### Added
- Characteristics for Persona implementation.
- Characteristics sub-package.
- Plot class as some Land implenentation.
- Basic Demography in Lands: number of peoples by genders. 

### Changed
- Put all interfaces as separetly for implenent all domain code as plugins only, and core-code (application) as platform. Base package added. 
- Title classes moved to sub-package. 
- Rename PersonaNameGenerationStrategy to PersonaNameGenerator. 
- Rename UnknowPersona to UnknownPersona. 

### Removed
- Naming Strategies Factories. 

## Version 0.0.1 - 2015-10-11
### Added 
- This changelog.  