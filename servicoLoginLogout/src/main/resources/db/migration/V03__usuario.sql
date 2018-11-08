CREATE TABLE usuario(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    cpf VARCHAR(15),
    nome VARCHAR(50) NOT NULL,
    login VARCHAR(50) NOT NULL,
    senha VARCHAR(50) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO usuario (nome, login, senha) values ('Decezaris', 'damp', '12345');
INSERT INTO usuario (nome, login, senha) values ('Gabriel', 'gafb', '12345');
INSERT INTO usuario (nome, login, senha) values ('Gilberto', 'gasj3', '12345');
INSERT INTO usuario (nome, login, senha) values ('Ivson', 'iac', '12345');