#!/usr/bin/env bash
#/bin/bash
export REPO_ID=cangling
export REPO_URL=https://nexus.cangling.io/repository/maven-releases/

mvn -pl gwt-ol3-client -DskipTests=true clean  package install deploy -DREPO_URL=$REPO_URL -DREPO_ID=$REPO_ID -Pcangling