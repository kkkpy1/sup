-- 계정 생성하기 전, sysdba로 접속한 후 
-- alter session set "_oracle_script"=true;
-- 입력한 후 아래 코드 실행

-- 계정 sup 생성
CREATE USER sup
IDENTIFIED BY sup
DEFAULT tablespace users
TEMPORARY tablespace temp;

ALTER USER SUP
DEFAULT tablespace USERS 
QUOTA UNLIMITED ON users;

GRANT resource, connect TO SUP;
GRANT CREATE TABLE TO SUP;
