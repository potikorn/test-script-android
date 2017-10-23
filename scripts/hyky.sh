#!/bin/sh

# platform -> iOS,android,laravel,vuejs,sketch
platform=sketch

# sorce type -> csv (just csv for now)
src_type=csv

# sorce
src="https://docs.google.com/spreadsheets/d/17rXQ9tZtof1rmxU-mzPS9yqnxCSsRMErf1c7AyzK1E4/export?gid=1423844864&format=csv"

# destination path
# des=$PRODUCT_NAME
des="./"

# config of each platform
config=scripts/config.json

# temporary json file from src
file_temp=scripts/temp

#scripts
./scripts/tools konyak $src_type $src $file_temp
./scripts/tools honyak $platform $file_temp $des $config
rm $file_temp
