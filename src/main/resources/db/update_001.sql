create table persons (
                        id serial primary key not null,
                        login varchar(2000),
                        password varchar(2000)
);

insert into person (login, password) values ('paketchino', '123');