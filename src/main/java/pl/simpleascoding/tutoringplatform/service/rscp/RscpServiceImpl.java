package pl.simpleascoding.tutoringplatform.service.rscp;

import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.simpleascoding.tutoringplatform.dto.ResponseEntityRscpDTO;
import pl.simpleascoding.tutoringplatform.dto.RscpDTO;

import java.util.Locale;

@Service
@RequiredArgsConstructor
public class RscpServiceImpl implements RscpService {
    private final MessageSource messageSource;

    @Override
    public <T> ResponseEntity<ResponseEntityRscpDTO<T>> mapRscpDTOToResponseEntity(RscpDTO<T> rscpDTO, Locale locale) {
        return new ResponseEntity<>(new ResponseEntityRscpDTO<>(
                rscpDTO.status(),
                rscpDTO.code(),
                StringUtils.isNotEmpty(rscpDTO.code()) ? messageSource.getMessage(rscpDTO.code(), new Object[0], locale) : null,
                rscpDTO.body()
        ), HttpStatus.OK);
    }
}
