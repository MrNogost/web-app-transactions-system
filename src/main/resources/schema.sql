CREATE IF NOT EXISTS clients(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY;
	name VARCHAR(35) NOT NULL;
	amount DOUBLE NOT NULL;
);