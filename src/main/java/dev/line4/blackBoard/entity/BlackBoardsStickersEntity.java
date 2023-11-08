package dev.line4.blackBoard.entity;

/*
id long
num long
position_x integer
position_y
board_id
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class BlackBoardsStickersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private long num;
    @Column(name = "position_x")
    private double positionX;
    @Column(name = "position_y")
    private double positionY;
    @ManyToOne
    @JoinColumn(name = "board_id")
    private BlackBoardsEntity boardId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public double getPositionX() {
        return positionX;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }

    public BlackBoardsEntity getBoardId() {
        return boardId;
    }

    public void setBoardId(BlackBoardsEntity boardId) {
        this.boardId = boardId;
    }
}