package com.projectfreshvotes.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


@Entity
public class Vote {
	
	
	private VoteId fid;
	private Boolean upvote;
	
	@EmbeddedId
	public VoteId getFid() {
		return fid;
	}

	public void setFid(VoteId fid) {
		this.fid = fid;
	}

	public Boolean getUpvote() {
		return upvote;
	}

	public void setUpvote(Boolean upvote) {
		this.upvote = upvote;
	}
}
