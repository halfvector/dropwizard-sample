#!/bin/sh

echo "Removing exited docker containers.."
docker ps -f status=exited -q | xargs docker rm
