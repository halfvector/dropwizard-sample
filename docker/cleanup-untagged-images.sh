#!/bin/sh

echo "Removing untagged docker images.."
docker images -q -f dangling=true | xargs docker rmi
