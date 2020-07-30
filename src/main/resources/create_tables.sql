create schema exchange collate utf8mb4_0900_ai_ci;

create table angajat
(
	id bigint auto_increment
		primary key,
	name varchar(255) null
);

create table curs_valutar
(
	id bigint auto_increment
		primary key,
	created date null,
	currency_code varchar(255) null,
	exchange_rate double not null,
	exponent int not null,
	created_on date null,
	currency varchar(255) not null
);

create table dictionar_valute
(
	id bigint auto_increment
		primary key
);

create table valuta
(
	id bigint auto_increment
		primary key,
	code varchar(255) null
);

create table numerar
(
	id bigint auto_increment
		primary key,
	created date null,
	sum bigint null,
	user varchar(255) null,
	currency_id bigint null,
	created_on date null,
	constraint FKhttaf0b7j7kuonhdcul4s9ta5
		foreign key (currency_id) references valuta (id)
);

create table schimb_valutar
(
	id bigint auto_increment
		primary key,
	valuta_id bigint null,
	change_rate varchar(255) null,
	given_sum double not null,
	sent_sum double not null,
	constraint FKign2arxl97awkiptk2noi874f
		foreign key (valuta_id) references valuta (id)
);