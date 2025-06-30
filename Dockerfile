FROM ubuntu:latest
LABEL authors="khotv"

ENTRYPOINT ["top", "-b"]