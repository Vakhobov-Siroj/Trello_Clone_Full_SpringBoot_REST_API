package com.example.trelloApi.dto.boardColumn;

import com.example.trelloApi.domains.board.Board;
import com.example.trelloApi.domains.board.Card;
import com.example.trelloApi.dto.card.CardDto;
import lombok.*;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class BoardColumnDto {
    private Long id;
    private String name;
    private Integer order;
    private Long boardId;
    private List<CardDto> cardSet;
}
