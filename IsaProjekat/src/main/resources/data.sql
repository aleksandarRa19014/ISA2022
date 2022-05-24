

INSERT INTO USERS (id, adresa, bodovi, enabled, ime, password,prezime,telefon,username) 
		  VALUES (1234, 'mm35', 0,     true,   'lesa','$2a$10$xVq3oudHCwtdZoIm3bE/KO.sUHOpAq3tXPXP4e5x62j1NK2dMJzG6' ,'lesa','05665445','user@example.com');
INSERT INTO USERS (id, adresa, bodovi, enabled, ime, password,prezime,telefon,username) 
           VALUES (4444, 'sgsg',0,true,'gaga','$2a$10$Z1Uzoh40rGoACDnhK9bQX.u64L9vFj1IugIkfs8vnZ3dL2Oj4a3RO', 'gaga','05154184','gaga@gmail.com');

INSERT INTO ROLES (name) VALUES ('KORISNIK');
INSERT INTO ROLES (name) VALUES ('ADMINISTRATOR');

INSERT INTO USERS_ROLES (user_id, role_id) VALUES (1234, 1); -- user-u dodeljujemo rolu USER
INSERT INTO USERS_ROLES (user_id, role_id) VALUES (4444, 2); -- admin-u dodeljujemo rolu USER



