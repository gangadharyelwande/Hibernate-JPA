insert into course(id, name) 
values(10001,'JPA in 50 Steps');
insert into course(id, name) 
values(10002,'Spring in 50 Steps');
insert into course(id, name) 
values(10003,'Spring Boot in 100 Steps');

insert into passport(id,number)
values(40001,'E123456');
insert into passport(id,number)
values(40002,'N123457');
insert into passport(id,number)
values(40003,'L123890');

insert into student(id,name,passport_id)
values(20001,'Ganga',40001);
insert into student(id,name,passport_id)
values(20002,'Jackie',40002);
insert into student(id,name,passport_id)
values(20003,'Drew',40003);

insert into review(id,rating,description,course_id)
values(50001,'5', 'Great Course',10001);
insert into review(id,rating,description,course_id)
values(50002,'4', 'Wonderful Course',10001);
insert into review(id,rating,description,course_id)
values(50003,'5', 'Awesome Course',10003);
