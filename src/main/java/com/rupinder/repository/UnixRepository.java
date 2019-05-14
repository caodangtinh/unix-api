package com.rupinder.repository;

import java.util.List;

import com.rupinder.dto.Group;
import com.rupinder.dto.PwdUser;

public interface UnixRepository {
	List<PwdUser> getListPwdUser();

	List<PwdUser> getListPwdUser(String file);

	List<Group> getListGroup();

	List<Group> getListGroup(String file);
}
