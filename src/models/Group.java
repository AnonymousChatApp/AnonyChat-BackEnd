package models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "groups")
public class Group {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long mGroupId;
	
	@Column(name = "name")
	private String mGroupName;
	
	@ManyToOne
	private ArrayList<User> mGroupUsers;
	
	public Group() {}
	
	public Group(long groupId, String groupName) {
		this.mGroupId = groupId;
		this.mGroupName = groupName;
	}
	public long getGroupId() {
		return mGroupId;
	}
	public void setGroupId(long groupId) {
		this.mGroupId = groupId;
	}
	public String getGroupName() {
		return mGroupName;
	}
	public void setGroupName(String mGroupName) {
		this.mGroupName = mGroupName;
	}
	
	public ArrayList<User> getGroupUsers() {
		return mGroupUsers;
	}
	
	public void addUser(User user) {
		mGroupUsers.add(user);
		user.setGroup(this);
	}
	
	public void removeUser(User user) {
		mGroupUsers.remove(user);
		user.setGroup(null);
	}
	
}
