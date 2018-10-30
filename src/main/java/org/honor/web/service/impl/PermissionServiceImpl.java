package org.honor.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.honor.core.generic.GenericDao;
import org.honor.core.generic.GenericServiceImpl;
import org.honor.web.dao.PermissionMapper;
import org.honor.web.model.Permission;
import org.honor.web.service.PermissionService;
import org.springframework.stereotype.Service;


/**
 * 权限Service实现类
 *
 * @author StarZou
 * @since 2014年6月10日 下午12:05:03
 */
@Service
public class PermissionServiceImpl extends GenericServiceImpl<Permission, Long> implements PermissionService {

    @Resource
    private PermissionMapper permissionMapper;


    @Override
    public GenericDao<Permission, Long> getDao() {
        return permissionMapper;
    }

    @Override
    public List<Permission> selectPermissionsByRoleId(Long roleId) {
        return permissionMapper.selectPermissionsByRoleId(roleId);
    }
}
