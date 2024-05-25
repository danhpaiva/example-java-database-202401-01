CREATE DATABASE DB_LOJA;

DROP DATABASE DB_LOJA;

CREATE TABLE tb_pessoas (
    PessoaID int,
    Nome varchar(100),
    Sobrenome varchar(100),
    Endereco varchar(150),
    CEP varchar(10)
);

INSERT INTO tb_pessoas (PessoaId, Nome, Sobrenome, Endereco, CEP)
VALUES (1, "Daniel", "Paiva", "Rua Ficticia", "31000-000");

INSERT INTO tb_pessoas (PessoaId, Nome, Sobrenome, Endereco, CEP)
VALUES (2, "Maria", "Silva", "Rua Flor", "31100-000"),
(3, "João", "Silva", "Rua Flor", "31100-000"),
(4, "Maria", "Silva", "Rua Flor", "31100-000");

UPDATE tb_pessoas
SET Nome = "Isabel", Sobrenome = "Silva"
WHERE PessoaID = 4;