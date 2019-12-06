#!/usr/bin/env bash
mvn clean package
echo 'copy files...'

scp -i ~/.ssh/id_rsa \
      target/demo-1.0-SNAPSHOT.jar \
      root@188.225.46.84:/home/
echo 'Restart server...'
ssh -T -i ~/.ssh/id_rsa root@188.225.46.84 << EOF

pgrep java | xargs kill -9
nohup java -jar demo-1.0-SNAPSHOT.jar > log.txt &
EOF
echo 'bye'