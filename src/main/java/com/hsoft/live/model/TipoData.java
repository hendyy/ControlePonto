package com.hsoft.live.model;

import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter @Setter @Entity @Builder
public class TipoData {
    @Id
    private long id;
    private String descricao;
}
