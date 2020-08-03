package nl.jochemxyz.demo.domain;

import lombok.Data;

import java.util.List;

@Data
public class Launches {
    private List<Launch> launches;

    private int total;
    private int offset;
    private int count;

    @Data
    public static class Launch {
        private String id;
        private String name;
        private int tbdTime;
        private int tbdDate;
    }
}
