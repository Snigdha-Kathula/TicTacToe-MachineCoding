package org.example.strategies.BotPlayingStrategy;

import org.example.models.Board;
import org.example.models.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board);
}
