CREATE TABLE IF NOT EXISTS livro
(
    id varchar(40),
    tx_titulo varchar(50) NOT NULL,
    tx_autor varchar(60) NOT NULL,
    tx_editora varchar(100) NOT NULL,
    tx_ano INT NOT NULL,
    tx_preco INT NOT NULL,

    CONSTRAINT livro_pkey PRIMARY KEY (id)
);
