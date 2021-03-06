package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_group")
public class UserGroup {
	@Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long mId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User mUser;

    @JoinColumn(name = "group_id")
    private Group mGroup;

}
