package pl.simpleascoding.tutoringplatform.dto;

import org.hibernate.annotations.Immutable;
import org.springframework.lang.Nullable;
import pl.simpleascoding.tutoringplatform.rscp.RscpStatus;

@Immutable
public record ResponseEntityRscpDTO<T>(RscpStatus status, String code, @Nullable String message, @Nullable T body) {
}
