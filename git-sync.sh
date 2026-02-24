#!/bin/bash

# This is a useful script that automatically creates the commit and pushes it to GitHub
git add .

echo "Please insert the commit message (leave empty for Automatic Update):"
read message
if [ -z "$message" ]; then
  message="Automatic update"
fi

git commit -m "$message"

echo "Syncing with servers..."
git pull origin main --rebase

echo "Uploading..."
git push origin main

echo "Done! :D"
