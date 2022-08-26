package pl.simpleascoding.tutoringplatform.service.rscp;

import org.springframework.http.ResponseEntity;
import pl.simpleascoding.tutoringplatform.dto.ResponseEntityRscpDTO;
import pl.simpleascoding.tutoringplatform.dto.RscpDTO;

import java.util.Locale;

public interface RscpService {
    <T> ResponseEntity<ResponseEntityRscpDTO<T>> mapRscpDTOToResponseEntity(RscpDTO<T> rscpDTO, Locale locale);
}
