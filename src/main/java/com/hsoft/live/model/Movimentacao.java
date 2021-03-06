package com.hsoft.live.model;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter @Setter @Entity @Builder
public class Movimentacao {
        @AllArgsConstructor
        @NoArgsConstructor
        @EqualsAndHashCode
        @Embeddable
        public  class  MovimentacaoId implements Serializable{
            private long idMovimento;
            private long idUsuario;
        }
        @Id
        @EmbeddedId
        private MovimentacaoId movimentacaoId;
        private LocalDateTime dataEntrada;
        private LocalDateTime dataSaida;
        private BigDecimal periodo;
        @ManyToOne
        private Ocorrencia ocorrencia;
        @ManyToOne
        private Calendario calendario;
}
