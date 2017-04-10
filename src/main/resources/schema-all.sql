CREATE TABLE dicionario_retorno  (
    id BIGINT IDENTITY NOT NULL PRIMARY KEY,
    codigo VARCHAR(3) NOT NULL,
    descricao VARCHAR(255) NOT NULL
);

create table parametro_faturamento (
	id bigint identity not null primary key,
	condicao_financiamento varchar(9) not null,
	data_faturamento varchar(8) not null,
	data_vencimento varchar(8) not null,
	plano number(2) not null,
	coeficiente int not null,
	taxa int not null,
	dias_pagamento number(2) not null,
	tipo_pessoa varchar(1) not null,
	tipo_cliente varchar(5) not null,
	tipo_operacao varchar(1) not null,
	dias_primeiro_vencimento number(5) not null,
	taxa_antecipacao int not null,
	codigo_empresa varchar(2) not null,
	taxa_cancelamento int not null,
	taxa_prorrogacao int not null,
	tipo_condicao int(1) not null,
	quantidade_dias_proximo_vencimento int(5) not null
);