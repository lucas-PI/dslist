package entites;

import jakarta.persistence.*;

@Entity
@Table(name = "gamer_tb")
public class Gamer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGame;
    private String title;
    @Column(name = "gamer_year")
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgURL;
    @Column(columnDefinition = "TEXT")
    private String shortDescription;
    @Column(columnDefinition = "TEXT")
    private String longDescription;

    public Gamer(Long idGame, String title, Integer year, String genre,
                 String platforms, Double score, String imgURL, String shortDescription, String longDescription) {
        this.idGame = idGame;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.score = score;
        this.imgURL = imgURL;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }
}
