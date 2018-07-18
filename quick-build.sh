#!/usr/bin/env bash

docker-compose up -d
DRIVER=grid-chrome mvn clean test
docker-compose down