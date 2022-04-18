INSERT INTO ROL (DESCRIPTION) VALUES ('ADMINISTRATOR');
INSERT INTO ROL (DESCRIPTION) VALUES ('USER');

--INSERT INTO USERS (EMAIL, PASSWORD, ROL) VALUES ('avesousapersonal@gmail.com', 'secreti109', 1);

-- TYPES OF TRANSACTION
INSERT INTO TYPE_TRANSACTION (DESCRIPTION) VALUES('CARGA_POS');
INSERT INTO TYPE_TRANSACTION (DESCRIPTION) VALUES('COMPRA_PESOS');
INSERT INTO TYPE_TRANSACTION (DESCRIPTION) VALUES('COMPRA_OTRA_MONEDA');
INSERT INTO TYPE_TRANSACTION (DESCRIPTION) VALUES('RETIRO_WEB');

-- TYPE OF CLIENT
INSERT INTO TYPE_CLIENT (DESCRIPTION) VALUES('Cliente 1');
INSERT INTO TYPE_CLIENT (DESCRIPTION) VALUES('Cliente 2');
INSERT INTO TYPE_CLIENT (DESCRIPTION) VALUES('Cliente 3');
INSERT INTO TYPE_CLIENT (DESCRIPTION) VALUES('Cliente 4');
INSERT INTO TYPE_CLIENT (DESCRIPTION) VALUES('Cliente 5');
INSERT INTO TYPE_CLIENT (DESCRIPTION) VALUES('Cliente 6');
INSERT INTO TYPE_CLIENT (DESCRIPTION) VALUES('Cliente 7');
INSERT INTO TYPE_CLIENT (DESCRIPTION) VALUES('Cliente 8');
INSERT INTO TYPE_CLIENT (DESCRIPTION) VALUES('Cliente 9');
INSERT INTO TYPE_CLIENT (DESCRIPTION) VALUES('Cliente 10');
INSERT INTO TYPE_CLIENT (DESCRIPTION) VALUES('Cliente 11');
INSERT INTO TYPE_CLIENT (DESCRIPTION) VALUES('Cliente 12');
INSERT INTO TYPE_CLIENT (DESCRIPTION) VALUES('Cliente 13');
INSERT INTO TYPE_CLIENT (DESCRIPTION) VALUES('Cliente 14');
INSERT INTO TYPE_CLIENT (DESCRIPTION) VALUES('Cliente 15');
INSERT INTO TYPE_CLIENT (DESCRIPTION) VALUES('Cliente 16');
INSERT INTO TYPE_CLIENT (DESCRIPTION) VALUES('Cliente 17');
INSERT INTO TYPE_CLIENT (DESCRIPTION) VALUES('Cliente 18');
INSERT INTO TYPE_CLIENT (DESCRIPTION) VALUES('Cliente 19');
INSERT INTO TYPE_CLIENT (DESCRIPTION) VALUES('Cliente 20');
INSERT INTO TYPE_CLIENT (DESCRIPTION) VALUES('Cliente 21');
INSERT INTO TYPE_CLIENT (DESCRIPTION) VALUES('Cliente 22');
INSERT INTO TYPE_CLIENT (DESCRIPTION) VALUES('Cliente 23');

-- TRANSACTION
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (661,6800,7000,0,200,0,PARSEDATETIME('23/10/2019 11:06', 'dd/MM/yyyy hh:mm'),PARSEDATETIME('25/10/2019 05:00', 'dd/MM/yyyy hh:mm'), 0, 'TRX_PREPAGO_20191025.CSV', 1, 1);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (652,6800,7000,0,200,0,PARSEDATETIME('23/10/2019 11:05', 'dd/MM/yyyy hh:mm'),PARSEDATETIME('25/10/2019 05:00', 'dd/MM/yyyy hh:mm'), 0, 'TRX_PREPAGO_20191025.CSV', 1, 2);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (655,6800,7000,0,200,0,PARSEDATETIME('23/10/2019 11:07', 'dd/MM/yyyy hh:mm'),PARSEDATETIME('25/10/2019 05:00', 'dd/MM/yyyy hh:mm'), 0, 'TRX_PREPAGO_20191025.CSV', 1, 3);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (653,743,0,728,0,15,PARSEDATETIME('23/10/2019 18:09', 'dd/MM/yyyy hh:mm'), NULL, 0, 'TRX_PREPAGO_20191025.CSV', 2, 3);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (658,743,0,728,0,15,PARSEDATETIME('24/10/2019 03:10', 'dd/MM/yyyy hh:mm'),NULL, 0, 'TRX_PREPAGO_20191025.CSV', 2, 3);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (659,6800,7000,0,200,0,PARSEDATETIME('23/10/2019 11:04', 'dd/MM/yyyy hh:mm'),PARSEDATETIME('25/10/2019 05:00', 'dd/MM/yyyy hh:mm'), 0, 'TRX_PREPAGO_20191025.CSV', 1, 4);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (657,6800,7000,0,200,0,PARSEDATETIME('23/10/2019 11:03', 'dd/MM/yyyy hh:mm'),PARSEDATETIME('25/10/2019 05:00', 'dd/MM/yyyy hh:mm'), 0, 'TRX_PREPAGO_20191025.CSV', 1, 5);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (660,6800,7000,0,200,0,PARSEDATETIME('23/10/2019 10:59', 'dd/MM/yyyy hh:mm'),PARSEDATETIME('25/10/2019 05:00', 'dd/MM/yyyy hh:mm'), 0, 'TRX_PREPAGO_20191025.CSV', 1, 6);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (654,6800,7000,0,200,0,PARSEDATETIME('23/10/2019 11:08', 'dd/MM/yyyy hh:mm'),PARSEDATETIME('25/10/2019 05:00', 'dd/MM/yyyy hh:mm'), 0, 'TRX_PREPAGO_20191025.CSV', 1, 7);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (662,7000,7000,0,0,0,PARSEDATETIME('23/10/2019 11:03', 'dd/MM/yyyy hh:mm'),PARSEDATETIME('25/10/2019 05:00', 'dd/MM/yyyy hh:mm'), 0, 'TRX_PREPAGO_20191025.CSV', 1, 8);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (656,6800,7000,0,200,0,PARSEDATETIME('23/10/2019 11:05', 'dd/MM/yyyy hh:mm'),PARSEDATETIME('25/10/2019 05:00', 'dd/MM/yyyy hh:mm'), 0, 'TRX_PREPAGO_20191025.CSV', 1, 9);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (664,8883,0,8709,0,0,PARSEDATETIME('24/10/2019 13:04', 'dd/MM/yyyy hh:mm'),NULL, 174, 'TRX_PREPAGO_20191025.CSV', 3, 10);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (667,7000,7000,0,0,0,PARSEDATETIME('23/10/2019 11:04', 'dd/MM/yyyy hh:mm'),PARSEDATETIME('25/10/2019 05:00', 'dd/MM/yyyy hh:mm'), 0, 'TRX_PREPAGO_20191025.CSV', 1, 11);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (668,547,0,536,0,0,PARSEDATETIME('23/10/2019 14:45', 'dd/MM/yyyy hh:mm'),PARSEDATETIME('25/10/2019 2:59', 'dd/MM/yyyy hh:mm'), 11, 'TRX_PREPAGO_20191025.CSV', 3, 12);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (666,738,0,724,0,0,PARSEDATETIME('23/10/2019 14:44', 'dd/MM/yyyy hh:mm'),NULL, 14, 'TRX_PREPAGO_20191025.CSV', 3, 12);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (670,7000,7000,0,0,0,PARSEDATETIME('23/10/2019 10:59', 'dd/MM/yyyy hh:mm'),PARSEDATETIME('25/10/2019 05:00', 'dd/MM/yyyy hh:mm'), 0, 'TRX_PREPAGO_20191025.CSV', 1, 13);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (671,7000,7000,0,0,0,PARSEDATETIME('23/10/2019 11:00', 'dd/MM/yyyy hh:mm'),PARSEDATETIME('25/10/2019 05:00', 'dd/MM/yyyy hh:mm'), 0, 'TRX_PREPAGO_20191025.CSV', 1, 14);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (680,1000,0,1000,0,0,PARSEDATETIME('25/10/2019 14:47', 'dd/MM/yyyy hh:mm'),NULL, 0, 'TRX_PREPAGO_20191026.CSV', 4, 1);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (672,6800,7000,0,200,0,PARSEDATETIME('25/10/2019 10:09', 'dd/MM/yyyy hh:mm'),PARSEDATETIME('26/10/2019 05:00', 'dd/MM/yyyy hh:mm'), 0, 'TRX_PREPAGO_20191026.CSV', 1, 15);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (673,7000,7000,0,0,0,PARSEDATETIME('25/10/2019 10:11', 'dd/MM/yyyy hh:mm'),PARSEDATETIME('26/10/2019 05:00', 'dd/MM/yyyy hh:mm'), 0, 'TRX_PREPAGO_20191026.CSV', 1, 16);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (674,6800,7000,0,200,0,PARSEDATETIME('25/10/2019 10:11', 'dd/MM/yyyy hh:mm'),PARSEDATETIME('26/10/2019 05:00', 'dd/MM/yyyy hh:mm'), 0, 'TRX_PREPAGO_20191026.CSV', 1, 17);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (678,6800,7000,0,200,0,PARSEDATETIME('25/10/2019 10:14', 'dd/MM/yyyy hh:mm'),PARSEDATETIME('26/10/2019 05:00', 'dd/MM/yyyy hh:mm'), 0, 'TRX_PREPAGO_20191026.CSV', 1, 18);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (675,7000,7000,0,0,0,PARSEDATETIME('25/10/2019 10:12', 'dd/MM/yyyy hh:mm'),PARSEDATETIME('26/10/2019 05:00', 'dd/MM/yyyy hh:mm'), 0, 'TRX_PREPAGO_20191026.CSV', 1, 19);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (681,1000,0,1000,0,0,PARSEDATETIME('25/10/2019 15:03', 'dd/MM/yyyy hh:mm'),NULL, 0, 'TRX_PREPAGO_20191026.CSV', 4, 5);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (669,2926,0,2869,0,0,PARSEDATETIME('25/10/2019 00:48', 'dd/MM/yyyy hh:mm'),NULL, 57, 'TRX_PREPAGO_20191026.CSV', 3, 20);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (676,6800,7000,0,200,0,PARSEDATETIME('25/10/2019 10:13', 'dd/MM/yyyy hh:mm'),PARSEDATETIME('26/10/2019 05:00', 'dd/MM/yyyy hh:mm'), 0, 'TRX_PREPAGO_20191026.CSV', 1, 21);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (677,7000,7000,0,0,0,PARSEDATETIME('25/10/2019 10:14', 'dd/MM/yyyy hh:mm'),PARSEDATETIME('26/10/2019 05:00', 'dd/MM/yyyy hh:mm'), 0, 'TRX_PREPAGO_20191026.CSV', 1, 22);
INSERT INTO TRANSACTION (ID,AMOUNT_BALANCE, AMOUNT_ENTRY, AMOUNT_LOSS, COMMISSION_COLLECTOR, COMMISSION_PRE_PAID, DATE, DATE_CONCILIATION, DIF_TYPE_EXCHANGE, FILE_NAME, TYPE_ID, TYPE_CLIENT_ID) VALUES (679,7000,7000,0,0,0,PARSEDATETIME('25/10/2019 10:16', 'dd/MM/yyyy hh:mm'),PARSEDATETIME('26/10/2019 05:00', 'dd/MM/yyyy hh:mm'), 0, 'TRX_PREPAGO_20191026.CSV', 1, 23);