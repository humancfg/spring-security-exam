-- добавляем категории
insert into category(name)
values ('Юбка');
insert into category(name)
values ('Обувь');


-- добавляем админа
insert into person(login, password, role)
values ('admin', '$2a$10$f9CE1CQ3Lk4P6ipIfPR4Ru9PyglvWiONNaSlV3RuZcJz2swY3krNG', 'ROLE_ADMIN');

--