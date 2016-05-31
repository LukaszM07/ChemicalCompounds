CREATE TABLE Chemicals (
	Name text,
	EC varchar(45),
	Cas_Number varchar(45),
	Registration_Type varchar(45),
	Submission_Type varchar(45),
	Total_tonnage_Band varchar(45),
	Factsheet_URL varchar(100),
	SubstanceInformation_Page varchar(100),
	id SERIAL PRIMARY KEY
)

UPDATE chemicals SET name = '10-(piperazin-1-yl)-2-thia-9- azatricyclo[9.4.0.0^{3,8}]pentadeca- 1(15),3,5,7,9,11,13-heptaene dihydrochloride' WHERE id = 1;
UPDATE chemicals SET name = '10-(piperazin-1-yl)-2-thia-9- azatricyclo[9.4.0.0^{3,8}]pentadeca- 1(15),3,5,7,9,11,13-heptaene dihydrochloride' WHERE id = 2;
UPDATE chemicals SET name = '5-amino-3-(4-chlorophenyl)-5-oxopentanoic acid' WHERE id = 3;
