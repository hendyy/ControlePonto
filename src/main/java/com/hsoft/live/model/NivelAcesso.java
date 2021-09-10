package com.hsoft.live.model;

import lombok.*;
import org.hibernate.envers.Audited;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Audited
@Getter @Setter @Entity @Builder
public class NivelAcesso {
    @Id
    private long id;
    private String descricao;
}
