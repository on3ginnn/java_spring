create table books(
id serial primary key,
title varchar(30) not null,
author varchar(30) not null,
date_added  timestamp not null
);

commit;

insert into public.books (title, author, date_added)
values('Недоросль', 'Д.И. Фонвизин', now());
insert into public.books (title, author, date_added)
values('Потерянный рай', 'Д. Мильтон', now() - interval '24h');
insert into public.books (title, author, date_added)
values ('Братья Карамазовы', 'Ф.М. Достоевский', now() - interval '24h')

select * from books

select * from books where id = 1
select * from books where id = 3