package com.xxx.wechat.admin.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.xxx.wechat.admin.service.IAuthorityService;
import com.xxx.wechat.core.dao.entity.AdminRoleAuthorityRel;
import com.xxx.wechat.core.exception.AppException;

@Service("authorityService")
public class AuthorityServiceImpl implements IAuthorityService {

	@Override
	public List<AdminRoleAuthorityRel> searchByRoleId(String roleId) throws AppException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> searchAuthorityCodeByRoleId(String roleId) throws AppException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AdminRoleAuthorityRel> searchAll() throws AppException {
		// TODO Auto-generated method stub
		return null;
	}
}