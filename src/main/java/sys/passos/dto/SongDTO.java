package sys.passos.dto;

import lombok.Data;

@Data
public class SongDTO {

    private Long id;

    private String name;
    private String gender;
    private String tone;
    private String link;
}
