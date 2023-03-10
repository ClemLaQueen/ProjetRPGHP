package com.isep.hpah.core.levels;
import java.util.List;
import com.isep.hpah.core.character.AbstractEnemy;
import lombok.Getter;
import lombok.Setter;

//création d'une classe AbstractLevel pour simplification du programme
@Getter  @Setter
public abstract class AbstractLevel {
    public int id;
    private String name;
    private String place;
    private List<AbstractEnemy> enemies;
    private String description;

    public AbstractLevel(int id,String name, String place, List<AbstractEnemy> enemy, String description) {
        this.id = id;
        this.name = name;
        this.place = place;
        this.enemies = enemy;
        this.description = description;
    }

}