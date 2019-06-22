# „Tag Cloud“ im Projekt Management (Thema Nr. 16)

**Gruppe 13**

> Autoren: nussbluk, furterap, griglfab, degiosim

> Abgabedatum: 23.06.2019

Dieses Projekt entstand im Rahmen des Moduls **Integration (2019-FS)** an der ZHAW School of Management and Law.

In diesem Dokument wird die Installation dieses Github-Projekts Schritt-für-Schritt erklärt.

## Inhaltsverzeichnis
* [Installation Eclipse IDE](#installation-eclipse-ide)
* [Installation MariaDB](#installation-mariadb)
* [Installation HeidiSQL](#installation-heidisql)
* [Hinzufügen des Github-Projekts in Eclipse](#hinzufügen-des-github-projekts-in-eclipse)
* [Nutzung der Tag Cloud Webapplikation](#nutzung-der-tag-cloud-webapplikation)



## Installation Eclipse IDE
> Um Eclipse für Java zu nutzen, müssen Sie das Java Development Kit (JDK) installiert haben.[Downloadlink Java SE Development Kit 12](https://www.oracle.com/technetwork/java/javase/downloads/jdk12-downloads-5295953.html)

Sie benötigen Eclipse IDE for Java Developers auf Ihrem Rechner. Falls Sie das Programm nicht installiert haben, können Sie es hier [Downloadlink Eclipse IDE](https://www.eclipse.org/downloads) herunterladen.

1. Starten Sie die Installationsdatei
2. Wählen Sie Eclipse IDE for Java Developers
3. Klicken Sie auf Install


## Installation MariaDB
> Um das Projekt laufen zu lassen, benötigen Sie MariaDB auf Ihrem Rechner.

1. Laden Sie MariaDB herunter [Downloadlink MariaDB](https://downloads.mariadb.org/) (Beispielsweise das MSI Package für Windows für eine einfache Installation)
2. Starten Sie die Installationsdatei
3. Next
4. License Agreement akzepiteren, Next
5. Custom Setup mit Standardeinstellungen, Next
6. Entfernen Sie den Hacken bei *Modify password for database user 'root'* und lassen Sie das Passwort-Feld leer
7. Next
8. Übernehmen Sie die Standardeinstellungen für Service Name, TCP port etc. und fahren Sie mit Next fort.
9. Next, Sie müssen das Feedback plugin nicht aktivieren.
10. Install

## Installation HeidiSQL
> HeidiSQL ermöglicht direkten Zugriff auf die Datenbank. Es ist keine Vorausseztung für das Ausführen der Tag Cloud. Wenn Sie die Datenbank hinter der Weboberfläche begutachten wollen, installieren Sie HeidiSQL

1. Laden Sie die Installationsdatei herunter [Downloadlink HeidiSQL](https://www.heidisql.com/download.php) (Sie benötigenden Installer, 32/64 bit combinded)
2. Starten Sie die Installationsdatei
3. AkzeptierenSie die Lizenzvereinbarung, Weiter
4. Übernehmen Sie die Standardeinstellung, Weiter
5. Installieren

## Hinzufügen des Github-Projekts in Eclipse
1. Starten Sie Eclipse
2. 

## Nutzung der Tag Cloud Webapplikation
1. Klicken Sie mit der Maus auf die oberste Ebene des Projekts im Package Explorer (*Integration* oder *X*)
2. Rechtsklick auf *Integration* (bzw. *X*)
3. Run --> Run As --> Spring Boot App
4. Warten Sie bis die Applikation gestartet ist
5. Starten Sie einen Webbrowser und geben Sie *http://localhost:8080* in die Adresszeile
6. Um die Tag Cloud zu nutzen, müssen Sie sich einloggen
7. Melden Sie sich entweder mit der E-Mail *admin@tagcloud.ch* und dem Passwort *admin* an, oder mit dem Testbenutzer *test@tagcloud.ch* und *test*
8. Nun können Sie die Weboberfläche nutzen
