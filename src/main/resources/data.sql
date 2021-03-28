insert into company (id, company_name, region, longitude, latitude, company_type, description)
    values(
    1, 'H1', 1, 64.61, 56.31, 1, 'description'
    );
insert into company (id, company_name, region, longitude, latitude, company_type, description)
    values(
    2, 'H2', 2, 65.61, 57.31, 2, 'description2'
    );
insert into company (id, company_name, region, longitude, latitude, company_type, description)
    values(
    3, 'H3', 3, 68.61, 58.31, 3, 'description2'
    );

insert into region (region_id, region_name)
    values(
    1, 'Bukhara'
    );
insert into region (region_id, region_name)
    values(
    2, 'Tashkent'
    );
insert into region (region_id, region_name)
    values(
    3, 'Samarkand'
    );
insert into service (id, service_name, description, price, amount, company_id)
    values(
    1, 'Service1', 'description', 100, 5, 1
    );
insert into service (id, service_name, description, price, amount, company_id)
    values(
    2, 'Service2', 'description2', 1000, 10, 2
    );
insert into service (id, service_name, description, price, amount, company_id)
    values(
    3, 'Service3', 'description3', 10000, 100, 3
    );

REPLACE INTO `role` VALUES (1,'ADMIN');