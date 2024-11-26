#!/bin/bash

message="$1"
if [ -z "$message" ]; then
  echo "Usage $0 <message> "
  exit
fi

git add .
git commit -m "$message"
git push -u origin $(git branch --show-current)