package com.pudingyum.magicchess.domain.dto;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JwtToken {
    private String token;
}
