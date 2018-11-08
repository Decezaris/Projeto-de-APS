CREATE TABLE cliente(
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    cpf VARCHAR(15),
    nome VARCHAR(50) NOT NULL,
    login VARCHAR(50) NOT NULL,
    senha VARCHAR(50) NOT NULL,
    treinoA VARCHAR(50),
    treinoB VARCHAR(50),
    treinoC VARCHAR(50),
    avaliacaoTreinoA integer,
    avaliacaoTreinoB integer,
    avaliacaoTreinoC integer
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO cliente (nome, login, senha, treinoA, avaliacaoTreinoA) values ('Decezaris', 'damp', '12345', 'Costas', 4);
INSERT INTO cliente (nome, login, senha) values ('Gabriel', 'gafb', '12345');
INSERT INTO cliente (nome, login, senha) values ('Gilberto', 'gasj3', '12345');
INSERT INTO cliente (nome, login, senha) values ('Ivson', 'iac', '12345');