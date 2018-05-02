package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long mId;
	
	@Column(name = "nickname")
    private String mNickname;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "group_id")
	private Group mGroup;
	
	
	public User() {}

    public User(String nickname) {
        this.mNickname = nickname;
    }

    public long getId() {
        return mId;
    }

    public String getNickname() {
        return mNickname;
    }

    public void setNickname(String nickname) {
        this.mNickname = nickname;
    }

	public void setGroup(Group group) {
		mGroup = group;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mGroup == null) ? 0 : mGroup.hashCode());
		result = prime * result + (int) (mId ^ (mId >>> 32));
		result = prime * result + ((mNickname == null) ? 0 : mNickname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (mGroup == null) {
			if (other.mGroup != null)
				return false;
		} else if (!mGroup.equals(other.mGroup))
			return false;
		if (mId != other.mId)
			return false;
		if (mNickname == null) {
			if (other.mNickname != null)
				return false;
		} else if (!mNickname.equals(other.mNickname))
			return false;
		return true;
	}
	
	
}
