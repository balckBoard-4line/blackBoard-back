package dev.line4.blackBoard.blackboard.entity;

import dev.line4.blackBoard.blackboardsticker.entity.BlackBoardStickers;
import java.time.LocalDateTime;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

/*
id long
title varchar
introduction varchar
email varchar
graduate_date localdatetime
url text

*/
@Getter
@Setter
@Entity
public class BlackBoards {
    @Id
    private String id;
    @Column(length = 50)
    private String title;
    @Column(length = 100)
    private String introduction;
    @Column(length = 255)
    private String email;
    @Column(name = "graduate_date")
    private LocalDateTime graduateDate;
    @Column(columnDefinition = "TEXT")
    private String url;
    @OneToMany(mappedBy = "boardId", fetch = FetchType.LAZY)
    private Set<BlackBoardStickers> blackBoardStickers;
}
