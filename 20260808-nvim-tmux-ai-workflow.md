# OS

## Arch Linux - arch btw - customize OS from ground up

## Fedora Atomic Sway - immutable OS

- updates are entire OS image
- always have a working OS

# Window Manager

## Hyperland is great, but risky b/c maintained by 1 guy

## COSMIC DE

- Developed by System76
- professionally developed
- good opensource community

## Sway

- picked it; loved it; never going back
- Fedora Atomic Sway distro - immutable OS image - installation is rebase
- switch with no animations
- customize workspaces & layouts

## Tmux

- window management for terminal
- suggestion: use default keybindings - works the same on every system made for multiple users
- just spend a couple weeks working with defaults, they'll be memorized, you don't have to think about it again

# Shell

## Use bash

- learn it well
- bash is the default everywhere, so you should be familiar

# Email, browsing, querying

- aerc - email client

## CLI browser client

- lynx, w3m
- Shortcut: '? <query>' to start search wtih w3m <- custom command

# AI Integration

- basic custom bash commands - '?? <query>' <- pipe queries to claude, output answers directly
- add a layer: custom neovim command -> pipe current line to '??' query, replace line with output

# Devcontainers

- devpod is an alternate tool that supports multiple backends and some customizations atop devcontainers
- configure project that runs/operates in its own container, all dependencies included
- get development project up and running within minutes
- delete directory/containers when done, straightforward setup and teardown
