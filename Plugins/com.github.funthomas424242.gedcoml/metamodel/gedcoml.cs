SYNTAXDEF gedcoml
FOR <http://com.github.funthomas424242/language/gedcoml>
START Family,FamilyBook

OPTIONS{
 reloadGeneratorModel="true";
 generateCodeFromGeneratorModel="true"; //wichtig um Fehler im Generat zu vermeiden
 disableLaunchSupport="false";
 usePredefinedTokens="true";
 resourcePluginID="com.github.funthomas424242.gedcoml.resource";
 resourceUIPluginID="com.github.funthomas424242.gedcoml.ui";
 basePackage="com.github.funthomas424242.gedcoml.resource";
 srcFolder="src";
 srcGenFolder="src-gen";
 uiSrcFolder="src";
 uiSrcGenFolder="src-gen";
}


TOKENS {
	//DEFINE COMMENT $'//'(~('\n'|'\r'|'\uffff'))*$;
	//DEFINE INTEGER $('-')?('1'..'9')('0'..'9')*|'0'$;
	//DEFINE FLOAT $('-')?(('1'..'9') ('0'..'9')* | '0') '.' ('0'..'9')+ $;
	DEFINE ID $('\'')('#')$ + TEXT + $('\'') $;
	DEFINE DATE $ 'unbekannt' | ('0'..'9') ('0'..'9') '.' ('0'..'9') ('0'..'9') '.' ('0'..'9') ('0'..'9')('0'..'9') ('0'..'9')$;
	//DEFINE NUMBER  $('0'..'9')+$;
}


TOKENSTYLES {
	"DATE" COLOR #00FF00 ;
	"Projectdescription" COLOR #7F0055, BOLD;
	"groupId:" COLOR #7F0055, BOLD;
	"artifactId:" COLOR #7F0055, BOLD;
	"version:" COLOR #7F0055, BOLD;
	"import family" COLOR #7F0055, BOLD;
	"Family" COLOR #7F0055, BOLD;
	"Person" COLOR #7F0055, BOLD;
	"FirstName:" COLOR #7F0055, BOLD;
	"LastName:" COLOR #7F0055, BOLD;
	"MiddleName:" COLOR #7F0055, BOLD;
	"BirthDay:" COLOR #7F0055, BOLD;
	"Sex:" COLOR #7F0055, BOLD;
	"DeathDay:" COLOR #7F0055, BOLD;
	"BiologicalParentOf:" COLOR #7F0055, BOLD;
	"BiologicalFatherIs:" COLOR #7F0055, BOLD;
	"BiologicalMotherIs:" COLOR #7F0055, BOLD;
	"Married" COLOR #7F0055, BOLD;
	"Id" COLOR #7F0055, BOLD;
	"Note" COLOR #7F0055, BOLD;
	"FamilyBook" COLOR #7F0055, BOLD;
	"Quellen:" COLOR #7F0055, BOLD;
	"PostAddress" COLOR #7F0055, BOLD;
	"Entry:" COLOR #7F0055, BOLD;
	"Exodus:" COLOR #7F0055, BOLD;
	"Street:" COLOR #7F0055, BOLD;
	"Postcode:" COLOR #7F0055, BOLD;
	"City:" COLOR #7F0055, BOLD;
	"WeddingDay:" COLOR #7F0055, BOLD;
	"SeparationDay:" COLOR #7F0055, BOLD;
	"Partner:" COLOR #7F0055, BOLD;
}


RULES {
	FamilyBook ::= "FamilyBook" "{"  project? "}";
	Projectdescription ::= "Projectdescription" "{" 
		"groupId:" groupId['"','"']  "."
		"artifactId:" artifactId['"','"']  "."
		"version:" version['"','"']  "."
		author
		"publishingDate:" publishingDate[DATE] "."
		imports* "}";
	Author::= "Author" "{" "FirstName:" firstName['"','"'] "LastName:" lastName['"','"'] "MemberId:" memberId['"','"']? ;
	Family ::= "Family"  name['"','"'] "{" imports* members+  "}"; 
	UnbekanntePerson ::= "UnbekanntePerson" "{" "Id:" id['"','"'] "." 
						 "Sex:" sex[male:"male", female:"female", undefined:"undefined"] "."
							addresses*
						  "}";
	BekanntePerson ::=  "Person" "{" "Id:" id['"','"'] "."
							"Name at birth:" birthName['"','"'] "."
							"FirstName:" firstName['"','"'] "."
							"MiddleName:" middleName['"','"']? "."
			  			    "LastName:" lastName['"','"'] "."			  			    			  			 
			  			    "Sex:" sex[male:"male", female:"female", undefined:"undefined"] "."
			  			    "BirthDay:" birthDay[DATE] "."
			  			    "DeathDay:" deathDay[DATE]? "."
			  			    "BiologicalFatherIs:"  biologicalFatherIs['"','"'] "."
			  			    "BiologicalMotherIs:"  biologicalMotherIs['"','"'] "."		  			   
			  			    "BiologicalParentOf:"  (  biologicalParentOf['"','"'] (",")?  )*  "."
			  			     marriedWith*
			  			     addresses*
			  			     notes* "Quellen:" "{" sources+ "}" "}";

	FamilyImport ::= "import family"  importedResource['"','"']  ".";
	PostAddress ::= "PostAddress" "{" "Entry:" entry[DATE]  "."
									  "Exodus:" exodus[DATE]? "."
									  "Street:" street['"','"'] "."
									  "Postcode:" postcode['"','"'] "."
									  "City:" city['"','"'] "." "}";
	Married ::= "Married" "{" "WeddingDay:" weddingDay[DATE] "."
							  "SeparationDay:" separationDay[DATE]? "."
							  "Partner:" partner['"','"'] "." "}";
	Note ::= "Note" "{" content['"','"'] "}";
	Others ::= "Sonstiges:" description['"','"'] "." ;
	PersonRef ::= "Person:" personID['"','"'] ".";
}