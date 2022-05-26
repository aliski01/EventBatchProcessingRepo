#!/bin/sh

set -xe
export NG_CLI_ANALYTICS=ci

cd $APP
mvn clean install

cd ../

ls -ltr

cp -R $APP ./compiled-$APP-app