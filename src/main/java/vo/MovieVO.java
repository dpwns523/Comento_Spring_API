package vo;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class MovieVO {

    @NonNull
    private Integer id;
    @NonNull
    private String name;
    @NonNull
    private String director;
    @NonNull
    private String type;
}
