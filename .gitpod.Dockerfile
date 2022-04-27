FROM gitpod/workspace-full-vnc

USER gitpod

RUN sudo apt-get update && \
    sudo apt-get install -yq chromium-browser && \
    sudo rm -rf /var/lib/apt/lists/*
    snap install chromium

ENV CHROME_BIN=/usr/bin/chromium-browser
ENV BROWSER="Chrome_Without_Sandbox"