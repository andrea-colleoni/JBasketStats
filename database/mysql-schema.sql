
CREATE TABLE document_type (
                id INT AUTO_INCREMENT NOT NULL,
                name VARCHAR(20) NOT NULL,
                description VARCHAR(50) NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE attachment_type (
                id INT AUTO_INCREMENT NOT NULL,
                name VARCHAR(20) NOT NULL,
                description VARCHAR(50) NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE referee_type (
                id INT AUTO_INCREMENT NOT NULL,
                description VARCHAR(50) NOT NULL,
                name VARCHAR(20) NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE phase (
                id INT AUTO_INCREMENT NOT NULL,
                name VARCHAR(20) NOT NULL,
                description VARCHAR(50) NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE location_type (
                id INT AUTO_INCREMENT NOT NULL,
                name VARCHAR(20) NOT NULL,
                description VARCHAR(50) NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE player_score_type (
                id INT AUTO_INCREMENT NOT NULL,
                name VARCHAR(20) NOT NULL,
                description VARCHAR(50) NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE period_type (
                id INT AUTO_INCREMENT NOT NULL,
                name VARCHAR(20) NOT NULL,
                description VARCHAR(50) NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE key_type (
                id INT AUTO_INCREMENT NOT NULL,
                name VARCHAR(20) NOT NULL,
                description VARCHAR(50) NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE role_type (
                id INT AUTO_INCREMENT NOT NULL,
                name VARCHAR(20) NOT NULL,
                description VARCHAR(50) NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE role (
                id INT AUTO_INCREMENT NOT NULL,
                role_type_id INT NOT NULL,
                name VARCHAR(20) NOT NULL,
                description VARCHAR(50) NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE tenant (
                id INT AUTO_INCREMENT NOT NULL,
                name VARCHAR(50) DEFAULT '' NOT NULL,
                description VARCHAR(200),
                site_admin TINYINT,
                PRIMARY KEY (id)
);


CREATE TABLE location (
                id INT NOT NULL,
                tenant_id INT NOT NULL,
                name VARCHAR(20) NOT NULL,
                description VARCHAR(50) NOT NULL,
                location_type_id INT NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE season (
                id INT NOT NULL,
                tenant_id INT NOT NULL,
                start_year VARCHAR(20) NOT NULL,
                end_year VARCHAR(20) NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE organization (
                id INT AUTO_INCREMENT NOT NULL,
                tenant_id INT NOT NULL,
                name VARCHAR(20) NOT NULL,
                description VARCHAR(50) NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE organization_location (
                location_id INT NOT NULL,
                organization_id INT NOT NULL,
                PRIMARY KEY (location_id, organization_id)
);


CREATE TABLE team (
                id INT AUTO_INCREMENT NOT NULL,
                organization_id INT NOT NULL,
                name VARCHAR(20) NOT NULL,
                description VARCHAR(50) NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE championship (
                id INT NOT NULL,
                tenant_id INT NOT NULL,
                season_id INT NOT NULL,
                division VARCHAR(50) NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE team_campionship (
                team_id INT NOT NULL,
                championship_id INT NOT NULL,
                PRIMARY KEY (team_id, championship_id)
);


CREATE TABLE gropuage (
                id INT NOT NULL,
                championship_id INT NOT NULL,
                name VARCHAR(20) NOT NULL,
                description VARCHAR(50) NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE game (
                id INT NOT NULL,
                phase_id INT NOT NULL,
                groupage_id INT NOT NULL,
                home_team INT NOT NULL,
                visitor_team INT NOT NULL,
                match_date DATE NOT NULL,
                round VARCHAR(10) NOT NULL,
                location_id INT NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE period_score (
                id INT AUTO_INCREMENT NOT NULL,
                period_type_id INT NOT NULL,
                game_id INT NOT NULL,
                home_score INT NOT NULL,
                visitor_score INT NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE person (
                id INT NOT NULL,
                tenant_id INT NOT NULL,
                name VARCHAR(30) NOT NULL,
                surname VARCHAR(30) NOT NULL,
                fullname VARCHAR(30) NOT NULL,
                nick VARCHAR(30) NOT NULL,
                bio TEXT NOT NULL,
                email VARCHAR(100) NOT NULL,
                phone_number VARCHAR(20) NOT NULL,
                document_id VARCHAR(30) NOT NULL,
                document_type_id INT NOT NULL,
                birth_date DATE NOT NULL,
                birth_place VARCHAR(50) NOT NULL,
                address VARCHAR(100) NOT NULL,
                city VARCHAR(50) NOT NULL,
                zipcode VARCHAR(10) NOT NULL,
                country VARCHAR(30) NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE referee (
                id INT NOT NULL,
                person_id INT NOT NULL,
                game_id INT NOT NULL,
                referee_type_id INT NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE medical_review (
                id INT NOT NULL,
                review_date DATE NOT NULL,
                review_expiry_date DATE NOT NULL,
                organization_id INT NOT NULL,
                person_id INT NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE member (
                id INT AUTO_INCREMENT NOT NULL,
                person_id INT NOT NULL,
                team_id INT NOT NULL,
                card_number VARCHAR(40) NOT NULL,
                shirt_number VARCHAR(10) NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE member_role (
                member_id INT NOT NULL,
                role_id INT NOT NULL,
                PRIMARY KEY (member_id, role_id)
);


CREATE TABLE attachment (
                id INT NOT NULL,
                name VARCHAR(20) NOT NULL,
                description VARCHAR(50) NOT NULL,
                game_id INT NOT NULL,
                mime_type VARCHAR(50) NOT NULL,
                content BINARY NOT NULL,
                attachment_type_id INT NOT NULL,
                member_id INT NOT NULL,
                organization_id INT NOT NULL,
                team_id INT NOT NULL,
                person_id INT NOT NULL,
                creation_date DATE NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE injury (
                id INT NOT NULL,
                description VARCHAR(50) NOT NULL,
                member_id INT NOT NULL,
                injury_expiry_date DATE NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE player_score (
                id INT NOT NULL,
                game_id INT NOT NULL,
                member_id INT NOT NULL,
                player_score_type_id INT NOT NULL,
                checked TINYINT NOT NULL,
                grade DECIMAL NOT NULL,
                goals INT NOT NULL,
                attempts INT NOT NULL,
                notes TEXT NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE user (
                id INT AUTO_INCREMENT NOT NULL,
                tenant_id INT NOT NULL,
                username VARCHAR(30) NOT NULL,
                password VARCHAR(30) NOT NULL,
                active TINYINT DEFAULT 1 NOT NULL,
                subscription_date DATE NOT NULL,
                tenant_admin TINYINT DEFAULT 0 NOT NULL,
                PRIMARY KEY (id)
);


CREATE TABLE user_person (
                user_id INT NOT NULL,
                person_id INT NOT NULL,
                PRIMARY KEY (user_id, person_id)
);


CREATE TABLE activation_key (
                id INT AUTO_INCREMENT NOT NULL,
                start_date DATE NOT NULL,
                end_date DATE NOT NULL,
                key_content BINARY NOT NULL,
                tenant_id INT NOT NULL,
                key_type_id INT NOT NULL,
                PRIMARY KEY (id)
);


ALTER TABLE person ADD CONSTRAINT document_type_person_fk
FOREIGN KEY (document_type_id)
REFERENCES document_type (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE attachment ADD CONSTRAINT match_attachment_type_match_attachment_fk
FOREIGN KEY (attachment_type_id)
REFERENCES attachment_type (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE referee ADD CONSTRAINT referee_type_referee_fk
FOREIGN KEY (referee_type_id)
REFERENCES referee_type (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE game ADD CONSTRAINT phase_match_1_fk
FOREIGN KEY (phase_id)
REFERENCES phase (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE location ADD CONSTRAINT location_type_location_fk
FOREIGN KEY (location_type_id)
REFERENCES location_type (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE player_score ADD CONSTRAINT player_score_type_player_score_fk
FOREIGN KEY (player_score_type_id)
REFERENCES player_score_type (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE period_score ADD CONSTRAINT period_type_period_score_fk
FOREIGN KEY (period_type_id)
REFERENCES period_type (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE activation_key ADD CONSTRAINT key_type_activation_key_fk
FOREIGN KEY (key_type_id)
REFERENCES key_type (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE role ADD CONSTRAINT role_type_role_fk
FOREIGN KEY (role_type_id)
REFERENCES role_type (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE member_role ADD CONSTRAINT role_member_role_fk
FOREIGN KEY (role_id)
REFERENCES role (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE activation_key ADD CONSTRAINT tenant_activation_key_fk
FOREIGN KEY (tenant_id)
REFERENCES tenant (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE user ADD CONSTRAINT tenant_user_fk
FOREIGN KEY (tenant_id)
REFERENCES tenant (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE person ADD CONSTRAINT tenant_person_fk
FOREIGN KEY (tenant_id)
REFERENCES tenant (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE championship ADD CONSTRAINT tenant_championship_fk
FOREIGN KEY (tenant_id)
REFERENCES tenant (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE organization ADD CONSTRAINT tenant_organization_fk
FOREIGN KEY (tenant_id)
REFERENCES tenant (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE season ADD CONSTRAINT tenant_season_fk
FOREIGN KEY (tenant_id)
REFERENCES tenant (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE location ADD CONSTRAINT tenant_location_fk
FOREIGN KEY (tenant_id)
REFERENCES tenant (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE organization_location ADD CONSTRAINT location_organization_location_fk
FOREIGN KEY (location_id)
REFERENCES location (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE game ADD CONSTRAINT location_game_fk
FOREIGN KEY (location_id)
REFERENCES location (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE championship ADD CONSTRAINT season_championship_fk
FOREIGN KEY (season_id)
REFERENCES season (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE team ADD CONSTRAINT organization_team_fk
FOREIGN KEY (organization_id)
REFERENCES organization (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE organization_location ADD CONSTRAINT organization_organization_location_fk
FOREIGN KEY (organization_id)
REFERENCES organization (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE medical_review ADD CONSTRAINT organization_medical_review_fk
FOREIGN KEY (organization_id)
REFERENCES organization (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE attachment ADD CONSTRAINT organization_attachment_fk
FOREIGN KEY (organization_id)
REFERENCES organization (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE member ADD CONSTRAINT team_member_fk
FOREIGN KEY (team_id)
REFERENCES team (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE game ADD CONSTRAINT team_match_fk
FOREIGN KEY (home_team)
REFERENCES team (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE game ADD CONSTRAINT team_match_fk1
FOREIGN KEY (visitor_team)
REFERENCES team (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE attachment ADD CONSTRAINT team_attachment_fk
FOREIGN KEY (team_id)
REFERENCES team (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE team_campionship ADD CONSTRAINT team_team_campionship_fk
FOREIGN KEY (team_id)
REFERENCES team (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE gropuage ADD CONSTRAINT championship_gropuage_fk
FOREIGN KEY (championship_id)
REFERENCES championship (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE team_campionship ADD CONSTRAINT championship_team_campionship_fk
FOREIGN KEY (championship_id)
REFERENCES championship (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE game ADD CONSTRAINT gropuage_game_fk
FOREIGN KEY (groupage_id)
REFERENCES gropuage (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE player_score ADD CONSTRAINT match_score_fk
FOREIGN KEY (game_id)
REFERENCES game (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE period_score ADD CONSTRAINT match_1_period_score_fk
FOREIGN KEY (game_id)
REFERENCES game (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE referee ADD CONSTRAINT match_1_referee_fk
FOREIGN KEY (game_id)
REFERENCES game (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE attachment ADD CONSTRAINT match_1_match_attachment_fk
FOREIGN KEY (game_id)
REFERENCES game (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE member ADD CONSTRAINT person_member_fk
FOREIGN KEY (person_id)
REFERENCES person (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE medical_review ADD CONSTRAINT person_medical_review_fk
FOREIGN KEY (person_id)
REFERENCES person (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE referee ADD CONSTRAINT person_referee_fk
FOREIGN KEY (person_id)
REFERENCES person (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE attachment ADD CONSTRAINT person_attachment_fk
FOREIGN KEY (person_id)
REFERENCES person (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE user_person ADD CONSTRAINT person_user_person_fk
FOREIGN KEY (person_id)
REFERENCES person (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE player_score ADD CONSTRAINT member_score_fk
FOREIGN KEY (member_id)
REFERENCES member (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE injury ADD CONSTRAINT member_injury_fk
FOREIGN KEY (member_id)
REFERENCES member (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE attachment ADD CONSTRAINT member_attachment_fk
FOREIGN KEY (member_id)
REFERENCES member (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE member_role ADD CONSTRAINT member_member_role_fk
FOREIGN KEY (member_id)
REFERENCES member (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;

ALTER TABLE user_person ADD CONSTRAINT user_user_person_fk
FOREIGN KEY (user_id)
REFERENCES user (id)
ON DELETE NO ACTION
ON UPDATE NO ACTION;
