# iwt-java-2022-sabado
Repositório dos códigos da turma de sábado da iwtraining
 códigos SQL 
 
 create table pessoa(id integer primary key, nome varchar(100),idade integer not null, endereco varchar(100));

create table instituicao(id integer primary key, nome varchar(100) not null, cnpj varchar(100)not null, endereco varchar(100),telefone varchar(100));

alter table instituicao rename to empresa;

alter table instituicao add column pessoa_id bigint not null;

alter table instituicao  drop column pessoa_id;

alter table instituicao add constraint fk_pessoa_id foreign key (pessoa_id) references pessoa(id);

insert into pessoa(id,nome,idade,endereco) values(4,'Genesio',45,'Caucaia');
			
update pessoa set nome = 'Anderson' where id = 4;		

delete from pessoa where id = 4;

insert into pessoa(id,nome,idade,endereco) values(4,'Genesio',45,'Caucaia');
		
insert into pessoa(id,nome,idade,endereco) values(1,'Fabiana',26,'Meireles');		
			
update pessoa set nome = 'Anderson' where id = 4;		

delete from pessoa where id = 4 or nome = 'Fabiana';

select * from pessoa;
	
select nome,endereco from pessoa;

select nome,endereco from pessoa where nome = 'Pedro'

select nome,endereco from pessoa where nome ilike 'fab%' or nome like '%ro%';

select e.nome as empresa_nome , e.endereco, p.nome as pessoa_nome  from empresa e inner join pessoa p on e.pessoa_id = p.id; 
