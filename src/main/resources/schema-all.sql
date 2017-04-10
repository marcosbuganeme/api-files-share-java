CREATE TABLE dicionario_retorno  (
    id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    codigo VARCHAR(3) NOT NULL,
    descricao VARCHAR(255) NOT NULL
);

create table parametro_faturamento (
	id bigint identity not null primary key,
	condicaoFinanciamento varchar(9) not null,
	dataFaturamento varchar(8) not null,
	dataVencimento varchar(8) not null,
	plano number(2) not null,
	coeficiente int not null,
	taxa int not null,
	diasPagamento number(2) not null,
	filial varchar(4) not null,
	tipoPessoa varchar(1) not null,
	tipoCliente varchar(5) not null,
	tipoOperacao varchar(1) not null,
	diasPrimeiroVencimento number(5) not null,
	taxaAntecipacao int not null,
	codigoEmpresa varchar(2) not null,
	taxaCancelamento int not null,
	taxaProrrogacao int not null,
	tipoCondicao int(1) not null,
	quantidadeDiasProximoVencimento int(5) not null
);