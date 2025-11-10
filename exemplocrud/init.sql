CREATE TABLE IF NOT EXISTS alunos (id CHAR(36) PRIMARY KEY,
                                   nome VARCHAR(100) NOT NULL,
                                    email VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS professores (id CHAR(36) PRIMARY KEY,
                                   nome VARCHAR(100) NOT NULL,
                                   email VARCHAR(100) NOT NULL
);