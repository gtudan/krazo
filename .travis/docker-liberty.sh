#!/usr/bin/env sh

set -eu

docker run -p 9080:9080 -p 9443:9443 \
  -v /${TRAVIS_BUILD_DIR}/.travis/wlp-server-template.xml:/config/server.xml \
  open-liberty:webProfile8
