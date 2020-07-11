
	CREATE DATABASE SOC;
	
	USE SOC;
	
	CREATE TABLE PACIENTE(
	ID int not null IDENTITY(1,1) PRIMARY KEY,
	NOME VARCHAR(60) NOT NULL,
	DT_NASCIMENTO DATE NOT NULL,
	CPF VARCHAR(15) NOT NULL,
	ENDERECO_ VARCHAR(70) NOT NULL,
	DT_CADASTRO DATE NOT NULL,
	DT_ALTERACAO DATE NOT NULL,
	EMAIL VARCHAR(30) NOT NULL,
	CONVENIO VARCHAR(20) NOT NULL,
	SOLIC_EXAME VARCHAR(500) NOT NULL,
	OBSERVACAO_ VARCHAR(250));
	
	
	CREATE TABLE EXAME(
	ID INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	PROTOCOLO INT NOT NULL,
	NOME_MEDICO VARCHAR(60) NOT NULL,
	DT_EXAME DATE NOT NULL,
	ID_TIP_EXAME INT NOT NULL);
	
	CREATE TABLE TIPO_EXAME(
	ID INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	TIP_EXAME VARCHAR(20)NOT NULL,
	DESC_EXAME VARCHAR(60) NOT NULL);


	CREATE TABLE PACIENTE_X_EXAME(
	ID INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
	ID_PACIENTE INT NOT NULL,
	ID_EXAME INT NOT NULL);

	ALTER TABLE PACIENTE_X_EXAME
	ADD CONSTRAINT FK_ID_PACIENTE_MUITOS FOREIGN KEY(ID_PACIENTE ) REFERENCES PACIENTE(ID);

	ALTER TABLE PACIENTE_X_EXAME
	ADD CONSTRAINT FK_ID_EXAME_MUITOS FOREIGN KEY(ID_EXAME ) REFERENCES EXAME(ID);


	ALTER TABLE EXAME 
	ADD CONSTRAINT FK_TIP_EXAME FOREIGN KEY (ID_TIP_EXAME) REFERENCES TIPO_EXAME(ID);
	
	