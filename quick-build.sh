#!/usr/bin/env bash

docker-compose up -d
DRIVER=grid-chrome mvn clean test
EXIT_CODE=$?
docker-compose down

exit $EXIT_CODE