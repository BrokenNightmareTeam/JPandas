[![Build Status](https://travis-ci.org/BrokenNightmareTeam/JPandas.svg?branch=master)](https://travis-ci.org/BrokenNightmareTeam/JPandas)
[![Coverage Status](https://coveralls.io/repos/github/BrokenNightmareTeam/JPandas/badge.svg)](https://coveralls.io/github/BrokenNightmareTeam/JPandas)


# JPandas

JPandas est une librairie Java d'analyse de données inspiré de la librairie Python pandas.

## Fonctionnalités
 
#### Création d'un DataFrame :
  * A partir d’un constructeur prenant en paramètre le contenu de chaque colonne sous forme d’une d'un tableau et une liste de nom de colonnes.
  * A partir d’un constructeur prenant en paramètre le contenu de chaque colonne sous forme d’une d'une liste et une liste de nom de colonnes.
  * A partir d’un constructeur prenant en paramètre le nom d’un fichier CSV. Le format et le type des données pour chaque colonne est déduit en parsant le fichier CSV.
  * A partir d’un constructeur prenant en paramètre un objet File. Le format et le type des données pour chaque colonne est déduit en parsant le fichier CSV.
  
#### Affichage
 * Afficher tout le dataframe.
 * Afficher un sous-ensemble du dataframe avec en paramètre deux indices de ligne (1ere et dernière (non inclus) ligne) et une liste de noms de colonnes à afficher.
 * Afficher les premières lignes du dataframe avec en paramètre le nombre de ligne à afficher et (Optionnel) une liste de noms de colonnes à afficher.
 * Afficher les dernières lignes du dataframe avec en paramètre le nombre de ligne à afficher et (Optionnel) une liste de noms de colonnes à afficher.
 
#### Statistiques par colonne
 * Minimum
 * Maximum
 * Moyenne
 
## Besoins
 * Java 8
 * Maven 4
 
## Utilisation

Pour compiler le JAR (disponible dans le dossier target) depuis les sources:

```mvn clean code```

Pour lancer le code coverage :

```mvn clean jacoco:prepare-agent install jacoco:report```

Le rapport est disponible dans le dossier target/site/jacoco (index.html)
 
