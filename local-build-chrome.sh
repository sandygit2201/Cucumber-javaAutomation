#!/usr/bin/env bash
mkdir -p /tmp/fieldwebautomation
docker-compose -f docker-compose-local-chrome.yaml up -d
echo "Waiting for VNC to initialize..." && sleep 10

open vnc://:secret@localhost:5900
DRIVER=grid-chrome mvn clean test
EXIT_CODE=$?
docker-compose -f docker-compose-local-chrome.yaml down

exit $EXIT_CODE