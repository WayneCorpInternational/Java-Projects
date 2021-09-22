create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
tipo varchar(50),
tamanho character,

primary key (id)
);

insert into tb_categoria (tipo, tamanho)
values ("salgado", "P");
insert into tb_categoria (tipo, tamanho)
values ("salgado", "M");
insert into tb_categoria (tipo, tamanho)
values ("salgado", "G");
insert into tb_categoria (tipo, tamanho)
values ("doce", "M");
insert into tb_categoria (tipo, tamanho)
values ("doce", "G");

select * from tb_categoria;

create table tb_pizza(
id bigint auto_increment,
sabor1 varchar(50),
borda varchar(50),
massa varchar(50),
preco decimal(10,2),
primary key (id),
fk_id_categoria bigint,
foreign key (fk_id_categoria) references tb_categoria(id) -- cara esse tb_categoria (id) esta agora se referindo ao fk_id_categoria bigint, que eh uma nova variavel FK liga as duas tabelas antigas, obrigado matheus do passado
);

select * from tb_pizza;

insert into tb_pizza (sabor1, borda, massa, preco, fk_id_categoria)
values ("muzzarela", "chedder","New York", 39.90 , 1),
("feijao com arroz", "catupiry","Pan", 85.90 , 2),
("Strogonof", "catupiry","New York", 79.90 , 3),
("pizza estilo pastel de belem ", "beijinho","New York", 50.90 , 4),
("nutella com bacon caramelizado", "borda simples","New York", 98.90 , 5),
("calabresa", "catupiry","New York", 68.90 , 1),
("portuguesa ", "gorgonzola","Pan", 79.90 , 2),
("sushi", "coracao de galinha ","New York", 99.90 , 3);

select * from tb_pizza;

select * from tb_pizza where preco > 45.00;

select * from tb_pizza where preco between 29.00  and 60.00 ;

select * from tb_pizza where sabor1 like "%c%" ;

select * from tb_pizza inner join tb_categoria
on tb_categoria.id=tb_pizza.fk_id_categoria;

select * from tb_pizza inner join tb_categoria
on tb_categoria.id=tb_pizza.fk_id_categoria
where tipo= "salgado";