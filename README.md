# Projeto_Everymind
- Sempre que for baixar o projeto, criar uma WEB-INF em Páginas Web do Projetos no Netbeans


Create table login (
id int not null,
name varchar(100) not null,
email varchar(100) not null,
username varchar(100) not null,
password varchar(200) not null
);


create sequence seq_login;

create table endereco(
id int,
logradouro varchar(100),
cep varchar(100),
numero numeric(10),
complemento varchar(100),
constraint enderecopk primary key (id)
)


create sequence seq_endereco;
