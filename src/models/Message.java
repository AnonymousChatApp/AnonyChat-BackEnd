package models;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "messages")
public class Message {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "id")
	 	private long mId;
		
		@Column(name = "message")
	    private String mMessage;
		
		@Column(name = "date")
	    private Date mDate;

	    public Message(long id, String message, Date date) {
	        this.mId = id;
	        this.mMessage = message;
	        this.mDate = date;
	    }

	    public long getId() {
	        return mId;
	    }

	    public void setId(long id) {
	        this.mId = id;
	    }
	    
	    public String getMessage() {
	        return mMessage;
	    }

	    public void setMessage(String message) {
	        this.mMessage = message;
	    }

	    public Date getDate() {
	        return mDate;
	    }

	    public void setDate(Date date) {
	        this.mDate = date;
	    }
}
