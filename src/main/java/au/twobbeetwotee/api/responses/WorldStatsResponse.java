package au.twobbeetwotee.api.responses;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class WorldStatsResponse {
    @Expose private double size;
    @Expose private int players;
    @Expose private long age;
    @Expose private int years;
    @Expose private int months;
    @Expose private int days;
}
