service mysql start
mysql -u root -p root

CREATE DATABASE clientmanager;

CREATE TABLE clientmanager.clients (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(255) NOT NULL,
  telephone VARCHAR(18) NOT NULL,
  email VARCHAR(50) NOT NULL,
  PRIMARY KEY (id)
);

INSERT INTO clientmanager.clients (name, telephone, email) VALUES ('Jack', '1234567', 'Jack@gmail.com');
INSERT INTO clientmanager.clients (name, telephone, email) VALUES ('Kate', '5678901', 'Kate@gmail.com');
INSERT INTO clientmanager.clients (name, telephone, email) VALUES ('Mike', '0000000', 'Mike@gmail.com');
INSERT INTO clientmanager.clients (name, telephone, email) VALUES ('Sam', '9876543', 'Sam@gmail.com');
INSERT INTO clientmanager.clients (name, telephone, email) VALUES ('Jessi', '8686868', 'Jessi@gmail.com');