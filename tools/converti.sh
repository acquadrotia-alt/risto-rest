#!/bin/sh
# Rigenera i sorgenti B4A in ../progetto a partire dal Java decompilato in ../java
# Compilare la colonna "nuovo_nome" di nomi.csv e rilanciare per applicare i nomi definitivi.
cd "$(dirname "$0")"
rm -f ../progetto/*.bas ../progetto/RistorAndro.b4a
python3 j2b4a.py ../java ../progetto --pkg cassandraRisto.ital --pkg ital.TotemLib --casing casing.json --nomi ../nomi.csv
python3 lint_b4a.py ../progetto
