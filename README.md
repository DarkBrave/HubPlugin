# HubPlugin

Simple Hub Plugin for FishCraft

Supports basically any version of PaperMC from at least the past five years.

## Functionality

- Teleports all players to the worldspawn, offset to the center of the block, every time they log in to the server.
- Places all players without the `hubplugin.gamemode` permission in Adventure mode every time they log in to the server.
- Adds `/leave` (alias `/kickself`) command that kicks the player who executes it.
- Disables placing of blocks for all players without the `hubplugin.blockplace` permission.
- Disables breaking of blocks for all players without the `hubplugin.blockbreak` permission.
