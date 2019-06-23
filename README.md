# �Tag Cloud� im Projekt Management (Thema Nr. 16)

**Gruppe 13**

Autoren: nussbluk, furterap, griglfab, degiosim

Abgabedatum: 23.06.2019

Dieses Projekt entstand im Rahmen des Moduls **Integration (2019-FS)** an der ZHAW School of Management and Law.

In diesem Dokument wird die Installation dieses Github-Projekts Schritt-f�r-Schritt erkl�rt. **Die in dieser Anleitung beschriebenen Installationen und Konfigurationen sind voraussetzung f�r das Ausf�hren der Webapplikation.**

## Inhaltsverzeichnis
* [Installation Eclipse IDE](#installation-eclipse-ide)
* [Installation MariaDB](#installation-mariadb)
* [Installation HeidiSQL](#installation-heidisql)
	+ [Konfiguration HeidiSQL](#konfiguration-heidisql)
	+ [Nutzung HeidiSQL](#nutzung-heidisql)
* [Importieren des Github-Projekts in Eclipse](#importieren-des-github-projekts-in-eclipse)
	+ [Vorhandenes Github-Konto](#vorhandenes-github-konto)
	+ [Kein vorhandenes Github-Konto](#kein-vorhandenes-github-konto)
* [Nutzung der Tag Cloud Webapplikation](#nutzung-der-tag-cloud-webapplikation)



## Installation Eclipse IDE
> Um Eclipse f�r Java zu nutzen, m�ssen Sie das Java Development Kit (JDK) installiert haben ([Downloadlink Java SE Development Kit 12](https://www.oracle.com/technetwork/java/javase/downloads/jdk12-downloads-5295953.html)).

> Es wird kein Support f�r andere Entwicklungsumgebungen oder Programmierwerkzeugen ausser Eclipse gew�hrleistet.

1. Laden Sie Eclipse IDE herunter [Downloadlink Eclipse IDE](https://www.eclipse.org/downloads)
2. Starten Sie die Installationsdatei
3. W�hlen Sie Eclipse IDE for Java Developers
4. Klicken Sie auf Install


## Installation MariaDB
> Um das Projekt laufen zu lassen, ben�tigen Sie MariaDB auf Ihrem Rechner.

1. Laden Sie MariaDB herunter [Downloadlink MariaDB](https://downloads.mariadb.org/) (Beispielsweise das MSI Package f�r Windows f�r eine einfache Installation)
2. Starten Sie die Installationsdatei
3. License Agreement akzepiteren, Next
4. Custom Setup mit Standardeinstellungen, Next
5. Entfernen Sie den Hacken bei *Modify password for database user 'root'* und lassen Sie das Passwort-Feld leer
6. �bernehmen Sie die Standardeinstellungen f�r Service Name, TCP port etc. und fahren Sie mit Next fort
7. Next, Sie m�ssen das Feedback plugin nicht aktivieren
8. Install

## Installation HeidiSQL
> HeidiSQL erm�glicht den direkten Zugriff auf die Datenbank.

1. Laden Sie die Installationsdatei herunter [Downloadlink HeidiSQL](https://www.heidisql.com/download.php) (Sie ben�tigenden *Installer, 32/64 bit combinded*)
2. Starten Sie die Installationsdatei
3. AkzeptierenSie die Lizenzvereinbarung, Weiter
4. �bernehmen Sie die Standardeinstellungen, Weiter
5. Installieren

### Konfiguration HeidiSQL
> Wenn Sie bei der Installation von MariaDB eine von dieser Anleitung abweichende Konfiguration gew�hlt haben (z.B. root Passwort oder Port), m�ssen Sie dies beim Verbindungsaufbau mit HeidiSQL ber�cksichtigen. 

1. Starten Sie HeidiSQL
2. Verbindung mit lokaler Datenbank aufbauen
	1. �berpr�fen Sie die Standardeinstellungen
		1. Verbindungstyp: MariaDB or MySQL (TCP/IP)
		2. Hostname / IP: 127.0.0.1
		3. Benutzername: root
		4. Passwort: *leer lassen*
		5. Port: 3306
	2. �ffnen

> Der folgende Abschnitt ist nur einmalig n�tig. Da die Datenbank nicht �ber Github synchronisiert wird, m�ssen Sie auf Ihrem PC eine lokale Datenbank f�r die Tag Cloud erstellen.

1. Starten Sie HeidiSQL
2. Wechseln Sie zum Reiter *Abfrage* (alternativ *Datei* --> *Neuer Query Tab*)
3. Geben Sie folgenden Befehl ein: `CREATE DATABASE tagcloud /*!40100 COLLATE 'utf8_bin' */;`
4. Klicken Sie in der Werkzeugleiste auf den blauen Pfeil (SQL ausf�hren) bzw. F9

### Nutzung HeidiSQL
	
> Die Datenbank *tagcloud* sollte nun in HeidiSQL auf der linken Seite sichtbar sein.
 
> Wenn die Datenbank noch keinen Inhalt hat, m�ssen Sie das Github Projekt zuerst laufen lassen (Siehe Kapitel [Nutzung der Tag Cloud Webapplikation](#nutzung-der-tag-cloud-webapplikation)).

1. Starten Sie HeidiSQL
2. Verbindung aufbauen
3. Aktualisieren Sie die Liste mit den Datenbanken und die Datenbank *tagcloud* mit F5 oder Rechtsklick
4. Klappen Sie die Datenbank *tagcloud* auf und Klicken Sie auf die Tabellen der tagcloud-Datenbank und sehen Sie unter dem Reiter *Daten* den Inhalt der Tabellen


## Importieren des Github-Projekts in Eclipse
### Vorhandenes Github-Konto
> Falls Sie kein Github-Konto haben, gehen Sie zum n�chsten Unterkapitel.

1. �ffnen Sie das Github-Repository unter https://github.com/zhaw-degiosim/Integration
2. Klicken Sie auf *Clone or download*
3. Kopieren Sie den Link
4. �ffnen Sie Eclipse
5. Navigieren Sie zu *File* --> *Import*
6. W�hlen Sie *Git* --> *Projects from Git*
7. W�hlen Sie *Clone URI*
8. �berpr�fen Sie die Informationen
	1. URI: https://github.com/zhaw-degiosim/Integration.git (Dateiendung **.git** an dieser Stelle beachten) 
	2. Host: github.com
	3. Repository path: /zhaw-degiosim/Integration.git
	4. Protocol: https
9. Geben Sie Ihren Github-Benutzernamen und Ihr Passwort ein und fahren Sie mit Next fort
10. Import existing Eclipse projects
11. Finish

### Kein vorhandenes Github-Konto
1. �ffnen Sie das Github-Repository unter https://github.com/zhaw-degiosim/Integration
2. Klicken Sie auf *Clone or download*
3. Klicken Sie auf *Download ZIP*
4. Speichern Sie die ZIP-Datei an einem sicheren Ort
5. Entpacken Sie die ZIP-Datei
6. �ffnen Sie Eclipse
7. Navigieren Sie zu *File* --> *Open Projects from File System*
8. Neben *Import Source* klicken Sie auf *Directory*
9. W�hlen Sie den entpackten Ordner aus
10. Finish

## Nutzung der Tag Cloud Webapplikation
1. Klicken Sie mit der Maus auf die oberste Ebene des Projekts im Package Explorer (*Integration* oder *tag-cloud*)
2. Rechtsklick auf *Integration* (bzw. *tag-cloud*)
3. Run --> Run As --> Spring Boot App
4. Warten Sie bis die Applikation gestartet ist
5. Starten Sie einen Webbrowser und geben Sie *http://localhost:8080* in die Adresszeile
6. Um die Tag Cloud zu nutzen, m�ssen Sie sich einloggen
7. Melden Sie sich entweder mit der E-Mail *admin@tagcloud.ch* und dem Passwort *admin* an, oder mit dem Testbenutzer *test@tagcloud.ch* und *test*
8. Nun k�nnen Sie die Weboberfl�che nutzen
