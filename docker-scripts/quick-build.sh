#!/usr/bin/env bash

DOWNLOAD_DIR=/tmp/fieldwebautomation/

mkdir -p $DOWNLOAD_DIR
chmod -R a+rw $DOWNLOAD_DIR
docker-compose up -d
DRIVER=grid-chrome mvn -f ../pom.xml clean test
EXIT_CODE=$?
docker-compose down

exit $EXIT_CODE