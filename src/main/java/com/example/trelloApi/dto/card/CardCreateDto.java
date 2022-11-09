package com.example.trelloApi.dto.card;

import com.example.trelloApi.domains.Comment;
import com.example.trelloApi.domains.auth.AuthUser;
import com.example.trelloApi.domains.board.BoardColumn;
import com.example.trelloApi.dto.base.BaseGenericDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardCreateDto implements BaseGenericDto {
    private String name;
    private Long boardColumnId;
}
