drop database PlanoSaude;
create database PlanoSaude;
use PlanoSaude;

create table Paciente(
cod_paciente int auto_increment primary key,
sexo char(1),
RG char(7),
nome varchar(30),
endereco varchar(80),
cartao_sus char(15),
telefone char(9),
email varchar(80),
dt_nascimento date
);

create table Medico(
cod_medico int auto_increment key, 
cpf varchar(11),
nome varchar(30),
dt_nasc date,
sexo char(1),
especialidade varchar(30)
);

create table Procedimento (
cod_proced int auto_increment primary key,
tipo_proced varchar(20)
);

create table Consulta( 
cod_consulta int auto_increment primary KEY,
dt_consulta date,
cod_paciente int,
cod_medico int,
FOREIGN KEY (cod_medico) references Medico(cod_medico),
FOREIGN KEY (cod_paciente) references Paciente(cod_paciente)
);
create table Consulta_Proc(
cod_consulta_proc int auto_increment primary key,
cod_proced int,
cod_consulta int,
FOREIGN KEY (cod_proced) references Procedimento(cod_proced),
FOREIGN KEY (cod_consulta) references Consulta(cod_consulta)
);
 
 create table Plano (
cod_plano int auto_increment primary key,
valor_plano numeric (7,2)
);
 
 create table plan_proc(
cod_plan_proc int auto_increment primary key,
cod_plano int,
cod_proced int,
foreign key (cod_plano) references Plano(cod_plano),
foreign key (cod_proced) references Procedimento(cod_proced)
);

create table Carterinha_plano(
cod_carteira int auto_increment primary key,
num_carteirinha int,
validade date,
cod_paciente int,
cod_plano int,
FOREIGN KEY (cod_paciente) references Paciente (cod_paciente),
FOREIGN KEY (cod_plano) references Plano(cod_plano)

);

create table Laboratorio (
num_ind int auto_increment PRIMARY KEY,
nome_lab varchar (30),
telefone int,
email varchar(50),
endereco varchar(50)
);

create table Exame(
cod_exam int auto_increment primary key,
resultado varchar(200),
dt_exame date,
cod_consulta int,
num_ind int,
cod_medico int,
FOREIGN KEY (cod_consulta) references Consulta(cod_consulta),
FOREIGN KEY (num_ind) references Laboratorio(num_ind),
FOREIGN KEY (cod_medico) references Medico(cod_medico)

);

insert into Paciente (sexo, RG, nome, endereco, cartao_sus, telefone, email, dt_nascimento)
values ("F", "7640923", "Mariana da Silva Estrela", "Rua Capri" , "754278590645838", "9912-1049", "mariana.estrela@estudante.iftm.edu.br", "2006-12-18"),
 ("M", "4440923", "Vinicius Pires Teixeira", "Rua Sao Joao" ,"764275599645837", "9934-3498", "vinicius.teixeira@estudante.iftm.edu.br", "2006-07-26"),
 ("M", "6640923", "Gabriel Moura", "Rua Carueira" , "764375599645877", "9945-5774", "g.moura@estudante.iftm.edu.br", "2006-10-23"),
 ("M", "9940623", "Roberto Alencar", "Rua Cari" , "325375599634888", "9850-5579", "roberte@estudante.iftm.edu.br", "1957-08-13"),
 ("F", "9940623", "Marcio Bonesso", "Rua das Rosas" , "732185499634888", "9830-5579", "marciob@estudante.iftm.edu.br", "1962-06-13"),
 ("F", "9940623", 'Cricia Zilda', 'Rua Jasidas Amarelas' , "124375599454888", '9950-5678', "clara@estudante.iftm.edu.br", '1986-04-16'),
 ("F", "9940623", "Gabriel Lopes", "Rua Cariri" , '751594899634888', '9349-5689', "martheus@estudante.iftm.edu.br", '1988-03-15'),
 ("M", "9940623", "Joao Pedro Florencio", "Rua dos Livros Amarelos" , "654355799632389", "9368-5579", "joao@estudante.iftm.edu.br", "2006-07-13"),
 ("M", "9940623", "Karina Estrela", "Rua Cajamar" , "751489599567988", "9935-5577", "mariana@estudante.iftm.edu.br", "1960-09-18");
 
 select *from Paciente;
 
 insert into medico (cpf, nome, dt_nasc, sexo, especialidade) values 
 ('22233322245', 'Robson Lima', '2001-09-11', 'M', 'cardiologista'),
 ('15478935214', 'Marcos Castro', '1998-09-11', 'M', 'Dermatologista'),
 ('15478325418', 'Jussara gomes', '1981-08-11', 'F', 'Neurologista'),
 ('04504568485', 'Marilia Junior','1971-10-11', 'F', 'Oftalmologista'),
 ('36982451084', 'Antonio Estrela', '1999-11-11', 'M', 'Psiquiatra'),
 ('05478935216', 'João Marcos', '1998-09-11', 'M', 'Ortopedista'),
 ('25478325417', 'Carla Alencar', '1981-08-11', 'F', 'cardiologista'),
 ('26982451088', 'Celia Vieira', '1999-11-11', 'F', 'Ortopedista'),
 ('86982451089', 'Carolina Suzano', '1999-11-11', 'F', 'Neurologista');

select * from medico;

insert into Procedimento (tipo_proced)values  
('exame'),
('cirurgia'),
('terapia'),
('cirurgia'),
('exame'),
('cirurgia'),
('terapia'),
('cirurgia'),
('cirurgia');

insert into Consulta
(dt_consulta, cod_paciente, cod_medico) values
('2023-08-24', 9, 1),
('2022-09-17', 5, 7),
('2023-10-24', 3, 3),
('2023-11-18', 2, 2),
('2023-08-13', 6, 8),
('2022-09-26', 8, 5),
('2023-10-03', 7, 9),
('2023-11-07', 1, 4),
('2023-11-02', 4, 6);

 select * from Consulta;
 
 insert into Consulta_proc (cod_proced,cod_consulta)
 values (7,1),(4,2),(7,1),(3,1),(5,9);
 
insert into Laboratorio (nome_lab , telefone , email , endereco)
values ('lab 1' , 99784135 , 'lab1@gmail.com.br' , 'Rua ademir Souza Mendes'),
 ('lab 2' , 99624136 , 'lab2@gmail.com.br' , 'Rua Augustinho Carrara Sul'),
 ('lab 3' , 99224951 , 'lab3@gmail.com.br' , 'Rua da Salvacao'),
 ('lab 4' , 99527489 , 'lab4@gmail.com.br' , 'Rua Martins'),
 ('lab 5' , 99597408 , 'lab5@gmail.com.br' , 'Rua das Rosas'),
 ('lab 6' , 99527873 , 'lab6@gmail.com.br' , 'Rua Saraiva'),
 ('lab 7' , 99663421 , 'lab7@gmail.com.br' , 'Rua dos girassois'),
 ('lab 8' , 99387369 , 'lab8@gmail.com.br' , 'Rua Martin Lutero');

 select *from Laboratorio;

insert into Exame (resultado, dt_exame, cod_consulta, num_ind, cod_medico)values
('Pedra no rin', '2023-03-22', 5, 6, 1),
('Diabetes', '2002-04-18', 1, 8, 5),
('Anemia', '2021-03-02', 4, 1, 2),
('Anemia', '2022-02-13', 5, 3, 4),
('Gripe', '2023-08-12', 7, 3, 3),
('Dengue', '2022-12-22', 8, 2, 8),
('Dengue', '2023-07-27', 2, 4, 6),
('Pedra no rin', '2022-12-04', 3, 5, 7);

select*from Exame;

insert into Plano(valor_plano)values
(150.00),
(350.00),
(250.00),
(420.00),
(80.00),
(61.00),
(500.00),
(75.00),
(100.00);

select*from Plano;

insert plan_proc(cod_plano, cod_proced)values
(1,5),
(3,6),
(6,9), 
(2,7),
(4,3),
(7,8),
(5,4),
(8,2),
(9,5);

